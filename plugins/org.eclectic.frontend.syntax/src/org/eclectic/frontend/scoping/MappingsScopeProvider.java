/*
 * generated by Xtext
 */
package org.eclectic.frontend.scoping;


import org.eclectic.frontend.chain.ChainTransformation;

import org.eclectic.frontend.chain.TransformationExecution;
import org.eclectic.frontend.core.ImportedModel;
import org.eclectic.frontend.core.PropertyWrite;
import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.UseDeclaration;
import org.eclectic.frontend.mappings.Attribute2Attribute;
import org.eclectic.frontend.mappings.AttributeMapping;
import org.eclectic.frontend.mappings.AttributeRef;
import org.eclectic.frontend.mappings.Context;
import org.eclectic.frontend.mappings.Converter;
import org.eclectic.frontend.mappings.Delegate;
import org.eclectic.frontend.mappings.LinkedBy;
import org.eclectic.frontend.mappings.MatchedElement;
import org.eclectic.frontend.mappings.MetamodelElementRef;
import org.eclectic.frontend.mappings.Reference2Reference;
import org.eclectic.frontend.mappings.ReferenceRef;
import org.eclectic.frontend.scoping.ChainScopeProvider.ChainScope4Transformations;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class MappingsScopeProvider extends AbstractDeclarativeScopeProvider {
	
	public IScope scope_Converter_module(Converter this_, EReference ref) {
		return new UseDeclarationScope(this_);
	}

	public IScope scope_Delegate_module(Delegate this_, EReference ref) {
		return new UseDeclarationScope(this_);
	}

	public IScope scope_AttributeRef_referredElement(AttributeRef this_, EReference ref) {
		return new MatchedElementDeclarationScope(this_);
	}

	public IScope scope_ReferenceRef_referredElement(ReferenceRef this_, EReference ref) {
		return new MatchedElementDeclarationScope(this_);
	}

	private class MatchedElementDeclarationScope implements IScope {

		private MetamodelElementRef ref;

		public MatchedElementDeclarationScope(MetamodelElementRef r) {
			this.ref = r;
		}

		@Override
		public IEObjectDescription getSingleElement(QualifiedName name) {
			EObject container = ref.eContainer();
			if ( ref instanceof ReferenceRef ) {
				Reference2Reference r2r = (Reference2Reference) container;
				if ( r2r.getLeft().contains(ref) ) 
					return resolveLeft(name);
				else
					return resolveRight(name);
			} else if ( ref instanceof AttributeRef ) {
				if ( container instanceof LinkedBy ) {
					LinkedBy linkedBy = (LinkedBy) container;
					if ( linkedBy.getLinkedElement() != null && linkedBy.getLinkedElement().equals(ref) )
						return resolveRight(name);
					return resolveLeft(name);
				} else if ( container instanceof Attribute2Attribute) {
					return resolveRight(name);
				} else {	
					return resolveLeft(name);
				}
			} else {
				throw new AssertionError();
			}
		}

		private IEObjectDescription resolveLeft(QualifiedName name) {
			Context rule = EcoreUtil2.getContainerOfType(ref, Context.class);
			EList<MatchedElement> matchedElements = rule.getRight(); // Watch out! The from / to part are the other way around
			return resolve(name, matchedElements);
		}

		private IEObjectDescription resolveRight(QualifiedName name) {
			Context rule = EcoreUtil2.getContainerOfType(ref, Context.class);
			EList<MatchedElement> matchedElements = rule.getLeft();
			return resolve(name, matchedElements);
		}

		private IEObjectDescription resolve(QualifiedName name,
				EList<MatchedElement> matchedElements) {
			for (MatchedElement matchedElement : matchedElements) {
				if ( matchedElement.getName().equals(name.getFirstSegment()) ) {
					return EObjectDescription.create(matchedElement.getName(), matchedElement);					
				}
			}
			return null;
		}

		@Override
		public Iterable<IEObjectDescription> getElements(QualifiedName name) {
			throw new UnsupportedOperationException();
		}

		@Override
		public IEObjectDescription getSingleElement(EObject object) {
			if ( object instanceof MatchedElement ) {
				MatchedElement me = (MatchedElement) object;
				return EObjectDescription.create(me.getName(),object);
			}
 			throw new UnsupportedOperationException();
		}

		@Override
		public Iterable<IEObjectDescription> getElements(EObject object) {
			throw new UnsupportedOperationException();	
		}

		@Override
		public Iterable<IEObjectDescription> getAllElements() {
			throw new UnsupportedOperationException();
		}
	}
}

