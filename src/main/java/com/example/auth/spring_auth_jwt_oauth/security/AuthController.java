package com.example.auth.spring_auth_jwt_oauth.security;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.spring_auth_jwt_oauth.security.dto.AuthResponseDto;
import com.example.auth.spring_auth_jwt_oauth.security.dto.LoginRequestDto;
import com.example.auth.spring_auth_jwt_oauth.security.dto.RegisterDto;
import com.example.auth.spring_auth_jwt_oauth.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginRequestDto request) {
	return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponseDto> register(@RequestBody RegisterDto request) {
	return ResponseEntity.ok(authService.register(request));
    }

}
