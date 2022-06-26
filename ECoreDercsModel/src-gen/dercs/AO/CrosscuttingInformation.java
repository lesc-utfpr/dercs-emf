/**
 */
package dercs.AO;

import dercs.structure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crosscutting Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents crosscutting information, i.e. the name of an information as well as it's value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.CrosscuttingInformation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dercs.AO.AOPackage#getCrosscuttingInformation()
 * @model
 * @generated
 */
public interface CrosscuttingInformation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dercs.AO.AOPackage#getCrosscuttingInformation_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dercs.AO.CrosscuttingInformation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CrosscuttingInformation
