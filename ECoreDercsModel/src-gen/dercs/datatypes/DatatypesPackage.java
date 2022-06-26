/**
 */
package dercs.datatypes;

import java.lang.String;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dercs.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://utfpr.edu.br/dercs/datatypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = dercs.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.DataTypeImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___COMPARE_TO__DATATYPE = 0;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_PRIMITIVE = 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.IntegerDataTypesImpl <em>Integer Data Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.IntegerDataTypesImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getIntegerDataTypes()
	 * @generated
	 */
	int INTEGER_DATA_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Is Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPES__IS_SIGNAL = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPES_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPES___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPES___IS_PRIMITIVE = DATA_TYPE___IS_PRIMITIVE;

	/**
	 * The operation id for the '<em>Is Signed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPES___IS_SIGNED = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPES_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.FloatingPointDatatypesImpl <em>Floating Point Datatypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.FloatingPointDatatypesImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getFloatingPointDatatypes()
	 * @generated
	 */
	int FLOATING_POINT_DATATYPES = 2;

	/**
	 * The number of structural features of the '<em>Floating Point Datatypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_DATATYPES_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_DATATYPES___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_DATATYPES___IS_PRIMITIVE = DATA_TYPE___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Floating Point Datatypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_DATATYPES_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.BooleanImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 3;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___IS_PRIMITIVE = DATA_TYPE___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.EnumerationImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VALUES = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___IS_PRIMITIVE = DATA_TYPE___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.VoidImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 5;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID___IS_PRIMITIVE = DATA_TYPE___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.ClassDataTypeImpl <em>Class Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.ClassDataTypeImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getClassDataType()
	 * @generated
	 */
	int CLASS_DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DATA_TYPE__REPRESENTS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DATA_TYPE___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DATA_TYPE___IS_PRIMITIVE = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.ArrayImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SIZE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__LOWER_VALUE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__UPPER_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DATA_TYPE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY___IS_PRIMITIVE = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.ByteImpl <em>Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.ByteImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getByte()
	 * @generated
	 */
	int BYTE = 8;

	/**
	 * The feature id for the '<em><b>Is Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__IS_SIGNAL = INTEGER_DATA_TYPES__IS_SIGNAL;

	/**
	 * The number of structural features of the '<em>Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FEATURE_COUNT = INTEGER_DATA_TYPES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE___COMPARE_TO__DATATYPE = INTEGER_DATA_TYPES___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE___IS_PRIMITIVE = INTEGER_DATA_TYPES___IS_PRIMITIVE;

	/**
	 * The operation id for the '<em>Is Signed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE___IS_SIGNED = INTEGER_DATA_TYPES___IS_SIGNED;

	/**
	 * The number of operations of the '<em>Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_OPERATION_COUNT = INTEGER_DATA_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.ShortImpl <em>Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.ShortImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getShort()
	 * @generated
	 */
	int SHORT = 9;

	/**
	 * The feature id for the '<em><b>Is Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__IS_SIGNAL = INTEGER_DATA_TYPES__IS_SIGNAL;

	/**
	 * The number of structural features of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_FEATURE_COUNT = INTEGER_DATA_TYPES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT___COMPARE_TO__DATATYPE = INTEGER_DATA_TYPES___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT___IS_PRIMITIVE = INTEGER_DATA_TYPES___IS_PRIMITIVE;

	/**
	 * The operation id for the '<em>Is Signed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT___IS_SIGNED = INTEGER_DATA_TYPES___IS_SIGNED;

	/**
	 * The number of operations of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_OPERATION_COUNT = INTEGER_DATA_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.LongImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 10;

	/**
	 * The feature id for the '<em><b>Is Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__IS_SIGNAL = INTEGER_DATA_TYPES__IS_SIGNAL;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = INTEGER_DATA_TYPES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG___COMPARE_TO__DATATYPE = INTEGER_DATA_TYPES___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG___IS_PRIMITIVE = INTEGER_DATA_TYPES___IS_PRIMITIVE;

	/**
	 * The operation id for the '<em>Is Signed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG___IS_SIGNED = INTEGER_DATA_TYPES___IS_SIGNED;

	/**
	 * The number of operations of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OPERATION_COUNT = INTEGER_DATA_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.IntegerImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 11;

	/**
	 * The feature id for the '<em><b>Is Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__IS_SIGNAL = INTEGER_DATA_TYPES__IS_SIGNAL;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = INTEGER_DATA_TYPES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER___COMPARE_TO__DATATYPE = INTEGER_DATA_TYPES___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER___IS_PRIMITIVE = INTEGER_DATA_TYPES___IS_PRIMITIVE;

	/**
	 * The operation id for the '<em>Is Signed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER___IS_SIGNED = INTEGER_DATA_TYPES___IS_SIGNED;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = INTEGER_DATA_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.CharacterDataTypesImpl <em>Character Data Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.CharacterDataTypesImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getCharacterDataTypes()
	 * @generated
	 */
	int CHARACTER_DATA_TYPES = 12;

	/**
	 * The number of structural features of the '<em>Character Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DATA_TYPES_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DATA_TYPES___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DATA_TYPES___IS_PRIMITIVE = DATA_TYPE___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Character Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DATA_TYPES_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.CharImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 13;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = CHARACTER_DATA_TYPES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR___COMPARE_TO__DATATYPE = CHARACTER_DATA_TYPES___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR___IS_PRIMITIVE = CHARACTER_DATA_TYPES___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_OPERATION_COUNT = CHARACTER_DATA_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.StringImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 14;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__SIZE = CHARACTER_DATA_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = CHARACTER_DATA_TYPES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING___COMPARE_TO__DATATYPE = CHARACTER_DATA_TYPES___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING___IS_PRIMITIVE = CHARACTER_DATA_TYPES___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = CHARACTER_DATA_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.FloatImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 15;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = FLOATING_POINT_DATATYPES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT___COMPARE_TO__DATATYPE = FLOATING_POINT_DATATYPES___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT___IS_PRIMITIVE = FLOATING_POINT_DATATYPES___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = FLOATING_POINT_DATATYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.DoubleImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 16;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = FLOATING_POINT_DATATYPES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE___COMPARE_TO__DATATYPE = FLOATING_POINT_DATATYPES___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE___IS_PRIMITIVE = FLOATING_POINT_DATATYPES___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = FLOATING_POINT_DATATYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.datatypes.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.datatypes.impl.DateTimeImpl
	 * @see dercs.datatypes.impl.DatatypesPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 17;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME___COMPARE_TO__DATATYPE = DATA_TYPE___COMPARE_TO__DATATYPE;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME___IS_PRIMITIVE = DATA_TYPE___IS_PRIMITIVE;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see dercs.datatypes.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the '{@link dercs.datatypes.DataType#compareTo(dercs.datatypes.DataType) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see dercs.datatypes.DataType#compareTo(dercs.datatypes.DataType)
	 * @generated
	 */
	EOperation getDataType__CompareTo__DataType();

	/**
	 * Returns the meta object for the '{@link dercs.datatypes.DataType#isPrimitive() <em>Is Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Primitive</em>' operation.
	 * @see dercs.datatypes.DataType#isPrimitive()
	 * @generated
	 */
	EOperation getDataType__IsPrimitive();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.IntegerDataTypes <em>Integer Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Data Types</em>'.
	 * @see dercs.datatypes.IntegerDataTypes
	 * @generated
	 */
	EClass getIntegerDataTypes();

	/**
	 * Returns the meta object for the attribute '{@link dercs.datatypes.IntegerDataTypes#isIsSignal <em>Is Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Signal</em>'.
	 * @see dercs.datatypes.IntegerDataTypes#isIsSignal()
	 * @see #getIntegerDataTypes()
	 * @generated
	 */
	EAttribute getIntegerDataTypes_IsSignal();

	/**
	 * Returns the meta object for the '{@link dercs.datatypes.IntegerDataTypes#isSigned() <em>Is Signed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Signed</em>' operation.
	 * @see dercs.datatypes.IntegerDataTypes#isSigned()
	 * @generated
	 */
	EOperation getIntegerDataTypes__IsSigned();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.FloatingPointDatatypes <em>Floating Point Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Point Datatypes</em>'.
	 * @see dercs.datatypes.FloatingPointDatatypes
	 * @generated
	 */
	EClass getFloatingPointDatatypes();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see dercs.datatypes.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see dercs.datatypes.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link dercs.datatypes.Enumeration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dercs.datatypes.Enumeration#getName()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Name();

	/**
	 * Returns the meta object for the attribute list '{@link dercs.datatypes.Enumeration#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see dercs.datatypes.Enumeration#getValues()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Values();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see dercs.datatypes.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.ClassDataType <em>Class Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Data Type</em>'.
	 * @see dercs.datatypes.ClassDataType
	 * @generated
	 */
	EClass getClassDataType();

	/**
	 * Returns the meta object for the reference '{@link dercs.datatypes.ClassDataType#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see dercs.datatypes.ClassDataType#getRepresents()
	 * @see #getClassDataType()
	 * @generated
	 */
	EReference getClassDataType_Represents();

	/**
	 * Returns the meta object for the '{@link dercs.datatypes.ClassDataType#isPrimitive() <em>Is Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Primitive</em>' operation.
	 * @see dercs.datatypes.ClassDataType#isPrimitive()
	 * @generated
	 */
	EOperation getClassDataType__IsPrimitive();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see dercs.datatypes.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link dercs.datatypes.Array#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see dercs.datatypes.Array#getSize()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Size();

	/**
	 * Returns the meta object for the attribute '{@link dercs.datatypes.Array#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Value</em>'.
	 * @see dercs.datatypes.Array#getLowerValue()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_LowerValue();

	/**
	 * Returns the meta object for the attribute '{@link dercs.datatypes.Array#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Value</em>'.
	 * @see dercs.datatypes.Array#getUpperValue()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_UpperValue();

	/**
	 * Returns the meta object for the reference '{@link dercs.datatypes.Array#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see dercs.datatypes.Array#getDataType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_DataType();

	/**
	 * Returns the meta object for the '{@link dercs.datatypes.Array#isPrimitive() <em>Is Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Primitive</em>' operation.
	 * @see dercs.datatypes.Array#isPrimitive()
	 * @generated
	 */
	EOperation getArray__IsPrimitive();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte</em>'.
	 * @see dercs.datatypes.Byte
	 * @generated
	 */
	EClass getByte();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short</em>'.
	 * @see dercs.datatypes.Short
	 * @generated
	 */
	EClass getShort();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see dercs.datatypes.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see dercs.datatypes.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.CharacterDataTypes <em>Character Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Data Types</em>'.
	 * @see dercs.datatypes.CharacterDataTypes
	 * @generated
	 */
	EClass getCharacterDataTypes();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see dercs.datatypes.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see dercs.datatypes.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link dercs.datatypes.String#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see dercs.datatypes.String#getSize()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Size();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see dercs.datatypes.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see dercs.datatypes.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link dercs.datatypes.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see dercs.datatypes.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.DataTypeImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___COMPARE_TO__DATATYPE = eINSTANCE.getDataType__CompareTo__DataType();

		/**
		 * The meta object literal for the '<em><b>Is Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_PRIMITIVE = eINSTANCE.getDataType__IsPrimitive();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.IntegerDataTypesImpl <em>Integer Data Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.IntegerDataTypesImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getIntegerDataTypes()
		 * @generated
		 */
		EClass INTEGER_DATA_TYPES = eINSTANCE.getIntegerDataTypes();

		/**
		 * The meta object literal for the '<em><b>Is Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_DATA_TYPES__IS_SIGNAL = eINSTANCE.getIntegerDataTypes_IsSignal();

		/**
		 * The meta object literal for the '<em><b>Is Signed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_DATA_TYPES___IS_SIGNED = eINSTANCE.getIntegerDataTypes__IsSigned();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.FloatingPointDatatypesImpl <em>Floating Point Datatypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.FloatingPointDatatypesImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getFloatingPointDatatypes()
		 * @generated
		 */
		EClass FLOATING_POINT_DATATYPES = eINSTANCE.getFloatingPointDatatypes();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.BooleanImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.EnumerationImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__VALUES = eINSTANCE.getEnumeration_Values();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.VoidImpl <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.VoidImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getVoid()
		 * @generated
		 */
		EClass VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.ClassDataTypeImpl <em>Class Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.ClassDataTypeImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getClassDataType()
		 * @generated
		 */
		EClass CLASS_DATA_TYPE = eINSTANCE.getClassDataType();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DATA_TYPE__REPRESENTS = eINSTANCE.getClassDataType_Represents();

		/**
		 * The meta object literal for the '<em><b>Is Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS_DATA_TYPE___IS_PRIMITIVE = eINSTANCE.getClassDataType__IsPrimitive();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.ArrayImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__SIZE = eINSTANCE.getArray_Size();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__LOWER_VALUE = eINSTANCE.getArray_LowerValue();

		/**
		 * The meta object literal for the '<em><b>Upper Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__UPPER_VALUE = eINSTANCE.getArray_UpperValue();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__DATA_TYPE = eINSTANCE.getArray_DataType();

		/**
		 * The meta object literal for the '<em><b>Is Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARRAY___IS_PRIMITIVE = eINSTANCE.getArray__IsPrimitive();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.ByteImpl <em>Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.ByteImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getByte()
		 * @generated
		 */
		EClass BYTE = eINSTANCE.getByte();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.ShortImpl <em>Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.ShortImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getShort()
		 * @generated
		 */
		EClass SHORT = eINSTANCE.getShort();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.LongImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.IntegerImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.CharacterDataTypesImpl <em>Character Data Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.CharacterDataTypesImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getCharacterDataTypes()
		 * @generated
		 */
		EClass CHARACTER_DATA_TYPES = eINSTANCE.getCharacterDataTypes();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.CharImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.StringImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__SIZE = eINSTANCE.getString_Size();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.FloatImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.DoubleImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link dercs.datatypes.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.datatypes.impl.DateTimeImpl
		 * @see dercs.datatypes.impl.DatatypesPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

	}

} //DatatypesPackage
