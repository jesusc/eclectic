/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;

import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.WithVariableExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getWithVariableExpression()
 * @model
 * @generated
 */
public interface WithVariableExpression extends SourceExpression, Variable {
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
	 * @see org.eclectic.frontend.tao.TaoPackage#getWithVariableExpression_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.WithVariableExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // WithVariableExpression
