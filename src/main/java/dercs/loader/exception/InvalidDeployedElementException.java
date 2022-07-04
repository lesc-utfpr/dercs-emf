package dercs.loader.exception;

public class InvalidDeployedElementException extends DercsLoaderException {
    private String elementName;
    private String nodeName;

    public InvalidDeployedElementException(String nodeName, String elementName) {
        super(ERROR_527);
        nodeName = nodeName;
        elementName = elementName;
    }
}
