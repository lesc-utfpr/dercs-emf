package dercs.loader.exception;

public class InvalidMessageTargetException extends DercsLoaderException {
    private String Target;

    public InvalidMessageTargetException(String target) {
        super(ERROR_514 + "[" + target + "]");
        Target = target;
    }
}
