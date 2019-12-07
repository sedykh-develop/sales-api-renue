package ru.renue.fns.exception;

public class QrReaderRuntimeException extends RuntimeException {

    public QrReaderRuntimeException() {
    }

    public QrReaderRuntimeException(String message) {
        super(message);
    }

    public QrReaderRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public QrReaderRuntimeException(Throwable cause) {
        super(cause);
    }

    public QrReaderRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
