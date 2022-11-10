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
package dercs.structure.impl;

import dercs.behavior.Behavior;
import dercs.datatypes.DataType;

import dercs.structure.Attribute;
import dercs.structure.Method;
import dercs.structure.Parameter;
import dercs.structure.StructurePackage;
import dercs.structure.Visibility;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.impl.MethodImpl#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#isActive <em>Active</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#isOverwritingMethod <em>Overwriting Method</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#getTriggeredBehavior <em>Triggered Behavior</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#getEvery <em>Every</em>}</li>
 *   <li>{@link dercs.structure.impl.MethodImpl#getAssociatedAttribute <em>Associated Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends BaseElementImpl implements Method {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOverwritingMethod() <em>Overwriting Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwritingMethod()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERWRITING_METHOD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverwritingMethod() <em>Overwriting Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwritingMethod()
	 * @generated
	 * @ordered
	 */
	protected boolean overwritingMethod = OVERWRITING_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggeredBehavior() <em>Triggered Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior triggeredBehavior;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnType;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getEvery() <em>Every</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvery()
	 * @generated
	 * @ordered
	 */
	protected static final int EVERY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEvery() <em>Every</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvery()
	 * @generated
	 * @ordered
	 */
	protected int every = EVERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedAttribute() <em>Associated Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute associatedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.Class getOwnerClass() {
		if (eContainerFeatureID() != StructurePackage.METHOD__OWNER_CLASS)
			return null;
		return (dercs.structure.Class) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(dercs.structure.Class newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwnerClass, StructurePackage.METHOD__OWNER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerClass(dercs.structure.Class newOwnerClass) {
		if (newOwnerClass != eInternalContainer()
				|| (eContainerFeatureID() != StructurePackage.METHOD__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject) newOwnerClass).eInverseAdd(this, StructurePackage.CLASS__METHODS,
						dercs.structure.Class.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__OWNER_CLASS, newOwnerClass,
					newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__VISIBILITY, oldVisibility,
					visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__ABSTRACT, oldAbstract,
					abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOverwritingMethod() {
		return overwritingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverwritingMethod(boolean newOverwritingMethod) {
		boolean oldOverwritingMethod = overwritingMethod;
		overwritingMethod = newOverwritingMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__OVERWRITING_METHOD,
					oldOverwritingMethod, overwritingMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getTriggeredBehavior() {
		return triggeredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggeredBehavior(Behavior newTriggeredBehavior, NotificationChain msgs) {
		Behavior oldTriggeredBehavior = triggeredBehavior;
		triggeredBehavior = newTriggeredBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StructurePackage.METHOD__TRIGGERED_BEHAVIOR, oldTriggeredBehavior, newTriggeredBehavior);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * This manually updates the owner field of the triggered behavior, since we can't properly represent it as a containment.
	 * @generated NOT
	 */
	private void handleChangedTriggeredBehavior(Behavior newTriggeredBehavior) {
		if (triggeredBehavior != null) {
			triggeredBehavior.setOwner(null);
		}

		if (newTriggeredBehavior != null) {
			newTriggeredBehavior.setOwner(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Because a Behavior can have a parent of other types than method, we cannot set it's owner field as the opposite of triggeredBehavior.
	 * This means we have to manually set the owner on Behaviors that are added or removed.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTriggeredBehavior(Behavior newTriggeredBehavior) {
		if (newTriggeredBehavior != triggeredBehavior) {
			// MANUALLY ADDED
			handleChangedTriggeredBehavior(newTriggeredBehavior);
			NotificationChain msgs = null;
			if (triggeredBehavior != null)
				msgs = ((InternalEObject) triggeredBehavior).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StructurePackage.METHOD__TRIGGERED_BEHAVIOR, null, msgs);
			if (newTriggeredBehavior != null)
				msgs = ((InternalEObject) newTriggeredBehavior).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StructurePackage.METHOD__TRIGGERED_BEHAVIOR, null, msgs);
			msgs = basicSetTriggeredBehavior(newTriggeredBehavior, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__TRIGGERED_BEHAVIOR,
					newTriggeredBehavior, newTriggeredBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject) returnType;
			returnType = (DataType) eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.METHOD__RETURN_TYPE,
							oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(DataType newReturnType) {
		DataType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__RETURN_TYPE, oldReturnType,
					returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this,
					StructurePackage.METHOD__PARAMETERS, StructurePackage.PARAMETER__OWNER_METHOD);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEvery() {
		return every;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvery(int newEvery) {
		int oldEvery = every;
		every = newEvery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__EVERY, oldEvery, every));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAssociatedAttribute() {
		if (associatedAttribute != null && associatedAttribute.eIsProxy()) {
			InternalEObject oldAssociatedAttribute = (InternalEObject) associatedAttribute;
			associatedAttribute = (Attribute) eResolveProxy(oldAssociatedAttribute);
			if (associatedAttribute != oldAssociatedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.METHOD__ASSOCIATED_ATTRIBUTE, oldAssociatedAttribute,
							associatedAttribute));
			}
		}
		return associatedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAssociatedAttribute() {
		return associatedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociatedAttribute(Attribute newAssociatedAttribute) {
		Attribute oldAssociatedAttribute = associatedAttribute;
		associatedAttribute = newAssociatedAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METHOD__ASSOCIATED_ATTRIBUTE,
					oldAssociatedAttribute, associatedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.METHOD__OWNER_CLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwnerClass((dercs.structure.Class) otherEnd, msgs);
		case StructurePackage.METHOD__PARAMETERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
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
		case StructurePackage.METHOD__OWNER_CLASS:
			return basicSetOwnerClass(null, msgs);
		case StructurePackage.METHOD__TRIGGERED_BEHAVIOR:
			return basicSetTriggeredBehavior(null, msgs);
		case StructurePackage.METHOD__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case StructurePackage.METHOD__OWNER_CLASS:
			return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS__METHODS,
					dercs.structure.Class.class, msgs);
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
		case StructurePackage.METHOD__OWNER_CLASS:
			return getOwnerClass();
		case StructurePackage.METHOD__VISIBILITY:
			return getVisibility();
		case StructurePackage.METHOD__ABSTRACT:
			return isAbstract();
		case StructurePackage.METHOD__ACTIVE:
			return isActive();
		case StructurePackage.METHOD__OVERWRITING_METHOD:
			return isOverwritingMethod();
		case StructurePackage.METHOD__TRIGGERED_BEHAVIOR:
			return getTriggeredBehavior();
		case StructurePackage.METHOD__RETURN_TYPE:
			if (resolve)
				return getReturnType();
			return basicGetReturnType();
		case StructurePackage.METHOD__PARAMETERS:
			return getParameters();
		case StructurePackage.METHOD__EVERY:
			return getEvery();
		case StructurePackage.METHOD__ASSOCIATED_ATTRIBUTE:
			if (resolve)
				return getAssociatedAttribute();
			return basicGetAssociatedAttribute();
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
		case StructurePackage.METHOD__OWNER_CLASS:
			setOwnerClass((dercs.structure.Class) newValue);
			return;
		case StructurePackage.METHOD__VISIBILITY:
			setVisibility((Visibility) newValue);
			return;
		case StructurePackage.METHOD__ABSTRACT:
			setAbstract((Boolean) newValue);
			return;
		case StructurePackage.METHOD__ACTIVE:
			setActive((Boolean) newValue);
			return;
		case StructurePackage.METHOD__OVERWRITING_METHOD:
			setOverwritingMethod((Boolean) newValue);
			return;
		case StructurePackage.METHOD__TRIGGERED_BEHAVIOR:
			setTriggeredBehavior((Behavior) newValue);
			return;
		case StructurePackage.METHOD__RETURN_TYPE:
			setReturnType((DataType) newValue);
			return;
		case StructurePackage.METHOD__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case StructurePackage.METHOD__EVERY:
			setEvery((Integer) newValue);
			return;
		case StructurePackage.METHOD__ASSOCIATED_ATTRIBUTE:
			setAssociatedAttribute((Attribute) newValue);
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
		case StructurePackage.METHOD__OWNER_CLASS:
			setOwnerClass((dercs.structure.Class) null);
			return;
		case StructurePackage.METHOD__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case StructurePackage.METHOD__ABSTRACT:
			setAbstract(ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.METHOD__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case StructurePackage.METHOD__OVERWRITING_METHOD:
			setOverwritingMethod(OVERWRITING_METHOD_EDEFAULT);
			return;
		case StructurePackage.METHOD__TRIGGERED_BEHAVIOR:
			setTriggeredBehavior((Behavior) null);
			return;
		case StructurePackage.METHOD__RETURN_TYPE:
			setReturnType((DataType) null);
			return;
		case StructurePackage.METHOD__PARAMETERS:
			getParameters().clear();
			return;
		case StructurePackage.METHOD__EVERY:
			setEvery(EVERY_EDEFAULT);
			return;
		case StructurePackage.METHOD__ASSOCIATED_ATTRIBUTE:
			setAssociatedAttribute((Attribute) null);
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
		case StructurePackage.METHOD__OWNER_CLASS:
			return getOwnerClass() != null;
		case StructurePackage.METHOD__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case StructurePackage.METHOD__ABSTRACT:
			return abstract_ != ABSTRACT_EDEFAULT;
		case StructurePackage.METHOD__ACTIVE:
			return active != ACTIVE_EDEFAULT;
		case StructurePackage.METHOD__OVERWRITING_METHOD:
			return overwritingMethod != OVERWRITING_METHOD_EDEFAULT;
		case StructurePackage.METHOD__TRIGGERED_BEHAVIOR:
			return triggeredBehavior != null;
		case StructurePackage.METHOD__RETURN_TYPE:
			return returnType != null;
		case StructurePackage.METHOD__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case StructurePackage.METHOD__EVERY:
			return every != EVERY_EDEFAULT;
		case StructurePackage.METHOD__ASSOCIATED_ATTRIBUTE:
			return associatedAttribute != null;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", active: ");
		result.append(active);
		result.append(", overwritingMethod: ");
		result.append(overwritingMethod);
		result.append(", every: ");
		result.append(every);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
