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
package dercs.AO.impl;

import dercs.AO.AOPackage;
import dercs.AO.ElementSelectionKind;
import dercs.AO.JoinPoint;

import dercs.DercsPackage;
import dercs.Model;

import dercs.structure.BaseElement;

import dercs.structure.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.impl.JoinPointImpl#getSelectedElements <em>Selected Elements</em>}</li>
 *   <li>{@link dercs.AO.impl.JoinPointImpl#getModel <em>Model</em>}</li>
 *   <li>{@link dercs.AO.impl.JoinPointImpl#getElementSelectionKind <em>Element Selection Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinPointImpl extends NamedElementImpl implements JoinPoint {
	/**
	 * The cached value of the '{@link #getSelectedElements() <em>Selected Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseElement> selectedElements;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The default value of the '{@link #getElementSelectionKind() <em>Element Selection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSelectionKind()
	 * @generated
	 * @ordered
	 */
	protected static final ElementSelectionKind ELEMENT_SELECTION_KIND_EDEFAULT = ElementSelectionKind.UNKNOWN;

	/**
	 * The cached value of the '{@link #getElementSelectionKind() <em>Element Selection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSelectionKind()
	 * @generated
	 * @ordered
	 */
	protected ElementSelectionKind elementSelectionKind = ELEMENT_SELECTION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AOPackage.Literals.JOIN_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseElement> getSelectedElements() {
		if (selectedElements == null) {
			selectedElements = new EObjectResolvingEList<BaseElement>(BaseElement.class, this,
					AOPackage.JOIN_POINT__SELECTED_ELEMENTS);
		}
		return selectedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject) model;
			model = (Model) eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AOPackage.JOIN_POINT__MODEL, oldModel,
							model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AOPackage.JOIN_POINT__MODEL,
					oldModel, newModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this, DercsPackage.MODEL__JOIN_POINTS, Model.class,
						msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this, DercsPackage.MODEL__JOIN_POINTS, Model.class,
						msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AOPackage.JOIN_POINT__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementSelectionKind getElementSelectionKind() {
		return elementSelectionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementSelectionKind(ElementSelectionKind newElementSelectionKind) {
		ElementSelectionKind oldElementSelectionKind = elementSelectionKind;
		elementSelectionKind = newElementSelectionKind == null ? ELEMENT_SELECTION_KIND_EDEFAULT
				: newElementSelectionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AOPackage.JOIN_POINT__ELEMENT_SELECTION_KIND,
					oldElementSelectionKind, elementSelectionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AOPackage.JOIN_POINT__MODEL:
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this, DercsPackage.MODEL__JOIN_POINTS, Model.class,
						msgs);
			return basicSetModel((Model) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AOPackage.JOIN_POINT__MODEL:
			return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AOPackage.JOIN_POINT__SELECTED_ELEMENTS:
			return getSelectedElements();
		case AOPackage.JOIN_POINT__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
		case AOPackage.JOIN_POINT__ELEMENT_SELECTION_KIND:
			return getElementSelectionKind();
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
		case AOPackage.JOIN_POINT__SELECTED_ELEMENTS:
			getSelectedElements().clear();
			getSelectedElements().addAll((Collection<? extends BaseElement>) newValue);
			return;
		case AOPackage.JOIN_POINT__MODEL:
			setModel((Model) newValue);
			return;
		case AOPackage.JOIN_POINT__ELEMENT_SELECTION_KIND:
			setElementSelectionKind((ElementSelectionKind) newValue);
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
		case AOPackage.JOIN_POINT__SELECTED_ELEMENTS:
			getSelectedElements().clear();
			return;
		case AOPackage.JOIN_POINT__MODEL:
			setModel((Model) null);
			return;
		case AOPackage.JOIN_POINT__ELEMENT_SELECTION_KIND:
			setElementSelectionKind(ELEMENT_SELECTION_KIND_EDEFAULT);
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
		case AOPackage.JOIN_POINT__SELECTED_ELEMENTS:
			return selectedElements != null && !selectedElements.isEmpty();
		case AOPackage.JOIN_POINT__MODEL:
			return model != null;
		case AOPackage.JOIN_POINT__ELEMENT_SELECTION_KIND:
			return elementSelectionKind != ELEMENT_SELECTION_KIND_EDEFAULT;
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
		result.append(" (elementSelectionKind: ");
		result.append(elementSelectionKind);
		result.append(')');
		return result.toString();
	}

} //JoinPointImpl
