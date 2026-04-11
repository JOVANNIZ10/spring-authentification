package com.ivan.auth.auth_service.exception;

import java.util.UUID;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends AppException {
    public UserNotFoundException(UUID userID) {
        super("User with ID " + userID + " not found.", HttpStatus.NOT_FOUND);
    }
    
}