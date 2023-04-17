package com.metropolitan.babytracksystem.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String identifier, long id) {
        super(String.format("%s with ID: %d not found", identifier, id));
    }


}
