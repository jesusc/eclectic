/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.BinaryExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.BinaryExpr#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.BinaryExpr#getBinaryOp <em>Binary Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getBinaryExpr()
 * @model
 * @generated
 */
public interface BinaryExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see org.eclectic.frontend.core.CorePackage#getBinaryExpr_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.BinaryExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

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
	 * @see org.eclectic.frontend.core.CorePackage#getBinaryExpr_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.BinaryExpr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

	/**
	 * Returns the value of the '<em><b>Binary Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclectic.frontend.core.BinaryOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Op</em>' attribute.
	 * @see org.eclectic.frontend.core.BinaryOp
	 * @see #setBinaryOp(BinaryOp)
	 * @see org.eclectic.frontend.core.CorePackage#getBinaryExpr_BinaryOp()
	 * @model required="true"
	 * @generated
	 */
	BinaryOp getBinaryOp();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.BinaryExpr#getBinaryOp <em>Binary Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Op</em>' attribute.
	 * @see org.eclectic.frontend.core.BinaryOp
	 * @see #getBinaryOp()
	 * @generated
	 */
	void setBinaryOp(BinaryOp value);

} // BinaryExpr
