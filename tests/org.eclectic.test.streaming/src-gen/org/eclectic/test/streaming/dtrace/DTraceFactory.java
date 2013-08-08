/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.test.streaming.dtrace.DTracePackage
 * @generated
 */
public interface DTraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DTraceFactory eINSTANCE = org.eclectic.test.streaming.dtrace.impl.DTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Execution</em>'.
	 * @generated
	 */
	LocalExecution createLocalExecution();

	/**
	 * Returns a new object of class '<em>Remote Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Call</em>'.
	 * @generated
	 */
	RemoteCall createRemoteCall();

	/**
	 * Returns a new object of class '<em>Remote Method Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Method Execution</em>'.
	 * @generated
	 */
	RemoteMethodExecution createRemoteMethodExecution();

	/**
	 * Returns a new object of class '<em>Local Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Instance</em>'.
	 * @generated
	 */
	LocalInstance createLocalInstance();

	/**
	 * Returns a new object of class '<em>Remote Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Instance</em>'.
	 * @generated
	 */
	RemoteInstance createRemoteInstance();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DTracePackage getDTracePackage();

} //DTraceFactory
