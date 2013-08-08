/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.runtime;

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
 * @see org.eclectic.streamdesc.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/streamdesc/runtime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "streamdesc_runtime_mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = org.eclectic.streamdesc.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl <em>Streamed Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl
	 * @see org.eclectic.streamdesc.runtime.impl.RuntimePackageImpl#getStreamedFragment()
	 * @generated
	 */
	int STREAMED_FRAGMENT = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED_FRAGMENT__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED_FRAGMENT__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Non Proxy Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED_FRAGMENT__NON_PROXY_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Proxy Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED_FRAGMENT__PROXY_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED_FRAGMENT__ANNOTATIONS = 4;

	/**
	 * The number of structural features of the '<em>Streamed Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED_FRAGMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclectic.streamdesc.runtime.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.streamdesc.runtime.impl.AnnotationImpl
	 * @see org.eclectic.streamdesc.runtime.impl.RuntimePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.streamdesc.runtime.impl.IsProxyAnnotationImpl <em>Is Proxy Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.streamdesc.runtime.impl.IsProxyAnnotationImpl
	 * @see org.eclectic.streamdesc.runtime.impl.RuntimePackageImpl#getIsProxyAnnotation()
	 * @generated
	 */
	int IS_PROXY_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROXY_ANNOTATION__OBJECT = ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Reference Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROXY_ANNOTATION__REFERENCE_SOURCE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROXY_ANNOTATION__REFERENCE_NAME = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Proxy Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROXY_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclectic.streamdesc.runtime.StreamedFragment <em>Streamed Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streamed Fragment</em>'.
	 * @see org.eclectic.streamdesc.runtime.StreamedFragment
	 * @generated
	 */
	EClass getStreamedFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.runtime.StreamedFragment#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclectic.streamdesc.runtime.StreamedFragment#getTimestamp()
	 * @see #getStreamedFragment()
	 * @generated
	 */
	EAttribute getStreamedFragment_Timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.streamdesc.runtime.StreamedFragment#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclectic.streamdesc.runtime.StreamedFragment#getElements()
	 * @see #getStreamedFragment()
	 * @generated
	 */
	EReference getStreamedFragment_Elements();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.streamdesc.runtime.StreamedFragment#getNonProxyElements <em>Non Proxy Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Proxy Elements</em>'.
	 * @see org.eclectic.streamdesc.runtime.StreamedFragment#getNonProxyElements()
	 * @see #getStreamedFragment()
	 * @generated
	 */
	EReference getStreamedFragment_NonProxyElements();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.streamdesc.runtime.StreamedFragment#getProxyElements <em>Proxy Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Elements</em>'.
	 * @see org.eclectic.streamdesc.runtime.StreamedFragment#getProxyElements()
	 * @see #getStreamedFragment()
	 * @generated
	 */
	EReference getStreamedFragment_ProxyElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.streamdesc.runtime.StreamedFragment#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.eclectic.streamdesc.runtime.StreamedFragment#getAnnotations()
	 * @see #getStreamedFragment()
	 * @generated
	 */
	EReference getStreamedFragment_Annotations();

	/**
	 * Returns the meta object for class '{@link org.eclectic.streamdesc.runtime.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.eclectic.streamdesc.runtime.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.streamdesc.runtime.Annotation#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.eclectic.streamdesc.runtime.Annotation#getObject()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Object();

	/**
	 * Returns the meta object for class '{@link org.eclectic.streamdesc.runtime.IsProxyAnnotation <em>Is Proxy Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Proxy Annotation</em>'.
	 * @see org.eclectic.streamdesc.runtime.IsProxyAnnotation
	 * @generated
	 */
	EClass getIsProxyAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.streamdesc.runtime.IsProxyAnnotation#getReferenceSource <em>Reference Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Source</em>'.
	 * @see org.eclectic.streamdesc.runtime.IsProxyAnnotation#getReferenceSource()
	 * @see #getIsProxyAnnotation()
	 * @generated
	 */
	EReference getIsProxyAnnotation_ReferenceSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.runtime.IsProxyAnnotation#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see org.eclectic.streamdesc.runtime.IsProxyAnnotation#getReferenceName()
	 * @see #getIsProxyAnnotation()
	 * @generated
	 */
	EAttribute getIsProxyAnnotation_ReferenceName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
		 * The meta object literal for the '{@link org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl <em>Streamed Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl
		 * @see org.eclectic.streamdesc.runtime.impl.RuntimePackageImpl#getStreamedFragment()
		 * @generated
		 */
		EClass STREAMED_FRAGMENT = eINSTANCE.getStreamedFragment();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAMED_FRAGMENT__TIMESTAMP = eINSTANCE.getStreamedFragment_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMED_FRAGMENT__ELEMENTS = eINSTANCE.getStreamedFragment_Elements();

		/**
		 * The meta object literal for the '<em><b>Non Proxy Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMED_FRAGMENT__NON_PROXY_ELEMENTS = eINSTANCE.getStreamedFragment_NonProxyElements();

		/**
		 * The meta object literal for the '<em><b>Proxy Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMED_FRAGMENT__PROXY_ELEMENTS = eINSTANCE.getStreamedFragment_ProxyElements();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMED_FRAGMENT__ANNOTATIONS = eINSTANCE.getStreamedFragment_Annotations();

		/**
		 * The meta object literal for the '{@link org.eclectic.streamdesc.runtime.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.streamdesc.runtime.impl.AnnotationImpl
		 * @see org.eclectic.streamdesc.runtime.impl.RuntimePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__OBJECT = eINSTANCE.getAnnotation_Object();

		/**
		 * The meta object literal for the '{@link org.eclectic.streamdesc.runtime.impl.IsProxyAnnotationImpl <em>Is Proxy Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.streamdesc.runtime.impl.IsProxyAnnotationImpl
		 * @see org.eclectic.streamdesc.runtime.impl.RuntimePackageImpl#getIsProxyAnnotation()
		 * @generated
		 */
		EClass IS_PROXY_ANNOTATION = eINSTANCE.getIsProxyAnnotation();

		/**
		 * The meta object literal for the '<em><b>Reference Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_PROXY_ANNOTATION__REFERENCE_SOURCE = eINSTANCE.getIsProxyAnnotation_ReferenceSource();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_PROXY_ANNOTATION__REFERENCE_NAME = eINSTANCE.getIsProxyAnnotation_ReferenceName();

	}

} //RuntimePackage
