/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.ModelDefinition;

import org.eclectic.idc.ecl_meta.KClassifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.InlineModel#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getInlineModel()
 * @model
 * @generated
 */
public interface InlineModel extends ModelDefinition {
	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.ecl_meta.KClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see org.eclectic.idc.qool.QoolPackage#getInlineModel_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<KClassifier> getClassifiers();

} // InlineModel
