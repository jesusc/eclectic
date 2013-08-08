/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.ecl_meta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.ecl_meta.KClass#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link org.eclectic.idc.ecl_meta.KClass#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKClass()
 * @model
 * @generated
 */
public interface KClass extends KClassifier {
	/**
	 * Returns the value of the '<em><b>Supertypes</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.ecl_meta.KClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertypes</em>' reference list.
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKClass_Supertypes()
	 * @model
	 * @generated
	 */
	EList<KClass> getSupertypes();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.ecl_meta.KStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKClass_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<KStructuralFeature> getFeatures();

} // KClass
