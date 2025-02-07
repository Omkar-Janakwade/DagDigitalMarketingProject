package com.demo.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.admin.entity.Services;

@Repository
public interface ServicesRepo extends JpaRepository<Services, Integer>{

}
