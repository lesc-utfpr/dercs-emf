package dercs.loader.exception;

import dercs.AO.Aspect;

public class JoinPointNotFoundException extends DercsLoaderException {
    private Aspect m_Aspect;
    private String m_Pointcut;

    public JoinPointNotFoundException(Aspect aspect, String pointcut) {
        super(ERROR_523 + " [" + aspect.getName() + "." + pointcut + "]");
        m_Aspect = aspect;
        m_Pointcut = pointcut;
    }
}
