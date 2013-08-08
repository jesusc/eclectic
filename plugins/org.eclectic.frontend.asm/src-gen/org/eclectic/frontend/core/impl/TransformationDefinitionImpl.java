/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.impl;

import java.util.Collection;

import org.eclectic.frontend.core.Annotation;
import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.ImportedModel;
import org.eclectic.frontend.core.InlineModel;
import org.eclectic.frontend.core.RequireDeclaration;
import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.TransformationDefinitionParameter;

import org.eclectic.frontend.core.UseDeclaration;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl#getInModels <em>In Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl#getOutModels <em>Out Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl#getImportedModels <em>Imported Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl#getInlineModels <em>Inline Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransformationDefinitionImpl extends ModuleDefinitionImpl implements TransformationDefinition {
	/**
	 * The cached value of the '{@link #getInModels() <em>In Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationDefinitionParameter> inModels;

	/**
	 * The cached value of the '{@link #getOutModels() <em>Out Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationDefinitionParameter> outModels;

	/**
	 * The cached value of the '{@link #getImportedModels() <em>Imported Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedModel> importedModels;

	/**
	 * The cached value of the '{@link #getInlineModels() <em>Inline Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineModels()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineModel> inlineModels;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<UseDeclaration> uses;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<RequireDeclaration> requires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRANSFORMATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationDefinitionParameter> getInModels() {
		if (inModels == null) {
			inModels = new EObjectContainmentEList<TransformationDefinitionParameter>(TransformationDefinitionParameter.class, this, CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS);
		}
		return inModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationDefinitionParameter> getOutModels() {
		if (outModels == null) {
			outModels = new EObjectContainmentEList<TransformationDefinitionParameter>(TransformationDefinitionParameter.class, this, CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS);
		}
		return outModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedModel> getImportedModels() {
		if (importedModels == null) {
			importedModels = new EObjectContainmentEList<ImportedModel>(ImportedModel.class, this, CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS);
		}
		return importedModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InlineModel> getInlineModels() {
		if (inlineModels == null) {
			inlineModels = new EObjectContainmentEList<InlineModel>(InlineModel.class, this, CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS);
		}
		return inlineModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseDeclaration> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<UseDeclaration>(UseDeclaration.class, this, CorePackage.TRANSFORMATION_DEFINITION__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequireDeclaration> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<RequireDeclaration>(RequireDeclaration.class, this, CorePackage.TRANSFORMATION_DEFINITION__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS:
				return ((InternalEList<?>)getInModels()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS:
				return ((InternalEList<?>)getOutModels()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS:
				return ((InternalEList<?>)getImportedModels()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS:
				return ((InternalEList<?>)getInlineModels()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSFORMATION_DEFINITION__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSFORMATION_DEFINITION__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
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
			case CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS:
				return getInModels();
			case CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS:
				return getOutModels();
			case CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS:
				return getImportedModels();
			case CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS:
				return getInlineModels();
			case CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS:
				return getAnnotations();
			case CorePackage.TRANSFORMATION_DEFINITION__USES:
				return getUses();
			case CorePackage.TRANSFORMATION_DEFINITION__REQUIRES:
				return getRequires();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS:
				getInModels().clear();
				getInModels().addAll((Collection<? extends TransformationDefinitionParameter>)newValue);
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS:
				getOutModels().clear();
				getOutModels().addAll((Collection<? extends TransformationDefinitionParameter>)newValue);
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS:
				getImportedModels().clear();
				getImportedModels().addAll((Collection<? extends ImportedModel>)newValue);
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS:
				getInlineModels().clear();
				getInlineModels().addAll((Collection<? extends InlineModel>)newValue);
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends UseDeclaration>)newValue);
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequireDeclaration>)newValue);
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
			case CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS:
				getInModels().clear();
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS:
				getOutModels().clear();
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS:
				getImportedModels().clear();
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS:
				getInlineModels().clear();
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__USES:
				getUses().clear();
				return;
			case CorePackage.TRANSFORMATION_DEFINITION__REQUIRES:
				getRequires().clear();
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
			case CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS:
				return inModels != null && !inModels.isEmpty();
			case CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS:
				return outModels != null && !outModels.isEmpty();
			case CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS:
				return importedModels != null && !importedModels.isEmpty();
			case CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS:
				return inlineModels != null && !inlineModels.isEmpty();
			case CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CorePackage.TRANSFORMATION_DEFINITION__USES:
				return uses != null && !uses.isEmpty();
			case CorePackage.TRANSFORMATION_DEFINITION__REQUIRES:
				return requires != null && !requires.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationDefinitionImpl
