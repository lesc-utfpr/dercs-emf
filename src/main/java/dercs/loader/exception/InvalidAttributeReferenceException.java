package dercs.loader.exception;

public class InvalidAttributeReferenceException extends DercsLoaderException {

    private String InvalidReference;

    public InvalidAttributeReferenceException(String invalidReference) {
        super(ERROR_511 + "[" + invalidReference + "]");
        InvalidReference = invalidReference;
    }
}