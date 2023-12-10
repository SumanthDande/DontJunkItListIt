package com.example.DontJunkItListIt.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DontJunkItListIt.dto.Credentials;
import com.example.DontJunkItListIt.entity.User;
import com.example.DontJunkItListIt.service.UserService;

import jakarta.security.enterprise.AuthenticationException;

@CrossOrigin(origins = "http://localhost:4200" /*, allowCredentials = "true", allowedHeaders = "*" */)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // End point for user registration
    @PostMapping("/signup")
    @CrossOrigin(origins = "http://localhost:4200" , allowCredentials = "true", allowedHeaders = "*")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    // End point for user authentication
    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:4200" , allowCredentials = "true", allowedHeaders = "*")
    public ResponseEntity<String> authenticateUser(@RequestBody Credentials credentials) throws AuthenticationException {
    	String username = credentials.getUsername();
        String password = credentials.getPassword();
    	User authenticatedUser = userService.authenticateUser(username, password);

    	try {
    		if (authenticatedUser != null) {
                return ResponseEntity.ok("User authenticated successfully");
            } else {
                return ResponseEntity.badRequest().body("Authentication failed");
            }
    	}catch (Exception e) {
            // Log the exception
            //e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
        }
    	
    }
}

