package com.quickman.studentmanagement.exception;

import org.springframework.http.HttpStatus;

public class StudentException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public StudentException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getDetails() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}