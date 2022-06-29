package dercs.loader.exception;

public class InvalidNodenameException extends DercsLoaderException {
    private String invalidName;

    public InvalidNodenameException(String invalidName) {
        super(ERROR_525 + " [" + invalidName + "]");
        this.invalidName = invalidName;
    }
}
