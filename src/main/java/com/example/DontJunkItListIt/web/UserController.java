package com.example.DontJunkItListIt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DontJunkItListIt.entity.User;
import com.example.DontJunkItListIt.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // End point for user registration
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    // End point for user authentication
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateUser(@RequestParam String username, @RequestParam String password) {
//        if (userService.authenticateUser(username, password)) {
//            return ResponseEntity.ok("User authenticated successfully");
//        } else {
//            return ResponseEntity.badRequest().body("Authentication failed");
//        }
    	return ResponseEntity.ok(null);
    }
}

