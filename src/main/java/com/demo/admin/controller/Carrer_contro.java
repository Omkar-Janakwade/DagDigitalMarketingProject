package com.demo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.admin.entity.Carrer;
import com.demo.admin.services.Carrer_server;


@RestController
@CrossOrigin("*")

public class Carrer_contro {
	
	@Autowired
	Carrer_server server;
	


	@PostMapping("addCarrer")
	public Carrer addCarrer(@RequestBody Carrer carrer) {
		return server.addCarrer(carrer);
	}
	
	@GetMapping("getallcarrer")
	public List<Carrer> getallCarrers(){
		return server.getallcarrer();
	}
	
	@DeleteMapping("deletecarrer/{id}")
	public void deleteCarrer(@PathVariable Integer id) {
		 server.deletcarrer(id);
	}
	
	@GetMapping("getCarrerbyid/{id}")
	public Carrer getCarrerid(@PathVariable Integer id) {
		return server.getbyId(id);
	}
	@GetMapping("/getcarrercount")
	public long getcount() {
		return server.getcount();
	}
	
}
