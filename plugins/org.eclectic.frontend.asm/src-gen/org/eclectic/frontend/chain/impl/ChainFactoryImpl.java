/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain.impl;

import org.eclectic.frontend.chain.*;

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
public class ChainFactoryImpl extends EFactoryImpl implements ChainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChainFactory init() {
		try {
			ChainFactory theChainFactory = (ChainFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/chainL"); 
			if (theChainFactory != null) {
				return theChainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFactoryImpl() {
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
			case ChainPackage.CHAIN_TRANSFORMATION: return createChainTransformation();
			case ChainPackage.GENERATED_MODEL: return createGeneratedModel();
			case ChainPackage.TRANSFORMATION_EXECUTION: return createTransformationExecution();
			case ChainPackage.EXTERNAL_TRANSFORMATION: return createExternalTransformation();
			case ChainPackage.COMPOSITE_TRANSFORMATION: return createCompositeTransformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainTransformation createChainTransformation() {
		ChainTransformationImpl chainTransformation = new ChainTransformationImpl();
		return chainTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedModel createGeneratedModel() {
		GeneratedModelImpl generatedModel = new GeneratedModelImpl();
		return generatedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationExecution createTransformationExecution() {
		TransformationExecutionImpl transformationExecution = new TransformationExecutionImpl();
		return transformationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalTransformation createExternalTransformation() {
		ExternalTransformationImpl externalTransformation = new ExternalTransformationImpl();
		return externalTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTransformation createCompositeTransformation() {
		CompositeTransformationImpl compositeTransformation = new CompositeTransformationImpl();
		return compositeTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainPackage getChainPackage() {
		return (ChainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChainPackage getPackage() {
		return ChainPackage.eINSTANCE;
	}

} //ChainFactoryImpl
