/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.ecl_meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.ecl_meta.KStructuralFeature#isIsMultivalued <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclectic.idc.ecl_meta.KStructuralFeature#getKtype <em>Ktype</em>}</li>
 *   <li>{@link org.eclectic.idc.ecl_meta.KStructuralFeature#getKtypeName <em>Ktype Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface KStructuralFeature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Multivalued</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multivalued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multivalued</em>' attribute.
	 * @see #setIsMultivalued(boolean)
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKStructuralFeature_IsMultivalued()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsMultivalued();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.ecl_meta.KStructuralFeature#isIsMultivalued <em>Is Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multivalued</em>' attribute.
	 * @see #isIsMultivalued()
	 * @generated
	 */
	void setIsMultivalued(boolean value);

	/**
	 * Returns the value of the '<em><b>Ktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ktype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ktype</em>' reference.
	 * @see #setKtype(KClassifier)
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKStructuralFeature_Ktype()
	 * @model required="true"
	 * @generated
	 */
	KClassifier getKtype();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.ecl_meta.KStructuralFeature#getKtype <em>Ktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ktype</em>' reference.
	 * @see #getKtype()
	 * @generated
	 */
	void setKtype(KClassifier value);

	/**
	 * Returns the value of the '<em><b>Ktype Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ktype Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ktype Name</em>' attribute.
	 * @see #setKtypeName(String)
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKStructuralFeature_KtypeName()
	 * @model required="true"
	 * @generated
	 */
	String getKtypeName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.ecl_meta.KStructuralFeature#getKtypeName <em>Ktype Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ktype Name</em>' attribute.
	 * @see #getKtypeName()
	 * @generated
	 */
	void setKtypeName(String value);

} // KStructuralFeature
