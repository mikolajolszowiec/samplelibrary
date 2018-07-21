package pl.mikolajolszowiec.exceptions;

public class BorrowerNotFoundException extends Exception {
    public BorrowerNotFoundException(String message) {
        super(message);
    }
}
