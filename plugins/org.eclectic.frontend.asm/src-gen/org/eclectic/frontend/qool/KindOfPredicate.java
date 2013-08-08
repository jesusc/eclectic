/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.ClassUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind Of Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.KindOfPredicate#getClass_ <em>Class </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getKindOfPredicate()
 * @model
 * @generated
 */
public interface KindOfPredicate extends MatchPredicate {
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
	 * @see org.eclectic.frontend.qool.QoolPackage#getKindOfPredicate_Class_()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassUse getClass_();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.KindOfPredicate#getClass_ <em>Class </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class </em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(ClassUse value);

} // KindOfPredicate
