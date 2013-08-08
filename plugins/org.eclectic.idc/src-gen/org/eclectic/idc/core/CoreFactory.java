/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = org.eclectic.idc.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Require Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require Declaration</em>'.
	 * @generated
	 */
	RequireDeclaration createRequireDeclaration();

	/**
	 * Returns a new object of class '<em>Require Model Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require Model Parameter</em>'.
	 * @generated
	 */
	RequireModelParameter createRequireModelParameter();

	/**
	 * Returns a new object of class '<em>Entry Point Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point Unit</em>'.
	 * @generated
	 */
	EntryPointUnit createEntryPointUnit();

	/**
	 * Returns a new object of class '<em>Method Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Library</em>'.
	 * @generated
	 */
	MethodLibrary createMethodLibrary();

	/**
	 * Returns a new object of class '<em>Model Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Definition</em>'.
	 * @generated
	 */
	ModelDefinition createModelDefinition();

	/**
	 * Returns a new object of class '<em>Metamodel Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Definition</em>'.
	 * @generated
	 */
	MetamodelDefinition createMetamodelDefinition();

	/**
	 * Returns a new object of class '<em>Imported Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imported Model</em>'.
	 * @generated
	 */
	ImportedModel createImportedModel();

	/**
	 * Returns a new object of class '<em>Normal Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Function</em>'.
	 * @generated
	 */
	NormalFunction createNormalFunction();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Definition</em>'.
	 * @generated
	 */
	MethodDefinition createMethodDefinition();

	/**
	 * Returns a new object of class '<em>Self Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Variable</em>'.
	 * @generated
	 */
	SelfVariable createSelfVariable();

	/**
	 * Returns a new object of class '<em>Type Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Info</em>'.
	 * @generated
	 */
	TypeInfo createTypeInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
