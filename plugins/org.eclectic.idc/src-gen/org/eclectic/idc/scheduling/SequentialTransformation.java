/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling;

import org.eclectic.idc.core.ExecutableUnit;
import org.eclectic.idc.core.ModelDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.scheduling.SequentialTransformation#getExecutions <em>Executions</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.SequentialTransformation#getIntermediateModels <em>Intermediate Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.scheduling.SchedulingPackage#getSequentialTransformation()
 * @model
 * @generated
 */
public interface SequentialTransformation extends ExecutableUnit {
	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.scheduling.TransformationExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executions</em>' containment reference list.
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getSequentialTransformation_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationExecution> getExecutions();

	/**
	 * Returns the value of the '<em><b>Intermediate Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.ModelDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Models</em>' containment reference list.
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getSequentialTransformation_IntermediateModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelDefinition> getIntermediateModels();

} // SequentialTransformation
