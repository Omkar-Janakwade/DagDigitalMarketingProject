package com.demo.admin.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.admin.entity.Carrer;
import com.demo.admin.entity.Inquiry;
import com.demo.admin.repo.Carrer_repo;
import com.demo.admin.repo.InquiryRepo;

@Service
public class InquiryService {
	
		@Autowired
		private InquiryRepo repo;
		
		public Inquiry addInquiry(Inquiry inquiry) {
			return repo.save(inquiry);
		}
		
		public List<Inquiry> getAllInquiry() {
			return repo.findAll();
		}
		
		

}
