package dercs.loader.exception;

public class AttributeNotFoundException extends DercsLoaderException{
    String attributeName;

    public AttributeNotFoundException(String attrName) {
        super(ERROR_506 + " [" + attrName + "]");
        this.attributeName = attrName;
    }
}
