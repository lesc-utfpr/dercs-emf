package dercs.loader.exception;

import dercs.structure.Method;

public class DuplicatedBehaviorException extends DercsLoaderException {

    private dercs.structure.Method Method;

    public DuplicatedBehaviorException(Method method) {
        super(ERROR_513 + "[" + method.getOwnerClass().getName() + "." + method.getName() + "]");
        Method = method;
    }
}
