/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.TemplateParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter extends Variable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ClassUse)
	 * @see org.eclectic.frontend.tao.TaoPackage#getTemplateParameter_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassUse getType();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.TemplateParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassUse value);

} // TemplateParameter
