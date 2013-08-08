package org.eclectic.frontend.capi;

import java.io.File;

import org.eclectic.frontend.core.LocatedElement;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class FrontendUtil {

	public static void setFilePathToElements(String path, EObject root) {
		path   = new File(path).getName();
		((LocatedElement) root).setFile(path);
		TreeIterator<EObject> contents = root.eAllContents();
		while ( contents.hasNext() ) {
			EObject o = contents.next();
			if ( o instanceof LocatedElement ) {
				((LocatedElement) o).setFile(path);
			} else {
				// System.out.println("No located: " + o.eClass().getName());
			}
		}
		
		
	}

}
