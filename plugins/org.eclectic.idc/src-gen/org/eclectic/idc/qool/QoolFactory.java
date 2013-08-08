/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.qool.QoolPackage
 * @generated
 */
public interface QoolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QoolFactory eINSTANCE = org.eclectic.idc.qool.impl.QoolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	QoolTransformation createQoolTransformation();

	/**
	 * Returns a new object of class '<em>Inline Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Model</em>'.
	 * @generated
	 */
	InlineModel createInlineModel();

	/**
	 * Returns a new object of class '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment</em>'.
	 * @generated
	 */
	Segment createSegment();

	/**
	 * Returns a new object of class '<em>Access By Feature Optimization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access By Feature Optimization</em>'.
	 * @generated
	 */
	AccessByFeatureOptimization createAccessByFeatureOptimization();

	/**
	 * Returns a new object of class '<em>Model Element Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Queue</em>'.
	 * @generated
	 */
	ModelElementQueue createModelElementQueue();

	/**
	 * Returns a new object of class '<em>Local Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Queue</em>'.
	 * @generated
	 */
	LocalQueue createLocalQueue();

	/**
	 * Returns a new object of class '<em>Required Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Queue</em>'.
	 * @generated
	 */
	RequiredQueue createRequiredQueue();

	/**
	 * Returns a new object of class '<em>QFor All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QFor All</em>'.
	 * @generated
	 */
	QForAll createQForAll();

	/**
	 * Returns a new object of class '<em>QEmit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QEmit</em>'.
	 * @generated
	 */
	QEmit createQEmit();

	/**
	 * Returns a new object of class '<em>QMatch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QMatch</em>'.
	 * @generated
	 */
	QMatch createQMatch();

	/**
	 * Returns a new object of class '<em>Kind Of Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kind Of Predicate</em>'.
	 * @generated
	 */
	KindOfPredicate createKindOfPredicate();

	/**
	 * Returns a new object of class '<em>Property Equals Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Equals Predicate</em>'.
	 * @generated
	 */
	PropertyEqualsPredicate createPropertyEqualsPredicate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QoolPackage getQoolPackage();

} //QoolFactory
