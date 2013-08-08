/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.ecl_meta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage
 * @generated
 */
public interface Ecl_metaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ecl_metaFactory eINSTANCE = org.eclectic.idc.ecl_meta.impl.Ecl_metaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>KPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KPackage</em>'.
	 * @generated
	 */
	KPackage createKPackage();

	/**
	 * Returns a new object of class '<em>KMetamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KMetamodel</em>'.
	 * @generated
	 */
	KMetamodel createKMetamodel();

	/**
	 * Returns a new object of class '<em>KPrimitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KPrimitive Type</em>'.
	 * @generated
	 */
	KPrimitiveType createKPrimitiveType();

	/**
	 * Returns a new object of class '<em>KEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KEnumeration</em>'.
	 * @generated
	 */
	KEnumeration createKEnumeration();

	/**
	 * Returns a new object of class '<em>KEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KEnum Literal</em>'.
	 * @generated
	 */
	KEnumLiteral createKEnumLiteral();

	/**
	 * Returns a new object of class '<em>KClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KClass</em>'.
	 * @generated
	 */
	KClass createKClass();

	/**
	 * Returns a new object of class '<em>KAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAttribute</em>'.
	 * @generated
	 */
	KAttribute createKAttribute();

	/**
	 * Returns a new object of class '<em>KReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KReference</em>'.
	 * @generated
	 */
	KReference createKReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ecl_metaPackage getEcl_metaPackage();

} //Ecl_metaFactory
