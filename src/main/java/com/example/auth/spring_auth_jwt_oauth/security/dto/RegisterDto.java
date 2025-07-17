package com.example.auth.spring_auth_jwt_oauth.security.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterDto {

    private String username;
    private String password;
    private String name;
}
