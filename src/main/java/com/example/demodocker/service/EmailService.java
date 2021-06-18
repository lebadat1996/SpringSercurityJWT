package com.example.demodocker.service;

import com.example.demodocker.Entity.UserModel;

import javax.mail.MessagingException;

public interface EmailService {
    void sendEmail() throws MessagingException;
}
