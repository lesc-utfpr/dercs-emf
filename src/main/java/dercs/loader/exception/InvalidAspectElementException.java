package dercs.loader.exception;

import dercs.AO.Aspect;

public class InvalidAspectElementException extends DercsLoaderException {

    private Aspect m_Aspect;
    private String m_ElementName;

    public InvalidAspectElementException(Aspect aspect, String elementName) {
        super(ERROR_520 + " [" + aspect.getName() + "." + elementName + "]");
        m_Aspect = aspect;
        m_ElementName = elementName;
    }
}
