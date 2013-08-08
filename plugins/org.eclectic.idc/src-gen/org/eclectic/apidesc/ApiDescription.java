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
 * A representation of the model object '<em><b>Api Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.ApiDescription#getApiName <em>Api Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.ApiDescription#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.ApiDescription#getMapperClassName <em>Mapper Class Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.ApiDescription#getClassMappings <em>Class Mappings</em>}</li>
 *   <li>{@link org.eclectic.apidesc.ApiDescription#getDeclaredElements <em>Declared Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.ApidescPackage#getApiDescription()
 * @model
 * @generated
 */
public interface ApiDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Name</em>' attribute.
	 * @see #setApiName(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getApiDescription_ApiName()
	 * @model required="true"
	 * @generated
	 */
	String getApiName();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.ApiDescription#getApiName <em>Api Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Name</em>' attribute.
	 * @see #getApiName()
	 * @generated
	 */
	void setApiName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Name</em>' attribute.
	 * @see #setMetamodelName(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getApiDescription_MetamodelName()
	 * @model required="true"
	 * @generated
	 */
	String getMetamodelName();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.ApiDescription#getMetamodelName <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Name</em>' attribute.
	 * @see #getMetamodelName()
	 * @generated
	 */
	void setMetamodelName(String value);

	/**
	 * Returns the value of the '<em><b>Mapper Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapper Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper Class Name</em>' attribute.
	 * @see #setMapperClassName(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getApiDescription_MapperClassName()
	 * @model
	 * @generated
	 */
	String getMapperClassName();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.ApiDescription#getMapperClassName <em>Mapper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper Class Name</em>' attribute.
	 * @see #getMapperClassName()
	 * @generated
	 */
	void setMapperClassName(String value);

	/**
	 * Returns the value of the '<em><b>Class Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.apidesc.ClassMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Mappings</em>' containment reference list.
	 * @see org.eclectic.apidesc.ApidescPackage#getApiDescription_ClassMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassMapping> getClassMappings();

	/**
	 * Returns the value of the '<em><b>Declared Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.apidesc.DeclaredElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Elements</em>' containment reference list.
	 * @see org.eclectic.apidesc.ApidescPackage#getApiDescription_DeclaredElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredElement> getDeclaredElements();

} // ApiDescription
