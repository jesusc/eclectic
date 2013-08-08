/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;

import org.eclectic.frontend.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.GetExpression#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.GetExpression#getReceptor <em>Receptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getGetExpression()
 * @model
 * @generated
 */
public interface GetExpression extends SourceExpression, Variable {
	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Feature</em>' attribute.
	 * @see #setSourceFeature(String)
	 * @see org.eclectic.frontend.tao.TaoPackage#getGetExpression_SourceFeature()
	 * @model required="true"
	 * @generated
	 */
	String getSourceFeature();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.GetExpression#getSourceFeature <em>Source Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' attribute.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(String value);

	/**
	 * Returns the value of the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor</em>' reference.
	 * @see #setReceptor(Variable)
	 * @see org.eclectic.frontend.tao.TaoPackage#getGetExpression_Receptor()
	 * @model
	 * @generated
	 */
	Variable getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.GetExpression#getReceptor <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Variable value);

} // GetExpression
