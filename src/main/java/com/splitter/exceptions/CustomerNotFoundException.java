package com.splitter.exceptions;

/**
 * Created by prateekgupta on 16/12/17.
 */
public class CustomerNotFoundException extends CustomExceptionHandler {

    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
