/**
 */
package dercs.behavior.events.util;

import dercs.behavior.events.*;

import dercs.structure.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dercs.behavior.events.EventsPackage
 * @generated
 */
public class EventsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsSwitch() {
		if (modelPackage == null) {
			modelPackage = EventsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EventsPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseNamedElement(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EventsPackage.MESSAGE_EVENT: {
			MessageEvent messageEvent = (MessageEvent) theEObject;
			T result = caseMessageEvent(messageEvent);
			if (result == null)
				result = caseEvent(messageEvent);
			if (result == null)
				result = caseNamedElement(messageEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EventsPackage.SEND_MESSAGE_EVENT: {
			SendMessageEvent sendMessageEvent = (SendMessageEvent) theEObject;
			T result = caseSendMessageEvent(sendMessageEvent);
			if (result == null)
				result = caseMessageEvent(sendMessageEvent);
			if (result == null)
				result = caseEvent(sendMessageEvent);
			if (result == null)
				result = caseNamedElement(sendMessageEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EventsPackage.RECEIVE_MESSAGE_EVENT: {
			ReceiveMessageEvent receiveMessageEvent = (ReceiveMessageEvent) theEObject;
			T result = caseReceiveMessageEvent(receiveMessageEvent);
			if (result == null)
				result = caseMessageEvent(receiveMessageEvent);
			if (result == null)
				result = caseEvent(receiveMessageEvent);
			if (result == null)
				result = caseNamedElement(receiveMessageEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EventsPackage.STATE_EVENT: {
			StateEvent stateEvent = (StateEvent) theEObject;
			T result = caseStateEvent(stateEvent);
			if (result == null)
				result = caseEvent(stateEvent);
			if (result == null)
				result = caseNamedElement(stateEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EventsPackage.ENTER_STATE_EVENT: {
			EnterStateEvent enterStateEvent = (EnterStateEvent) theEObject;
			T result = caseEnterStateEvent(enterStateEvent);
			if (result == null)
				result = caseStateEvent(enterStateEvent);
			if (result == null)
				result = caseEvent(enterStateEvent);
			if (result == null)
				result = caseNamedElement(enterStateEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EventsPackage.EXIT_STATE_EVENT: {
			ExitStateEvent exitStateEvent = (ExitStateEvent) theEObject;
			T result = caseExitStateEvent(exitStateEvent);
			if (result == null)
				result = caseStateEvent(exitStateEvent);
			if (result == null)
				result = caseEvent(exitStateEvent);
			if (result == null)
				result = caseNamedElement(exitStateEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EventsPackage.STATE_TRANSITION_EVENT: {
			StateTransitionEvent stateTransitionEvent = (StateTransitionEvent) theEObject;
			T result = caseStateTransitionEvent(stateTransitionEvent);
			if (result == null)
				result = caseStateEvent(stateTransitionEvent);
			if (result == null)
				result = caseEvent(stateTransitionEvent);
			if (result == null)
				result = caseNamedElement(stateTransitionEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EventsPackage.INTERRUPTION_EVENT: {
			InterruptionEvent interruptionEvent = (InterruptionEvent) theEObject;
			T result = caseInterruptionEvent(interruptionEvent);
			if (result == null)
				result = caseEvent(interruptionEvent);
			if (result == null)
				result = caseNamedElement(interruptionEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEvent(MessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendMessageEvent(SendMessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveMessageEvent(ReceiveMessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateEvent(StateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enter State Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enter State Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterStateEvent(EnterStateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit State Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit State Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitStateEvent(ExitStateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Transition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Transition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateTransitionEvent(StateTransitionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interruption Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruption Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptionEvent(InterruptionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EventsSwitch
