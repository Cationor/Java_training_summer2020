package com.epamcourse.homework1.exception;

public class ProjectInvalidDataException extends Exception {
    public ProjectInvalidDataException() {
        super();
    }

    public ProjectInvalidDataException(String message, Throwable cause) {
        super(message, cause);
    }
}