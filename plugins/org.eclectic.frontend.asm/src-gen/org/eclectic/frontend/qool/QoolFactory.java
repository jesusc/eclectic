/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.qool.QoolPackage
 * @generated
 */
public interface QoolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QoolFactory eINSTANCE = org.eclectic.frontend.qool.impl.QoolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	QoolTransformation createQoolTransformation();

	/**
	 * Returns a new object of class '<em>Access By Feature Optimization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access By Feature Optimization</em>'.
	 * @generated
	 */
	AccessByFeatureOptimization createAccessByFeatureOptimization();

	/**
	 * Returns a new object of class '<em>Local Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Queue</em>'.
	 * @generated
	 */
	LocalQueue createLocalQueue();

	/**
	 * Returns a new object of class '<em>Model Element Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Queue</em>'.
	 * @generated
	 */
	ModelElementQueue createModelElementQueue();

	/**
	 * Returns a new object of class '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment</em>'.
	 * @generated
	 */
	Segment createSegment();

	/**
	 * Returns a new object of class '<em>Iterator Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Statement</em>'.
	 * @generated
	 */
	IteratorStatement createIteratorStatement();

	/**
	 * Returns a new object of class '<em>For All Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For All Statement</em>'.
	 * @generated
	 */
	ForAllStatement createForAllStatement();

	/**
	 * Returns a new object of class '<em>For Each Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Each Statement</em>'.
	 * @generated
	 */
	ForEachStatement createForEachStatement();

	/**
	 * Returns a new object of class '<em>Emit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emit Statement</em>'.
	 * @generated
	 */
	EmitStatement createEmitStatement();

	/**
	 * Returns a new object of class '<em>Match Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Expression</em>'.
	 * @generated
	 */
	MatchExpression createMatchExpression();

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
	 * Returns a new object of class '<em>Invoke External</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoke External</em>'.
	 * @generated
	 */
	InvokeExternal createInvokeExternal();

	/**
	 * Returns a new object of class '<em>Invoke Internal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoke Internal</em>'.
	 * @generated
	 */
	InvokeInternal createInvokeInternal();

	/**
	 * Returns a new object of class '<em>Invocation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocation Parameter</em>'.
	 * @generated
	 */
	InvocationParameter createInvocationParameter();

	/**
	 * Returns a new object of class '<em>Named Invocation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Invocation Parameter</em>'.
	 * @generated
	 */
	NamedInvocationParameter createNamedInvocationParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QoolPackage getQoolPackage();

} //QoolFactory
