package com.example.cms.exception;

//@ResponseStatus (HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException (String message){
        super(message);
    }
}
