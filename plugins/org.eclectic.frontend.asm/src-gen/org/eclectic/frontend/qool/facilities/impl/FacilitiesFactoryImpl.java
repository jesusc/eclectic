/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.facilities.impl;

import org.eclectic.frontend.qool.facilities.*;

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
public class FacilitiesFactoryImpl extends EFactoryImpl implements FacilitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacilitiesFactory init() {
		try {
			FacilitiesFactory theFacilitiesFactory = (FacilitiesFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/qoolL/facilities"); 
			if (theFacilitiesFactory != null) {
				return theFacilitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FacilitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesFactoryImpl() {
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
			case FacilitiesPackage.COPIER: return createCopier();
			case FacilitiesPackage.COPIER_CALLBACK_DEFINITION: return createCopierCallbackDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copier createCopier() {
		CopierImpl copier = new CopierImpl();
		return copier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopierCallbackDefinition createCopierCallbackDefinition() {
		CopierCallbackDefinitionImpl copierCallbackDefinition = new CopierCallbackDefinitionImpl();
		return copierCallbackDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesPackage getFacilitiesPackage() {
		return (FacilitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FacilitiesPackage getPackage() {
		return FacilitiesPackage.eINSTANCE;
	}

} //FacilitiesFactoryImpl
