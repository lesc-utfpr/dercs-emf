package dercs.loader.exception;

public class InvalidDataTypeException extends DercsLoaderException {
    String invalidDataType;

    public InvalidDataTypeException(String invalidDataType) {
        super(ERROR_503 + "\t[" + invalidDataType + "]");
        invalidDataType = invalidDataType;
    }
}
