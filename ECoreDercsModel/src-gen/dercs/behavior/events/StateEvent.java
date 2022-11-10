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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a state-related event. At the moment, there are three kinds of state events:
 * <br> 1. Exit state event;
 * <br> 2. State transition event;
 * <br> 3. Enter state event;
 * <br> The order of occurrence of these events is the same that appears above,
 * i.e. first an exit event happens, than a transition event, and finally an 
 * enter event.
 * <!-- end-model-doc -->
 *
 *
 * @see dercs.behavior.events.EventsPackage#getStateEvent()
 * @model abstract="true"
 * @generated
 */
public interface StateEvent extends Event {
} // StateEvent
