package com.example.DontJunkItListIt.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DontJunkItListIt.dto.Credentials;
import com.example.DontJunkItListIt.entity.User;
import com.example.DontJunkItListIt.service.UserService;

import jakarta.security.enterprise.AuthenticationException;
import jakarta.validation.Valid;

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
        //System.out.println("Controller printing password: "+user.getPassword());
        return ResponseEntity.ok("User registered successfully");
    }

    // End point for user authentication
    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:4200", /*, allowCredentials = "true",*/ allowedHeaders = "*")
    public ResponseEntity<Object> authenticateUser(@RequestBody Credentials credentials) throws AuthenticationException {
    	String email = credentials.getEmail();
    	System.out.println("Controller email: "+email);
        String password = credentials.getPassword();
    	System.out.println("Printing controller: "+password);
    	User authenticatedUser = userService.authenticateUser(email, password);
    	System.out.println(authenticatedUser);

    	try {
            if (authenticatedUser != null) {
                Map<String, Object> responseMap = new HashMap<>();
                responseMap.put("message", "User authenticated successfully");
                return ResponseEntity.ok().body(responseMap);
            } else {
                Map<String, Object> responseMap = new HashMap<>();
                responseMap.put("message", "Authentication failed");
                return ResponseEntity.badRequest().body(responseMap);
            }
        } catch (Exception e) {
            Map<String, Object> responseMap = new HashMap<>();
            responseMap.put("message", "Internal Server Error");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseMap);
        }
    	
    }
    
    @GetMapping("/user/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
        User user = userService.getUserByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/userID/{email}")
    public ResponseEntity<Long> getUserIDByEmail(@PathVariable String email) {
        User user = userService.getUserByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user.getUserID());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/update/{email}")
    public ResponseEntity<User> updateUserDetails(
            @PathVariable String email,
            @Valid @RequestBody User updatedUserData
    ) {
        User existingUser = userService.getUserByEmail(email);

        if (existingUser != null) {
            // Validate and update fields
            if (updatedUserData.getPhoneNumber() != null) {
                existingUser.setPhoneNumber(updatedUserData.getPhoneNumber());
            }
            if (updatedUserData.getAddress() != null) {
                existingUser.setAddress(updatedUserData.getAddress());
            }
            if (updatedUserData.getPassword() != null) {
                existingUser.setPassword(updatedUserData.getPassword());
            }

            // Update user
            userService.updateUser(existingUser);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

