/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.koan.impl;

import org.eclectic.frontend.koan.*;

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
public class KoanFactoryImpl extends EFactoryImpl implements KoanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KoanFactory init() {
		try {
			KoanFactory theKoanFactory = (KoanFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/koanL"); 
			if (theKoanFactory != null) {
				return theKoanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KoanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KoanFactoryImpl() {
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
			case KoanPackage.KOAN_TRANSFORMATION: return createKoanTransformation();
			case KoanPackage.KOAN_RULE: return createKoanRule();
			case KoanPackage.FOR_ALL_MATCHER: return createForAllMatcher();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KoanTransformation createKoanTransformation() {
		KoanTransformationImpl koanTransformation = new KoanTransformationImpl();
		return koanTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KoanRule createKoanRule() {
		KoanRuleImpl koanRule = new KoanRuleImpl();
		return koanRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForAllMatcher createForAllMatcher() {
		ForAllMatcherImpl forAllMatcher = new ForAllMatcherImpl();
		return forAllMatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KoanPackage getKoanPackage() {
		return (KoanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KoanPackage getPackage() {
		return KoanPackage.eINSTANCE;
	}

} //KoanFactoryImpl
