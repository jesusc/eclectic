/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import org.eclectic.frontend.mappings.*;

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
public class MappingsFactoryImpl extends EFactoryImpl implements MappingsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingsFactory init() {
		try {
			MappingsFactory theMappingsFactory = (MappingsFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/mappingL"); 
			if (theMappingsFactory != null) {
				return theMappingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MappingsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingsFactoryImpl() {
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
			case MappingsPackage.MAPPING_TRANSFORMATION: return createMappingTransformation();
			case MappingsPackage.MAPPING_VARIABLE: return createMappingVariable();
			case MappingsPackage.MATCHED_ELEMENT: return createMatchedElement();
			case MappingsPackage.DELEGATE: return createDelegate();
			case MappingsPackage.CONTEXT: return createContext();
			case MappingsPackage.SECTION: return createSection();
			case MappingsPackage.ATTRIBUTE_MAPPING: return createAttributeMapping();
			case MappingsPackage.ATTRIBUTE_IS_STRING: return createAttributeIsString();
			case MappingsPackage.ATTRIBUTE_IS_BOOLEAN: return createAttributeIsBoolean();
			case MappingsPackage.ATTRIBUTE_IS_DOUBLE: return createAttributeIsDouble();
			case MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK: return createAttributeIsResolveLink();
			case MappingsPackage.ATTRIBUTE_IS_INTEGER: return createAttributeIsInteger();
			case MappingsPackage.CONVERTER: return createConverter();
			case MappingsPackage.TAG: return createTag();
			case MappingsPackage.CLASS2_CLASS: return createClass2Class();
			case MappingsPackage.RELATED_BY: return createRelatedBy();
			case MappingsPackage.LINKED_BY: return createLinkedBy();
			case MappingsPackage.EQUALITY_FILTER: return createEqualityFilter();
			case MappingsPackage.SPLIT: return createSplit();
			case MappingsPackage.JOIN: return createJoin();
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE: return createAttribute2Attribute();
			case MappingsPackage.REFERENCE2_REFERENCE: return createReference2Reference();
			case MappingsPackage.CONVERT_MODIFIER: return createConvertModifier();
			case MappingsPackage.INT_DEFAULT_VALUE: return createIntDefaultValue();
			case MappingsPackage.CLASS_REF: return createClassRef();
			case MappingsPackage.FEATURE_REF: return createFeatureRef();
			case MappingsPackage.ATTRIBUTE_REF: return createAttributeRef();
			case MappingsPackage.REFERENCE_REF: return createReferenceRef();
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
			case MappingsPackage.MAPPING_CARDINALITY:
				return createMappingCardinalityFromString(eDataType, initialValue);
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
			case MappingsPackage.MAPPING_CARDINALITY:
				return convertMappingCardinalityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTransformation createMappingTransformation() {
		MappingTransformationImpl mappingTransformation = new MappingTransformationImpl();
		return mappingTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingVariable createMappingVariable() {
		MappingVariableImpl mappingVariable = new MappingVariableImpl();
		return mappingVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedElement createMatchedElement() {
		MatchedElementImpl matchedElement = new MatchedElementImpl();
		return matchedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegate createDelegate() {
		DelegateImpl delegate = new DelegateImpl();
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMapping createAttributeMapping() {
		AttributeMappingImpl attributeMapping = new AttributeMappingImpl();
		return attributeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeIsString createAttributeIsString() {
		AttributeIsStringImpl attributeIsString = new AttributeIsStringImpl();
		return attributeIsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeIsBoolean createAttributeIsBoolean() {
		AttributeIsBooleanImpl attributeIsBoolean = new AttributeIsBooleanImpl();
		return attributeIsBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeIsDouble createAttributeIsDouble() {
		AttributeIsDoubleImpl attributeIsDouble = new AttributeIsDoubleImpl();
		return attributeIsDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeIsResolveLink createAttributeIsResolveLink() {
		AttributeIsResolveLinkImpl attributeIsResolveLink = new AttributeIsResolveLinkImpl();
		return attributeIsResolveLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeIsInteger createAttributeIsInteger() {
		AttributeIsIntegerImpl attributeIsInteger = new AttributeIsIntegerImpl();
		return attributeIsInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Converter createConverter() {
		ConverterImpl converter = new ConverterImpl();
		return converter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2Class createClass2Class() {
		Class2ClassImpl class2Class = new Class2ClassImpl();
		return class2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedBy createRelatedBy() {
		RelatedByImpl relatedBy = new RelatedByImpl();
		return relatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedBy createLinkedBy() {
		LinkedByImpl linkedBy = new LinkedByImpl();
		return linkedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityFilter createEqualityFilter() {
		EqualityFilterImpl equalityFilter = new EqualityFilterImpl();
		return equalityFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split createSplit() {
		SplitImpl split = new SplitImpl();
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute2Attribute createAttribute2Attribute() {
		Attribute2AttributeImpl attribute2Attribute = new Attribute2AttributeImpl();
		return attribute2Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference2Reference createReference2Reference() {
		Reference2ReferenceImpl reference2Reference = new Reference2ReferenceImpl();
		return reference2Reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConvertModifier createConvertModifier() {
		ConvertModifierImpl convertModifier = new ConvertModifierImpl();
		return convertModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntDefaultValue createIntDefaultValue() {
		IntDefaultValueImpl intDefaultValue = new IntDefaultValueImpl();
		return intDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassRef createClassRef() {
		ClassRefImpl classRef = new ClassRefImpl();
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureRef createFeatureRef() {
		FeatureRefImpl featureRef = new FeatureRefImpl();
		return featureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRef createAttributeRef() {
		AttributeRefImpl attributeRef = new AttributeRefImpl();
		return attributeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceRef createReferenceRef() {
		ReferenceRefImpl referenceRef = new ReferenceRefImpl();
		return referenceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingCardinality createMappingCardinalityFromString(EDataType eDataType, String initialValue) {
		MappingCardinality result = MappingCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingsPackage getMappingsPackage() {
		return (MappingsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MappingsPackage getPackage() {
		return MappingsPackage.eINSTANCE;
	}

} //MappingsFactoryImpl
