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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateTransformationFromExample extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		 ISelection selection = HandlerUtil.getCurrentSelection(event);

         List<EObject> selectedEObjects = new ArrayList<EObject>();
         if (selection instanceof IStructuredSelection) {
                 IStructuredSelection structuredSelection = (IStructuredSelection) selection;
                 Iterator<?> iterator = structuredSelection.iterator();
                 while (iterator.hasNext()) {
                         Object selectedElement = iterator.next();
                         if ( selectedElement instanceof EObject ) {
                        	 StringBuffer buffer = new StringBuffer();
                        	 generateObjectSyntax((EObject) selectedElement, 0, buffer);

                        	 System.out.println("Generated text:");
                        	 System.out.println();
                        	 System.out.println(buffer.toString());
                         }
                 }
         }
         return null;
	}

	private void generateObjectSyntax(EObject element, int indent, StringBuffer buffer) {
		String model = "mm";
		buffer.append(String.format("%s!%s {\n", model, element.eClass().getName()));
		
		// Attributes
		EList<EAttribute> attrs = element.eClass().getEAllAttributes();
		for (EAttribute eAttribute : attrs) {
			if ( element.eIsSet(eAttribute) ) {
				generateIndent(indent + 1, buffer);
				// TODO: Differentiate the type...
				buffer.append(eAttribute.getName() + " = " + '"' + element.eGet(eAttribute) + '"' + "\n");
			}
		}
		
		// Containment references
		EList<EObject> contents = element.eContents();
		for (EObject eObject : contents) {
			generateIndent(indent + 1, buffer);
			
			buffer.append(eObject.eContainingFeature().getName() + " = ");
			generateObjectSyntax(eObject, indent + 1, buffer);
		}
		
		generateIndent(indent, buffer);
		buffer.append("}\n");
	}

	private void generateIndent(int indent, StringBuffer buffer) {
		while ( indent > 0 ) {
			buffer.append("\t");
			indent--;
		}
	}
	

}
