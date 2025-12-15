package org.orbitalLogistic.maintenance.exceptions;

public class SpacecraftNotFoundException extends RuntimeException{
    public SpacecraftNotFoundException(String message) {
        super(message);
    }
}
