/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;

import org.eclectic.frontend.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Optional Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.WithOptionalVariableExpression#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.WithOptionalVariableExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getWithOptionalVariableExpression()
 * @model
 * @generated
 */
public interface WithOptionalVariableExpression extends SourceExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(ObjectSourceVariable)
	 * @see org.eclectic.frontend.tao.TaoPackage#getWithOptionalVariableExpression_Variable()
	 * @model containment="true"
	 * @generated
	 */
	ObjectSourceVariable getVariable();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.WithOptionalVariableExpression#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ObjectSourceVariable value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see org.eclectic.frontend.tao.TaoPackage#getWithOptionalVariableExpression_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.WithOptionalVariableExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // WithOptionalVariableExpression
