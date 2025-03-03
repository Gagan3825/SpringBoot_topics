package com.example.demo.services.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.model.emailDetails.EmailModel;

@Service
public class EmailServiceIml {
    
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}") private String sender;

    public String sendMail(EmailModel details){
        try {
            SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
            simpleMailMessage.setFrom(sender);
            simpleMailMessage.setTo(details.getReceiptent());
            simpleMailMessage.setSubject(details.getSubject());
            simpleMailMessage.setText(details.getMessageBody());

            javaMailSender.send(simpleMailMessage);
            return "Email sent success";
        } catch (Exception e) {
            return "error";
        }
    }
}
