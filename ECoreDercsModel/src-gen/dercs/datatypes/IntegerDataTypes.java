/**
 */
package dercs.datatypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Data Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents integer data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.datatypes.IntegerDataTypes#isIsSignal <em>Is Signal</em>}</li>
 * </ul>
 *
 * @see dercs.datatypes.DatatypesPackage#getIntegerDataTypes()
 * @model abstract="true"
 * @generated
 */
public interface IntegerDataTypes extends DataType {
	/**
	 * Returns the value of the '<em><b>Is Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the number is a signal bit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Signal</em>' attribute.
	 * @see #setIsSignal(boolean)
	 * @see dercs.datatypes.DatatypesPackage#getIntegerDataTypes_IsSignal()
	 * @model
	 * @generated
	 */
	boolean isIsSignal();

	/**
	 * Sets the value of the '{@link dercs.datatypes.IntegerDataTypes#isIsSignal <em>Is Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Signal</em>' attribute.
	 * @see #isIsSignal()
	 * @generated
	 */
	void setIsSignal(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSigned();

} // IntegerDataTypes
