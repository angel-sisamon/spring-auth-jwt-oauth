package com.example.auth.spring_auth_jwt_oauth.service;

import com.example.auth.spring_auth_jwt_oauth.security.dto.AuthResponseDto;
import com.example.auth.spring_auth_jwt_oauth.security.dto.LoginRequestDto;
import com.example.auth.spring_auth_jwt_oauth.security.dto.RegisterDto;

public interface AuthService {

    AuthResponseDto login(LoginRequestDto request);

    AuthResponseDto register(RegisterDto request);

}
