/**
 */
package dercs.behavior.actions.impl;

import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionWithOutput;
import dercs.behavior.actions.ActionsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action With Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.impl.ActionWithOutputImpl#getOutputReceiverAction <em>Output Receiver Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionWithOutputImpl extends ActionImpl implements ActionWithOutput {
	/**
	 * The cached value of the '{@link #getOutputReceiverAction() <em>Output Receiver Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputReceiverAction()
	 * @generated
	 * @ordered
	 */
	protected Action outputReceiverAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionWithOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ACTION_WITH_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getOutputReceiverAction() {
		if (outputReceiverAction != null && outputReceiverAction.eIsProxy()) {
			InternalEObject oldOutputReceiverAction = (InternalEObject) outputReceiverAction;
			outputReceiverAction = (Action) eResolveProxy(oldOutputReceiverAction);
			if (outputReceiverAction != oldOutputReceiverAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActionsPackage.ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION, oldOutputReceiverAction,
							outputReceiverAction));
			}
		}
		return outputReceiverAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetOutputReceiverAction() {
		return outputReceiverAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputReceiverAction(Action newOutputReceiverAction) {
		Action oldOutputReceiverAction = outputReceiverAction;
		outputReceiverAction = newOutputReceiverAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActionsPackage.ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION, oldOutputReceiverAction,
					outputReceiverAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActionsPackage.ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION:
			if (resolve)
				return getOutputReceiverAction();
			return basicGetOutputReceiverAction();
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
		case ActionsPackage.ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION:
			setOutputReceiverAction((Action) newValue);
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
		case ActionsPackage.ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION:
			setOutputReceiverAction((Action) null);
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
		case ActionsPackage.ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION:
			return outputReceiverAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionWithOutputImpl
