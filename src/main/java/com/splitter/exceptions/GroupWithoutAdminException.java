package com.splitter.exceptions;

/**
 * Created by prateekgupta on 16/12/17.
 */
public class GroupWithoutAdminException extends CustomExceptionHandler {

    private static final long serialVersionUID = 1L;

    public GroupWithoutAdminException(String message) {
        super(message);
    }
}
