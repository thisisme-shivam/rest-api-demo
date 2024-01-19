package com.greenstitch.restapidemo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "app_user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String phone;

}
