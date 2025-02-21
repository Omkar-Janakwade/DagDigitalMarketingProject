package com.demo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.admin.entity.User;
import com.demo.admin.repo.User_repo;

@RestController
@CrossOrigin("*")
public class User_controller {

	
	@Autowired
	private User_repo repo;
	

	@PostMapping("/userlogin")
	public ResponseEntity<?> loginUser(@RequestBody User logindata){
		User login= repo.findByemail(logindata.getEmail());
		if(login.getPassword().equals(logindata.getPassword()))
				return ResponseEntity.ok(login);
		
		return(ResponseEntity<?>) ResponseEntity.internalServerError();
	}

	@GetMapping()
	protected ResponseEntity<?> getAllUsers(){
		List<User> users=repo.findAll();
		if(users.size()>0){
			return ResponseEntity.ok(users);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Users not present");
	}
	
	
}
