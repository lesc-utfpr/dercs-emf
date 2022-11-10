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
package dercs.AO;

import dercs.Model;

import dercs.structure.BaseElement;
import dercs.structure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the joint points used by the aspects weaver to discover the point
 * where the adaptations should be applied. A join point specifies where an 
 * aspect might insert adaptations. Thus a join point is a representation of the 
 * selection of identiable structural or behavioral elements of the underlying 
 * language used to capture a concern.
 * <br>At the moment, the folowing elements can be selected:
 * <OL>
 * <LI>Classes;</LI>
 * <LI>Attributes;</LI>
 * <LI>Methods;</LI>
 * <LI>Objects (for structural adaptation, which need runtime information);</LI>
 * <LI>Nodes;</LI>
 * <LI>Behaviors;</LI>
 * <LI>The following actions:
 *     <OL>
 *     <LI>Sending messages;</LI>
 *     <LI>Return;</LI>
 *     <LI>Object creation;</LI>
 *     <LI>Object destruction;</LI>
 *     </OL>
 * </LI>
 * </OL>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.JoinPoint#getSelectedElements <em>Selected Elements</em>}</li>
 *   <li>{@link dercs.AO.JoinPoint#getModel <em>Model</em>}</li>
 *   <li>{@link dercs.AO.JoinPoint#getElementSelectionKind <em>Element Selection Kind</em>}</li>
 * </ul>
 *
 * @see dercs.AO.AOPackage#getJoinPoint()
 * @model
 * @generated
 */
public interface JoinPoint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Selected Elements</b></em>' reference list.
	 * The list contents are of type {@link dercs.structure.BaseElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of all elements selected by the join point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Elements</em>' reference list.
	 * @see dercs.AO.AOPackage#getJoinPoint_SelectedElements()
	 * @model
	 * @generated
	 */
	EList<BaseElement> getSelectedElements();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dercs.Model#getJoinPoints <em>Join Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owner model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see dercs.AO.AOPackage#getJoinPoint_Model()
	 * @see dercs.Model#getJoinPoints
	 * @model opposite="joinPoints"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link dercs.AO.JoinPoint#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Element Selection Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link dercs.AO.ElementSelectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of element selected by this join point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Selection Kind</em>' attribute.
	 * @see dercs.AO.ElementSelectionKind
	 * @see #setElementSelectionKind(ElementSelectionKind)
	 * @see dercs.AO.AOPackage#getJoinPoint_ElementSelectionKind()
	 * @model
	 * @generated
	 */
	ElementSelectionKind getElementSelectionKind();

	/**
	 * Sets the value of the '{@link dercs.AO.JoinPoint#getElementSelectionKind <em>Element Selection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Selection Kind</em>' attribute.
	 * @see dercs.AO.ElementSelectionKind
	 * @see #getElementSelectionKind()
	 * @generated
	 */
	void setElementSelectionKind(ElementSelectionKind value);

	// MANUALLY ADDED

	/**
	 * Indicate if an element was selected by the joinpoint.
	 * @param element The element to be checked.
	 * @return TRUE if the element can be found in the selected elements list.
	 * @generated NOT
	 */
	default boolean isElementSelected(BaseElement element) {
		return this.getSelectedElements().contains(element);
	}

} // JoinPoint
