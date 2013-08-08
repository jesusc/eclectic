/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.Statement;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.ObjectInstantiation#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.ObjectInstantiation#getAssigments <em>Assigments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getObjectInstantiation()
 * @model
 * @generated
 */
public interface ObjectInstantiation extends Variable, Statement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ClassUse)
	 * @see org.eclectic.frontend.tao.TaoPackage#getObjectInstantiation_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassUse getType();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.ObjectInstantiation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassUse value);

	/**
	 * Returns the value of the '<em><b>Assigments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.tao.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigments</em>' containment reference list.
	 * @see org.eclectic.frontend.tao.TaoPackage#getObjectInstantiation_Assigments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssigments();

} // ObjectInstantiation
