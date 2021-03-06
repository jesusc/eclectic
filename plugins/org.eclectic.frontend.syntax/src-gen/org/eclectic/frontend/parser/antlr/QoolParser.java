/*
* generated by Xtext
*/
package org.eclectic.frontend.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclectic.frontend.services.QoolGrammarAccess;

public class QoolParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private QoolGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclectic.frontend.parser.antlr.internal.InternalQoolParser createParser(XtextTokenStream stream) {
		return new org.eclectic.frontend.parser.antlr.internal.InternalQoolParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "QoolTransformation";
	}
	
	public QoolGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QoolGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
