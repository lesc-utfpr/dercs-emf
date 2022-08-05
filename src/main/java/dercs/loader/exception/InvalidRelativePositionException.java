package dercs.loader.exception;

import dercs.AO.Aspect;

public class InvalidRelativePositionException extends DercsLoaderException {

    private Aspect m_Aspect;
    private String m_Pointcut;
    private String m_RelativePostion;

    public InvalidRelativePositionException(Aspect aspect, String pointcut, String relativePostion) {
        super(ERROR_524 + "[" + aspect.getName() + "." + pointcut + " - " + relativePostion + "]");
        m_Aspect = aspect;
        m_Pointcut = pointcut;
        m_RelativePostion = relativePostion;
    }

    public InvalidRelativePositionException(String relativePostion) {
        super(ERROR_524 + " [" + relativePostion + "]");
        m_RelativePostion = relativePostion;
    }
}
