package com.demo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.admin.entity.Inquiry;
import com.demo.admin.services.InquiryService;
import com.demo.admin.services.ServicesServ;

@RestController
@CrossOrigin("*")
public class InquiryController {
	@Autowired
	InquiryService service;

	@PostMapping("/addInquiry")
	public Inquiry addInquiry(@RequestBody Inquiry inquiry) {
		return service.addInquiry(inquiry);
	}
	@GetMapping("/getAllInquiry")
	public List<Inquiry> getAllInquiry() {
		return service.getAllInquiry();
	}
}
