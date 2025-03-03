package com.example.demo.controller.EmailController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.emailDetails.EmailModel;
import com.example.demo.services.EmailService.EmailServiceIml;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController

public class Emailcontroller {
    @Autowired
    private EmailServiceIml emailServiceIml;

    @PostMapping("/emailSent")
    public String postMethodName(@RequestBody EmailModel emailModel) {
     
        String res=emailServiceIml.sendMail(emailModel);
        return res;
    }
    
    
}
