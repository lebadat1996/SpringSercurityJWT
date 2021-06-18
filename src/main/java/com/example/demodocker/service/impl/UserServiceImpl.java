package com.example.demodocker.service.impl;

import com.example.demodocker.repository.UserRepository;
import com.example.demodocker.service.UserService;
import com.example.demodocker.user.UserEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository repository;

    @Override
    public List<UserEmail> finAllUser() {
        return repository.findAll();
    }
}
