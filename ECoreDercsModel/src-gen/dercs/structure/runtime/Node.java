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
package dercs.structure.runtime;

import dercs.structure.BaseElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent the processing nodes of a DERTS. Objects can be deployed into 
 * different nodes, which can be located in different physical places. Additionally,
 * they can represent configurable hardware nodes (in this case the objects are 
 * themselves hardware components), as well as normal nodes (off-the-shelf 
 * processor, in this case the objects are software components).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.Node#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link dercs.structure.runtime.Node#getDeployedObjects <em>Deployed Objects</em>}</li>
 * </ul>
 *
 * @see dercs.structure.runtime.RuntimePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name of the platform
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform Name</em>' attribute.
	 * @see #setPlatformName(String)
	 * @see dercs.structure.runtime.RuntimePackage#getNode_PlatformName()
	 * @model
	 * @generated
	 */
	String getPlatformName();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.Node#getPlatformName <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Name</em>' attribute.
	 * @see #getPlatformName()
	 * @generated
	 */
	void setPlatformName(String value);

	/**
	 * Returns the value of the '<em><b>Deployed Objects</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.structure.runtime.Object}.
	 * It is bidirectional and its opposite is '{@link dercs.structure.runtime.Object#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of all objects which reside in the node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Objects</em>' containment reference list.
	 * @see dercs.structure.runtime.RuntimePackage#getNode_DeployedObjects()
	 * @see dercs.structure.runtime.Object#getNode
	 * @model opposite="node" containment="true"
	 * @generated
	 */
	EList<dercs.structure.runtime.Object> getDeployedObjects();

} // Node
