/**
 */
package dercs.behavior.events;

import dercs.behavior.Behavior;

import dercs.structure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an event that can happen during DERTS execution, such as hardware
 * interruptions, state transitions, sending/receiving messages, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.events.Event#getTriggeredBehaviors <em>Triggered Behaviors</em>}</li>
 *   <li>{@link dercs.behavior.events.Event#getBehaviorTriggerKind <em>Behavior Trigger Kind</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.events.EventsPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * The list contents are of type {@link dercs.behavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behaviors which are triggered by this event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triggered Behaviors</em>' reference list.
	 * @see dercs.behavior.events.EventsPackage#getEvent_TriggeredBehaviors()
	 * @model
	 * @generated
	 */
	EList<Behavior> getTriggeredBehaviors();

	/**
	 * Returns the value of the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link dercs.behavior.events.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The way in which the behaviors should be triggered
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior Trigger Kind</em>' attribute.
	 * @see dercs.behavior.events.TriggerKind
	 * @see #setBehaviorTriggerKind(TriggerKind)
	 * @see dercs.behavior.events.EventsPackage#getEvent_BehaviorTriggerKind()
	 * @model
	 * @generated
	 */
	TriggerKind getBehaviorTriggerKind();

	/**
	 * Sets the value of the '{@link dercs.behavior.events.Event#getBehaviorTriggerKind <em>Behavior Trigger Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Trigger Kind</em>' attribute.
	 * @see dercs.behavior.events.TriggerKind
	 * @see #getBehaviorTriggerKind()
	 * @generated
	 */
	void setBehaviorTriggerKind(TriggerKind value);

} // Event
