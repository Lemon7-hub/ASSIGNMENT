package pizza;

/**
 * Custom exception for invalid data.
 */
public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}