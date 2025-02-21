package com.demo.admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.admin.entity.Carrer;
import com.demo.admin.repo.Carrer_repo;


@Service
public class Carrer_server {

	@Autowired
	private Carrer_repo repo;
	
	public Carrer addCarrer(Carrer carrer) {
		return repo.save(carrer);
	}
	
	public List<Carrer> getallcarrer(){
		return repo.findAll();
	}
	
	public void deletcarrer(Integer id) {
		 repo.deleteById(id);
	}
	
	public Carrer getbyId(Integer id){
	return	repo.findById(id).get();
	}
	
	public Long getcount() {
		return repo.count();
	}

	public Carrer updateCarrer(Integer id, Carrer updatedCarrer) {
        if (repo.existsById(id)) {
            updatedCarrer.setId(id);  // Make sure the ID stays the same
            return repo.save(updatedCarrer);
        } else {
            return null;
        }
    }

}
