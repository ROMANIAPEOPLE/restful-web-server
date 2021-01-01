package com.example.restfulwebserver.etc.controller;


public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String format) {
        super(format);
    }
}
