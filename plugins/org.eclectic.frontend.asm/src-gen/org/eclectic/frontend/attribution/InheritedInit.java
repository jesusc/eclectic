/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution;

import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inherited Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.attribution.InheritedInit#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.InheritedInit#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.InheritedInit#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.attribution.AttributionPackage#getInheritedInit()
 * @model
 * @generated
 */
public interface InheritedInit extends Statement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(InheritedAttributeDcl)
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getInheritedInit_Attribute()
	 * @model required="true"
	 * @generated
	 */
	InheritedAttributeDcl getAttribute();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.InheritedInit#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(InheritedAttributeDcl value);

	/**
	 * Returns the value of the '<em><b>Receptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor</em>' containment reference.
	 * @see #setReceptor(Expression)
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getInheritedInit_Receptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.InheritedInit#getReceptor <em>Receptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' containment reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getInheritedInit_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.InheritedInit#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // InheritedInit
