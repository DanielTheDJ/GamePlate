package com.minehut.gameplate.map.repository.exception;

public class RotationLoadException extends Exception {

    private final String message;

    public RotationLoadException(String message) {
        this.message = message;

    }

    @Override
    public String getMessage() {
        return message;
    }


}
