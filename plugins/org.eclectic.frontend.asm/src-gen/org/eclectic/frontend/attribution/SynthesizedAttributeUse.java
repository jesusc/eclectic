/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution;

import org.eclectic.frontend.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synthesized Attribute Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.attribution.SynthesizedAttributeUse#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.SynthesizedAttributeUse#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.attribution.AttributionPackage#getSynthesizedAttributeUse()
 * @model
 * @generated
 */
public interface SynthesizedAttributeUse extends Expression {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(SynthesizedAttributeDcl)
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getSynthesizedAttributeUse_Attribute()
	 * @model required="true"
	 * @generated
	 */
	SynthesizedAttributeDcl getAttribute();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.SynthesizedAttributeUse#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(SynthesizedAttributeDcl value);

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
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getSynthesizedAttributeUse_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.SynthesizedAttributeUse#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // SynthesizedAttributeUse
