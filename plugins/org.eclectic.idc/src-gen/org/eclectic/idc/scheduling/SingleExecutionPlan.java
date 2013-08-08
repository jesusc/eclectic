/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.scheduling.SingleExecutionPlan#getExecutionPlan <em>Execution Plan</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.SingleExecutionPlan#getModelLinks <em>Model Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.scheduling.SchedulingPackage#getSingleExecutionPlan()
 * @model
 * @generated
 */
public interface SingleExecutionPlan extends Single {
	/**
	 * Returns the value of the '<em><b>Execution Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Plan</em>' reference.
	 * @see #setExecutionPlan(ExecutionPlan)
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getSingleExecutionPlan_ExecutionPlan()
	 * @model required="true"
	 * @generated
	 */
	ExecutionPlan getExecutionPlan();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.scheduling.SingleExecutionPlan#getExecutionPlan <em>Execution Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Plan</em>' reference.
	 * @see #getExecutionPlan()
	 * @generated
	 */
	void setExecutionPlan(ExecutionPlan value);

	/**
	 * Returns the value of the '<em><b>Model Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.scheduling.ModelLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Links</em>' containment reference list.
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getSingleExecutionPlan_ModelLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelLink> getModelLinks();

} // SingleExecutionPlan
