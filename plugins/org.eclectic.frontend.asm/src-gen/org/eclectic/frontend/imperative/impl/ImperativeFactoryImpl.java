/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.imperative.impl;

import org.eclectic.frontend.imperative.*;

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
public class ImperativeFactoryImpl extends EFactoryImpl implements ImperativeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImperativeFactory init() {
		try {
			ImperativeFactory theImperativeFactory = (ImperativeFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/imperativeL"); 
			if (theImperativeFactory != null) {
				return theImperativeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImperativeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeFactoryImpl() {
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
			case ImperativePackage.IMPERATIVE_TRANSFORMATION: return createImperativeTransformation();
			case ImperativePackage.METHOD_DEFINITION: return createMethodDefinition();
			case ImperativePackage.METHOD_SELF: return createMethodSelf();
			case ImperativePackage.METHOD_PARAMETER: return createMethodParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeTransformation createImperativeTransformation() {
		ImperativeTransformationImpl imperativeTransformation = new ImperativeTransformationImpl();
		return imperativeTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDefinition createMethodDefinition() {
		MethodDefinitionImpl methodDefinition = new MethodDefinitionImpl();
		return methodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSelf createMethodSelf() {
		MethodSelfImpl methodSelf = new MethodSelfImpl();
		return methodSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameter createMethodParameter() {
		MethodParameterImpl methodParameter = new MethodParameterImpl();
		return methodParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativePackage getImperativePackage() {
		return (ImperativePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImperativePackage getPackage() {
		return ImperativePackage.eINSTANCE;
	}

} //ImperativeFactoryImpl
