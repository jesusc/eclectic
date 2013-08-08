package org.eclectic.frontend.scoping;

import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.UseDeclaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

class UseDeclarationScope implements IScope {

	private EObject obj;

	public UseDeclarationScope(EObject c) {
		this.obj = c;
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		TransformationDefinition t = EcoreUtil2.getContainerOfType(obj, TransformationDefinition.class);
		for(UseDeclaration u : t.getUses()) {
			if ( u.getAs() != null && u.getAs().equals(name.getFirstSegment()) ) {
				return EObjectDescription.create(u.getAs(), u);
			} else if ( u.getModule().equals(name.getFirstSegment()) ) {
				return EObjectDescription.create(u.getModule(), u);					
			}
		}
		return null;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		// TODO Auto-generated method stub
		return null;
	}
}