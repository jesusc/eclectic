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
 * A representation of the model object '<em><b>KEnumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.ecl_meta.KEnumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKEnumeration()
 * @model
 * @generated
 */
public interface KEnumeration extends KDataType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.ecl_meta.KEnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage#getKEnumeration_Literals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<KEnumLiteral> getLiterals();

} // KEnumeration
