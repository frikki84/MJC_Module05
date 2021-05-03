package com.epam.esm.service.service.exception;

public class NoSuchResourceException extends CustomErrorExeption {

    public NoSuchResourceException(CustomErrorCode code) {
        super(code);
    }

    public NoSuchResourceException(String message, CustomErrorCode code) {
        super(message, code);
    }
}

