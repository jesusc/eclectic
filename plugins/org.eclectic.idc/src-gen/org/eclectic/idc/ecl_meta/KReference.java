/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.ecl_meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.ecl_meta.KReference#isIsContained <em>Is Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKReference()
 * @model
 * @generated
 */
public interface KReference extends KStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Is Contained</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Contained</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Contained</em>' attribute.
	 * @see #setIsContained(boolean)
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKReference_IsContained()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsContained();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.ecl_meta.KReference#isIsContained <em>Is Contained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Contained</em>' attribute.
	 * @see #isIsContained()
	 * @generated
	 */
	void setIsContained(boolean value);

} // KReference
