package com.demo.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.admin.entity.Carrer;

@Repository
public interface Carrer_repo extends JpaRepository<Carrer, Integer>{

   

}
