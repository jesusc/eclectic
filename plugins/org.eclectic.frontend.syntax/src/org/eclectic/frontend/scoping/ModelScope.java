package org.eclectic.frontend.scoping;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclectic.frontend.core.CoreFactory;
import org.eclectic.frontend.core.ImportedModel;
import org.eclectic.frontend.core.InlineModel;
import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.TransformationDefinitionParameter;
import org.eclectic.frontend.core.UseDeclaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

class ModelScope implements IScope {
	// private QoolTransformation transformation;
	private HashMap<String, IEObjectDescription> models = new HashMap<String, IEObjectDescription>();

	public ModelScope(TransformationDefinition t) {
		//this.transformation = t;
		LinkedList<TransformationDefinitionParameter> tModels = new LinkedList<TransformationDefinitionParameter>(t.getInModels());
		tModels.addAll(t.getOutModels());
		for (TransformationDefinitionParameter p : tModels) {
			models.put(p.getName(), EObjectDescription.create(p.getName(), p) );
		}
		
		EList<InlineModel> inlineModels = t.getInlineModels();
		for (InlineModel inlineModel : inlineModels) {
			models.put(inlineModel.getName(), EObjectDescription.create(inlineModel.getName(), inlineModel) );
		}			
		
		EList<ImportedModel> imported = t.getImportedModels();
		for (ImportedModel importedModel : imported) {				
			models.put(importedModel.getName(), EObjectDescription.create(importedModel.getName(), importedModel) );
		}			
		
		EList<UseDeclaration> uses = t.getUses();
		for (UseDeclaration useDeclaration : uses) {
			String name = useDeclaration.getModule();
			if ( useDeclaration.getAs() != null ) {
				name = useDeclaration.getAs();
			}
			models.put(name, EObjectDescription.create(name, useDeclaration));
		}
		
		if ( models.get("_") == null ) {
			ImportedModel importedModel = CoreFactory.eINSTANCE.createImportedModel();
			importedModel.setName("_");
			models.put("_", EObjectDescription.create(importedModel.getName(), importedModel));
			t.getImportedModels().add(importedModel);
		}
	}
	
	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		return models.get(name.getFirstSegment());
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		if ( object instanceof TransformationDefinitionParameter ) {
			TransformationDefinitionParameter p = (TransformationDefinitionParameter) object;
			return EObjectDescription.create(p.getName(),object);
		}
		else if ( object instanceof ImportedModel ) {
			ImportedModel m = (ImportedModel) object;
			return EObjectDescription.create(m.getName(), m);
		}
		else if ( object instanceof InlineModel ) {
			InlineModel m = (InlineModel) object;
			return EObjectDescription.create(m.getName(), m);			
		}
		throw new UnsupportedOperationException("Not supported: " + object);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		return models.values();
	}
	
}