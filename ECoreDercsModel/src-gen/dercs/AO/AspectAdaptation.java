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

import dercs.structure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the adaptation which an aspect applies in a determined join point.
 * An adaptation specifies in what way the concern's structure or behavior is 
 * adapted. An adaptation specication is implemented by structural adaptations 
 * or behavioral adaptations or both.
 * ECORE: the owner attribute was moved to the child classes, because otherwise 
 * containment relationships would not wokr correctly
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.AspectAdaptation#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see dercs.AO.AOPackage#getAspectAdaptation()
 * @model abstract="true"
 * @generated
 */
public interface AspectAdaptation extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aspect which owns this adaptation
	 * NOTE: Due to Ecore limitations this is not automatically set when adding the Adaptation to an aspect. It must be manually set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Aspect)
	 * @see dercs.AO.AOPackage#getAspectAdaptation_Owner()
	 * @model
	 * @generated
	 */
	Aspect getOwner();

	/**
	 * Sets the value of the '{@link dercs.AO.AspectAdaptation#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Aspect value);
} // AspectAdaptation
