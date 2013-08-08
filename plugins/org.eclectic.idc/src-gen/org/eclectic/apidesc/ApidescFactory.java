/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.apidesc.ApidescPackage
 * @generated
 */
public interface ApidescFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApidescFactory eINSTANCE = org.eclectic.apidesc.impl.ApidescFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Api Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Description</em>'.
	 * @generated
	 */
	ApiDescription createApiDescription();

	/**
	 * Returns a new object of class '<em>Simple Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Class Mapping</em>'.
	 * @generated
	 */
	SimpleClassMapping createSimpleClassMapping();

	/**
	 * Returns a new object of class '<em>Set Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Feature</em>'.
	 * @generated
	 */
	SetFeature createSetFeature();

	/**
	 * Returns a new object of class '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor</em>'.
	 * @generated
	 */
	Constructor createConstructor();

	/**
	 * Returns a new object of class '<em>Simple Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Set</em>'.
	 * @generated
	 */
	SimpleSet createSimpleSet();

	/**
	 * Returns a new object of class '<em>Simple Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Get</em>'.
	 * @generated
	 */
	SimpleGet createSimpleGet();

	/**
	 * Returns a new object of class '<em>Generic Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Get</em>'.
	 * @generated
	 */
	GenericGet createGenericGet();

	/**
	 * Returns a new object of class '<em>Generic Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Set</em>'.
	 * @generated
	 */
	GenericSet createGenericSet();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Simple Attribute Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Attribute Mapping</em>'.
	 * @generated
	 */
	SimpleAttributeMapping createSimpleAttributeMapping();

	/**
	 * Returns a new object of class '<em>Simple Reference Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Reference Mapping</em>'.
	 * @generated
	 */
	SimpleReferenceMapping createSimpleReferenceMapping();

	/**
	 * Returns a new object of class '<em>Declared Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Element</em>'.
	 * @generated
	 */
	DeclaredElement createDeclaredElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApidescPackage getApidescPackage();

} //ApidescFactory
