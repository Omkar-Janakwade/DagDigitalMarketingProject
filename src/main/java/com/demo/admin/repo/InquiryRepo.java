package com.demo.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.admin.entity.Inquiry;

@Repository
public interface InquiryRepo extends JpaRepository<Inquiry, Integer> {

}
