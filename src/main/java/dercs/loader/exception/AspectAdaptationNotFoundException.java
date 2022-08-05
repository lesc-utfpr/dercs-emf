package dercs.loader.exception;

import dercs.AO.Aspect;

public class AspectAdaptationNotFoundException extends DercsLoaderException {

    private Aspect m_Aspect;
    private String m_Pointcut;

    public AspectAdaptationNotFoundException(Aspect aspect, String pointcut) {
        super(ERROR_522 + " [" + aspect.getName() + "." + pointcut + "]");
        m_Aspect = aspect;
        m_Pointcut = pointcut;
    }
}
