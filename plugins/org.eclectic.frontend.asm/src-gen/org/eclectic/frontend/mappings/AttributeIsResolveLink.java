/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclectic.frontend.core.ResolveLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Is Resolve Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.AttributeIsResolveLink#getResolveLink <em>Resolve Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttributeIsResolveLink()
 * @model
 * @generated
 */
public interface AttributeIsResolveLink extends AttributeRightPart {
	/**
	 * Returns the value of the '<em><b>Resolve Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Link</em>' containment reference.
	 * @see #setResolveLink(ResolveLink)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttributeIsResolveLink_ResolveLink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResolveLink getResolveLink();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.AttributeIsResolveLink#getResolveLink <em>Resolve Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Link</em>' containment reference.
	 * @see #getResolveLink()
	 * @generated
	 */
	void setResolveLink(ResolveLink value);

} // AttributeIsResolveLink
