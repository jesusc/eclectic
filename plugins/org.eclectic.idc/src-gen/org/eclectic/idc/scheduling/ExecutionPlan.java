/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling;

import org.eclectic.idc.core.ExecutableUnit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.scheduling.ExecutionPlan#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.ExecutionPlan#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.scheduling.SchedulingPackage#getExecutionPlan()
 * @model
 * @generated
 */
public interface ExecutionPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.ExecutableUnit#getExecutionPlan <em>Execution Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' container reference.
	 * @see #setUnit(ExecutableUnit)
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getExecutionPlan_Unit()
	 * @see org.eclectic.idc.core.ExecutableUnit#getExecutionPlan
	 * @model opposite="executionPlan" required="true" transient="false"
	 * @generated
	 */
	ExecutableUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.scheduling.ExecutionPlan#getUnit <em>Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' container reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ExecutableUnit value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Node)
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getExecutionPlan_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getRoot();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.scheduling.ExecutionPlan#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Node value);

} // ExecutionPlan
