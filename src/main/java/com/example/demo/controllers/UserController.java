package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.LoginRequest;
import com.example.demo.Entities.User;
import com.example.demo.services.UserService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class UserController {

	 @Autowired
	    private UserService userService;

	    @PostMapping("/logincheck")
	    public User login(@RequestBody LoginRequest loginRequest) {
	        return userService.login(loginRequest.getEmail(), loginRequest.getPassword());
	    }
}
