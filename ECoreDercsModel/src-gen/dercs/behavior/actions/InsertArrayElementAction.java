/**
 */
package dercs.behavior.actions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Array Element Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the action of inserting an element into an array.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.InsertArrayElementAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getInsertArrayElementAction()
 * @model
 * @generated
 */
public interface InsertArrayElementAction extends ArrayAction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value to be inserted
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dercs.behavior.actions.ActionsPackage#getInsertArrayElementAction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.InsertArrayElementAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // InsertArrayElementAction
