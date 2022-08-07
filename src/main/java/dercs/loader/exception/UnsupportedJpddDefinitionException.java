package dercs.loader.exception;

public class UnsupportedJpddDefinitionException extends DercsLoaderException {

    private String JpddName = "";

    public UnsupportedJpddDefinitionException(String name) {
        super(ERROR_530 + " [" + name + "]");
        JpddName = name;
    }
}