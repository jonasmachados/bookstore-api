package com.Jonas.bookstore.resource.exception;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonas
 */
public class ValidationError extends StandardError {

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError() {
    }

    public ValidationError(Long timestamp, Integer status, String error) {
        super(timestamp, status, error);
    }

    //GET AND SET
    public List<FieldMessage> getErrors() {
        return errors;
    }

    //pass erro one by one
    public void addErrors(String fieldName, String message) {
        this.errors.add(new FieldMessage(fieldName, message));
    }

}
