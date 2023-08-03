package app.CustomExceptions;

public class InvalidLevelException extends Exception {

    public InvalidLevelException(String message) {
        super(message);
    }
}