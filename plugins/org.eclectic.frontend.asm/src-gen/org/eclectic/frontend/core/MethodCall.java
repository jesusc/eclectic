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
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.MethodCall#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.MethodCall#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.MethodCall#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.MethodCall#isWithParameters <em>With Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends Expression {
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
	 * @see org.eclectic.frontend.core.CorePackage#getMethodCall_Receptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.MethodCall#getReceptor <em>Receptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' containment reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Expression value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see org.eclectic.frontend.core.CorePackage#getMethodCall_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.MethodCall#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getMethodCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getParameters();

	/**
	 * Returns the value of the '<em><b>With Parameters</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Parameters</em>' attribute.
	 * @see #setWithParameters(boolean)
	 * @see org.eclectic.frontend.core.CorePackage#getMethodCall_WithParameters()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isWithParameters();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.MethodCall#isWithParameters <em>With Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Parameters</em>' attribute.
	 * @see #isWithParameters()
	 * @generated
	 */
	void setWithParameters(boolean value);

} // MethodCall
