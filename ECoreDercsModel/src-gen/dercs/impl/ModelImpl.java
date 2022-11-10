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
package dercs.impl;

import dercs.AO.AOPackage;
import dercs.AO.Aspect;
import dercs.AO.JoinPoint;
import dercs.DercsPackage;
import dercs.Model;

import dercs.behavior.Behavior;
import dercs.behavior.events.Event;
import dercs.datatypes.Enumeration;
import dercs.structure.StructurePackage;
import dercs.structure.runtime.Node;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.impl.ModelImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link dercs.impl.ModelImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link dercs.impl.ModelImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link dercs.impl.ModelImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link dercs.impl.ModelImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link dercs.impl.ModelImpl#getJoinPoints <em>Join Points</em>}</li>
 *   <li>{@link dercs.impl.ModelImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link dercs.impl.ModelImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<dercs.structure.Class> classes;
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<dercs.structure.runtime.Object> objects;
	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviors;
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;
	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> aspects;
	/**
	 * The cached value of the '{@link #getJoinPoints() <em>Join Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinPoint> joinPoints;
	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumerations;
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DercsPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<dercs.structure.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectWithInverseResolvingEList<dercs.structure.Class>(dercs.structure.Class.class, this,
					DercsPackage.MODEL__CLASSES, StructurePackage.CLASS__OWNER);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<dercs.structure.runtime.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectResolvingEList<dercs.structure.runtime.Object>(dercs.structure.runtime.Object.class,
					this, DercsPackage.MODEL__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectResolvingEList<Behavior>(Behavior.class, this, DercsPackage.MODEL__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<Event>(Event.class, this, DercsPackage.MODEL__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectResolvingEList<Aspect>(Aspect.class, this, DercsPackage.MODEL__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JoinPoint> getJoinPoints() {
		if (joinPoints == null) {
			joinPoints = new EObjectWithInverseResolvingEList<JoinPoint>(JoinPoint.class, this,
					DercsPackage.MODEL__JOIN_POINTS, AOPackage.JOIN_POINT__MODEL);
		}
		return joinPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enumeration> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectResolvingEList<Enumeration>(Enumeration.class, this,
					DercsPackage.MODEL__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<Node>(Node.class, this, DercsPackage.MODEL__NODES);
		}
		return nodes;
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
		case DercsPackage.MODEL__CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getClasses()).basicAdd(otherEnd, msgs);
		case DercsPackage.MODEL__JOIN_POINTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJoinPoints()).basicAdd(otherEnd, msgs);
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
		case DercsPackage.MODEL__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
		case DercsPackage.MODEL__JOIN_POINTS:
			return ((InternalEList<?>) getJoinPoints()).basicRemove(otherEnd, msgs);
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
		case DercsPackage.MODEL__CLASSES:
			return getClasses();
		case DercsPackage.MODEL__OBJECTS:
			return getObjects();
		case DercsPackage.MODEL__BEHAVIORS:
			return getBehaviors();
		case DercsPackage.MODEL__EVENTS:
			return getEvents();
		case DercsPackage.MODEL__ASPECTS:
			return getAspects();
		case DercsPackage.MODEL__JOIN_POINTS:
			return getJoinPoints();
		case DercsPackage.MODEL__ENUMERATIONS:
			return getEnumerations();
		case DercsPackage.MODEL__NODES:
			return getNodes();
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
		case DercsPackage.MODEL__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends dercs.structure.Class>) newValue);
			return;
		case DercsPackage.MODEL__OBJECTS:
			getObjects().clear();
			getObjects().addAll((Collection<? extends dercs.structure.runtime.Object>) newValue);
			return;
		case DercsPackage.MODEL__BEHAVIORS:
			getBehaviors().clear();
			getBehaviors().addAll((Collection<? extends Behavior>) newValue);
			return;
		case DercsPackage.MODEL__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case DercsPackage.MODEL__ASPECTS:
			getAspects().clear();
			getAspects().addAll((Collection<? extends Aspect>) newValue);
			return;
		case DercsPackage.MODEL__JOIN_POINTS:
			getJoinPoints().clear();
			getJoinPoints().addAll((Collection<? extends JoinPoint>) newValue);
			return;
		case DercsPackage.MODEL__ENUMERATIONS:
			getEnumerations().clear();
			getEnumerations().addAll((Collection<? extends Enumeration>) newValue);
			return;
		case DercsPackage.MODEL__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends Node>) newValue);
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
		case DercsPackage.MODEL__CLASSES:
			getClasses().clear();
			return;
		case DercsPackage.MODEL__OBJECTS:
			getObjects().clear();
			return;
		case DercsPackage.MODEL__BEHAVIORS:
			getBehaviors().clear();
			return;
		case DercsPackage.MODEL__EVENTS:
			getEvents().clear();
			return;
		case DercsPackage.MODEL__ASPECTS:
			getAspects().clear();
			return;
		case DercsPackage.MODEL__JOIN_POINTS:
			getJoinPoints().clear();
			return;
		case DercsPackage.MODEL__ENUMERATIONS:
			getEnumerations().clear();
			return;
		case DercsPackage.MODEL__NODES:
			getNodes().clear();
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
		case DercsPackage.MODEL__CLASSES:
			return classes != null && !classes.isEmpty();
		case DercsPackage.MODEL__OBJECTS:
			return objects != null && !objects.isEmpty();
		case DercsPackage.MODEL__BEHAVIORS:
			return behaviors != null && !behaviors.isEmpty();
		case DercsPackage.MODEL__EVENTS:
			return events != null && !events.isEmpty();
		case DercsPackage.MODEL__ASPECTS:
			return aspects != null && !aspects.isEmpty();
		case DercsPackage.MODEL__JOIN_POINTS:
			return joinPoints != null && !joinPoints.isEmpty();
		case DercsPackage.MODEL__ENUMERATIONS:
			return enumerations != null && !enumerations.isEmpty();
		case DercsPackage.MODEL__NODES:
			return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
