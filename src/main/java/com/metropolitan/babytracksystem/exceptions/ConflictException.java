package com.metropolitan.babytracksystem.exceptions;

import java.io.Serializable;

public class ConflictException extends RuntimeException implements Serializable {

    private transient Object data;

    public ConflictException(String message) {
        super(message);
    }

    public ConflictException addData(Object data) {
        this.data = data;
        return this;
    }

    public Object getData() {
        return data;
    }

}
