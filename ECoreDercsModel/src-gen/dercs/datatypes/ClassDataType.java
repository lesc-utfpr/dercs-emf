/**
 */
package dercs.datatypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.datatypes.ClassDataType#getRepresents <em>Represents</em>}</li>
 * </ul>
 *
 * @see dercs.datatypes.DatatypesPackage#getClassDataType()
 * @model
 * @generated
 */
public interface ClassDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(dercs.structure.Class)
	 * @see dercs.datatypes.DatatypesPackage#getClassDataType_Represents()
	 * @model
	 * @generated
	 */
	dercs.structure.Class getRepresents();

	/**
	 * Sets the value of the '{@link dercs.datatypes.ClassDataType#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(dercs.structure.Class value);

	//=== COMPATIBILITY ===

	/**
	 * @generated NOT
	 */
	default dercs.structure.Class getRepresent() {
		return getRepresents();
	}

} // ClassDataType
