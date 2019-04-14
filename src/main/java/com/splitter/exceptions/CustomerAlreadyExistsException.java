package com.splitter.exceptions;

/**
 * Created by prateekgupta on 16/12/17.
 */
public class CustomerAlreadyExistsException extends CustomExceptionHandler {

    private static final long serialVersionUID = 1L;

    public CustomerAlreadyExistsException(String message) {
        super(message);
    }
}
