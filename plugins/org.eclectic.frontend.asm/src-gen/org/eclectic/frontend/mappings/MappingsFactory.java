/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.mappings.MappingsPackage
 * @generated
 */
public interface MappingsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingsFactory eINSTANCE = org.eclectic.frontend.mappings.impl.MappingsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mapping Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Transformation</em>'.
	 * @generated
	 */
	MappingTransformation createMappingTransformation();

	/**
	 * Returns a new object of class '<em>Mapping Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Variable</em>'.
	 * @generated
	 */
	MappingVariable createMappingVariable();

	/**
	 * Returns a new object of class '<em>Matched Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matched Element</em>'.
	 * @generated
	 */
	MatchedElement createMatchedElement();

	/**
	 * Returns a new object of class '<em>Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegate</em>'.
	 * @generated
	 */
	Delegate createDelegate();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Attribute Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Mapping</em>'.
	 * @generated
	 */
	AttributeMapping createAttributeMapping();

	/**
	 * Returns a new object of class '<em>Attribute Is String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Is String</em>'.
	 * @generated
	 */
	AttributeIsString createAttributeIsString();

	/**
	 * Returns a new object of class '<em>Attribute Is Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Is Boolean</em>'.
	 * @generated
	 */
	AttributeIsBoolean createAttributeIsBoolean();

	/**
	 * Returns a new object of class '<em>Attribute Is Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Is Double</em>'.
	 * @generated
	 */
	AttributeIsDouble createAttributeIsDouble();

	/**
	 * Returns a new object of class '<em>Attribute Is Resolve Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Is Resolve Link</em>'.
	 * @generated
	 */
	AttributeIsResolveLink createAttributeIsResolveLink();

	/**
	 * Returns a new object of class '<em>Attribute Is Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Is Integer</em>'.
	 * @generated
	 */
	AttributeIsInteger createAttributeIsInteger();

	/**
	 * Returns a new object of class '<em>Converter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Converter</em>'.
	 * @generated
	 */
	Converter createConverter();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Class2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class2 Class</em>'.
	 * @generated
	 */
	Class2Class createClass2Class();

	/**
	 * Returns a new object of class '<em>Related By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related By</em>'.
	 * @generated
	 */
	RelatedBy createRelatedBy();

	/**
	 * Returns a new object of class '<em>Linked By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linked By</em>'.
	 * @generated
	 */
	LinkedBy createLinkedBy();

	/**
	 * Returns a new object of class '<em>Equality Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality Filter</em>'.
	 * @generated
	 */
	EqualityFilter createEqualityFilter();

	/**
	 * Returns a new object of class '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split</em>'.
	 * @generated
	 */
	Split createSplit();

	/**
	 * Returns a new object of class '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join</em>'.
	 * @generated
	 */
	Join createJoin();

	/**
	 * Returns a new object of class '<em>Attribute2 Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute2 Attribute</em>'.
	 * @generated
	 */
	Attribute2Attribute createAttribute2Attribute();

	/**
	 * Returns a new object of class '<em>Reference2 Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference2 Reference</em>'.
	 * @generated
	 */
	Reference2Reference createReference2Reference();

	/**
	 * Returns a new object of class '<em>Convert Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert Modifier</em>'.
	 * @generated
	 */
	ConvertModifier createConvertModifier();

	/**
	 * Returns a new object of class '<em>Int Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Default Value</em>'.
	 * @generated
	 */
	IntDefaultValue createIntDefaultValue();

	/**
	 * Returns a new object of class '<em>Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Ref</em>'.
	 * @generated
	 */
	ClassRef createClassRef();

	/**
	 * Returns a new object of class '<em>Feature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Ref</em>'.
	 * @generated
	 */
	FeatureRef createFeatureRef();

	/**
	 * Returns a new object of class '<em>Attribute Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Ref</em>'.
	 * @generated
	 */
	AttributeRef createAttributeRef();

	/**
	 * Returns a new object of class '<em>Reference Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Ref</em>'.
	 * @generated
	 */
	ReferenceRef createReferenceRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MappingsPackage getMappingsPackage();

} //MappingsFactory
