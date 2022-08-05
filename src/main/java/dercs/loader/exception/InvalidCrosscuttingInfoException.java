package dercs.loader.exception;

public class InvalidCrosscuttingInfoException extends DercsLoaderException {
    public InvalidCrosscuttingInfoException(String crosscuttingInfo) {
        super("Invalid Crosscutting Info. [" + crosscuttingInfo + "]");
    }
}
