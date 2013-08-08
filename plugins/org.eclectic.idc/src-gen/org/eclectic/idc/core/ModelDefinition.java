/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.ModelDefinition#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclectic.idc.core.ModelDefinition#getIncludedLibraries <em>Included Libraries</em>}</li>
 *   <li>{@link org.eclectic.idc.core.ModelDefinition#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getModelDefinition()
 * @model
 * @generated
 */
public interface ModelDefinition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclectic.idc.core.ModelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclectic.idc.core.ModelKind
	 * @see #setKind(ModelKind)
	 * @see org.eclectic.idc.core.CorePackage#getModelDefinition_Kind()
	 * @model
	 * @generated
	 */
	ModelKind getKind();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.ModelDefinition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclectic.idc.core.ModelKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ModelKind value);

	/**
	 * Returns the value of the '<em><b>Included Libraries</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.MethodLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Libraries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Libraries</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getModelDefinition_IncludedLibraries()
	 * @model
	 * @generated
	 */
	EList<MethodLibrary> getIncludedLibraries();

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' containment reference.
	 * @see #setMetamodel(MetamodelDefinition)
	 * @see org.eclectic.idc.core.CorePackage#getModelDefinition_Metamodel()
	 * @model containment="true"
	 * @generated
	 */
	MetamodelDefinition getMetamodel();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.ModelDefinition#getMetamodel <em>Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' containment reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(MetamodelDefinition value);

} // ModelDefinition
