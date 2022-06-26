/**
 */
package dercs.behavior.actions.impl;

import dercs.behavior.StateTransition;

import dercs.behavior.actions.ActionsPackage;
import dercs.behavior.actions.ModifyStateAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify State Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.impl.ModifyStateActionImpl#getRelatedTransition <em>Related Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyStateActionImpl extends ObjectActionImpl implements ModifyStateAction {
	/**
	 * The cached value of the '{@link #getRelatedTransition() <em>Related Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTransition()
	 * @generated
	 * @ordered
	 */
	protected StateTransition relatedTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyStateActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.MODIFY_STATE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateTransition getRelatedTransition() {
		if (relatedTransition != null && relatedTransition.eIsProxy()) {
			InternalEObject oldRelatedTransition = (InternalEObject) relatedTransition;
			relatedTransition = (StateTransition) eResolveProxy(oldRelatedTransition);
			if (relatedTransition != oldRelatedTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.MODIFY_STATE_ACTION__RELATED_TRANSITION, oldRelatedTransition,
							relatedTransition));
			}
		}
		return relatedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition basicGetRelatedTransition() {
		return relatedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedTransition(StateTransition newRelatedTransition) {
		StateTransition oldRelatedTransition = relatedTransition;
		relatedTransition = newRelatedTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActionsPackage.MODIFY_STATE_ACTION__RELATED_TRANSITION, oldRelatedTransition, relatedTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActionsPackage.MODIFY_STATE_ACTION__RELATED_TRANSITION:
			if (resolve)
				return getRelatedTransition();
			return basicGetRelatedTransition();
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
		case ActionsPackage.MODIFY_STATE_ACTION__RELATED_TRANSITION:
			setRelatedTransition((StateTransition) newValue);
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
		case ActionsPackage.MODIFY_STATE_ACTION__RELATED_TRANSITION:
			setRelatedTransition((StateTransition) null);
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
		case ActionsPackage.MODIFY_STATE_ACTION__RELATED_TRANSITION:
			return relatedTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifyStateActionImpl
