/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.util;

import org.eclectic.frontend.core.AnnotableElement;
import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.ImplicitlyAnnotableElement;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.ModuleDefinition;
import org.eclectic.frontend.core.NamedElement;
import org.eclectic.frontend.core.TransformationDefinition;

import org.eclectic.frontend.core.TypeExpression;
import org.eclectic.frontend.core.Variable;
import org.eclectic.frontend.mappings.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.mappings.MappingsPackage
 * @generated
 */
public class MappingsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MappingsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingsSwitch<Adapter> modelSwitch =
		new MappingsSwitch<Adapter>() {
			@Override
			public Adapter caseMappingTransformation(MappingTransformation object) {
				return createMappingTransformationAdapter();
			}
			@Override
			public Adapter caseMappingVariable(MappingVariable object) {
				return createMappingVariableAdapter();
			}
			@Override
			public Adapter caseMatchedElement(MatchedElement object) {
				return createMatchedElementAdapter();
			}
			@Override
			public Adapter caseDelegate(Delegate object) {
				return createDelegateAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseMappingElement(MappingElement object) {
				return createMappingElementAdapter();
			}
			@Override
			public Adapter caseClassMapping(ClassMapping object) {
				return createClassMappingAdapter();
			}
			@Override
			public Adapter caseFeature2Feature(Feature2Feature object) {
				return createFeature2FeatureAdapter();
			}
			@Override
			public Adapter caseAttributeMapping(AttributeMapping object) {
				return createAttributeMappingAdapter();
			}
			@Override
			public Adapter caseAttributeRightPart(AttributeRightPart object) {
				return createAttributeRightPartAdapter();
			}
			@Override
			public Adapter caseAttributeIsString(AttributeIsString object) {
				return createAttributeIsStringAdapter();
			}
			@Override
			public Adapter caseAttributeIsBoolean(AttributeIsBoolean object) {
				return createAttributeIsBooleanAdapter();
			}
			@Override
			public Adapter caseAttributeIsDouble(AttributeIsDouble object) {
				return createAttributeIsDoubleAdapter();
			}
			@Override
			public Adapter caseAttributeIsResolveLink(AttributeIsResolveLink object) {
				return createAttributeIsResolveLinkAdapter();
			}
			@Override
			public Adapter caseAttributeIsInteger(AttributeIsInteger object) {
				return createAttributeIsIntegerAdapter();
			}
			@Override
			public Adapter caseConverter(Converter object) {
				return createConverterAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseClass2Class(Class2Class object) {
				return createClass2ClassAdapter();
			}
			@Override
			public Adapter caseC2CModifier(C2CModifier object) {
				return createC2CModifierAdapter();
			}
			@Override
			public Adapter caseRelatedBy(RelatedBy object) {
				return createRelatedByAdapter();
			}
			@Override
			public Adapter caseLinkedBy(LinkedBy object) {
				return createLinkedByAdapter();
			}
			@Override
			public Adapter caseEqualityFilter(EqualityFilter object) {
				return createEqualityFilterAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseSplit(Split object) {
				return createSplitAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseAttribute2Attribute(Attribute2Attribute object) {
				return createAttribute2AttributeAdapter();
			}
			@Override
			public Adapter caseReference2Reference(Reference2Reference object) {
				return createReference2ReferenceAdapter();
			}
			@Override
			public Adapter caseModifier(Modifier object) {
				return createModifierAdapter();
			}
			@Override
			public Adapter caseAttributeModifier(AttributeModifier object) {
				return createAttributeModifierAdapter();
			}
			@Override
			public Adapter caseConvertModifier(ConvertModifier object) {
				return createConvertModifierAdapter();
			}
			@Override
			public Adapter caseDefaultValue(DefaultValue object) {
				return createDefaultValueAdapter();
			}
			@Override
			public Adapter caseIntDefaultValue(IntDefaultValue object) {
				return createIntDefaultValueAdapter();
			}
			@Override
			public Adapter caseMetamodelElementRef(MetamodelElementRef object) {
				return createMetamodelElementRefAdapter();
			}
			@Override
			public Adapter caseClassRef(ClassRef object) {
				return createClassRefAdapter();
			}
			@Override
			public Adapter caseFeatureRef(FeatureRef object) {
				return createFeatureRefAdapter();
			}
			@Override
			public Adapter caseAttributeRef(AttributeRef object) {
				return createAttributeRefAdapter();
			}
			@Override
			public Adapter caseReferenceRef(ReferenceRef object) {
				return createReferenceRefAdapter();
			}
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAnnotableElement(AnnotableElement object) {
				return createAnnotableElementAdapter();
			}
			@Override
			public Adapter caseModuleDefinition(ModuleDefinition object) {
				return createModuleDefinitionAdapter();
			}
			@Override
			public Adapter caseTransformationDefinition(TransformationDefinition object) {
				return createTransformationDefinitionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseTypeExpression(TypeExpression object) {
				return createTypeExpressionAdapter();
			}
			@Override
			public Adapter caseImplicitlyAnnotableElement(ImplicitlyAnnotableElement object) {
				return createImplicitlyAnnotableElementAdapter();
			}
			@Override
			public Adapter caseClassUse(ClassUse object) {
				return createClassUseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.MappingTransformation <em>Mapping Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.MappingTransformation
	 * @generated
	 */
	public Adapter createMappingTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.MappingVariable <em>Mapping Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.MappingVariable
	 * @generated
	 */
	public Adapter createMappingVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.MatchedElement <em>Matched Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.MatchedElement
	 * @generated
	 */
	public Adapter createMatchedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Delegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Delegate
	 * @generated
	 */
	public Adapter createDelegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.MappingElement <em>Mapping Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.MappingElement
	 * @generated
	 */
	public Adapter createMappingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.ClassMapping <em>Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.ClassMapping
	 * @generated
	 */
	public Adapter createClassMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Feature2Feature <em>Feature2 Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Feature2Feature
	 * @generated
	 */
	public Adapter createFeature2FeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeMapping <em>Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeMapping
	 * @generated
	 */
	public Adapter createAttributeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeRightPart <em>Attribute Right Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeRightPart
	 * @generated
	 */
	public Adapter createAttributeRightPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeIsString <em>Attribute Is String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeIsString
	 * @generated
	 */
	public Adapter createAttributeIsStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeIsBoolean <em>Attribute Is Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeIsBoolean
	 * @generated
	 */
	public Adapter createAttributeIsBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeIsDouble <em>Attribute Is Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeIsDouble
	 * @generated
	 */
	public Adapter createAttributeIsDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeIsResolveLink <em>Attribute Is Resolve Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeIsResolveLink
	 * @generated
	 */
	public Adapter createAttributeIsResolveLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeIsInteger <em>Attribute Is Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeIsInteger
	 * @generated
	 */
	public Adapter createAttributeIsIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Converter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Converter
	 * @generated
	 */
	public Adapter createConverterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Class2Class <em>Class2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Class2Class
	 * @generated
	 */
	public Adapter createClass2ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.C2CModifier <em>C2C Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.C2CModifier
	 * @generated
	 */
	public Adapter createC2CModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.RelatedBy <em>Related By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.RelatedBy
	 * @generated
	 */
	public Adapter createRelatedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.LinkedBy <em>Linked By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.LinkedBy
	 * @generated
	 */
	public Adapter createLinkedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.EqualityFilter <em>Equality Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.EqualityFilter
	 * @generated
	 */
	public Adapter createEqualityFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Attribute2Attribute <em>Attribute2 Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Attribute2Attribute
	 * @generated
	 */
	public Adapter createAttribute2AttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Reference2Reference <em>Reference2 Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Reference2Reference
	 * @generated
	 */
	public Adapter createReference2ReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.Modifier
	 * @generated
	 */
	public Adapter createModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeModifier <em>Attribute Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeModifier
	 * @generated
	 */
	public Adapter createAttributeModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.ConvertModifier <em>Convert Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.ConvertModifier
	 * @generated
	 */
	public Adapter createConvertModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.DefaultValue
	 * @generated
	 */
	public Adapter createDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.IntDefaultValue <em>Int Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.IntDefaultValue
	 * @generated
	 */
	public Adapter createIntDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.MetamodelElementRef <em>Metamodel Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.MetamodelElementRef
	 * @generated
	 */
	public Adapter createMetamodelElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.ClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.ClassRef
	 * @generated
	 */
	public Adapter createClassRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.FeatureRef <em>Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.FeatureRef
	 * @generated
	 */
	public Adapter createFeatureRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.AttributeRef <em>Attribute Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.AttributeRef
	 * @generated
	 */
	public Adapter createAttributeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.mappings.ReferenceRef <em>Reference Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.mappings.ReferenceRef
	 * @generated
	 */
	public Adapter createReferenceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.AnnotableElement <em>Annotable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.AnnotableElement
	 * @generated
	 */
	public Adapter createAnnotableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.ModuleDefinition
	 * @generated
	 */
	public Adapter createModuleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.TransformationDefinition <em>Transformation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.TransformationDefinition
	 * @generated
	 */
	public Adapter createTransformationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.TypeExpression <em>Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.TypeExpression
	 * @generated
	 */
	public Adapter createTypeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.ImplicitlyAnnotableElement <em>Implicitly Annotable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.ImplicitlyAnnotableElement
	 * @generated
	 */
	public Adapter createImplicitlyAnnotableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.frontend.core.ClassUse <em>Class Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.frontend.core.ClassUse
	 * @generated
	 */
	public Adapter createClassUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MappingsAdapterFactory
