/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclectic.frontend.core.ClassUse;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.ClassRef#getKlass <em>Klass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getClassRef()
 * @model
 * @generated
 */
public interface ClassRef extends MetamodelElementRef {
	/**
	 * Returns the value of the '<em><b>Klass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klass</em>' reference.
	 * @see #setKlass(ClassUse)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getClassRef_Klass()
	 * @model required="true"
	 * @generated
	 */
	ClassUse getKlass();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.ClassRef#getKlass <em>Klass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klass</em>' reference.
	 * @see #getKlass()
	 * @generated
	 */
	void setKlass(ClassUse value);

} // ClassRef
