package com.Jonas.bookstore.service.exceptions;

/**
 *
 * @author Jonas created 28/02/2021
 */
////Exception specific of services, SUBCLASSE RUNTIMEEXCEPTION
public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public ObjectNotFoundException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }
}
