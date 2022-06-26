/**
 */
package dercs.behavior.actions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents actions performed on an object. Until now, only two object-related
 * actions were created: create and destroy an object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.ObjectAction#getRelatedObject <em>Related Object</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getObjectAction()
 * @model abstract="true"
 * @generated
 */
public interface ObjectAction extends ActionWithOutput {
	/**
	 * Returns the value of the '<em><b>Related Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object which is related to the action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Object</em>' reference.
	 * @see #setRelatedObject(dercs.structure.runtime.Object)
	 * @see dercs.behavior.actions.ActionsPackage#getObjectAction_RelatedObject()
	 * @model
	 * @generated
	 */
	dercs.structure.runtime.Object getRelatedObject();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.ObjectAction#getRelatedObject <em>Related Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Object</em>' reference.
	 * @see #getRelatedObject()
	 * @generated
	 */
	void setRelatedObject(dercs.structure.runtime.Object value);

} // ObjectAction
