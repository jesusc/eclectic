/*
* generated by Xtext
*/
package org.eclectic.frontend.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclectic.frontend.services.KoanGrammarAccess;

public class KoanParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private KoanGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclectic.frontend.parser.antlr.internal.InternalKoanParser createParser(XtextTokenStream stream) {
		return new org.eclectic.frontend.parser.antlr.internal.InternalKoanParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MappingTransformation";
	}
	
	public KoanGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(KoanGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
