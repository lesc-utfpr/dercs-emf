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
package dercs.behavior.events.impl;

import dercs.behavior.Behavior;

import dercs.behavior.events.Event;
import dercs.behavior.events.EventsPackage;
import dercs.behavior.events.TriggerKind;

import dercs.structure.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.events.impl.EventImpl#getTriggeredBehaviors <em>Triggered Behaviors</em>}</li>
 *   <li>{@link dercs.behavior.events.impl.EventImpl#getBehaviorTriggerKind <em>Behavior Trigger Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventImpl extends NamedElementImpl implements Event {
	/**
	 * The cached value of the '{@link #getTriggeredBehaviors() <em>Triggered Behaviors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> triggeredBehaviors;

	/**
	 * The default value of the '{@link #getBehaviorTriggerKind() <em>Behavior Trigger Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorTriggerKind()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerKind BEHAVIOR_TRIGGER_KIND_EDEFAULT = TriggerKind.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getBehaviorTriggerKind() <em>Behavior Trigger Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorTriggerKind()
	 * @generated
	 * @ordered
	 */
	protected TriggerKind behaviorTriggerKind = BEHAVIOR_TRIGGER_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getTriggeredBehaviors() {
		if (triggeredBehaviors == null) {
			triggeredBehaviors = new EObjectResolvingEList<Behavior>(Behavior.class, this,
					EventsPackage.EVENT__TRIGGERED_BEHAVIORS);
		}
		return triggeredBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerKind getBehaviorTriggerKind() {
		return behaviorTriggerKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehaviorTriggerKind(TriggerKind newBehaviorTriggerKind) {
		TriggerKind oldBehaviorTriggerKind = behaviorTriggerKind;
		behaviorTriggerKind = newBehaviorTriggerKind == null ? BEHAVIOR_TRIGGER_KIND_EDEFAULT : newBehaviorTriggerKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT__BEHAVIOR_TRIGGER_KIND,
					oldBehaviorTriggerKind, behaviorTriggerKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EventsPackage.EVENT__TRIGGERED_BEHAVIORS:
			return getTriggeredBehaviors();
		case EventsPackage.EVENT__BEHAVIOR_TRIGGER_KIND:
			return getBehaviorTriggerKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EventsPackage.EVENT__TRIGGERED_BEHAVIORS:
			getTriggeredBehaviors().clear();
			getTriggeredBehaviors().addAll((Collection<? extends Behavior>) newValue);
			return;
		case EventsPackage.EVENT__BEHAVIOR_TRIGGER_KIND:
			setBehaviorTriggerKind((TriggerKind) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EventsPackage.EVENT__TRIGGERED_BEHAVIORS:
			getTriggeredBehaviors().clear();
			return;
		case EventsPackage.EVENT__BEHAVIOR_TRIGGER_KIND:
			setBehaviorTriggerKind(BEHAVIOR_TRIGGER_KIND_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EventsPackage.EVENT__TRIGGERED_BEHAVIORS:
			return triggeredBehaviors != null && !triggeredBehaviors.isEmpty();
		case EventsPackage.EVENT__BEHAVIOR_TRIGGER_KIND:
			return behaviorTriggerKind != BEHAVIOR_TRIGGER_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (behaviorTriggerKind: ");
		result.append(behaviorTriggerKind);
		result.append(')');
		return result.toString();
	}

} //EventImpl
