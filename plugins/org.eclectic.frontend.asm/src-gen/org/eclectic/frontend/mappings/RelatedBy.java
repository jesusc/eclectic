/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.RelatedBy#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getRelatedBy()
 * @model
 * @generated
 */
public interface RelatedBy extends C2CModifier {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(AttributeRef)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getRelatedBy_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeRef getAttribute();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.RelatedBy#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeRef value);

} // RelatedBy
