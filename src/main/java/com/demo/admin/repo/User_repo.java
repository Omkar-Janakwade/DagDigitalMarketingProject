package com.demo.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.admin.entity.User;

@Repository
public interface User_repo extends JpaRepository<User, Integer>{
	
	User findByemail(String email);

}
