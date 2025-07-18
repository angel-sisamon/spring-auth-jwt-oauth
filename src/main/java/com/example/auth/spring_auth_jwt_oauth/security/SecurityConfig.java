package com.example.auth.spring_auth_jwt_oauth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	return http.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests(
			authRequest -> authRequest.requestMatchers("/auth/**").permitAll().anyRequest().authenticated())
		.formLogin(Customizer.withDefaults()).build();
    }
}
