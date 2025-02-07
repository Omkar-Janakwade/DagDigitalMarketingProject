package com.demo.admin.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.demo.admin.entity.Services;
import com.demo.admin.repo.ServicesRepo;

@Service
public class ServicesServ {

	@Autowired
	ServicesRepo repo;
	
	public void addservices(String tittle, String discription, MultipartFile file) {
	try {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename()); 
		Services services=new Services();
		services.setTittle(tittle);
		services.setDiscription(discription);
		services.setImg(file.getBytes());
		repo.save(services);
	} catch (IOException e) {
  e.printStackTrace();
  throw new RuntimeException("Failed to process file: " + e.getMessage());
  } catch (Exception e) {
      // Log the exception
      e.printStackTrace();
      throw new RuntimeException("Failed to add product details: " + e.getMessage());
  }
}
	
	public List<Services> getAllServices(){
	return repo.findAll();
}
	
	public void deletServices(Integer id) {
		repo.deleteById(id);
	}

	public Services getservicesid(Integer id) {
		return repo.findById(id).get();
	}
	
	public void updateservice(Integer id,String tittle, String discription, MultipartFile file) throws IOException{
		Optional<Services> serv =repo.findById(id);
		if (serv.isPresent()) {
			Services product = serv.get();
			
			product.setTittle(tittle);
			product.setDiscription(discription);
			product.setImg(file.getBytes());
			
			repo.save(product);
		}else {
	        throw new RuntimeException("Services not found with id: " + id);
	    }
	}
	
	public void updateservicesWithOutFile(Integer id,String tittle, String discription) throws IOException{
		Optional<Services> serv =repo.findById(id);
		if (serv.isPresent()) {
			Services product = serv.get();
			
			product.setTittle(tittle);
			product.setDiscription(discription);
			
			repo.save(product);
		}else {
	        throw new RuntimeException("product not found with id: " + id);
	    }
	}

	
}
