package com.example.demodocker.service.impl;

import com.example.demodocker.Entity.UserModel;
import com.example.demodocker.service.EmailService;
import com.example.demodocker.service.UserService;
import com.example.demodocker.user.UserEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    UserService userService;

    @Override
    public void sendEmail() throws MessagingException {
        UserModel model = getEmailFromUser();
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(msg, true, "utf8");
        mimeMessageHelper.setTo(model.getEmail());
        mimeMessageHelper.setSubject(model.getSubject());
        mimeMessageHelper.setText(model.getContent());
        javaMailSender.send(msg);
    }

    private UserModel getEmailFromUser() {
        List<UserEmail> users = userService.finAllUser();
        List<String> emails = new ArrayList<>();
        for (UserEmail u : users) {
            emails.add(u.getEmail());
        }
        UserModel userModel = new UserModel();
        userModel.setContent("Test gui email");
        userModel.setSubject("Email Notify");
        String[] arr = new String[emails.size()];
        userModel.setEmail(emails.toArray(arr));
        return userModel;
    }
}
