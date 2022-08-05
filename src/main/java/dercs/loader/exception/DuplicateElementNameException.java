package dercs.loader.exception;

public class DuplicateElementNameException extends DercsLoaderException {
    public DuplicateElementNameException(String name, Class<?> type) {
        super("Found multiple elements of type '" + type.getName() + "' while searching for name '" + name + "'.");
    }

    public DuplicateElementNameException(String name, String in) {
        super("Found multiple elements with name '" + name + "' in '" + in + "'.");
    }
}
