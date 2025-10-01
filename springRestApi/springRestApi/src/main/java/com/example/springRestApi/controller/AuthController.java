package com.example.springRestApi.controller;

import com.example.springRestApi.request.LoginRequest;
import com.example.springRestApi.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AuthController {
    @Autowired
    LibraryService libraryService;
    @PostMapping("/login")
    public Optional<String> login(@RequestBody LoginRequest loginRequest){
        return libraryService.login(loginRequest);
    }
}
