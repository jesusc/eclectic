/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution;

import org.eclectic.frontend.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inherited Attribute Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.attribution.InheritedAttributeUse#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.attribution.AttributionPackage#getInheritedAttributeUse()
 * @model
 * @generated
 */
public interface InheritedAttributeUse extends Expression {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(InheritedAttributeDcl)
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getInheritedAttributeUse_Attribute()
	 * @model required="true"
	 * @generated
	 */
	InheritedAttributeDcl getAttribute();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.InheritedAttributeUse#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(InheritedAttributeDcl value);

} // InheritedAttributeUse
