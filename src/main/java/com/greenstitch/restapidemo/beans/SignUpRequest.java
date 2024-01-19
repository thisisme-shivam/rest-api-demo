package com.greenstitch.restapidemo.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Getter
@Setter
public class SignUpRequest {
    private String username;
    private String password;
    private String email;
    private String phone;
}
