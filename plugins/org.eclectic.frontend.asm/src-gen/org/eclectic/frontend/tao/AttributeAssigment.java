/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;

import org.eclectic.frontend.core.Variable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Assigment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.AttributeAssigment#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.AttributeAssigment#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getAttributeAssigment()
 * @model
 * @generated
 */
public interface AttributeAssigment extends Assignment {
	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature</em>' attribute.
	 * @see #setTargetFeature(String)
	 * @see org.eclectic.frontend.tao.TaoPackage#getAttributeAssigment_TargetFeature()
	 * @model required="true"
	 * @generated
	 */
	String getTargetFeature();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.AttributeAssigment#getTargetFeature <em>Target Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' attribute.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(String value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(SourceExpression)
	 * @see org.eclectic.frontend.tao.TaoPackage#getAttributeAssigment_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceExpression getExpr();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.AttributeAssigment#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(SourceExpression value);

} // AttributeAssigment
