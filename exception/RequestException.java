package com.asklora.system.bankmodelorm.exception;

public class RequestException extends Exception {

    private String requestObject;

    public RequestException() {
        super();
    }

    public RequestException(String message) {
        super(message);
    }

    public RequestException(String message, String requestObject) {
        super(message);
        this.requestObject = requestObject;
    }

    public String getRequestObject() {
        return requestObject;
    }
}
