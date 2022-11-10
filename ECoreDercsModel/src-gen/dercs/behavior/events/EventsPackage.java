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

import dercs.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dercs.behavior.events.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://utfpr.edu.br/dercs/behavior/events";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsPackage eINSTANCE = dercs.behavior.events.impl.EventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.EventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = StructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TAGS = StructurePackage.NAMED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TRIGGERED_BEHAVIORS = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BEHAVIOR_TRIGGER_KIND = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = StructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.MessageEventImpl <em>Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.MessageEventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__TAGS = EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__TRIGGERED_BEHAVIORS = EVENT__TRIGGERED_BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__BEHAVIOR_TRIGGER_KIND = EVENT__BEHAVIOR_TRIGGER_KIND;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__ACTION = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.SendMessageEventImpl <em>Send Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.SendMessageEventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getSendMessageEvent()
	 * @generated
	 */
	int SEND_MESSAGE_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_EVENT__NAME = MESSAGE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_EVENT__TAGS = MESSAGE_EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_EVENT__TRIGGERED_BEHAVIORS = MESSAGE_EVENT__TRIGGERED_BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_EVENT__BEHAVIOR_TRIGGER_KIND = MESSAGE_EVENT__BEHAVIOR_TRIGGER_KIND;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_EVENT__ACTION = MESSAGE_EVENT__ACTION;

	/**
	 * The number of structural features of the '<em>Send Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.ReceiveMessageEventImpl <em>Receive Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.ReceiveMessageEventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getReceiveMessageEvent()
	 * @generated
	 */
	int RECEIVE_MESSAGE_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_EVENT__NAME = MESSAGE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_EVENT__TAGS = MESSAGE_EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_EVENT__TRIGGERED_BEHAVIORS = MESSAGE_EVENT__TRIGGERED_BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_EVENT__BEHAVIOR_TRIGGER_KIND = MESSAGE_EVENT__BEHAVIOR_TRIGGER_KIND;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_EVENT__ACTION = MESSAGE_EVENT__ACTION;

	/**
	 * The number of structural features of the '<em>Receive Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receive Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.StateEventImpl <em>State Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.StateEventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getStateEvent()
	 * @generated
	 */
	int STATE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__TAGS = EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__TRIGGERED_BEHAVIORS = EVENT__TRIGGERED_BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__BEHAVIOR_TRIGGER_KIND = EVENT__BEHAVIOR_TRIGGER_KIND;

	/**
	 * The number of structural features of the '<em>State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.EnterStateEventImpl <em>Enter State Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.EnterStateEventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getEnterStateEvent()
	 * @generated
	 */
	int ENTER_STATE_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_STATE_EVENT__NAME = STATE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_STATE_EVENT__TAGS = STATE_EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_STATE_EVENT__TRIGGERED_BEHAVIORS = STATE_EVENT__TRIGGERED_BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_STATE_EVENT__BEHAVIOR_TRIGGER_KIND = STATE_EVENT__BEHAVIOR_TRIGGER_KIND;

	/**
	 * The number of structural features of the '<em>Enter State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_STATE_EVENT_FEATURE_COUNT = STATE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enter State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_STATE_EVENT_OPERATION_COUNT = STATE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.ExitStateEventImpl <em>Exit State Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.ExitStateEventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getExitStateEvent()
	 * @generated
	 */
	int EXIT_STATE_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATE_EVENT__NAME = STATE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATE_EVENT__TAGS = STATE_EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATE_EVENT__TRIGGERED_BEHAVIORS = STATE_EVENT__TRIGGERED_BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATE_EVENT__BEHAVIOR_TRIGGER_KIND = STATE_EVENT__BEHAVIOR_TRIGGER_KIND;

	/**
	 * The number of structural features of the '<em>Exit State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATE_EVENT_FEATURE_COUNT = STATE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATE_EVENT_OPERATION_COUNT = STATE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.StateTransitionEventImpl <em>State Transition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.StateTransitionEventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getStateTransitionEvent()
	 * @generated
	 */
	int STATE_TRANSITION_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_EVENT__NAME = STATE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_EVENT__TAGS = STATE_EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_EVENT__TRIGGERED_BEHAVIORS = STATE_EVENT__TRIGGERED_BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_EVENT__BEHAVIOR_TRIGGER_KIND = STATE_EVENT__BEHAVIOR_TRIGGER_KIND;

	/**
	 * The number of structural features of the '<em>State Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_EVENT_FEATURE_COUNT = STATE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_EVENT_OPERATION_COUNT = STATE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.impl.InterruptionEventImpl <em>Interruption Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.impl.InterruptionEventImpl
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getInterruptionEvent()
	 * @generated
	 */
	int INTERRUPTION_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTION_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTION_EVENT__TAGS = EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Triggered Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTION_EVENT__TRIGGERED_BEHAVIORS = EVENT__TRIGGERED_BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Behavior Trigger Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTION_EVENT__BEHAVIOR_TRIGGER_KIND = EVENT__BEHAVIOR_TRIGGER_KIND;

	/**
	 * The number of structural features of the '<em>Interruption Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTION_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interruption Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTION_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.events.TriggerKind <em>Trigger Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.events.TriggerKind
	 * @see dercs.behavior.events.impl.EventsPackageImpl#getTriggerKind()
	 * @generated
	 */
	int TRIGGER_KIND = 9;

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see dercs.behavior.events.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link dercs.behavior.events.Event#getTriggeredBehaviors <em>Triggered Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggered Behaviors</em>'.
	 * @see dercs.behavior.events.Event#getTriggeredBehaviors()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_TriggeredBehaviors();

	/**
	 * Returns the meta object for the attribute '{@link dercs.behavior.events.Event#getBehaviorTriggerKind <em>Behavior Trigger Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Trigger Kind</em>'.
	 * @see dercs.behavior.events.Event#getBehaviorTriggerKind()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_BehaviorTriggerKind();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event</em>'.
	 * @see dercs.behavior.events.MessageEvent
	 * @generated
	 */
	EClass getMessageEvent();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.events.MessageEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see dercs.behavior.events.MessageEvent#getAction()
	 * @see #getMessageEvent()
	 * @generated
	 */
	EReference getMessageEvent_Action();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.SendMessageEvent <em>Send Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message Event</em>'.
	 * @see dercs.behavior.events.SendMessageEvent
	 * @generated
	 */
	EClass getSendMessageEvent();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.ReceiveMessageEvent <em>Receive Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Message Event</em>'.
	 * @see dercs.behavior.events.ReceiveMessageEvent
	 * @generated
	 */
	EClass getReceiveMessageEvent();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.StateEvent <em>State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Event</em>'.
	 * @see dercs.behavior.events.StateEvent
	 * @generated
	 */
	EClass getStateEvent();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.EnterStateEvent <em>Enter State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enter State Event</em>'.
	 * @see dercs.behavior.events.EnterStateEvent
	 * @generated
	 */
	EClass getEnterStateEvent();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.ExitStateEvent <em>Exit State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit State Event</em>'.
	 * @see dercs.behavior.events.ExitStateEvent
	 * @generated
	 */
	EClass getExitStateEvent();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.StateTransitionEvent <em>State Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition Event</em>'.
	 * @see dercs.behavior.events.StateTransitionEvent
	 * @generated
	 */
	EClass getStateTransitionEvent();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.events.InterruptionEvent <em>Interruption Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interruption Event</em>'.
	 * @see dercs.behavior.events.InterruptionEvent
	 * @generated
	 */
	EClass getInterruptionEvent();

	/**
	 * Returns the meta object for enum '{@link dercs.behavior.events.TriggerKind <em>Trigger Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Kind</em>'.
	 * @see dercs.behavior.events.TriggerKind
	 * @generated
	 */
	EEnum getTriggerKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventsFactory getEventsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.EventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Triggered Behaviors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TRIGGERED_BEHAVIORS = eINSTANCE.getEvent_TriggeredBehaviors();

		/**
		 * The meta object literal for the '<em><b>Behavior Trigger Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__BEHAVIOR_TRIGGER_KIND = eINSTANCE.getEvent_BehaviorTriggerKind();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.MessageEventImpl <em>Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.MessageEventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getMessageEvent()
		 * @generated
		 */
		EClass MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_EVENT__ACTION = eINSTANCE.getMessageEvent_Action();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.SendMessageEventImpl <em>Send Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.SendMessageEventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getSendMessageEvent()
		 * @generated
		 */
		EClass SEND_MESSAGE_EVENT = eINSTANCE.getSendMessageEvent();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.ReceiveMessageEventImpl <em>Receive Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.ReceiveMessageEventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getReceiveMessageEvent()
		 * @generated
		 */
		EClass RECEIVE_MESSAGE_EVENT = eINSTANCE.getReceiveMessageEvent();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.StateEventImpl <em>State Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.StateEventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getStateEvent()
		 * @generated
		 */
		EClass STATE_EVENT = eINSTANCE.getStateEvent();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.EnterStateEventImpl <em>Enter State Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.EnterStateEventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getEnterStateEvent()
		 * @generated
		 */
		EClass ENTER_STATE_EVENT = eINSTANCE.getEnterStateEvent();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.ExitStateEventImpl <em>Exit State Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.ExitStateEventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getExitStateEvent()
		 * @generated
		 */
		EClass EXIT_STATE_EVENT = eINSTANCE.getExitStateEvent();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.StateTransitionEventImpl <em>State Transition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.StateTransitionEventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getStateTransitionEvent()
		 * @generated
		 */
		EClass STATE_TRANSITION_EVENT = eINSTANCE.getStateTransitionEvent();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.impl.InterruptionEventImpl <em>Interruption Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.impl.InterruptionEventImpl
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getInterruptionEvent()
		 * @generated
		 */
		EClass INTERRUPTION_EVENT = eINSTANCE.getInterruptionEvent();

		/**
		 * The meta object literal for the '{@link dercs.behavior.events.TriggerKind <em>Trigger Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.events.TriggerKind
		 * @see dercs.behavior.events.impl.EventsPackageImpl#getTriggerKind()
		 * @generated
		 */
		EEnum TRIGGER_KIND = eINSTANCE.getTriggerKind();

	}

} //EventsPackage
