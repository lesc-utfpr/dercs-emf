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

	//=== COMPATIBILITY ===

	/**
	 * @generated NOT
	 */
	default void addParameterValue(String value) {
		getParameterValues().add(value);
	}

	/**
	 * @generated NOT
	 */
	default void addParameterValue(dercs.structure.Attribute attr) {
		getParameterValues().add(attr.getName());
	}

	/**
	 * @generated NOT
	 */
	default void addParameterValue(dercs.structure.runtime.Object obj) {
		getParameterValues().add(obj.getName());
	}

	/**
	 * @generated NOT
	 */
	default void addParameterValue(dercs.behavior.LocalVariable var) {
		getParameterValues().add(var.getName());
	}

	/**
	 * @generated NOT
	 */
	default String getParameterValue(int index) {
		return getParameterValues().get(index);
	}

	/**
	 * @generated NOT
	 */
	default int getParametersValuesCount() {
		return getParameterValues().size();
	}

	/**
	 * @generated NOT
	 */
	default EList<String> getParametersValues() {
		return getParameterValues();
	}

} // CreateObjectAction
