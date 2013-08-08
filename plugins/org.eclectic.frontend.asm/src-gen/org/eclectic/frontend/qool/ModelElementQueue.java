/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.ClassUse;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.ModelElementQueue#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.ModelElementQueue#getAdditionals <em>Additionals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getModelElementQueue()
 * @model
 * @generated
 */
public interface ModelElementQueue extends QoolQueue {
	/**
	 * Returns the value of the '<em><b>Class </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class </em>' containment reference.
	 * @see #setClass_(ClassUse)
	 * @see org.eclectic.frontend.qool.QoolPackage#getModelElementQueue_Class_()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassUse getClass_();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.ModelElementQueue#getClass_ <em>Class </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class </em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(ClassUse value);

	/**
	 * Returns the value of the '<em><b>Additionals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.ClassUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionals</em>' containment reference list.
	 * @see org.eclectic.frontend.qool.QoolPackage#getModelElementQueue_Additionals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassUse> getAdditionals();

} // ModelElementQueue
