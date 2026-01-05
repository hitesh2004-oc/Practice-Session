package Day17;

// Custom exception class to handle minimum order violations
public class MinimumOrderException extends Exception {

    /**
     * Constructor of MinimumOrderException
     * @param message Error message that explains the exception
     */
    public MinimumOrderException(String message) {

        // Call the parent Exception class constructor
        // and pass the custom error message
        super(message);
    }
}
