/**
 */
package dercs.behavior;

import dercs.datatypes.DataType;
import dercs.structure.NamedElement;
import dercs.structure.runtime.LocalVariableRuntimeInformation;
import dercs.structure.runtime.RuntimeFactory;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a behavior of a DERTS. Behaviors contain actions which should be
 * executed sequentialy, one after another. Behavior have enter and exit 
 * conditions, meaning that they can represent "ifs" and "loops". Behaviors are
 * triggered by messages or events. 
 * NOTE: The "owner" back-reference must be manually set due to Ecore limitations
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.Behavior#getEnterCondition <em>Enter Condition</em>}</li>
 *   <li>{@link dercs.behavior.Behavior#getExitCondition <em>Exit Condition</em>}</li>
 *   <li>{@link dercs.behavior.Behavior#getOwner <em>Owner</em>}</li>
 *   <li>{@link dercs.behavior.Behavior#getNumberOfRepetitions <em>Number Of Repetitions</em>}</li>
 *   <li>{@link dercs.behavior.Behavior#getBehavioralElements <em>Behavioral Elements</em>}</li>
 *   <li>{@link dercs.behavior.Behavior#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link dercs.behavior.Behavior#getAlternateBehavior <em>Alternate Behavior</em>}</li>
 *   <li>{@link dercs.behavior.Behavior#getRuntimeInformation <em>Runtime Information</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.BehaviorPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends BehavioralElement {
	/**
	 * Returns the value of the '<em><b>Enter Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition that must be true before the execution of this behavior's actions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enter Condition</em>' attribute.
	 * @see #setEnterCondition(String)
	 * @see dercs.behavior.BehaviorPackage#getBehavior_EnterCondition()
	 * @model
	 * @generated
	 */
	String getEnterCondition();

	/**
	 * Sets the value of the '{@link dercs.behavior.Behavior#getEnterCondition <em>Enter Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enter Condition</em>' attribute.
	 * @see #getEnterCondition()
	 * @generated
	 */
	void setEnterCondition(String value);

	/**
	 * Returns the value of the '<em><b>Exit Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition that must be true after the execution of this behavior's actions, otherwise the actions will be executed again
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Condition</em>' attribute.
	 * @see #setExitCondition(String)
	 * @see dercs.behavior.BehaviorPackage#getBehavior_ExitCondition()
	 * @model
	 * @generated
	 */
	String getExitCondition();

	/**
	 * Sets the value of the '{@link dercs.behavior.Behavior#getExitCondition <em>Exit Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Condition</em>' attribute.
	 * @see #getExitCondition()
	 * @generated
	 */
	void setExitCondition(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Element that owns this behavior  
	 * NOTE: This back-reference must be set manually because Ecore cannot handle bidirectional references that could refer to multiple different opposite classes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(NamedElement)
	 * @see dercs.behavior.BehaviorPackage#getBehavior_Owner()
	 * @model
	 * @generated
	 */
	NamedElement getOwner();

	/**
	 * Sets the value of the '{@link dercs.behavior.Behavior#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Number Of Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavior should be repeated a fixed number of times
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Repetitions</em>' attribute.
	 * @see #setNumberOfRepetitions(int)
	 * @see dercs.behavior.BehaviorPackage#getBehavior_NumberOfRepetitions()
	 * @model
	 * @generated
	 */
	int getNumberOfRepetitions();

	/**
	 * Sets the value of the '{@link dercs.behavior.Behavior#getNumberOfRepetitions <em>Number Of Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repetitions</em>' attribute.
	 * @see #getNumberOfRepetitions()
	 * @generated
	 */
	void setNumberOfRepetitions(int value);

	/**
	 * Returns the value of the '<em><b>Behavioral Elements</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.behavior.BehavioralElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of actions performed sequentially within the behavior's execution
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavioral Elements</em>' containment reference list.
	 * @see dercs.behavior.BehaviorPackage#getBehavior_BehavioralElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehavioralElement> getBehavioralElements();

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.behavior.LocalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of local variables within the scope of this behavior's actions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see dercs.behavior.BehaviorPackage#getBehavior_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalVariable> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Alternate Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An alternative behavior, which should be performed if the enter condition is false when the normal behavior should execute for the first time
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Behavior</em>' reference.
	 * @see #setAlternateBehavior(Behavior)
	 * @see dercs.behavior.BehaviorPackage#getBehavior_AlternateBehavior()
	 * @model
	 * @generated
	 */
	Behavior getAlternateBehavior();

	/**
	 * Sets the value of the '{@link dercs.behavior.Behavior#getAlternateBehavior <em>Alternate Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate Behavior</em>' reference.
	 * @see #getAlternateBehavior()
	 * @generated
	 */
	void setAlternateBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Runtime Information</b></em>' reference list.
	 * The list contents are of type {@link dercs.structure.runtime.LocalVariableRuntimeInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of RuntimeInformations related to all local variables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runtime Information</em>' reference list.
	 * @see dercs.behavior.BehaviorPackage#getBehavior_RuntimeInformation()
	 * @model
	 * @generated
	 */
	EList<LocalVariableRuntimeInformation> getRuntimeInformation();

	// MANUALLY ADDED

	/**
	 * Indicate if the behavior represents a branch, i.e. an if.
	 * @return TRUE if the behavior has a enter condition and no exit condition.
	 * @generated NOT
	 */
	default boolean isBranch() {
		return (this.getEnterCondition() != null) && (!this.getEnterCondition().equals(""))
				&& ((this.getExitCondition() == null) || (this.getExitCondition().equals("")));
	}

	/**
	 * Indicate if the behavior represents an unbound loop, i.e. a while.
	 * @return TRUE if the behavior has a exit condition and no fixed number of repetitions.
	 * @generated NOT
	 */
	default boolean isUnboundLoop() {
		return (this.getExitCondition() != null) && (!this.getExitCondition().equals(""))
				&& (this.getNumberOfRepetitions() == 0);
	}

	/**
	 * Indicate if the behavior represents a bound loop, i.e. a for instruction.
	 * @return TRUE if the behavior has a fixed number of repetitions and no exit condition.
	 * @generated NOT
	 */
	default boolean isBoundLoop() {
		return (this.getNumberOfRepetitions() > 0)
				&& ((this.getExitCondition() == null) || (this.getExitCondition().equals("")));
	}

	/**
	 * Indicate if the behavior represents a loop.
	 * @return TRUE if the behavior is a loop, FALSE otherwise.
	 * @generated NOT
	 */
	default boolean isLoop() {
		return (this.getNumberOfRepetitions() > 0)
				|| ((this.getExitCondition() != null) && (!this.getExitCondition().equals("")));
	}

	/**
	 * Indicate if the behavior has an alternative behavior that is executed in
	 * the case of the enter condition is false.
	 * @return TRUE if there is an alternative behavior, FALSE otherwise.
	 * @generated NOT
	 */
	default boolean hasAlternativeBehavior() {
		return this.getAlternateBehavior() != null;
	}

	/**
	 * Check if an behavioral element exists in the context of the behavior.
	 * The behavioral element is searched recursively inside the child behaviors.  
	 * @param be The behavioral element to be found.
	 * @return TRUE if the element could be found, FALSE otherwise.
	 * @generated NOT
	 */
	default boolean behavioralElementExists(BehavioralElement be) {
		for (BehavioralElement element : this.getBehavioralElements()) {
			if (element == be) {
				return true;
			} else if (element instanceof Behavior) {
				if (((Behavior) element).behavioralElementExists(be)) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * Retrieve the current runtime value associated with a local variable.
	 * @param varName name of the local variable
	 * @return The current value associated to the specified local variable.
	 * If the variable's name is not found, this function return null.
	 * @generated NOT
	 */
	default LocalVariableRuntimeInformation getRuntimeInformation(String varName) {
		return this.getRuntimeInformation().stream().filter(info -> info.getLocalVariable().getName().equals(varName))
				.findFirst().orElse(null);
	}

	/**
	 * Creates a list of LocalVariableRuntimeInformation objects associates to this object.
	 * This will help tools such as the UML model simulators. 
	 * @generated NOT
	 */
	default void createRuntimeInformationForLocalVariables() {
		for (LocalVariable local : this.getLocalVariables()) {
			LocalVariableRuntimeInformation info = RuntimeFactory.eINSTANCE.createLocalVariableRuntimeInformation();
			info.setLocalVariable(local);
			info.setValue("");
			this.getRuntimeInformation().add(info);
		}
	}

	/**
	 * Change the current runtime value for a local variable. 
	 * @param varName the name of the local variable whose value must change.
	 * @param value the new value
	 * @generated NOT
	 */
	default void setVariableValue(String varName, String value) {
		LocalVariableRuntimeInformation info = getRuntimeInformation(varName);
		if (info != null) {
			info.setValue(value);
		}
	}

	/**
	 * Get a local variable from the variables list of the behavior.
	 * @param name Name of the variable in the list
	 * @return the local variable
	 * @generated NOT
	 */
	default LocalVariable getLocalVariable(String name) {
		return this.getLocalVariables().stream().filter(local -> local.getName().equals(name)).findFirst().orElse(null);
	}

	/**
	 * Add a local variable to the behavior.
	 * @param name Name of the variable
	 * @param dataType Primary data type of the behavior
	 * @return the added local variable
	 * @generated NOT
	 */
	default LocalVariable addLocalVariable(String name, DataType dataType) {
		LocalVariable result = BehaviorFactory.eINSTANCE.createLocalVariable();
		result.setName(name);
		result.setDataType(dataType);
		this.getLocalVariables().add(result);

		LocalVariableRuntimeInformation info = RuntimeFactory.eINSTANCE.createLocalVariableRuntimeInformation();
		info.setLocalVariable(result);
		info.setValue("");
		this.getRuntimeInformation().add(info);
		return result;
	}

} // Behavior
