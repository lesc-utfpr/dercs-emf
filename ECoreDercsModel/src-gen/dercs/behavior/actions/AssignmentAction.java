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
package dercs.behavior.actions;

import dercs.behavior.LocalVariable;

import dercs.structure.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an assignment action. A value can be assigned either to a local
 * varible or to an attribute of an object.<br>
 * Assigment actions are specified within sequence diagram using the following
 * syntax:
 * <ol>
 *   <li><b></b></li>
 *   <li><b>UML replay</b>, where the name of the message can be a local variable
 *     or an attribute of the class.
 *   </li>
 *   <li><b>ASSIGN(leftSide, rightSide)</b>, where:<br>
 *      <i>leftSide</i> is the name of a local variable or an attribute<br>
 *      <i>rightSide</i> is a expression (e.g. mathematical, boolean, of string
 *      operation), a local variable, an attribute or a parameter.<br>
 *   </li>
 * </ol>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.AssignmentAction#getValue <em>Value</em>}</li>
 *   <li>{@link dercs.behavior.actions.AssignmentAction#getDestinationVariable <em>Destination Variable</em>}</li>
 *   <li>{@link dercs.behavior.actions.AssignmentAction#getDestinationAttribute <em>Destination Attribute</em>}</li>
 *   <li>{@link dercs.behavior.actions.AssignmentAction#getDestinationObject <em>Destination Object</em>}</li>
 *   <li>{@link dercs.behavior.actions.AssignmentAction#getDestinationArrayElement <em>Destination Array Element</em>}</li>
 *   <li>{@link dercs.behavior.actions.AssignmentAction#getResultOfAction <em>Result Of Action</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getAssignmentAction()
 * @model
 * @generated
 */
public interface AssignmentAction extends Action {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that will be assigned (If the right side is a literal value)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dercs.behavior.actions.ActionsPackage#getAssignmentAction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.AssignmentAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Destination Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variable which will be assigned with the new value (if the assignment is to a local variable)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Variable</em>' reference.
	 * @see #setDestinationVariable(LocalVariable)
	 * @see dercs.behavior.actions.ActionsPackage#getAssignmentAction_DestinationVariable()
	 * @model
	 * @generated
	 */
	LocalVariable getDestinationVariable();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.AssignmentAction#getDestinationVariable <em>Destination Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Variable</em>' reference.
	 * @see #getDestinationVariable()
	 * @generated
	 */
	void setDestinationVariable(LocalVariable value);

	/**
	 * Returns the value of the '<em><b>Destination Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute which will be assigned with the new value (if the assignment is to an attribute)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Attribute</em>' reference.
	 * @see #setDestinationAttribute(Attribute)
	 * @see dercs.behavior.actions.ActionsPackage#getAssignmentAction_DestinationAttribute()
	 * @model
	 * @generated
	 */
	Attribute getDestinationAttribute();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.AssignmentAction#getDestinationAttribute <em>Destination Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Attribute</em>' reference.
	 * @see #getDestinationAttribute()
	 * @generated
	 */
	void setDestinationAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Destination Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object whose attribute will receive the new value (if the assignment is to an attribute)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Object</em>' reference.
	 * @see #setDestinationObject(dercs.structure.runtime.Object)
	 * @see dercs.behavior.actions.ActionsPackage#getAssignmentAction_DestinationObject()
	 * @model
	 * @generated
	 */
	dercs.structure.runtime.Object getDestinationObject();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.AssignmentAction#getDestinationObject <em>Destination Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Object</em>' reference.
	 * @see #getDestinationObject()
	 * @generated
	 */
	void setDestinationObject(dercs.structure.runtime.Object value);

	/**
	 * Returns the value of the '<em><b>Destination Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The array element which will be assigned with the new value (if the assignment is to an array)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Array Element</em>' attribute.
	 * @see #setDestinationArrayElement(int)
	 * @see dercs.behavior.actions.ActionsPackage#getAssignmentAction_DestinationArrayElement()
	 * @model
	 * @generated
	 */
	int getDestinationArrayElement();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.AssignmentAction#getDestinationArrayElement <em>Destination Array Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Array Element</em>' attribute.
	 * @see #getDestinationArrayElement()
	 * @generated
	 */
	void setDestinationArrayElement(int value);

	/**
	 * Returns the value of the '<em><b>Result Of Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action whose result will be assigned (If the right side is the result of an action)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Of Action</em>' reference.
	 * @see #setResultOfAction(ActionWithOutput)
	 * @see dercs.behavior.actions.ActionsPackage#getAssignmentAction_ResultOfAction()
	 * @model
	 * @generated
	 */
	ActionWithOutput getResultOfAction();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.AssignmentAction#getResultOfAction <em>Result Of Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of Action</em>' reference.
	 * @see #getResultOfAction()
	 * @generated
	 */
	void setResultOfAction(ActionWithOutput value);

	// MANUALLY ADDED

	/**
	 * Indicate whether a value will be assigned with a variable or attribute.
	 * @return TRUE if a value was associated with the assignment action,
	 * FALSE otherwise.
	 * @generated NOT
	 */
	default boolean isAssignmentOfValue() {
		return (getResultOfAction() == null) && (getValue() != null);
	}

	/**
	 * Indicate whether the result of an action will be assigned to a
	 * variable of an attribute.
	 * @return TRUE if an action was associated with the assignment action,
	 * FALSE otherwise.
	 * @generated NOT
	 */
	default boolean isAssignmentOfActionResult() {
		return (getResultOfAction() != null) && (getValue() == null);
	}

	/**
	 * Indicate whether the assignment action is an assignment of a value into an
	 * attribute.
	 * @return TRUE if destination object and attribute are not null, FALSE 
	 * otherwise.
	 * @generated NOT
	 */
	default boolean isAttributeAssignment() {
		return (this.getDestinationAttribute() != null) && (this.getDestinationVariable() == null);
	}

	/**
	 * Indicate whether the assignment action is an assignment of a value into a
	 * local variable.
	 * @return TRUE if destination variable is not null, FALSE otherwise.
	 * @generated NOT
	 */
	default boolean isVariableAssignment() {
		return (this.getDestinationAttribute() == null) && (this.getDestinationVariable() != null);
	}

	//=== COMPATIBILITY ===

	/**
	 * @generated NOT
	 */
	default Attribute getAttribute() {
		return getDestinationAttribute();
	}

	/**
	 * @generated NOT
	 */
	default LocalVariable getVariable() {
		return getDestinationVariable();
	}

	/**
	 * @generated NOT
	 */
	default dercs.structure.runtime.Object getObject() {
		return getDestinationObject();
	}

	/**
	 * @generated NOT
	 */
	default ActionWithOutput getAction() {
		return getResultOfAction();
	}

} // AssignmentAction
