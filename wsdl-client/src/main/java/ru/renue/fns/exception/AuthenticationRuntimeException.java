package ru.renue.fns.exception;

public class AuthenticationRuntimeException extends RuntimeException {

    public AuthenticationRuntimeException() {
    }

    public AuthenticationRuntimeException(String message) {
        super(message);
    }

    public AuthenticationRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthenticationRuntimeException(Throwable cause) {
        super(cause);
    }

    public AuthenticationRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
