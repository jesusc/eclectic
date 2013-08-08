/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.TraceCompareExpression#isMultivaluedTag <em>Multivalued Tag</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.TraceCompareExpression#getTraceVar <em>Trace Var</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.TraceCompareExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getTraceCompareExpression()
 * @model
 * @generated
 */
public interface TraceCompareExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Multivalued Tag</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multivalued Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multivalued Tag</em>' attribute.
	 * @see #setMultivaluedTag(boolean)
	 * @see org.eclectic.frontend.core.CorePackage#getTraceCompareExpression_MultivaluedTag()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMultivaluedTag();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.TraceCompareExpression#isMultivaluedTag <em>Multivalued Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multivalued Tag</em>' attribute.
	 * @see #isMultivaluedTag()
	 * @generated
	 */
	void setMultivaluedTag(boolean value);

	/**
	 * Returns the value of the '<em><b>Trace Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Var</em>' reference.
	 * @see #setTraceVar(TraceElement)
	 * @see org.eclectic.frontend.core.CorePackage#getTraceCompareExpression_TraceVar()
	 * @model required="true"
	 * @generated
	 */
	TraceElement getTraceVar();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.TraceCompareExpression#getTraceVar <em>Trace Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Var</em>' reference.
	 * @see #getTraceVar()
	 * @generated
	 */
	void setTraceVar(TraceElement value);

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
	 * @see org.eclectic.frontend.core.CorePackage#getTraceCompareExpression_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.TraceCompareExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // TraceCompareExpression
