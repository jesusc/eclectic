/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.Queue#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.Queue#getOptimizations <em>Optimizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getQueue()
 * @model abstract="true"
 * @generated
 */
public interface Queue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclectic.idc.qool.QoolPackage#getQueue_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.Queue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Optimizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.qool.QueueOptimization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimizations</em>' containment reference list.
	 * @see org.eclectic.idc.qool.QoolPackage#getQueue_Optimizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueueOptimization> getOptimizations();

} // Queue
