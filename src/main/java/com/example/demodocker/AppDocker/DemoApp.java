package com.example.demodocker.AppDocker;

import com.example.demodocker.service.EmailService;
import com.example.demodocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;


@RestController
@RequestMapping("demo")
public class DemoApp {
    @Autowired
    EmailService emailService;
    @Autowired
    UserService userService;

    @GetMapping
    public String hello() {
        return "Hello-Docker-Spring-Boot";
    }

    @PostMapping("/email")
    public ResponseEntity<?> sendMail() throws MessagingException {
        emailService.sendEmail();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
