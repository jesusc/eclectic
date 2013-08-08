/*
 * generated by Xtext
 */
package org.eclectic.frontend.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.frontend.attribution.AttributeInit;
import org.eclectic.frontend.attribution.AttributeUse;
import org.eclectic.frontend.attribution.AttributionFactory;
import org.eclectic.frontend.attribution.AttributionRule;
import org.eclectic.frontend.attribution.AttributionTransformation;
import org.eclectic.frontend.attribution.RuleSelf;
import org.eclectic.frontend.core.BinaryExpr;
import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.ClosureDeclaration;
import org.eclectic.frontend.core.DefineVariable;
import org.eclectic.frontend.core.EclecticTransformationDefinition;
import org.eclectic.frontend.core.IfBranch;
import org.eclectic.frontend.core.IfExpr;
import org.eclectic.frontend.core.MethodCall;
import org.eclectic.frontend.core.PropertyWrite;
import org.eclectic.frontend.core.ResolveLink;
import org.eclectic.frontend.core.Statement;
import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.Variable;
import org.eclectic.frontend.core.VariableReference;
import org.eclectic.frontend.imperative.ImperativeFactory;
import org.eclectic.frontend.imperative.ImperativeTransformation;
import org.eclectic.frontend.imperative.MethodDefinition;
import org.eclectic.frontend.imperative.MethodSelf;
import org.eclectic.frontend.mappings.Attribute2Attribute;
import org.eclectic.frontend.mappings.AttributeIsResolveLink;
import org.eclectic.frontend.mappings.AttributeMapping;
import org.eclectic.frontend.mappings.AttributeRef;
import org.eclectic.frontend.mappings.Context;
import org.eclectic.frontend.mappings.Converter;
import org.eclectic.frontend.mappings.Delegate;
import org.eclectic.frontend.mappings.FeatureRef;
import org.eclectic.frontend.mappings.LinkedBy;
import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclectic.frontend.mappings.MatchedElement;
import org.eclectic.frontend.mappings.MetamodelElementRef;
import org.eclectic.frontend.mappings.Reference2Reference;
import org.eclectic.frontend.mappings.ReferenceRef;
import org.eclectic.frontend.patterns.PFeature;
import org.eclectic.frontend.patterns.PObject;
import org.eclectic.frontend.patterns.POutputVariable;
import org.eclectic.frontend.patterns.Pattern;
import org.eclectic.frontend.patterns.PatternSpecification;
import org.eclectic.frontend.qool.EmitStatement;
import org.eclectic.frontend.qool.ForAllStatement;
import org.eclectic.frontend.qool.InvokeExternal;
import org.eclectic.frontend.qool.KindOfPredicate;
import org.eclectic.frontend.qool.MatchExpression;
import org.eclectic.frontend.qool.PropertyEqualsPredicate;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclectic.frontend.qool.Segment;
import org.eclectic.frontend.syntax.scoping.ExpressionsScopeProvider;
import org.eclectic.frontend.tao.Assignment;
import org.eclectic.frontend.tao.AttributeAssigment;
import org.eclectic.frontend.tao.ObjectInstantiation;
import org.eclectic.frontend.tao.ObjectSyntax;
import org.eclectic.frontend.tao.TaoTransformation;
import org.eclectic.frontend.tao.Template;
import org.eclectic.frontend.tao.TemplateRootObject;
import org.eclectic.frontend.tao.WithOptionalVariableExpression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class EclecticScopeProvider extends ExpressionsScopeProvider {

	/*
	protected ArrayList<Class<?>> ignored = new ArrayList<Class<?>>();
	
	protected void addIgnored(Class<?> clazz) {
		ignored.add(clazz);
	}
	
	protected boolean isIgnored(Object o) {
		for (Class<?> i : ignored) {
			if ( i.isInstance(o) ) 
				return true;
		}
		return false;
	}
	*/
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if ( context instanceof ClassUse ) {
			return new ModelScope( EcoreUtil2.getContainerOfType(context, TransformationDefinition.class) );
			// return new ModelScope( (TransformationDefinition) EcoreUtil.getRootContainer(context) );
		}
		
		return super.getScope(context, reference);		
	}
		
	public IScope scope_ResolveLink_module(ResolveLink this_, EReference ref) {
		return new UseDeclarationScope(this_);
	}
	
	protected List<Statement> getStatements(EObject container) {
		// COMMON TO EXPRESSION LANGUAGES!!
		if ( container instanceof ClosureDeclaration ) {
			return ((ClosureDeclaration) container).getStatements();			
		// Not sure the code below is meaningTful...
		} else if ( container instanceof DefineVariable ) {
			LinkedList<Statement> l = new LinkedList<Statement>();
			l.add( ((DefineVariable) container).getExpression() );
			return l;			
		} else if ( container instanceof PropertyWrite ) {
			LinkedList<Statement> l = new LinkedList<Statement>();
			l.add( ((PropertyWrite) container).getExpression() );
			return l;			
		} else if ( container instanceof MethodCall ) {
			LinkedList<Statement> l = new LinkedList<Statement>();
			l.addAll( ((MethodCall) container).getParameters() );
			return l;						
		} else if ( container instanceof ResolveLink ) {
			LinkedList<Statement> l = new LinkedList<Statement>();
			return l;						
		} else if ( container instanceof BinaryExpr ) {
			LinkedList<Statement> l = new LinkedList<Statement>();
			l.add( ((BinaryExpr) container).getLeft() );
			l.add( ((BinaryExpr) container).getRight() );
			return l;						
			
		} else if ( container instanceof IfExpr ) {
			IfExpr expr = (IfExpr) container;
			LinkedList<Statement> l = new LinkedList<Statement>();
			/*
			l.add(expr.getThen().getCondition());
			l.addAll(expr.getThen().getStatements());
			for(IfBranch b : expr.getElsifs()) {
				l.add(b.getCondition());
				l.addAll(b.getStatements());
			}
			if ( expr.getElse() != null )
				l.addAll(expr.getElse().getStatements());
			*/
			return l;
		} else if ( container instanceof IfBranch ) {
			IfBranch b = (IfBranch) container;
			LinkedList<Statement> l = new LinkedList<Statement>();
			if ( b.getCondition() != null )
				l.add(b.getCondition());
			
			l.addAll(b.getStatements());
			return l;
		} 
		
		// Attribution
		if ( container instanceof AttributeInit ) {
			return Collections.emptyList();		
		} else if ( container instanceof AttributionRule ) {
			return ((AttributionRule) container).getStatements();
		} else if ( container instanceof AttributionTransformation ) {
			return Collections.emptyList();
		} else if ( container instanceof AttributeUse ) {
			return Collections.emptyList();
		}		
		
		// Mappings
		if ( container instanceof Context 		   |
				 container instanceof AttributeMapping |
				 container instanceof AttributeRef     |
				 container instanceof ReferenceRef     |
				 container instanceof FeatureRef     |
				 container instanceof Attribute2Attribute |
				 container instanceof Reference2Reference |
				 container instanceof MappingTransformation |
				 container instanceof MatchedElement ) {			
				return Collections.emptyList();
		} else if ( container instanceof AttributeIsResolveLink ) {
			return Collections.emptyList();
		}
		
		// Qool
		if ( container instanceof QoolTransformation ) {
			return Collections.emptyList();
		} else if ( container instanceof EmitStatement || 
				    container instanceof MatchExpression || 
				    container instanceof PropertyEqualsPredicate ||
				    container instanceof KindOfPredicate) {
				return Collections.emptyList();
		} else if ( container instanceof Segment ) {
			return ((Segment) container).getStatements();
		} else if ( container instanceof ForAllStatement ) {
			return ((ForAllStatement) container).getStatements();
		} else if ( container instanceof InvokeExternal ) {
			LinkedList<Statement> l = new LinkedList<Statement>();
			l.addAll( ((InvokeExternal) container).getEntryPointParameters() );
			return l;												
		}
		
		if ( container instanceof ImperativeTransformation ) {
			return Collections.emptyList();
		} else if ( container instanceof MethodDefinition ) {
			return ((MethodDefinition) container).getStatements();
		}

		// Patterns
		if ( container instanceof PFeature || 
			 container instanceof Pattern  || 
			 container instanceof PatternSpecification ||
			 container instanceof PObject ) {
			return Collections.emptyList();
		}
	
		
		// Tao
		if ( container instanceof WithOptionalVariableExpression ) {
			return Collections.emptyList();			
		} else if ( container instanceof ObjectSyntax ) {
			ArrayList<Statement> result = new ArrayList<Statement>();
			result.add( ((ObjectSyntax) container).getObject() );			
			return result;
		} else if ( container instanceof ObjectInstantiation ) {
			return new ArrayList<Statement>(((ObjectInstantiation) container).getAssigments());
		} else if ( container instanceof Template ) {
			return new ArrayList<Statement>(((Template) container).getRoots());
		} else if ( container instanceof AttributeAssigment ) {
			return Collections.emptyList();			
		} else if ( container instanceof TaoTransformation ) {
			return Collections.emptyList();		
		}
		
		if ( container instanceof EclecticTransformationDefinition ) {
			return Collections.emptyList();
		}

		
		System.err.println("EclecticScopeProvider.getStatements does not support " + container.eClass().getName());
		throw new IllegalArgumentException();
	}

	protected List<Variable> getDeclaredVariables(EObject container) {
		// Ensure self is created
		if ( container instanceof MethodDefinition ) {
			createSelfVariable((MethodDefinition) container);
		}
		
		// COMMON TO EXPRESSION LANGUAGES!! 
		if ( container instanceof ClosureDeclaration ) {
			LinkedList<Variable> l = new LinkedList<Variable>();
			l.addAll(((ClosureDeclaration) container).getFormalParameters());
			return l;			
		} else if ( container instanceof DefineVariable ) {
			return Collections.emptyList();
		} else if ( container instanceof PropertyWrite ) {
			return Collections.emptyList();
		} else if ( container instanceof MethodCall ) {
			return Collections.emptyList();
		} else if ( container instanceof ResolveLink ) {
			return Collections.emptyList();
		} else if  (container instanceof VariableReference ) {
			return Collections.emptyList();
		} else if  (container instanceof BinaryExpr ) {
			return Collections.emptyList();
		} else if ( container instanceof IfExpr ) {
			return Collections.emptyList();
		} else if ( container instanceof IfBranch ) {
			return Collections.emptyList();
		} 

		// Qool
		if ( container instanceof QoolTransformation ||
			 container instanceof Segment || 
			 container instanceof InvokeExternal ||
			 container instanceof EmitStatement ||
			    container instanceof MatchExpression || 
			    container instanceof PropertyEqualsPredicate ||
			    container instanceof KindOfPredicate ) {
			return Collections.emptyList();
		} else if ( container instanceof ForAllStatement ) {
			LinkedList<Variable> l = new LinkedList<Variable>();
			l.add( ((ForAllStatement) container));
			return l;
		}

		// Mappings
		if ( //container instanceof Context 		   |
				 container instanceof AttributeMapping |
				 container instanceof AttributeRef     |
				 container instanceof ReferenceRef     |
				 container instanceof FeatureRef     |
				 container instanceof Attribute2Attribute |
				 container instanceof Reference2Reference |
				 container instanceof MappingTransformation ){ 
				return Collections.emptyList();
		} else if ( container instanceof AttributeIsResolveLink ) {
			return Collections.emptyList();
		}
	
		/*
		if ( container instanceof MatchedElement ) {	
			return singleVariableList((Variable) container);
		}
		*/
		if ( container instanceof Context ) {
			Context ctx = (Context) container;
			EList<MatchedElement> srcs = ctx.getLeft();
			LinkedList<Variable> l = new LinkedList<Variable>();
			for (MatchedElement matchedElement : srcs) {
				l.add(matchedElement);
			}
			return l;
		}
		
		
		// Attribution
		if ( container instanceof AttributeInit ) {
			return Collections.emptyList();
		} else if ( container instanceof AttributionRule ) {
			LinkedList<Variable> l = new LinkedList<Variable>();
			l.add( createAttributionSelfVariable((AttributionRule)container) );
			return l;			
		} else if ( container instanceof AttributionTransformation ) {			
			LinkedList<Variable> l = new LinkedList<Variable>();
			l.addAll(((AttributionTransformation) container).getAttributes());
			return l;			
		} else if ( container instanceof AttributeUse ) {
			return Collections.emptyList();
		}
		
		// Navigation
		if ( container instanceof ImperativeTransformation ) {
			return Collections.emptyList();
		} if ( container instanceof MethodDefinition ) {
			LinkedList<Variable> l = new LinkedList<Variable>();
			l.add( createSelfVariable((MethodDefinition)container) );
			
			l.addAll(((MethodDefinition)container).getFormalParameters());
			return l;			
		}

		// Patterns
		if ( container instanceof PFeature || 
			 container instanceof Pattern  || 
			 container instanceof PatternSpecification ) {
			return Collections.emptyList();
		} else if ( container instanceof PObject ) {
			// Does not work with references between sibling elements
			/*
			m : in!Metaclass { name = "pepe", abstract = false }
			o : in!Metaclass { supers = m }
			*/
			return singleVariableList((Variable) container);
		}

		// Tao
		if ( container instanceof WithOptionalVariableExpression ) {
			WithOptionalVariableExpression exp = (WithOptionalVariableExpression) container;
			List<Variable> source = getDeclaredVariables(exp.getExpr());
			if ( exp.getVariable() != null ) {
				source = new ArrayList<Variable>(source);
				source.add(exp.getVariable());
			} 
			return source;			
		} else if ( container instanceof ObjectSyntax ) {
			ObjectSyntax os = (ObjectSyntax) container;
			List<Variable> result = singleVariableList(os);
			if ( os.getExpr() != null ) {
				result.addAll( getDeclaredVariables(os.getExpr()));
			}
			return result;
		} else if ( container instanceof ObjectInstantiation ) {
			ObjectInstantiation oi = (ObjectInstantiation) container;
			return singleVariableList(oi);
		} else if ( container instanceof Template ) {
			Template t = (Template) container;
			return new ArrayList<Variable>(t.getParameters());
		} else if ( container instanceof Assignment ) {
			return Collections.emptyList();		
		} else if ( container instanceof TaoTransformation ) {
			return Collections.emptyList();		
		}

		
		
		if ( container instanceof EclecticTransformationDefinition ) {
			return Collections.emptyList();
		}

		System.err.println("EclecticScopeProvider.getDeclaraedVaribles does not support " + container.eClass().getName());
		throw new IllegalArgumentException();
	}

	
	private Variable createSelfVariable(MethodDefinition method) {
		if ( method.getSelf() == null ) {
			MethodSelf s = ImperativeFactory.eINSTANCE.createMethodSelf();
			s.setName("self");		
			method.setSelf(s);
		}
		return method.getSelf();
	}

	private Variable createAttributionSelfVariable(AttributionRule rule) {
		if ( rule.getSelf() == null ) {
			RuleSelf s = AttributionFactory.eINSTANCE.createRuleSelf();
			s.setName("self");		
			rule.setSelf(s);
		}
		return rule.getSelf();
	}

	private final List<Variable> singleVariableList(Variable v) {
		LinkedList<Variable> l = new LinkedList<Variable>();
		l.add(v);
		return l;
	}

	//////////////////////////////
	// Patterns scope (part of) //
	//////////////////////////////
	
	public IScope scope_POutputVariable_object(POutputVariable this_, EReference ref) {
		return new POutputVariableScope(this_);
	}
	
	////////////////////
	// Mappings Scope //
	////////////////////
	
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
	

	private class POutputVariableScope implements IScope {

		private Pattern pattern;

		public POutputVariableScope(POutputVariable this_) {
			pattern = (Pattern) this_.eContainer();
		}

		@Override
		public IEObjectDescription getSingleElement(QualifiedName name) {
			TreeIterator<EObject> contents = pattern.eAllContents();
			while ( contents.hasNext() ) {
				EObject obj = contents.next();
				if ( obj instanceof PObject && 
					 ((PObject) obj).getName().equals(name.getFirstSegment()) ) {
					return EObjectDescription.create(name, obj);
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
			// TODO Auto-generated method stub
			if ( object instanceof PObject ) {
				return EObjectDescription.create(((PObject) object).getName(), object);
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