package app.customExceptions;

public class InvalidArmorException extends RuntimeException {

    public InvalidArmorException(String message) {
        super(message);
    }
}
