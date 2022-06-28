/**
 */
package dercs.behavior.events;

import dercs.behavior.actions.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a message-related event.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.events.MessageEvent#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.events.EventsPackage#getMessageEvent()
 * @model abstract="true"
 * @generated
 */
public interface MessageEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action that caused this event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see dercs.behavior.events.EventsPackage#getMessageEvent_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link dercs.behavior.events.MessageEvent#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // MessageEvent
