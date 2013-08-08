package org.eclectic.frontend.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclectic.frontend.services.ChainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'chain'", "'('", "')'", "'->'", "'end'", "','", "'composite'", "'='", "'external'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalChainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChainParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g"; }


     
     	private ChainGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ChainGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMappingTransformation"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:60:1: entryRuleMappingTransformation : ruleMappingTransformation EOF ;
    public final void entryRuleMappingTransformation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:61:1: ( ruleMappingTransformation EOF )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:62:1: ruleMappingTransformation EOF
            {
             before(grammarAccess.getMappingTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation61);
            ruleMappingTransformation();

            state._fsp--;

             after(grammarAccess.getMappingTransformationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMappingTransformation68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappingTransformation"


    // $ANTLR start "ruleMappingTransformation"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:69:1: ruleMappingTransformation : ( ( rule__MappingTransformation__Group__0 ) ) ;
    public final void ruleMappingTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:73:2: ( ( ( rule__MappingTransformation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:74:1: ( ( rule__MappingTransformation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:74:1: ( ( rule__MappingTransformation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:75:1: ( rule__MappingTransformation__Group__0 )
            {
             before(grammarAccess.getMappingTransformationAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:76:1: ( rule__MappingTransformation__Group__0 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:76:2: rule__MappingTransformation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__0_in_ruleMappingTransformation94);
            rule__MappingTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingTransformation"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:88:1: entryRuleTransformationDefinitionParameter : ruleTransformationDefinitionParameter EOF ;
    public final void entryRuleTransformationDefinitionParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:89:1: ( ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:90:1: ruleTransformationDefinitionParameter EOF
            {
             before(grammarAccess.getTransformationDefinitionParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter121);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getTransformationDefinitionParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformationDefinitionParameter"


    // $ANTLR start "ruleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:97:1: ruleTransformationDefinitionParameter : ( ( rule__TransformationDefinitionParameter__Group__0 ) ) ;
    public final void ruleTransformationDefinitionParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:101:2: ( ( ( rule__TransformationDefinitionParameter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:102:1: ( ( rule__TransformationDefinitionParameter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:102:1: ( ( rule__TransformationDefinitionParameter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:103:1: ( rule__TransformationDefinitionParameter__Group__0 )
            {
             before(grammarAccess.getTransformationDefinitionParameterAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:104:1: ( rule__TransformationDefinitionParameter__Group__0 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:104:2: rule__TransformationDefinitionParameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__0_in_ruleTransformationDefinitionParameter154);
            rule__TransformationDefinitionParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationDefinitionParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformationDefinitionParameter"


    // $ANTLR start "entryRuleCompositeTransformation"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:116:1: entryRuleCompositeTransformation : ruleCompositeTransformation EOF ;
    public final void entryRuleCompositeTransformation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:117:1: ( ruleCompositeTransformation EOF )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:118:1: ruleCompositeTransformation EOF
            {
             before(grammarAccess.getCompositeTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeTransformation_in_entryRuleCompositeTransformation181);
            ruleCompositeTransformation();

            state._fsp--;

             after(grammarAccess.getCompositeTransformationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeTransformation188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeTransformation"


    // $ANTLR start "ruleCompositeTransformation"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:125:1: ruleCompositeTransformation : ( ( rule__CompositeTransformation__Group__0 ) ) ;
    public final void ruleCompositeTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:129:2: ( ( ( rule__CompositeTransformation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:130:1: ( ( rule__CompositeTransformation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:130:1: ( ( rule__CompositeTransformation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:131:1: ( rule__CompositeTransformation__Group__0 )
            {
             before(grammarAccess.getCompositeTransformationAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:132:1: ( rule__CompositeTransformation__Group__0 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:132:2: rule__CompositeTransformation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__0_in_ruleCompositeTransformation214);
            rule__CompositeTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeTransformation"


    // $ANTLR start "entryRuleTransformationExecution"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:144:1: entryRuleTransformationExecution : ruleTransformationExecution EOF ;
    public final void entryRuleTransformationExecution() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:145:1: ( ruleTransformationExecution EOF )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:146:1: ruleTransformationExecution EOF
            {
             before(grammarAccess.getTransformationExecutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationExecution_in_entryRuleTransformationExecution241);
            ruleTransformationExecution();

            state._fsp--;

             after(grammarAccess.getTransformationExecutionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationExecution248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformationExecution"


    // $ANTLR start "ruleTransformationExecution"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:153:1: ruleTransformationExecution : ( ( rule__TransformationExecution__Group__0 ) ) ;
    public final void ruleTransformationExecution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:157:2: ( ( ( rule__TransformationExecution__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:158:1: ( ( rule__TransformationExecution__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:158:1: ( ( rule__TransformationExecution__Group__0 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:159:1: ( rule__TransformationExecution__Group__0 )
            {
             before(grammarAccess.getTransformationExecutionAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:160:1: ( rule__TransformationExecution__Group__0 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:160:2: rule__TransformationExecution__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__0_in_ruleTransformationExecution274);
            rule__TransformationExecution__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationExecutionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformationExecution"


    // $ANTLR start "entryRuleExternalTransformation"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:172:1: entryRuleExternalTransformation : ruleExternalTransformation EOF ;
    public final void entryRuleExternalTransformation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:173:1: ( ruleExternalTransformation EOF )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:174:1: ruleExternalTransformation EOF
            {
             before(grammarAccess.getExternalTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExternalTransformation_in_entryRuleExternalTransformation301);
            ruleExternalTransformation();

            state._fsp--;

             after(grammarAccess.getExternalTransformationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExternalTransformation308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalTransformation"


    // $ANTLR start "ruleExternalTransformation"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:181:1: ruleExternalTransformation : ( ( rule__ExternalTransformation__Group__0 ) ) ;
    public final void ruleExternalTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:185:2: ( ( ( rule__ExternalTransformation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:186:1: ( ( rule__ExternalTransformation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:186:1: ( ( rule__ExternalTransformation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:187:1: ( rule__ExternalTransformation__Group__0 )
            {
             before(grammarAccess.getExternalTransformationAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:188:1: ( rule__ExternalTransformation__Group__0 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:188:2: rule__ExternalTransformation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExternalTransformation__Group__0_in_ruleExternalTransformation334);
            rule__ExternalTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalTransformation"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:200:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:201:1: ( ruleEString EOF )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:202:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString361);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:209:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:213:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:214:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:214:1: ( ( rule__EString__Alternatives ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:215:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:216:1: ( rule__EString__Alternatives )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:216:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString394);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:230:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:234:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:235:1: ( RULE_STRING )
                    {
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:235:1: ( RULE_STRING )
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:236:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives432); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:241:6: ( RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:241:6: ( RULE_ID )
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:242:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives449); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__MappingTransformation__Group__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:254:1: rule__MappingTransformation__Group__0 : rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1 ;
    public final void rule__MappingTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:258:1: ( rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:259:2: rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__0__Impl_in_rule__MappingTransformation__Group__0479);
            rule__MappingTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__1_in_rule__MappingTransformation__Group__0482);
            rule__MappingTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__0"


    // $ANTLR start "rule__MappingTransformation__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:266:1: rule__MappingTransformation__Group__0__Impl : ( 'chain' ) ;
    public final void rule__MappingTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:270:1: ( ( 'chain' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:271:1: ( 'chain' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:271:1: ( 'chain' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:272:1: 'chain'
            {
             before(grammarAccess.getMappingTransformationAccess().getChainKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__MappingTransformation__Group__0__Impl510); 
             after(grammarAccess.getMappingTransformationAccess().getChainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__0__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:285:1: rule__MappingTransformation__Group__1 : rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2 ;
    public final void rule__MappingTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:289:1: ( rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:290:2: rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__1__Impl_in_rule__MappingTransformation__Group__1541);
            rule__MappingTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__2_in_rule__MappingTransformation__Group__1544);
            rule__MappingTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__1"


    // $ANTLR start "rule__MappingTransformation__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:297:1: rule__MappingTransformation__Group__1__Impl : ( ( rule__MappingTransformation__NameAssignment_1 ) ) ;
    public final void rule__MappingTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:301:1: ( ( ( rule__MappingTransformation__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:302:1: ( ( rule__MappingTransformation__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:302:1: ( ( rule__MappingTransformation__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:303:1: ( rule__MappingTransformation__NameAssignment_1 )
            {
             before(grammarAccess.getMappingTransformationAccess().getNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:304:1: ( rule__MappingTransformation__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:304:2: rule__MappingTransformation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__NameAssignment_1_in_rule__MappingTransformation__Group__1__Impl571);
            rule__MappingTransformation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingTransformationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__1__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__2"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:314:1: rule__MappingTransformation__Group__2 : rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3 ;
    public final void rule__MappingTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:318:1: ( rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:319:2: rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__2__Impl_in_rule__MappingTransformation__Group__2601);
            rule__MappingTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__3_in_rule__MappingTransformation__Group__2604);
            rule__MappingTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__2"


    // $ANTLR start "rule__MappingTransformation__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:326:1: rule__MappingTransformation__Group__2__Impl : ( '(' ) ;
    public final void rule__MappingTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:330:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:331:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:331:1: ( '(' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:332:1: '('
            {
             before(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MappingTransformation__Group__2__Impl632); 
             after(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__2__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__3"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:345:1: rule__MappingTransformation__Group__3 : rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4 ;
    public final void rule__MappingTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:349:1: ( rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:350:2: rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__3__Impl_in_rule__MappingTransformation__Group__3663);
            rule__MappingTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__4_in_rule__MappingTransformation__Group__3666);
            rule__MappingTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__3"


    // $ANTLR start "rule__MappingTransformation__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:357:1: rule__MappingTransformation__Group__3__Impl : ( ( rule__MappingTransformation__InModelsAssignment_3 )? ) ;
    public final void rule__MappingTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:361:1: ( ( ( rule__MappingTransformation__InModelsAssignment_3 )? ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:362:1: ( ( rule__MappingTransformation__InModelsAssignment_3 )? )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:362:1: ( ( rule__MappingTransformation__InModelsAssignment_3 )? )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:363:1: ( rule__MappingTransformation__InModelsAssignment_3 )?
            {
             before(grammarAccess.getMappingTransformationAccess().getInModelsAssignment_3()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:364:1: ( rule__MappingTransformation__InModelsAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:364:2: rule__MappingTransformation__InModelsAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__InModelsAssignment_3_in_rule__MappingTransformation__Group__3__Impl693);
                    rule__MappingTransformation__InModelsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingTransformationAccess().getInModelsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__3__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__4"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:374:1: rule__MappingTransformation__Group__4 : rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5 ;
    public final void rule__MappingTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:378:1: ( rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:379:2: rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__4__Impl_in_rule__MappingTransformation__Group__4724);
            rule__MappingTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__5_in_rule__MappingTransformation__Group__4727);
            rule__MappingTransformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__4"


    // $ANTLR start "rule__MappingTransformation__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:386:1: rule__MappingTransformation__Group__4__Impl : ( ( rule__MappingTransformation__Group_4__0 )* ) ;
    public final void rule__MappingTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:390:1: ( ( ( rule__MappingTransformation__Group_4__0 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:391:1: ( ( rule__MappingTransformation__Group_4__0 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:391:1: ( ( rule__MappingTransformation__Group_4__0 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:392:1: ( rule__MappingTransformation__Group_4__0 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getGroup_4()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:393:1: ( rule__MappingTransformation__Group_4__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:393:2: rule__MappingTransformation__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group_4__0_in_rule__MappingTransformation__Group__4__Impl754);
            	    rule__MappingTransformation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__4__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__5"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:403:1: rule__MappingTransformation__Group__5 : rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6 ;
    public final void rule__MappingTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:407:1: ( rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:408:2: rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__5__Impl_in_rule__MappingTransformation__Group__5785);
            rule__MappingTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__6_in_rule__MappingTransformation__Group__5788);
            rule__MappingTransformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__5"


    // $ANTLR start "rule__MappingTransformation__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:415:1: rule__MappingTransformation__Group__5__Impl : ( ')' ) ;
    public final void rule__MappingTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:419:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:420:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:420:1: ( ')' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:421:1: ')'
            {
             before(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MappingTransformation__Group__5__Impl816); 
             after(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__5__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__6"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:434:1: rule__MappingTransformation__Group__6 : rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7 ;
    public final void rule__MappingTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:438:1: ( rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:439:2: rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__6__Impl_in_rule__MappingTransformation__Group__6847);
            rule__MappingTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__7_in_rule__MappingTransformation__Group__6850);
            rule__MappingTransformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__6"


    // $ANTLR start "rule__MappingTransformation__Group__6__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:446:1: rule__MappingTransformation__Group__6__Impl : ( '->' ) ;
    public final void rule__MappingTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:450:1: ( ( '->' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:451:1: ( '->' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:451:1: ( '->' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:452:1: '->'
            {
             before(grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MappingTransformation__Group__6__Impl878); 
             after(grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__6__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__7"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:465:1: rule__MappingTransformation__Group__7 : rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8 ;
    public final void rule__MappingTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:469:1: ( rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:470:2: rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__7__Impl_in_rule__MappingTransformation__Group__7909);
            rule__MappingTransformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__8_in_rule__MappingTransformation__Group__7912);
            rule__MappingTransformation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__7"


    // $ANTLR start "rule__MappingTransformation__Group__7__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:477:1: rule__MappingTransformation__Group__7__Impl : ( '(' ) ;
    public final void rule__MappingTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:481:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:482:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:482:1: ( '(' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:483:1: '('
            {
             before(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_7()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MappingTransformation__Group__7__Impl940); 
             after(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__7__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__8"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:496:1: rule__MappingTransformation__Group__8 : rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9 ;
    public final void rule__MappingTransformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:500:1: ( rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:501:2: rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__8__Impl_in_rule__MappingTransformation__Group__8971);
            rule__MappingTransformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__9_in_rule__MappingTransformation__Group__8974);
            rule__MappingTransformation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__8"


    // $ANTLR start "rule__MappingTransformation__Group__8__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:508:1: rule__MappingTransformation__Group__8__Impl : ( ( rule__MappingTransformation__OutModelsAssignment_8 )? ) ;
    public final void rule__MappingTransformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:512:1: ( ( ( rule__MappingTransformation__OutModelsAssignment_8 )? ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:513:1: ( ( rule__MappingTransformation__OutModelsAssignment_8 )? )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:513:1: ( ( rule__MappingTransformation__OutModelsAssignment_8 )? )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:514:1: ( rule__MappingTransformation__OutModelsAssignment_8 )?
            {
             before(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_8()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:515:1: ( rule__MappingTransformation__OutModelsAssignment_8 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:515:2: rule__MappingTransformation__OutModelsAssignment_8
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__OutModelsAssignment_8_in_rule__MappingTransformation__Group__8__Impl1001);
                    rule__MappingTransformation__OutModelsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__8__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__9"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:525:1: rule__MappingTransformation__Group__9 : rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10 ;
    public final void rule__MappingTransformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:529:1: ( rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:530:2: rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__9__Impl_in_rule__MappingTransformation__Group__91032);
            rule__MappingTransformation__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__10_in_rule__MappingTransformation__Group__91035);
            rule__MappingTransformation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__9"


    // $ANTLR start "rule__MappingTransformation__Group__9__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:537:1: rule__MappingTransformation__Group__9__Impl : ( ( rule__MappingTransformation__Group_9__0 )* ) ;
    public final void rule__MappingTransformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:541:1: ( ( ( rule__MappingTransformation__Group_9__0 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:542:1: ( ( rule__MappingTransformation__Group_9__0 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:542:1: ( ( rule__MappingTransformation__Group_9__0 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:543:1: ( rule__MappingTransformation__Group_9__0 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getGroup_9()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:544:1: ( rule__MappingTransformation__Group_9__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:544:2: rule__MappingTransformation__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group_9__0_in_rule__MappingTransformation__Group__9__Impl1062);
            	    rule__MappingTransformation__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__9__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__10"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:554:1: rule__MappingTransformation__Group__10 : rule__MappingTransformation__Group__10__Impl rule__MappingTransformation__Group__11 ;
    public final void rule__MappingTransformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:558:1: ( rule__MappingTransformation__Group__10__Impl rule__MappingTransformation__Group__11 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:559:2: rule__MappingTransformation__Group__10__Impl rule__MappingTransformation__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__10__Impl_in_rule__MappingTransformation__Group__101093);
            rule__MappingTransformation__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__11_in_rule__MappingTransformation__Group__101096);
            rule__MappingTransformation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__10"


    // $ANTLR start "rule__MappingTransformation__Group__10__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:566:1: rule__MappingTransformation__Group__10__Impl : ( ')' ) ;
    public final void rule__MappingTransformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:570:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:571:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:571:1: ( ')' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:572:1: ')'
            {
             before(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_10()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MappingTransformation__Group__10__Impl1124); 
             after(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__10__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__11"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:585:1: rule__MappingTransformation__Group__11 : rule__MappingTransformation__Group__11__Impl rule__MappingTransformation__Group__12 ;
    public final void rule__MappingTransformation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:589:1: ( rule__MappingTransformation__Group__11__Impl rule__MappingTransformation__Group__12 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:590:2: rule__MappingTransformation__Group__11__Impl rule__MappingTransformation__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__11__Impl_in_rule__MappingTransformation__Group__111155);
            rule__MappingTransformation__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__12_in_rule__MappingTransformation__Group__111158);
            rule__MappingTransformation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__11"


    // $ANTLR start "rule__MappingTransformation__Group__11__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:597:1: rule__MappingTransformation__Group__11__Impl : ( ( rule__MappingTransformation__ExternalsAssignment_11 )* ) ;
    public final void rule__MappingTransformation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:601:1: ( ( ( rule__MappingTransformation__ExternalsAssignment_11 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:602:1: ( ( rule__MappingTransformation__ExternalsAssignment_11 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:602:1: ( ( rule__MappingTransformation__ExternalsAssignment_11 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:603:1: ( rule__MappingTransformation__ExternalsAssignment_11 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getExternalsAssignment_11()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:604:1: ( rule__MappingTransformation__ExternalsAssignment_11 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:604:2: rule__MappingTransformation__ExternalsAssignment_11
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__ExternalsAssignment_11_in_rule__MappingTransformation__Group__11__Impl1185);
            	    rule__MappingTransformation__ExternalsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getExternalsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__11__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__12"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:614:1: rule__MappingTransformation__Group__12 : rule__MappingTransformation__Group__12__Impl rule__MappingTransformation__Group__13 ;
    public final void rule__MappingTransformation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:618:1: ( rule__MappingTransformation__Group__12__Impl rule__MappingTransformation__Group__13 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:619:2: rule__MappingTransformation__Group__12__Impl rule__MappingTransformation__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__12__Impl_in_rule__MappingTransformation__Group__121216);
            rule__MappingTransformation__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__13_in_rule__MappingTransformation__Group__121219);
            rule__MappingTransformation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__12"


    // $ANTLR start "rule__MappingTransformation__Group__12__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:626:1: rule__MappingTransformation__Group__12__Impl : ( ( rule__MappingTransformation__CompositesAssignment_12 )* ) ;
    public final void rule__MappingTransformation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:630:1: ( ( ( rule__MappingTransformation__CompositesAssignment_12 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:631:1: ( ( rule__MappingTransformation__CompositesAssignment_12 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:631:1: ( ( rule__MappingTransformation__CompositesAssignment_12 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:632:1: ( rule__MappingTransformation__CompositesAssignment_12 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getCompositesAssignment_12()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:633:1: ( rule__MappingTransformation__CompositesAssignment_12 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:633:2: rule__MappingTransformation__CompositesAssignment_12
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__CompositesAssignment_12_in_rule__MappingTransformation__Group__12__Impl1246);
            	    rule__MappingTransformation__CompositesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getCompositesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__12__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__13"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:643:1: rule__MappingTransformation__Group__13 : rule__MappingTransformation__Group__13__Impl rule__MappingTransformation__Group__14 ;
    public final void rule__MappingTransformation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:647:1: ( rule__MappingTransformation__Group__13__Impl rule__MappingTransformation__Group__14 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:648:2: rule__MappingTransformation__Group__13__Impl rule__MappingTransformation__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__13__Impl_in_rule__MappingTransformation__Group__131277);
            rule__MappingTransformation__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__14_in_rule__MappingTransformation__Group__131280);
            rule__MappingTransformation__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__13"


    // $ANTLR start "rule__MappingTransformation__Group__13__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:655:1: rule__MappingTransformation__Group__13__Impl : ( ( ( rule__MappingTransformation__ExecutionsAssignment_13 ) ) ( ( rule__MappingTransformation__ExecutionsAssignment_13 )* ) ) ;
    public final void rule__MappingTransformation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:659:1: ( ( ( ( rule__MappingTransformation__ExecutionsAssignment_13 ) ) ( ( rule__MappingTransformation__ExecutionsAssignment_13 )* ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:660:1: ( ( ( rule__MappingTransformation__ExecutionsAssignment_13 ) ) ( ( rule__MappingTransformation__ExecutionsAssignment_13 )* ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:660:1: ( ( ( rule__MappingTransformation__ExecutionsAssignment_13 ) ) ( ( rule__MappingTransformation__ExecutionsAssignment_13 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:661:1: ( ( rule__MappingTransformation__ExecutionsAssignment_13 ) ) ( ( rule__MappingTransformation__ExecutionsAssignment_13 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:661:1: ( ( rule__MappingTransformation__ExecutionsAssignment_13 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:662:1: ( rule__MappingTransformation__ExecutionsAssignment_13 )
            {
             before(grammarAccess.getMappingTransformationAccess().getExecutionsAssignment_13()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:663:1: ( rule__MappingTransformation__ExecutionsAssignment_13 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:663:2: rule__MappingTransformation__ExecutionsAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__ExecutionsAssignment_13_in_rule__MappingTransformation__Group__13__Impl1309);
            rule__MappingTransformation__ExecutionsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getMappingTransformationAccess().getExecutionsAssignment_13()); 

            }

            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:666:1: ( ( rule__MappingTransformation__ExecutionsAssignment_13 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:667:1: ( rule__MappingTransformation__ExecutionsAssignment_13 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getExecutionsAssignment_13()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:668:1: ( rule__MappingTransformation__ExecutionsAssignment_13 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:668:2: rule__MappingTransformation__ExecutionsAssignment_13
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__ExecutionsAssignment_13_in_rule__MappingTransformation__Group__13__Impl1321);
            	    rule__MappingTransformation__ExecutionsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getExecutionsAssignment_13()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__13__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__14"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:679:1: rule__MappingTransformation__Group__14 : rule__MappingTransformation__Group__14__Impl ;
    public final void rule__MappingTransformation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:683:1: ( rule__MappingTransformation__Group__14__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:684:2: rule__MappingTransformation__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__14__Impl_in_rule__MappingTransformation__Group__141354);
            rule__MappingTransformation__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__14"


    // $ANTLR start "rule__MappingTransformation__Group__14__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:690:1: rule__MappingTransformation__Group__14__Impl : ( 'end' ) ;
    public final void rule__MappingTransformation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:694:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:695:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:695:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:696:1: 'end'
            {
             before(grammarAccess.getMappingTransformationAccess().getEndKeyword_14()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__MappingTransformation__Group__14__Impl1382); 
             after(grammarAccess.getMappingTransformationAccess().getEndKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group__14__Impl"


    // $ANTLR start "rule__MappingTransformation__Group_4__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:739:1: rule__MappingTransformation__Group_4__0 : rule__MappingTransformation__Group_4__0__Impl rule__MappingTransformation__Group_4__1 ;
    public final void rule__MappingTransformation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:743:1: ( rule__MappingTransformation__Group_4__0__Impl rule__MappingTransformation__Group_4__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:744:2: rule__MappingTransformation__Group_4__0__Impl rule__MappingTransformation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group_4__0__Impl_in_rule__MappingTransformation__Group_4__01443);
            rule__MappingTransformation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group_4__1_in_rule__MappingTransformation__Group_4__01446);
            rule__MappingTransformation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group_4__0"


    // $ANTLR start "rule__MappingTransformation__Group_4__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:751:1: rule__MappingTransformation__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MappingTransformation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:755:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:756:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:756:1: ( ',' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:757:1: ','
            {
             before(grammarAccess.getMappingTransformationAccess().getCommaKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MappingTransformation__Group_4__0__Impl1474); 
             after(grammarAccess.getMappingTransformationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group_4__0__Impl"


    // $ANTLR start "rule__MappingTransformation__Group_4__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:770:1: rule__MappingTransformation__Group_4__1 : rule__MappingTransformation__Group_4__1__Impl ;
    public final void rule__MappingTransformation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:774:1: ( rule__MappingTransformation__Group_4__1__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:775:2: rule__MappingTransformation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group_4__1__Impl_in_rule__MappingTransformation__Group_4__11505);
            rule__MappingTransformation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group_4__1"


    // $ANTLR start "rule__MappingTransformation__Group_4__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:781:1: rule__MappingTransformation__Group_4__1__Impl : ( ( rule__MappingTransformation__InModelsAssignment_4_1 ) ) ;
    public final void rule__MappingTransformation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:785:1: ( ( ( rule__MappingTransformation__InModelsAssignment_4_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:786:1: ( ( rule__MappingTransformation__InModelsAssignment_4_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:786:1: ( ( rule__MappingTransformation__InModelsAssignment_4_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:787:1: ( rule__MappingTransformation__InModelsAssignment_4_1 )
            {
             before(grammarAccess.getMappingTransformationAccess().getInModelsAssignment_4_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:788:1: ( rule__MappingTransformation__InModelsAssignment_4_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:788:2: rule__MappingTransformation__InModelsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__InModelsAssignment_4_1_in_rule__MappingTransformation__Group_4__1__Impl1532);
            rule__MappingTransformation__InModelsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingTransformationAccess().getInModelsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group_4__1__Impl"


    // $ANTLR start "rule__MappingTransformation__Group_9__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:802:1: rule__MappingTransformation__Group_9__0 : rule__MappingTransformation__Group_9__0__Impl rule__MappingTransformation__Group_9__1 ;
    public final void rule__MappingTransformation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:806:1: ( rule__MappingTransformation__Group_9__0__Impl rule__MappingTransformation__Group_9__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:807:2: rule__MappingTransformation__Group_9__0__Impl rule__MappingTransformation__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group_9__0__Impl_in_rule__MappingTransformation__Group_9__01566);
            rule__MappingTransformation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group_9__1_in_rule__MappingTransformation__Group_9__01569);
            rule__MappingTransformation__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group_9__0"


    // $ANTLR start "rule__MappingTransformation__Group_9__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:814:1: rule__MappingTransformation__Group_9__0__Impl : ( ',' ) ;
    public final void rule__MappingTransformation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:818:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:819:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:819:1: ( ',' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:820:1: ','
            {
             before(grammarAccess.getMappingTransformationAccess().getCommaKeyword_9_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MappingTransformation__Group_9__0__Impl1597); 
             after(grammarAccess.getMappingTransformationAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group_9__0__Impl"


    // $ANTLR start "rule__MappingTransformation__Group_9__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:833:1: rule__MappingTransformation__Group_9__1 : rule__MappingTransformation__Group_9__1__Impl ;
    public final void rule__MappingTransformation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:837:1: ( rule__MappingTransformation__Group_9__1__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:838:2: rule__MappingTransformation__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group_9__1__Impl_in_rule__MappingTransformation__Group_9__11628);
            rule__MappingTransformation__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group_9__1"


    // $ANTLR start "rule__MappingTransformation__Group_9__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:844:1: rule__MappingTransformation__Group_9__1__Impl : ( ( rule__MappingTransformation__OutModelsAssignment_9_1 ) ) ;
    public final void rule__MappingTransformation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:848:1: ( ( ( rule__MappingTransformation__OutModelsAssignment_9_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:849:1: ( ( rule__MappingTransformation__OutModelsAssignment_9_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:849:1: ( ( rule__MappingTransformation__OutModelsAssignment_9_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:850:1: ( rule__MappingTransformation__OutModelsAssignment_9_1 )
            {
             before(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_9_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:851:1: ( rule__MappingTransformation__OutModelsAssignment_9_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:851:2: rule__MappingTransformation__OutModelsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__OutModelsAssignment_9_1_in_rule__MappingTransformation__Group_9__1__Impl1655);
            rule__MappingTransformation__OutModelsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__Group_9__1__Impl"


    // $ANTLR start "rule__TransformationDefinitionParameter__Group__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:865:1: rule__TransformationDefinitionParameter__Group__0 : rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1 ;
    public final void rule__TransformationDefinitionParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:869:1: ( rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:870:2: rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__0__Impl_in_rule__TransformationDefinitionParameter__Group__01689);
            rule__TransformationDefinitionParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__1_in_rule__TransformationDefinitionParameter__Group__01692);
            rule__TransformationDefinitionParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationDefinitionParameter__Group__0"


    // $ANTLR start "rule__TransformationDefinitionParameter__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:877:1: rule__TransformationDefinitionParameter__Group__0__Impl : ( () ) ;
    public final void rule__TransformationDefinitionParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:881:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:882:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:882:1: ( () )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:883:1: ()
            {
             before(grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:884:1: ()
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:886:1: 
            {
            }

             after(grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationDefinitionParameter__Group__0__Impl"


    // $ANTLR start "rule__TransformationDefinitionParameter__Group__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:896:1: rule__TransformationDefinitionParameter__Group__1 : rule__TransformationDefinitionParameter__Group__1__Impl ;
    public final void rule__TransformationDefinitionParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:900:1: ( rule__TransformationDefinitionParameter__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:901:2: rule__TransformationDefinitionParameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__1__Impl_in_rule__TransformationDefinitionParameter__Group__11750);
            rule__TransformationDefinitionParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationDefinitionParameter__Group__1"


    // $ANTLR start "rule__TransformationDefinitionParameter__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:907:1: rule__TransformationDefinitionParameter__Group__1__Impl : ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) ) ;
    public final void rule__TransformationDefinitionParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:911:1: ( ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:912:1: ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:912:1: ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:913:1: ( rule__TransformationDefinitionParameter__NameAssignment_1 )
            {
             before(grammarAccess.getTransformationDefinitionParameterAccess().getNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:914:1: ( rule__TransformationDefinitionParameter__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:914:2: rule__TransformationDefinitionParameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__NameAssignment_1_in_rule__TransformationDefinitionParameter__Group__1__Impl1777);
            rule__TransformationDefinitionParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationDefinitionParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationDefinitionParameter__Group__1__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:928:1: rule__CompositeTransformation__Group__0 : rule__CompositeTransformation__Group__0__Impl rule__CompositeTransformation__Group__1 ;
    public final void rule__CompositeTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:932:1: ( rule__CompositeTransformation__Group__0__Impl rule__CompositeTransformation__Group__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:933:2: rule__CompositeTransformation__Group__0__Impl rule__CompositeTransformation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__0__Impl_in_rule__CompositeTransformation__Group__01811);
            rule__CompositeTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__1_in_rule__CompositeTransformation__Group__01814);
            rule__CompositeTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__0"


    // $ANTLR start "rule__CompositeTransformation__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:940:1: rule__CompositeTransformation__Group__0__Impl : ( 'composite' ) ;
    public final void rule__CompositeTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:944:1: ( ( 'composite' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:945:1: ( 'composite' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:945:1: ( 'composite' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:946:1: 'composite'
            {
             before(grammarAccess.getCompositeTransformationAccess().getCompositeKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__CompositeTransformation__Group__0__Impl1842); 
             after(grammarAccess.getCompositeTransformationAccess().getCompositeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__0__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:959:1: rule__CompositeTransformation__Group__1 : rule__CompositeTransformation__Group__1__Impl rule__CompositeTransformation__Group__2 ;
    public final void rule__CompositeTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:963:1: ( rule__CompositeTransformation__Group__1__Impl rule__CompositeTransformation__Group__2 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:964:2: rule__CompositeTransformation__Group__1__Impl rule__CompositeTransformation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__1__Impl_in_rule__CompositeTransformation__Group__11873);
            rule__CompositeTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__2_in_rule__CompositeTransformation__Group__11876);
            rule__CompositeTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__1"


    // $ANTLR start "rule__CompositeTransformation__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:971:1: rule__CompositeTransformation__Group__1__Impl : ( ( rule__CompositeTransformation__NameAssignment_1 ) ) ;
    public final void rule__CompositeTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:975:1: ( ( ( rule__CompositeTransformation__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:976:1: ( ( rule__CompositeTransformation__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:976:1: ( ( rule__CompositeTransformation__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:977:1: ( rule__CompositeTransformation__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeTransformationAccess().getNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:978:1: ( rule__CompositeTransformation__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:978:2: rule__CompositeTransformation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__NameAssignment_1_in_rule__CompositeTransformation__Group__1__Impl1903);
            rule__CompositeTransformation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeTransformationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__1__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__2"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:988:1: rule__CompositeTransformation__Group__2 : rule__CompositeTransformation__Group__2__Impl rule__CompositeTransformation__Group__3 ;
    public final void rule__CompositeTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:992:1: ( rule__CompositeTransformation__Group__2__Impl rule__CompositeTransformation__Group__3 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:993:2: rule__CompositeTransformation__Group__2__Impl rule__CompositeTransformation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__2__Impl_in_rule__CompositeTransformation__Group__21933);
            rule__CompositeTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__3_in_rule__CompositeTransformation__Group__21936);
            rule__CompositeTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__2"


    // $ANTLR start "rule__CompositeTransformation__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1000:1: rule__CompositeTransformation__Group__2__Impl : ( '(' ) ;
    public final void rule__CompositeTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1004:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1005:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1005:1: ( '(' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1006:1: '('
            {
             before(grammarAccess.getCompositeTransformationAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__CompositeTransformation__Group__2__Impl1964); 
             after(grammarAccess.getCompositeTransformationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__2__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__3"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1019:1: rule__CompositeTransformation__Group__3 : rule__CompositeTransformation__Group__3__Impl rule__CompositeTransformation__Group__4 ;
    public final void rule__CompositeTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1023:1: ( rule__CompositeTransformation__Group__3__Impl rule__CompositeTransformation__Group__4 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1024:2: rule__CompositeTransformation__Group__3__Impl rule__CompositeTransformation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__3__Impl_in_rule__CompositeTransformation__Group__31995);
            rule__CompositeTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__4_in_rule__CompositeTransformation__Group__31998);
            rule__CompositeTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__3"


    // $ANTLR start "rule__CompositeTransformation__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1031:1: rule__CompositeTransformation__Group__3__Impl : ( ( rule__CompositeTransformation__InModelsAssignment_3 )? ) ;
    public final void rule__CompositeTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1035:1: ( ( ( rule__CompositeTransformation__InModelsAssignment_3 )? ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1036:1: ( ( rule__CompositeTransformation__InModelsAssignment_3 )? )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1036:1: ( ( rule__CompositeTransformation__InModelsAssignment_3 )? )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1037:1: ( rule__CompositeTransformation__InModelsAssignment_3 )?
            {
             before(grammarAccess.getCompositeTransformationAccess().getInModelsAssignment_3()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1038:1: ( rule__CompositeTransformation__InModelsAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1038:2: rule__CompositeTransformation__InModelsAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__InModelsAssignment_3_in_rule__CompositeTransformation__Group__3__Impl2025);
                    rule__CompositeTransformation__InModelsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeTransformationAccess().getInModelsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__3__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__4"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1048:1: rule__CompositeTransformation__Group__4 : rule__CompositeTransformation__Group__4__Impl rule__CompositeTransformation__Group__5 ;
    public final void rule__CompositeTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1052:1: ( rule__CompositeTransformation__Group__4__Impl rule__CompositeTransformation__Group__5 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1053:2: rule__CompositeTransformation__Group__4__Impl rule__CompositeTransformation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__4__Impl_in_rule__CompositeTransformation__Group__42056);
            rule__CompositeTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__5_in_rule__CompositeTransformation__Group__42059);
            rule__CompositeTransformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__4"


    // $ANTLR start "rule__CompositeTransformation__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1060:1: rule__CompositeTransformation__Group__4__Impl : ( ( rule__CompositeTransformation__Group_4__0 )* ) ;
    public final void rule__CompositeTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1064:1: ( ( ( rule__CompositeTransformation__Group_4__0 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1065:1: ( ( rule__CompositeTransformation__Group_4__0 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1065:1: ( ( rule__CompositeTransformation__Group_4__0 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1066:1: ( rule__CompositeTransformation__Group_4__0 )*
            {
             before(grammarAccess.getCompositeTransformationAccess().getGroup_4()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1067:1: ( rule__CompositeTransformation__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1067:2: rule__CompositeTransformation__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group_4__0_in_rule__CompositeTransformation__Group__4__Impl2086);
            	    rule__CompositeTransformation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCompositeTransformationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__4__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__5"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1077:1: rule__CompositeTransformation__Group__5 : rule__CompositeTransformation__Group__5__Impl rule__CompositeTransformation__Group__6 ;
    public final void rule__CompositeTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1081:1: ( rule__CompositeTransformation__Group__5__Impl rule__CompositeTransformation__Group__6 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1082:2: rule__CompositeTransformation__Group__5__Impl rule__CompositeTransformation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__5__Impl_in_rule__CompositeTransformation__Group__52117);
            rule__CompositeTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__6_in_rule__CompositeTransformation__Group__52120);
            rule__CompositeTransformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__5"


    // $ANTLR start "rule__CompositeTransformation__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1089:1: rule__CompositeTransformation__Group__5__Impl : ( ')' ) ;
    public final void rule__CompositeTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1093:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1094:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1094:1: ( ')' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1095:1: ')'
            {
             before(grammarAccess.getCompositeTransformationAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__CompositeTransformation__Group__5__Impl2148); 
             after(grammarAccess.getCompositeTransformationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__5__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__6"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1108:1: rule__CompositeTransformation__Group__6 : rule__CompositeTransformation__Group__6__Impl rule__CompositeTransformation__Group__7 ;
    public final void rule__CompositeTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1112:1: ( rule__CompositeTransformation__Group__6__Impl rule__CompositeTransformation__Group__7 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1113:2: rule__CompositeTransformation__Group__6__Impl rule__CompositeTransformation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__6__Impl_in_rule__CompositeTransformation__Group__62179);
            rule__CompositeTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__7_in_rule__CompositeTransformation__Group__62182);
            rule__CompositeTransformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__6"


    // $ANTLR start "rule__CompositeTransformation__Group__6__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1120:1: rule__CompositeTransformation__Group__6__Impl : ( '->' ) ;
    public final void rule__CompositeTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1124:1: ( ( '->' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1125:1: ( '->' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1125:1: ( '->' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1126:1: '->'
            {
             before(grammarAccess.getCompositeTransformationAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__CompositeTransformation__Group__6__Impl2210); 
             after(grammarAccess.getCompositeTransformationAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__6__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__7"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1139:1: rule__CompositeTransformation__Group__7 : rule__CompositeTransformation__Group__7__Impl rule__CompositeTransformation__Group__8 ;
    public final void rule__CompositeTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1143:1: ( rule__CompositeTransformation__Group__7__Impl rule__CompositeTransformation__Group__8 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1144:2: rule__CompositeTransformation__Group__7__Impl rule__CompositeTransformation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__7__Impl_in_rule__CompositeTransformation__Group__72241);
            rule__CompositeTransformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__8_in_rule__CompositeTransformation__Group__72244);
            rule__CompositeTransformation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__7"


    // $ANTLR start "rule__CompositeTransformation__Group__7__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1151:1: rule__CompositeTransformation__Group__7__Impl : ( '(' ) ;
    public final void rule__CompositeTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1155:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1156:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1156:1: ( '(' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1157:1: '('
            {
             before(grammarAccess.getCompositeTransformationAccess().getLeftParenthesisKeyword_7()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__CompositeTransformation__Group__7__Impl2272); 
             after(grammarAccess.getCompositeTransformationAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__7__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__8"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1170:1: rule__CompositeTransformation__Group__8 : rule__CompositeTransformation__Group__8__Impl rule__CompositeTransformation__Group__9 ;
    public final void rule__CompositeTransformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1174:1: ( rule__CompositeTransformation__Group__8__Impl rule__CompositeTransformation__Group__9 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1175:2: rule__CompositeTransformation__Group__8__Impl rule__CompositeTransformation__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__8__Impl_in_rule__CompositeTransformation__Group__82303);
            rule__CompositeTransformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__9_in_rule__CompositeTransformation__Group__82306);
            rule__CompositeTransformation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__8"


    // $ANTLR start "rule__CompositeTransformation__Group__8__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1182:1: rule__CompositeTransformation__Group__8__Impl : ( ( rule__CompositeTransformation__OutModelsAssignment_8 )? ) ;
    public final void rule__CompositeTransformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1186:1: ( ( ( rule__CompositeTransformation__OutModelsAssignment_8 )? ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1187:1: ( ( rule__CompositeTransformation__OutModelsAssignment_8 )? )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1187:1: ( ( rule__CompositeTransformation__OutModelsAssignment_8 )? )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1188:1: ( rule__CompositeTransformation__OutModelsAssignment_8 )?
            {
             before(grammarAccess.getCompositeTransformationAccess().getOutModelsAssignment_8()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1189:1: ( rule__CompositeTransformation__OutModelsAssignment_8 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1189:2: rule__CompositeTransformation__OutModelsAssignment_8
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__OutModelsAssignment_8_in_rule__CompositeTransformation__Group__8__Impl2333);
                    rule__CompositeTransformation__OutModelsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeTransformationAccess().getOutModelsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__8__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__9"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1199:1: rule__CompositeTransformation__Group__9 : rule__CompositeTransformation__Group__9__Impl rule__CompositeTransformation__Group__10 ;
    public final void rule__CompositeTransformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1203:1: ( rule__CompositeTransformation__Group__9__Impl rule__CompositeTransformation__Group__10 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1204:2: rule__CompositeTransformation__Group__9__Impl rule__CompositeTransformation__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__9__Impl_in_rule__CompositeTransformation__Group__92364);
            rule__CompositeTransformation__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__10_in_rule__CompositeTransformation__Group__92367);
            rule__CompositeTransformation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__9"


    // $ANTLR start "rule__CompositeTransformation__Group__9__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1211:1: rule__CompositeTransformation__Group__9__Impl : ( ( rule__CompositeTransformation__Group_9__0 )* ) ;
    public final void rule__CompositeTransformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1215:1: ( ( ( rule__CompositeTransformation__Group_9__0 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1216:1: ( ( rule__CompositeTransformation__Group_9__0 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1216:1: ( ( rule__CompositeTransformation__Group_9__0 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1217:1: ( rule__CompositeTransformation__Group_9__0 )*
            {
             before(grammarAccess.getCompositeTransformationAccess().getGroup_9()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1218:1: ( rule__CompositeTransformation__Group_9__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1218:2: rule__CompositeTransformation__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group_9__0_in_rule__CompositeTransformation__Group__9__Impl2394);
            	    rule__CompositeTransformation__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompositeTransformationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__9__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__10"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1228:1: rule__CompositeTransformation__Group__10 : rule__CompositeTransformation__Group__10__Impl rule__CompositeTransformation__Group__11 ;
    public final void rule__CompositeTransformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1232:1: ( rule__CompositeTransformation__Group__10__Impl rule__CompositeTransformation__Group__11 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1233:2: rule__CompositeTransformation__Group__10__Impl rule__CompositeTransformation__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__10__Impl_in_rule__CompositeTransformation__Group__102425);
            rule__CompositeTransformation__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__11_in_rule__CompositeTransformation__Group__102428);
            rule__CompositeTransformation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__10"


    // $ANTLR start "rule__CompositeTransformation__Group__10__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1240:1: rule__CompositeTransformation__Group__10__Impl : ( ')' ) ;
    public final void rule__CompositeTransformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1244:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1245:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1245:1: ( ')' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1246:1: ')'
            {
             before(grammarAccess.getCompositeTransformationAccess().getRightParenthesisKeyword_10()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__CompositeTransformation__Group__10__Impl2456); 
             after(grammarAccess.getCompositeTransformationAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__10__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__11"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1259:1: rule__CompositeTransformation__Group__11 : rule__CompositeTransformation__Group__11__Impl rule__CompositeTransformation__Group__12 ;
    public final void rule__CompositeTransformation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1263:1: ( rule__CompositeTransformation__Group__11__Impl rule__CompositeTransformation__Group__12 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1264:2: rule__CompositeTransformation__Group__11__Impl rule__CompositeTransformation__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__11__Impl_in_rule__CompositeTransformation__Group__112487);
            rule__CompositeTransformation__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__12_in_rule__CompositeTransformation__Group__112490);
            rule__CompositeTransformation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__11"


    // $ANTLR start "rule__CompositeTransformation__Group__11__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1271:1: rule__CompositeTransformation__Group__11__Impl : ( ( ( rule__CompositeTransformation__ExecutionsAssignment_11 ) ) ( ( rule__CompositeTransformation__ExecutionsAssignment_11 )* ) ) ;
    public final void rule__CompositeTransformation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1275:1: ( ( ( ( rule__CompositeTransformation__ExecutionsAssignment_11 ) ) ( ( rule__CompositeTransformation__ExecutionsAssignment_11 )* ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1276:1: ( ( ( rule__CompositeTransformation__ExecutionsAssignment_11 ) ) ( ( rule__CompositeTransformation__ExecutionsAssignment_11 )* ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1276:1: ( ( ( rule__CompositeTransformation__ExecutionsAssignment_11 ) ) ( ( rule__CompositeTransformation__ExecutionsAssignment_11 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1277:1: ( ( rule__CompositeTransformation__ExecutionsAssignment_11 ) ) ( ( rule__CompositeTransformation__ExecutionsAssignment_11 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1277:1: ( ( rule__CompositeTransformation__ExecutionsAssignment_11 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1278:1: ( rule__CompositeTransformation__ExecutionsAssignment_11 )
            {
             before(grammarAccess.getCompositeTransformationAccess().getExecutionsAssignment_11()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1279:1: ( rule__CompositeTransformation__ExecutionsAssignment_11 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1279:2: rule__CompositeTransformation__ExecutionsAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__ExecutionsAssignment_11_in_rule__CompositeTransformation__Group__11__Impl2519);
            rule__CompositeTransformation__ExecutionsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCompositeTransformationAccess().getExecutionsAssignment_11()); 

            }

            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1282:1: ( ( rule__CompositeTransformation__ExecutionsAssignment_11 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1283:1: ( rule__CompositeTransformation__ExecutionsAssignment_11 )*
            {
             before(grammarAccess.getCompositeTransformationAccess().getExecutionsAssignment_11()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1284:1: ( rule__CompositeTransformation__ExecutionsAssignment_11 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1284:2: rule__CompositeTransformation__ExecutionsAssignment_11
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__ExecutionsAssignment_11_in_rule__CompositeTransformation__Group__11__Impl2531);
            	    rule__CompositeTransformation__ExecutionsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCompositeTransformationAccess().getExecutionsAssignment_11()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__11__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group__12"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1295:1: rule__CompositeTransformation__Group__12 : rule__CompositeTransformation__Group__12__Impl ;
    public final void rule__CompositeTransformation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1299:1: ( rule__CompositeTransformation__Group__12__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1300:2: rule__CompositeTransformation__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group__12__Impl_in_rule__CompositeTransformation__Group__122564);
            rule__CompositeTransformation__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__12"


    // $ANTLR start "rule__CompositeTransformation__Group__12__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1306:1: rule__CompositeTransformation__Group__12__Impl : ( 'end' ) ;
    public final void rule__CompositeTransformation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1310:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1311:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1311:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1312:1: 'end'
            {
             before(grammarAccess.getCompositeTransformationAccess().getEndKeyword_12()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__CompositeTransformation__Group__12__Impl2592); 
             after(grammarAccess.getCompositeTransformationAccess().getEndKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group__12__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group_4__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1351:1: rule__CompositeTransformation__Group_4__0 : rule__CompositeTransformation__Group_4__0__Impl rule__CompositeTransformation__Group_4__1 ;
    public final void rule__CompositeTransformation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1355:1: ( rule__CompositeTransformation__Group_4__0__Impl rule__CompositeTransformation__Group_4__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1356:2: rule__CompositeTransformation__Group_4__0__Impl rule__CompositeTransformation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group_4__0__Impl_in_rule__CompositeTransformation__Group_4__02649);
            rule__CompositeTransformation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group_4__1_in_rule__CompositeTransformation__Group_4__02652);
            rule__CompositeTransformation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group_4__0"


    // $ANTLR start "rule__CompositeTransformation__Group_4__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1363:1: rule__CompositeTransformation__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CompositeTransformation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1367:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1368:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1368:1: ( ',' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1369:1: ','
            {
             before(grammarAccess.getCompositeTransformationAccess().getCommaKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__CompositeTransformation__Group_4__0__Impl2680); 
             after(grammarAccess.getCompositeTransformationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group_4__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1382:1: rule__CompositeTransformation__Group_4__1 : rule__CompositeTransformation__Group_4__1__Impl ;
    public final void rule__CompositeTransformation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1386:1: ( rule__CompositeTransformation__Group_4__1__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1387:2: rule__CompositeTransformation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group_4__1__Impl_in_rule__CompositeTransformation__Group_4__12711);
            rule__CompositeTransformation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group_4__1"


    // $ANTLR start "rule__CompositeTransformation__Group_4__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1393:1: rule__CompositeTransformation__Group_4__1__Impl : ( ( rule__CompositeTransformation__InModelsAssignment_4_1 ) ) ;
    public final void rule__CompositeTransformation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1397:1: ( ( ( rule__CompositeTransformation__InModelsAssignment_4_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1398:1: ( ( rule__CompositeTransformation__InModelsAssignment_4_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1398:1: ( ( rule__CompositeTransformation__InModelsAssignment_4_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1399:1: ( rule__CompositeTransformation__InModelsAssignment_4_1 )
            {
             before(grammarAccess.getCompositeTransformationAccess().getInModelsAssignment_4_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1400:1: ( rule__CompositeTransformation__InModelsAssignment_4_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1400:2: rule__CompositeTransformation__InModelsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__InModelsAssignment_4_1_in_rule__CompositeTransformation__Group_4__1__Impl2738);
            rule__CompositeTransformation__InModelsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeTransformationAccess().getInModelsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group_9__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1414:1: rule__CompositeTransformation__Group_9__0 : rule__CompositeTransformation__Group_9__0__Impl rule__CompositeTransformation__Group_9__1 ;
    public final void rule__CompositeTransformation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1418:1: ( rule__CompositeTransformation__Group_9__0__Impl rule__CompositeTransformation__Group_9__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1419:2: rule__CompositeTransformation__Group_9__0__Impl rule__CompositeTransformation__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group_9__0__Impl_in_rule__CompositeTransformation__Group_9__02772);
            rule__CompositeTransformation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group_9__1_in_rule__CompositeTransformation__Group_9__02775);
            rule__CompositeTransformation__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group_9__0"


    // $ANTLR start "rule__CompositeTransformation__Group_9__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1426:1: rule__CompositeTransformation__Group_9__0__Impl : ( ',' ) ;
    public final void rule__CompositeTransformation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1430:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1431:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1431:1: ( ',' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1432:1: ','
            {
             before(grammarAccess.getCompositeTransformationAccess().getCommaKeyword_9_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__CompositeTransformation__Group_9__0__Impl2803); 
             after(grammarAccess.getCompositeTransformationAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group_9__0__Impl"


    // $ANTLR start "rule__CompositeTransformation__Group_9__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1445:1: rule__CompositeTransformation__Group_9__1 : rule__CompositeTransformation__Group_9__1__Impl ;
    public final void rule__CompositeTransformation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1449:1: ( rule__CompositeTransformation__Group_9__1__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1450:2: rule__CompositeTransformation__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__Group_9__1__Impl_in_rule__CompositeTransformation__Group_9__12834);
            rule__CompositeTransformation__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group_9__1"


    // $ANTLR start "rule__CompositeTransformation__Group_9__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1456:1: rule__CompositeTransformation__Group_9__1__Impl : ( ( rule__CompositeTransformation__OutModelsAssignment_9_1 ) ) ;
    public final void rule__CompositeTransformation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1460:1: ( ( ( rule__CompositeTransformation__OutModelsAssignment_9_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1461:1: ( ( rule__CompositeTransformation__OutModelsAssignment_9_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1461:1: ( ( rule__CompositeTransformation__OutModelsAssignment_9_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1462:1: ( rule__CompositeTransformation__OutModelsAssignment_9_1 )
            {
             before(grammarAccess.getCompositeTransformationAccess().getOutModelsAssignment_9_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1463:1: ( rule__CompositeTransformation__OutModelsAssignment_9_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1463:2: rule__CompositeTransformation__OutModelsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeTransformation__OutModelsAssignment_9_1_in_rule__CompositeTransformation__Group_9__1__Impl2861);
            rule__CompositeTransformation__OutModelsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeTransformationAccess().getOutModelsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__Group_9__1__Impl"


    // $ANTLR start "rule__TransformationExecution__Group__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1477:1: rule__TransformationExecution__Group__0 : rule__TransformationExecution__Group__0__Impl rule__TransformationExecution__Group__1 ;
    public final void rule__TransformationExecution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1481:1: ( rule__TransformationExecution__Group__0__Impl rule__TransformationExecution__Group__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1482:2: rule__TransformationExecution__Group__0__Impl rule__TransformationExecution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__0__Impl_in_rule__TransformationExecution__Group__02895);
            rule__TransformationExecution__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__1_in_rule__TransformationExecution__Group__02898);
            rule__TransformationExecution__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__0"


    // $ANTLR start "rule__TransformationExecution__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1489:1: rule__TransformationExecution__Group__0__Impl : ( ( rule__TransformationExecution__OutputModelsAssignment_0 ) ) ;
    public final void rule__TransformationExecution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1493:1: ( ( ( rule__TransformationExecution__OutputModelsAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1494:1: ( ( rule__TransformationExecution__OutputModelsAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1494:1: ( ( rule__TransformationExecution__OutputModelsAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1495:1: ( rule__TransformationExecution__OutputModelsAssignment_0 )
            {
             before(grammarAccess.getTransformationExecutionAccess().getOutputModelsAssignment_0()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1496:1: ( rule__TransformationExecution__OutputModelsAssignment_0 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1496:2: rule__TransformationExecution__OutputModelsAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__OutputModelsAssignment_0_in_rule__TransformationExecution__Group__0__Impl2925);
            rule__TransformationExecution__OutputModelsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationExecutionAccess().getOutputModelsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__0__Impl"


    // $ANTLR start "rule__TransformationExecution__Group__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1506:1: rule__TransformationExecution__Group__1 : rule__TransformationExecution__Group__1__Impl rule__TransformationExecution__Group__2 ;
    public final void rule__TransformationExecution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1510:1: ( rule__TransformationExecution__Group__1__Impl rule__TransformationExecution__Group__2 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1511:2: rule__TransformationExecution__Group__1__Impl rule__TransformationExecution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__1__Impl_in_rule__TransformationExecution__Group__12955);
            rule__TransformationExecution__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__2_in_rule__TransformationExecution__Group__12958);
            rule__TransformationExecution__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__1"


    // $ANTLR start "rule__TransformationExecution__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1518:1: rule__TransformationExecution__Group__1__Impl : ( ( rule__TransformationExecution__Group_1__0 )* ) ;
    public final void rule__TransformationExecution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1522:1: ( ( ( rule__TransformationExecution__Group_1__0 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1523:1: ( ( rule__TransformationExecution__Group_1__0 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1523:1: ( ( rule__TransformationExecution__Group_1__0 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1524:1: ( rule__TransformationExecution__Group_1__0 )*
            {
             before(grammarAccess.getTransformationExecutionAccess().getGroup_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1525:1: ( rule__TransformationExecution__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1525:2: rule__TransformationExecution__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group_1__0_in_rule__TransformationExecution__Group__1__Impl2985);
            	    rule__TransformationExecution__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTransformationExecutionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__1__Impl"


    // $ANTLR start "rule__TransformationExecution__Group__2"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1535:1: rule__TransformationExecution__Group__2 : rule__TransformationExecution__Group__2__Impl rule__TransformationExecution__Group__3 ;
    public final void rule__TransformationExecution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1539:1: ( rule__TransformationExecution__Group__2__Impl rule__TransformationExecution__Group__3 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1540:2: rule__TransformationExecution__Group__2__Impl rule__TransformationExecution__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__2__Impl_in_rule__TransformationExecution__Group__23016);
            rule__TransformationExecution__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__3_in_rule__TransformationExecution__Group__23019);
            rule__TransformationExecution__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__2"


    // $ANTLR start "rule__TransformationExecution__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1547:1: rule__TransformationExecution__Group__2__Impl : ( '=' ) ;
    public final void rule__TransformationExecution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1551:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1552:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1552:1: ( '=' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1553:1: '='
            {
             before(grammarAccess.getTransformationExecutionAccess().getEqualsSignKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TransformationExecution__Group__2__Impl3047); 
             after(grammarAccess.getTransformationExecutionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__2__Impl"


    // $ANTLR start "rule__TransformationExecution__Group__3"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1566:1: rule__TransformationExecution__Group__3 : rule__TransformationExecution__Group__3__Impl rule__TransformationExecution__Group__4 ;
    public final void rule__TransformationExecution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1570:1: ( rule__TransformationExecution__Group__3__Impl rule__TransformationExecution__Group__4 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1571:2: rule__TransformationExecution__Group__3__Impl rule__TransformationExecution__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__3__Impl_in_rule__TransformationExecution__Group__33078);
            rule__TransformationExecution__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__4_in_rule__TransformationExecution__Group__33081);
            rule__TransformationExecution__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__3"


    // $ANTLR start "rule__TransformationExecution__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1578:1: rule__TransformationExecution__Group__3__Impl : ( ( rule__TransformationExecution__TransformationAssignment_3 ) ) ;
    public final void rule__TransformationExecution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1582:1: ( ( ( rule__TransformationExecution__TransformationAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1583:1: ( ( rule__TransformationExecution__TransformationAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1583:1: ( ( rule__TransformationExecution__TransformationAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1584:1: ( rule__TransformationExecution__TransformationAssignment_3 )
            {
             before(grammarAccess.getTransformationExecutionAccess().getTransformationAssignment_3()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1585:1: ( rule__TransformationExecution__TransformationAssignment_3 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1585:2: rule__TransformationExecution__TransformationAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__TransformationAssignment_3_in_rule__TransformationExecution__Group__3__Impl3108);
            rule__TransformationExecution__TransformationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransformationExecutionAccess().getTransformationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__3__Impl"


    // $ANTLR start "rule__TransformationExecution__Group__4"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1595:1: rule__TransformationExecution__Group__4 : rule__TransformationExecution__Group__4__Impl rule__TransformationExecution__Group__5 ;
    public final void rule__TransformationExecution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1599:1: ( rule__TransformationExecution__Group__4__Impl rule__TransformationExecution__Group__5 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1600:2: rule__TransformationExecution__Group__4__Impl rule__TransformationExecution__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__4__Impl_in_rule__TransformationExecution__Group__43138);
            rule__TransformationExecution__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__5_in_rule__TransformationExecution__Group__43141);
            rule__TransformationExecution__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__4"


    // $ANTLR start "rule__TransformationExecution__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1607:1: rule__TransformationExecution__Group__4__Impl : ( '(' ) ;
    public final void rule__TransformationExecution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1611:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1612:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1612:1: ( '(' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1613:1: '('
            {
             before(grammarAccess.getTransformationExecutionAccess().getLeftParenthesisKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__TransformationExecution__Group__4__Impl3169); 
             after(grammarAccess.getTransformationExecutionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__4__Impl"


    // $ANTLR start "rule__TransformationExecution__Group__5"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1626:1: rule__TransformationExecution__Group__5 : rule__TransformationExecution__Group__5__Impl rule__TransformationExecution__Group__6 ;
    public final void rule__TransformationExecution__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1630:1: ( rule__TransformationExecution__Group__5__Impl rule__TransformationExecution__Group__6 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1631:2: rule__TransformationExecution__Group__5__Impl rule__TransformationExecution__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__5__Impl_in_rule__TransformationExecution__Group__53200);
            rule__TransformationExecution__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__6_in_rule__TransformationExecution__Group__53203);
            rule__TransformationExecution__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__5"


    // $ANTLR start "rule__TransformationExecution__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1638:1: rule__TransformationExecution__Group__5__Impl : ( ( rule__TransformationExecution__InputModelsAssignment_5 ) ) ;
    public final void rule__TransformationExecution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1642:1: ( ( ( rule__TransformationExecution__InputModelsAssignment_5 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1643:1: ( ( rule__TransformationExecution__InputModelsAssignment_5 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1643:1: ( ( rule__TransformationExecution__InputModelsAssignment_5 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1644:1: ( rule__TransformationExecution__InputModelsAssignment_5 )
            {
             before(grammarAccess.getTransformationExecutionAccess().getInputModelsAssignment_5()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1645:1: ( rule__TransformationExecution__InputModelsAssignment_5 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1645:2: rule__TransformationExecution__InputModelsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__InputModelsAssignment_5_in_rule__TransformationExecution__Group__5__Impl3230);
            rule__TransformationExecution__InputModelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransformationExecutionAccess().getInputModelsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__5__Impl"


    // $ANTLR start "rule__TransformationExecution__Group__6"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1655:1: rule__TransformationExecution__Group__6 : rule__TransformationExecution__Group__6__Impl rule__TransformationExecution__Group__7 ;
    public final void rule__TransformationExecution__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1659:1: ( rule__TransformationExecution__Group__6__Impl rule__TransformationExecution__Group__7 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1660:2: rule__TransformationExecution__Group__6__Impl rule__TransformationExecution__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__6__Impl_in_rule__TransformationExecution__Group__63260);
            rule__TransformationExecution__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__7_in_rule__TransformationExecution__Group__63263);
            rule__TransformationExecution__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__6"


    // $ANTLR start "rule__TransformationExecution__Group__6__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1667:1: rule__TransformationExecution__Group__6__Impl : ( ( rule__TransformationExecution__Group_6__0 )* ) ;
    public final void rule__TransformationExecution__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1671:1: ( ( ( rule__TransformationExecution__Group_6__0 )* ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1672:1: ( ( rule__TransformationExecution__Group_6__0 )* )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1672:1: ( ( rule__TransformationExecution__Group_6__0 )* )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1673:1: ( rule__TransformationExecution__Group_6__0 )*
            {
             before(grammarAccess.getTransformationExecutionAccess().getGroup_6()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1674:1: ( rule__TransformationExecution__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1674:2: rule__TransformationExecution__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group_6__0_in_rule__TransformationExecution__Group__6__Impl3290);
            	    rule__TransformationExecution__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTransformationExecutionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__6__Impl"


    // $ANTLR start "rule__TransformationExecution__Group__7"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1684:1: rule__TransformationExecution__Group__7 : rule__TransformationExecution__Group__7__Impl ;
    public final void rule__TransformationExecution__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1688:1: ( rule__TransformationExecution__Group__7__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1689:2: rule__TransformationExecution__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group__7__Impl_in_rule__TransformationExecution__Group__73321);
            rule__TransformationExecution__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__7"


    // $ANTLR start "rule__TransformationExecution__Group__7__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1695:1: rule__TransformationExecution__Group__7__Impl : ( ')' ) ;
    public final void rule__TransformationExecution__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1699:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1700:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1700:1: ( ')' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1701:1: ')'
            {
             before(grammarAccess.getTransformationExecutionAccess().getRightParenthesisKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__TransformationExecution__Group__7__Impl3349); 
             after(grammarAccess.getTransformationExecutionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group__7__Impl"


    // $ANTLR start "rule__TransformationExecution__Group_1__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1730:1: rule__TransformationExecution__Group_1__0 : rule__TransformationExecution__Group_1__0__Impl rule__TransformationExecution__Group_1__1 ;
    public final void rule__TransformationExecution__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1734:1: ( rule__TransformationExecution__Group_1__0__Impl rule__TransformationExecution__Group_1__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1735:2: rule__TransformationExecution__Group_1__0__Impl rule__TransformationExecution__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group_1__0__Impl_in_rule__TransformationExecution__Group_1__03396);
            rule__TransformationExecution__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group_1__1_in_rule__TransformationExecution__Group_1__03399);
            rule__TransformationExecution__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group_1__0"


    // $ANTLR start "rule__TransformationExecution__Group_1__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1742:1: rule__TransformationExecution__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TransformationExecution__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1746:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1747:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1747:1: ( ',' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1748:1: ','
            {
             before(grammarAccess.getTransformationExecutionAccess().getCommaKeyword_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TransformationExecution__Group_1__0__Impl3427); 
             after(grammarAccess.getTransformationExecutionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group_1__0__Impl"


    // $ANTLR start "rule__TransformationExecution__Group_1__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1761:1: rule__TransformationExecution__Group_1__1 : rule__TransformationExecution__Group_1__1__Impl ;
    public final void rule__TransformationExecution__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1765:1: ( rule__TransformationExecution__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1766:2: rule__TransformationExecution__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group_1__1__Impl_in_rule__TransformationExecution__Group_1__13458);
            rule__TransformationExecution__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group_1__1"


    // $ANTLR start "rule__TransformationExecution__Group_1__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1772:1: rule__TransformationExecution__Group_1__1__Impl : ( ( rule__TransformationExecution__OutputModelsAssignment_1_1 ) ) ;
    public final void rule__TransformationExecution__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1776:1: ( ( ( rule__TransformationExecution__OutputModelsAssignment_1_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1777:1: ( ( rule__TransformationExecution__OutputModelsAssignment_1_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1777:1: ( ( rule__TransformationExecution__OutputModelsAssignment_1_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1778:1: ( rule__TransformationExecution__OutputModelsAssignment_1_1 )
            {
             before(grammarAccess.getTransformationExecutionAccess().getOutputModelsAssignment_1_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1779:1: ( rule__TransformationExecution__OutputModelsAssignment_1_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1779:2: rule__TransformationExecution__OutputModelsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__OutputModelsAssignment_1_1_in_rule__TransformationExecution__Group_1__1__Impl3485);
            rule__TransformationExecution__OutputModelsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationExecutionAccess().getOutputModelsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group_1__1__Impl"


    // $ANTLR start "rule__TransformationExecution__Group_6__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1793:1: rule__TransformationExecution__Group_6__0 : rule__TransformationExecution__Group_6__0__Impl rule__TransformationExecution__Group_6__1 ;
    public final void rule__TransformationExecution__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1797:1: ( rule__TransformationExecution__Group_6__0__Impl rule__TransformationExecution__Group_6__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1798:2: rule__TransformationExecution__Group_6__0__Impl rule__TransformationExecution__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group_6__0__Impl_in_rule__TransformationExecution__Group_6__03519);
            rule__TransformationExecution__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group_6__1_in_rule__TransformationExecution__Group_6__03522);
            rule__TransformationExecution__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group_6__0"


    // $ANTLR start "rule__TransformationExecution__Group_6__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1805:1: rule__TransformationExecution__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TransformationExecution__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1809:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1810:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1810:1: ( ',' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1811:1: ','
            {
             before(grammarAccess.getTransformationExecutionAccess().getCommaKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TransformationExecution__Group_6__0__Impl3550); 
             after(grammarAccess.getTransformationExecutionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group_6__0__Impl"


    // $ANTLR start "rule__TransformationExecution__Group_6__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1824:1: rule__TransformationExecution__Group_6__1 : rule__TransformationExecution__Group_6__1__Impl ;
    public final void rule__TransformationExecution__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1828:1: ( rule__TransformationExecution__Group_6__1__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1829:2: rule__TransformationExecution__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__Group_6__1__Impl_in_rule__TransformationExecution__Group_6__13581);
            rule__TransformationExecution__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group_6__1"


    // $ANTLR start "rule__TransformationExecution__Group_6__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1835:1: rule__TransformationExecution__Group_6__1__Impl : ( ( rule__TransformationExecution__InputModelsAssignment_6_1 ) ) ;
    public final void rule__TransformationExecution__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1839:1: ( ( ( rule__TransformationExecution__InputModelsAssignment_6_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1840:1: ( ( rule__TransformationExecution__InputModelsAssignment_6_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1840:1: ( ( rule__TransformationExecution__InputModelsAssignment_6_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1841:1: ( rule__TransformationExecution__InputModelsAssignment_6_1 )
            {
             before(grammarAccess.getTransformationExecutionAccess().getInputModelsAssignment_6_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1842:1: ( rule__TransformationExecution__InputModelsAssignment_6_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1842:2: rule__TransformationExecution__InputModelsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationExecution__InputModelsAssignment_6_1_in_rule__TransformationExecution__Group_6__1__Impl3608);
            rule__TransformationExecution__InputModelsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationExecutionAccess().getInputModelsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__Group_6__1__Impl"


    // $ANTLR start "rule__ExternalTransformation__Group__0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1856:1: rule__ExternalTransformation__Group__0 : rule__ExternalTransformation__Group__0__Impl rule__ExternalTransformation__Group__1 ;
    public final void rule__ExternalTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1860:1: ( rule__ExternalTransformation__Group__0__Impl rule__ExternalTransformation__Group__1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1861:2: rule__ExternalTransformation__Group__0__Impl rule__ExternalTransformation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExternalTransformation__Group__0__Impl_in_rule__ExternalTransformation__Group__03642);
            rule__ExternalTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExternalTransformation__Group__1_in_rule__ExternalTransformation__Group__03645);
            rule__ExternalTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalTransformation__Group__0"


    // $ANTLR start "rule__ExternalTransformation__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1868:1: rule__ExternalTransformation__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1872:1: ( ( 'external' ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1873:1: ( 'external' )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1873:1: ( 'external' )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1874:1: 'external'
            {
             before(grammarAccess.getExternalTransformationAccess().getExternalKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ExternalTransformation__Group__0__Impl3673); 
             after(grammarAccess.getExternalTransformationAccess().getExternalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalTransformation__Group__0__Impl"


    // $ANTLR start "rule__ExternalTransformation__Group__1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1887:1: rule__ExternalTransformation__Group__1 : rule__ExternalTransformation__Group__1__Impl ;
    public final void rule__ExternalTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1891:1: ( rule__ExternalTransformation__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1892:2: rule__ExternalTransformation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExternalTransformation__Group__1__Impl_in_rule__ExternalTransformation__Group__13704);
            rule__ExternalTransformation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalTransformation__Group__1"


    // $ANTLR start "rule__ExternalTransformation__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1898:1: rule__ExternalTransformation__Group__1__Impl : ( ( rule__ExternalTransformation__NameAssignment_1 ) ) ;
    public final void rule__ExternalTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1902:1: ( ( ( rule__ExternalTransformation__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1903:1: ( ( rule__ExternalTransformation__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1903:1: ( ( rule__ExternalTransformation__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1904:1: ( rule__ExternalTransformation__NameAssignment_1 )
            {
             before(grammarAccess.getExternalTransformationAccess().getNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1905:1: ( rule__ExternalTransformation__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1905:2: rule__ExternalTransformation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExternalTransformation__NameAssignment_1_in_rule__ExternalTransformation__Group__1__Impl3731);
            rule__ExternalTransformation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalTransformationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalTransformation__Group__1__Impl"


    // $ANTLR start "rule__MappingTransformation__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1921:1: rule__MappingTransformation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MappingTransformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1925:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1926:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1926:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1927:1: ruleEString
            {
             before(grammarAccess.getMappingTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MappingTransformation__NameAssignment_13771);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__NameAssignment_1"


    // $ANTLR start "rule__MappingTransformation__InModelsAssignment_3"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1936:1: rule__MappingTransformation__InModelsAssignment_3 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__MappingTransformation__InModelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1940:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1941:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1941:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1942:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__InModelsAssignment_33802);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__InModelsAssignment_3"


    // $ANTLR start "rule__MappingTransformation__InModelsAssignment_4_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1951:1: rule__MappingTransformation__InModelsAssignment_4_1 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__MappingTransformation__InModelsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1955:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1956:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1956:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1957:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__InModelsAssignment_4_13833);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__InModelsAssignment_4_1"


    // $ANTLR start "rule__MappingTransformation__OutModelsAssignment_8"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1966:1: rule__MappingTransformation__OutModelsAssignment_8 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__MappingTransformation__OutModelsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1970:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1971:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1971:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1972:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__OutModelsAssignment_83864);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__OutModelsAssignment_8"


    // $ANTLR start "rule__MappingTransformation__OutModelsAssignment_9_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1981:1: rule__MappingTransformation__OutModelsAssignment_9_1 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__MappingTransformation__OutModelsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1985:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1986:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1986:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1987:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__OutModelsAssignment_9_13895);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__OutModelsAssignment_9_1"


    // $ANTLR start "rule__MappingTransformation__ExternalsAssignment_11"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:1996:1: rule__MappingTransformation__ExternalsAssignment_11 : ( ruleExternalTransformation ) ;
    public final void rule__MappingTransformation__ExternalsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2000:1: ( ( ruleExternalTransformation ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2001:1: ( ruleExternalTransformation )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2001:1: ( ruleExternalTransformation )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2002:1: ruleExternalTransformation
            {
             before(grammarAccess.getMappingTransformationAccess().getExternalsExternalTransformationParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExternalTransformation_in_rule__MappingTransformation__ExternalsAssignment_113926);
            ruleExternalTransformation();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getExternalsExternalTransformationParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__ExternalsAssignment_11"


    // $ANTLR start "rule__MappingTransformation__CompositesAssignment_12"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2011:1: rule__MappingTransformation__CompositesAssignment_12 : ( ruleCompositeTransformation ) ;
    public final void rule__MappingTransformation__CompositesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2015:1: ( ( ruleCompositeTransformation ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2016:1: ( ruleCompositeTransformation )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2016:1: ( ruleCompositeTransformation )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2017:1: ruleCompositeTransformation
            {
             before(grammarAccess.getMappingTransformationAccess().getCompositesCompositeTransformationParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeTransformation_in_rule__MappingTransformation__CompositesAssignment_123957);
            ruleCompositeTransformation();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getCompositesCompositeTransformationParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__CompositesAssignment_12"


    // $ANTLR start "rule__MappingTransformation__ExecutionsAssignment_13"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2026:1: rule__MappingTransformation__ExecutionsAssignment_13 : ( ruleTransformationExecution ) ;
    public final void rule__MappingTransformation__ExecutionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2030:1: ( ( ruleTransformationExecution ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2031:1: ( ruleTransformationExecution )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2031:1: ( ruleTransformationExecution )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2032:1: ruleTransformationExecution
            {
             before(grammarAccess.getMappingTransformationAccess().getExecutionsTransformationExecutionParserRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationExecution_in_rule__MappingTransformation__ExecutionsAssignment_133988);
            ruleTransformationExecution();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getExecutionsTransformationExecutionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__ExecutionsAssignment_13"


    // $ANTLR start "rule__TransformationDefinitionParameter__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2041:1: rule__TransformationDefinitionParameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TransformationDefinitionParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2045:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2046:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2046:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2047:1: ruleEString
            {
             before(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TransformationDefinitionParameter__NameAssignment_14019);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationDefinitionParameter__NameAssignment_1"


    // $ANTLR start "rule__CompositeTransformation__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2056:1: rule__CompositeTransformation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeTransformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2060:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2061:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2061:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2062:1: ruleEString
            {
             before(grammarAccess.getCompositeTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CompositeTransformation__NameAssignment_14050);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeTransformationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__NameAssignment_1"


    // $ANTLR start "rule__CompositeTransformation__InModelsAssignment_3"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2071:1: rule__CompositeTransformation__InModelsAssignment_3 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__CompositeTransformation__InModelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2075:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2076:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2076:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2077:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getCompositeTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__CompositeTransformation__InModelsAssignment_34081);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getCompositeTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__InModelsAssignment_3"


    // $ANTLR start "rule__CompositeTransformation__InModelsAssignment_4_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2086:1: rule__CompositeTransformation__InModelsAssignment_4_1 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__CompositeTransformation__InModelsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2090:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2091:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2091:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2092:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getCompositeTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__CompositeTransformation__InModelsAssignment_4_14112);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getCompositeTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__InModelsAssignment_4_1"


    // $ANTLR start "rule__CompositeTransformation__OutModelsAssignment_8"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2101:1: rule__CompositeTransformation__OutModelsAssignment_8 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__CompositeTransformation__OutModelsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2105:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2106:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2106:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2107:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getCompositeTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__CompositeTransformation__OutModelsAssignment_84143);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getCompositeTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__OutModelsAssignment_8"


    // $ANTLR start "rule__CompositeTransformation__OutModelsAssignment_9_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2116:1: rule__CompositeTransformation__OutModelsAssignment_9_1 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__CompositeTransformation__OutModelsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2120:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2121:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2121:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2122:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getCompositeTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__CompositeTransformation__OutModelsAssignment_9_14174);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getCompositeTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__OutModelsAssignment_9_1"


    // $ANTLR start "rule__CompositeTransformation__ExecutionsAssignment_11"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2131:1: rule__CompositeTransformation__ExecutionsAssignment_11 : ( ruleTransformationExecution ) ;
    public final void rule__CompositeTransformation__ExecutionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2135:1: ( ( ruleTransformationExecution ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2136:1: ( ruleTransformationExecution )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2136:1: ( ruleTransformationExecution )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2137:1: ruleTransformationExecution
            {
             before(grammarAccess.getCompositeTransformationAccess().getExecutionsTransformationExecutionParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationExecution_in_rule__CompositeTransformation__ExecutionsAssignment_114205);
            ruleTransformationExecution();

            state._fsp--;

             after(grammarAccess.getCompositeTransformationAccess().getExecutionsTransformationExecutionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeTransformation__ExecutionsAssignment_11"


    // $ANTLR start "rule__TransformationExecution__OutputModelsAssignment_0"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2146:1: rule__TransformationExecution__OutputModelsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TransformationExecution__OutputModelsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2150:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2151:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2151:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2152:1: ( RULE_ID )
            {
             before(grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelCrossReference_0_0()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2153:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2154:1: RULE_ID
            {
             before(grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TransformationExecution__OutputModelsAssignment_04240); 
             after(grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__OutputModelsAssignment_0"


    // $ANTLR start "rule__TransformationExecution__OutputModelsAssignment_1_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2165:1: rule__TransformationExecution__OutputModelsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TransformationExecution__OutputModelsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2169:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2170:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2170:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2171:1: ( RULE_ID )
            {
             before(grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelCrossReference_1_1_0()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2172:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2173:1: RULE_ID
            {
             before(grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TransformationExecution__OutputModelsAssignment_1_14279); 
             after(grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__OutputModelsAssignment_1_1"


    // $ANTLR start "rule__TransformationExecution__TransformationAssignment_3"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2184:1: rule__TransformationExecution__TransformationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TransformationExecution__TransformationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2188:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2189:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2189:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2190:1: ( RULE_ID )
            {
             before(grammarAccess.getTransformationExecutionAccess().getTransformationAvailableTransformationCrossReference_3_0()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2191:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2192:1: RULE_ID
            {
             before(grammarAccess.getTransformationExecutionAccess().getTransformationAvailableTransformationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TransformationExecution__TransformationAssignment_34318); 
             after(grammarAccess.getTransformationExecutionAccess().getTransformationAvailableTransformationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransformationExecutionAccess().getTransformationAvailableTransformationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__TransformationAssignment_3"


    // $ANTLR start "rule__TransformationExecution__InputModelsAssignment_5"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2203:1: rule__TransformationExecution__InputModelsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TransformationExecution__InputModelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2207:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2208:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2208:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2209:1: ( RULE_ID )
            {
             before(grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelCrossReference_5_0()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2210:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2211:1: RULE_ID
            {
             before(grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TransformationExecution__InputModelsAssignment_54357); 
             after(grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__InputModelsAssignment_5"


    // $ANTLR start "rule__TransformationExecution__InputModelsAssignment_6_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2222:1: rule__TransformationExecution__InputModelsAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__TransformationExecution__InputModelsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2226:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2227:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2227:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2228:1: ( RULE_ID )
            {
             before(grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelCrossReference_6_1_0()); 
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2229:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2230:1: RULE_ID
            {
             before(grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TransformationExecution__InputModelsAssignment_6_14396); 
             after(grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationExecution__InputModelsAssignment_6_1"


    // $ANTLR start "rule__ExternalTransformation__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2241:1: rule__ExternalTransformation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExternalTransformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2245:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2246:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2246:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.chain.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalChain.g:2247:1: ruleEString
            {
             before(grammarAccess.getExternalTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExternalTransformation__NameAssignment_14431);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalTransformationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalTransformation__NameAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappingTransformation68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__0_in_ruleMappingTransformation94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__0_in_ruleTransformationDefinitionParameter154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeTransformation_in_entryRuleCompositeTransformation181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeTransformation188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__0_in_ruleCompositeTransformation214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationExecution_in_entryRuleTransformationExecution241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationExecution248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__0_in_ruleTransformationExecution274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExternalTransformation_in_entryRuleExternalTransformation301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExternalTransformation308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExternalTransformation__Group__0_in_ruleExternalTransformation334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__0__Impl_in_rule__MappingTransformation__Group__0479 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__1_in_rule__MappingTransformation__Group__0482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MappingTransformation__Group__0__Impl510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__1__Impl_in_rule__MappingTransformation__Group__1541 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__2_in_rule__MappingTransformation__Group__1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__NameAssignment_1_in_rule__MappingTransformation__Group__1__Impl571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__2__Impl_in_rule__MappingTransformation__Group__2601 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__3_in_rule__MappingTransformation__Group__2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MappingTransformation__Group__2__Impl632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__3__Impl_in_rule__MappingTransformation__Group__3663 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__4_in_rule__MappingTransformation__Group__3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__InModelsAssignment_3_in_rule__MappingTransformation__Group__3__Impl693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__4__Impl_in_rule__MappingTransformation__Group__4724 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__5_in_rule__MappingTransformation__Group__4727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group_4__0_in_rule__MappingTransformation__Group__4__Impl754 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__5__Impl_in_rule__MappingTransformation__Group__5785 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__6_in_rule__MappingTransformation__Group__5788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MappingTransformation__Group__5__Impl816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__6__Impl_in_rule__MappingTransformation__Group__6847 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__7_in_rule__MappingTransformation__Group__6850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MappingTransformation__Group__6__Impl878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__7__Impl_in_rule__MappingTransformation__Group__7909 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__8_in_rule__MappingTransformation__Group__7912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MappingTransformation__Group__7__Impl940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__8__Impl_in_rule__MappingTransformation__Group__8971 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__9_in_rule__MappingTransformation__Group__8974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__OutModelsAssignment_8_in_rule__MappingTransformation__Group__8__Impl1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__9__Impl_in_rule__MappingTransformation__Group__91032 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__10_in_rule__MappingTransformation__Group__91035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group_9__0_in_rule__MappingTransformation__Group__9__Impl1062 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__10__Impl_in_rule__MappingTransformation__Group__101093 = new BitSet(new long[]{0x00000000000A0020L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__11_in_rule__MappingTransformation__Group__101096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MappingTransformation__Group__10__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__11__Impl_in_rule__MappingTransformation__Group__111155 = new BitSet(new long[]{0x00000000000A0020L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__12_in_rule__MappingTransformation__Group__111158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__ExternalsAssignment_11_in_rule__MappingTransformation__Group__11__Impl1185 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__12__Impl_in_rule__MappingTransformation__Group__121216 = new BitSet(new long[]{0x00000000000A0020L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__13_in_rule__MappingTransformation__Group__121219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__CompositesAssignment_12_in_rule__MappingTransformation__Group__12__Impl1246 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__13__Impl_in_rule__MappingTransformation__Group__131277 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__14_in_rule__MappingTransformation__Group__131280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__ExecutionsAssignment_13_in_rule__MappingTransformation__Group__13__Impl1309 = new BitSet(new long[]{0x00000000000A0022L});
        public static final BitSet FOLLOW_rule__MappingTransformation__ExecutionsAssignment_13_in_rule__MappingTransformation__Group__13__Impl1321 = new BitSet(new long[]{0x00000000000A0022L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__14__Impl_in_rule__MappingTransformation__Group__141354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MappingTransformation__Group__14__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group_4__0__Impl_in_rule__MappingTransformation__Group_4__01443 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group_4__1_in_rule__MappingTransformation__Group_4__01446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MappingTransformation__Group_4__0__Impl1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group_4__1__Impl_in_rule__MappingTransformation__Group_4__11505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__InModelsAssignment_4_1_in_rule__MappingTransformation__Group_4__1__Impl1532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group_9__0__Impl_in_rule__MappingTransformation__Group_9__01566 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group_9__1_in_rule__MappingTransformation__Group_9__01569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MappingTransformation__Group_9__0__Impl1597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group_9__1__Impl_in_rule__MappingTransformation__Group_9__11628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__OutModelsAssignment_9_1_in_rule__MappingTransformation__Group_9__1__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__0__Impl_in_rule__TransformationDefinitionParameter__Group__01689 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__1_in_rule__TransformationDefinitionParameter__Group__01692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__1__Impl_in_rule__TransformationDefinitionParameter__Group__11750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__NameAssignment_1_in_rule__TransformationDefinitionParameter__Group__1__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__0__Impl_in_rule__CompositeTransformation__Group__01811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__1_in_rule__CompositeTransformation__Group__01814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CompositeTransformation__Group__0__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__1__Impl_in_rule__CompositeTransformation__Group__11873 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__2_in_rule__CompositeTransformation__Group__11876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__NameAssignment_1_in_rule__CompositeTransformation__Group__1__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__2__Impl_in_rule__CompositeTransformation__Group__21933 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__3_in_rule__CompositeTransformation__Group__21936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CompositeTransformation__Group__2__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__3__Impl_in_rule__CompositeTransformation__Group__31995 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__4_in_rule__CompositeTransformation__Group__31998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__InModelsAssignment_3_in_rule__CompositeTransformation__Group__3__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__4__Impl_in_rule__CompositeTransformation__Group__42056 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__5_in_rule__CompositeTransformation__Group__42059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group_4__0_in_rule__CompositeTransformation__Group__4__Impl2086 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__5__Impl_in_rule__CompositeTransformation__Group__52117 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__6_in_rule__CompositeTransformation__Group__52120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CompositeTransformation__Group__5__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__6__Impl_in_rule__CompositeTransformation__Group__62179 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__7_in_rule__CompositeTransformation__Group__62182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__CompositeTransformation__Group__6__Impl2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__7__Impl_in_rule__CompositeTransformation__Group__72241 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__8_in_rule__CompositeTransformation__Group__72244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CompositeTransformation__Group__7__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__8__Impl_in_rule__CompositeTransformation__Group__82303 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__9_in_rule__CompositeTransformation__Group__82306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__OutModelsAssignment_8_in_rule__CompositeTransformation__Group__8__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__9__Impl_in_rule__CompositeTransformation__Group__92364 = new BitSet(new long[]{0x0000000000012030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__10_in_rule__CompositeTransformation__Group__92367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group_9__0_in_rule__CompositeTransformation__Group__9__Impl2394 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__10__Impl_in_rule__CompositeTransformation__Group__102425 = new BitSet(new long[]{0x00000000000A0020L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__11_in_rule__CompositeTransformation__Group__102428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CompositeTransformation__Group__10__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__11__Impl_in_rule__CompositeTransformation__Group__112487 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__12_in_rule__CompositeTransformation__Group__112490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__ExecutionsAssignment_11_in_rule__CompositeTransformation__Group__11__Impl2519 = new BitSet(new long[]{0x00000000000A0022L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__ExecutionsAssignment_11_in_rule__CompositeTransformation__Group__11__Impl2531 = new BitSet(new long[]{0x00000000000A0022L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group__12__Impl_in_rule__CompositeTransformation__Group__122564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__CompositeTransformation__Group__12__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group_4__0__Impl_in_rule__CompositeTransformation__Group_4__02649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group_4__1_in_rule__CompositeTransformation__Group_4__02652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CompositeTransformation__Group_4__0__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group_4__1__Impl_in_rule__CompositeTransformation__Group_4__12711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__InModelsAssignment_4_1_in_rule__CompositeTransformation__Group_4__1__Impl2738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group_9__0__Impl_in_rule__CompositeTransformation__Group_9__02772 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group_9__1_in_rule__CompositeTransformation__Group_9__02775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CompositeTransformation__Group_9__0__Impl2803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__Group_9__1__Impl_in_rule__CompositeTransformation__Group_9__12834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeTransformation__OutModelsAssignment_9_1_in_rule__CompositeTransformation__Group_9__1__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__0__Impl_in_rule__TransformationExecution__Group__02895 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__1_in_rule__TransformationExecution__Group__02898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__OutputModelsAssignment_0_in_rule__TransformationExecution__Group__0__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__1__Impl_in_rule__TransformationExecution__Group__12955 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__2_in_rule__TransformationExecution__Group__12958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group_1__0_in_rule__TransformationExecution__Group__1__Impl2985 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__2__Impl_in_rule__TransformationExecution__Group__23016 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__3_in_rule__TransformationExecution__Group__23019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TransformationExecution__Group__2__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__3__Impl_in_rule__TransformationExecution__Group__33078 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__4_in_rule__TransformationExecution__Group__33081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__TransformationAssignment_3_in_rule__TransformationExecution__Group__3__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__4__Impl_in_rule__TransformationExecution__Group__43138 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__5_in_rule__TransformationExecution__Group__43141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TransformationExecution__Group__4__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__5__Impl_in_rule__TransformationExecution__Group__53200 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__6_in_rule__TransformationExecution__Group__53203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__InputModelsAssignment_5_in_rule__TransformationExecution__Group__5__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__6__Impl_in_rule__TransformationExecution__Group__63260 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__7_in_rule__TransformationExecution__Group__63263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group_6__0_in_rule__TransformationExecution__Group__6__Impl3290 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group__7__Impl_in_rule__TransformationExecution__Group__73321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TransformationExecution__Group__7__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group_1__0__Impl_in_rule__TransformationExecution__Group_1__03396 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group_1__1_in_rule__TransformationExecution__Group_1__03399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TransformationExecution__Group_1__0__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group_1__1__Impl_in_rule__TransformationExecution__Group_1__13458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__OutputModelsAssignment_1_1_in_rule__TransformationExecution__Group_1__1__Impl3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group_6__0__Impl_in_rule__TransformationExecution__Group_6__03519 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group_6__1_in_rule__TransformationExecution__Group_6__03522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TransformationExecution__Group_6__0__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__Group_6__1__Impl_in_rule__TransformationExecution__Group_6__13581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationExecution__InputModelsAssignment_6_1_in_rule__TransformationExecution__Group_6__1__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExternalTransformation__Group__0__Impl_in_rule__ExternalTransformation__Group__03642 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExternalTransformation__Group__1_in_rule__ExternalTransformation__Group__03645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ExternalTransformation__Group__0__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExternalTransformation__Group__1__Impl_in_rule__ExternalTransformation__Group__13704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExternalTransformation__NameAssignment_1_in_rule__ExternalTransformation__Group__1__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MappingTransformation__NameAssignment_13771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__InModelsAssignment_33802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__InModelsAssignment_4_13833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__OutModelsAssignment_83864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__OutModelsAssignment_9_13895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExternalTransformation_in_rule__MappingTransformation__ExternalsAssignment_113926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeTransformation_in_rule__MappingTransformation__CompositesAssignment_123957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationExecution_in_rule__MappingTransformation__ExecutionsAssignment_133988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TransformationDefinitionParameter__NameAssignment_14019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CompositeTransformation__NameAssignment_14050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__CompositeTransformation__InModelsAssignment_34081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__CompositeTransformation__InModelsAssignment_4_14112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__CompositeTransformation__OutModelsAssignment_84143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__CompositeTransformation__OutModelsAssignment_9_14174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationExecution_in_rule__CompositeTransformation__ExecutionsAssignment_114205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TransformationExecution__OutputModelsAssignment_04240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TransformationExecution__OutputModelsAssignment_1_14279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TransformationExecution__TransformationAssignment_34318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TransformationExecution__InputModelsAssignment_54357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TransformationExecution__InputModelsAssignment_6_14396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExternalTransformation__NameAssignment_14431 = new BitSet(new long[]{0x0000000000000002L});
    }


}