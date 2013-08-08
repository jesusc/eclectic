/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc;

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
 * @see org.eclectic.streamdesc.StreamdescFactory
 * @model kind="package"
 * @generated
 */
public interface StreamdescPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "streamdesc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/streamdesc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "streamdesc_mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamdescPackage eINSTANCE = org.eclectic.streamdesc.impl.StreamdescPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.streamdesc.impl.StreamDescriptionImpl <em>Stream Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.streamdesc.impl.StreamDescriptionImpl
	 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getStreamDescription()
	 * @generated
	 */
	int STREAM_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Stream Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTION__STREAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTION__METAMODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTION__KEYS = 2;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTION__WINDOWS = 3;

	/**
	 * The number of structural features of the '<em>Stream Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclectic.streamdesc.impl.SlidingWindowImpl <em>Sliding Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.streamdesc.impl.SlidingWindowImpl
	 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getSlidingWindow()
	 * @generated
	 */
	int SLIDING_WINDOW = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW__CLASS_NAME = 0;

	/**
	 * The number of structural features of the '<em>Sliding Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.streamdesc.impl.ElementSlidingWindowImpl <em>Element Sliding Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.streamdesc.impl.ElementSlidingWindowImpl
	 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getElementSlidingWindow()
	 * @generated
	 */
	int ELEMENT_SLIDING_WINDOW = 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLIDING_WINDOW__CLASS_NAME = SLIDING_WINDOW__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLIDING_WINDOW__ELEMENTS = SLIDING_WINDOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Sliding Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLIDING_WINDOW_FEATURE_COUNT = SLIDING_WINDOW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.streamdesc.impl.TimeSlidingWindowImpl <em>Time Sliding Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.streamdesc.impl.TimeSlidingWindowImpl
	 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getTimeSlidingWindow()
	 * @generated
	 */
	int TIME_SLIDING_WINDOW = 3;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLIDING_WINDOW__CLASS_NAME = SLIDING_WINDOW__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLIDING_WINDOW__SECONDS = SLIDING_WINDOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Sliding Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLIDING_WINDOW_FEATURE_COUNT = SLIDING_WINDOW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.streamdesc.impl.KeySpecImpl <em>Key Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.streamdesc.impl.KeySpecImpl
	 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getKeySpec()
	 * @generated
	 */
	int KEY_SPEC = 4;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_SPEC__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_SPEC__FEATURE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Key Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_SPEC_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclectic.streamdesc.StreamDescription <em>Stream Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Description</em>'.
	 * @see org.eclectic.streamdesc.StreamDescription
	 * @generated
	 */
	EClass getStreamDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.StreamDescription#getStreamName <em>Stream Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream Name</em>'.
	 * @see org.eclectic.streamdesc.StreamDescription#getStreamName()
	 * @see #getStreamDescription()
	 * @generated
	 */
	EAttribute getStreamDescription_StreamName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.StreamDescription#getMetamodelName <em>Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Name</em>'.
	 * @see org.eclectic.streamdesc.StreamDescription#getMetamodelName()
	 * @see #getStreamDescription()
	 * @generated
	 */
	EAttribute getStreamDescription_MetamodelName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.streamdesc.StreamDescription#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see org.eclectic.streamdesc.StreamDescription#getKeys()
	 * @see #getStreamDescription()
	 * @generated
	 */
	EReference getStreamDescription_Keys();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.streamdesc.StreamDescription#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see org.eclectic.streamdesc.StreamDescription#getWindows()
	 * @see #getStreamDescription()
	 * @generated
	 */
	EReference getStreamDescription_Windows();

	/**
	 * Returns the meta object for class '{@link org.eclectic.streamdesc.SlidingWindow <em>Sliding Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliding Window</em>'.
	 * @see org.eclectic.streamdesc.SlidingWindow
	 * @generated
	 */
	EClass getSlidingWindow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.SlidingWindow#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclectic.streamdesc.SlidingWindow#getClassName()
	 * @see #getSlidingWindow()
	 * @generated
	 */
	EAttribute getSlidingWindow_ClassName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.streamdesc.ElementSlidingWindow <em>Element Sliding Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Sliding Window</em>'.
	 * @see org.eclectic.streamdesc.ElementSlidingWindow
	 * @generated
	 */
	EClass getElementSlidingWindow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.ElementSlidingWindow#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see org.eclectic.streamdesc.ElementSlidingWindow#getElements()
	 * @see #getElementSlidingWindow()
	 * @generated
	 */
	EAttribute getElementSlidingWindow_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.streamdesc.TimeSlidingWindow <em>Time Sliding Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Sliding Window</em>'.
	 * @see org.eclectic.streamdesc.TimeSlidingWindow
	 * @generated
	 */
	EClass getTimeSlidingWindow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.TimeSlidingWindow#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see org.eclectic.streamdesc.TimeSlidingWindow#getSeconds()
	 * @see #getTimeSlidingWindow()
	 * @generated
	 */
	EAttribute getTimeSlidingWindow_Seconds();

	/**
	 * Returns the meta object for class '{@link org.eclectic.streamdesc.KeySpec <em>Key Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Spec</em>'.
	 * @see org.eclectic.streamdesc.KeySpec
	 * @generated
	 */
	EClass getKeySpec();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.KeySpec#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclectic.streamdesc.KeySpec#getClassName()
	 * @see #getKeySpec()
	 * @generated
	 */
	EAttribute getKeySpec_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.streamdesc.KeySpec#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.streamdesc.KeySpec#getFeatureName()
	 * @see #getKeySpec()
	 * @generated
	 */
	EAttribute getKeySpec_FeatureName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StreamdescFactory getStreamdescFactory();

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
		 * The meta object literal for the '{@link org.eclectic.streamdesc.impl.StreamDescriptionImpl <em>Stream Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.streamdesc.impl.StreamDescriptionImpl
		 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getStreamDescription()
		 * @generated
		 */
		EClass STREAM_DESCRIPTION = eINSTANCE.getStreamDescription();

		/**
		 * The meta object literal for the '<em><b>Stream Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DESCRIPTION__STREAM_NAME = eINSTANCE.getStreamDescription_StreamName();

		/**
		 * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DESCRIPTION__METAMODEL_NAME = eINSTANCE.getStreamDescription_MetamodelName();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DESCRIPTION__KEYS = eINSTANCE.getStreamDescription_Keys();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DESCRIPTION__WINDOWS = eINSTANCE.getStreamDescription_Windows();

		/**
		 * The meta object literal for the '{@link org.eclectic.streamdesc.impl.SlidingWindowImpl <em>Sliding Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.streamdesc.impl.SlidingWindowImpl
		 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getSlidingWindow()
		 * @generated
		 */
		EClass SLIDING_WINDOW = eINSTANCE.getSlidingWindow();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDING_WINDOW__CLASS_NAME = eINSTANCE.getSlidingWindow_ClassName();

		/**
		 * The meta object literal for the '{@link org.eclectic.streamdesc.impl.ElementSlidingWindowImpl <em>Element Sliding Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.streamdesc.impl.ElementSlidingWindowImpl
		 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getElementSlidingWindow()
		 * @generated
		 */
		EClass ELEMENT_SLIDING_WINDOW = eINSTANCE.getElementSlidingWindow();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_SLIDING_WINDOW__ELEMENTS = eINSTANCE.getElementSlidingWindow_Elements();

		/**
		 * The meta object literal for the '{@link org.eclectic.streamdesc.impl.TimeSlidingWindowImpl <em>Time Sliding Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.streamdesc.impl.TimeSlidingWindowImpl
		 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getTimeSlidingWindow()
		 * @generated
		 */
		EClass TIME_SLIDING_WINDOW = eINSTANCE.getTimeSlidingWindow();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SLIDING_WINDOW__SECONDS = eINSTANCE.getTimeSlidingWindow_Seconds();

		/**
		 * The meta object literal for the '{@link org.eclectic.streamdesc.impl.KeySpecImpl <em>Key Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.streamdesc.impl.KeySpecImpl
		 * @see org.eclectic.streamdesc.impl.StreamdescPackageImpl#getKeySpec()
		 * @generated
		 */
		EClass KEY_SPEC = eINSTANCE.getKeySpec();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_SPEC__CLASS_NAME = eINSTANCE.getKeySpec_ClassName();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_SPEC__FEATURE_NAME = eINSTANCE.getKeySpec_FeatureName();

	}

} //StreamdescPackage
