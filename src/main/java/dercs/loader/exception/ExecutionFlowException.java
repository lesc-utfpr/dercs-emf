package dercs.loader.exception;

public class ExecutionFlowException extends DercsLoaderException {

    private String InteractionName;
    private String MessageName;

    public ExecutionFlowException(String interactionName, String messageName) {
        super(ERROR_515 + "[" + interactionName + ", " + messageName + "]");
        InteractionName = interactionName;
        MessageName = messageName;
    }

}