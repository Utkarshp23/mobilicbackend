package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.User;
import com.example.demo.Repositories.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository userRepository;

	    public User login(String email, String password) {
	        User user = userRepository.findByEmail(email);
	        if (user == null || !user.getPassword().equals(password)) {
	            throw new IllegalArgumentException("Invalid email or password");
	        }
	        return user;
	    }
}
