/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISource Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Core.ISourceReference#getSource <em>Source</em>}</li>
 *   <li>{@link Core.ISourceReference#getSourceRange <em>Source Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see Core.CorePackage#getISourceReference()
 * @model abstract="true"
 * @generated
 */
public interface ISourceReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see Core.CorePackage#getISourceReference_Source()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link Core.ISourceReference#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Source Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Range</em>' containment reference.
	 * @see #setSourceRange(ISourceRange)
	 * @see Core.CorePackage#getISourceReference_SourceRange()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ISourceRange getSourceRange();

	/**
	 * Sets the value of the '{@link Core.ISourceReference#getSourceRange <em>Source Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Range</em>' containment reference.
	 * @see #getSourceRange()
	 * @generated
	 */
	void setSourceRange(ISourceRange value);

} // ISourceReference
