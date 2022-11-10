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
package dercs.behavior.actions.impl;

import dercs.behavior.LocalVariable;

import dercs.behavior.actions.ActionWithOutput;
import dercs.behavior.actions.ActionsPackage;
import dercs.behavior.actions.AssignmentAction;

import dercs.structure.Attribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.impl.AssignmentActionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.AssignmentActionImpl#getDestinationVariable <em>Destination Variable</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.AssignmentActionImpl#getDestinationAttribute <em>Destination Attribute</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.AssignmentActionImpl#getDestinationObject <em>Destination Object</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.AssignmentActionImpl#getDestinationArrayElement <em>Destination Array Element</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.AssignmentActionImpl#getResultOfAction <em>Result Of Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentActionImpl extends ActionImpl implements AssignmentAction {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestinationVariable() <em>Destination Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable destinationVariable;

	/**
	 * The cached value of the '{@link #getDestinationAttribute() <em>Destination Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute destinationAttribute;

	/**
	 * The cached value of the '{@link #getDestinationObject() <em>Destination Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationObject()
	 * @generated
	 * @ordered
	 */
	protected dercs.structure.runtime.Object destinationObject;

	/**
	 * The default value of the '{@link #getDestinationArrayElement() <em>Destination Array Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationArrayElement()
	 * @generated
	 * @ordered
	 */
	protected static final int DESTINATION_ARRAY_ELEMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDestinationArrayElement() <em>Destination Array Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationArrayElement()
	 * @generated
	 * @ordered
	 */
	protected int destinationArrayElement = DESTINATION_ARRAY_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultOfAction() <em>Result Of Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOfAction()
	 * @generated
	 * @ordered
	 */
	protected ActionWithOutput resultOfAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ASSIGNMENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ASSIGNMENT_ACTION__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalVariable getDestinationVariable() {
		if (destinationVariable != null && destinationVariable.eIsProxy()) {
			InternalEObject oldDestinationVariable = (InternalEObject) destinationVariable;
			destinationVariable = (LocalVariable) eResolveProxy(oldDestinationVariable);
			if (destinationVariable != oldDestinationVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_VARIABLE, oldDestinationVariable,
							destinationVariable));
			}
		}
		return destinationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetDestinationVariable() {
		return destinationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationVariable(LocalVariable newDestinationVariable) {
		LocalVariable oldDestinationVariable = destinationVariable;
		destinationVariable = newDestinationVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_VARIABLE, oldDestinationVariable,
					destinationVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getDestinationAttribute() {
		if (destinationAttribute != null && destinationAttribute.eIsProxy()) {
			InternalEObject oldDestinationAttribute = (InternalEObject) destinationAttribute;
			destinationAttribute = (Attribute) eResolveProxy(oldDestinationAttribute);
			if (destinationAttribute != oldDestinationAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE, oldDestinationAttribute,
							destinationAttribute));
			}
		}
		return destinationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetDestinationAttribute() {
		return destinationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationAttribute(Attribute newDestinationAttribute) {
		Attribute oldDestinationAttribute = destinationAttribute;
		destinationAttribute = newDestinationAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE, oldDestinationAttribute,
					destinationAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.runtime.Object getDestinationObject() {
		if (destinationObject != null && destinationObject.eIsProxy()) {
			InternalEObject oldDestinationObject = (InternalEObject) destinationObject;
			destinationObject = (dercs.structure.runtime.Object) eResolveProxy(oldDestinationObject);
			if (destinationObject != oldDestinationObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_OBJECT, oldDestinationObject,
							destinationObject));
			}
		}
		return destinationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dercs.structure.runtime.Object basicGetDestinationObject() {
		return destinationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationObject(dercs.structure.runtime.Object newDestinationObject) {
		dercs.structure.runtime.Object oldDestinationObject = destinationObject;
		destinationObject = newDestinationObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_OBJECT,
					oldDestinationObject, destinationObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDestinationArrayElement() {
		return destinationArrayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationArrayElement(int newDestinationArrayElement) {
		int oldDestinationArrayElement = destinationArrayElement;
		destinationArrayElement = newDestinationArrayElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT, oldDestinationArrayElement,
					destinationArrayElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionWithOutput getResultOfAction() {
		if (resultOfAction != null && resultOfAction.eIsProxy()) {
			InternalEObject oldResultOfAction = (InternalEObject) resultOfAction;
			resultOfAction = (ActionWithOutput) eResolveProxy(oldResultOfAction);
			if (resultOfAction != oldResultOfAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.ASSIGNMENT_ACTION__RESULT_OF_ACTION, oldResultOfAction, resultOfAction));
			}
		}
		return resultOfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionWithOutput basicGetResultOfAction() {
		return resultOfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultOfAction(ActionWithOutput newResultOfAction) {
		ActionWithOutput oldResultOfAction = resultOfAction;
		resultOfAction = newResultOfAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ASSIGNMENT_ACTION__RESULT_OF_ACTION,
					oldResultOfAction, resultOfAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActionsPackage.ASSIGNMENT_ACTION__VALUE:
			return getValue();
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_VARIABLE:
			if (resolve)
				return getDestinationVariable();
			return basicGetDestinationVariable();
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE:
			if (resolve)
				return getDestinationAttribute();
			return basicGetDestinationAttribute();
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_OBJECT:
			if (resolve)
				return getDestinationObject();
			return basicGetDestinationObject();
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT:
			return getDestinationArrayElement();
		case ActionsPackage.ASSIGNMENT_ACTION__RESULT_OF_ACTION:
			if (resolve)
				return getResultOfAction();
			return basicGetResultOfAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ActionsPackage.ASSIGNMENT_ACTION__VALUE:
			setValue((String) newValue);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_VARIABLE:
			setDestinationVariable((LocalVariable) newValue);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE:
			setDestinationAttribute((Attribute) newValue);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_OBJECT:
			setDestinationObject((dercs.structure.runtime.Object) newValue);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT:
			setDestinationArrayElement((Integer) newValue);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__RESULT_OF_ACTION:
			setResultOfAction((ActionWithOutput) newValue);
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
		case ActionsPackage.ASSIGNMENT_ACTION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_VARIABLE:
			setDestinationVariable((LocalVariable) null);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE:
			setDestinationAttribute((Attribute) null);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_OBJECT:
			setDestinationObject((dercs.structure.runtime.Object) null);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT:
			setDestinationArrayElement(DESTINATION_ARRAY_ELEMENT_EDEFAULT);
			return;
		case ActionsPackage.ASSIGNMENT_ACTION__RESULT_OF_ACTION:
			setResultOfAction((ActionWithOutput) null);
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
		case ActionsPackage.ASSIGNMENT_ACTION__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_VARIABLE:
			return destinationVariable != null;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE:
			return destinationAttribute != null;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_OBJECT:
			return destinationObject != null;
		case ActionsPackage.ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT:
			return destinationArrayElement != DESTINATION_ARRAY_ELEMENT_EDEFAULT;
		case ActionsPackage.ASSIGNMENT_ACTION__RESULT_OF_ACTION:
			return resultOfAction != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", destinationArrayElement: ");
		result.append(destinationArrayElement);
		result.append(')');
		return result.toString();
	}

} //AssignmentActionImpl
