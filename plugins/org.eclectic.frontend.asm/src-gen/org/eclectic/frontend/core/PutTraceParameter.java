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
 * A representation of the model object '<em><b>Put Trace Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.PutTraceParameter#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.PutTraceParameter#getTraceVar <em>Trace Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getPutTraceParameter()
 * @model
 * @generated
 */
public interface PutTraceParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.eclectic.frontend.core.CorePackage#getPutTraceParameter_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.PutTraceParameter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

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
	 * @see org.eclectic.frontend.core.CorePackage#getPutTraceParameter_TraceVar()
	 * @model required="true"
	 * @generated
	 */
	TraceElement getTraceVar();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.PutTraceParameter#getTraceVar <em>Trace Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Var</em>' reference.
	 * @see #getTraceVar()
	 * @generated
	 */
	void setTraceVar(TraceElement value);

} // PutTraceParameter
