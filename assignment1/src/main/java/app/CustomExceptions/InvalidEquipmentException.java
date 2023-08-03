package app.CustomExceptions;

public class InvalidEquipmentException extends Exception {

    public InvalidEquipmentException(String message) {
        super(message);
    }
}