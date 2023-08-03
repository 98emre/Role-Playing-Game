package app.customExceptions;

public class InvalidWeaponException extends RuntimeException {

    public InvalidWeaponException(String message) {
        super(message);
    }
}
