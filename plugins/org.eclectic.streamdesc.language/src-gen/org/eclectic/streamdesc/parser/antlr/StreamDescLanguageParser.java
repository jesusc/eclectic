/*
* generated by Xtext
*/
package org.eclectic.streamdesc.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclectic.streamdesc.services.StreamDescLanguageGrammarAccess;

public class StreamDescLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private StreamDescLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclectic.streamdesc.parser.antlr.internal.InternalStreamDescLanguageParser createParser(XtextTokenStream stream) {
		return new org.eclectic.streamdesc.parser.antlr.internal.InternalStreamDescLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "StreamDescription";
	}
	
	public StreamDescLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StreamDescLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
