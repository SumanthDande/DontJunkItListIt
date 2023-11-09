package com.example.DontJunkItListIt.service;

import com.example.DontJunkItListIt.entity.User;

public interface UserService {
    void registerUser(User user);
    User authenticateUser(String email, String password);
    // Add additional methods for email verification, password resets, etc.
}
