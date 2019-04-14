package com.splitter.exceptions;

/**
 * Created by prateekgupta on 16/12/17.
 */
public class GroupNotFoundException extends CustomExceptionHandler {

    private static final long serialVersionUID = 1L;

    public GroupNotFoundException(String message) {
        super(message);
    }
}
