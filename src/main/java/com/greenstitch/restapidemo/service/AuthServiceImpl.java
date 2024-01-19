package com.greenstitch.restapidemo.service;

import com.greenstitch.restapidemo.beans.SignUpRequest;
import com.greenstitch.restapidemo.entity.User;
import com.greenstitch.restapidemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(SignUpRequest signUpRequest) {
        User user = new User();
        user.setUsername(signUpRequest.getUsername());
        user.setEmail(signUpRequest.getEmail());
        user.setPhone(signUpRequest.getPhone());
        user.setPassword(new BCryptPasswordEncoder().encode(signUpRequest.getPassword()));

        user = userRepository.save(user);
        return user;
    }
}
