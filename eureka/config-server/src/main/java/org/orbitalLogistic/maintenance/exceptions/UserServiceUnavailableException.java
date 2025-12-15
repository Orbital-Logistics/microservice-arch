package org.orbitalLogistic.maintenance.exceptions;

public class UserServiceUnavailableException extends RuntimeException{
    public UserServiceUnavailableException(String message) {
        super(message);
    }
}
