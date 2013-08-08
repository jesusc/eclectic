/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns.impl;

import org.eclectic.apidesc.patterns.*;

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
public class PatternsFactoryImpl extends EFactoryImpl implements PatternsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternsFactory init() {
		try {
			PatternsFactory thePatternsFactory = (PatternsFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/apidesc/patterns"); 
			if (thePatternsFactory != null) {
				return thePatternsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactoryImpl() {
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
			case PatternsPackage.ITERATOR_DESCRIPTION: return createIteratorDescription();
			case PatternsPackage.ITERATOR_GETTER: return createIteratorGetter();
			case PatternsPackage.OBSERVER_DESCRIPTION: return createObserverDescription();
			case PatternsPackage.UPDATE_METHOD: return createUpdateMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorDescription createIteratorDescription() {
		IteratorDescriptionImpl iteratorDescription = new IteratorDescriptionImpl();
		return iteratorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorGetter createIteratorGetter() {
		IteratorGetterImpl iteratorGetter = new IteratorGetterImpl();
		return iteratorGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverDescription createObserverDescription() {
		ObserverDescriptionImpl observerDescription = new ObserverDescriptionImpl();
		return observerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateMethod createUpdateMethod() {
		UpdateMethodImpl updateMethod = new UpdateMethodImpl();
		return updateMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsPackage getPatternsPackage() {
		return (PatternsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternsPackage getPackage() {
		return PatternsPackage.eINSTANCE;
	}

} //PatternsFactoryImpl
