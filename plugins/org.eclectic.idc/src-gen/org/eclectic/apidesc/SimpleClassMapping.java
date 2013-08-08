/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Class Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.SimpleClassMapping#getMetaclassName <em>Metaclass Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.SimpleClassMapping#getCanonicalClassName <em>Canonical Class Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.SimpleClassMapping#getFeatureMappings <em>Feature Mappings</em>}</li>
 *   <li>{@link org.eclectic.apidesc.SimpleClassMapping#getCreation <em>Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.ApidescPackage#getSimpleClassMapping()
 * @model
 * @generated
 */
public interface SimpleClassMapping extends ClassMapping {
	/**
	 * Returns the value of the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Name</em>' attribute.
	 * @see #setMetaclassName(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getSimpleClassMapping_MetaclassName()
	 * @model required="true"
	 * @generated
	 */
	String getMetaclassName();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SimpleClassMapping#getMetaclassName <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass Name</em>' attribute.
	 * @see #getMetaclassName()
	 * @generated
	 */
	void setMetaclassName(String value);

	/**
	 * Returns the value of the '<em><b>Canonical Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonical Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonical Class Name</em>' attribute.
	 * @see #setCanonicalClassName(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getSimpleClassMapping_CanonicalClassName()
	 * @model required="true"
	 * @generated
	 */
	String getCanonicalClassName();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SimpleClassMapping#getCanonicalClassName <em>Canonical Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonical Class Name</em>' attribute.
	 * @see #getCanonicalClassName()
	 * @generated
	 */
	void setCanonicalClassName(String value);

	/**
	 * Returns the value of the '<em><b>Feature Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.apidesc.FeatureMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Mappings</em>' containment reference list.
	 * @see org.eclectic.apidesc.ApidescPackage#getSimpleClassMapping_FeatureMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureMapping> getFeatureMappings();

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation</em>' containment reference.
	 * @see #setCreation(CreationMechanism)
	 * @see org.eclectic.apidesc.ApidescPackage#getSimpleClassMapping_Creation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CreationMechanism getCreation();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SimpleClassMapping#getCreation <em>Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' containment reference.
	 * @see #getCreation()
	 * @generated
	 */
	void setCreation(CreationMechanism value);

} // SimpleClassMapping
