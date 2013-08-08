package org.eclectic.ui.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateNavigationPathFromExample extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		 ISelection selection = HandlerUtil.getCurrentSelection(event);

         List<EObject> selectedEObjects = new ArrayList<EObject>();
         if (selection instanceof IStructuredSelection) {
                 IStructuredSelection structuredSelection = (IStructuredSelection) selection;
                 if ( structuredSelection.size() != 2 ) {
                	 throw new IllegalArgumentException("Needs 2 objects");
                 }
                 EObject obj1 = (EObject) structuredSelection.toList().get(0);
                 EObject obj2 = (EObject) structuredSelection.toList().get(1);

                 List<EReference> path = new ArrayList<EReference>();
                 if ( EcoreUtil.isAncestor(obj1, obj1) ) {
                	 findPath(obj1, obj2, path);
                 } else if ( EcoreUtil.isAncestor(obj2, obj1) ) {
                	 findPath(obj2, obj1, path);
                 } else {
                	 throw new IllegalArgumentException("Needs one object contained in another");
                 }
                 
                 System.out.println("Result:");
                 System.out.println();
                 for(int i = path.size() - 1; i != 0; i--) {
                	 EReference ref = path.get(i);
                	 System.out.print(ref.getName() + ".");
                 }
                 System.out.println();
         }
         return null;
	}

	private void findPath(EObject parent, EObject children, List<EReference> path) {
		EObject container = children.eContainer();
		EReference prop   = (EReference) children.eContainingFeature();

		path.add(prop);
		
		if ( container == parent )
			return;
		
		findPath(parent, container, path);
	}

}
