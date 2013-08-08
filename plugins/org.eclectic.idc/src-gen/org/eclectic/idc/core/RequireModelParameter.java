/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require Model Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.RequireModelParameter#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getRequireModelParameter()
 * @model
 * @generated
 */
public interface RequireModelParameter extends RequireParameter {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(ModelDefinition)
	 * @see org.eclectic.idc.core.CorePackage#getRequireModelParameter_Model()
	 * @model required="true"
	 * @generated
	 */
	ModelDefinition getModel();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.RequireModelParameter#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelDefinition value);

} // RequireModelParameter
