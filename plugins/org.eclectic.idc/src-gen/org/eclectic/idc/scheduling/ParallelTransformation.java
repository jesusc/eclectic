/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling;

import org.eclectic.idc.core.ExecutableUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.scheduling.ParallelTransformation#getExecutions <em>Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.scheduling.SchedulingPackage#getParallelTransformation()
 * @model
 * @generated
 */
public interface ParallelTransformation extends ExecutableUnit {
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
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getParallelTransformation_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationExecution> getExecutions();

} // ParallelTransformation
