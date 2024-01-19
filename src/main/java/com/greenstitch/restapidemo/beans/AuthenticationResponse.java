package com.greenstitch.restapidemo.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationResponse {
    String jwtToken;
}
