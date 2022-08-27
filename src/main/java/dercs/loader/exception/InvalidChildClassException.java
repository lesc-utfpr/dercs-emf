package dercs.loader.exception;

public class InvalidChildClassException extends DercsLoaderException {
    private String m_ClassName;

    public InvalidChildClassException(String className) {
        super(ERROR_529 + "[" + className + "]");
        m_ClassName = className;
    }
}
