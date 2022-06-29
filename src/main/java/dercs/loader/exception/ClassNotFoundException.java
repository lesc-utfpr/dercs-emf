package dercs.loader.exception;

public class ClassNotFoundException extends DercsLoaderException {
    String className;

    public ClassNotFoundException(String className) {
        super(ERROR_502 + "\t[" + className + "]");
        this.className = className;
    }
}
