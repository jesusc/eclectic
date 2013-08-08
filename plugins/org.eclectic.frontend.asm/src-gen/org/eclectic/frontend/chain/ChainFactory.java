/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.chain.ChainPackage
 * @generated
 */
public interface ChainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChainFactory eINSTANCE = org.eclectic.frontend.chain.impl.ChainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	ChainTransformation createChainTransformation();

	/**
	 * Returns a new object of class '<em>Generated Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generated Model</em>'.
	 * @generated
	 */
	GeneratedModel createGeneratedModel();

	/**
	 * Returns a new object of class '<em>Transformation Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Execution</em>'.
	 * @generated
	 */
	TransformationExecution createTransformationExecution();

	/**
	 * Returns a new object of class '<em>External Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Transformation</em>'.
	 * @generated
	 */
	ExternalTransformation createExternalTransformation();

	/**
	 * Returns a new object of class '<em>Composite Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Transformation</em>'.
	 * @generated
	 */
	CompositeTransformation createCompositeTransformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChainPackage getChainPackage();

} //ChainFactory
