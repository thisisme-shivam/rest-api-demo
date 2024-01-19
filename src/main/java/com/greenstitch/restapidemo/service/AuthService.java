package com.greenstitch.restapidemo.service;

import com.greenstitch.restapidemo.beans.SignUpRequest;
import com.greenstitch.restapidemo.entity.User;
import org.springframework.stereotype.Service;

public interface AuthService {
    User createUser(SignUpRequest signUpRequest);
}
