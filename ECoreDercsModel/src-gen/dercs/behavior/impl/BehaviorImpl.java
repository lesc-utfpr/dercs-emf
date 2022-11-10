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
package dercs.behavior.impl;

import dercs.behavior.Behavior;
import dercs.behavior.BehaviorPackage;
import dercs.behavior.BehavioralElement;
import dercs.behavior.LocalVariable;
import dercs.structure.NamedElement;
import dercs.structure.runtime.LocalVariableRuntimeInformation;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.impl.BehaviorImpl#getEnterCondition <em>Enter Condition</em>}</li>
 *   <li>{@link dercs.behavior.impl.BehaviorImpl#getExitCondition <em>Exit Condition</em>}</li>
 *   <li>{@link dercs.behavior.impl.BehaviorImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link dercs.behavior.impl.BehaviorImpl#getNumberOfRepetitions <em>Number Of Repetitions</em>}</li>
 *   <li>{@link dercs.behavior.impl.BehaviorImpl#getBehavioralElements <em>Behavioral Elements</em>}</li>
 *   <li>{@link dercs.behavior.impl.BehaviorImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link dercs.behavior.impl.BehaviorImpl#getAlternateBehavior <em>Alternate Behavior</em>}</li>
 *   <li>{@link dercs.behavior.impl.BehaviorImpl#getRuntimeInformation <em>Runtime Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends BehavioralElementImpl implements Behavior {
	/**
	 * The default value of the '{@link #getEnterCondition() <em>Enter Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTER_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterCondition() <em>Enter Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterCondition()
	 * @generated
	 * @ordered
	 */
	protected String enterCondition = ENTER_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExitCondition() <em>Exit Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String EXIT_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExitCondition() <em>Exit Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCondition()
	 * @generated
	 * @ordered
	 */
	protected String exitCondition = EXIT_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected NamedElement owner;

	/**
	 * The default value of the '{@link #getNumberOfRepetitions() <em>Number Of Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepetitions()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_REPETITIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRepetitions() <em>Number Of Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepetitions()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRepetitions = NUMBER_OF_REPETITIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehavioralElements() <em>Behavioral Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BehavioralElement> behavioralElements;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> localVariables;

	/**
	 * The cached value of the '{@link #getAlternateBehavior() <em>Alternate Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior alternateBehavior;

	/**
	 * The cached value of the '{@link #getRuntimeInformation() <em>Runtime Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariableRuntimeInformation> runtimeInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnterCondition() {
		return enterCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnterCondition(String newEnterCondition) {
		String oldEnterCondition = enterCondition;
		enterCondition = newEnterCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR__ENTER_CONDITION,
					oldEnterCondition, enterCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExitCondition() {
		return exitCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitCondition(String newExitCondition) {
		String oldExitCondition = exitCondition;
		exitCondition = newExitCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR__EXIT_CONDITION,
					oldExitCondition, exitCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject) owner;
			owner = (NamedElement) eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.BEHAVIOR__OWNER, oldOwner,
							owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(NamedElement newOwner) {
		NamedElement oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfRepetitions(int newNumberOfRepetitions) {
		int oldNumberOfRepetitions = numberOfRepetitions;
		numberOfRepetitions = newNumberOfRepetitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR__NUMBER_OF_REPETITIONS,
					oldNumberOfRepetitions, numberOfRepetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehavioralElement> getBehavioralElements() {
		if (behavioralElements == null) {
			behavioralElements = new EObjectContainmentEList<BehavioralElement>(BehavioralElement.class, this,
					BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENTS);
		}
		return behavioralElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalVariable> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<LocalVariable>(LocalVariable.class, this,
					BehaviorPackage.BEHAVIOR__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getAlternateBehavior() {
		if (alternateBehavior != null && alternateBehavior.eIsProxy()) {
			InternalEObject oldAlternateBehavior = (InternalEObject) alternateBehavior;
			alternateBehavior = (Behavior) eResolveProxy(oldAlternateBehavior);
			if (alternateBehavior != oldAlternateBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.BEHAVIOR__ALTERNATE_BEHAVIOR, oldAlternateBehavior, alternateBehavior));
			}
		}
		return alternateBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetAlternateBehavior() {
		return alternateBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternateBehavior(Behavior newAlternateBehavior) {
		Behavior oldAlternateBehavior = alternateBehavior;
		alternateBehavior = newAlternateBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR__ALTERNATE_BEHAVIOR,
					oldAlternateBehavior, alternateBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalVariableRuntimeInformation> getRuntimeInformation() {
		if (runtimeInformation == null) {
			runtimeInformation = new EObjectResolvingEList<LocalVariableRuntimeInformation>(
					LocalVariableRuntimeInformation.class, this, BehaviorPackage.BEHAVIOR__RUNTIME_INFORMATION);
		}
		return runtimeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENTS:
			return ((InternalEList<?>) getBehavioralElements()).basicRemove(otherEnd, msgs);
		case BehaviorPackage.BEHAVIOR__LOCAL_VARIABLES:
			return ((InternalEList<?>) getLocalVariables()).basicRemove(otherEnd, msgs);
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
		case BehaviorPackage.BEHAVIOR__ENTER_CONDITION:
			return getEnterCondition();
		case BehaviorPackage.BEHAVIOR__EXIT_CONDITION:
			return getExitCondition();
		case BehaviorPackage.BEHAVIOR__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
		case BehaviorPackage.BEHAVIOR__NUMBER_OF_REPETITIONS:
			return getNumberOfRepetitions();
		case BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENTS:
			return getBehavioralElements();
		case BehaviorPackage.BEHAVIOR__LOCAL_VARIABLES:
			return getLocalVariables();
		case BehaviorPackage.BEHAVIOR__ALTERNATE_BEHAVIOR:
			if (resolve)
				return getAlternateBehavior();
			return basicGetAlternateBehavior();
		case BehaviorPackage.BEHAVIOR__RUNTIME_INFORMATION:
			return getRuntimeInformation();
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
		case BehaviorPackage.BEHAVIOR__ENTER_CONDITION:
			setEnterCondition((String) newValue);
			return;
		case BehaviorPackage.BEHAVIOR__EXIT_CONDITION:
			setExitCondition((String) newValue);
			return;
		case BehaviorPackage.BEHAVIOR__OWNER:
			setOwner((NamedElement) newValue);
			return;
		case BehaviorPackage.BEHAVIOR__NUMBER_OF_REPETITIONS:
			setNumberOfRepetitions((Integer) newValue);
			return;
		case BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENTS:
			getBehavioralElements().clear();
			getBehavioralElements().addAll((Collection<? extends BehavioralElement>) newValue);
			return;
		case BehaviorPackage.BEHAVIOR__LOCAL_VARIABLES:
			getLocalVariables().clear();
			getLocalVariables().addAll((Collection<? extends LocalVariable>) newValue);
			return;
		case BehaviorPackage.BEHAVIOR__ALTERNATE_BEHAVIOR:
			setAlternateBehavior((Behavior) newValue);
			return;
		case BehaviorPackage.BEHAVIOR__RUNTIME_INFORMATION:
			getRuntimeInformation().clear();
			getRuntimeInformation().addAll((Collection<? extends LocalVariableRuntimeInformation>) newValue);
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
		case BehaviorPackage.BEHAVIOR__ENTER_CONDITION:
			setEnterCondition(ENTER_CONDITION_EDEFAULT);
			return;
		case BehaviorPackage.BEHAVIOR__EXIT_CONDITION:
			setExitCondition(EXIT_CONDITION_EDEFAULT);
			return;
		case BehaviorPackage.BEHAVIOR__OWNER:
			setOwner((NamedElement) null);
			return;
		case BehaviorPackage.BEHAVIOR__NUMBER_OF_REPETITIONS:
			setNumberOfRepetitions(NUMBER_OF_REPETITIONS_EDEFAULT);
			return;
		case BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENTS:
			getBehavioralElements().clear();
			return;
		case BehaviorPackage.BEHAVIOR__LOCAL_VARIABLES:
			getLocalVariables().clear();
			return;
		case BehaviorPackage.BEHAVIOR__ALTERNATE_BEHAVIOR:
			setAlternateBehavior((Behavior) null);
			return;
		case BehaviorPackage.BEHAVIOR__RUNTIME_INFORMATION:
			getRuntimeInformation().clear();
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
		case BehaviorPackage.BEHAVIOR__ENTER_CONDITION:
			return ENTER_CONDITION_EDEFAULT == null ? enterCondition != null
					: !ENTER_CONDITION_EDEFAULT.equals(enterCondition);
		case BehaviorPackage.BEHAVIOR__EXIT_CONDITION:
			return EXIT_CONDITION_EDEFAULT == null ? exitCondition != null
					: !EXIT_CONDITION_EDEFAULT.equals(exitCondition);
		case BehaviorPackage.BEHAVIOR__OWNER:
			return owner != null;
		case BehaviorPackage.BEHAVIOR__NUMBER_OF_REPETITIONS:
			return numberOfRepetitions != NUMBER_OF_REPETITIONS_EDEFAULT;
		case BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENTS:
			return behavioralElements != null && !behavioralElements.isEmpty();
		case BehaviorPackage.BEHAVIOR__LOCAL_VARIABLES:
			return localVariables != null && !localVariables.isEmpty();
		case BehaviorPackage.BEHAVIOR__ALTERNATE_BEHAVIOR:
			return alternateBehavior != null;
		case BehaviorPackage.BEHAVIOR__RUNTIME_INFORMATION:
			return runtimeInformation != null && !runtimeInformation.isEmpty();
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
		result.append(" (enterCondition: ");
		result.append(enterCondition);
		result.append(", exitCondition: ");
		result.append(exitCondition);
		result.append(", numberOfRepetitions: ");
		result.append(numberOfRepetitions);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
