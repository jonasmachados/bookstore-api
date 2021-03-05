package com.Jonas.bookstore.service.exceptions;

/**
 *
 * @author Jonas, created 04/03/2021
 */
//Class to handling exception when we try delete a class with a association
public class DataIntegrityViolationException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    //CONSTRUCOTR
    public DataIntegrityViolationException(String message) {
        super(message);
    }

    public DataIntegrityViolationException(String message, Throwable cause) {
        super(message, cause);
    }

}
