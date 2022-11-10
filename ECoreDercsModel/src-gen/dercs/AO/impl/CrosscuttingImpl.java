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
import dercs.AO.Aspect;
import dercs.AO.Crosscutting;
import dercs.AO.CrosscuttingInformation;

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
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crosscutting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.impl.CrosscuttingImpl#getAffectedElement <em>Affected Element</em>}</li>
 *   <li>{@link dercs.AO.impl.CrosscuttingImpl#getCrosscuttingInformations <em>Crosscutting Informations</em>}</li>
 *   <li>{@link dercs.AO.impl.CrosscuttingImpl#getAssociatedAspect <em>Associated Aspect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrosscuttingImpl extends NamedElementImpl implements Crosscutting {
	/**
	 * The cached value of the '{@link #getAffectedElement() <em>Affected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedElement()
	 * @generated
	 * @ordered
	 */
	protected BaseElement affectedElement;

	/**
	 * The cached value of the '{@link #getCrosscuttingInformations() <em>Crosscutting Informations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrosscuttingInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<CrosscuttingInformation> crosscuttingInformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrosscuttingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AOPackage.Literals.CROSSCUTTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseElement getAffectedElement() {
		if (affectedElement != null && affectedElement.eIsProxy()) {
			InternalEObject oldAffectedElement = (InternalEObject) affectedElement;
			affectedElement = (BaseElement) eResolveProxy(oldAffectedElement);
			if (affectedElement != oldAffectedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AOPackage.CROSSCUTTING__AFFECTED_ELEMENT,
							oldAffectedElement, affectedElement));
			}
		}
		return affectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetAffectedElement() {
		return affectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffectedElement(BaseElement newAffectedElement) {
		BaseElement oldAffectedElement = affectedElement;
		affectedElement = newAffectedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AOPackage.CROSSCUTTING__AFFECTED_ELEMENT,
					oldAffectedElement, affectedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrosscuttingInformation> getCrosscuttingInformations() {
		if (crosscuttingInformations == null) {
			crosscuttingInformations = new EObjectResolvingEList<CrosscuttingInformation>(CrosscuttingInformation.class,
					this, AOPackage.CROSSCUTTING__CROSSCUTTING_INFORMATIONS);
		}
		return crosscuttingInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aspect getAssociatedAspect() {
		if (eContainerFeatureID() != AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT)
			return null;
		return (Aspect) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociatedAspect(Aspect newAssociatedAspect, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAssociatedAspect, AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociatedAspect(Aspect newAssociatedAspect) {
		if (newAssociatedAspect != eInternalContainer()
				|| (eContainerFeatureID() != AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT
						&& newAssociatedAspect != null)) {
			if (EcoreUtil.isAncestor(this, newAssociatedAspect))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociatedAspect != null)
				msgs = ((InternalEObject) newAssociatedAspect).eInverseAdd(this, AOPackage.ASPECT__CROSSCUTTING,
						Aspect.class, msgs);
			msgs = basicSetAssociatedAspect(newAssociatedAspect, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT,
					newAssociatedAspect, newAssociatedAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAssociatedAspect((Aspect) otherEnd, msgs);
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
		case AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT:
			return basicSetAssociatedAspect(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT:
			return eInternalContainer().eInverseRemove(this, AOPackage.ASPECT__CROSSCUTTING, Aspect.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AOPackage.CROSSCUTTING__AFFECTED_ELEMENT:
			if (resolve)
				return getAffectedElement();
			return basicGetAffectedElement();
		case AOPackage.CROSSCUTTING__CROSSCUTTING_INFORMATIONS:
			return getCrosscuttingInformations();
		case AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT:
			return getAssociatedAspect();
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
		case AOPackage.CROSSCUTTING__AFFECTED_ELEMENT:
			setAffectedElement((BaseElement) newValue);
			return;
		case AOPackage.CROSSCUTTING__CROSSCUTTING_INFORMATIONS:
			getCrosscuttingInformations().clear();
			getCrosscuttingInformations().addAll((Collection<? extends CrosscuttingInformation>) newValue);
			return;
		case AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT:
			setAssociatedAspect((Aspect) newValue);
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
		case AOPackage.CROSSCUTTING__AFFECTED_ELEMENT:
			setAffectedElement((BaseElement) null);
			return;
		case AOPackage.CROSSCUTTING__CROSSCUTTING_INFORMATIONS:
			getCrosscuttingInformations().clear();
			return;
		case AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT:
			setAssociatedAspect((Aspect) null);
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
		case AOPackage.CROSSCUTTING__AFFECTED_ELEMENT:
			return affectedElement != null;
		case AOPackage.CROSSCUTTING__CROSSCUTTING_INFORMATIONS:
			return crosscuttingInformations != null && !crosscuttingInformations.isEmpty();
		case AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT:
			return getAssociatedAspect() != null;
		}
		return super.eIsSet(featureID);
	}

} //CrosscuttingImpl
