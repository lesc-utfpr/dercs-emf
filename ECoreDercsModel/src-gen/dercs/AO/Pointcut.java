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

import dercs.structure.BaseElement;
import dercs.structure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the pointcuts used by aspects to link join points with adaptations.
 * If the pointcut has more than one join point, the adaptation will be applied
 * into all different join points respecting the indicated relative position.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.Pointcut#getJoinPoints <em>Join Points</em>}</li>
 *   <li>{@link dercs.AO.Pointcut#getAspectAdaptation <em>Aspect Adaptation</em>}</li>
 *   <li>{@link dercs.AO.Pointcut#getRelativePosition <em>Relative Position</em>}</li>
 * </ul>
 *
 * @see dercs.AO.AOPackage#getPointcut()
 * @model
 * @generated
 */
public interface Pointcut extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Join Points</b></em>' reference list.
	 * The list contents are of type {@link dercs.AO.JoinPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of join points linked with the aspect adaptation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Join Points</em>' reference list.
	 * @see dercs.AO.AOPackage#getPointcut_JoinPoints()
	 * @model
	 * @generated
	 */
	EList<JoinPoint> getJoinPoints();

	/**
	 * Returns the value of the '<em><b>Aspect Adaptation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aspect adaptation that should be applied into the join point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aspect Adaptation</em>' reference.
	 * @see #setAspectAdaptation(AspectAdaptation)
	 * @see dercs.AO.AOPackage#getPointcut_AspectAdaptation()
	 * @model
	 * @generated
	 */
	AspectAdaptation getAspectAdaptation();

	/**
	 * Sets the value of the '{@link dercs.AO.Pointcut#getAspectAdaptation <em>Aspect Adaptation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Adaptation</em>' reference.
	 * @see #getAspectAdaptation()
	 * @generated
	 */
	void setAspectAdaptation(AspectAdaptation value);

	/**
	 * Returns the value of the '<em><b>Relative Position</b></em>' attribute.
	 * The literals are from the enumeration {@link dercs.AO.RelativePosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative position where the adaptation should be applied
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Position</em>' attribute.
	 * @see dercs.AO.RelativePosition
	 * @see #setRelativePosition(RelativePosition)
	 * @see dercs.AO.AOPackage#getPointcut_RelativePosition()
	 * @model
	 * @generated
	 */
	RelativePosition getRelativePosition();

	/**
	 * Sets the value of the '{@link dercs.AO.Pointcut#getRelativePosition <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Position</em>' attribute.
	 * @see dercs.AO.RelativePosition
	 * @see #getRelativePosition()
	 * @generated
	 */
	void setRelativePosition(RelativePosition value);

	// MANUALLY ADDED

	/**
	 * Clone a pointcut, i.e. create a copy of the join point with the same internal elements.
	 * @return A new pointcut with the same internal information.
	 * @generated NOT
	 */
	default Pointcut clonePointcut() {
		Pointcut newObj = AOFactory.eINSTANCE.createPointcut();
		newObj.setName(this.getName());
		newObj.setRelativePosition(this.getRelativePosition());
		newObj.setAspectAdaptation(this.getAspectAdaptation());
		newObj.getJoinPoints().addAll(this.getJoinPoints());
		return newObj;
	}

	/**
	 * Checks if the element is selected by any joinpoints of the pointcut.
	 * @param element Element to be checked.
	 * @return TRUE is the element is selected in one of the joinpoints, FALSE otherwise.
	 * @generated NOT
	 */
	default boolean checkElement(BaseElement element) {
		for (JoinPoint jp : this.getJoinPoints()) {
			if (jp.isElementSelected(element)) {
				return true;
			}
		}
		return false;
	}

} // Pointcut
