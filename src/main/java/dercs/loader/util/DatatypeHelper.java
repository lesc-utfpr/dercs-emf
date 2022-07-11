package dercs.loader.util;

import dercs.datatypes.String;
import dercs.datatypes.*;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidDataTypeException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Class;
import dercs.structure.ParameterKind;
import dercs.structure.Visibility;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl;

/**
 * Contains helper functions for various conversions involving UML and DERCS datatypes.
 */
public class DatatypeHelper {
    /**
     * Converts a UML datatype to the corresponding DERCS datatype
     *
     * @param umlType the UML datatype to convert
     * @return the corresponding DERCS datatype
     */
    public static DataType getDercsDatatype(InProgressDercsModel dercsModel, org.eclipse.uml2.uml.Type umlType) throws DercsLoaderException {
        // Ecore does not have an explicit void datatype
        if (umlType == null) {
            return DatatypesFactory.eINSTANCE.createVoid();
        }

        if (umlType instanceof PrimitiveTypeImpl) {
            return DatatypeHelper.convertPrimitiveType((PrimitiveType) umlType);
        }

        if (umlType instanceof org.eclipse.uml2.uml.Class) {
            Class dercsClass = dercsModel.getCorrespondingDercsElement(umlType);
            if (dercsClass == null) {
                throw new ClassNotFoundException(umlType.getName());
            }
            ClassDataType classType = DatatypesFactory.eINSTANCE.createClassDataType();
            classType.setRepresents(dercsClass);
            return classType;
        }

        if (umlType instanceof org.eclipse.uml2.uml.Enumeration) {
            dercs.datatypes.Enumeration dercsEnum = dercsModel.getCorrespondingDercsElement(umlType);
            if (dercsEnum == null) {
                throw new ClassNotFoundException(umlType.getName());
            }
            return dercsEnum;
        }

        throw new InvalidDataTypeException(umlType.eClass().getName());
    }

    /**
     * Returns the base datatype, i.e. the type of the actual stored elements.
     * This only has an effect if the given type is an array.
     * @param type the datatype
     * @return the base datatype of stored elements
     */
    public static DataType getBaseDataType(DataType type) {
        if (type instanceof Array) {
            return getBaseDataType(((Array) type).getDataType());
        } else {
            return type;
        }
    }

    /**
     * Converts a UML visibility into a DERCS visibility
     * @param umlVisibility the UML visibility
     * @return the DERCS visibility
     */
    public static Visibility convertVisibility(VisibilityKind umlVisibility) throws InvalidDataTypeException {
        switch (umlVisibility) {
            case PUBLIC_LITERAL:
                return Visibility.PUBLIC;
            case PRIVATE_LITERAL:
                return Visibility.PRIVATE;
            case PROTECTED_LITERAL:
                return Visibility.PROTECTED;
            case PACKAGE_LITERAL:
            default:
                throw new InvalidDataTypeException(umlVisibility.name());
        }
    }

    /**
     * Converts a UML parameter direction into a DERCS parameter direction
     * @param direction the UML parameter direction
     * @return the DERCS parameter direction
     */
    public static ParameterKind convertParameterDirection(ParameterDirectionKind direction) throws InvalidDataTypeException {
        switch (direction) {
            case IN_LITERAL:
                return ParameterKind.IN;
            case INOUT_LITERAL:
                return ParameterKind.INOUT;
            case OUT_LITERAL:
            case RETURN_LITERAL:
                return ParameterKind.OUT;
            default:
                throw new InvalidDataTypeException(direction.name());
        }
    }

    /**
     * Returns the human-readable name of a DERCS datatype.
     * @param type the datatype to convert
     * @return the name of the datatype
     */
    public static java.lang.String getDatatypeName(DataType type) {
        if (type instanceof ClassDataType) {
            return ((ClassDataType)type).getRepresents().getName();
        } else if (type instanceof Array) {
            return getDatatypeName(((Array)type).getDataType()) + "[]";
        } else if (type instanceof Enumeration) {
            return ((Enumeration)type).getName();
        } else if (type instanceof dercs.datatypes.Void) {
            return "Void";
        } else {
            java.lang.String className = type.getClass().getSimpleName();
            return className.substring(0, className.indexOf("Impl"));
        }
    }

    /**
     * Converts a UML primitive type to the corresponding DERCS datatype
     *
     * @implNote this checks the proxy URI, because "EcorePrimitiveTypes.library.uml"
     * isn't loaded, so we don't have the concrete classes for these primitive types
     * @param umlType the UML primitive type to convert
     * @return the corresponding DERCS primitive type
     */
    private static DataType convertPrimitiveType(PrimitiveType umlType) throws InvalidDataTypeException {
        DataType newType;
        switch (((PrimitiveTypeImpl) umlType).eProxyURI().fragment()) {
            case "EInt":
                newType = DatatypesFactory.eINSTANCE.createInteger();
                ((IntegerDataTypes)newType).setSignal(true);
                break;
            case "ELong":
                newType = DatatypesFactory.eINSTANCE.createLong();
                ((IntegerDataTypes)newType).setSignal(true);
                break;
            case "EShort":
                newType = DatatypesFactory.eINSTANCE.createShort();
                ((IntegerDataTypes)newType).setSignal(true);
                break;
            case "EByte":
                newType = DatatypesFactory.eINSTANCE.createByte();
                ((IntegerDataTypes)newType).setSignal(true);
                break;
            case "EString":
                newType = DatatypesFactory.eINSTANCE.createString();
                ((String)newType).setSize(0);
                break;
            case "EFloat":
                newType = DatatypesFactory.eINSTANCE.createFloat();
                break;
            case "EDouble":
                newType = DatatypesFactory.eINSTANCE.createDouble();
                break;
            case "EBoolean":
                newType = DatatypesFactory.eINSTANCE.createBoolean();
                break;
            case "EDate":
                newType = DatatypesFactory.eINSTANCE.createDateTime();
                break;
            default:
                throw new InvalidDataTypeException(umlType.getName());
        }

        return newType;
    }
}
