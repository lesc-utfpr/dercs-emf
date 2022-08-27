package dercs.loader.exception;

public class UnexpectedArgumentException extends DercsLoaderException {
    private String m_MessageName;
    private String m_InteractionName;
    private String m_ArgumentType;
    private int m_ArgumentPosition;

    public UnexpectedArgumentException(String messageName, String interactionName, int argumentPosition, String argumentType) {
        super(ERROR_519 + "[" + interactionName + "_" + messageName + " (" +
                argumentPosition + ", " + argumentType + ")]");
        m_MessageName = messageName;
        m_InteractionName = interactionName;
        m_ArgumentType = argumentType;
        m_ArgumentPosition = argumentPosition;
    }
}
