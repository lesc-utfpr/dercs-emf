/**
 */
package dercs.structure;

import dercs.datatypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a parameter of a method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.Parameter#getParameterKind <em>Parameter Kind</em>}</li>
 *   <li>{@link dercs.structure.Parameter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link dercs.structure.Parameter#getOwnerMethod <em>Owner Method</em>}</li>
 * </ul>
 *
 * @see dercs.structure.StructurePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameter Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link dercs.structure.ParameterKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of the parameter e.g. in, out, inout
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Kind</em>' attribute.
	 * @see dercs.structure.ParameterKind
	 * @see #setParameterKind(ParameterKind)
	 * @see dercs.structure.StructurePackage#getParameter_ParameterKind()
	 * @model
	 * @generated
	 */
	ParameterKind getParameterKind();

	/**
	 * Sets the value of the '{@link dercs.structure.Parameter#getParameterKind <em>Parameter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Kind</em>' attribute.
	 * @see dercs.structure.ParameterKind
	 * @see #getParameterKind()
	 * @generated
	 */
	void setParameterKind(ParameterKind value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary datatype of the parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see dercs.structure.StructurePackage#getParameter_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link dercs.structure.Parameter#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Owner Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dercs.structure.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owner method of the parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner Method</em>' container reference.
	 * @see #setOwnerMethod(Method)
	 * @see dercs.structure.StructurePackage#getParameter_OwnerMethod()
	 * @see dercs.structure.Method#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Method getOwnerMethod();

	/**
	 * Sets the value of the '{@link dercs.structure.Parameter#getOwnerMethod <em>Owner Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Method</em>' container reference.
	 * @see #getOwnerMethod()
	 * @generated
	 */
	void setOwnerMethod(Method value);

	// MANUALLY ADDED

	/**
	 * @generated NOT
	 */
	default boolean isInputParameter() {
		return (this.getParameterKind() == ParameterKind.IN) || (this.getParameterKind() == ParameterKind.INOUT);
	}

	/**
	 * @generated NOT
	 */
	default boolean isOutputParameter() {
		return (this.getParameterKind() == ParameterKind.OUT) || (this.getParameterKind() == ParameterKind.INOUT);
	}

} // Parameter
