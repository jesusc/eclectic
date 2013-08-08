/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Is String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.FeatureIsString#getStrValue <em>Str Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeatureIsString()
 * @model
 * @generated
 */
public interface FeatureIsString extends MappingElement {
	/**
	 * Returns the value of the '<em><b>Str Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Value</em>' attribute.
	 * @see #setStrValue(String)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeatureIsString_StrValue()
	 * @model required="true"
	 * @generated
	 */
	String getStrValue();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.FeatureIsString#getStrValue <em>Str Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Value</em>' attribute.
	 * @see #getStrValue()
	 * @generated
	 */
	void setStrValue(String value);

} // FeatureIsString
