/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.QoolQueue#getOptimizations <em>Optimizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getQoolQueue()
 * @model abstract="true"
 * @generated
 */
public interface QoolQueue extends LocatedElement, NamedElement {

	/**
	 * Returns the value of the '<em><b>Optimizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.qool.QueueOptimization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimizations</em>' containment reference list.
	 * @see org.eclectic.frontend.qool.QoolPackage#getQoolQueue_Optimizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueueOptimization> getOptimizations();
} // QoolQueue
