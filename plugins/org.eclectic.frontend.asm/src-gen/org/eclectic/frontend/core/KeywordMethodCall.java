/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.KeywordMethodCall#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.KeywordMethodCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getKeywordMethodCall()
 * @model
 * @generated
 */
public interface KeywordMethodCall extends Expression {
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
	 * @see org.eclectic.frontend.core.CorePackage#getKeywordMethodCall_Receptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.KeywordMethodCall#getReceptor <em>Receptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' containment reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Expression value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.KeywordParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getKeywordMethodCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeywordParameter> getParameters();

} // KeywordMethodCall
