/**
 */
package dercs.datatypes;

import java.lang.String;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.datatypes.Enumeration#getName <em>Name</em>}</li>
 *   <li>{@link dercs.datatypes.Enumeration#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see dercs.datatypes.DatatypesPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Enumeration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the Enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dercs.datatypes.DatatypesPackage#getEnumeration_Name()
	 * @model default="Enumeration"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dercs.datatypes.Enumeration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of all possible values of the enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see dercs.datatypes.DatatypesPackage#getEnumeration_Values()
	 * @model changeable="false"
	 * @generated
	 */
	EList<String> getValues();
} // Enumeration
