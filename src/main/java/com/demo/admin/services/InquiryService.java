package com.demo.admin.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.admin.entity.Inquiry;
import com.demo.admin.repo.InquiryRepo;

@Service
public class InquiryService {
    
    @Autowired
    private InquiryRepo repo;

    @Autowired
    private EmailService emailService;

    public Inquiry addInquiry(Inquiry inquiry) {
        Inquiry savedInquiry = repo.save(inquiry);

        // Send confirmation email to the user
        String userSubject = "Thank You for Your Inquiry!";
        String userMessage = "<h2>Dear " + inquiry.getFullName() + ",</h2>"
                + "<p>Thank you for contacting us. We will get back to you soon.</p>"
                + "<p><b>Your Message:</b> " + inquiry.getMessage() + "</p>"
                + "<p>Best Regards, <br> Your Company Name</p>";
        emailService.sendEmail(inquiry.getEmail(), userSubject, userMessage);

        // Send notification email to the company
        String companySubject = "New Inquiry Received";
        String companyMessage = "<h2>New Inquiry Details:</h2>"
                + "<p><b>Name:</b> " + inquiry.getFullName() + "</p>"
                + "<p><b>Email:</b> " + inquiry.getEmail() + "</p>"
                + "<p><b>Mobile:</b> " + inquiry.getMobile() + "</p>"
                + "<p><b>Message:</b> " + inquiry.getMessage() + "</p>";
        emailService.sendEmail("dag.omkarjanakwade@gmail.com", companySubject, companyMessage);

        return savedInquiry;
    }

    public List<Inquiry> getAllInquiry() {
        return repo.findAll();
    }
}
