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

import dercs.structure.Attribute;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent instances of classes. They are the base unit of DERTS specification. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.Object#getNode <em>Node</em>}</li>
 *   <li>{@link dercs.structure.runtime.Object#getInstanceOfClass <em>Instance Of Class</em>}</li>
 *   <li>{@link dercs.structure.runtime.Object#getRuntimeInformation <em>Runtime Information</em>}</li>
 * </ul>
 *
 * @see dercs.structure.runtime.RuntimePackage#getObject()
 * @model
 * @generated
 */
public interface Object extends RuntimeElement {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dercs.structure.runtime.Node#getDeployedObjects <em>Deployed Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The runtime node that contains this object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see dercs.structure.runtime.RuntimePackage#getObject_Node()
	 * @see dercs.structure.runtime.Node#getDeployedObjects
	 * @model opposite="deployedObjects" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.Object#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Instance Of Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class that this object is an instance of
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Of Class</em>' reference.
	 * @see #setInstanceOfClass(dercs.structure.Class)
	 * @see dercs.structure.runtime.RuntimePackage#getObject_InstanceOfClass()
	 * @model
	 * @generated
	 */
	dercs.structure.Class getInstanceOfClass();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.Object#getInstanceOfClass <em>Instance Of Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Class</em>' reference.
	 * @see #getInstanceOfClass()
	 * @generated
	 */
	void setInstanceOfClass(dercs.structure.Class value);

	/**
	 * Returns the value of the '<em><b>Runtime Information</b></em>' reference list.
	 * The list contents are of type {@link dercs.structure.runtime.AttributeRuntimeInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of RuntimeInformations related to all attributes of the object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runtime Information</em>' reference list.
	 * @see dercs.structure.runtime.RuntimePackage#getObject_RuntimeInformation()
	 * @model
	 * @generated
	 */
	EList<AttributeRuntimeInformation> getRuntimeInformation();

	// MANUALLY ADDED

	/**
	 * Creates a list of AttributeRuntimeInformation objects associates to this object.
	 * This will help tools such as the UML model simulators. 
	 * @generated NOT
	 */
	default void createRuntimeInformationForAttributes() {
		dercs.structure.Class currentClass = this.getInstanceOfClass();
		while (currentClass != null) {
			for (Attribute attr : currentClass.getAttributes()) {
				AttributeRuntimeInformation info = RuntimeFactory.eINSTANCE.createAttributeRuntimeInformation();
				info.setRelatedObject(this);
				info.setRelatedAttribute(attr);
				info.setValue("");
				this.getRuntimeInformation().add(info);
			}
			currentClass = currentClass.getSuperClass();
		}
	}

	/**
	 * (re)Create the RuntimeInformation objects associated with the attributes 
	 * of the object.
	 * If there are any RuntimeInformation objects, they are destroyed and new ones are created.
	 * It is important to note that the values associated with the old objects are lost, since
	 * the new objects do not copy the old state. 
	 * @generated NOT
	 */
	default void recreateRuntimeInformationForAttributes() {
		this.getRuntimeInformation().clear();
		createRuntimeInformationForAttributes();
	}

	//=== COMPATIBILITY ===

	/**
	 * @generated NOT
	 */
	default dercs.structure.Class getInstanceOf() {
		return getInstanceOfClass();
	}

} // Object
