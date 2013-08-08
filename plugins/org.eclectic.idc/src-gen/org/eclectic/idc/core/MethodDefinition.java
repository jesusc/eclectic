/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.MethodDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.idc.core.MethodDefinition#getSelfVar <em>Self Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getMethodDefinition()
 * @model
 * @generated
 */
public interface MethodDefinition extends FunctionDef, NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeInfo)
	 * @see org.eclectic.idc.core.CorePackage#getMethodDefinition_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeInfo getType();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.MethodDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeInfo value);

	/**
	 * Returns the value of the '<em><b>Self Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Var</em>' containment reference.
	 * @see #setSelfVar(SelfVariable)
	 * @see org.eclectic.idc.core.CorePackage#getMethodDefinition_SelfVar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SelfVariable getSelfVar();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.MethodDefinition#getSelfVar <em>Self Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Var</em>' containment reference.
	 * @see #getSelfVar()
	 * @generated
	 */
	void setSelfVar(SelfVariable value);

} // MethodDefinition
