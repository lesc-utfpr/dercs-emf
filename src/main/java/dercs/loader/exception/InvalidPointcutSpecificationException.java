package dercs.loader.exception;

import dercs.AO.Aspect;

public class InvalidPointcutSpecificationException extends DercsLoaderException {

    private Aspect m_Aspect;
    private String m_Pointcut;

    public InvalidPointcutSpecificationException(Aspect aspect, String pointcut) {
        super(ERROR_521 + " [" + aspect.getName() + "." + pointcut + "]");
        m_Aspect = aspect;
        m_Pointcut = pointcut;
    }

}