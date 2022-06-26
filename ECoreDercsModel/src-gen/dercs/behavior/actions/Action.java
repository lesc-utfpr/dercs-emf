/**
 */
package dercs.behavior.actions;

import dercs.behavior.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the actions performed in sequence within the context of a behavior.
 * An action should be atomic, i.e. after the begining of its execution if cannot
 * be interrupted until the end of execution. For example, if an action has an
 * execution time of 10 ms the node which executes the behavior cannot pass the
 * execution for another behavior before the end of action's execution.
 * <!-- end-model-doc -->
 *
 *
 * @see dercs.behavior.actions.ActionsPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends BehavioralElement {
} // Action
