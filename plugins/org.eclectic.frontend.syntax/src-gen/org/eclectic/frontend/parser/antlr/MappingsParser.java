/*
* generated by Xtext
*/
package org.eclectic.frontend.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclectic.frontend.services.MappingsGrammarAccess;

public class MappingsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MappingsGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclectic.frontend.parser.antlr.internal.InternalMappingsParser createParser(XtextTokenStream stream) {
		return new org.eclectic.frontend.parser.antlr.internal.InternalMappingsParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MappingTransformation";
	}
	
	public MappingsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MappingsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
