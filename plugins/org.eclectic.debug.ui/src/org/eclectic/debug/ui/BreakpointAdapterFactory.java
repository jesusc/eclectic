package org.eclectic.debug.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class BreakpointAdapterFactory implements IAdapterFactory {

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if ( adaptableObject instanceof org.eclipse.xtext.ui.editor.XtextEditor ) {
			XtextEditor editor = (org.eclipse.xtext.ui.editor.XtextEditor) adaptableObject;
			if ( editor.getLanguageName().equals("org.eclectic.frontend.Koan") ) {
	          IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);
	          if (resource != null) {
		    	  //String extension = resource.getFileExtension();
		          //if (extension != null && extension.equals("pda")) {
		          //return new PDALineBreakpointAdapter();
		    	  return new KoanLineBreakpointAdapter();
		      }				
			}
			else if ( editor.getLanguageName().equals("org.eclectic.frontend.Script") ) {
		          IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);
		          if (resource != null) {
			    	  return new ScriptLineBreakpointAdapter();
			      }				
			}
			else if ( editor.getLanguageName().equals("org.eclectic.frontend.Mappings") ) {
		          IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);
		          if (resource != null) {
			    	  return new MappingsLineBreakpointAdapter();
			      }				
			}
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return null;
	}

}
