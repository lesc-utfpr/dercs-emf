package dercs.loader.exception;

public class InvalidActionSyntaxException extends DercsLoaderException {

    private String actionSyntax;

    public InvalidActionSyntaxException(String actionSyntax) {
        super(ERROR_510 + "[" + actionSyntax + "]");
        this.actionSyntax = actionSyntax;
    }
}
