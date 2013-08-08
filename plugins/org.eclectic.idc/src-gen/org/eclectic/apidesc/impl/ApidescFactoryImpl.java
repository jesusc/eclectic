/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.impl;

import org.eclectic.apidesc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ApidescFactoryImpl extends EFactoryImpl implements ApidescFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApidescFactory init() {
		try {
			ApidescFactory theApidescFactory = (ApidescFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/apidesc"); 
			if (theApidescFactory != null) {
				return theApidescFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApidescFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApidescFactoryImpl() {
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
			case ApidescPackage.API_DESCRIPTION: return createApiDescription();
			case ApidescPackage.SIMPLE_CLASS_MAPPING: return createSimpleClassMapping();
			case ApidescPackage.SET_FEATURE: return createSetFeature();
			case ApidescPackage.CONSTRUCTOR: return createConstructor();
			case ApidescPackage.SIMPLE_SET: return createSimpleSet();
			case ApidescPackage.SIMPLE_GET: return createSimpleGet();
			case ApidescPackage.GENERIC_GET: return createGenericGet();
			case ApidescPackage.GENERIC_SET: return createGenericSet();
			case ApidescPackage.METHOD: return createMethod();
			case ApidescPackage.SIMPLE_ATTRIBUTE_MAPPING: return createSimpleAttributeMapping();
			case ApidescPackage.SIMPLE_REFERENCE_MAPPING: return createSimpleReferenceMapping();
			case ApidescPackage.DECLARED_ELEMENT: return createDeclaredElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApidescPackage.RETURN_KIND:
				return createReturnKindFromString(eDataType, initialValue);
			case ApidescPackage.PRIMITIVE_TYPE:
				return createPrimitiveTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApidescPackage.RETURN_KIND:
				return convertReturnKindToString(eDataType, instanceValue);
			case ApidescPackage.PRIMITIVE_TYPE:
				return convertPrimitiveTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiDescription createApiDescription() {
		ApiDescriptionImpl apiDescription = new ApiDescriptionImpl();
		return apiDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClassMapping createSimpleClassMapping() {
		SimpleClassMappingImpl simpleClassMapping = new SimpleClassMappingImpl();
		return simpleClassMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFeature createSetFeature() {
		SetFeatureImpl setFeature = new SetFeatureImpl();
		return setFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSet createSimpleSet() {
		SimpleSetImpl simpleSet = new SimpleSetImpl();
		return simpleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGet createSimpleGet() {
		SimpleGetImpl simpleGet = new SimpleGetImpl();
		return simpleGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericGet createGenericGet() {
		GenericGetImpl genericGet = new GenericGetImpl();
		return genericGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericSet createGenericSet() {
		GenericSetImpl genericSet = new GenericSetImpl();
		return genericSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttributeMapping createSimpleAttributeMapping() {
		SimpleAttributeMappingImpl simpleAttributeMapping = new SimpleAttributeMappingImpl();
		return simpleAttributeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleReferenceMapping createSimpleReferenceMapping() {
		SimpleReferenceMappingImpl simpleReferenceMapping = new SimpleReferenceMappingImpl();
		return simpleReferenceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredElement createDeclaredElement() {
		DeclaredElementImpl declaredElement = new DeclaredElementImpl();
		return declaredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnKind createReturnKindFromString(EDataType eDataType, String initialValue) {
		ReturnKind result = ReturnKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApidescPackage getApidescPackage() {
		return (ApidescPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApidescPackage getPackage() {
		return ApidescPackage.eINSTANCE;
	}

} //ApidescFactoryImpl
