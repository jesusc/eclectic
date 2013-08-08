/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.EqualityFilter#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.EqualityFilter#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getEqualityFilter()
 * @model
 * @generated
 */
public interface EqualityFilter extends C2CModifier {
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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getEqualityFilter_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeRef getAttribute();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.EqualityFilter#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeRef value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getEqualityFilter_Filter()
	 * @model required="true"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.EqualityFilter#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // EqualityFilter
