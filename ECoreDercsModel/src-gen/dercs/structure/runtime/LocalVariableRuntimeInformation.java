/**
 */
package dercs.structure.runtime;

import dercs.behavior.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable Runtime Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the runtime information of alocal variable.
 * More specifically, it stores the current value of a local variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.LocalVariableRuntimeInformation#getLocalVariable <em>Local Variable</em>}</li>
 * </ul>
 *
 * @see dercs.structure.runtime.RuntimePackage#getLocalVariableRuntimeInformation()
 * @model
 * @generated
 */
public interface LocalVariableRuntimeInformation extends RuntimeInformation {
	/**
	 * Returns the value of the '<em><b>Local Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The local varialbe to which a value can be assigned
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Variable</em>' reference.
	 * @see #setLocalVariable(LocalVariable)
	 * @see dercs.structure.runtime.RuntimePackage#getLocalVariableRuntimeInformation_LocalVariable()
	 * @model
	 * @generated
	 */
	LocalVariable getLocalVariable();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.LocalVariableRuntimeInformation#getLocalVariable <em>Local Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Variable</em>' reference.
	 * @see #getLocalVariable()
	 * @generated
	 */
	void setLocalVariable(LocalVariable value);

} // LocalVariableRuntimeInformation
