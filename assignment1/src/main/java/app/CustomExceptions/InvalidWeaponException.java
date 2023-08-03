package app.CustomExceptions;

public class InvalidWeaponException extends Exception {

    public InvalidWeaponException(String message) {
        super(message);
    }
}
