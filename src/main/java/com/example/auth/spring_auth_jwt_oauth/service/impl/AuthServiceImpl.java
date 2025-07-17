package com.example.auth.spring_auth_jwt_oauth.service.impl;

import org.springframework.stereotype.Service;

import com.example.auth.spring_auth_jwt_oauth.data.entity.Role;
import com.example.auth.spring_auth_jwt_oauth.data.entity.UserEntity;
import com.example.auth.spring_auth_jwt_oauth.data.repository.UserRepository;
import com.example.auth.spring_auth_jwt_oauth.security.dto.AuthResponseDto;
import com.example.auth.spring_auth_jwt_oauth.security.dto.LoginRequestDto;
import com.example.auth.spring_auth_jwt_oauth.security.dto.RegisterDto;
import com.example.auth.spring_auth_jwt_oauth.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    
    @Override
    public AuthResponseDto login(LoginRequestDto request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public AuthResponseDto register(RegisterDto request) {
	UserEntity user = UserEntity.builder().username(request.getUsername()).password(request.getPassword())
		.role(Role.USER).build();
	
	userRepository.save(user);
	
	return AuthResponseDto.builder().token(jwtService.getToken(user)).build();
    }

}
