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

import dercs.behavior.actions.ActionsPackage;
import dercs.behavior.actions.ArrayAction;

import dercs.structure.Attribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.impl.ArrayActionImpl#getArrayVariable <em>Array Variable</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.ArrayActionImpl#getArrayElement <em>Array Element</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.ArrayActionImpl#getArrayAttribute <em>Array Attribute</em>}</li>
 *   <li>{@link dercs.behavior.actions.impl.ArrayActionImpl#getArrayObject <em>Array Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArrayActionImpl extends ActionWithOutputImpl implements ArrayAction {
	/**
	 * The cached value of the '{@link #getArrayVariable() <em>Array Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable arrayVariable;

	/**
	 * The default value of the '{@link #getArrayElement() <em>Array Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRAY_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrayElement() <em>Array Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayElement()
	 * @generated
	 * @ordered
	 */
	protected String arrayElement = ARRAY_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrayAttribute() <em>Array Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute arrayAttribute;

	/**
	 * The cached value of the '{@link #getArrayObject() <em>Array Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayObject()
	 * @generated
	 * @ordered
	 */
	protected dercs.structure.runtime.Object arrayObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ARRAY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalVariable getArrayVariable() {
		if (arrayVariable != null && arrayVariable.eIsProxy()) {
			InternalEObject oldArrayVariable = (InternalEObject) arrayVariable;
			arrayVariable = (LocalVariable) eResolveProxy(oldArrayVariable);
			if (arrayVariable != oldArrayVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.ARRAY_ACTION__ARRAY_VARIABLE, oldArrayVariable, arrayVariable));
			}
		}
		return arrayVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetArrayVariable() {
		return arrayVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrayVariable(LocalVariable newArrayVariable) {
		LocalVariable oldArrayVariable = arrayVariable;
		arrayVariable = newArrayVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ARRAY_ACTION__ARRAY_VARIABLE,
					oldArrayVariable, arrayVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArrayElement() {
		return arrayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrayElement(String newArrayElement) {
		String oldArrayElement = arrayElement;
		arrayElement = newArrayElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ARRAY_ACTION__ARRAY_ELEMENT,
					oldArrayElement, arrayElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getArrayAttribute() {
		if (arrayAttribute != null && arrayAttribute.eIsProxy()) {
			InternalEObject oldArrayAttribute = (InternalEObject) arrayAttribute;
			arrayAttribute = (Attribute) eResolveProxy(oldArrayAttribute);
			if (arrayAttribute != oldArrayAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.ARRAY_ACTION__ARRAY_ATTRIBUTE, oldArrayAttribute, arrayAttribute));
			}
		}
		return arrayAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetArrayAttribute() {
		return arrayAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrayAttribute(Attribute newArrayAttribute) {
		Attribute oldArrayAttribute = arrayAttribute;
		arrayAttribute = newArrayAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ARRAY_ACTION__ARRAY_ATTRIBUTE,
					oldArrayAttribute, arrayAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.runtime.Object getArrayObject() {
		if (arrayObject != null && arrayObject.eIsProxy()) {
			InternalEObject oldArrayObject = (InternalEObject) arrayObject;
			arrayObject = (dercs.structure.runtime.Object) eResolveProxy(oldArrayObject);
			if (arrayObject != oldArrayObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.ARRAY_ACTION__ARRAY_OBJECT,
							oldArrayObject, arrayObject));
			}
		}
		return arrayObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dercs.structure.runtime.Object basicGetArrayObject() {
		return arrayObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrayObject(dercs.structure.runtime.Object newArrayObject) {
		dercs.structure.runtime.Object oldArrayObject = arrayObject;
		arrayObject = newArrayObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ARRAY_ACTION__ARRAY_OBJECT,
					oldArrayObject, arrayObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActionsPackage.ARRAY_ACTION__ARRAY_VARIABLE:
			if (resolve)
				return getArrayVariable();
			return basicGetArrayVariable();
		case ActionsPackage.ARRAY_ACTION__ARRAY_ELEMENT:
			return getArrayElement();
		case ActionsPackage.ARRAY_ACTION__ARRAY_ATTRIBUTE:
			if (resolve)
				return getArrayAttribute();
			return basicGetArrayAttribute();
		case ActionsPackage.ARRAY_ACTION__ARRAY_OBJECT:
			if (resolve)
				return getArrayObject();
			return basicGetArrayObject();
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
		case ActionsPackage.ARRAY_ACTION__ARRAY_VARIABLE:
			setArrayVariable((LocalVariable) newValue);
			return;
		case ActionsPackage.ARRAY_ACTION__ARRAY_ELEMENT:
			setArrayElement((String) newValue);
			return;
		case ActionsPackage.ARRAY_ACTION__ARRAY_ATTRIBUTE:
			setArrayAttribute((Attribute) newValue);
			return;
		case ActionsPackage.ARRAY_ACTION__ARRAY_OBJECT:
			setArrayObject((dercs.structure.runtime.Object) newValue);
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
		case ActionsPackage.ARRAY_ACTION__ARRAY_VARIABLE:
			setArrayVariable((LocalVariable) null);
			return;
		case ActionsPackage.ARRAY_ACTION__ARRAY_ELEMENT:
			setArrayElement(ARRAY_ELEMENT_EDEFAULT);
			return;
		case ActionsPackage.ARRAY_ACTION__ARRAY_ATTRIBUTE:
			setArrayAttribute((Attribute) null);
			return;
		case ActionsPackage.ARRAY_ACTION__ARRAY_OBJECT:
			setArrayObject((dercs.structure.runtime.Object) null);
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
		case ActionsPackage.ARRAY_ACTION__ARRAY_VARIABLE:
			return arrayVariable != null;
		case ActionsPackage.ARRAY_ACTION__ARRAY_ELEMENT:
			return ARRAY_ELEMENT_EDEFAULT == null ? arrayElement != null : !ARRAY_ELEMENT_EDEFAULT.equals(arrayElement);
		case ActionsPackage.ARRAY_ACTION__ARRAY_ATTRIBUTE:
			return arrayAttribute != null;
		case ActionsPackage.ARRAY_ACTION__ARRAY_OBJECT:
			return arrayObject != null;
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
		result.append(" (arrayElement: ");
		result.append(arrayElement);
		result.append(')');
		return result.toString();
	}

} //ArrayActionImpl
