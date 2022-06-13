package com.example.demo.exception_handler;

public class CustomException extends IllegalAccessException{
    public CustomException(String msg) {
        super(msg);
    }
}
