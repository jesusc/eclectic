/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.RequireParameter#getFormalParameterName <em>Formal Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getRequireParameter()
 * @model abstract="true"
 * @generated
 */
public interface RequireParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Formal Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter Name</em>' attribute.
	 * @see #setFormalParameterName(String)
	 * @see org.eclectic.idc.core.CorePackage#getRequireParameter_FormalParameterName()
	 * @model
	 * @generated
	 */
	String getFormalParameterName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.RequireParameter#getFormalParameterName <em>Formal Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameter Name</em>' attribute.
	 * @see #getFormalParameterName()
	 * @generated
	 */
	void setFormalParameterName(String value);

} // RequireParameter
