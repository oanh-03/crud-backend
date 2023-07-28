package com.test.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException (Long id){
        super("Khong tim thay " + id);
    }
}
