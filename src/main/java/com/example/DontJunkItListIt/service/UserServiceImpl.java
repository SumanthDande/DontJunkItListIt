package com.example.DontJunkItListIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DontJunkItListIt.dao.UserDAO;
import com.example.DontJunkItListIt.entity.User;
import org.springframework.security.crypto.bcrypt.BCrypt;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void registerUser(User user) {
        // Add registration logic here, e.g., validating user data, hashing passwords, and saving the user
        userDAO.save(user);
    }

    @Override
    public User authenticateUser(String email, String password) {
        // Implement authentication logic, e.g., checking credentials against the database
        User user = userDAO.findByEmail(email);
        if (user != null && isPasswordValid(password, user.getPassword())) {
            return user;
        }
        return null;
    }

    private boolean isPasswordValid(String rawPassword, String hashedPassword) {
        // Implement password validation logic, e.g., comparing the provided password with the stored hashed password
        // You can use libraries like BCrypt to securely hash and validate passwords
        return BCrypt.checkpw(rawPassword, hashedPassword);
    }

}
