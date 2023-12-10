package com.example.DontJunkItListIt.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DontJunkItListIt.dao.UserDAO;
import com.example.DontJunkItListIt.entity.User;
import com.example.DontJunkItListIt.exceptions.InvalidPasswordException;
import com.example.DontJunkItListIt.exceptions.UserNotFoundException;
import com.example.DontJunkItListIt.utility.DJILIConstants;

import jakarta.security.enterprise.AuthenticationException;

//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.mindrot.jbcrypt.BCrypt;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void registerUser(User user) {
       // logic to set user data, hashing passwords, and saving the user
       user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
       user.setRegistrationDate(new Date());
       user.setSubscriptionExpiry(null);
       user.setSubscriptionID(null);
       user.setStatus(DJILIConstants.ACTIVE_STATUS);
       user.setRole(DJILIConstants.USER_ROLE);
       user.setUserRating(DJILIConstants.FIVE_RATING);
       userDAO.save(user);
    }

    @Override
    public User authenticateUser(String email, String password) throws AuthenticationException {
        try {
            User user = userDAO.findByEmail(email);
            System.out.println(user.getPassword());

            if (user == null) {
                throw new UserNotFoundException("User with email " + email + " not found");
            }

            if (!isPasswordValid(password, user.getPassword())) {
                
                throw new InvalidPasswordException("Invalid password");
            }

           
            return user;
        } catch (Exception e) {
            // Log the exception for debugging purposes
            //log.error("Error during authentication: " + e.getMessage());
        	//e.printStackTrace();
            throw new AuthenticationException("Authentication failed");
        }
    }


    private boolean isPasswordValid(String rawPassword, String hashedPassword) {
       
        return BCrypt.checkpw(rawPassword, hashedPassword);
    }

}
