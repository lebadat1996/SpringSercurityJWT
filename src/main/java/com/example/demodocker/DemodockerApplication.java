package com.example.demodocker;

import com.example.demodocker.user.User;
import com.example.demodocker.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class DemodockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemodockerApplication.class, args);
    }

}
