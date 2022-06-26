/**
 */
package dercs.behavior.actions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Array Element Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the action of changing the value of an element in an array.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.SetArrayElementAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getSetArrayElementAction()
 * @model
 * @generated
 */
public interface SetArrayElementAction extends ArrayAction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The new value of the element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dercs.behavior.actions.ActionsPackage#getSetArrayElementAction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.SetArrayElementAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // SetArrayElementAction
