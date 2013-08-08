/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.patterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.patterns.PatternsPackage
 * @generated
 */
public interface PatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsFactory eINSTANCE = org.eclectic.frontend.patterns.impl.PatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Specification</em>'.
	 * @generated
	 */
	PatternSpecification createPatternSpecification();

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	/**
	 * Returns a new object of class '<em>POutput Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POutput Variable</em>'.
	 * @generated
	 */
	POutputVariable createPOutputVariable();

	/**
	 * Returns a new object of class '<em>PObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PObject</em>'.
	 * @generated
	 */
	PObject createPObject();

	/**
	 * Returns a new object of class '<em>PAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PAttribute</em>'.
	 * @generated
	 */
	PAttribute createPAttribute();

	/**
	 * Returns a new object of class '<em>PReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PReference</em>'.
	 * @generated
	 */
	PReference createPReference();

	/**
	 * Returns a new object of class '<em>Collection Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Reference</em>'.
	 * @generated
	 */
	CollectionReference createCollectionReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternsPackage getPatternsPackage();

} //PatternsFactory
