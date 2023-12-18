package com.example.DontJunkItListIt.service;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
    	System.out.println("Printing password before saving: " +user.getPassword());
       user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
       System.out.println("Printing encrypted password: " + BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
    	//user.setPassword();
    	//user.setPassword(user.getPassword());
       user.setRegistrationDate(new Date());
       user.setSubscriptionExpiry(null);
       user.setSubscriptionID(null);
       user.setStatus(DJILIConstants.ACTIVE_STATUS);
       user.setRole(DJILIConstants.USER_ROLE);
       user.setUserRating(DJILIConstants.FIVE_RATING);
       userDAO.save(user);
    }

    @Override
    public User authenticateUser(String email, String password) {
            System.out.println("Printing service implementation: "+email);
            User user = userDAO.findByEmail(email);
            System.out.println("printing user after finding by email in service implementation: "+user.getPassword());
            

            if (!isPasswordValid(password, user.getPassword())) {
            //if (password != user.getPassword()) {
                System.out.println("passwords do not match");
                System.out.println("Printing user password from db"+user.getPassword());
            }


            return user;
       
    }


    private boolean isPasswordValid(String rawPassword, String hashedPassword) {
       
        return BCrypt.checkpw(rawPassword, hashedPassword);
    }

	@Override
	public User getUserByEmail(String email) {
		return userDAO.findByEmail(email);
	}

	@Override
	public void updateUser(User user) {
		userDAO.save(user);
		
	}
    
    

}
