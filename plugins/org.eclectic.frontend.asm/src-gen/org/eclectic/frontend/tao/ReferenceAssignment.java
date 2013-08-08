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
 * A representation of the model object '<em><b>Reference Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.ReferenceAssignment#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.ReferenceAssignment#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.ReferenceAssignment#isMultivalued <em>Multivalued</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getReferenceAssignment()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceAssignment extends Assignment, Variable {
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
	 * @see org.eclectic.frontend.tao.TaoPackage#getReferenceAssignment_TargetFeature()
	 * @model required="true"
	 * @generated
	 */
	String getTargetFeature();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.ReferenceAssignment#getTargetFeature <em>Target Feature</em>}' attribute.
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
	 * @see org.eclectic.frontend.tao.TaoPackage#getReferenceAssignment_Expr()
	 * @model containment="true"
	 * @generated
	 */
	SourceExpression getExpr();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.ReferenceAssignment#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(SourceExpression value);

	/**
	 * Returns the value of the '<em><b>Multivalued</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multivalued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multivalued</em>' attribute.
	 * @see #setMultivalued(boolean)
	 * @see org.eclectic.frontend.tao.TaoPackage#getReferenceAssignment_Multivalued()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMultivalued();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.ReferenceAssignment#isMultivalued <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multivalued</em>' attribute.
	 * @see #isMultivalued()
	 * @generated
	 */
	void setMultivalued(boolean value);

} // ReferenceAssignment
