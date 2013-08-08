package org.eclectic.frontend;


import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.services.TaoGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TaoParserTrackingLines extends  org.eclectic.frontend.parser.antlr.TaoParser {
		
	@Override
	protected org.eclectic.frontend.parser.antlr.internal.InternalTaoParser createParser(XtextTokenStream stream) {				
		return new MyInternalParserTrackingLines(stream, getGrammarAccess());
	}
	
	protected class MyInternalParserTrackingLines extends org.eclectic.frontend.parser.antlr.internal.InternalTaoParser {

		public MyInternalParserTrackingLines(XtextTokenStream stream, TaoGrammarAccess grammarAccess) {			
			super(stream, grammarAccess);
		}
		
		@Override
		protected void associateNodeWithAstElement(ICompositeNode node, EObject astElement) {
			super.associateNodeWithAstElement(node, astElement);
			if ( astElement instanceof LocatedElement ) {
				LocatedElement e = (LocatedElement) astElement;
				
				e.setRow(node.getStartLine());
				e.setColumn(node.getLength());
			}
		}
		
	}
	
}
