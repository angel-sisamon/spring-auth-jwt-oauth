package com.example.auth.spring_auth_jwt_oauth.security.dto;

import lombok.Data;

@Data
public class LoginRequestDto {

    private String username;
    private String password;
}
