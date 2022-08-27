package dercs.loader.exception;

import dercs.structure.Method;

public class ArgumentNumberDoesNotMatchException extends DercsLoaderException {
    private String m_MessageName;
    private String m_InteractionName;
    private Method M_Method;
    private int m_ArgumentsNumber = -1;

    public ArgumentNumberDoesNotMatchException(String messageName, String interactionName, int argumentsNumber, Method method) {
        super(ERROR_518 + "\n[" + interactionName + "_" + messageName + " (" +
                argumentsNumber + ") - " + method.getOwnerClass().getName() +
                "." + method.getName() + " (" + method.getParameters().size() + ")]");
        m_MessageName = messageName;
        m_InteractionName = interactionName;
        M_Method = method;
        m_ArgumentsNumber = argumentsNumber;
    }
}
