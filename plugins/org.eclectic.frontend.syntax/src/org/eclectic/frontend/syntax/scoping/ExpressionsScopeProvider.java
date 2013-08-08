/*
 * generated by Xtext
 */
package org.eclectic.frontend.syntax.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclectic.frontend.core.PropertyWrite;
import org.eclectic.frontend.core.Statement;
import org.eclectic.frontend.core.Variable;
import org.eclectic.frontend.core.VariableReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 * The implementation of this class is inspired by: http://www.eclipse.org/forums/index.php/m/741529/
 * More about xText scopes:
 *    http://stackoverflow.com/questions/7791871/xtext-example-of-a-scoped-object
 *    http://blogs.itemis.de/stundzig/archives/773
 */
public class ExpressionsScopeProvider extends AbstractDeclarativeScopeProvider {

	protected IScope genericScope(EObject this_, EReference ref) {
		try { 
			List<Statement> statements = getStatements(this_.eContainer());
			int index = statements.indexOf(this_);		
			List<Variable> elements = getVariableDeclarations(index, statements);
			elements.addAll(getDeclaredVariables(this_.eContainer()));
			
			IScope parentScope = getParentScopes(this_.eContainer());
			return Scopes.scopeFor(elements, parentScope);
		} catch ( RuntimeException e ) {
			e.printStackTrace();
			throw e;
		}		
	}
	
	public IScope scope_PropertyWrite_receptor(PropertyWrite this_, EReference ref) {
		return genericScope(this_, ref);
	}

	public IScope scope_VariableReference_variable(VariableReference this_, EReference ref) {
		return genericScope(this_, ref);
	}

	
	protected List<Statement> getStatements(EObject container) {
		System.err.println("ExpressionsScopeProvider.getStatements must be implemented by subclasses");
		throw new UnsupportedOperationException();
	}
	
	protected List<Variable> getDeclaredVariables(EObject container) {
		System.err.println("ExpressionsScopeProvider.getDeclaredVariables must be implemented by subclasses");
		throw new UnsupportedOperationException();		
	}


	protected IScope getParentScopes(EObject blockObject) {
		EObject parentBlockObject = blockObject.eContainer();
		if ( parentBlockObject != null ) {
			List<Statement> statementsOfParentBlock = getStatements(parentBlockObject);			
			int index = statementsOfParentBlock.indexOf(blockObject);
			List<Variable> elements = getVariableDeclarations(index, statementsOfParentBlock);
			elements.addAll(getDeclaredVariables(parentBlockObject));
			
			IScope parentScope = getParentScopes(parentBlockObject);
			return Scopes.scopeFor(elements, parentScope);		
			
		} else {
			return IScope.NULLSCOPE;
		}
	}

	private List<Variable> getVariableDeclarations(int currentIndex, List<Statement> statements) {		
		List<Variable> elements = new ArrayList<Variable>();		
		for (int i = 0; i < currentIndex; i++) {
			Statement statement = statements.get(i);
			// maybe it have to be changed for "isStatementDefiningVariable / getDefinedVariable"
			if ( statement instanceof Variable ) {
				elements.add((Variable) statement);
			}
		}
		return elements;
	}
	

}
