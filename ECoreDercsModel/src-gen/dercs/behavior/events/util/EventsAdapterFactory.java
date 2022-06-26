/**
 */
package dercs.behavior.events.util;

import dercs.behavior.events.*;

import dercs.structure.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dercs.behavior.events.EventsPackage
 * @generated
 */
public class EventsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EventsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventsSwitch<Adapter> modelSwitch = new EventsSwitch<Adapter>() {
		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseMessageEvent(MessageEvent object) {
			return createMessageEventAdapter();
		}

		@Override
		public Adapter caseSendMessageEvent(SendMessageEvent object) {
			return createSendMessageEventAdapter();
		}

		@Override
		public Adapter caseReceiveMessageEvent(ReceiveMessageEvent object) {
			return createReceiveMessageEventAdapter();
		}

		@Override
		public Adapter caseStateEvent(StateEvent object) {
			return createStateEventAdapter();
		}

		@Override
		public Adapter caseEnterStateEvent(EnterStateEvent object) {
			return createEnterStateEventAdapter();
		}

		@Override
		public Adapter caseExitStateEvent(ExitStateEvent object) {
			return createExitStateEventAdapter();
		}

		@Override
		public Adapter caseStateTransitionEvent(StateTransitionEvent object) {
			return createStateTransitionEventAdapter();
		}

		@Override
		public Adapter caseInterruptionEvent(InterruptionEvent object) {
			return createInterruptionEventAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.MessageEvent
	 * @generated
	 */
	public Adapter createMessageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.SendMessageEvent <em>Send Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.SendMessageEvent
	 * @generated
	 */
	public Adapter createSendMessageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.ReceiveMessageEvent <em>Receive Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.ReceiveMessageEvent
	 * @generated
	 */
	public Adapter createReceiveMessageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.StateEvent <em>State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.StateEvent
	 * @generated
	 */
	public Adapter createStateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.EnterStateEvent <em>Enter State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.EnterStateEvent
	 * @generated
	 */
	public Adapter createEnterStateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.ExitStateEvent <em>Exit State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.ExitStateEvent
	 * @generated
	 */
	public Adapter createExitStateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.StateTransitionEvent <em>State Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.StateTransitionEvent
	 * @generated
	 */
	public Adapter createStateTransitionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.events.InterruptionEvent <em>Interruption Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.events.InterruptionEvent
	 * @generated
	 */
	public Adapter createInterruptionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EventsAdapterFactory
