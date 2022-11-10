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

import dercs.behavior.actions.ActionsPackage;
import dercs.behavior.actions.ObjectAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.impl.ObjectActionImpl#getRelatedObject <em>Related Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObjectActionImpl extends ActionWithOutputImpl implements ObjectAction {
	/**
	 * The cached value of the '{@link #getRelatedObject() <em>Related Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObject()
	 * @generated
	 * @ordered
	 */
	protected dercs.structure.runtime.Object relatedObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.OBJECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.runtime.Object getRelatedObject() {
		if (relatedObject != null && relatedObject.eIsProxy()) {
			InternalEObject oldRelatedObject = (InternalEObject) relatedObject;
			relatedObject = (dercs.structure.runtime.Object) eResolveProxy(oldRelatedObject);
			if (relatedObject != oldRelatedObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.OBJECT_ACTION__RELATED_OBJECT, oldRelatedObject, relatedObject));
			}
		}
		return relatedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dercs.structure.runtime.Object basicGetRelatedObject() {
		return relatedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedObject(dercs.structure.runtime.Object newRelatedObject) {
		dercs.structure.runtime.Object oldRelatedObject = relatedObject;
		relatedObject = newRelatedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.OBJECT_ACTION__RELATED_OBJECT,
					oldRelatedObject, relatedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActionsPackage.OBJECT_ACTION__RELATED_OBJECT:
			if (resolve)
				return getRelatedObject();
			return basicGetRelatedObject();
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
		case ActionsPackage.OBJECT_ACTION__RELATED_OBJECT:
			setRelatedObject((dercs.structure.runtime.Object) newValue);
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
		case ActionsPackage.OBJECT_ACTION__RELATED_OBJECT:
			setRelatedObject((dercs.structure.runtime.Object) null);
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
		case ActionsPackage.OBJECT_ACTION__RELATED_OBJECT:
			return relatedObject != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectActionImpl
