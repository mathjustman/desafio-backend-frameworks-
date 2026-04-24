package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(String name, String email) {
        return new User(name, email);
    }
}