package com.example.cloud.commons.exceptions;

/**
 * 业务异常
 */
public class BusException extends RuntimeException {

    public BusException(String message) {
        super(message);
    }
}
