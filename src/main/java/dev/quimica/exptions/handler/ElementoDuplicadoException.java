package dev.quimica.exptions.handler;

public class ElementoDuplicadoException extends RuntimeException {

    public ElementoDuplicadoException() { super(); }

    public ElementoDuplicadoException(String message) {
        super(message);
    }

    public ElementoDuplicadoException(String message, Exception ex) {
        super(message, ex);
    }
}
