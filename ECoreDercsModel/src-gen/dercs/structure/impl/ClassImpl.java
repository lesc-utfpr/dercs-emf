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

import dercs.DercsPackage;
import dercs.Model;
import dercs.behavior.events.Event;
import dercs.structure.Attribute;
import dercs.structure.Class;
import dercs.structure.Method;
import dercs.structure.StructurePackage;

import dercs.structure.runtime.State;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#isActiveClass <em>Active Class</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#isPassiveClass <em>Passive Class</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#getReferencedClasses <em>Referenced Classes</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#getStates <em>States</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link dercs.structure.impl.ClassImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends BaseElementImpl implements dercs.structure.Class {
	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected dercs.structure.Class superClass;

	/**
	 * The default value of the '{@link #isActiveClass() <em>Active Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActiveClass() <em>Active Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveClass()
	 * @generated
	 * @ordered
	 */
	protected boolean activeClass = ACTIVE_CLASS_EDEFAULT;

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
	 * The default value of the '{@link #isPassiveClass() <em>Passive Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassiveClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSIVE_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassiveClass() <em>Passive Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassiveClass()
	 * @generated
	 * @ordered
	 */
	protected boolean passiveClass = PASSIVE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReferencedClasses() <em>Referenced Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<dercs.structure.Class> referencedClasses;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Model owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.Class getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject) superClass;
			superClass = (dercs.structure.Class) eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CLASS__SUPER_CLASS,
							oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dercs.structure.Class basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperClass(dercs.structure.Class newSuperClass) {
		dercs.structure.Class oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS__SUPER_CLASS, oldSuperClass,
					superClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isActiveClass() {
		Class currentClass = this;
		boolean found = false;
		// first looks at the super classes
		while (!found && currentClass.getSuperClass() != null) {
			currentClass = currentClass.getSuperClass();

			for (Method method : currentClass.getMethods()) {
				if (method.getName().toLowerCase().startsWith("run")) {
					found = true;
					break;
				}
			}
		}

		this.activeClass = this.activeClass || found;
		return (this.activeClass && !this.passiveClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveClass(boolean newActiveClass) {
		boolean oldActiveClass = activeClass;
		activeClass = newActiveClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS__ACTIVE_CLASS, oldActiveClass,
					activeClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS__ABSTRACT, oldAbstract,
					abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isPassiveClass() {
		return passiveClass && !activeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassiveClass(boolean newPassiveClass) {
		boolean oldPassiveClass = passiveClass;
		passiveClass = newPassiveClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS__PASSIVE_CLASS,
					oldPassiveClass, passiveClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this,
					StructurePackage.CLASS__ATTRIBUTES, StructurePackage.ATTRIBUTE__OWNER_CLASS);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<dercs.structure.Class> getReferencedClasses() {
		if (referencedClasses == null) {
			referencedClasses = new EObjectResolvingEList<dercs.structure.Class>(dercs.structure.Class.class, this,
					StructurePackage.CLASS__REFERENCED_CLASSES);
		}
		return referencedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this,
					StructurePackage.CLASS__METHODS, StructurePackage.METHOD__OWNER_CLASS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, StructurePackage.CLASS__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, StructurePackage.CLASS__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject) owner;
			owner = (Model) eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CLASS__OWNER, oldOwner,
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
	public Model basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Model newOwner, NotificationChain msgs) {
		Model oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS__OWNER, oldOwner, newOwner);
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
	public void setOwner(Model newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject) owner).eInverseRemove(this, DercsPackage.MODEL__CLASSES, Model.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject) newOwner).eInverseAdd(this, DercsPackage.MODEL__CLASSES, Model.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS__OWNER, newOwner, newOwner));
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
		case StructurePackage.CLASS__ATTRIBUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributes()).basicAdd(otherEnd, msgs);
		case StructurePackage.CLASS__METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods()).basicAdd(otherEnd, msgs);
		case StructurePackage.CLASS__OWNER:
			if (owner != null)
				msgs = ((InternalEObject) owner).eInverseRemove(this, DercsPackage.MODEL__CLASSES, Model.class, msgs);
			return basicSetOwner((Model) otherEnd, msgs);
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
		case StructurePackage.CLASS__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		case StructurePackage.CLASS__METHODS:
			return ((InternalEList<?>) getMethods()).basicRemove(otherEnd, msgs);
		case StructurePackage.CLASS__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case StructurePackage.CLASS__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
		case StructurePackage.CLASS__OWNER:
			return basicSetOwner(null, msgs);
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
		case StructurePackage.CLASS__SUPER_CLASS:
			if (resolve)
				return getSuperClass();
			return basicGetSuperClass();
		case StructurePackage.CLASS__ACTIVE_CLASS:
			return isActiveClass();
		case StructurePackage.CLASS__ABSTRACT:
			return isAbstract();
		case StructurePackage.CLASS__PASSIVE_CLASS:
			return isPassiveClass();
		case StructurePackage.CLASS__ATTRIBUTES:
			return getAttributes();
		case StructurePackage.CLASS__REFERENCED_CLASSES:
			return getReferencedClasses();
		case StructurePackage.CLASS__METHODS:
			return getMethods();
		case StructurePackage.CLASS__STATES:
			return getStates();
		case StructurePackage.CLASS__EVENTS:
			return getEvents();
		case StructurePackage.CLASS__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
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
		case StructurePackage.CLASS__SUPER_CLASS:
			setSuperClass((dercs.structure.Class) newValue);
			return;
		case StructurePackage.CLASS__ACTIVE_CLASS:
			setActiveClass((Boolean) newValue);
			return;
		case StructurePackage.CLASS__ABSTRACT:
			setAbstract((Boolean) newValue);
			return;
		case StructurePackage.CLASS__PASSIVE_CLASS:
			setPassiveClass((Boolean) newValue);
			return;
		case StructurePackage.CLASS__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case StructurePackage.CLASS__REFERENCED_CLASSES:
			getReferencedClasses().clear();
			getReferencedClasses().addAll((Collection<? extends dercs.structure.Class>) newValue);
			return;
		case StructurePackage.CLASS__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case StructurePackage.CLASS__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case StructurePackage.CLASS__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case StructurePackage.CLASS__OWNER:
			setOwner((Model) newValue);
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
		case StructurePackage.CLASS__SUPER_CLASS:
			setSuperClass((dercs.structure.Class) null);
			return;
		case StructurePackage.CLASS__ACTIVE_CLASS:
			setActiveClass(ACTIVE_CLASS_EDEFAULT);
			return;
		case StructurePackage.CLASS__ABSTRACT:
			setAbstract(ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.CLASS__PASSIVE_CLASS:
			setPassiveClass(PASSIVE_CLASS_EDEFAULT);
			return;
		case StructurePackage.CLASS__ATTRIBUTES:
			getAttributes().clear();
			return;
		case StructurePackage.CLASS__REFERENCED_CLASSES:
			getReferencedClasses().clear();
			return;
		case StructurePackage.CLASS__METHODS:
			getMethods().clear();
			return;
		case StructurePackage.CLASS__STATES:
			getStates().clear();
			return;
		case StructurePackage.CLASS__EVENTS:
			getEvents().clear();
			return;
		case StructurePackage.CLASS__OWNER:
			setOwner((Model) null);
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
		case StructurePackage.CLASS__SUPER_CLASS:
			return superClass != null;
		case StructurePackage.CLASS__ACTIVE_CLASS:
			return activeClass != ACTIVE_CLASS_EDEFAULT;
		case StructurePackage.CLASS__ABSTRACT:
			return abstract_ != ABSTRACT_EDEFAULT;
		case StructurePackage.CLASS__PASSIVE_CLASS:
			return passiveClass != PASSIVE_CLASS_EDEFAULT;
		case StructurePackage.CLASS__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case StructurePackage.CLASS__REFERENCED_CLASSES:
			return referencedClasses != null && !referencedClasses.isEmpty();
		case StructurePackage.CLASS__METHODS:
			return methods != null && !methods.isEmpty();
		case StructurePackage.CLASS__STATES:
			return states != null && !states.isEmpty();
		case StructurePackage.CLASS__EVENTS:
			return events != null && !events.isEmpty();
		case StructurePackage.CLASS__OWNER:
			return owner != null;
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
		result.append(" (activeClass: ");
		result.append(activeClass);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", passiveClass: ");
		result.append(passiveClass);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
