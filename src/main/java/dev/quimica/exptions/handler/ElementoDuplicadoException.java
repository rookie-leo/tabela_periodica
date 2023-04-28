package dev.quimica.exptions.handler;

public class ElementoDuplicadoException extends Exception {

    public ElementoDuplicadoException() { super(); }

    public ElementoDuplicadoException(String message) {
        super(message);
    }

    public ElementoDuplicadoException(String message, Exception ex) {
        super(message, ex);
    }
}
