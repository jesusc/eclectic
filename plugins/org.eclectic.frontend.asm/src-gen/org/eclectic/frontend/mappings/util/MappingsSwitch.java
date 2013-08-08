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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.mappings.MappingsPackage
 * @generated
 */
public class MappingsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingsSwitch() {
		if (modelPackage == null) {
			modelPackage = MappingsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MappingsPackage.MAPPING_TRANSFORMATION: {
				MappingTransformation mappingTransformation = (MappingTransformation)theEObject;
				T result = caseMappingTransformation(mappingTransformation);
				if (result == null) result = caseTransformationDefinition(mappingTransformation);
				if (result == null) result = caseModuleDefinition(mappingTransformation);
				if (result == null) result = caseLocatedElement(mappingTransformation);
				if (result == null) result = caseNamedElement(mappingTransformation);
				if (result == null) result = caseAnnotableElement(mappingTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.MAPPING_VARIABLE: {
				MappingVariable mappingVariable = (MappingVariable)theEObject;
				T result = caseMappingVariable(mappingVariable);
				if (result == null) result = caseVariable(mappingVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.MATCHED_ELEMENT: {
				MatchedElement matchedElement = (MatchedElement)theEObject;
				T result = caseMatchedElement(matchedElement);
				if (result == null) result = caseClassUse(matchedElement);
				if (result == null) result = caseMappingVariable(matchedElement);
				if (result == null) result = caseTypeExpression(matchedElement);
				if (result == null) result = caseImplicitlyAnnotableElement(matchedElement);
				if (result == null) result = caseVariable(matchedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.DELEGATE: {
				Delegate delegate = (Delegate)theEObject;
				T result = caseDelegate(delegate);
				if (result == null) result = caseLocatedElement(delegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseLocatedElement(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseLocatedElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.MAPPING_ELEMENT: {
				MappingElement mappingElement = (MappingElement)theEObject;
				T result = caseMappingElement(mappingElement);
				if (result == null) result = caseLocatedElement(mappingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.CLASS_MAPPING: {
				ClassMapping classMapping = (ClassMapping)theEObject;
				T result = caseClassMapping(classMapping);
				if (result == null) result = caseMappingElement(classMapping);
				if (result == null) result = caseLocatedElement(classMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.FEATURE2_FEATURE: {
				Feature2Feature feature2Feature = (Feature2Feature)theEObject;
				T result = caseFeature2Feature(feature2Feature);
				if (result == null) result = caseMappingElement(feature2Feature);
				if (result == null) result = caseLocatedElement(feature2Feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_MAPPING: {
				AttributeMapping attributeMapping = (AttributeMapping)theEObject;
				T result = caseAttributeMapping(attributeMapping);
				if (result == null) result = caseFeature2Feature(attributeMapping);
				if (result == null) result = caseMappingElement(attributeMapping);
				if (result == null) result = caseLocatedElement(attributeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_RIGHT_PART: {
				AttributeRightPart attributeRightPart = (AttributeRightPart)theEObject;
				T result = caseAttributeRightPart(attributeRightPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_IS_STRING: {
				AttributeIsString attributeIsString = (AttributeIsString)theEObject;
				T result = caseAttributeIsString(attributeIsString);
				if (result == null) result = caseAttributeRightPart(attributeIsString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_IS_BOOLEAN: {
				AttributeIsBoolean attributeIsBoolean = (AttributeIsBoolean)theEObject;
				T result = caseAttributeIsBoolean(attributeIsBoolean);
				if (result == null) result = caseAttributeRightPart(attributeIsBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_IS_DOUBLE: {
				AttributeIsDouble attributeIsDouble = (AttributeIsDouble)theEObject;
				T result = caseAttributeIsDouble(attributeIsDouble);
				if (result == null) result = caseAttributeRightPart(attributeIsDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK: {
				AttributeIsResolveLink attributeIsResolveLink = (AttributeIsResolveLink)theEObject;
				T result = caseAttributeIsResolveLink(attributeIsResolveLink);
				if (result == null) result = caseAttributeRightPart(attributeIsResolveLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_IS_INTEGER: {
				AttributeIsInteger attributeIsInteger = (AttributeIsInteger)theEObject;
				T result = caseAttributeIsInteger(attributeIsInteger);
				if (result == null) result = caseAttributeRightPart(attributeIsInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.CONVERTER: {
				Converter converter = (Converter)theEObject;
				T result = caseConverter(converter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseNamedElement(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.CLASS2_CLASS: {
				Class2Class class2Class = (Class2Class)theEObject;
				T result = caseClass2Class(class2Class);
				if (result == null) result = caseClassMapping(class2Class);
				if (result == null) result = caseMappingElement(class2Class);
				if (result == null) result = caseLocatedElement(class2Class);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.C2C_MODIFIER: {
				C2CModifier c2CModifier = (C2CModifier)theEObject;
				T result = caseC2CModifier(c2CModifier);
				if (result == null) result = caseMappingElement(c2CModifier);
				if (result == null) result = caseLocatedElement(c2CModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.RELATED_BY: {
				RelatedBy relatedBy = (RelatedBy)theEObject;
				T result = caseRelatedBy(relatedBy);
				if (result == null) result = caseC2CModifier(relatedBy);
				if (result == null) result = caseMappingElement(relatedBy);
				if (result == null) result = caseLocatedElement(relatedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.LINKED_BY: {
				LinkedBy linkedBy = (LinkedBy)theEObject;
				T result = caseLinkedBy(linkedBy);
				if (result == null) result = caseC2CModifier(linkedBy);
				if (result == null) result = caseMappingElement(linkedBy);
				if (result == null) result = caseLocatedElement(linkedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.EQUALITY_FILTER: {
				EqualityFilter equalityFilter = (EqualityFilter)theEObject;
				T result = caseEqualityFilter(equalityFilter);
				if (result == null) result = caseC2CModifier(equalityFilter);
				if (result == null) result = caseMappingElement(equalityFilter);
				if (result == null) result = caseLocatedElement(equalityFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = caseLocatedElement(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.SPLIT: {
				Split split = (Split)theEObject;
				T result = caseSplit(split);
				if (result == null) result = caseOperator(split);
				if (result == null) result = caseLocatedElement(split);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseOperator(join);
				if (result == null) result = caseLocatedElement(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE: {
				Attribute2Attribute attribute2Attribute = (Attribute2Attribute)theEObject;
				T result = caseAttribute2Attribute(attribute2Attribute);
				if (result == null) result = caseFeature2Feature(attribute2Attribute);
				if (result == null) result = caseAttributeRightPart(attribute2Attribute);
				if (result == null) result = caseMappingElement(attribute2Attribute);
				if (result == null) result = caseLocatedElement(attribute2Attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.REFERENCE2_REFERENCE: {
				Reference2Reference reference2Reference = (Reference2Reference)theEObject;
				T result = caseReference2Reference(reference2Reference);
				if (result == null) result = caseFeature2Feature(reference2Reference);
				if (result == null) result = caseMappingElement(reference2Reference);
				if (result == null) result = caseLocatedElement(reference2Reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.MODIFIER: {
				Modifier modifier = (Modifier)theEObject;
				T result = caseModifier(modifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_MODIFIER: {
				AttributeModifier attributeModifier = (AttributeModifier)theEObject;
				T result = caseAttributeModifier(attributeModifier);
				if (result == null) result = caseModifier(attributeModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.CONVERT_MODIFIER: {
				ConvertModifier convertModifier = (ConvertModifier)theEObject;
				T result = caseConvertModifier(convertModifier);
				if (result == null) result = caseAttributeModifier(convertModifier);
				if (result == null) result = caseModifier(convertModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.DEFAULT_VALUE: {
				DefaultValue defaultValue = (DefaultValue)theEObject;
				T result = caseDefaultValue(defaultValue);
				if (result == null) result = caseAttributeModifier(defaultValue);
				if (result == null) result = caseModifier(defaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.INT_DEFAULT_VALUE: {
				IntDefaultValue intDefaultValue = (IntDefaultValue)theEObject;
				T result = caseIntDefaultValue(intDefaultValue);
				if (result == null) result = caseDefaultValue(intDefaultValue);
				if (result == null) result = caseAttributeModifier(intDefaultValue);
				if (result == null) result = caseModifier(intDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.METAMODEL_ELEMENT_REF: {
				MetamodelElementRef metamodelElementRef = (MetamodelElementRef)theEObject;
				T result = caseMetamodelElementRef(metamodelElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.CLASS_REF: {
				ClassRef classRef = (ClassRef)theEObject;
				T result = caseClassRef(classRef);
				if (result == null) result = caseMetamodelElementRef(classRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.FEATURE_REF: {
				FeatureRef featureRef = (FeatureRef)theEObject;
				T result = caseFeatureRef(featureRef);
				if (result == null) result = caseMetamodelElementRef(featureRef);
				if (result == null) result = caseFeature2Feature(featureRef);
				if (result == null) result = caseMappingElement(featureRef);
				if (result == null) result = caseLocatedElement(featureRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.ATTRIBUTE_REF: {
				AttributeRef attributeRef = (AttributeRef)theEObject;
				T result = caseAttributeRef(attributeRef);
				if (result == null) result = caseMetamodelElementRef(attributeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingsPackage.REFERENCE_REF: {
				ReferenceRef referenceRef = (ReferenceRef)theEObject;
				T result = caseReferenceRef(referenceRef);
				if (result == null) result = caseMetamodelElementRef(referenceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingTransformation(MappingTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingVariable(MappingVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchedElement(MatchedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegate(Delegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingElement(MappingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMapping(ClassMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature2 Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature2 Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature2Feature(Feature2Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMapping(AttributeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Right Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Right Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRightPart(AttributeRightPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Is String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Is String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeIsString(AttributeIsString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Is Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Is Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeIsBoolean(AttributeIsBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Is Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Is Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeIsDouble(AttributeIsDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Is Resolve Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Is Resolve Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeIsResolveLink(AttributeIsResolveLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Is Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Is Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeIsInteger(AttributeIsInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Converter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Converter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConverter(Converter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass2Class(Class2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C2C Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C2C Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC2CModifier(C2CModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedBy(RelatedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linked By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linked By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkedBy(LinkedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityFilter(EqualityFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute2 Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute2 Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute2Attribute(Attribute2Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference2 Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference2 Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference2Reference(Reference2Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeModifier(AttributeModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvertModifier(ConvertModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultValue(DefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntDefaultValue(IntDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElementRef(MetamodelElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassRef(ClassRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureRef(FeatureRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRef(AttributeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceRef(ReferenceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotableElement(AnnotableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinition(ModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationDefinition(TransformationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeExpression(TypeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicitly Annotable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicitly Annotable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitlyAnnotableElement(ImplicitlyAnnotableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassUse(ClassUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MappingsSwitch
