package com.example.DontJunkItListIt.service;

import com.example.DontJunkItListIt.entity.User;

import jakarta.security.enterprise.AuthenticationException;

public interface UserService {
    void registerUser(User user);
    public User authenticateUser(String email, String password) throws AuthenticationException; 
    User getUserByEmail(String email);
    void updateUser(User user);
    
}
