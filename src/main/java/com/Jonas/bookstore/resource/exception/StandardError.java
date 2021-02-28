package com.Jonas.bookstore.resource.exception;

/**
 *
 * @author Jonas, created 28/02/2021
 */
public class StandardError {

    private Long timestamp;
    private Integer status;
    private String error;

    //CONSTRUCTOR
    public StandardError() {
        super();
        // TODO Auto-generated constructor stub
    }

    //CONSTRUCTOR
    public StandardError(Long timestamp, Integer status, String error) {
        super();
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
    }

    //GET AND SET
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
