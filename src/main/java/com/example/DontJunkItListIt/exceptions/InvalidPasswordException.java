package com.example.DontJunkItListIt.exceptions;

import jakarta.security.enterprise.AuthenticationException;

public class InvalidPasswordException extends AuthenticationException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
