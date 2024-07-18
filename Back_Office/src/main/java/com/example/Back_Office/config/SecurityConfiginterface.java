package com.example.Back_Office.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface SecurityConfiginterface {
    void configure(HttpSecurity http) throws Exception;
}
