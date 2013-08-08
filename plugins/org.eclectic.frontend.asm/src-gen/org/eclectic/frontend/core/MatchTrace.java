/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.MatchTrace#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.MatchTrace#getTraceExpr <em>Trace Expr</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.MatchTrace#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getMatchTrace()
 * @model
 * @generated
 */
public interface MatchTrace extends Expression {
	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(TraceDefinition)
	 * @see org.eclectic.frontend.core.CorePackage#getMatchTrace_Trace()
	 * @model required="true"
	 * @generated
	 */
	TraceDefinition getTrace();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.MatchTrace#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(TraceDefinition value);

	/**
	 * Returns the value of the '<em><b>Trace Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Expr</em>' containment reference.
	 * @see #setTraceExpr(TraceCompareExpression)
	 * @see org.eclectic.frontend.core.CorePackage#getMatchTrace_TraceExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TraceCompareExpression getTraceExpr();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.MatchTrace#getTraceExpr <em>Trace Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Expr</em>' containment reference.
	 * @see #getTraceExpr()
	 * @generated
	 */
	void setTraceExpr(TraceCompareExpression value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link org.eclectic.frontend.core.ResolveTraceCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclectic.frontend.core.ResolveTraceCardinality
	 * @see #setCardinality(ResolveTraceCardinality)
	 * @see org.eclectic.frontend.core.CorePackage#getMatchTrace_Cardinality()
	 * @model default="0" required="true"
	 * @generated
	 */
	ResolveTraceCardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.MatchTrace#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclectic.frontend.core.ResolveTraceCardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(ResolveTraceCardinality value);

} // MatchTrace
