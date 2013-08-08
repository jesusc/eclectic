/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.impl;

import org.eclectic.idc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdcFactoryImpl extends EFactoryImpl implements IdcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdcFactory init() {
		try {
			IdcFactory theIdcFactory = (IdcFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/idc"); 
			if (theIdcFactory != null) {
				return theIdcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IdcPackage.DUMMY_TO_CREATE_APACKAGE: return createDummyToCreateAPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyToCreateAPackage createDummyToCreateAPackage() {
		DummyToCreateAPackageImpl dummyToCreateAPackage = new DummyToCreateAPackageImpl();
		return dummyToCreateAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdcPackage getIdcPackage() {
		return (IdcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdcPackage getPackage() {
		return IdcPackage.eINSTANCE;
	}

} //IdcFactoryImpl
