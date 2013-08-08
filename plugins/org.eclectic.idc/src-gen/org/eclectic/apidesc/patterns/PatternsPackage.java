/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns;

import org.eclectic.apidesc.ApidescPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclectic.apidesc.patterns.PatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/apidesc/patterns";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apidesc_mm_patterns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsPackage eINSTANCE = org.eclectic.apidesc.patterns.impl.PatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.patterns.impl.IteratorDescriptionImpl <em>Iterator Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.patterns.impl.IteratorDescriptionImpl
	 * @see org.eclectic.apidesc.patterns.impl.PatternsPackageImpl#getIteratorDescription()
	 * @generated
	 */
	int ITERATOR_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DESCRIPTION__NAME = ApidescPackage.DECLARED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Iterator Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DESCRIPTION__ITERATOR_CLASS = ApidescPackage.DECLARED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Finished</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DESCRIPTION__HAS_FINISHED = ApidescPackage.DECLARED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DESCRIPTION__NEXT_ELEMENT = ApidescPackage.DECLARED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DESCRIPTION__CURRENT_ELEMENT = ApidescPackage.DECLARED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Iterator Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DESCRIPTION_FEATURE_COUNT = ApidescPackage.DECLARED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.patterns.impl.IteratorGetterImpl <em>Iterator Getter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.patterns.impl.IteratorGetterImpl
	 * @see org.eclectic.apidesc.patterns.impl.PatternsPackageImpl#getIteratorGetter()
	 * @generated
	 */
	int ITERATOR_GETTER = 1;

	/**
	 * The feature id for the '<em><b>Get Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_GETTER__GET_ITERATOR = ApidescPackage.GET_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_GETTER__ITERATOR = ApidescPackage.GET_MECHANISM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iterator Getter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_GETTER_FEATURE_COUNT = ApidescPackage.GET_MECHANISM_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.patterns.impl.ObserverDescriptionImpl <em>Observer Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.patterns.impl.ObserverDescriptionImpl
	 * @see org.eclectic.apidesc.patterns.impl.PatternsPackageImpl#getObserverDescription()
	 * @generated
	 */
	int OBSERVER_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_DESCRIPTION__NAME = ApidescPackage.DECLARED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Observer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_DESCRIPTION__OBSERVER_CLASS = ApidescPackage.DECLARED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_DESCRIPTION__UPDATE_METHODS = ApidescPackage.DECLARED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observer Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_DESCRIPTION_FEATURE_COUNT = ApidescPackage.DECLARED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.patterns.impl.UpdateMethodImpl <em>Update Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.patterns.impl.UpdateMethodImpl
	 * @see org.eclectic.apidesc.patterns.impl.PatternsPackageImpl#getUpdateMethod()
	 * @generated
	 */
	int UPDATE_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__NAME = ApidescPackage.METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__PARAMETER_TYPES = ApidescPackage.METHOD__PARAMETER_TYPES;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__RETURN_TYPE = ApidescPackage.METHOD__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Return Void</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__RETURN_VOID = ApidescPackage.METHOD__RETURN_VOID;

	/**
	 * The feature id for the '<em><b>Return Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__RETURN_ARRAY = ApidescPackage.METHOD__RETURN_ARRAY;

	/**
	 * The feature id for the '<em><b>Return Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__RETURN_COLLECTION = ApidescPackage.METHOD__RETURN_COLLECTION;

	/**
	 * The feature id for the '<em><b>Interest</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__INTEREST = ApidescPackage.METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD_FEATURE_COUNT = ApidescPackage.METHOD_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.patterns.IteratorDescription <em>Iterator Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Description</em>'.
	 * @see org.eclectic.apidesc.patterns.IteratorDescription
	 * @generated
	 */
	EClass getIteratorDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.patterns.IteratorDescription#getIteratorClass <em>Iterator Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator Class</em>'.
	 * @see org.eclectic.apidesc.patterns.IteratorDescription#getIteratorClass()
	 * @see #getIteratorDescription()
	 * @generated
	 */
	EAttribute getIteratorDescription_IteratorClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.patterns.IteratorDescription#getHasFinished <em>Has Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Finished</em>'.
	 * @see org.eclectic.apidesc.patterns.IteratorDescription#getHasFinished()
	 * @see #getIteratorDescription()
	 * @generated
	 */
	EReference getIteratorDescription_HasFinished();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.patterns.IteratorDescription#getNextElement <em>Next Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Element</em>'.
	 * @see org.eclectic.apidesc.patterns.IteratorDescription#getNextElement()
	 * @see #getIteratorDescription()
	 * @generated
	 */
	EReference getIteratorDescription_NextElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.patterns.IteratorDescription#getCurrentElement <em>Current Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Element</em>'.
	 * @see org.eclectic.apidesc.patterns.IteratorDescription#getCurrentElement()
	 * @see #getIteratorDescription()
	 * @generated
	 */
	EReference getIteratorDescription_CurrentElement();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.patterns.IteratorGetter <em>Iterator Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Getter</em>'.
	 * @see org.eclectic.apidesc.patterns.IteratorGetter
	 * @generated
	 */
	EClass getIteratorGetter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.patterns.IteratorGetter#getGetIterator <em>Get Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Iterator</em>'.
	 * @see org.eclectic.apidesc.patterns.IteratorGetter#getGetIterator()
	 * @see #getIteratorGetter()
	 * @generated
	 */
	EReference getIteratorGetter_GetIterator();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.apidesc.patterns.IteratorGetter#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iterator</em>'.
	 * @see org.eclectic.apidesc.patterns.IteratorGetter#getIterator()
	 * @see #getIteratorGetter()
	 * @generated
	 */
	EReference getIteratorGetter_Iterator();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.patterns.ObserverDescription <em>Observer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer Description</em>'.
	 * @see org.eclectic.apidesc.patterns.ObserverDescription
	 * @generated
	 */
	EClass getObserverDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.patterns.ObserverDescription#getObserverClass <em>Observer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observer Class</em>'.
	 * @see org.eclectic.apidesc.patterns.ObserverDescription#getObserverClass()
	 * @see #getObserverDescription()
	 * @generated
	 */
	EAttribute getObserverDescription_ObserverClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.apidesc.patterns.ObserverDescription#getUpdateMethods <em>Update Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update Methods</em>'.
	 * @see org.eclectic.apidesc.patterns.ObserverDescription#getUpdateMethods()
	 * @see #getObserverDescription()
	 * @generated
	 */
	EReference getObserverDescription_UpdateMethods();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.patterns.UpdateMethod <em>Update Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Method</em>'.
	 * @see org.eclectic.apidesc.patterns.UpdateMethod
	 * @generated
	 */
	EClass getUpdateMethod();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclectic.apidesc.patterns.UpdateMethod#getInterest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interest</em>'.
	 * @see org.eclectic.apidesc.patterns.UpdateMethod#getInterest()
	 * @see #getUpdateMethod()
	 * @generated
	 */
	EAttribute getUpdateMethod_Interest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsFactory getPatternsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.patterns.impl.IteratorDescriptionImpl <em>Iterator Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.patterns.impl.IteratorDescriptionImpl
		 * @see org.eclectic.apidesc.patterns.impl.PatternsPackageImpl#getIteratorDescription()
		 * @generated
		 */
		EClass ITERATOR_DESCRIPTION = eINSTANCE.getIteratorDescription();

		/**
		 * The meta object literal for the '<em><b>Iterator Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_DESCRIPTION__ITERATOR_CLASS = eINSTANCE.getIteratorDescription_IteratorClass();

		/**
		 * The meta object literal for the '<em><b>Has Finished</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_DESCRIPTION__HAS_FINISHED = eINSTANCE.getIteratorDescription_HasFinished();

		/**
		 * The meta object literal for the '<em><b>Next Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_DESCRIPTION__NEXT_ELEMENT = eINSTANCE.getIteratorDescription_NextElement();

		/**
		 * The meta object literal for the '<em><b>Current Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_DESCRIPTION__CURRENT_ELEMENT = eINSTANCE.getIteratorDescription_CurrentElement();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.patterns.impl.IteratorGetterImpl <em>Iterator Getter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.patterns.impl.IteratorGetterImpl
		 * @see org.eclectic.apidesc.patterns.impl.PatternsPackageImpl#getIteratorGetter()
		 * @generated
		 */
		EClass ITERATOR_GETTER = eINSTANCE.getIteratorGetter();

		/**
		 * The meta object literal for the '<em><b>Get Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_GETTER__GET_ITERATOR = eINSTANCE.getIteratorGetter_GetIterator();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_GETTER__ITERATOR = eINSTANCE.getIteratorGetter_Iterator();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.patterns.impl.ObserverDescriptionImpl <em>Observer Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.patterns.impl.ObserverDescriptionImpl
		 * @see org.eclectic.apidesc.patterns.impl.PatternsPackageImpl#getObserverDescription()
		 * @generated
		 */
		EClass OBSERVER_DESCRIPTION = eINSTANCE.getObserverDescription();

		/**
		 * The meta object literal for the '<em><b>Observer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVER_DESCRIPTION__OBSERVER_CLASS = eINSTANCE.getObserverDescription_ObserverClass();

		/**
		 * The meta object literal for the '<em><b>Update Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_DESCRIPTION__UPDATE_METHODS = eINSTANCE.getObserverDescription_UpdateMethods();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.patterns.impl.UpdateMethodImpl <em>Update Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.patterns.impl.UpdateMethodImpl
		 * @see org.eclectic.apidesc.patterns.impl.PatternsPackageImpl#getUpdateMethod()
		 * @generated
		 */
		EClass UPDATE_METHOD = eINSTANCE.getUpdateMethod();

		/**
		 * The meta object literal for the '<em><b>Interest</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_METHOD__INTEREST = eINSTANCE.getUpdateMethod_Interest();

	}

} //PatternsPackage
