package org.eclectic.debug.ui;

import org.eclectic.debug.FrontendConstructMapping;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.debug.core.IJavaLineBreakpoint;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public abstract class EclecticBreakpointAdapter implements IToggleBreakpointsTarget {

	protected abstract String getEditorExtension();
	
	private ITextEditor getEditor(IWorkbenchPart part) {
            if (part instanceof ITextEditor) {
                    ITextEditor editorPart = (ITextEditor) part;
                    IResource resource = (IResource) editorPart.getEditorInput().getAdapter(IResource.class);
                    if (resource != null) {
                            String extension = resource.getFileExtension();
                            if (extension != null && extension.equals( getEditorExtension() )) {
                                    return editorPart;
                            }
                    }
            }
            return null;            
    }

	
	@Override
	public void toggleLineBreakpoints(final IWorkbenchPart part, final ISelection selection)
			throws CoreException {

		Job job = new Job("Toggle Line Breakpoint") {
			protected IStatus run(IProgressMonitor monitor) {				
				ITextEditor textEditor = getEditor(part);
				if (textEditor != null) {
		           IResource resource = (IResource) textEditor.getEditorInput()
		                                               .getAdapter(IResource.class);
		           
		           final ITextSelection textSelection = (ITextSelection) selection;
		           final int lineNumber = textSelection.getStartLine() + 1;
		           final int offset = textSelection.getOffset();
		           
		           IXtextDocument doc = ((XtextEditor) textEditor).getDocument();		           
		           EObject obj = doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {

						@Override
						public EObject exec(XtextResource state) throws Exception {
					        EObjectAtOffsetHelper helper = new EObjectAtOffsetHelper();
					        EObject obj = helper.resolveElementAt(state, offset);

					        return obj;
						}
		        	   
		           });
		           
		           if ( obj == null ) {
		        	   System.err.println("No object for selection " + textSelection);
		        	   return Status.CANCEL_STATUS;
		           }
		           
		           try {		        	   
		               // existingBreakpoint = JDIDebugModel.lineBreakpointExists(resource, tname, lineNumber);
			           // String typeName = "rule_class2class"; //resource.getName();
			           
			           FrontendConstructMapping mapping = FrontendConstructMapping.getIdcMapping();
			           String typeName = mapping.javaType(obj);
			           
			           
			           IJavaLineBreakpoint existingBreakpoint = JDIDebugModel.lineBreakpointExists(resource, typeName, lineNumber);
		               if (existingBreakpoint != null) {	            	   
		                  DebugPlugin.getDefault().getBreakpointManager().removeBreakpoint(existingBreakpoint, true);
		                  return Status.OK_STATUS;
		               }
		               
		               System.out.println(typeName + " - " + lineNumber);
		               JDIDebugModel.createLineBreakpoint(resource, typeName, lineNumber, -1, -1, 0, true, null);
	               
		           } catch ( Exception e ) {
		        	   e.printStackTrace();
		        	   return Status.CANCEL_STATUS;
		           }
				}
				return Status.OK_STATUS;
			}			
		};
		
		job.setSystem(true);
		job.schedule();
		
		/*
		   val job = new Job("Toggle Line Breakpoint") {
			      override def run(monitor : IProgressMonitor) : IStatus = {
			        val editor = self.getTextEditor(part)
			        if (editor != null && selection.isInstanceOf[ITextSelection]) {
			          if (monitor.isCanceled)
			            return Status.CANCEL_STATUS;
			          try {
			            report(null, part)
			            val sel = 
			              if(!selection.isInstanceOf[IStructuredSelection])
			                translateToMembers(part, selection)
			              else
			                selection
			            
			              if(sel.isInstanceOf[IStructuredSelection]) {
			                val member = sel.asInstanceOf[IStructuredSelection].getFirstElement.asInstanceOf[IMember]
			                val tpe =
			                  if(member.getElementType == IJavaElement.TYPE)
			                    member.asInstanceOf[IType]
			                  else
			                    member.getDeclaringType

			                val tname = {
			                  val qtname = createQualifiedTypeName(self, tpe)
			                  val emptyPackagePrefix = "<empty>." 
			                  if (qtname startsWith emptyPackagePrefix) qtname.substring(emptyPackagePrefix.length) else qtname
			                }
			                val resource = BreakpointUtils.getBreakpointResource(tpe)
			                val lnumber = selection.asInstanceOf[ITextSelection].getStartLine+1
			                val existingBreakpoint = JDIDebugModel.lineBreakpointExists(resource, tname, lnumber)
			                if (existingBreakpoint != null) {
			                  DebugPlugin.getDefault().getBreakpointManager.removeBreakpoint(existingBreakpoint, true)
			                  return Status.OK_STATUS
			                }
			                val attributes = new HashMap[AnyRef, AnyRef](10)
			                val documentProvider = editor.getDocumentProvider
			                if (documentProvider == null)
			                  return Status.CANCEL_STATUS
			                val document = documentProvider.getDocument(editor.getEditorInput)
			                try {
			                  val line = document.getLineInformation(lnumber-1)
			                  val start = line.getOffset
			                  val end = start+line.getLength-1
			                  BreakpointUtils.addJavaBreakpointAttributesWithMemberDetails(attributes, tpe, start, end)
			                } catch {
			                  case ble : BadLocationException => JDIDebugUIPlugin.log(ble)
			                }
			                JDIDebugModel.createLineBreakpoint(resource, tname, lnumber, -1, -1, 0, true, attributes)
			              } else {
			                report(ActionMessages.ToggleBreakpointAdapter_3, part)
			                return Status.OK_STATUS
			              }
			            } catch {
			              case ce : CoreException => return ce.getStatus
			            }
			          }
			          return Status.OK_STATUS
			        }
			      }
		*/
		
	}

	@Override
	public boolean canToggleLineBreakpoints(IWorkbenchPart part,
			ISelection selection) {
//		System.out
//				.println("KoanLineBreakpointAdapter.canToggleLineBreakpoints()");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void toggleMethodBreakpoints(IWorkbenchPart part,
			ISelection selection) throws CoreException {
		// TODO Auto-generated method stub
		System.out
				.println("KoanLineBreakpointAdapter.toggleMethodBreakpoints()");
	}

	@Override
	public boolean canToggleMethodBreakpoints(IWorkbenchPart part,
			ISelection selection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void toggleWatchpoints(IWorkbenchPart part, ISelection selection)
			throws CoreException {
		// TODO Auto-generated method stub
		System.out.println("KoanLineBreakpointAdapter.toggleWatchpoints()");
	}

	@Override
	public boolean canToggleWatchpoints(IWorkbenchPart part,
			ISelection selection) {
		// TODO Auto-generated method stub
		return true;
	}

}
