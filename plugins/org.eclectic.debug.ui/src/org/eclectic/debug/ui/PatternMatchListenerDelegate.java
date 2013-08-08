package org.eclectic.debug.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.internal.debug.ui.JDIDebugUIPlugin;
import org.eclipse.jdt.internal.debug.ui.console.JavaStackTraceHyperlink;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.IPatternMatchListenerDelegate;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;

public class PatternMatchListenerDelegate implements
		IPatternMatchListenerDelegate {

	private TextConsole fConsole;

	@Override
	public void connect(TextConsole console) {
		fConsole = console;
	}

	@Override
	public void disconnect() {
		fConsole = null;
	}

	@Override
	public void matchFound(PatternMatchEvent event)  {
        int offset = event.getOffset();
        int length = event.getLength();
        int prefix = 0;
        
        try {
            String text = fConsole.getDocument().get(offset, length);
            
            IHyperlink link = new EclecticTraceHyperLink(fConsole);

        	fConsole.addHyperlink(link, offset, length);
		} catch (BadLocationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
			// IStatus status = new Status(IStatus.ERROR, "org.eclectic.debug.ui", 0, "Cannot set link for " + event, e);
			// throw new CoreException(status);	
		}

	}

	public class EclecticTraceHyperLink implements IHyperlink {

		public EclecticTraceHyperLink(TextConsole fConsole) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void linkEntered() {
			
		}

		@Override
		public void linkExited() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void linkActivated() {
            ErrorDialog.openError(JDIDebugUIPlugin.getActiveWorkbenchShell(), "TODO", "Implemented hyper-linking", null); 
		}
		
	}
	
	/*
	public class EclecticTraceHyperLink extends JavaStackTraceHyperlink {

		public EclecticTraceHyperLink(TextConsole console) {
			super(console);
		}		
	}
	*/
}
