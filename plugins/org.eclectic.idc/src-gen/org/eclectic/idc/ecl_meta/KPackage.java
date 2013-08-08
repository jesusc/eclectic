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
 * A representation of the model object '<em><b>KPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.ecl_meta.KPackage#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link org.eclectic.idc.ecl_meta.KPackage#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKPackage()
 * @model
 * @generated
 */
public interface KPackage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subpackages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.ecl_meta.KPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackages</em>' containment reference list.
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKPackage_Subpackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<KPackage> getSubpackages();

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.ecl_meta.KClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKPackage_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<KClassifier> getClassifiers();

} // KPackage
