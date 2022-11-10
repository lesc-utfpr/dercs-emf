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

import dercs.behavior.MessageSort;

import dercs.behavior.actions.ActionsPackage;
import dercs.behavior.actions.SendMessageAction;

import dercs.structure.Method;

import dercs.structure.runtime.RuntimeElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Message Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.impl.SendMessageActionImpl#getRelatedMethod <em>Related Method</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.SendMessageActionImpl#getFromObject <em>From Object</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.SendMessageActionImpl#getToObject <em>To Object</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.SendMessageActionImpl#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.SendMessageActionImpl#getMessageSort <em>Message Sort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendMessageActionImpl extends ActionWithOutputImpl implements SendMessageAction {
	/**
	 * The cached value of the '{@link #getRelatedMethod() <em>Related Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedMethod()
	 * @generated
	 * @ordered
	 */
	protected Method relatedMethod;

	/**
	 * The cached value of the '{@link #getFromObject() <em>From Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromObject()
	 * @generated
	 * @ordered
	 */
	protected RuntimeElement fromObject;

	/**
	 * The cached value of the '{@link #getToObject() <em>To Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToObject()
	 * @generated
	 * @ordered
	 */
	protected RuntimeElement toObject;

	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> parameterValues;

	/**
	 * The default value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSort MESSAGE_SORT_EDEFAULT = MessageSort.SYNCHCALL;

	/**
	 * The cached value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected MessageSort messageSort = MESSAGE_SORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMessageActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.SEND_MESSAGE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method getRelatedMethod() {
		if (relatedMethod != null && relatedMethod.eIsProxy()) {
			InternalEObject oldRelatedMethod = (InternalEObject) relatedMethod;
			relatedMethod = (Method) eResolveProxy(oldRelatedMethod);
			if (relatedMethod != oldRelatedMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.SEND_MESSAGE_ACTION__RELATED_METHOD, oldRelatedMethod, relatedMethod));
			}
		}
		return relatedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetRelatedMethod() {
		return relatedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedMethod(Method newRelatedMethod) {
		Method oldRelatedMethod = relatedMethod;
		relatedMethod = newRelatedMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.SEND_MESSAGE_ACTION__RELATED_METHOD,
					oldRelatedMethod, relatedMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeElement getFromObject() {
		if (fromObject != null && fromObject.eIsProxy()) {
			InternalEObject oldFromObject = (InternalEObject) fromObject;
			fromObject = (RuntimeElement) eResolveProxy(oldFromObject);
			if (fromObject != oldFromObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.SEND_MESSAGE_ACTION__FROM_OBJECT, oldFromObject, fromObject));
			}
		}
		return fromObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeElement basicGetFromObject() {
		return fromObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromObject(RuntimeElement newFromObject) {
		RuntimeElement oldFromObject = fromObject;
		fromObject = newFromObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.SEND_MESSAGE_ACTION__FROM_OBJECT,
					oldFromObject, fromObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeElement getToObject() {
		if (toObject != null && toObject.eIsProxy()) {
			InternalEObject oldToObject = (InternalEObject) toObject;
			toObject = (RuntimeElement) eResolveProxy(oldToObject);
			if (toObject != oldToObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.SEND_MESSAGE_ACTION__TO_OBJECT, oldToObject, toObject));
			}
		}
		return toObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeElement basicGetToObject() {
		return toObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToObject(RuntimeElement newToObject) {
		RuntimeElement oldToObject = toObject;
		toObject = newToObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.SEND_MESSAGE_ACTION__TO_OBJECT,
					oldToObject, toObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getParameterValues() {
		if (parameterValues == null) {
			parameterValues = new EDataTypeUniqueEList<Object>(Object.class, this,
					ActionsPackage.SEND_MESSAGE_ACTION__PARAMETER_VALUES);
		}
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageSort getMessageSort() {
		return messageSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageSort(MessageSort newMessageSort) {
		MessageSort oldMessageSort = messageSort;
		messageSort = newMessageSort == null ? MESSAGE_SORT_EDEFAULT : newMessageSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.SEND_MESSAGE_ACTION__MESSAGE_SORT,
					oldMessageSort, messageSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActionsPackage.SEND_MESSAGE_ACTION__RELATED_METHOD:
			if (resolve)
				return getRelatedMethod();
			return basicGetRelatedMethod();
		case ActionsPackage.SEND_MESSAGE_ACTION__FROM_OBJECT:
			if (resolve)
				return getFromObject();
			return basicGetFromObject();
		case ActionsPackage.SEND_MESSAGE_ACTION__TO_OBJECT:
			if (resolve)
				return getToObject();
			return basicGetToObject();
		case ActionsPackage.SEND_MESSAGE_ACTION__PARAMETER_VALUES:
			return getParameterValues();
		case ActionsPackage.SEND_MESSAGE_ACTION__MESSAGE_SORT:
			return getMessageSort();
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
		case ActionsPackage.SEND_MESSAGE_ACTION__RELATED_METHOD:
			setRelatedMethod((Method) newValue);
			return;
		case ActionsPackage.SEND_MESSAGE_ACTION__FROM_OBJECT:
			setFromObject((RuntimeElement) newValue);
			return;
		case ActionsPackage.SEND_MESSAGE_ACTION__TO_OBJECT:
			setToObject((RuntimeElement) newValue);
			return;
		case ActionsPackage.SEND_MESSAGE_ACTION__PARAMETER_VALUES:
			getParameterValues().clear();
			getParameterValues().addAll((Collection<? extends Object>) newValue);
			return;
		case ActionsPackage.SEND_MESSAGE_ACTION__MESSAGE_SORT:
			setMessageSort((MessageSort) newValue);
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
		case ActionsPackage.SEND_MESSAGE_ACTION__RELATED_METHOD:
			setRelatedMethod((Method) null);
			return;
		case ActionsPackage.SEND_MESSAGE_ACTION__FROM_OBJECT:
			setFromObject((RuntimeElement) null);
			return;
		case ActionsPackage.SEND_MESSAGE_ACTION__TO_OBJECT:
			setToObject((RuntimeElement) null);
			return;
		case ActionsPackage.SEND_MESSAGE_ACTION__PARAMETER_VALUES:
			getParameterValues().clear();
			return;
		case ActionsPackage.SEND_MESSAGE_ACTION__MESSAGE_SORT:
			setMessageSort(MESSAGE_SORT_EDEFAULT);
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
		case ActionsPackage.SEND_MESSAGE_ACTION__RELATED_METHOD:
			return relatedMethod != null;
		case ActionsPackage.SEND_MESSAGE_ACTION__FROM_OBJECT:
			return fromObject != null;
		case ActionsPackage.SEND_MESSAGE_ACTION__TO_OBJECT:
			return toObject != null;
		case ActionsPackage.SEND_MESSAGE_ACTION__PARAMETER_VALUES:
			return parameterValues != null && !parameterValues.isEmpty();
		case ActionsPackage.SEND_MESSAGE_ACTION__MESSAGE_SORT:
			return messageSort != MESSAGE_SORT_EDEFAULT;
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
		result.append(" (parameterValues: ");
		result.append(parameterValues);
		result.append(", messageSort: ");
		result.append(messageSort);
		result.append(')');
		return result.toString();
	}

} //SendMessageActionImpl
