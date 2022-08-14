package dercs.loader.exception;

public class MessageWithoutAssociatedOperationException extends DercsLoaderException {

    private String Message;

    public MessageWithoutAssociatedOperationException(String message) {
        super(ERROR_512 + "[" + message + "]");
        Message = message;
    }
}
