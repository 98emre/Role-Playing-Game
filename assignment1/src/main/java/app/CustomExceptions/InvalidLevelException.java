package app.customExceptions;

public class InvalidLevelException extends RuntimeException {

    public InvalidLevelException(String message) {
        super(message);
    }
}