/**
 */
package dercs.structure.runtime;

import dercs.structure.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Runtime Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.ParameterRuntimeInformation#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see dercs.structure.runtime.RuntimePackage#getParameterRuntimeInformation()
 * @model
 * @generated
 */
public interface ParameterRuntimeInformation extends RuntimeInformation {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter to which a value can  be assigned
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see dercs.structure.runtime.RuntimePackage#getParameterRuntimeInformation_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.ParameterRuntimeInformation#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterRuntimeInformation
