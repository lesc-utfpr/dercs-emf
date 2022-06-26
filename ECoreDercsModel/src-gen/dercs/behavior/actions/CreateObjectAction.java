/**
 */
package dercs.behavior.actions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the action of creating an instance of a class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.CreateObjectAction#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getCreateObjectAction()
 * @model
 * @generated
 */
public interface CreateObjectAction extends ObjectAction {
	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of values for the message parameters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Values</em>' attribute list.
	 * @see dercs.behavior.actions.ActionsPackage#getCreateObjectAction_ParameterValues()
	 * @model
	 * @generated
	 */
	EList<String> getParameterValues();

} // CreateObjectAction
