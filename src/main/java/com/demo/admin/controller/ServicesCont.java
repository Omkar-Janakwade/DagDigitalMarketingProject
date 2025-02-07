package com.demo.admin.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.admin.entity.Services;
import com.demo.admin.services.ServicesServ;

@RestController
@CrossOrigin("*")

public class ServicesCont {

	@Autowired
	ServicesServ service;

	@GetMapping("check")
	public String check() {
		return "working";
	}

	@PostMapping("/addservices")
	@ResponseBody
	public ResponseEntity<String> addServices(@RequestParam("tittle") String tittle,
			@RequestParam("discription") String discription, @RequestParam("file") MultipartFile file) {
		try {
			service.addservices(tittle, discription, file);
			return ResponseEntity.status(HttpStatus.OK).header("Content-Type", "text/plain") // Set Content-Type header
					.body("Successfully added services details with image");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).header("Content-Type", "text/plain")
					.body("Failed to add Services details: " + e.getMessage());
		}
	}

	@PutMapping("/updateService/{id}")
	@ResponseBody
	public ResponseEntity<String> updateservice(@PathVariable("id") Integer id, @RequestParam("tittle") String tittle,
			@RequestParam("discription") String discription,
			@RequestParam(value = "file", required = false) MultipartFile file) throws IOException {

		try {
			if (file == null) {	
				service.updateservicesWithOutFile(id, tittle, discription);
			} else {
				service.updateservice(id, tittle, discription, file);
			}
			return ResponseEntity.status(HttpStatus.OK).header("Content-Type", "text/plain") // Set Content-Type header
					.body("Successfully Update services details with image");

		} catch (RuntimeException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).header("Content-Type", "text/plain")
					.body("Failed to Update Services details: " + e.getMessage());
		}
	}

	@GetMapping("/getAllServices")
	public List<Services> getAllServices() {
		return service.getAllServices();
	}

	@GetMapping("/getServicesId/{id}")
	public Services getServicesid(@PathVariable Integer id) {
		return service.getservicesid(id);
	}

	@DeleteMapping("/deleteServices/{id}")
	public void deleteServices(@PathVariable Integer id) {
		service.deletServices(id);
	}

}
