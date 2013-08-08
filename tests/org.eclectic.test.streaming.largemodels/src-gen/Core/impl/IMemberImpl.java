/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Core.impl;

import Core.CorePackage;
import Core.IMember;
import Core.ISourceRange;
import Core.ISourceReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Core.impl.IMemberImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Core.impl.IMemberImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link Core.impl.IMemberImpl#getJavadocRange <em>Javadoc Range</em>}</li>
 *   <li>{@link Core.impl.IMemberImpl#getNameRange <em>Name Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IMemberImpl extends IJavaElementImpl implements IMember {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceRange() <em>Source Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRange()
	 * @generated
	 * @ordered
	 */
	protected ISourceRange sourceRange;

	/**
	 * The cached value of the '{@link #getJavadocRange() <em>Javadoc Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavadocRange()
	 * @generated
	 * @ordered
	 */
	protected ISourceRange javadocRange;

	/**
	 * The cached value of the '{@link #getNameRange() <em>Name Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameRange()
	 * @generated
	 * @ordered
	 */
	protected ISourceRange nameRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IMEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMEMBER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getSourceRange() {
		return sourceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRange(ISourceRange newSourceRange, NotificationChain msgs) {
		ISourceRange oldSourceRange = sourceRange;
		sourceRange = newSourceRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMEMBER__SOURCE_RANGE, oldSourceRange, newSourceRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRange(ISourceRange newSourceRange) {
		if (newSourceRange != sourceRange) {
			NotificationChain msgs = null;
			if (sourceRange != null)
				msgs = ((InternalEObject)sourceRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMEMBER__SOURCE_RANGE, null, msgs);
			if (newSourceRange != null)
				msgs = ((InternalEObject)newSourceRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMEMBER__SOURCE_RANGE, null, msgs);
			msgs = basicSetSourceRange(newSourceRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMEMBER__SOURCE_RANGE, newSourceRange, newSourceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getJavadocRange() {
		return javadocRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavadocRange(ISourceRange newJavadocRange, NotificationChain msgs) {
		ISourceRange oldJavadocRange = javadocRange;
		javadocRange = newJavadocRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMEMBER__JAVADOC_RANGE, oldJavadocRange, newJavadocRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavadocRange(ISourceRange newJavadocRange) {
		if (newJavadocRange != javadocRange) {
			NotificationChain msgs = null;
			if (javadocRange != null)
				msgs = ((InternalEObject)javadocRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMEMBER__JAVADOC_RANGE, null, msgs);
			if (newJavadocRange != null)
				msgs = ((InternalEObject)newJavadocRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMEMBER__JAVADOC_RANGE, null, msgs);
			msgs = basicSetJavadocRange(newJavadocRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMEMBER__JAVADOC_RANGE, newJavadocRange, newJavadocRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getNameRange() {
		return nameRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameRange(ISourceRange newNameRange, NotificationChain msgs) {
		ISourceRange oldNameRange = nameRange;
		nameRange = newNameRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMEMBER__NAME_RANGE, oldNameRange, newNameRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameRange(ISourceRange newNameRange) {
		if (newNameRange != nameRange) {
			NotificationChain msgs = null;
			if (nameRange != null)
				msgs = ((InternalEObject)nameRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMEMBER__NAME_RANGE, null, msgs);
			if (newNameRange != null)
				msgs = ((InternalEObject)newNameRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMEMBER__NAME_RANGE, null, msgs);
			msgs = basicSetNameRange(newNameRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMEMBER__NAME_RANGE, newNameRange, newNameRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IMEMBER__SOURCE_RANGE:
				return basicSetSourceRange(null, msgs);
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				return basicSetJavadocRange(null, msgs);
			case CorePackage.IMEMBER__NAME_RANGE:
				return basicSetNameRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.IMEMBER__SOURCE:
				return getSource();
			case CorePackage.IMEMBER__SOURCE_RANGE:
				return getSourceRange();
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				return getJavadocRange();
			case CorePackage.IMEMBER__NAME_RANGE:
				return getNameRange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.IMEMBER__SOURCE:
				setSource((String)newValue);
				return;
			case CorePackage.IMEMBER__SOURCE_RANGE:
				setSourceRange((ISourceRange)newValue);
				return;
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				setJavadocRange((ISourceRange)newValue);
				return;
			case CorePackage.IMEMBER__NAME_RANGE:
				setNameRange((ISourceRange)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.IMEMBER__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CorePackage.IMEMBER__SOURCE_RANGE:
				setSourceRange((ISourceRange)null);
				return;
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				setJavadocRange((ISourceRange)null);
				return;
			case CorePackage.IMEMBER__NAME_RANGE:
				setNameRange((ISourceRange)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.IMEMBER__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case CorePackage.IMEMBER__SOURCE_RANGE:
				return sourceRange != null;
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				return javadocRange != null;
			case CorePackage.IMEMBER__NAME_RANGE:
				return nameRange != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ISourceReference.class) {
			switch (derivedFeatureID) {
				case CorePackage.IMEMBER__SOURCE: return CorePackage.ISOURCE_REFERENCE__SOURCE;
				case CorePackage.IMEMBER__SOURCE_RANGE: return CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ISourceReference.class) {
			switch (baseFeatureID) {
				case CorePackage.ISOURCE_REFERENCE__SOURCE: return CorePackage.IMEMBER__SOURCE;
				case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE: return CorePackage.IMEMBER__SOURCE_RANGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //IMemberImpl
