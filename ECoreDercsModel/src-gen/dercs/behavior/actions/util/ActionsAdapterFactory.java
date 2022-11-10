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
package dercs.behavior.actions.util;

import dercs.behavior.BehavioralElement;

import dercs.behavior.actions.*;

import dercs.structure.BaseElement;
import dercs.structure.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dercs.behavior.actions.ActionsPackage
 * @generated
 */
public class ActionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionsSwitch<Adapter> modelSwitch = new ActionsSwitch<Adapter>() {
		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseActionWithOutput(ActionWithOutput object) {
			return createActionWithOutputAdapter();
		}

		@Override
		public Adapter caseSendMessageAction(SendMessageAction object) {
			return createSendMessageActionAdapter();
		}

		@Override
		public Adapter caseArrayAction(ArrayAction object) {
			return createArrayActionAdapter();
		}

		@Override
		public Adapter caseObjectAction(ObjectAction object) {
			return createObjectActionAdapter();
		}

		@Override
		public Adapter caseCreateObjectAction(CreateObjectAction object) {
			return createCreateObjectActionAdapter();
		}

		@Override
		public Adapter caseDestroyObjectAction(DestroyObjectAction object) {
			return createDestroyObjectActionAdapter();
		}

		@Override
		public Adapter caseGetArrayElementAction(GetArrayElementAction object) {
			return createGetArrayElementActionAdapter();
		}

		@Override
		public Adapter caseGetArrayLengthAction(GetArrayLengthAction object) {
			return createGetArrayLengthActionAdapter();
		}

		@Override
		public Adapter caseInsertArrayElementAction(InsertArrayElementAction object) {
			return createInsertArrayElementActionAdapter();
		}

		@Override
		public Adapter caseRemoveArrayElementAction(RemoveArrayElementAction object) {
			return createRemoveArrayElementActionAdapter();
		}

		@Override
		public Adapter caseSetArrayElementAction(SetArrayElementAction object) {
			return createSetArrayElementActionAdapter();
		}

		@Override
		public Adapter caseReturnAction(ReturnAction object) {
			return createReturnActionAdapter();
		}

		@Override
		public Adapter caseModifyStateAction(ModifyStateAction object) {
			return createModifyStateActionAdapter();
		}

		@Override
		public Adapter caseExpressionAction(ExpressionAction object) {
			return createExpressionActionAdapter();
		}

		@Override
		public Adapter caseAssignmentAction(AssignmentAction object) {
			return createAssignmentActionAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseBaseElement(BaseElement object) {
			return createBaseElementAdapter();
		}

		@Override
		public Adapter caseBehavioralElement(BehavioralElement object) {
			return createBehavioralElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.ActionWithOutput <em>Action With Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.ActionWithOutput
	 * @generated
	 */
	public Adapter createActionWithOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.SendMessageAction <em>Send Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.SendMessageAction
	 * @generated
	 */
	public Adapter createSendMessageActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.ArrayAction <em>Array Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.ArrayAction
	 * @generated
	 */
	public Adapter createArrayActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.ObjectAction <em>Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.ObjectAction
	 * @generated
	 */
	public Adapter createObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.CreateObjectAction
	 * @generated
	 */
	public Adapter createCreateObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.DestroyObjectAction
	 * @generated
	 */
	public Adapter createDestroyObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.GetArrayElementAction <em>Get Array Element Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.GetArrayElementAction
	 * @generated
	 */
	public Adapter createGetArrayElementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.GetArrayLengthAction <em>Get Array Length Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.GetArrayLengthAction
	 * @generated
	 */
	public Adapter createGetArrayLengthActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.InsertArrayElementAction <em>Insert Array Element Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.InsertArrayElementAction
	 * @generated
	 */
	public Adapter createInsertArrayElementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.RemoveArrayElementAction <em>Remove Array Element Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.RemoveArrayElementAction
	 * @generated
	 */
	public Adapter createRemoveArrayElementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.SetArrayElementAction <em>Set Array Element Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.SetArrayElementAction
	 * @generated
	 */
	public Adapter createSetArrayElementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.ReturnAction <em>Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.ReturnAction
	 * @generated
	 */
	public Adapter createReturnActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.ModifyStateAction <em>Modify State Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.ModifyStateAction
	 * @generated
	 */
	public Adapter createModifyStateActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.ExpressionAction <em>Expression Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.ExpressionAction
	 * @generated
	 */
	public Adapter createExpressionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.actions.AssignmentAction <em>Assignment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.actions.AssignmentAction
	 * @generated
	 */
	public Adapter createAssignmentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.behavior.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.behavior.BehavioralElement
	 * @generated
	 */
	public Adapter createBehavioralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ActionsAdapterFactory
