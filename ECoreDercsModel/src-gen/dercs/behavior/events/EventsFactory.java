/***************************************************************************************
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Copyright Contributors to the DERCS-EMF Project.
 * 
 ****************************************************************************************/
package dercs.behavior.events;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dercs.behavior.events.EventsPackage
 * @generated
 */
public interface EventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsFactory eINSTANCE = dercs.behavior.events.impl.EventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Send Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Message Event</em>'.
	 * @generated
	 */
	SendMessageEvent createSendMessageEvent();

	/**
	 * Returns a new object of class '<em>Receive Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Message Event</em>'.
	 * @generated
	 */
	ReceiveMessageEvent createReceiveMessageEvent();

	/**
	 * Returns a new object of class '<em>Enter State Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enter State Event</em>'.
	 * @generated
	 */
	EnterStateEvent createEnterStateEvent();

	/**
	 * Returns a new object of class '<em>Exit State Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit State Event</em>'.
	 * @generated
	 */
	ExitStateEvent createExitStateEvent();

	/**
	 * Returns a new object of class '<em>State Transition Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Transition Event</em>'.
	 * @generated
	 */
	StateTransitionEvent createStateTransitionEvent();

	/**
	 * Returns a new object of class '<em>Interruption Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interruption Event</em>'.
	 * @generated
	 */
	InterruptionEvent createInterruptionEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EventsPackage getEventsPackage();

} //EventsFactory
