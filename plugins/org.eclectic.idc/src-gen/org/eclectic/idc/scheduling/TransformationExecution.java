/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling;

import org.eclectic.idc.core.LocatedElement;
import org.eclectic.idc.core.ModelDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.scheduling.TransformationExecution#getTransformationName <em>Transformation Name</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.TransformationExecution#getInModels <em>In Models</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.TransformationExecution#getOutModels <em>Out Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.scheduling.SchedulingPackage#getTransformationExecution()
 * @model
 * @generated
 */
public interface TransformationExecution extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Name</em>' attribute.
	 * @see #setTransformationName(String)
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getTransformationExecution_TransformationName()
	 * @model required="true"
	 * @generated
	 */
	String getTransformationName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.scheduling.TransformationExecution#getTransformationName <em>Transformation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Name</em>' attribute.
	 * @see #getTransformationName()
	 * @generated
	 */
	void setTransformationName(String value);

	/**
	 * Returns the value of the '<em><b>In Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.ModelDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Models</em>' reference list.
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getTransformationExecution_InModels()
	 * @model
	 * @generated
	 */
	EList<ModelDefinition> getInModels();

	/**
	 * Returns the value of the '<em><b>Out Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.ModelDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Models</em>' reference list.
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getTransformationExecution_OutModels()
	 * @model
	 * @generated
	 */
	EList<ModelDefinition> getOutModels();

} // TransformationExecution
