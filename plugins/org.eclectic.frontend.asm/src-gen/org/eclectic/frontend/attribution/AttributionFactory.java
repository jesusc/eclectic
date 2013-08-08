/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.attribution.AttributionPackage
 * @generated
 */
public interface AttributionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttributionFactory eINSTANCE = org.eclectic.frontend.attribution.impl.AttributionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	AttributionTransformation createAttributionTransformation();

	/**
	 * Returns a new object of class '<em>Inherited Attribute Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inherited Attribute Dcl</em>'.
	 * @generated
	 */
	InheritedAttributeDcl createInheritedAttributeDcl();

	/**
	 * Returns a new object of class '<em>Synthesized Attribute Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synthesized Attribute Dcl</em>'.
	 * @generated
	 */
	SynthesizedAttributeDcl createSynthesizedAttributeDcl();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	AttributionRule createAttributionRule();

	/**
	 * Returns a new object of class '<em>Rule Self</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Self</em>'.
	 * @generated
	 */
	RuleSelf createRuleSelf();

	/**
	 * Returns a new object of class '<em>Attribute Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Init</em>'.
	 * @generated
	 */
	AttributeInit createAttributeInit();

	/**
	 * Returns a new object of class '<em>Attribute Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Use</em>'.
	 * @generated
	 */
	AttributeUse createAttributeUse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AttributionPackage getAttributionPackage();

} //AttributionFactory
