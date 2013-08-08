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
import org.eclectic.frontend.services.KoanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKoanParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_KEYWORD_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'koan'", "'('", "')'", "'->'", "'trace'", "'end'", "'link'", "'{'", "'}'", "';'", "':'", "'var'", "'!'", "'.'", "'='", "'|'", "','", "'match'", "'with'", "'['", "']'", "'put'", "'rule'", "'forAll'"
    };
    public static final int RULE_KEYWORD_ID=7;
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalKoanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKoanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKoanParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g"; }


     
     	private KoanGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KoanGrammarAccess grammarAccess) {
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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:61:1: entryRuleMappingTransformation : ruleMappingTransformation EOF ;
    public final void entryRuleMappingTransformation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:62:1: ( ruleMappingTransformation EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:63:1: ruleMappingTransformation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation67);
            ruleMappingTransformation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMappingTransformation74); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:70:1: ruleMappingTransformation : ( ( rule__MappingTransformation__Group__0 ) ) ;
    public final void ruleMappingTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:74:2: ( ( ( rule__MappingTransformation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:75:1: ( ( rule__MappingTransformation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:75:1: ( ( rule__MappingTransformation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:76:1: ( rule__MappingTransformation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:77:1: ( rule__MappingTransformation__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:77:2: rule__MappingTransformation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__0_in_ruleMappingTransformation100);
            rule__MappingTransformation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getGroup()); 
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
    // $ANTLR end "ruleMappingTransformation"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:89:1: entryRuleTransformationDefinitionParameter : ruleTransformationDefinitionParameter EOF ;
    public final void entryRuleTransformationDefinitionParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:90:1: ( ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:91:1: ruleTransformationDefinitionParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter127);
            ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationDefinitionParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter134); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:98:1: ruleTransformationDefinitionParameter : ( ( rule__TransformationDefinitionParameter__Group__0 ) ) ;
    public final void ruleTransformationDefinitionParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:102:2: ( ( ( rule__TransformationDefinitionParameter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:103:1: ( ( rule__TransformationDefinitionParameter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:103:1: ( ( rule__TransformationDefinitionParameter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:104:1: ( rule__TransformationDefinitionParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:105:1: ( rule__TransformationDefinitionParameter__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:105:2: rule__TransformationDefinitionParameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__0_in_ruleTransformationDefinitionParameter160);
            rule__TransformationDefinitionParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationDefinitionParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleTransformationDefinitionParameter"


    // $ANTLR start "entryRuleTraceInterface"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:117:1: entryRuleTraceInterface : ruleTraceInterface EOF ;
    public final void entryRuleTraceInterface() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:118:1: ( ruleTraceInterface EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:119:1: ruleTraceInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceInterface_in_entryRuleTraceInterface187);
            ruleTraceInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceInterface194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTraceInterface"


    // $ANTLR start "ruleTraceInterface"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:126:1: ruleTraceInterface : ( ( rule__TraceInterface__Group__0 ) ) ;
    public final void ruleTraceInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:130:2: ( ( ( rule__TraceInterface__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:131:1: ( ( rule__TraceInterface__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:131:1: ( ( rule__TraceInterface__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:132:1: ( rule__TraceInterface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:133:1: ( rule__TraceInterface__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:133:2: rule__TraceInterface__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__0_in_ruleTraceInterface220);
            rule__TraceInterface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getGroup()); 
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
    // $ANTLR end "ruleTraceInterface"


    // $ANTLR start "entryRuleTraceDefinition"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:145:1: entryRuleTraceDefinition : ruleTraceDefinition EOF ;
    public final void entryRuleTraceDefinition() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:146:1: ( ruleTraceDefinition EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:147:1: ruleTraceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition247);
            ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceDefinition254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTraceDefinition"


    // $ANTLR start "ruleTraceDefinition"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:154:1: ruleTraceDefinition : ( ( rule__TraceDefinition__Group__0 ) ) ;
    public final void ruleTraceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:158:2: ( ( ( rule__TraceDefinition__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:159:1: ( ( rule__TraceDefinition__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:159:1: ( ( rule__TraceDefinition__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:160:1: ( rule__TraceDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:161:1: ( rule__TraceDefinition__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:161:2: rule__TraceDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__0_in_ruleTraceDefinition280);
            rule__TraceDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleTraceDefinition"


    // $ANTLR start "entryRuleTraceElementInline"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:173:1: entryRuleTraceElementInline : ruleTraceElementInline EOF ;
    public final void entryRuleTraceElementInline() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:174:1: ( ruleTraceElementInline EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:175:1: ruleTraceElementInline EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline307);
            ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementInline314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTraceElementInline"


    // $ANTLR start "ruleTraceElementInline"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:182:1: ruleTraceElementInline : ( ( rule__TraceElementInline__Group__0 ) ) ;
    public final void ruleTraceElementInline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:186:2: ( ( ( rule__TraceElementInline__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:187:1: ( ( rule__TraceElementInline__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:187:1: ( ( rule__TraceElementInline__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:188:1: ( rule__TraceElementInline__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:189:1: ( rule__TraceElementInline__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:189:2: rule__TraceElementInline__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__0_in_ruleTraceElementInline340);
            rule__TraceElementInline__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineAccess().getGroup()); 
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
    // $ANTLR end "ruleTraceElementInline"


    // $ANTLR start "entryRuleTraceElementExpanded"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:201:1: entryRuleTraceElementExpanded : ruleTraceElementExpanded EOF ;
    public final void entryRuleTraceElementExpanded() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:202:1: ( ruleTraceElementExpanded EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:203:1: ruleTraceElementExpanded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded367);
            ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementExpanded374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTraceElementExpanded"


    // $ANTLR start "ruleTraceElementExpanded"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:210:1: ruleTraceElementExpanded : ( ( rule__TraceElementExpanded__Group__0 ) ) ;
    public final void ruleTraceElementExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:214:2: ( ( ( rule__TraceElementExpanded__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:215:1: ( ( rule__TraceElementExpanded__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:215:1: ( ( rule__TraceElementExpanded__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:216:1: ( rule__TraceElementExpanded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:217:1: ( rule__TraceElementExpanded__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:217:2: rule__TraceElementExpanded__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__0_in_ruleTraceElementExpanded400);
            rule__TraceElementExpanded__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedAccess().getGroup()); 
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
    // $ANTLR end "ruleTraceElementExpanded"


    // $ANTLR start "entryRuleTypeExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:229:1: entryRuleTypeExpression : ruleTypeExpression EOF ;
    public final void entryRuleTypeExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:230:1: ( ruleTypeExpression EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:231:1: ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression427);
            ruleTypeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpression434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:238:1: ruleTypeExpression : ( ruleClassUse ) ;
    public final void ruleTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:242:2: ( ( ruleClassUse ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:243:1: ( ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:243:1: ( ruleClassUse )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:244:1: ruleClassUse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTypeExpression460);
            ruleClassUse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
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
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleClassUse"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:257:1: entryRuleClassUse : ruleClassUse EOF ;
    public final void entryRuleClassUse() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:258:1: ( ruleClassUse EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:259:1: ruleClassUse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_entryRuleClassUse486);
            ruleClassUse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassUse493); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClassUse"


    // $ANTLR start "ruleClassUse"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:266:1: ruleClassUse : ( ( rule__ClassUse__Group__0 ) ) ;
    public final void ruleClassUse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:270:2: ( ( ( rule__ClassUse__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:271:1: ( ( rule__ClassUse__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:271:1: ( ( rule__ClassUse__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:272:1: ( rule__ClassUse__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:273:1: ( rule__ClassUse__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:273:2: rule__ClassUse__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__0_in_ruleClassUse519);
            rule__ClassUse__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getGroup()); 
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
    // $ANTLR end "ruleClassUse"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:285:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:286:1: ( ruleStatement EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:287:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement546);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement553); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:294:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:298:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:299:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:299:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:300:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:301:1: ( rule__Statement__Alternatives )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:301:2: rule__Statement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statement__Alternatives_in_ruleStatement579);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePropertyWrite"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:313:1: entryRulePropertyWrite : rulePropertyWrite EOF ;
    public final void entryRulePropertyWrite() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:314:1: ( rulePropertyWrite EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:315:1: rulePropertyWrite EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite606);
            rulePropertyWrite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyWrite613); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyWrite"


    // $ANTLR start "rulePropertyWrite"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:322:1: rulePropertyWrite : ( ( rule__PropertyWrite__Group__0 ) ) ;
    public final void rulePropertyWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:326:2: ( ( ( rule__PropertyWrite__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:327:1: ( ( rule__PropertyWrite__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:327:1: ( ( rule__PropertyWrite__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:328:1: ( rule__PropertyWrite__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:329:1: ( rule__PropertyWrite__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:329:2: rule__PropertyWrite__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__0_in_rulePropertyWrite639);
            rule__PropertyWrite__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getGroup()); 
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
    // $ANTLR end "rulePropertyWrite"


    // $ANTLR start "entryRuleDefineVariable"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:341:1: entryRuleDefineVariable : ruleDefineVariable EOF ;
    public final void entryRuleDefineVariable() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:342:1: ( ruleDefineVariable EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:343:1: ruleDefineVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable666);
            ruleDefineVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefineVariable673); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDefineVariable"


    // $ANTLR start "ruleDefineVariable"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:350:1: ruleDefineVariable : ( ( rule__DefineVariable__Group__0 ) ) ;
    public final void ruleDefineVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:354:2: ( ( ( rule__DefineVariable__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:355:1: ( ( rule__DefineVariable__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:355:1: ( ( rule__DefineVariable__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:356:1: ( rule__DefineVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:357:1: ( rule__DefineVariable__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:357:2: rule__DefineVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__0_in_ruleDefineVariable699);
            rule__DefineVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableAccess().getGroup()); 
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
    // $ANTLR end "ruleDefineVariable"


    // $ANTLR start "entryRuleModelReference"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:369:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:370:1: ( ruleModelReference EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:371:1: ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_entryRuleModelReference726);
            ruleModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelReference733); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModelReference"


    // $ANTLR start "ruleModelReference"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:378:1: ruleModelReference : ( ( rule__ModelReference__Group__0 ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:382:2: ( ( ( rule__ModelReference__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:383:1: ( ( rule__ModelReference__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:383:1: ( ( rule__ModelReference__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:384:1: ( rule__ModelReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:385:1: ( rule__ModelReference__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:385:2: rule__ModelReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__0_in_ruleModelReference759);
            rule__ModelReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleModelReference"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:397:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:398:1: ( ruleExpression EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:399:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression786);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression793); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:406:1: ruleExpression : ( ruleMethodCall ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:410:2: ( ( ruleMethodCall ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:411:1: ( ruleMethodCall )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:411:1: ( ruleMethodCall )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:412:1: ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_ruleExpression819);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:425:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:426:1: ( rulePrimaryExpression EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:427:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression845);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression852); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:434:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:438:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:439:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:439:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:440:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:441:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:441:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression878);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:453:1: entryRuleParenthesizedExpression : ruleParenthesizedExpression EOF ;
    public final void entryRuleParenthesizedExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:454:1: ( ruleParenthesizedExpression EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:455:1: ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression905);
            ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedExpression912); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:462:1: ruleParenthesizedExpression : ( ( rule__ParenthesizedExpression__Group__0 ) ) ;
    public final void ruleParenthesizedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:466:2: ( ( ( rule__ParenthesizedExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:467:1: ( ( rule__ParenthesizedExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:467:1: ( ( rule__ParenthesizedExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:468:1: ( rule__ParenthesizedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:469:1: ( rule__ParenthesizedExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:469:2: rule__ParenthesizedExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__0_in_ruleParenthesizedExpression938);
            rule__ParenthesizedExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:481:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:482:1: ( ruleLiteral EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:483:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral965);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral972); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:490:1: ruleLiteral : ( ruleNumLiteral ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:494:2: ( ( ruleNumLiteral ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:495:1: ( ruleNumLiteral )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:495:1: ( ruleNumLiteral )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:496:1: ruleNumLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_ruleLiteral998);
            ruleNumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall()); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:509:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:510:1: ( ruleVariableReference EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:511:1: ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference1024);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference1031); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:518:1: ruleVariableReference : ( ( rule__VariableReference__VariableAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:522:2: ( ( ( rule__VariableReference__VariableAssignment ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:523:1: ( ( rule__VariableReference__VariableAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:523:1: ( ( rule__VariableReference__VariableAssignment ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:524:1: ( rule__VariableReference__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:525:1: ( rule__VariableReference__VariableAssignment )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:525:2: rule__VariableReference__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference1057);
            rule__VariableReference__VariableAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleClosureDeclaration"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:537:1: entryRuleClosureDeclaration : ruleClosureDeclaration EOF ;
    public final void entryRuleClosureDeclaration() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:538:1: ( ruleClosureDeclaration EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:539:1: ruleClosureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration1084);
            ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureDeclaration1091); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClosureDeclaration"


    // $ANTLR start "ruleClosureDeclaration"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:546:1: ruleClosureDeclaration : ( ( rule__ClosureDeclaration__Group__0 ) ) ;
    public final void ruleClosureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:550:2: ( ( ( rule__ClosureDeclaration__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:551:1: ( ( rule__ClosureDeclaration__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:551:1: ( ( rule__ClosureDeclaration__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:552:1: ( rule__ClosureDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:553:1: ( rule__ClosureDeclaration__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:553:2: rule__ClosureDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__0_in_ruleClosureDeclaration1117);
            rule__ClosureDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleClosureDeclaration"


    // $ANTLR start "entryRuleClosureParameter"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:565:1: entryRuleClosureParameter : ruleClosureParameter EOF ;
    public final void entryRuleClosureParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:566:1: ( ruleClosureParameter EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:567:1: ruleClosureParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter1144);
            ruleClosureParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureParameter1151); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClosureParameter"


    // $ANTLR start "ruleClosureParameter"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:574:1: ruleClosureParameter : ( ( rule__ClosureParameter__NameAssignment ) ) ;
    public final void ruleClosureParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:578:2: ( ( ( rule__ClosureParameter__NameAssignment ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:579:1: ( ( rule__ClosureParameter__NameAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:579:1: ( ( rule__ClosureParameter__NameAssignment ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:580:1: ( rule__ClosureParameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterAccess().getNameAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:581:1: ( rule__ClosureParameter__NameAssignment )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:581:2: rule__ClosureParameter__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureParameter__NameAssignment_in_ruleClosureParameter1177);
            rule__ClosureParameter__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureParameterAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleClosureParameter"


    // $ANTLR start "entryRuleMethodCall"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:593:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:594:1: ( ruleMethodCall EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:595:1: ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_entryRuleMethodCall1204);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodCall1211); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:602:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:606:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:607:1: ( ( rule__MethodCall__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:607:1: ( ( rule__MethodCall__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:608:1: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:609:1: ( rule__MethodCall__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:609:2: rule__MethodCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall1237);
            rule__MethodCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup()); 
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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleKeywordParameter"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:621:1: entryRuleKeywordParameter : ruleKeywordParameter EOF ;
    public final void entryRuleKeywordParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:622:1: ( ruleKeywordParameter EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:623:1: ruleKeywordParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeywordParameter_in_entryRuleKeywordParameter1264);
            ruleKeywordParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeywordParameter1271); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKeywordParameter"


    // $ANTLR start "ruleKeywordParameter"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:630:1: ruleKeywordParameter : ( ( rule__KeywordParameter__Group__0 ) ) ;
    public final void ruleKeywordParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:634:2: ( ( ( rule__KeywordParameter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:635:1: ( ( rule__KeywordParameter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:635:1: ( ( rule__KeywordParameter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:636:1: ( rule__KeywordParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordParameterAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:637:1: ( rule__KeywordParameter__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:637:2: rule__KeywordParameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeywordParameter__Group__0_in_ruleKeywordParameter1297);
            rule__KeywordParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleKeywordParameter"


    // $ANTLR start "entryRuleMatchTraceExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:649:1: entryRuleMatchTraceExpression : ruleMatchTraceExpression EOF ;
    public final void entryRuleMatchTraceExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:650:1: ( ruleMatchTraceExpression EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:651:1: ruleMatchTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression1324);
            ruleMatchTraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchTraceExpression1331); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMatchTraceExpression"


    // $ANTLR start "ruleMatchTraceExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:658:1: ruleMatchTraceExpression : ( ( rule__MatchTraceExpression__Group__0 ) ) ;
    public final void ruleMatchTraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:662:2: ( ( ( rule__MatchTraceExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:663:1: ( ( rule__MatchTraceExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:663:1: ( ( rule__MatchTraceExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:664:1: ( rule__MatchTraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:665:1: ( rule__MatchTraceExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:665:2: rule__MatchTraceExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__0_in_ruleMatchTraceExpression1357);
            rule__MatchTraceExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleMatchTraceExpression"


    // $ANTLR start "entryRuleTraceExprLanguage"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:677:1: entryRuleTraceExprLanguage : ruleTraceExprLanguage EOF ;
    public final void entryRuleTraceExprLanguage() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:678:1: ( ruleTraceExprLanguage EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:679:1: ruleTraceExprLanguage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage1384);
            ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceExprLanguage1391); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTraceExprLanguage"


    // $ANTLR start "ruleTraceExprLanguage"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:686:1: ruleTraceExprLanguage : ( ( rule__TraceExprLanguage__Group__0 ) ) ;
    public final void ruleTraceExprLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:690:2: ( ( ( rule__TraceExprLanguage__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:691:1: ( ( rule__TraceExprLanguage__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:691:1: ( ( rule__TraceExprLanguage__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:692:1: ( rule__TraceExprLanguage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:693:1: ( rule__TraceExprLanguage__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:693:2: rule__TraceExprLanguage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__0_in_ruleTraceExprLanguage1417);
            rule__TraceExprLanguage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageAccess().getGroup()); 
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
    // $ANTLR end "ruleTraceExprLanguage"


    // $ANTLR start "entryRulePutTraceExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:705:1: entryRulePutTraceExpression : rulePutTraceExpression EOF ;
    public final void entryRulePutTraceExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:706:1: ( rulePutTraceExpression EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:707:1: rulePutTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression1444);
            rulePutTraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceExpression1451); if (state.failed) return ;

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
    // $ANTLR end "entryRulePutTraceExpression"


    // $ANTLR start "rulePutTraceExpression"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:714:1: rulePutTraceExpression : ( ( rule__PutTraceExpression__Group__0 ) ) ;
    public final void rulePutTraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:718:2: ( ( ( rule__PutTraceExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:719:1: ( ( rule__PutTraceExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:719:1: ( ( rule__PutTraceExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:720:1: ( rule__PutTraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:721:1: ( rule__PutTraceExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:721:2: rule__PutTraceExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__0_in_rulePutTraceExpression1477);
            rule__PutTraceExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getGroup()); 
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
    // $ANTLR end "rulePutTraceExpression"


    // $ANTLR start "entryRulePutTraceParameter"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:733:1: entryRulePutTraceParameter : rulePutTraceParameter EOF ;
    public final void entryRulePutTraceParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:734:1: ( rulePutTraceParameter EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:735:1: rulePutTraceParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter1504);
            rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceParameter1511); if (state.failed) return ;

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
    // $ANTLR end "entryRulePutTraceParameter"


    // $ANTLR start "rulePutTraceParameter"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:742:1: rulePutTraceParameter : ( ( rule__PutTraceParameter__Group__0 ) ) ;
    public final void rulePutTraceParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:746:2: ( ( ( rule__PutTraceParameter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:747:1: ( ( rule__PutTraceParameter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:747:1: ( ( rule__PutTraceParameter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:748:1: ( rule__PutTraceParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:749:1: ( rule__PutTraceParameter__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:749:2: rule__PutTraceParameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__0_in_rulePutTraceParameter1537);
            rule__PutTraceParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterAccess().getGroup()); 
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
    // $ANTLR end "rulePutTraceParameter"


    // $ANTLR start "entryRuleNumLiteral"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:761:1: entryRuleNumLiteral : ruleNumLiteral EOF ;
    public final void entryRuleNumLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:762:1: ( ruleNumLiteral EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:763:1: ruleNumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral1564);
            ruleNumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumLiteral1571); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumLiteral"


    // $ANTLR start "ruleNumLiteral"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:770:1: ruleNumLiteral : ( ( rule__NumLiteral__ValueAssignment ) ) ;
    public final void ruleNumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:774:2: ( ( ( rule__NumLiteral__ValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:775:1: ( ( rule__NumLiteral__ValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:775:1: ( ( rule__NumLiteral__ValueAssignment ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:776:1: ( rule__NumLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:777:1: ( rule__NumLiteral__ValueAssignment )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:777:2: rule__NumLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumLiteral__ValueAssignment_in_ruleNumLiteral1597);
            rule__NumLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleNumLiteral"


    // $ANTLR start "entryRuleKoanRule"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:789:1: entryRuleKoanRule : ruleKoanRule EOF ;
    public final void entryRuleKoanRule() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:790:1: ( ruleKoanRule EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:791:1: ruleKoanRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKoanRule_in_entryRuleKoanRule1624);
            ruleKoanRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKoanRule1631); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKoanRule"


    // $ANTLR start "ruleKoanRule"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:798:1: ruleKoanRule : ( ( rule__KoanRule__Group__0 ) ) ;
    public final void ruleKoanRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:802:2: ( ( ( rule__KoanRule__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:803:1: ( ( rule__KoanRule__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:803:1: ( ( rule__KoanRule__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:804:1: ( rule__KoanRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:805:1: ( rule__KoanRule__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:805:2: rule__KoanRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__0_in_ruleKoanRule1657);
            rule__KoanRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getGroup()); 
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
    // $ANTLR end "ruleKoanRule"


    // $ANTLR start "entryRuleMatcher"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:817:1: entryRuleMatcher : ruleMatcher EOF ;
    public final void entryRuleMatcher() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:818:1: ( ruleMatcher EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:819:1: ruleMatcher EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatcherRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatcher_in_entryRuleMatcher1684);
            ruleMatcher();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatcherRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatcher1691); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMatcher"


    // $ANTLR start "ruleMatcher"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:826:1: ruleMatcher : ( ruleForAllMatcher ) ;
    public final void ruleMatcher() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:830:2: ( ( ruleForAllMatcher ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:831:1: ( ruleForAllMatcher )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:831:1: ( ruleForAllMatcher )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:832:1: ruleForAllMatcher
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatcherAccess().getForAllMatcherParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForAllMatcher_in_ruleMatcher1717);
            ruleForAllMatcher();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatcherAccess().getForAllMatcherParserRuleCall()); 
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
    // $ANTLR end "ruleMatcher"


    // $ANTLR start "entryRuleForAllMatcher"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:845:1: entryRuleForAllMatcher : ruleForAllMatcher EOF ;
    public final void entryRuleForAllMatcher() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:846:1: ( ruleForAllMatcher EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:847:1: ruleForAllMatcher EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForAllMatcher_in_entryRuleForAllMatcher1743);
            ruleForAllMatcher();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForAllMatcher1750); if (state.failed) return ;

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
    // $ANTLR end "entryRuleForAllMatcher"


    // $ANTLR start "ruleForAllMatcher"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:854:1: ruleForAllMatcher : ( ( rule__ForAllMatcher__Group__0 ) ) ;
    public final void ruleForAllMatcher() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:858:2: ( ( ( rule__ForAllMatcher__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:859:1: ( ( rule__ForAllMatcher__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:859:1: ( ( rule__ForAllMatcher__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:860:1: ( rule__ForAllMatcher__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:861:1: ( rule__ForAllMatcher__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:861:2: rule__ForAllMatcher__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__0_in_ruleForAllMatcher1776);
            rule__ForAllMatcher__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getGroup()); 
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
    // $ANTLR end "ruleForAllMatcher"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:873:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:874:1: ( ruleEString EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:875:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1803);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1810); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:882:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:886:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:887:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:887:1: ( ( rule__EString__Alternatives ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:888:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:889:1: ( rule__EString__Alternatives )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:889:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1836);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:901:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:902:1: ( ruleEInt EOF )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:903:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1863);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1870); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:910:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:914:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:915:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:915:1: ( ( rule__EInt__Group__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:916:1: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:917:1: ( rule__EInt__Group__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:917:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1896);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleBinaryOp"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:930:1: ruleBinaryOp : ( ( rule__BinaryOp__Alternatives ) ) ;
    public final void ruleBinaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:934:1: ( ( ( rule__BinaryOp__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:935:1: ( ( rule__BinaryOp__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:935:1: ( ( rule__BinaryOp__Alternatives ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:936:1: ( rule__BinaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:937:1: ( rule__BinaryOp__Alternatives )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:937:2: rule__BinaryOp__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOp__Alternatives_in_ruleBinaryOp1933);
            rule__BinaryOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOpAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryOp"


    // $ANTLR start "rule__TraceDefinition__Alternatives_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:948:1: rule__TraceDefinition__Alternatives_2 : ( ( ( rule__TraceDefinition__Group_2_0__0 ) ) | ( ( rule__TraceDefinition__Group_2_1__0 ) ) );
    public final void rule__TraceDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:952:1: ( ( ( rule__TraceDefinition__Group_2_0__0 ) ) | ( ( rule__TraceDefinition__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:953:1: ( ( rule__TraceDefinition__Group_2_0__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:953:1: ( ( rule__TraceDefinition__Group_2_0__0 ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:954:1: ( rule__TraceDefinition__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTraceDefinitionAccess().getGroup_2_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:955:1: ( rule__TraceDefinition__Group_2_0__0 )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:955:2: rule__TraceDefinition__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__0_in_rule__TraceDefinition__Alternatives_21968);
                    rule__TraceDefinition__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTraceDefinitionAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:959:6: ( ( rule__TraceDefinition__Group_2_1__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:959:6: ( ( rule__TraceDefinition__Group_2_1__0 ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:960:1: ( rule__TraceDefinition__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTraceDefinitionAccess().getGroup_2_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:961:1: ( rule__TraceDefinition__Group_2_1__0 )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:961:2: rule__TraceDefinition__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__0_in_rule__TraceDefinition__Alternatives_21986);
                    rule__TraceDefinition__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTraceDefinitionAccess().getGroup_2_1()); 
                    }

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
    // $ANTLR end "rule__TraceDefinition__Alternatives_2"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:970:1: rule__Statement__Alternatives : ( ( ruleDefineVariable ) | ( ruleExpression ) | ( rulePutTraceExpression ) | ( rulePropertyWrite ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:974:1: ( ( ruleDefineVariable ) | ( ruleExpression ) | ( rulePutTraceExpression ) | ( rulePropertyWrite ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==RULE_STRING||LA2_5==RULE_KEYWORD_ID) ) {
                        alt2=2;
                    }
                    else if ( (LA2_5==RULE_ID) ) {
                        int LA2_6 = input.LA(4);

                        if ( (LA2_6==30) ) {
                            alt2=4;
                        }
                        else if ( (LA2_6==EOF||(LA2_6>=RULE_STRING && LA2_6<=RULE_INT)||LA2_6==13||LA2_6==17||LA2_6==21||(LA2_6>=23 && LA2_6<=24)||LA2_6==29||LA2_6==33||LA2_6==37) ) {
                            alt2=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case RULE_INT:
                case 12:
                case 13:
                case 14:
                case 15:
                case 17:
                case 21:
                case 23:
                case 24:
                case 28:
                case 33:
                case 37:
                    {
                    alt2=2;
                    }
                    break;
                case 30:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INT:
            case 13:
            case 17:
            case 23:
            case 33:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:975:1: ( ruleDefineVariable )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:975:1: ( ruleDefineVariable )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:976:1: ruleDefineVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_rule__Statement__Alternatives2019);
                    ruleDefineVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:981:6: ( ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:981:6: ( ruleExpression )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:982:1: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Statement__Alternatives2036);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:987:6: ( rulePutTraceExpression )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:987:6: ( rulePutTraceExpression )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:988:1: rulePutTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPutTraceExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_rule__Statement__Alternatives2053);
                    rulePutTraceExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPutTraceExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:993:6: ( rulePropertyWrite )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:993:6: ( rulePropertyWrite )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:994:1: rulePropertyWrite
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPropertyWriteParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_rule__Statement__Alternatives2070);
                    rulePropertyWrite();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPropertyWriteParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1004:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( ruleVariableReference ) | ( ruleModelReference ) | ( ruleParenthesizedExpression ) | ( ruleMatchTraceExpression ) | ( ruleClosureDeclaration ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1008:1: ( ( ruleLiteral ) | ( ruleVariableReference ) | ( ruleModelReference ) | ( ruleParenthesizedExpression ) | ( ruleMatchTraceExpression ) | ( ruleClosureDeclaration ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 13:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==28) ) {
                    alt3=3;
                }
                else if ( (LA3_2==EOF||(LA3_2>=RULE_STRING && LA3_2<=RULE_KEYWORD_ID)||(LA3_2>=12 && LA3_2<=15)||(LA3_2>=17 && LA3_2<=18)||LA3_2==21||(LA3_2>=23 && LA3_2<=24)||LA3_2==29||(LA3_2>=32 && LA3_2<=33)||(LA3_2>=36 && LA3_2<=37)) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 33:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1009:1: ( ruleLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1009:1: ( ruleLiteral )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1010:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__PrimaryExpression__Alternatives2102);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1015:6: ( ruleVariableReference )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1015:6: ( ruleVariableReference )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1016:1: ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2119);
                    ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1021:6: ( ruleModelReference )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1021:6: ( ruleModelReference )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1022:1: ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_rule__PrimaryExpression__Alternatives2136);
                    ruleModelReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1027:6: ( ruleParenthesizedExpression )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1027:6: ( ruleParenthesizedExpression )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1028:1: ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_rule__PrimaryExpression__Alternatives2153);
                    ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1033:6: ( ruleMatchTraceExpression )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1033:6: ( ruleMatchTraceExpression )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1034:1: ruleMatchTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_rule__PrimaryExpression__Alternatives2170);
                    ruleMatchTraceExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1039:6: ( ruleClosureDeclaration )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1039:6: ( ruleClosureDeclaration )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1040:1: ruleClosureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rule__PrimaryExpression__Alternatives2187);
                    ruleClosureDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__MethodCall__Alternatives_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1050:1: rule__MethodCall__Alternatives_1 : ( ( ( rule__MethodCall__Group_1_0__0 ) ) | ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) ) | ( ( rule__MethodCall__Group_1_2__0 ) ) );
    public final void rule__MethodCall__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1054:1: ( ( ( rule__MethodCall__Group_1_0__0 ) ) | ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) ) | ( ( rule__MethodCall__Group_1_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=15)) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=RULE_STRING && LA5_2<=RULE_ID)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==RULE_KEYWORD_ID) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1055:1: ( ( rule__MethodCall__Group_1_0__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1055:1: ( ( rule__MethodCall__Group_1_0__0 ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1056:1: ( rule__MethodCall__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1057:1: ( rule__MethodCall__Group_1_0__0 )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1057:2: rule__MethodCall__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__0_in_rule__MethodCall__Alternatives_12219);
                    rule__MethodCall__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodCallAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1061:6: ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1061:6: ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1062:1: ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1062:1: ( ( rule__MethodCall__Group_1_1__0 ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1063:1: ( rule__MethodCall__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1064:1: ( rule__MethodCall__Group_1_1__0 )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1064:2: rule__MethodCall__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12239);
                    rule__MethodCall__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }

                    }

                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1067:1: ( ( rule__MethodCall__Group_1_1__0 )* )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1068:1: ( rule__MethodCall__Group_1_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1069:1: ( rule__MethodCall__Group_1_1__0 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==29) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1069:2: rule__MethodCall__Group_1_1__0
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12251);
                    	    rule__MethodCall__Group_1_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1074:6: ( ( rule__MethodCall__Group_1_2__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1074:6: ( ( rule__MethodCall__Group_1_2__0 ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1075:1: ( rule__MethodCall__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_2()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1076:1: ( rule__MethodCall__Group_1_2__0 )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1076:2: rule__MethodCall__Group_1_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_2__0_in_rule__MethodCall__Alternatives_12272);
                    rule__MethodCall__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodCallAccess().getGroup_1_2()); 
                    }

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
    // $ANTLR end "rule__MethodCall__Alternatives_1"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1085:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1089:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1090:1: ( RULE_STRING )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1090:1: ( RULE_STRING )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1091:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2305); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1096:6: ( RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1096:6: ( RULE_ID )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1097:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2322); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

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


    // $ANTLR start "rule__BinaryOp__Alternatives"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1107:1: rule__BinaryOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__BinaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1111:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1112:1: ( ( '+' ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1112:1: ( ( '+' ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1113:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1114:1: ( '+' )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1114:3: '+'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__BinaryOp__Alternatives2355); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1119:6: ( ( '-' ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1119:6: ( ( '-' ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1120:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1121:1: ( '-' )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1121:3: '-'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__BinaryOp__Alternatives2376); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1126:6: ( ( '*' ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1126:6: ( ( '*' ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1127:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1128:1: ( '*' )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1128:3: '*'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__BinaryOp__Alternatives2397); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1133:6: ( ( '/' ) )
                    {
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1133:6: ( ( '/' ) )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1134:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getDIVEnumLiteralDeclaration_3()); 
                    }
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1135:1: ( '/' )
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1135:3: '/'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__BinaryOp__Alternatives2418); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getDIVEnumLiteralDeclaration_3()); 
                    }

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
    // $ANTLR end "rule__BinaryOp__Alternatives"


    // $ANTLR start "rule__MappingTransformation__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1147:1: rule__MappingTransformation__Group__0 : rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1 ;
    public final void rule__MappingTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1151:1: ( rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1152:2: rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__0__Impl_in_rule__MappingTransformation__Group__02451);
            rule__MappingTransformation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__1_in_rule__MappingTransformation__Group__02454);
            rule__MappingTransformation__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1159:1: rule__MappingTransformation__Group__0__Impl : ( 'koan' ) ;
    public final void rule__MappingTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1163:1: ( ( 'koan' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1164:1: ( 'koan' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1164:1: ( 'koan' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1165:1: 'koan'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getKoanKeyword_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MappingTransformation__Group__0__Impl2482); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getKoanKeyword_0()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__0__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1178:1: rule__MappingTransformation__Group__1 : rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2 ;
    public final void rule__MappingTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1182:1: ( rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1183:2: rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__1__Impl_in_rule__MappingTransformation__Group__12513);
            rule__MappingTransformation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__2_in_rule__MappingTransformation__Group__12516);
            rule__MappingTransformation__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1190:1: rule__MappingTransformation__Group__1__Impl : ( ( rule__MappingTransformation__NameAssignment_1 ) ) ;
    public final void rule__MappingTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1194:1: ( ( ( rule__MappingTransformation__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1195:1: ( ( rule__MappingTransformation__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1195:1: ( ( rule__MappingTransformation__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1196:1: ( rule__MappingTransformation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1197:1: ( rule__MappingTransformation__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1197:2: rule__MappingTransformation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__NameAssignment_1_in_rule__MappingTransformation__Group__1__Impl2543);
            rule__MappingTransformation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__1__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1207:1: rule__MappingTransformation__Group__2 : rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3 ;
    public final void rule__MappingTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1211:1: ( rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1212:2: rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__2__Impl_in_rule__MappingTransformation__Group__22573);
            rule__MappingTransformation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__3_in_rule__MappingTransformation__Group__22576);
            rule__MappingTransformation__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1219:1: rule__MappingTransformation__Group__2__Impl : ( '(' ) ;
    public final void rule__MappingTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1223:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1224:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1224:1: ( '(' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1225:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MappingTransformation__Group__2__Impl2604); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__2__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1238:1: rule__MappingTransformation__Group__3 : rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4 ;
    public final void rule__MappingTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1242:1: ( rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1243:2: rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__3__Impl_in_rule__MappingTransformation__Group__32635);
            rule__MappingTransformation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__4_in_rule__MappingTransformation__Group__32638);
            rule__MappingTransformation__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1250:1: rule__MappingTransformation__Group__3__Impl : ( ( rule__MappingTransformation__InModelsAssignment_3 ) ) ;
    public final void rule__MappingTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1254:1: ( ( ( rule__MappingTransformation__InModelsAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1255:1: ( ( rule__MappingTransformation__InModelsAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1255:1: ( ( rule__MappingTransformation__InModelsAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1256:1: ( rule__MappingTransformation__InModelsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getInModelsAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1257:1: ( rule__MappingTransformation__InModelsAssignment_3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1257:2: rule__MappingTransformation__InModelsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__InModelsAssignment_3_in_rule__MappingTransformation__Group__3__Impl2665);
            rule__MappingTransformation__InModelsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getInModelsAssignment_3()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__3__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__4"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1267:1: rule__MappingTransformation__Group__4 : rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5 ;
    public final void rule__MappingTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1271:1: ( rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1272:2: rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__4__Impl_in_rule__MappingTransformation__Group__42695);
            rule__MappingTransformation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__5_in_rule__MappingTransformation__Group__42698);
            rule__MappingTransformation__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1279:1: rule__MappingTransformation__Group__4__Impl : ( ')' ) ;
    public final void rule__MappingTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1283:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1284:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1284:1: ( ')' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1285:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MappingTransformation__Group__4__Impl2726); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__4__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__5"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1298:1: rule__MappingTransformation__Group__5 : rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6 ;
    public final void rule__MappingTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1302:1: ( rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1303:2: rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__5__Impl_in_rule__MappingTransformation__Group__52757);
            rule__MappingTransformation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__6_in_rule__MappingTransformation__Group__52760);
            rule__MappingTransformation__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1310:1: rule__MappingTransformation__Group__5__Impl : ( '->' ) ;
    public final void rule__MappingTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1314:1: ( ( '->' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1315:1: ( '->' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1315:1: ( '->' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1316:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MappingTransformation__Group__5__Impl2788); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__5__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__6"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1329:1: rule__MappingTransformation__Group__6 : rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7 ;
    public final void rule__MappingTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1333:1: ( rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1334:2: rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__6__Impl_in_rule__MappingTransformation__Group__62819);
            rule__MappingTransformation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__7_in_rule__MappingTransformation__Group__62822);
            rule__MappingTransformation__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1341:1: rule__MappingTransformation__Group__6__Impl : ( '(' ) ;
    public final void rule__MappingTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1345:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1346:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1346:1: ( '(' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1347:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MappingTransformation__Group__6__Impl2850); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__6__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__7"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1360:1: rule__MappingTransformation__Group__7 : rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8 ;
    public final void rule__MappingTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1364:1: ( rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1365:2: rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__7__Impl_in_rule__MappingTransformation__Group__72881);
            rule__MappingTransformation__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__8_in_rule__MappingTransformation__Group__72884);
            rule__MappingTransformation__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1372:1: rule__MappingTransformation__Group__7__Impl : ( ( rule__MappingTransformation__OutModelsAssignment_7 ) ) ;
    public final void rule__MappingTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1376:1: ( ( ( rule__MappingTransformation__OutModelsAssignment_7 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1377:1: ( ( rule__MappingTransformation__OutModelsAssignment_7 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1377:1: ( ( rule__MappingTransformation__OutModelsAssignment_7 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1378:1: ( rule__MappingTransformation__OutModelsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_7()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1379:1: ( rule__MappingTransformation__OutModelsAssignment_7 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1379:2: rule__MappingTransformation__OutModelsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__OutModelsAssignment_7_in_rule__MappingTransformation__Group__7__Impl2911);
            rule__MappingTransformation__OutModelsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_7()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__7__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__8"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1389:1: rule__MappingTransformation__Group__8 : rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9 ;
    public final void rule__MappingTransformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1393:1: ( rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1394:2: rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__8__Impl_in_rule__MappingTransformation__Group__82941);
            rule__MappingTransformation__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__9_in_rule__MappingTransformation__Group__82944);
            rule__MappingTransformation__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1401:1: rule__MappingTransformation__Group__8__Impl : ( ')' ) ;
    public final void rule__MappingTransformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1405:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1406:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1406:1: ( ')' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1407:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MappingTransformation__Group__8__Impl2972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_8()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__8__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__9"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1420:1: rule__MappingTransformation__Group__9 : rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10 ;
    public final void rule__MappingTransformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1424:1: ( rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1425:2: rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__9__Impl_in_rule__MappingTransformation__Group__93003);
            rule__MappingTransformation__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__10_in_rule__MappingTransformation__Group__93006);
            rule__MappingTransformation__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1432:1: rule__MappingTransformation__Group__9__Impl : ( ( rule__MappingTransformation__TraceInterfaceAssignment_9 ) ) ;
    public final void rule__MappingTransformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1436:1: ( ( ( rule__MappingTransformation__TraceInterfaceAssignment_9 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1437:1: ( ( rule__MappingTransformation__TraceInterfaceAssignment_9 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1437:1: ( ( rule__MappingTransformation__TraceInterfaceAssignment_9 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1438:1: ( rule__MappingTransformation__TraceInterfaceAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getTraceInterfaceAssignment_9()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1439:1: ( rule__MappingTransformation__TraceInterfaceAssignment_9 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1439:2: rule__MappingTransformation__TraceInterfaceAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__TraceInterfaceAssignment_9_in_rule__MappingTransformation__Group__9__Impl3033);
            rule__MappingTransformation__TraceInterfaceAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getTraceInterfaceAssignment_9()); 
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
    // $ANTLR end "rule__MappingTransformation__Group__9__Impl"


    // $ANTLR start "rule__MappingTransformation__Group__10"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1449:1: rule__MappingTransformation__Group__10 : rule__MappingTransformation__Group__10__Impl ;
    public final void rule__MappingTransformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1453:1: ( rule__MappingTransformation__Group__10__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1454:2: rule__MappingTransformation__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__10__Impl_in_rule__MappingTransformation__Group__103063);
            rule__MappingTransformation__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1460:1: rule__MappingTransformation__Group__10__Impl : ( ( ( rule__MappingTransformation__RulesAssignment_10 ) ) ( ( rule__MappingTransformation__RulesAssignment_10 )* ) ) ;
    public final void rule__MappingTransformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1464:1: ( ( ( ( rule__MappingTransformation__RulesAssignment_10 ) ) ( ( rule__MappingTransformation__RulesAssignment_10 )* ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1465:1: ( ( ( rule__MappingTransformation__RulesAssignment_10 ) ) ( ( rule__MappingTransformation__RulesAssignment_10 )* ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1465:1: ( ( ( rule__MappingTransformation__RulesAssignment_10 ) ) ( ( rule__MappingTransformation__RulesAssignment_10 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1466:1: ( ( rule__MappingTransformation__RulesAssignment_10 ) ) ( ( rule__MappingTransformation__RulesAssignment_10 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1466:1: ( ( rule__MappingTransformation__RulesAssignment_10 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1467:1: ( rule__MappingTransformation__RulesAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getRulesAssignment_10()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1468:1: ( rule__MappingTransformation__RulesAssignment_10 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1468:2: rule__MappingTransformation__RulesAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__RulesAssignment_10_in_rule__MappingTransformation__Group__10__Impl3092);
            rule__MappingTransformation__RulesAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getRulesAssignment_10()); 
            }

            }

            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1471:1: ( ( rule__MappingTransformation__RulesAssignment_10 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1472:1: ( rule__MappingTransformation__RulesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getRulesAssignment_10()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1473:1: ( rule__MappingTransformation__RulesAssignment_10 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1473:2: rule__MappingTransformation__RulesAssignment_10
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__RulesAssignment_10_in_rule__MappingTransformation__Group__10__Impl3104);
            	    rule__MappingTransformation__RulesAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getRulesAssignment_10()); 
            }

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
    // $ANTLR end "rule__MappingTransformation__Group__10__Impl"


    // $ANTLR start "rule__TransformationDefinitionParameter__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1506:1: rule__TransformationDefinitionParameter__Group__0 : rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1 ;
    public final void rule__TransformationDefinitionParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1510:1: ( rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1511:2: rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__0__Impl_in_rule__TransformationDefinitionParameter__Group__03159);
            rule__TransformationDefinitionParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__1_in_rule__TransformationDefinitionParameter__Group__03162);
            rule__TransformationDefinitionParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1518:1: rule__TransformationDefinitionParameter__Group__0__Impl : ( () ) ;
    public final void rule__TransformationDefinitionParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1522:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1523:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1523:1: ( () )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1524:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1525:1: ()
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1527:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0()); 
            }

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1537:1: rule__TransformationDefinitionParameter__Group__1 : rule__TransformationDefinitionParameter__Group__1__Impl ;
    public final void rule__TransformationDefinitionParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1541:1: ( rule__TransformationDefinitionParameter__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1542:2: rule__TransformationDefinitionParameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__1__Impl_in_rule__TransformationDefinitionParameter__Group__13220);
            rule__TransformationDefinitionParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1548:1: rule__TransformationDefinitionParameter__Group__1__Impl : ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) ) ;
    public final void rule__TransformationDefinitionParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1552:1: ( ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1553:1: ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1553:1: ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1554:1: ( rule__TransformationDefinitionParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1555:1: ( rule__TransformationDefinitionParameter__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1555:2: rule__TransformationDefinitionParameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__NameAssignment_1_in_rule__TransformationDefinitionParameter__Group__1__Impl3247);
            rule__TransformationDefinitionParameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationDefinitionParameterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TransformationDefinitionParameter__Group__1__Impl"


    // $ANTLR start "rule__TraceInterface__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1569:1: rule__TraceInterface__Group__0 : rule__TraceInterface__Group__0__Impl rule__TraceInterface__Group__1 ;
    public final void rule__TraceInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1573:1: ( rule__TraceInterface__Group__0__Impl rule__TraceInterface__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1574:2: rule__TraceInterface__Group__0__Impl rule__TraceInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__0__Impl_in_rule__TraceInterface__Group__03281);
            rule__TraceInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__1_in_rule__TraceInterface__Group__03284);
            rule__TraceInterface__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceInterface__Group__0"


    // $ANTLR start "rule__TraceInterface__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1581:1: rule__TraceInterface__Group__0__Impl : ( 'trace' ) ;
    public final void rule__TraceInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1585:1: ( ( 'trace' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1586:1: ( 'trace' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1586:1: ( 'trace' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1587:1: 'trace'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getTraceKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TraceInterface__Group__0__Impl3312); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getTraceKeyword_0()); 
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
    // $ANTLR end "rule__TraceInterface__Group__0__Impl"


    // $ANTLR start "rule__TraceInterface__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1600:1: rule__TraceInterface__Group__1 : rule__TraceInterface__Group__1__Impl rule__TraceInterface__Group__2 ;
    public final void rule__TraceInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1604:1: ( rule__TraceInterface__Group__1__Impl rule__TraceInterface__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1605:2: rule__TraceInterface__Group__1__Impl rule__TraceInterface__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__1__Impl_in_rule__TraceInterface__Group__13343);
            rule__TraceInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__2_in_rule__TraceInterface__Group__13346);
            rule__TraceInterface__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceInterface__Group__1"


    // $ANTLR start "rule__TraceInterface__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1612:1: rule__TraceInterface__Group__1__Impl : ( ( rule__TraceInterface__NameAssignment_1 ) ) ;
    public final void rule__TraceInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1616:1: ( ( ( rule__TraceInterface__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1617:1: ( ( rule__TraceInterface__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1617:1: ( ( rule__TraceInterface__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1618:1: ( rule__TraceInterface__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1619:1: ( rule__TraceInterface__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1619:2: rule__TraceInterface__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__NameAssignment_1_in_rule__TraceInterface__Group__1__Impl3373);
            rule__TraceInterface__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TraceInterface__Group__1__Impl"


    // $ANTLR start "rule__TraceInterface__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1629:1: rule__TraceInterface__Group__2 : rule__TraceInterface__Group__2__Impl rule__TraceInterface__Group__3 ;
    public final void rule__TraceInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1633:1: ( rule__TraceInterface__Group__2__Impl rule__TraceInterface__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1634:2: rule__TraceInterface__Group__2__Impl rule__TraceInterface__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__2__Impl_in_rule__TraceInterface__Group__23403);
            rule__TraceInterface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__3_in_rule__TraceInterface__Group__23406);
            rule__TraceInterface__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceInterface__Group__2"


    // $ANTLR start "rule__TraceInterface__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1641:1: rule__TraceInterface__Group__2__Impl : ( ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* ) ) ;
    public final void rule__TraceInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1645:1: ( ( ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1646:1: ( ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1646:1: ( ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1647:1: ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1647:1: ( ( rule__TraceInterface__DefinitionsAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1648:1: ( rule__TraceInterface__DefinitionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getDefinitionsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1649:1: ( rule__TraceInterface__DefinitionsAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1649:2: rule__TraceInterface__DefinitionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__DefinitionsAssignment_2_in_rule__TraceInterface__Group__2__Impl3435);
            rule__TraceInterface__DefinitionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getDefinitionsAssignment_2()); 
            }

            }

            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1652:1: ( ( rule__TraceInterface__DefinitionsAssignment_2 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1653:1: ( rule__TraceInterface__DefinitionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getDefinitionsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1654:1: ( rule__TraceInterface__DefinitionsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1654:2: rule__TraceInterface__DefinitionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__DefinitionsAssignment_2_in_rule__TraceInterface__Group__2__Impl3447);
            	    rule__TraceInterface__DefinitionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getDefinitionsAssignment_2()); 
            }

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
    // $ANTLR end "rule__TraceInterface__Group__2__Impl"


    // $ANTLR start "rule__TraceInterface__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1665:1: rule__TraceInterface__Group__3 : rule__TraceInterface__Group__3__Impl ;
    public final void rule__TraceInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1669:1: ( rule__TraceInterface__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1670:2: rule__TraceInterface__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__3__Impl_in_rule__TraceInterface__Group__33480);
            rule__TraceInterface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceInterface__Group__3"


    // $ANTLR start "rule__TraceInterface__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1676:1: rule__TraceInterface__Group__3__Impl : ( 'end' ) ;
    public final void rule__TraceInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1680:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1681:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1681:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1682:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getEndKeyword_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TraceInterface__Group__3__Impl3508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getEndKeyword_3()); 
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
    // $ANTLR end "rule__TraceInterface__Group__3__Impl"


    // $ANTLR start "rule__TraceDefinition__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1703:1: rule__TraceDefinition__Group__0 : rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1 ;
    public final void rule__TraceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1707:1: ( rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1708:2: rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__0__Impl_in_rule__TraceDefinition__Group__03547);
            rule__TraceDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__1_in_rule__TraceDefinition__Group__03550);
            rule__TraceDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group__0"


    // $ANTLR start "rule__TraceDefinition__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1715:1: rule__TraceDefinition__Group__0__Impl : ( 'link' ) ;
    public final void rule__TraceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1719:1: ( ( 'link' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1720:1: ( 'link' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1720:1: ( 'link' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1721:1: 'link'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TraceDefinition__Group__0__Impl3578); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0()); 
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
    // $ANTLR end "rule__TraceDefinition__Group__0__Impl"


    // $ANTLR start "rule__TraceDefinition__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1734:1: rule__TraceDefinition__Group__1 : rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2 ;
    public final void rule__TraceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1738:1: ( rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1739:2: rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__1__Impl_in_rule__TraceDefinition__Group__13609);
            rule__TraceDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__2_in_rule__TraceDefinition__Group__13612);
            rule__TraceDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group__1"


    // $ANTLR start "rule__TraceDefinition__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1746:1: rule__TraceDefinition__Group__1__Impl : ( ( rule__TraceDefinition__NameAssignment_1 ) ) ;
    public final void rule__TraceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1750:1: ( ( ( rule__TraceDefinition__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1751:1: ( ( rule__TraceDefinition__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1751:1: ( ( rule__TraceDefinition__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1752:1: ( rule__TraceDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1753:1: ( rule__TraceDefinition__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1753:2: rule__TraceDefinition__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__NameAssignment_1_in_rule__TraceDefinition__Group__1__Impl3639);
            rule__TraceDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TraceDefinition__Group__1__Impl"


    // $ANTLR start "rule__TraceDefinition__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1763:1: rule__TraceDefinition__Group__2 : rule__TraceDefinition__Group__2__Impl ;
    public final void rule__TraceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1767:1: ( rule__TraceDefinition__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1768:2: rule__TraceDefinition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__2__Impl_in_rule__TraceDefinition__Group__23669);
            rule__TraceDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group__2"


    // $ANTLR start "rule__TraceDefinition__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1774:1: rule__TraceDefinition__Group__2__Impl : ( ( rule__TraceDefinition__Alternatives_2 ) ) ;
    public final void rule__TraceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1778:1: ( ( ( rule__TraceDefinition__Alternatives_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1779:1: ( ( rule__TraceDefinition__Alternatives_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1779:1: ( ( rule__TraceDefinition__Alternatives_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1780:1: ( rule__TraceDefinition__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getAlternatives_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1781:1: ( rule__TraceDefinition__Alternatives_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1781:2: rule__TraceDefinition__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Alternatives_2_in_rule__TraceDefinition__Group__2__Impl3696);
            rule__TraceDefinition__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__TraceDefinition__Group__2__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_0__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1797:1: rule__TraceDefinition__Group_2_0__0 : rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1 ;
    public final void rule__TraceDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1801:1: ( rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1802:2: rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__0__Impl_in_rule__TraceDefinition__Group_2_0__03732);
            rule__TraceDefinition__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__1_in_rule__TraceDefinition__Group_2_0__03735);
            rule__TraceDefinition__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_0__0"


    // $ANTLR start "rule__TraceDefinition__Group_2_0__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1809:1: rule__TraceDefinition__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__TraceDefinition__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1813:1: ( ( '{' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1814:1: ( '{' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1814:1: ( '{' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1815:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TraceDefinition__Group_2_0__0__Impl3763); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_0__0__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_0__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1828:1: rule__TraceDefinition__Group_2_0__1 : rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2 ;
    public final void rule__TraceDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1832:1: ( rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1833:2: rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__1__Impl_in_rule__TraceDefinition__Group_2_0__13794);
            rule__TraceDefinition__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__2_in_rule__TraceDefinition__Group_2_0__13797);
            rule__TraceDefinition__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_0__1"


    // $ANTLR start "rule__TraceDefinition__Group_2_0__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1840:1: rule__TraceDefinition__Group_2_0__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) ) ;
    public final void rule__TraceDefinition__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1844:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1845:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1845:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1846:1: ( rule__TraceDefinition__ElementsAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1847:1: ( rule__TraceDefinition__ElementsAssignment_2_0_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1847:2: rule__TraceDefinition__ElementsAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_1_in_rule__TraceDefinition__Group_2_0__1__Impl3824);
            rule__TraceDefinition__ElementsAssignment_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_1()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_0__1__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_0__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1857:1: rule__TraceDefinition__Group_2_0__2 : rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3 ;
    public final void rule__TraceDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1861:1: ( rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1862:2: rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__2__Impl_in_rule__TraceDefinition__Group_2_0__23854);
            rule__TraceDefinition__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__3_in_rule__TraceDefinition__Group_2_0__23857);
            rule__TraceDefinition__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_0__2"


    // $ANTLR start "rule__TraceDefinition__Group_2_0__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1869:1: rule__TraceDefinition__Group_2_0__2__Impl : ( ( rule__TraceDefinition__Group_2_0_2__0 )* ) ;
    public final void rule__TraceDefinition__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1873:1: ( ( ( rule__TraceDefinition__Group_2_0_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1874:1: ( ( rule__TraceDefinition__Group_2_0_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1874:1: ( ( rule__TraceDefinition__Group_2_0_2__0 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1875:1: ( rule__TraceDefinition__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getGroup_2_0_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1876:1: ( rule__TraceDefinition__Group_2_0_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1876:2: rule__TraceDefinition__Group_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__0_in_rule__TraceDefinition__Group_2_0__2__Impl3884);
            	    rule__TraceDefinition__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getGroup_2_0_2()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_0__2__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_0__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1886:1: rule__TraceDefinition__Group_2_0__3 : rule__TraceDefinition__Group_2_0__3__Impl ;
    public final void rule__TraceDefinition__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1890:1: ( rule__TraceDefinition__Group_2_0__3__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1891:2: rule__TraceDefinition__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__3__Impl_in_rule__TraceDefinition__Group_2_0__33915);
            rule__TraceDefinition__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_0__3"


    // $ANTLR start "rule__TraceDefinition__Group_2_0__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1897:1: rule__TraceDefinition__Group_2_0__3__Impl : ( '}' ) ;
    public final void rule__TraceDefinition__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1901:1: ( ( '}' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1902:1: ( '}' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1902:1: ( '}' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1903:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TraceDefinition__Group_2_0__3__Impl3943); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_0__3__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_0_2__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1924:1: rule__TraceDefinition__Group_2_0_2__0 : rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1 ;
    public final void rule__TraceDefinition__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1928:1: ( rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1929:2: rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__0__Impl_in_rule__TraceDefinition__Group_2_0_2__03982);
            rule__TraceDefinition__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__1_in_rule__TraceDefinition__Group_2_0_2__03985);
            rule__TraceDefinition__Group_2_0_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_0_2__0"


    // $ANTLR start "rule__TraceDefinition__Group_2_0_2__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1936:1: rule__TraceDefinition__Group_2_0_2__0__Impl : ( ';' ) ;
    public final void rule__TraceDefinition__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1940:1: ( ( ';' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1941:1: ( ';' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1941:1: ( ';' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1942:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__TraceDefinition__Group_2_0_2__0__Impl4013); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_0_2__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1955:1: rule__TraceDefinition__Group_2_0_2__1 : rule__TraceDefinition__Group_2_0_2__1__Impl ;
    public final void rule__TraceDefinition__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1959:1: ( rule__TraceDefinition__Group_2_0_2__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1960:2: rule__TraceDefinition__Group_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__1__Impl_in_rule__TraceDefinition__Group_2_0_2__14044);
            rule__TraceDefinition__Group_2_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_0_2__1"


    // $ANTLR start "rule__TraceDefinition__Group_2_0_2__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1966:1: rule__TraceDefinition__Group_2_0_2__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) ) ;
    public final void rule__TraceDefinition__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1970:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1971:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1971:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1972:1: ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1973:1: ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1973:2: rule__TraceDefinition__ElementsAssignment_2_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_2_1_in_rule__TraceDefinition__Group_2_0_2__1__Impl4071);
            rule__TraceDefinition__ElementsAssignment_2_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_2_1()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_1__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1987:1: rule__TraceDefinition__Group_2_1__0 : rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1 ;
    public final void rule__TraceDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1991:1: ( rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1992:2: rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__0__Impl_in_rule__TraceDefinition__Group_2_1__04105);
            rule__TraceDefinition__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__1_in_rule__TraceDefinition__Group_2_1__04108);
            rule__TraceDefinition__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_1__0"


    // $ANTLR start "rule__TraceDefinition__Group_2_1__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:1999:1: rule__TraceDefinition__Group_2_1__0__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) ) ;
    public final void rule__TraceDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2003:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2004:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2004:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2005:1: ( rule__TraceDefinition__ElementsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2006:1: ( rule__TraceDefinition__ElementsAssignment_2_1_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2006:2: rule__TraceDefinition__ElementsAssignment_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_0_in_rule__TraceDefinition__Group_2_1__0__Impl4135);
            rule__TraceDefinition__ElementsAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_0()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_1__0__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_1__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2016:1: rule__TraceDefinition__Group_2_1__1 : rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2 ;
    public final void rule__TraceDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2020:1: ( rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2021:2: rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__1__Impl_in_rule__TraceDefinition__Group_2_1__14165);
            rule__TraceDefinition__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__2_in_rule__TraceDefinition__Group_2_1__14168);
            rule__TraceDefinition__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_1__1"


    // $ANTLR start "rule__TraceDefinition__Group_2_1__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2028:1: rule__TraceDefinition__Group_2_1__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* ) ;
    public final void rule__TraceDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2032:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2033:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2033:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2034:1: ( rule__TraceDefinition__ElementsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2035:1: ( rule__TraceDefinition__ElementsAssignment_2_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2035:2: rule__TraceDefinition__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_1_in_rule__TraceDefinition__Group_2_1__1__Impl4195);
            	    rule__TraceDefinition__ElementsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_1()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_1__1__Impl"


    // $ANTLR start "rule__TraceDefinition__Group_2_1__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2045:1: rule__TraceDefinition__Group_2_1__2 : rule__TraceDefinition__Group_2_1__2__Impl ;
    public final void rule__TraceDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2049:1: ( rule__TraceDefinition__Group_2_1__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2050:2: rule__TraceDefinition__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__2__Impl_in_rule__TraceDefinition__Group_2_1__24226);
            rule__TraceDefinition__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceDefinition__Group_2_1__2"


    // $ANTLR start "rule__TraceDefinition__Group_2_1__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2056:1: rule__TraceDefinition__Group_2_1__2__Impl : ( 'end' ) ;
    public final void rule__TraceDefinition__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2060:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2061:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2061:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2062:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getEndKeyword_2_1_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TraceDefinition__Group_2_1__2__Impl4254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getEndKeyword_2_1_2()); 
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
    // $ANTLR end "rule__TraceDefinition__Group_2_1__2__Impl"


    // $ANTLR start "rule__TraceElementInline__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2081:1: rule__TraceElementInline__Group__0 : rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1 ;
    public final void rule__TraceElementInline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2085:1: ( rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2086:2: rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__0__Impl_in_rule__TraceElementInline__Group__04291);
            rule__TraceElementInline__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__1_in_rule__TraceElementInline__Group__04294);
            rule__TraceElementInline__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceElementInline__Group__0"


    // $ANTLR start "rule__TraceElementInline__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2093:1: rule__TraceElementInline__Group__0__Impl : ( ( rule__TraceElementInline__NameAssignment_0 ) ) ;
    public final void rule__TraceElementInline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2097:1: ( ( ( rule__TraceElementInline__NameAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2098:1: ( ( rule__TraceElementInline__NameAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2098:1: ( ( rule__TraceElementInline__NameAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2099:1: ( rule__TraceElementInline__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getNameAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2100:1: ( rule__TraceElementInline__NameAssignment_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2100:2: rule__TraceElementInline__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__NameAssignment_0_in_rule__TraceElementInline__Group__0__Impl4321);
            rule__TraceElementInline__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__TraceElementInline__Group__0__Impl"


    // $ANTLR start "rule__TraceElementInline__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2110:1: rule__TraceElementInline__Group__1 : rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2 ;
    public final void rule__TraceElementInline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2114:1: ( rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2115:2: rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__1__Impl_in_rule__TraceElementInline__Group__14351);
            rule__TraceElementInline__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__2_in_rule__TraceElementInline__Group__14354);
            rule__TraceElementInline__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceElementInline__Group__1"


    // $ANTLR start "rule__TraceElementInline__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2122:1: rule__TraceElementInline__Group__1__Impl : ( ':' ) ;
    public final void rule__TraceElementInline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2126:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2127:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2127:1: ( ':' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2128:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getColonKeyword_1()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__TraceElementInline__Group__1__Impl4382); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__TraceElementInline__Group__1__Impl"


    // $ANTLR start "rule__TraceElementInline__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2141:1: rule__TraceElementInline__Group__2 : rule__TraceElementInline__Group__2__Impl ;
    public final void rule__TraceElementInline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2145:1: ( rule__TraceElementInline__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2146:2: rule__TraceElementInline__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__2__Impl_in_rule__TraceElementInline__Group__24413);
            rule__TraceElementInline__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceElementInline__Group__2"


    // $ANTLR start "rule__TraceElementInline__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2152:1: rule__TraceElementInline__Group__2__Impl : ( ( rule__TraceElementInline__TypeAssignment_2 ) ) ;
    public final void rule__TraceElementInline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2156:1: ( ( ( rule__TraceElementInline__TypeAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2157:1: ( ( rule__TraceElementInline__TypeAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2157:1: ( ( rule__TraceElementInline__TypeAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2158:1: ( rule__TraceElementInline__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getTypeAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2159:1: ( rule__TraceElementInline__TypeAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2159:2: rule__TraceElementInline__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__TypeAssignment_2_in_rule__TraceElementInline__Group__2__Impl4440);
            rule__TraceElementInline__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__TraceElementInline__Group__2__Impl"


    // $ANTLR start "rule__TraceElementExpanded__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2175:1: rule__TraceElementExpanded__Group__0 : rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1 ;
    public final void rule__TraceElementExpanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2179:1: ( rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2180:2: rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__0__Impl_in_rule__TraceElementExpanded__Group__04476);
            rule__TraceElementExpanded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__1_in_rule__TraceElementExpanded__Group__04479);
            rule__TraceElementExpanded__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceElementExpanded__Group__0"


    // $ANTLR start "rule__TraceElementExpanded__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2187:1: rule__TraceElementExpanded__Group__0__Impl : ( 'var' ) ;
    public final void rule__TraceElementExpanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2191:1: ( ( 'var' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2192:1: ( 'var' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2192:1: ( 'var' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2193:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TraceElementExpanded__Group__0__Impl4507); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0()); 
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
    // $ANTLR end "rule__TraceElementExpanded__Group__0__Impl"


    // $ANTLR start "rule__TraceElementExpanded__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2206:1: rule__TraceElementExpanded__Group__1 : rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2 ;
    public final void rule__TraceElementExpanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2210:1: ( rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2211:2: rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__1__Impl_in_rule__TraceElementExpanded__Group__14538);
            rule__TraceElementExpanded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__2_in_rule__TraceElementExpanded__Group__14541);
            rule__TraceElementExpanded__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceElementExpanded__Group__1"


    // $ANTLR start "rule__TraceElementExpanded__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2218:1: rule__TraceElementExpanded__Group__1__Impl : ( ( rule__TraceElementExpanded__NameAssignment_1 ) ) ;
    public final void rule__TraceElementExpanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2222:1: ( ( ( rule__TraceElementExpanded__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2223:1: ( ( rule__TraceElementExpanded__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2223:1: ( ( rule__TraceElementExpanded__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2224:1: ( rule__TraceElementExpanded__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2225:1: ( rule__TraceElementExpanded__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2225:2: rule__TraceElementExpanded__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__NameAssignment_1_in_rule__TraceElementExpanded__Group__1__Impl4568);
            rule__TraceElementExpanded__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TraceElementExpanded__Group__1__Impl"


    // $ANTLR start "rule__TraceElementExpanded__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2235:1: rule__TraceElementExpanded__Group__2 : rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3 ;
    public final void rule__TraceElementExpanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2239:1: ( rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2240:2: rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__2__Impl_in_rule__TraceElementExpanded__Group__24598);
            rule__TraceElementExpanded__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__3_in_rule__TraceElementExpanded__Group__24601);
            rule__TraceElementExpanded__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceElementExpanded__Group__2"


    // $ANTLR start "rule__TraceElementExpanded__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2247:1: rule__TraceElementExpanded__Group__2__Impl : ( ':' ) ;
    public final void rule__TraceElementExpanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2251:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2252:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2252:1: ( ':' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2253:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__TraceElementExpanded__Group__2__Impl4629); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__TraceElementExpanded__Group__2__Impl"


    // $ANTLR start "rule__TraceElementExpanded__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2266:1: rule__TraceElementExpanded__Group__3 : rule__TraceElementExpanded__Group__3__Impl ;
    public final void rule__TraceElementExpanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2270:1: ( rule__TraceElementExpanded__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2271:2: rule__TraceElementExpanded__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__3__Impl_in_rule__TraceElementExpanded__Group__34660);
            rule__TraceElementExpanded__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceElementExpanded__Group__3"


    // $ANTLR start "rule__TraceElementExpanded__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2277:1: rule__TraceElementExpanded__Group__3__Impl : ( ( rule__TraceElementExpanded__TypeAssignment_3 ) ) ;
    public final void rule__TraceElementExpanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2281:1: ( ( ( rule__TraceElementExpanded__TypeAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2282:1: ( ( rule__TraceElementExpanded__TypeAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2282:1: ( ( rule__TraceElementExpanded__TypeAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2283:1: ( rule__TraceElementExpanded__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getTypeAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2284:1: ( rule__TraceElementExpanded__TypeAssignment_3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2284:2: rule__TraceElementExpanded__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__TypeAssignment_3_in_rule__TraceElementExpanded__Group__3__Impl4687);
            rule__TraceElementExpanded__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__TraceElementExpanded__Group__3__Impl"


    // $ANTLR start "rule__ClassUse__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2302:1: rule__ClassUse__Group__0 : rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1 ;
    public final void rule__ClassUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2306:1: ( rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2307:2: rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__0__Impl_in_rule__ClassUse__Group__04725);
            rule__ClassUse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__1_in_rule__ClassUse__Group__04728);
            rule__ClassUse__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClassUse__Group__0"


    // $ANTLR start "rule__ClassUse__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2314:1: rule__ClassUse__Group__0__Impl : ( ( rule__ClassUse__ModelAssignment_0 ) ) ;
    public final void rule__ClassUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2318:1: ( ( ( rule__ClassUse__ModelAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2319:1: ( ( rule__ClassUse__ModelAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2319:1: ( ( rule__ClassUse__ModelAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2320:1: ( rule__ClassUse__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2321:1: ( rule__ClassUse__ModelAssignment_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2321:2: rule__ClassUse__ModelAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__ModelAssignment_0_in_rule__ClassUse__Group__0__Impl4755);
            rule__ClassUse__ModelAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getModelAssignment_0()); 
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
    // $ANTLR end "rule__ClassUse__Group__0__Impl"


    // $ANTLR start "rule__ClassUse__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2331:1: rule__ClassUse__Group__1 : rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2 ;
    public final void rule__ClassUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2335:1: ( rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2336:2: rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__1__Impl_in_rule__ClassUse__Group__14785);
            rule__ClassUse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__2_in_rule__ClassUse__Group__14788);
            rule__ClassUse__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClassUse__Group__1"


    // $ANTLR start "rule__ClassUse__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2343:1: rule__ClassUse__Group__1__Impl : ( '!' ) ;
    public final void rule__ClassUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2347:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2348:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2348:1: ( '!' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2349:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ClassUse__Group__1__Impl4816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1()); 
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
    // $ANTLR end "rule__ClassUse__Group__1__Impl"


    // $ANTLR start "rule__ClassUse__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2362:1: rule__ClassUse__Group__2 : rule__ClassUse__Group__2__Impl ;
    public final void rule__ClassUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2366:1: ( rule__ClassUse__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2367:2: rule__ClassUse__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__2__Impl_in_rule__ClassUse__Group__24847);
            rule__ClassUse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClassUse__Group__2"


    // $ANTLR start "rule__ClassUse__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2373:1: rule__ClassUse__Group__2__Impl : ( ( rule__ClassUse__ClassNameAssignment_2 ) ) ;
    public final void rule__ClassUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2377:1: ( ( ( rule__ClassUse__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2378:1: ( ( rule__ClassUse__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2378:1: ( ( rule__ClassUse__ClassNameAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2379:1: ( rule__ClassUse__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getClassNameAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2380:1: ( rule__ClassUse__ClassNameAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2380:2: rule__ClassUse__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__ClassNameAssignment_2_in_rule__ClassUse__Group__2__Impl4874);
            rule__ClassUse__ClassNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getClassNameAssignment_2()); 
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
    // $ANTLR end "rule__ClassUse__Group__2__Impl"


    // $ANTLR start "rule__PropertyWrite__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2396:1: rule__PropertyWrite__Group__0 : rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1 ;
    public final void rule__PropertyWrite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2400:1: ( rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2401:2: rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__0__Impl_in_rule__PropertyWrite__Group__04910);
            rule__PropertyWrite__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__1_in_rule__PropertyWrite__Group__04913);
            rule__PropertyWrite__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyWrite__Group__0"


    // $ANTLR start "rule__PropertyWrite__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2408:1: rule__PropertyWrite__Group__0__Impl : ( ( rule__PropertyWrite__ReceptorAssignment_0 ) ) ;
    public final void rule__PropertyWrite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2412:1: ( ( ( rule__PropertyWrite__ReceptorAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2413:1: ( ( rule__PropertyWrite__ReceptorAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2413:1: ( ( rule__PropertyWrite__ReceptorAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2414:1: ( rule__PropertyWrite__ReceptorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2415:1: ( rule__PropertyWrite__ReceptorAssignment_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2415:2: rule__PropertyWrite__ReceptorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__ReceptorAssignment_0_in_rule__PropertyWrite__Group__0__Impl4940);
            rule__PropertyWrite__ReceptorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getReceptorAssignment_0()); 
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
    // $ANTLR end "rule__PropertyWrite__Group__0__Impl"


    // $ANTLR start "rule__PropertyWrite__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2425:1: rule__PropertyWrite__Group__1 : rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2 ;
    public final void rule__PropertyWrite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2429:1: ( rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2430:2: rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__1__Impl_in_rule__PropertyWrite__Group__14970);
            rule__PropertyWrite__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__2_in_rule__PropertyWrite__Group__14973);
            rule__PropertyWrite__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyWrite__Group__1"


    // $ANTLR start "rule__PropertyWrite__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2437:1: rule__PropertyWrite__Group__1__Impl : ( '.' ) ;
    public final void rule__PropertyWrite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2441:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2442:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2442:1: ( '.' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2443:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getFullStopKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PropertyWrite__Group__1__Impl5001); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__PropertyWrite__Group__1__Impl"


    // $ANTLR start "rule__PropertyWrite__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2456:1: rule__PropertyWrite__Group__2 : rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3 ;
    public final void rule__PropertyWrite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2460:1: ( rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2461:2: rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__2__Impl_in_rule__PropertyWrite__Group__25032);
            rule__PropertyWrite__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__3_in_rule__PropertyWrite__Group__25035);
            rule__PropertyWrite__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyWrite__Group__2"


    // $ANTLR start "rule__PropertyWrite__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2468:1: rule__PropertyWrite__Group__2__Impl : ( ( rule__PropertyWrite__PropertyAssignment_2 ) ) ;
    public final void rule__PropertyWrite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2472:1: ( ( ( rule__PropertyWrite__PropertyAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2473:1: ( ( rule__PropertyWrite__PropertyAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2473:1: ( ( rule__PropertyWrite__PropertyAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2474:1: ( rule__PropertyWrite__PropertyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getPropertyAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2475:1: ( rule__PropertyWrite__PropertyAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2475:2: rule__PropertyWrite__PropertyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__PropertyAssignment_2_in_rule__PropertyWrite__Group__2__Impl5062);
            rule__PropertyWrite__PropertyAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getPropertyAssignment_2()); 
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
    // $ANTLR end "rule__PropertyWrite__Group__2__Impl"


    // $ANTLR start "rule__PropertyWrite__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2485:1: rule__PropertyWrite__Group__3 : rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4 ;
    public final void rule__PropertyWrite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2489:1: ( rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2490:2: rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__3__Impl_in_rule__PropertyWrite__Group__35092);
            rule__PropertyWrite__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__4_in_rule__PropertyWrite__Group__35095);
            rule__PropertyWrite__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyWrite__Group__3"


    // $ANTLR start "rule__PropertyWrite__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2497:1: rule__PropertyWrite__Group__3__Impl : ( '=' ) ;
    public final void rule__PropertyWrite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2501:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2502:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2502:1: ( '=' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2503:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getEqualsSignKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PropertyWrite__Group__3__Impl5123); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__PropertyWrite__Group__3__Impl"


    // $ANTLR start "rule__PropertyWrite__Group__4"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2516:1: rule__PropertyWrite__Group__4 : rule__PropertyWrite__Group__4__Impl ;
    public final void rule__PropertyWrite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2520:1: ( rule__PropertyWrite__Group__4__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2521:2: rule__PropertyWrite__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__4__Impl_in_rule__PropertyWrite__Group__45154);
            rule__PropertyWrite__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyWrite__Group__4"


    // $ANTLR start "rule__PropertyWrite__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2527:1: rule__PropertyWrite__Group__4__Impl : ( ( rule__PropertyWrite__ExpressionAssignment_4 ) ) ;
    public final void rule__PropertyWrite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2531:1: ( ( ( rule__PropertyWrite__ExpressionAssignment_4 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2532:1: ( ( rule__PropertyWrite__ExpressionAssignment_4 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2532:1: ( ( rule__PropertyWrite__ExpressionAssignment_4 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2533:1: ( rule__PropertyWrite__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getExpressionAssignment_4()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2534:1: ( rule__PropertyWrite__ExpressionAssignment_4 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2534:2: rule__PropertyWrite__ExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__ExpressionAssignment_4_in_rule__PropertyWrite__Group__4__Impl5181);
            rule__PropertyWrite__ExpressionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getExpressionAssignment_4()); 
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
    // $ANTLR end "rule__PropertyWrite__Group__4__Impl"


    // $ANTLR start "rule__DefineVariable__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2554:1: rule__DefineVariable__Group__0 : rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1 ;
    public final void rule__DefineVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2558:1: ( rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2559:2: rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__0__Impl_in_rule__DefineVariable__Group__05221);
            rule__DefineVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__1_in_rule__DefineVariable__Group__05224);
            rule__DefineVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DefineVariable__Group__0"


    // $ANTLR start "rule__DefineVariable__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2566:1: rule__DefineVariable__Group__0__Impl : ( ( rule__DefineVariable__NameAssignment_0 ) ) ;
    public final void rule__DefineVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2570:1: ( ( ( rule__DefineVariable__NameAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2571:1: ( ( rule__DefineVariable__NameAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2571:1: ( ( rule__DefineVariable__NameAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2572:1: ( rule__DefineVariable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getNameAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2573:1: ( rule__DefineVariable__NameAssignment_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2573:2: rule__DefineVariable__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__NameAssignment_0_in_rule__DefineVariable__Group__0__Impl5251);
            rule__DefineVariable__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__DefineVariable__Group__0__Impl"


    // $ANTLR start "rule__DefineVariable__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2583:1: rule__DefineVariable__Group__1 : rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2 ;
    public final void rule__DefineVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2587:1: ( rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2588:2: rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__1__Impl_in_rule__DefineVariable__Group__15281);
            rule__DefineVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__2_in_rule__DefineVariable__Group__15284);
            rule__DefineVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DefineVariable__Group__1"


    // $ANTLR start "rule__DefineVariable__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2595:1: rule__DefineVariable__Group__1__Impl : ( '=' ) ;
    public final void rule__DefineVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2599:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2600:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2600:1: ( '=' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2601:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__DefineVariable__Group__1__Impl5312); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__DefineVariable__Group__1__Impl"


    // $ANTLR start "rule__DefineVariable__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2614:1: rule__DefineVariable__Group__2 : rule__DefineVariable__Group__2__Impl ;
    public final void rule__DefineVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2618:1: ( rule__DefineVariable__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2619:2: rule__DefineVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__2__Impl_in_rule__DefineVariable__Group__25343);
            rule__DefineVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DefineVariable__Group__2"


    // $ANTLR start "rule__DefineVariable__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2625:1: rule__DefineVariable__Group__2__Impl : ( ( rule__DefineVariable__ExpressionAssignment_2 ) ) ;
    public final void rule__DefineVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2629:1: ( ( ( rule__DefineVariable__ExpressionAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2630:1: ( ( rule__DefineVariable__ExpressionAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2630:1: ( ( rule__DefineVariable__ExpressionAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2631:1: ( rule__DefineVariable__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getExpressionAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2632:1: ( rule__DefineVariable__ExpressionAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2632:2: rule__DefineVariable__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__ExpressionAssignment_2_in_rule__DefineVariable__Group__2__Impl5370);
            rule__DefineVariable__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__DefineVariable__Group__2__Impl"


    // $ANTLR start "rule__ModelReference__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2648:1: rule__ModelReference__Group__0 : rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 ;
    public final void rule__ModelReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2652:1: ( rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2653:2: rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__0__Impl_in_rule__ModelReference__Group__05406);
            rule__ModelReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__1_in_rule__ModelReference__Group__05409);
            rule__ModelReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ModelReference__Group__0"


    // $ANTLR start "rule__ModelReference__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2660:1: rule__ModelReference__Group__0__Impl : ( ( rule__ModelReference__ModelAssignment_0 ) ) ;
    public final void rule__ModelReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2664:1: ( ( ( rule__ModelReference__ModelAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2665:1: ( ( rule__ModelReference__ModelAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2665:1: ( ( rule__ModelReference__ModelAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2666:1: ( rule__ModelReference__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2667:1: ( rule__ModelReference__ModelAssignment_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2667:2: rule__ModelReference__ModelAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__ModelAssignment_0_in_rule__ModelReference__Group__0__Impl5436);
            rule__ModelReference__ModelAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getModelAssignment_0()); 
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
    // $ANTLR end "rule__ModelReference__Group__0__Impl"


    // $ANTLR start "rule__ModelReference__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2677:1: rule__ModelReference__Group__1 : rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2 ;
    public final void rule__ModelReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2681:1: ( rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2682:2: rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__1__Impl_in_rule__ModelReference__Group__15466);
            rule__ModelReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__2_in_rule__ModelReference__Group__15469);
            rule__ModelReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ModelReference__Group__1"


    // $ANTLR start "rule__ModelReference__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2689:1: rule__ModelReference__Group__1__Impl : ( '!' ) ;
    public final void rule__ModelReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2693:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2694:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2694:1: ( '!' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2695:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ModelReference__Group__1__Impl5497); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1()); 
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
    // $ANTLR end "rule__ModelReference__Group__1__Impl"


    // $ANTLR start "rule__ModelReference__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2708:1: rule__ModelReference__Group__2 : rule__ModelReference__Group__2__Impl ;
    public final void rule__ModelReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2712:1: ( rule__ModelReference__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2713:2: rule__ModelReference__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__2__Impl_in_rule__ModelReference__Group__25528);
            rule__ModelReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ModelReference__Group__2"


    // $ANTLR start "rule__ModelReference__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2719:1: rule__ModelReference__Group__2__Impl : ( ( rule__ModelReference__ClassNameAssignment_2 ) ) ;
    public final void rule__ModelReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2723:1: ( ( ( rule__ModelReference__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2724:1: ( ( rule__ModelReference__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2724:1: ( ( rule__ModelReference__ClassNameAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2725:1: ( rule__ModelReference__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getClassNameAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2726:1: ( rule__ModelReference__ClassNameAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2726:2: rule__ModelReference__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__ClassNameAssignment_2_in_rule__ModelReference__Group__2__Impl5555);
            rule__ModelReference__ClassNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getClassNameAssignment_2()); 
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
    // $ANTLR end "rule__ModelReference__Group__2__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2742:1: rule__ParenthesizedExpression__Group__0 : rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 ;
    public final void rule__ParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2746:1: ( rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2747:2: rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__0__Impl_in_rule__ParenthesizedExpression__Group__05591);
            rule__ParenthesizedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__1_in_rule__ParenthesizedExpression__Group__05594);
            rule__ParenthesizedExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__0"


    // $ANTLR start "rule__ParenthesizedExpression__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2754:1: rule__ParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2758:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2759:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2759:1: ( '(' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2760:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ParenthesizedExpression__Group__0__Impl5622); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__ParenthesizedExpression__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2773:1: rule__ParenthesizedExpression__Group__1 : rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 ;
    public final void rule__ParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2777:1: ( rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2778:2: rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__1__Impl_in_rule__ParenthesizedExpression__Group__15653);
            rule__ParenthesizedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__2_in_rule__ParenthesizedExpression__Group__15656);
            rule__ParenthesizedExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__1"


    // $ANTLR start "rule__ParenthesizedExpression__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2785:1: rule__ParenthesizedExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2789:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2790:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2790:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2791:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ParenthesizedExpression__Group__1__Impl5683);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__ParenthesizedExpression__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2802:1: rule__ParenthesizedExpression__Group__2 : rule__ParenthesizedExpression__Group__2__Impl ;
    public final void rule__ParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2806:1: ( rule__ParenthesizedExpression__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2807:2: rule__ParenthesizedExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__2__Impl_in_rule__ParenthesizedExpression__Group__25712);
            rule__ParenthesizedExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__2"


    // $ANTLR start "rule__ParenthesizedExpression__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2813:1: rule__ParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2817:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2818:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2818:1: ( ')' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2819:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ParenthesizedExpression__Group__2__Impl5740); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ParenthesizedExpression__Group__2__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2838:1: rule__ClosureDeclaration__Group__0 : rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1 ;
    public final void rule__ClosureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2842:1: ( rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2843:2: rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__0__Impl_in_rule__ClosureDeclaration__Group__05777);
            rule__ClosureDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__1_in_rule__ClosureDeclaration__Group__05780);
            rule__ClosureDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group__0"


    // $ANTLR start "rule__ClosureDeclaration__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2850:1: rule__ClosureDeclaration__Group__0__Impl : ( '{' ) ;
    public final void rule__ClosureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2854:1: ( ( '{' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2855:1: ( '{' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2855:1: ( '{' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2856:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ClosureDeclaration__Group__0__Impl5808); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2869:1: rule__ClosureDeclaration__Group__1 : rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2 ;
    public final void rule__ClosureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2873:1: ( rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2874:2: rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__1__Impl_in_rule__ClosureDeclaration__Group__15839);
            rule__ClosureDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__2_in_rule__ClosureDeclaration__Group__15842);
            rule__ClosureDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group__1"


    // $ANTLR start "rule__ClosureDeclaration__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2881:1: rule__ClosureDeclaration__Group__1__Impl : ( ( rule__ClosureDeclaration__Group_1__0 )? ) ;
    public final void rule__ClosureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2885:1: ( ( ( rule__ClosureDeclaration__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2886:1: ( ( rule__ClosureDeclaration__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2886:1: ( ( rule__ClosureDeclaration__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2887:1: ( rule__ClosureDeclaration__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2888:1: ( rule__ClosureDeclaration__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2888:2: rule__ClosureDeclaration__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__0_in_rule__ClosureDeclaration__Group__1__Impl5869);
                    rule__ClosureDeclaration__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2898:1: rule__ClosureDeclaration__Group__2 : rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3 ;
    public final void rule__ClosureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2902:1: ( rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2903:2: rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__2__Impl_in_rule__ClosureDeclaration__Group__25900);
            rule__ClosureDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__3_in_rule__ClosureDeclaration__Group__25903);
            rule__ClosureDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group__2"


    // $ANTLR start "rule__ClosureDeclaration__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2910:1: rule__ClosureDeclaration__Group__2__Impl : ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) ) ;
    public final void rule__ClosureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2914:1: ( ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2915:1: ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2915:1: ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2916:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2916:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2917:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2918:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2918:2: rule__ClosureDeclaration__StatementsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl5932);
            rule__ClosureDeclaration__StatementsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }

            }

            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2921:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2922:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2923:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_INT)||LA13_0==13||LA13_0==17||LA13_0==23||LA13_0==33||LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2923:2: rule__ClosureDeclaration__StatementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl5944);
            	    rule__ClosureDeclaration__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }

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
    // $ANTLR end "rule__ClosureDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2934:1: rule__ClosureDeclaration__Group__3 : rule__ClosureDeclaration__Group__3__Impl ;
    public final void rule__ClosureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2938:1: ( rule__ClosureDeclaration__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2939:2: rule__ClosureDeclaration__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__3__Impl_in_rule__ClosureDeclaration__Group__35977);
            rule__ClosureDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group__3"


    // $ANTLR start "rule__ClosureDeclaration__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2945:1: rule__ClosureDeclaration__Group__3__Impl : ( '}' ) ;
    public final void rule__ClosureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2949:1: ( ( '}' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2950:1: ( '}' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2950:1: ( '}' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2951:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ClosureDeclaration__Group__3__Impl6005); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group_1__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2972:1: rule__ClosureDeclaration__Group_1__0 : rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1 ;
    public final void rule__ClosureDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2976:1: ( rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2977:2: rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__0__Impl_in_rule__ClosureDeclaration__Group_1__06044);
            rule__ClosureDeclaration__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__1_in_rule__ClosureDeclaration__Group_1__06047);
            rule__ClosureDeclaration__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group_1__0"


    // $ANTLR start "rule__ClosureDeclaration__Group_1__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2984:1: rule__ClosureDeclaration__Group_1__0__Impl : ( '|' ) ;
    public final void rule__ClosureDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2988:1: ( ( '|' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2989:1: ( '|' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2989:1: ( '|' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:2990:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ClosureDeclaration__Group_1__0__Impl6075); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group_1__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3003:1: rule__ClosureDeclaration__Group_1__1 : rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2 ;
    public final void rule__ClosureDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3007:1: ( rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3008:2: rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__1__Impl_in_rule__ClosureDeclaration__Group_1__16106);
            rule__ClosureDeclaration__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__2_in_rule__ClosureDeclaration__Group_1__16109);
            rule__ClosureDeclaration__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group_1__1"


    // $ANTLR start "rule__ClosureDeclaration__Group_1__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3015:1: rule__ClosureDeclaration__Group_1__1__Impl : ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) ) ;
    public final void rule__ClosureDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3019:1: ( ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3020:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3020:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3021:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3022:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3022:2: rule__ClosureDeclaration__FormalParametersAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_1_in_rule__ClosureDeclaration__Group_1__1__Impl6136);
            rule__ClosureDeclaration__FormalParametersAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_1()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group_1__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3032:1: rule__ClosureDeclaration__Group_1__2 : rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3 ;
    public final void rule__ClosureDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3036:1: ( rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3037:2: rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__2__Impl_in_rule__ClosureDeclaration__Group_1__26166);
            rule__ClosureDeclaration__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__3_in_rule__ClosureDeclaration__Group_1__26169);
            rule__ClosureDeclaration__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group_1__2"


    // $ANTLR start "rule__ClosureDeclaration__Group_1__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3044:1: rule__ClosureDeclaration__Group_1__2__Impl : ( ( rule__ClosureDeclaration__Group_1_2__0 )* ) ;
    public final void rule__ClosureDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3048:1: ( ( ( rule__ClosureDeclaration__Group_1_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3049:1: ( ( rule__ClosureDeclaration__Group_1_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3049:1: ( ( rule__ClosureDeclaration__Group_1_2__0 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3050:1: ( rule__ClosureDeclaration__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup_1_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3051:1: ( rule__ClosureDeclaration__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3051:2: rule__ClosureDeclaration__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__0_in_rule__ClosureDeclaration__Group_1__2__Impl6196);
            	    rule__ClosureDeclaration__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group_1__2__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group_1__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3061:1: rule__ClosureDeclaration__Group_1__3 : rule__ClosureDeclaration__Group_1__3__Impl ;
    public final void rule__ClosureDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3065:1: ( rule__ClosureDeclaration__Group_1__3__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3066:2: rule__ClosureDeclaration__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__3__Impl_in_rule__ClosureDeclaration__Group_1__36227);
            rule__ClosureDeclaration__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group_1__3"


    // $ANTLR start "rule__ClosureDeclaration__Group_1__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3072:1: rule__ClosureDeclaration__Group_1__3__Impl : ( '|' ) ;
    public final void rule__ClosureDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3076:1: ( ( '|' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3077:1: ( '|' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3077:1: ( '|' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3078:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ClosureDeclaration__Group_1__3__Impl6255); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group_1__3__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group_1_2__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3099:1: rule__ClosureDeclaration__Group_1_2__0 : rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1 ;
    public final void rule__ClosureDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3103:1: ( rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3104:2: rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__0__Impl_in_rule__ClosureDeclaration__Group_1_2__06294);
            rule__ClosureDeclaration__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__1_in_rule__ClosureDeclaration__Group_1_2__06297);
            rule__ClosureDeclaration__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group_1_2__0"


    // $ANTLR start "rule__ClosureDeclaration__Group_1_2__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3111:1: rule__ClosureDeclaration__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ClosureDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3115:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3116:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3116:1: ( ',' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3117:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ClosureDeclaration__Group_1_2__0__Impl6325); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group_1_2__0__Impl"


    // $ANTLR start "rule__ClosureDeclaration__Group_1_2__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3130:1: rule__ClosureDeclaration__Group_1_2__1 : rule__ClosureDeclaration__Group_1_2__1__Impl ;
    public final void rule__ClosureDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3134:1: ( rule__ClosureDeclaration__Group_1_2__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3135:2: rule__ClosureDeclaration__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__1__Impl_in_rule__ClosureDeclaration__Group_1_2__16356);
            rule__ClosureDeclaration__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ClosureDeclaration__Group_1_2__1"


    // $ANTLR start "rule__ClosureDeclaration__Group_1_2__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3141:1: rule__ClosureDeclaration__Group_1_2__1__Impl : ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) ) ;
    public final void rule__ClosureDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3145:1: ( ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3146:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3146:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3147:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3148:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3148:2: rule__ClosureDeclaration__FormalParametersAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_2_1_in_rule__ClosureDeclaration__Group_1_2__1__Impl6383);
            rule__ClosureDeclaration__FormalParametersAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_2_1()); 
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
    // $ANTLR end "rule__ClosureDeclaration__Group_1_2__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3162:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3166:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3167:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__06417);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__06420);
            rule__MethodCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3174:1: rule__MethodCall__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3178:1: ( ( rulePrimaryExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3179:1: ( rulePrimaryExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3179:1: ( rulePrimaryExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3180:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_rule__MethodCall__Group__0__Impl6447);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__MethodCall__Group__0__Impl"


    // $ANTLR start "rule__MethodCall__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3191:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3195:1: ( rule__MethodCall__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3196:2: rule__MethodCall__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__16476);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3202:1: rule__MethodCall__Group__1__Impl : ( ( rule__MethodCall__Alternatives_1 )? ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3206:1: ( ( ( rule__MethodCall__Alternatives_1 )? ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3207:1: ( ( rule__MethodCall__Alternatives_1 )? )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3207:1: ( ( rule__MethodCall__Alternatives_1 )? )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3208:1: ( rule__MethodCall__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getAlternatives_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3209:1: ( rule__MethodCall__Alternatives_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12||(LA15_0>=14 && LA15_0<=15)||LA15_0==29) ) {
                alt15=1;
            }
            else if ( (LA15_0==13) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==RULE_INT) ) {
                    int LA15_4 = input.LA(3);

                    if ( (synpred24_InternalKoan()) ) {
                        alt15=1;
                    }
                }
                else if ( (LA15_2==RULE_ID||LA15_2==13||LA15_2==17||LA15_2==23||LA15_2==33) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3209:2: rule__MethodCall__Alternatives_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Alternatives_1_in_rule__MethodCall__Group__1__Impl6503);
                    rule__MethodCall__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__MethodCall__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_0__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3223:1: rule__MethodCall__Group_1_0__0 : rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1 ;
    public final void rule__MethodCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3227:1: ( rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3228:2: rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__0__Impl_in_rule__MethodCall__Group_1_0__06538);
            rule__MethodCall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__1_in_rule__MethodCall__Group_1_0__06541);
            rule__MethodCall__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_0__0"


    // $ANTLR start "rule__MethodCall__Group_1_0__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3235:1: rule__MethodCall__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MethodCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3239:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3240:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3240:1: ( () )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3241:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3242:1: ()
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3244:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getBinaryExprLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_0__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_0__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3254:1: rule__MethodCall__Group_1_0__1 : rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2 ;
    public final void rule__MethodCall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3258:1: ( rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3259:2: rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__1__Impl_in_rule__MethodCall__Group_1_0__16599);
            rule__MethodCall__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__2_in_rule__MethodCall__Group_1_0__16602);
            rule__MethodCall__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_0__1"


    // $ANTLR start "rule__MethodCall__Group_1_0__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3266:1: rule__MethodCall__Group_1_0__1__Impl : ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) ) ;
    public final void rule__MethodCall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3270:1: ( ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3271:1: ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3271:1: ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3272:1: ( rule__MethodCall__BinaryOpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryOpAssignment_1_0_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3273:1: ( rule__MethodCall__BinaryOpAssignment_1_0_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3273:2: rule__MethodCall__BinaryOpAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__BinaryOpAssignment_1_0_1_in_rule__MethodCall__Group_1_0__1__Impl6629);
            rule__MethodCall__BinaryOpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getBinaryOpAssignment_1_0_1()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_0__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_0__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3283:1: rule__MethodCall__Group_1_0__2 : rule__MethodCall__Group_1_0__2__Impl ;
    public final void rule__MethodCall__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3287:1: ( rule__MethodCall__Group_1_0__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3288:2: rule__MethodCall__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__2__Impl_in_rule__MethodCall__Group_1_0__26659);
            rule__MethodCall__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_0__2"


    // $ANTLR start "rule__MethodCall__Group_1_0__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3294:1: rule__MethodCall__Group_1_0__2__Impl : ( ( rule__MethodCall__RightAssignment_1_0_2 ) ) ;
    public final void rule__MethodCall__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3298:1: ( ( ( rule__MethodCall__RightAssignment_1_0_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3299:1: ( ( rule__MethodCall__RightAssignment_1_0_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3299:1: ( ( rule__MethodCall__RightAssignment_1_0_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3300:1: ( rule__MethodCall__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3301:1: ( rule__MethodCall__RightAssignment_1_0_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3301:2: rule__MethodCall__RightAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__RightAssignment_1_0_2_in_rule__MethodCall__Group_1_0__2__Impl6686);
            rule__MethodCall__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getRightAssignment_1_0_2()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_0__2__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3317:1: rule__MethodCall__Group_1_1__0 : rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1 ;
    public final void rule__MethodCall__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3321:1: ( rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3322:2: rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0__Impl_in_rule__MethodCall__Group_1_1__06722);
            rule__MethodCall__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__1_in_rule__MethodCall__Group_1_1__06725);
            rule__MethodCall__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1__0"


    // $ANTLR start "rule__MethodCall__Group_1_1__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3329:1: rule__MethodCall__Group_1_1__0__Impl : ( ( rule__MethodCall__Group_1_1_0__0 ) ) ;
    public final void rule__MethodCall__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3333:1: ( ( ( rule__MethodCall__Group_1_1_0__0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3334:1: ( ( rule__MethodCall__Group_1_1_0__0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3334:1: ( ( rule__MethodCall__Group_1_1_0__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3335:1: ( rule__MethodCall__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3336:1: ( rule__MethodCall__Group_1_1_0__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3336:2: rule__MethodCall__Group_1_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_0__0_in_rule__MethodCall__Group_1_1__0__Impl6752);
            rule__MethodCall__Group_1_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup_1_1_0()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3346:1: rule__MethodCall__Group_1_1__1 : rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2 ;
    public final void rule__MethodCall__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3350:1: ( rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3351:2: rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__1__Impl_in_rule__MethodCall__Group_1_1__16782);
            rule__MethodCall__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__2_in_rule__MethodCall__Group_1_1__16785);
            rule__MethodCall__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1__1"


    // $ANTLR start "rule__MethodCall__Group_1_1__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3358:1: rule__MethodCall__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3362:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3363:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3363:1: ( '.' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3364:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MethodCall__Group_1_1__1__Impl6813); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getFullStopKeyword_1_1_1()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3377:1: rule__MethodCall__Group_1_1__2 : rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3 ;
    public final void rule__MethodCall__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3381:1: ( rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3382:2: rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__2__Impl_in_rule__MethodCall__Group_1_1__26844);
            rule__MethodCall__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__3_in_rule__MethodCall__Group_1_1__26847);
            rule__MethodCall__Group_1_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1__2"


    // $ANTLR start "rule__MethodCall__Group_1_1__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3389:1: rule__MethodCall__Group_1_1__2__Impl : ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) ) ;
    public final void rule__MethodCall__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3393:1: ( ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3394:1: ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3394:1: ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3395:1: ( rule__MethodCall__MethodNameAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodNameAssignment_1_1_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3396:1: ( rule__MethodCall__MethodNameAssignment_1_1_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3396:2: rule__MethodCall__MethodNameAssignment_1_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__MethodNameAssignment_1_1_2_in_rule__MethodCall__Group_1_1__2__Impl6874);
            rule__MethodCall__MethodNameAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodNameAssignment_1_1_2()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1__2__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3406:1: rule__MethodCall__Group_1_1__3 : rule__MethodCall__Group_1_1__3__Impl ;
    public final void rule__MethodCall__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3410:1: ( rule__MethodCall__Group_1_1__3__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3411:2: rule__MethodCall__Group_1_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__3__Impl_in_rule__MethodCall__Group_1_1__36904);
            rule__MethodCall__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1__3"


    // $ANTLR start "rule__MethodCall__Group_1_1__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3417:1: rule__MethodCall__Group_1_1__3__Impl : ( ( rule__MethodCall__Group_1_1_3__0 )? ) ;
    public final void rule__MethodCall__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3421:1: ( ( ( rule__MethodCall__Group_1_1_3__0 )? ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3422:1: ( ( rule__MethodCall__Group_1_1_3__0 )? )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3422:1: ( ( rule__MethodCall__Group_1_1_3__0 )? )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3423:1: ( rule__MethodCall__Group_1_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_3()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3424:1: ( rule__MethodCall__Group_1_1_3__0 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3424:2: rule__MethodCall__Group_1_1_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0_in_rule__MethodCall__Group_1_1__3__Impl6931);
                    rule__MethodCall__Group_1_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup_1_1_3()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1__3__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1_0__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3442:1: rule__MethodCall__Group_1_1_0__0 : rule__MethodCall__Group_1_1_0__0__Impl ;
    public final void rule__MethodCall__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3446:1: ( rule__MethodCall__Group_1_1_0__0__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3447:2: rule__MethodCall__Group_1_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_0__0__Impl_in_rule__MethodCall__Group_1_1_0__06970);
            rule__MethodCall__Group_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1_0__0"


    // $ANTLR start "rule__MethodCall__Group_1_1_0__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3453:1: rule__MethodCall__Group_1_1_0__0__Impl : ( () ) ;
    public final void rule__MethodCall__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3457:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3458:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3458:1: ( () )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3459:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodCallReceptorAction_1_1_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3460:1: ()
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3462:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodCallReceptorAction_1_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1_3__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3474:1: rule__MethodCall__Group_1_1_3__0 : rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1 ;
    public final void rule__MethodCall__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3478:1: ( rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3479:2: rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0__Impl_in_rule__MethodCall__Group_1_1_3__07030);
            rule__MethodCall__Group_1_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__1_in_rule__MethodCall__Group_1_1_3__07033);
            rule__MethodCall__Group_1_1_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1_3__0"


    // $ANTLR start "rule__MethodCall__Group_1_1_3__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3486:1: rule__MethodCall__Group_1_1_3__0__Impl : ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) ) ;
    public final void rule__MethodCall__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3490:1: ( ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3491:1: ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3491:1: ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3492:1: ( rule__MethodCall__WithParametersAssignment_1_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersAssignment_1_1_3_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3493:1: ( rule__MethodCall__WithParametersAssignment_1_1_3_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3493:2: rule__MethodCall__WithParametersAssignment_1_1_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__WithParametersAssignment_1_1_3_0_in_rule__MethodCall__Group_1_1_3__0__Impl7060);
            rule__MethodCall__WithParametersAssignment_1_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getWithParametersAssignment_1_1_3_0()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1_3__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1_3__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3503:1: rule__MethodCall__Group_1_1_3__1 : rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2 ;
    public final void rule__MethodCall__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3507:1: ( rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3508:2: rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__1__Impl_in_rule__MethodCall__Group_1_1_3__17090);
            rule__MethodCall__Group_1_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__2_in_rule__MethodCall__Group_1_1_3__17093);
            rule__MethodCall__Group_1_1_3__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1_3__1"


    // $ANTLR start "rule__MethodCall__Group_1_1_3__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3515:1: rule__MethodCall__Group_1_1_3__1__Impl : ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) ) ;
    public final void rule__MethodCall__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3519:1: ( ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3520:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3520:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3521:1: ( rule__MethodCall__ParametersAssignment_1_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3522:1: ( rule__MethodCall__ParametersAssignment_1_1_3_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3522:2: rule__MethodCall__ParametersAssignment_1_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_1_in_rule__MethodCall__Group_1_1_3__1__Impl7120);
            rule__MethodCall__ParametersAssignment_1_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_1()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1_3__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1_3__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3532:1: rule__MethodCall__Group_1_1_3__2 : rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3 ;
    public final void rule__MethodCall__Group_1_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3536:1: ( rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3537:2: rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__2__Impl_in_rule__MethodCall__Group_1_1_3__27150);
            rule__MethodCall__Group_1_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__3_in_rule__MethodCall__Group_1_1_3__27153);
            rule__MethodCall__Group_1_1_3__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1_3__2"


    // $ANTLR start "rule__MethodCall__Group_1_1_3__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3544:1: rule__MethodCall__Group_1_1_3__2__Impl : ( ( rule__MethodCall__Group_1_1_3_2__0 )* ) ;
    public final void rule__MethodCall__Group_1_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3548:1: ( ( ( rule__MethodCall__Group_1_1_3_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3549:1: ( ( rule__MethodCall__Group_1_1_3_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3549:1: ( ( rule__MethodCall__Group_1_1_3_2__0 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3550:1: ( rule__MethodCall__Group_1_1_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_3_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3551:1: ( rule__MethodCall__Group_1_1_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3551:2: rule__MethodCall__Group_1_1_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__0_in_rule__MethodCall__Group_1_1_3__2__Impl7180);
            	    rule__MethodCall__Group_1_1_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup_1_1_3_2()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1_3__2__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1_3__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3561:1: rule__MethodCall__Group_1_1_3__3 : rule__MethodCall__Group_1_1_3__3__Impl ;
    public final void rule__MethodCall__Group_1_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3565:1: ( rule__MethodCall__Group_1_1_3__3__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3566:2: rule__MethodCall__Group_1_1_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__3__Impl_in_rule__MethodCall__Group_1_1_3__37211);
            rule__MethodCall__Group_1_1_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1_3__3"


    // $ANTLR start "rule__MethodCall__Group_1_1_3__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3572:1: rule__MethodCall__Group_1_1_3__3__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group_1_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3576:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3577:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3577:1: ( ')' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3578:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_1_3_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MethodCall__Group_1_1_3__3__Impl7239); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_1_3_3()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1_3__3__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1_3_2__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3599:1: rule__MethodCall__Group_1_1_3_2__0 : rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1 ;
    public final void rule__MethodCall__Group_1_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3603:1: ( rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3604:2: rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__0__Impl_in_rule__MethodCall__Group_1_1_3_2__07278);
            rule__MethodCall__Group_1_1_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__1_in_rule__MethodCall__Group_1_1_3_2__07281);
            rule__MethodCall__Group_1_1_3_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1_3_2__0"


    // $ANTLR start "rule__MethodCall__Group_1_1_3_2__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3611:1: rule__MethodCall__Group_1_1_3_2__0__Impl : ( ',' ) ;
    public final void rule__MethodCall__Group_1_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3615:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3616:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3616:1: ( ',' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3617:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getCommaKeyword_1_1_3_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MethodCall__Group_1_1_3_2__0__Impl7309); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getCommaKeyword_1_1_3_2_0()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1_3_2__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1_3_2__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3630:1: rule__MethodCall__Group_1_1_3_2__1 : rule__MethodCall__Group_1_1_3_2__1__Impl ;
    public final void rule__MethodCall__Group_1_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3634:1: ( rule__MethodCall__Group_1_1_3_2__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3635:2: rule__MethodCall__Group_1_1_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__1__Impl_in_rule__MethodCall__Group_1_1_3_2__17340);
            rule__MethodCall__Group_1_1_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_1_3_2__1"


    // $ANTLR start "rule__MethodCall__Group_1_1_3_2__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3641:1: rule__MethodCall__Group_1_1_3_2__1__Impl : ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) ) ;
    public final void rule__MethodCall__Group_1_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3645:1: ( ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3646:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3646:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3647:1: ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3648:1: ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3648:2: rule__MethodCall__ParametersAssignment_1_1_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_2_1_in_rule__MethodCall__Group_1_1_3_2__1__Impl7367);
            rule__MethodCall__ParametersAssignment_1_1_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_2_1()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1_3_2__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_2__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3662:1: rule__MethodCall__Group_1_2__0 : rule__MethodCall__Group_1_2__0__Impl rule__MethodCall__Group_1_2__1 ;
    public final void rule__MethodCall__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3666:1: ( rule__MethodCall__Group_1_2__0__Impl rule__MethodCall__Group_1_2__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3667:2: rule__MethodCall__Group_1_2__0__Impl rule__MethodCall__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_2__0__Impl_in_rule__MethodCall__Group_1_2__07401);
            rule__MethodCall__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_2__1_in_rule__MethodCall__Group_1_2__07404);
            rule__MethodCall__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_2__0"


    // $ANTLR start "rule__MethodCall__Group_1_2__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3674:1: rule__MethodCall__Group_1_2__0__Impl : ( () ) ;
    public final void rule__MethodCall__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3678:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3679:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3679:1: ( () )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3680:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getKeywordMethodCallReceptorAction_1_2_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3681:1: ()
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3683:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getKeywordMethodCallReceptorAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_2__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_2__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3693:1: rule__MethodCall__Group_1_2__1 : rule__MethodCall__Group_1_2__1__Impl rule__MethodCall__Group_1_2__2 ;
    public final void rule__MethodCall__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3697:1: ( rule__MethodCall__Group_1_2__1__Impl rule__MethodCall__Group_1_2__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3698:2: rule__MethodCall__Group_1_2__1__Impl rule__MethodCall__Group_1_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_2__1__Impl_in_rule__MethodCall__Group_1_2__17462);
            rule__MethodCall__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_2__2_in_rule__MethodCall__Group_1_2__17465);
            rule__MethodCall__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_2__1"


    // $ANTLR start "rule__MethodCall__Group_1_2__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3705:1: rule__MethodCall__Group_1_2__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3709:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3710:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3710:1: ( '.' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3711:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1_2_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MethodCall__Group_1_2__1__Impl7493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getFullStopKeyword_1_2_1()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_2__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_2__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3724:1: rule__MethodCall__Group_1_2__2 : rule__MethodCall__Group_1_2__2__Impl ;
    public final void rule__MethodCall__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3728:1: ( rule__MethodCall__Group_1_2__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3729:2: rule__MethodCall__Group_1_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_2__2__Impl_in_rule__MethodCall__Group_1_2__27524);
            rule__MethodCall__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodCall__Group_1_2__2"


    // $ANTLR start "rule__MethodCall__Group_1_2__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3735:1: rule__MethodCall__Group_1_2__2__Impl : ( ( ( rule__MethodCall__ParametersAssignment_1_2_2 ) ) ( ( rule__MethodCall__ParametersAssignment_1_2_2 )* ) ) ;
    public final void rule__MethodCall__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3739:1: ( ( ( ( rule__MethodCall__ParametersAssignment_1_2_2 ) ) ( ( rule__MethodCall__ParametersAssignment_1_2_2 )* ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3740:1: ( ( ( rule__MethodCall__ParametersAssignment_1_2_2 ) ) ( ( rule__MethodCall__ParametersAssignment_1_2_2 )* ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3740:1: ( ( ( rule__MethodCall__ParametersAssignment_1_2_2 ) ) ( ( rule__MethodCall__ParametersAssignment_1_2_2 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3741:1: ( ( rule__MethodCall__ParametersAssignment_1_2_2 ) ) ( ( rule__MethodCall__ParametersAssignment_1_2_2 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3741:1: ( ( rule__MethodCall__ParametersAssignment_1_2_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3742:1: ( rule__MethodCall__ParametersAssignment_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_2_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3743:1: ( rule__MethodCall__ParametersAssignment_1_2_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3743:2: rule__MethodCall__ParametersAssignment_1_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_2_2_in_rule__MethodCall__Group_1_2__2__Impl7553);
            rule__MethodCall__ParametersAssignment_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersAssignment_1_2_2()); 
            }

            }

            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3746:1: ( ( rule__MethodCall__ParametersAssignment_1_2_2 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3747:1: ( rule__MethodCall__ParametersAssignment_1_2_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_2_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3748:1: ( rule__MethodCall__ParametersAssignment_1_2_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_KEYWORD_ID) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred27_InternalKoan()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3748:2: rule__MethodCall__ParametersAssignment_1_2_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_2_2_in_rule__MethodCall__Group_1_2__2__Impl7565);
            	    rule__MethodCall__ParametersAssignment_1_2_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersAssignment_1_2_2()); 
            }

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
    // $ANTLR end "rule__MethodCall__Group_1_2__2__Impl"


    // $ANTLR start "rule__KeywordParameter__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3765:1: rule__KeywordParameter__Group__0 : rule__KeywordParameter__Group__0__Impl rule__KeywordParameter__Group__1 ;
    public final void rule__KeywordParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3769:1: ( rule__KeywordParameter__Group__0__Impl rule__KeywordParameter__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3770:2: rule__KeywordParameter__Group__0__Impl rule__KeywordParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeywordParameter__Group__0__Impl_in_rule__KeywordParameter__Group__07604);
            rule__KeywordParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeywordParameter__Group__1_in_rule__KeywordParameter__Group__07607);
            rule__KeywordParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KeywordParameter__Group__0"


    // $ANTLR start "rule__KeywordParameter__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3777:1: rule__KeywordParameter__Group__0__Impl : ( ( rule__KeywordParameter__KeywordAssignment_0 ) ) ;
    public final void rule__KeywordParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3781:1: ( ( ( rule__KeywordParameter__KeywordAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3782:1: ( ( rule__KeywordParameter__KeywordAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3782:1: ( ( rule__KeywordParameter__KeywordAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3783:1: ( rule__KeywordParameter__KeywordAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordParameterAccess().getKeywordAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3784:1: ( rule__KeywordParameter__KeywordAssignment_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3784:2: rule__KeywordParameter__KeywordAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeywordParameter__KeywordAssignment_0_in_rule__KeywordParameter__Group__0__Impl7634);
            rule__KeywordParameter__KeywordAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordParameterAccess().getKeywordAssignment_0()); 
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
    // $ANTLR end "rule__KeywordParameter__Group__0__Impl"


    // $ANTLR start "rule__KeywordParameter__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3794:1: rule__KeywordParameter__Group__1 : rule__KeywordParameter__Group__1__Impl ;
    public final void rule__KeywordParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3798:1: ( rule__KeywordParameter__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3799:2: rule__KeywordParameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeywordParameter__Group__1__Impl_in_rule__KeywordParameter__Group__17664);
            rule__KeywordParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KeywordParameter__Group__1"


    // $ANTLR start "rule__KeywordParameter__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3805:1: rule__KeywordParameter__Group__1__Impl : ( ( rule__KeywordParameter__ValueAssignment_1 ) ) ;
    public final void rule__KeywordParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3809:1: ( ( ( rule__KeywordParameter__ValueAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3810:1: ( ( rule__KeywordParameter__ValueAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3810:1: ( ( rule__KeywordParameter__ValueAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3811:1: ( rule__KeywordParameter__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordParameterAccess().getValueAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3812:1: ( rule__KeywordParameter__ValueAssignment_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3812:2: rule__KeywordParameter__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeywordParameter__ValueAssignment_1_in_rule__KeywordParameter__Group__1__Impl7691);
            rule__KeywordParameter__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordParameterAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__KeywordParameter__Group__1__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3826:1: rule__MatchTraceExpression__Group__0 : rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1 ;
    public final void rule__MatchTraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3830:1: ( rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3831:2: rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__0__Impl_in_rule__MatchTraceExpression__Group__07725);
            rule__MatchTraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__1_in_rule__MatchTraceExpression__Group__07728);
            rule__MatchTraceExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group__0"


    // $ANTLR start "rule__MatchTraceExpression__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3838:1: rule__MatchTraceExpression__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchTraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3842:1: ( ( 'match' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3843:1: ( 'match' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3843:1: ( 'match' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3844:1: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MatchTraceExpression__Group__0__Impl7756); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group__0__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3857:1: rule__MatchTraceExpression__Group__1 : rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2 ;
    public final void rule__MatchTraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3861:1: ( rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3862:2: rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__1__Impl_in_rule__MatchTraceExpression__Group__17787);
            rule__MatchTraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__2_in_rule__MatchTraceExpression__Group__17790);
            rule__MatchTraceExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group__1"


    // $ANTLR start "rule__MatchTraceExpression__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3869:1: rule__MatchTraceExpression__Group__1__Impl : ( ( rule__MatchTraceExpression__Group_1__0 )? ) ;
    public final void rule__MatchTraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3873:1: ( ( ( rule__MatchTraceExpression__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3874:1: ( ( rule__MatchTraceExpression__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3874:1: ( ( rule__MatchTraceExpression__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3875:1: ( rule__MatchTraceExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3876:1: ( rule__MatchTraceExpression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==28) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3876:2: rule__MatchTraceExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__0_in_rule__MatchTraceExpression__Group__1__Impl7817);
                    rule__MatchTraceExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group__1__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3886:1: rule__MatchTraceExpression__Group__2 : rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3 ;
    public final void rule__MatchTraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3890:1: ( rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3891:2: rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__2__Impl_in_rule__MatchTraceExpression__Group__27848);
            rule__MatchTraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__3_in_rule__MatchTraceExpression__Group__27851);
            rule__MatchTraceExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group__2"


    // $ANTLR start "rule__MatchTraceExpression__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3898:1: rule__MatchTraceExpression__Group__2__Impl : ( ( rule__MatchTraceExpression__TraceAssignment_2 ) ) ;
    public final void rule__MatchTraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3902:1: ( ( ( rule__MatchTraceExpression__TraceAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3903:1: ( ( rule__MatchTraceExpression__TraceAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3903:1: ( ( rule__MatchTraceExpression__TraceAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3904:1: ( rule__MatchTraceExpression__TraceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3905:1: ( rule__MatchTraceExpression__TraceAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3905:2: rule__MatchTraceExpression__TraceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__TraceAssignment_2_in_rule__MatchTraceExpression__Group__2__Impl7878);
            rule__MatchTraceExpression__TraceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getTraceAssignment_2()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group__2__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3915:1: rule__MatchTraceExpression__Group__3 : rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4 ;
    public final void rule__MatchTraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3919:1: ( rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3920:2: rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__3__Impl_in_rule__MatchTraceExpression__Group__37908);
            rule__MatchTraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__4_in_rule__MatchTraceExpression__Group__37911);
            rule__MatchTraceExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group__3"


    // $ANTLR start "rule__MatchTraceExpression__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3927:1: rule__MatchTraceExpression__Group__3__Impl : ( 'with' ) ;
    public final void rule__MatchTraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3931:1: ( ( 'with' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3932:1: ( 'with' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3932:1: ( 'with' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3933:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MatchTraceExpression__Group__3__Impl7939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group__3__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group__4"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3946:1: rule__MatchTraceExpression__Group__4 : rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5 ;
    public final void rule__MatchTraceExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3950:1: ( rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3951:2: rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__4__Impl_in_rule__MatchTraceExpression__Group__47970);
            rule__MatchTraceExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__5_in_rule__MatchTraceExpression__Group__47973);
            rule__MatchTraceExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group__4"


    // $ANTLR start "rule__MatchTraceExpression__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3958:1: rule__MatchTraceExpression__Group__4__Impl : ( '[' ) ;
    public final void rule__MatchTraceExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3962:1: ( ( '[' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3963:1: ( '[' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3963:1: ( '[' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3964:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MatchTraceExpression__Group__4__Impl8001); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group__4__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group__5"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3977:1: rule__MatchTraceExpression__Group__5 : rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6 ;
    public final void rule__MatchTraceExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3981:1: ( rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3982:2: rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__5__Impl_in_rule__MatchTraceExpression__Group__58032);
            rule__MatchTraceExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__6_in_rule__MatchTraceExpression__Group__58035);
            rule__MatchTraceExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group__5"


    // $ANTLR start "rule__MatchTraceExpression__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3989:1: rule__MatchTraceExpression__Group__5__Impl : ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) ) ;
    public final void rule__MatchTraceExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3993:1: ( ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3994:1: ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3994:1: ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3995:1: ( rule__MatchTraceExpression__TraceExprAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceExprAssignment_5()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3996:1: ( rule__MatchTraceExpression__TraceExprAssignment_5 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3996:2: rule__MatchTraceExpression__TraceExprAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__TraceExprAssignment_5_in_rule__MatchTraceExpression__Group__5__Impl8062);
            rule__MatchTraceExpression__TraceExprAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getTraceExprAssignment_5()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group__5__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group__6"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4006:1: rule__MatchTraceExpression__Group__6 : rule__MatchTraceExpression__Group__6__Impl ;
    public final void rule__MatchTraceExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4010:1: ( rule__MatchTraceExpression__Group__6__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4011:2: rule__MatchTraceExpression__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__6__Impl_in_rule__MatchTraceExpression__Group__68092);
            rule__MatchTraceExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group__6"


    // $ANTLR start "rule__MatchTraceExpression__Group__6__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4017:1: rule__MatchTraceExpression__Group__6__Impl : ( ']' ) ;
    public final void rule__MatchTraceExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4021:1: ( ( ']' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4022:1: ( ']' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4022:1: ( ']' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4023:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getRightSquareBracketKeyword_6()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MatchTraceExpression__Group__6__Impl8120); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getRightSquareBracketKeyword_6()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group__6__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group_1__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4050:1: rule__MatchTraceExpression__Group_1__0 : rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1 ;
    public final void rule__MatchTraceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4054:1: ( rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4055:2: rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__0__Impl_in_rule__MatchTraceExpression__Group_1__08165);
            rule__MatchTraceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__1_in_rule__MatchTraceExpression__Group_1__08168);
            rule__MatchTraceExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group_1__0"


    // $ANTLR start "rule__MatchTraceExpression__Group_1__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4062:1: rule__MatchTraceExpression__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__MatchTraceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4066:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4067:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4067:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4068:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchTraceExpression__Group_1__0__Impl8195); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MatchTraceExpression__Group_1__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4079:1: rule__MatchTraceExpression__Group_1__1 : rule__MatchTraceExpression__Group_1__1__Impl ;
    public final void rule__MatchTraceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4083:1: ( rule__MatchTraceExpression__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4084:2: rule__MatchTraceExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__1__Impl_in_rule__MatchTraceExpression__Group_1__18224);
            rule__MatchTraceExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MatchTraceExpression__Group_1__1"


    // $ANTLR start "rule__MatchTraceExpression__Group_1__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4090:1: rule__MatchTraceExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__MatchTraceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4094:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4095:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4095:1: ( '!' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4096:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MatchTraceExpression__Group_1__1__Impl8252); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1()); 
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
    // $ANTLR end "rule__MatchTraceExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TraceExprLanguage__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4113:1: rule__TraceExprLanguage__Group__0 : rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1 ;
    public final void rule__TraceExprLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4117:1: ( rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4118:2: rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__0__Impl_in_rule__TraceExprLanguage__Group__08287);
            rule__TraceExprLanguage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__1_in_rule__TraceExprLanguage__Group__08290);
            rule__TraceExprLanguage__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceExprLanguage__Group__0"


    // $ANTLR start "rule__TraceExprLanguage__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4125:1: rule__TraceExprLanguage__Group__0__Impl : ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) ) ;
    public final void rule__TraceExprLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4129:1: ( ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4130:1: ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4130:1: ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4131:1: ( rule__TraceExprLanguage__TraceVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4132:1: ( rule__TraceExprLanguage__TraceVarAssignment_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4132:2: rule__TraceExprLanguage__TraceVarAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__TraceVarAssignment_0_in_rule__TraceExprLanguage__Group__0__Impl8317);
            rule__TraceExprLanguage__TraceVarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageAccess().getTraceVarAssignment_0()); 
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
    // $ANTLR end "rule__TraceExprLanguage__Group__0__Impl"


    // $ANTLR start "rule__TraceExprLanguage__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4142:1: rule__TraceExprLanguage__Group__1 : rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2 ;
    public final void rule__TraceExprLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4146:1: ( rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4147:2: rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__1__Impl_in_rule__TraceExprLanguage__Group__18347);
            rule__TraceExprLanguage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__2_in_rule__TraceExprLanguage__Group__18350);
            rule__TraceExprLanguage__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceExprLanguage__Group__1"


    // $ANTLR start "rule__TraceExprLanguage__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4154:1: rule__TraceExprLanguage__Group__1__Impl : ( '=' ) ;
    public final void rule__TraceExprLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4158:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4159:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4159:1: ( '=' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4160:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TraceExprLanguage__Group__1__Impl8378); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__TraceExprLanguage__Group__1__Impl"


    // $ANTLR start "rule__TraceExprLanguage__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4173:1: rule__TraceExprLanguage__Group__2 : rule__TraceExprLanguage__Group__2__Impl ;
    public final void rule__TraceExprLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4177:1: ( rule__TraceExprLanguage__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4178:2: rule__TraceExprLanguage__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__2__Impl_in_rule__TraceExprLanguage__Group__28409);
            rule__TraceExprLanguage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TraceExprLanguage__Group__2"


    // $ANTLR start "rule__TraceExprLanguage__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4184:1: rule__TraceExprLanguage__Group__2__Impl : ( ( rule__TraceExprLanguage__ExprAssignment_2 ) ) ;
    public final void rule__TraceExprLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4188:1: ( ( ( rule__TraceExprLanguage__ExprAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4189:1: ( ( rule__TraceExprLanguage__ExprAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4189:1: ( ( rule__TraceExprLanguage__ExprAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4190:1: ( rule__TraceExprLanguage__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getExprAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4191:1: ( rule__TraceExprLanguage__ExprAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4191:2: rule__TraceExprLanguage__ExprAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__ExprAssignment_2_in_rule__TraceExprLanguage__Group__2__Impl8436);
            rule__TraceExprLanguage__ExprAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageAccess().getExprAssignment_2()); 
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
    // $ANTLR end "rule__TraceExprLanguage__Group__2__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4207:1: rule__PutTraceExpression__Group__0 : rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1 ;
    public final void rule__PutTraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4211:1: ( rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4212:2: rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__0__Impl_in_rule__PutTraceExpression__Group__08472);
            rule__PutTraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__1_in_rule__PutTraceExpression__Group__08475);
            rule__PutTraceExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group__0"


    // $ANTLR start "rule__PutTraceExpression__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4219:1: rule__PutTraceExpression__Group__0__Impl : ( 'put' ) ;
    public final void rule__PutTraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4223:1: ( ( 'put' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4224:1: ( 'put' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4224:1: ( 'put' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4225:1: 'put'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getPutKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PutTraceExpression__Group__0__Impl8503); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getPutKeyword_0()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group__0__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4238:1: rule__PutTraceExpression__Group__1 : rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2 ;
    public final void rule__PutTraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4242:1: ( rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4243:2: rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__1__Impl_in_rule__PutTraceExpression__Group__18534);
            rule__PutTraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__2_in_rule__PutTraceExpression__Group__18537);
            rule__PutTraceExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group__1"


    // $ANTLR start "rule__PutTraceExpression__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4250:1: rule__PutTraceExpression__Group__1__Impl : ( ( rule__PutTraceExpression__Group_1__0 )? ) ;
    public final void rule__PutTraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4254:1: ( ( ( rule__PutTraceExpression__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4255:1: ( ( rule__PutTraceExpression__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4255:1: ( ( rule__PutTraceExpression__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4256:1: ( rule__PutTraceExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4257:1: ( rule__PutTraceExpression__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==28) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4257:2: rule__PutTraceExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__0_in_rule__PutTraceExpression__Group__1__Impl8564);
                    rule__PutTraceExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group__1__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4267:1: rule__PutTraceExpression__Group__2 : rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3 ;
    public final void rule__PutTraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4271:1: ( rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4272:2: rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__2__Impl_in_rule__PutTraceExpression__Group__28595);
            rule__PutTraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__3_in_rule__PutTraceExpression__Group__28598);
            rule__PutTraceExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group__2"


    // $ANTLR start "rule__PutTraceExpression__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4279:1: rule__PutTraceExpression__Group__2__Impl : ( ( rule__PutTraceExpression__TraceAssignment_2 ) ) ;
    public final void rule__PutTraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4283:1: ( ( ( rule__PutTraceExpression__TraceAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4284:1: ( ( rule__PutTraceExpression__TraceAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4284:1: ( ( rule__PutTraceExpression__TraceAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4285:1: ( rule__PutTraceExpression__TraceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4286:1: ( rule__PutTraceExpression__TraceAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4286:2: rule__PutTraceExpression__TraceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__TraceAssignment_2_in_rule__PutTraceExpression__Group__2__Impl8625);
            rule__PutTraceExpression__TraceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getTraceAssignment_2()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group__2__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4296:1: rule__PutTraceExpression__Group__3 : rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4 ;
    public final void rule__PutTraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4300:1: ( rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4301:2: rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__3__Impl_in_rule__PutTraceExpression__Group__38655);
            rule__PutTraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__4_in_rule__PutTraceExpression__Group__38658);
            rule__PutTraceExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group__3"


    // $ANTLR start "rule__PutTraceExpression__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4308:1: rule__PutTraceExpression__Group__3__Impl : ( 'with' ) ;
    public final void rule__PutTraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4312:1: ( ( 'with' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4313:1: ( 'with' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4313:1: ( 'with' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4314:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getWithKeyword_3()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PutTraceExpression__Group__3__Impl8686); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getWithKeyword_3()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group__3__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group__4"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4327:1: rule__PutTraceExpression__Group__4 : rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5 ;
    public final void rule__PutTraceExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4331:1: ( rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4332:2: rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__4__Impl_in_rule__PutTraceExpression__Group__48717);
            rule__PutTraceExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__5_in_rule__PutTraceExpression__Group__48720);
            rule__PutTraceExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group__4"


    // $ANTLR start "rule__PutTraceExpression__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4339:1: rule__PutTraceExpression__Group__4__Impl : ( '[' ) ;
    public final void rule__PutTraceExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4343:1: ( ( '[' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4344:1: ( '[' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4344:1: ( '[' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4345:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getLeftSquareBracketKeyword_4()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__PutTraceExpression__Group__4__Impl8748); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getLeftSquareBracketKeyword_4()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group__4__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group__5"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4358:1: rule__PutTraceExpression__Group__5 : rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6 ;
    public final void rule__PutTraceExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4362:1: ( rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4363:2: rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__5__Impl_in_rule__PutTraceExpression__Group__58779);
            rule__PutTraceExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__6_in_rule__PutTraceExpression__Group__58782);
            rule__PutTraceExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group__5"


    // $ANTLR start "rule__PutTraceExpression__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4370:1: rule__PutTraceExpression__Group__5__Impl : ( ( rule__PutTraceExpression__ParametersAssignment_5 ) ) ;
    public final void rule__PutTraceExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4374:1: ( ( ( rule__PutTraceExpression__ParametersAssignment_5 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4375:1: ( ( rule__PutTraceExpression__ParametersAssignment_5 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4375:1: ( ( rule__PutTraceExpression__ParametersAssignment_5 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4376:1: ( rule__PutTraceExpression__ParametersAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_5()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4377:1: ( rule__PutTraceExpression__ParametersAssignment_5 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4377:2: rule__PutTraceExpression__ParametersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__ParametersAssignment_5_in_rule__PutTraceExpression__Group__5__Impl8809);
            rule__PutTraceExpression__ParametersAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_5()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group__5__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group__6"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4387:1: rule__PutTraceExpression__Group__6 : rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7 ;
    public final void rule__PutTraceExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4391:1: ( rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4392:2: rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__6__Impl_in_rule__PutTraceExpression__Group__68839);
            rule__PutTraceExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__7_in_rule__PutTraceExpression__Group__68842);
            rule__PutTraceExpression__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group__6"


    // $ANTLR start "rule__PutTraceExpression__Group__6__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4399:1: rule__PutTraceExpression__Group__6__Impl : ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) ) ;
    public final void rule__PutTraceExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4403:1: ( ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4404:1: ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4404:1: ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4405:1: ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4405:1: ( ( rule__PutTraceExpression__Group_6__0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4406:1: ( rule__PutTraceExpression__Group_6__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4407:1: ( rule__PutTraceExpression__Group_6__0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4407:2: rule__PutTraceExpression__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl8871);
            rule__PutTraceExpression__Group_6__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }

            }

            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4410:1: ( ( rule__PutTraceExpression__Group_6__0 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4411:1: ( rule__PutTraceExpression__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4412:1: ( rule__PutTraceExpression__Group_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4412:2: rule__PutTraceExpression__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl8883);
            	    rule__PutTraceExpression__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }

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
    // $ANTLR end "rule__PutTraceExpression__Group__6__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group__7"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4423:1: rule__PutTraceExpression__Group__7 : rule__PutTraceExpression__Group__7__Impl ;
    public final void rule__PutTraceExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4427:1: ( rule__PutTraceExpression__Group__7__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4428:2: rule__PutTraceExpression__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__7__Impl_in_rule__PutTraceExpression__Group__78916);
            rule__PutTraceExpression__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group__7"


    // $ANTLR start "rule__PutTraceExpression__Group__7__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4434:1: rule__PutTraceExpression__Group__7__Impl : ( ']' ) ;
    public final void rule__PutTraceExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4438:1: ( ( ']' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4439:1: ( ']' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4439:1: ( ']' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4440:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getRightSquareBracketKeyword_7()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__PutTraceExpression__Group__7__Impl8944); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getRightSquareBracketKeyword_7()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group__7__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group_1__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4469:1: rule__PutTraceExpression__Group_1__0 : rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1 ;
    public final void rule__PutTraceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4473:1: ( rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4474:2: rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__0__Impl_in_rule__PutTraceExpression__Group_1__08991);
            rule__PutTraceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__1_in_rule__PutTraceExpression__Group_1__08994);
            rule__PutTraceExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group_1__0"


    // $ANTLR start "rule__PutTraceExpression__Group_1__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4481:1: rule__PutTraceExpression__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__PutTraceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4485:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4486:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4486:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4487:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceExpression__Group_1__0__Impl9021); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group_1__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4498:1: rule__PutTraceExpression__Group_1__1 : rule__PutTraceExpression__Group_1__1__Impl ;
    public final void rule__PutTraceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4502:1: ( rule__PutTraceExpression__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4503:2: rule__PutTraceExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__1__Impl_in_rule__PutTraceExpression__Group_1__19050);
            rule__PutTraceExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group_1__1"


    // $ANTLR start "rule__PutTraceExpression__Group_1__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4509:1: rule__PutTraceExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__PutTraceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4513:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4514:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4514:1: ( '!' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4515:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__PutTraceExpression__Group_1__1__Impl9078); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getExclamationMarkKeyword_1_1()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group_6__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4532:1: rule__PutTraceExpression__Group_6__0 : rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1 ;
    public final void rule__PutTraceExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4536:1: ( rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4537:2: rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0__Impl_in_rule__PutTraceExpression__Group_6__09113);
            rule__PutTraceExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__1_in_rule__PutTraceExpression__Group_6__09116);
            rule__PutTraceExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group_6__0"


    // $ANTLR start "rule__PutTraceExpression__Group_6__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4544:1: rule__PutTraceExpression__Group_6__0__Impl : ( ',' ) ;
    public final void rule__PutTraceExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4548:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4549:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4549:1: ( ',' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4550:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getCommaKeyword_6_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__PutTraceExpression__Group_6__0__Impl9144); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getCommaKeyword_6_0()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group_6__0__Impl"


    // $ANTLR start "rule__PutTraceExpression__Group_6__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4563:1: rule__PutTraceExpression__Group_6__1 : rule__PutTraceExpression__Group_6__1__Impl ;
    public final void rule__PutTraceExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4567:1: ( rule__PutTraceExpression__Group_6__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4568:2: rule__PutTraceExpression__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__1__Impl_in_rule__PutTraceExpression__Group_6__19175);
            rule__PutTraceExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceExpression__Group_6__1"


    // $ANTLR start "rule__PutTraceExpression__Group_6__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4574:1: rule__PutTraceExpression__Group_6__1__Impl : ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) ) ;
    public final void rule__PutTraceExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4578:1: ( ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4579:1: ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4579:1: ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4580:1: ( rule__PutTraceExpression__ParametersAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_6_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4581:1: ( rule__PutTraceExpression__ParametersAssignment_6_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4581:2: rule__PutTraceExpression__ParametersAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__ParametersAssignment_6_1_in_rule__PutTraceExpression__Group_6__1__Impl9202);
            rule__PutTraceExpression__ParametersAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_6_1()); 
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
    // $ANTLR end "rule__PutTraceExpression__Group_6__1__Impl"


    // $ANTLR start "rule__PutTraceParameter__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4595:1: rule__PutTraceParameter__Group__0 : rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1 ;
    public final void rule__PutTraceParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4599:1: ( rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4600:2: rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__0__Impl_in_rule__PutTraceParameter__Group__09236);
            rule__PutTraceParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__1_in_rule__PutTraceParameter__Group__09239);
            rule__PutTraceParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceParameter__Group__0"


    // $ANTLR start "rule__PutTraceParameter__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4607:1: rule__PutTraceParameter__Group__0__Impl : ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) ) ;
    public final void rule__PutTraceParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4611:1: ( ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4612:1: ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4612:1: ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4613:1: ( rule__PutTraceParameter__TraceVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4614:1: ( rule__PutTraceParameter__TraceVarAssignment_0 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4614:2: rule__PutTraceParameter__TraceVarAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__TraceVarAssignment_0_in_rule__PutTraceParameter__Group__0__Impl9266);
            rule__PutTraceParameter__TraceVarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterAccess().getTraceVarAssignment_0()); 
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
    // $ANTLR end "rule__PutTraceParameter__Group__0__Impl"


    // $ANTLR start "rule__PutTraceParameter__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4624:1: rule__PutTraceParameter__Group__1 : rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2 ;
    public final void rule__PutTraceParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4628:1: ( rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4629:2: rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__1__Impl_in_rule__PutTraceParameter__Group__19296);
            rule__PutTraceParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__2_in_rule__PutTraceParameter__Group__19299);
            rule__PutTraceParameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceParameter__Group__1"


    // $ANTLR start "rule__PutTraceParameter__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4636:1: rule__PutTraceParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__PutTraceParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4640:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4641:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4641:1: ( '=' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4642:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PutTraceParameter__Group__1__Impl9327); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__PutTraceParameter__Group__1__Impl"


    // $ANTLR start "rule__PutTraceParameter__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4655:1: rule__PutTraceParameter__Group__2 : rule__PutTraceParameter__Group__2__Impl ;
    public final void rule__PutTraceParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4659:1: ( rule__PutTraceParameter__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4660:2: rule__PutTraceParameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__2__Impl_in_rule__PutTraceParameter__Group__29358);
            rule__PutTraceParameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PutTraceParameter__Group__2"


    // $ANTLR start "rule__PutTraceParameter__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4666:1: rule__PutTraceParameter__Group__2__Impl : ( ( rule__PutTraceParameter__ValueAssignment_2 ) ) ;
    public final void rule__PutTraceParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4670:1: ( ( ( rule__PutTraceParameter__ValueAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4671:1: ( ( rule__PutTraceParameter__ValueAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4671:1: ( ( rule__PutTraceParameter__ValueAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4672:1: ( rule__PutTraceParameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getValueAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4673:1: ( rule__PutTraceParameter__ValueAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4673:2: rule__PutTraceParameter__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__ValueAssignment_2_in_rule__PutTraceParameter__Group__2__Impl9385);
            rule__PutTraceParameter__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__PutTraceParameter__Group__2__Impl"


    // $ANTLR start "rule__KoanRule__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4689:1: rule__KoanRule__Group__0 : rule__KoanRule__Group__0__Impl rule__KoanRule__Group__1 ;
    public final void rule__KoanRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4693:1: ( rule__KoanRule__Group__0__Impl rule__KoanRule__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4694:2: rule__KoanRule__Group__0__Impl rule__KoanRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__0__Impl_in_rule__KoanRule__Group__09421);
            rule__KoanRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__1_in_rule__KoanRule__Group__09424);
            rule__KoanRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KoanRule__Group__0"


    // $ANTLR start "rule__KoanRule__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4701:1: rule__KoanRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__KoanRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4705:1: ( ( 'rule' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4706:1: ( 'rule' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4706:1: ( 'rule' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4707:1: 'rule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getRuleKeyword_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__KoanRule__Group__0__Impl9452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getRuleKeyword_0()); 
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
    // $ANTLR end "rule__KoanRule__Group__0__Impl"


    // $ANTLR start "rule__KoanRule__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4720:1: rule__KoanRule__Group__1 : rule__KoanRule__Group__1__Impl rule__KoanRule__Group__2 ;
    public final void rule__KoanRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4724:1: ( rule__KoanRule__Group__1__Impl rule__KoanRule__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4725:2: rule__KoanRule__Group__1__Impl rule__KoanRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__1__Impl_in_rule__KoanRule__Group__19483);
            rule__KoanRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__2_in_rule__KoanRule__Group__19486);
            rule__KoanRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KoanRule__Group__1"


    // $ANTLR start "rule__KoanRule__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4732:1: rule__KoanRule__Group__1__Impl : ( ( rule__KoanRule__NameAssignment_1 ) ) ;
    public final void rule__KoanRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4736:1: ( ( ( rule__KoanRule__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4737:1: ( ( rule__KoanRule__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4737:1: ( ( rule__KoanRule__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4738:1: ( rule__KoanRule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4739:1: ( rule__KoanRule__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4739:2: rule__KoanRule__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__NameAssignment_1_in_rule__KoanRule__Group__1__Impl9513);
            rule__KoanRule__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__KoanRule__Group__1__Impl"


    // $ANTLR start "rule__KoanRule__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4749:1: rule__KoanRule__Group__2 : rule__KoanRule__Group__2__Impl rule__KoanRule__Group__3 ;
    public final void rule__KoanRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4753:1: ( rule__KoanRule__Group__2__Impl rule__KoanRule__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4754:2: rule__KoanRule__Group__2__Impl rule__KoanRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__2__Impl_in_rule__KoanRule__Group__29543);
            rule__KoanRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__3_in_rule__KoanRule__Group__29546);
            rule__KoanRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KoanRule__Group__2"


    // $ANTLR start "rule__KoanRule__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4761:1: rule__KoanRule__Group__2__Impl : ( ( rule__KoanRule__MatcherAssignment_2 ) ) ;
    public final void rule__KoanRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4765:1: ( ( ( rule__KoanRule__MatcherAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4766:1: ( ( rule__KoanRule__MatcherAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4766:1: ( ( rule__KoanRule__MatcherAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4767:1: ( rule__KoanRule__MatcherAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getMatcherAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4768:1: ( rule__KoanRule__MatcherAssignment_2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4768:2: rule__KoanRule__MatcherAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__MatcherAssignment_2_in_rule__KoanRule__Group__2__Impl9573);
            rule__KoanRule__MatcherAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getMatcherAssignment_2()); 
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
    // $ANTLR end "rule__KoanRule__Group__2__Impl"


    // $ANTLR start "rule__KoanRule__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4778:1: rule__KoanRule__Group__3 : rule__KoanRule__Group__3__Impl rule__KoanRule__Group__4 ;
    public final void rule__KoanRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4782:1: ( rule__KoanRule__Group__3__Impl rule__KoanRule__Group__4 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4783:2: rule__KoanRule__Group__3__Impl rule__KoanRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__3__Impl_in_rule__KoanRule__Group__39603);
            rule__KoanRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__4_in_rule__KoanRule__Group__39606);
            rule__KoanRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KoanRule__Group__3"


    // $ANTLR start "rule__KoanRule__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4790:1: rule__KoanRule__Group__3__Impl : ( ( ( rule__KoanRule__StatementsAssignment_3 ) ) ( ( rule__KoanRule__StatementsAssignment_3 )* ) ) ;
    public final void rule__KoanRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4794:1: ( ( ( ( rule__KoanRule__StatementsAssignment_3 ) ) ( ( rule__KoanRule__StatementsAssignment_3 )* ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4795:1: ( ( ( rule__KoanRule__StatementsAssignment_3 ) ) ( ( rule__KoanRule__StatementsAssignment_3 )* ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4795:1: ( ( ( rule__KoanRule__StatementsAssignment_3 ) ) ( ( rule__KoanRule__StatementsAssignment_3 )* ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4796:1: ( ( rule__KoanRule__StatementsAssignment_3 ) ) ( ( rule__KoanRule__StatementsAssignment_3 )* )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4796:1: ( ( rule__KoanRule__StatementsAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4797:1: ( rule__KoanRule__StatementsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getStatementsAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4798:1: ( rule__KoanRule__StatementsAssignment_3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4798:2: rule__KoanRule__StatementsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__StatementsAssignment_3_in_rule__KoanRule__Group__3__Impl9635);
            rule__KoanRule__StatementsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getStatementsAssignment_3()); 
            }

            }

            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4801:1: ( ( rule__KoanRule__StatementsAssignment_3 )* )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4802:1: ( rule__KoanRule__StatementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getStatementsAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4803:1: ( rule__KoanRule__StatementsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||LA22_0==13||LA22_0==17||LA22_0==23||LA22_0==33||LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4803:2: rule__KoanRule__StatementsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KoanRule__StatementsAssignment_3_in_rule__KoanRule__Group__3__Impl9647);
            	    rule__KoanRule__StatementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getStatementsAssignment_3()); 
            }

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
    // $ANTLR end "rule__KoanRule__Group__3__Impl"


    // $ANTLR start "rule__KoanRule__Group__4"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4814:1: rule__KoanRule__Group__4 : rule__KoanRule__Group__4__Impl ;
    public final void rule__KoanRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4818:1: ( rule__KoanRule__Group__4__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4819:2: rule__KoanRule__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KoanRule__Group__4__Impl_in_rule__KoanRule__Group__49680);
            rule__KoanRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KoanRule__Group__4"


    // $ANTLR start "rule__KoanRule__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4825:1: rule__KoanRule__Group__4__Impl : ( 'end' ) ;
    public final void rule__KoanRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4829:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4830:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4830:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4831:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getEndKeyword_4()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__KoanRule__Group__4__Impl9708); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__KoanRule__Group__4__Impl"


    // $ANTLR start "rule__ForAllMatcher__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4854:1: rule__ForAllMatcher__Group__0 : rule__ForAllMatcher__Group__0__Impl rule__ForAllMatcher__Group__1 ;
    public final void rule__ForAllMatcher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4858:1: ( rule__ForAllMatcher__Group__0__Impl rule__ForAllMatcher__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4859:2: rule__ForAllMatcher__Group__0__Impl rule__ForAllMatcher__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__0__Impl_in_rule__ForAllMatcher__Group__09749);
            rule__ForAllMatcher__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__1_in_rule__ForAllMatcher__Group__09752);
            rule__ForAllMatcher__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForAllMatcher__Group__0"


    // $ANTLR start "rule__ForAllMatcher__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4866:1: rule__ForAllMatcher__Group__0__Impl : ( 'forAll' ) ;
    public final void rule__ForAllMatcher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4870:1: ( ( 'forAll' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4871:1: ( 'forAll' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4871:1: ( 'forAll' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4872:1: 'forAll'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getForAllKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ForAllMatcher__Group__0__Impl9780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getForAllKeyword_0()); 
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
    // $ANTLR end "rule__ForAllMatcher__Group__0__Impl"


    // $ANTLR start "rule__ForAllMatcher__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4885:1: rule__ForAllMatcher__Group__1 : rule__ForAllMatcher__Group__1__Impl rule__ForAllMatcher__Group__2 ;
    public final void rule__ForAllMatcher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4889:1: ( rule__ForAllMatcher__Group__1__Impl rule__ForAllMatcher__Group__2 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4890:2: rule__ForAllMatcher__Group__1__Impl rule__ForAllMatcher__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__1__Impl_in_rule__ForAllMatcher__Group__19811);
            rule__ForAllMatcher__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__2_in_rule__ForAllMatcher__Group__19814);
            rule__ForAllMatcher__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForAllMatcher__Group__1"


    // $ANTLR start "rule__ForAllMatcher__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4897:1: rule__ForAllMatcher__Group__1__Impl : ( ( rule__ForAllMatcher__NameAssignment_1 ) ) ;
    public final void rule__ForAllMatcher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4901:1: ( ( ( rule__ForAllMatcher__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4902:1: ( ( rule__ForAllMatcher__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4902:1: ( ( rule__ForAllMatcher__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4903:1: ( rule__ForAllMatcher__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4904:1: ( rule__ForAllMatcher__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4904:2: rule__ForAllMatcher__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__NameAssignment_1_in_rule__ForAllMatcher__Group__1__Impl9841);
            rule__ForAllMatcher__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ForAllMatcher__Group__1__Impl"


    // $ANTLR start "rule__ForAllMatcher__Group__2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4914:1: rule__ForAllMatcher__Group__2 : rule__ForAllMatcher__Group__2__Impl rule__ForAllMatcher__Group__3 ;
    public final void rule__ForAllMatcher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4918:1: ( rule__ForAllMatcher__Group__2__Impl rule__ForAllMatcher__Group__3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4919:2: rule__ForAllMatcher__Group__2__Impl rule__ForAllMatcher__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__2__Impl_in_rule__ForAllMatcher__Group__29871);
            rule__ForAllMatcher__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__3_in_rule__ForAllMatcher__Group__29874);
            rule__ForAllMatcher__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForAllMatcher__Group__2"


    // $ANTLR start "rule__ForAllMatcher__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4926:1: rule__ForAllMatcher__Group__2__Impl : ( ':' ) ;
    public final void rule__ForAllMatcher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4930:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4931:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4931:1: ( ':' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4932:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getColonKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ForAllMatcher__Group__2__Impl9902); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__ForAllMatcher__Group__2__Impl"


    // $ANTLR start "rule__ForAllMatcher__Group__3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4945:1: rule__ForAllMatcher__Group__3 : rule__ForAllMatcher__Group__3__Impl rule__ForAllMatcher__Group__4 ;
    public final void rule__ForAllMatcher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4949:1: ( rule__ForAllMatcher__Group__3__Impl rule__ForAllMatcher__Group__4 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4950:2: rule__ForAllMatcher__Group__3__Impl rule__ForAllMatcher__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__3__Impl_in_rule__ForAllMatcher__Group__39933);
            rule__ForAllMatcher__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__4_in_rule__ForAllMatcher__Group__39936);
            rule__ForAllMatcher__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForAllMatcher__Group__3"


    // $ANTLR start "rule__ForAllMatcher__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4957:1: rule__ForAllMatcher__Group__3__Impl : ( ( rule__ForAllMatcher__TypeAssignment_3 ) ) ;
    public final void rule__ForAllMatcher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4961:1: ( ( ( rule__ForAllMatcher__TypeAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4962:1: ( ( rule__ForAllMatcher__TypeAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4962:1: ( ( rule__ForAllMatcher__TypeAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4963:1: ( rule__ForAllMatcher__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getTypeAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4964:1: ( rule__ForAllMatcher__TypeAssignment_3 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4964:2: rule__ForAllMatcher__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__TypeAssignment_3_in_rule__ForAllMatcher__Group__3__Impl9963);
            rule__ForAllMatcher__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__ForAllMatcher__Group__3__Impl"


    // $ANTLR start "rule__ForAllMatcher__Group__4"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4974:1: rule__ForAllMatcher__Group__4 : rule__ForAllMatcher__Group__4__Impl ;
    public final void rule__ForAllMatcher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4978:1: ( rule__ForAllMatcher__Group__4__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4979:2: rule__ForAllMatcher__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__Group__4__Impl_in_rule__ForAllMatcher__Group__49993);
            rule__ForAllMatcher__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForAllMatcher__Group__4"


    // $ANTLR start "rule__ForAllMatcher__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4985:1: rule__ForAllMatcher__Group__4__Impl : ( ( rule__ForAllMatcher__ChildAssignment_4 )? ) ;
    public final void rule__ForAllMatcher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4989:1: ( ( ( rule__ForAllMatcher__ChildAssignment_4 )? ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4990:1: ( ( rule__ForAllMatcher__ChildAssignment_4 )? )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4990:1: ( ( rule__ForAllMatcher__ChildAssignment_4 )? )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4991:1: ( rule__ForAllMatcher__ChildAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getChildAssignment_4()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4992:1: ( rule__ForAllMatcher__ChildAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:4992:2: rule__ForAllMatcher__ChildAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ForAllMatcher__ChildAssignment_4_in_rule__ForAllMatcher__Group__4__Impl10020);
                    rule__ForAllMatcher__ChildAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getChildAssignment_4()); 
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
    // $ANTLR end "rule__ForAllMatcher__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5012:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5016:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5017:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__010061);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__010064);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5024:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5028:1: ( ( ( '-' )? ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5029:1: ( ( '-' )? )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5029:1: ( ( '-' )? )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5030:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5031:1: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5032:2: '-'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EInt__Group__0__Impl10093); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5043:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5047:1: ( rule__EInt__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5048:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__110126);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5054:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5058:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5059:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5059:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5060:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl10153); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__MappingTransformation__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5076:1: rule__MappingTransformation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MappingTransformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5080:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5081:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5081:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5082:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MappingTransformation__NameAssignment_110191);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__MappingTransformation__NameAssignment_1"


    // $ANTLR start "rule__MappingTransformation__InModelsAssignment_3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5091:1: rule__MappingTransformation__InModelsAssignment_3 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__MappingTransformation__InModelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5095:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5096:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5096:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5097:1: ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__InModelsAssignment_310222);
            ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__MappingTransformation__InModelsAssignment_3"


    // $ANTLR start "rule__MappingTransformation__OutModelsAssignment_7"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5106:1: rule__MappingTransformation__OutModelsAssignment_7 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__MappingTransformation__OutModelsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5110:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5111:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5111:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5112:1: ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__OutModelsAssignment_710253);
            ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__MappingTransformation__OutModelsAssignment_7"


    // $ANTLR start "rule__MappingTransformation__TraceInterfaceAssignment_9"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5121:1: rule__MappingTransformation__TraceInterfaceAssignment_9 : ( ruleTraceInterface ) ;
    public final void rule__MappingTransformation__TraceInterfaceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5125:1: ( ( ruleTraceInterface ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5126:1: ( ruleTraceInterface )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5126:1: ( ruleTraceInterface )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5127:1: ruleTraceInterface
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getTraceInterfaceTraceInterfaceParserRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceInterface_in_rule__MappingTransformation__TraceInterfaceAssignment_910284);
            ruleTraceInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getTraceInterfaceTraceInterfaceParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__MappingTransformation__TraceInterfaceAssignment_9"


    // $ANTLR start "rule__MappingTransformation__RulesAssignment_10"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5136:1: rule__MappingTransformation__RulesAssignment_10 : ( ruleKoanRule ) ;
    public final void rule__MappingTransformation__RulesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5140:1: ( ( ruleKoanRule ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5141:1: ( ruleKoanRule )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5141:1: ( ruleKoanRule )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5142:1: ruleKoanRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingTransformationAccess().getRulesKoanRuleParserRuleCall_10_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKoanRule_in_rule__MappingTransformation__RulesAssignment_1010315);
            ruleKoanRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingTransformationAccess().getRulesKoanRuleParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__MappingTransformation__RulesAssignment_10"


    // $ANTLR start "rule__TransformationDefinitionParameter__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5151:1: rule__TransformationDefinitionParameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TransformationDefinitionParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5155:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5156:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5156:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5157:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TransformationDefinitionParameter__NameAssignment_110346);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TransformationDefinitionParameter__NameAssignment_1"


    // $ANTLR start "rule__TraceInterface__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5166:1: rule__TraceInterface__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TraceInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5170:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5171:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5171:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5172:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceInterface__NameAssignment_110377);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TraceInterface__NameAssignment_1"


    // $ANTLR start "rule__TraceInterface__DefinitionsAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5181:1: rule__TraceInterface__DefinitionsAssignment_2 : ( ruleTraceDefinition ) ;
    public final void rule__TraceInterface__DefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5185:1: ( ( ruleTraceDefinition ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5186:1: ( ruleTraceDefinition )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5186:1: ( ruleTraceDefinition )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5187:1: ruleTraceDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getDefinitionsTraceDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_rule__TraceInterface__DefinitionsAssignment_210408);
            ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getDefinitionsTraceDefinitionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TraceInterface__DefinitionsAssignment_2"


    // $ANTLR start "rule__TraceDefinition__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5196:1: rule__TraceDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TraceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5200:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5201:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5201:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5202:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceDefinition__NameAssignment_110439);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TraceDefinition__NameAssignment_1"


    // $ANTLR start "rule__TraceDefinition__ElementsAssignment_2_0_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5211:1: rule__TraceDefinition__ElementsAssignment_2_0_1 : ( ruleTraceElementInline ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5215:1: ( ( ruleTraceElementInline ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5216:1: ( ruleTraceElementInline )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5216:1: ( ruleTraceElementInline )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5217:1: ruleTraceElementInline
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_110470);
            ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
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
    // $ANTLR end "rule__TraceDefinition__ElementsAssignment_2_0_1"


    // $ANTLR start "rule__TraceDefinition__ElementsAssignment_2_0_2_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5226:1: rule__TraceDefinition__ElementsAssignment_2_0_2_1 : ( ruleTraceElementInline ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5230:1: ( ( ruleTraceElementInline ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5231:1: ( ruleTraceElementInline )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5231:1: ( ruleTraceElementInline )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5232:1: ruleTraceElementInline
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_2_110501);
            ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
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
    // $ANTLR end "rule__TraceDefinition__ElementsAssignment_2_0_2_1"


    // $ANTLR start "rule__TraceDefinition__ElementsAssignment_2_1_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5241:1: rule__TraceDefinition__ElementsAssignment_2_1_0 : ( ruleTraceElementExpanded ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5245:1: ( ( ruleTraceElementExpanded ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5246:1: ( ruleTraceElementExpanded )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5246:1: ( ruleTraceElementExpanded )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5247:1: ruleTraceElementExpanded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_010532);
            ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__TraceDefinition__ElementsAssignment_2_1_0"


    // $ANTLR start "rule__TraceDefinition__ElementsAssignment_2_1_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5256:1: rule__TraceDefinition__ElementsAssignment_2_1_1 : ( ruleTraceElementExpanded ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5260:1: ( ( ruleTraceElementExpanded ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5261:1: ( ruleTraceElementExpanded )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5261:1: ( ruleTraceElementExpanded )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5262:1: ruleTraceElementExpanded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_110563);
            ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__TraceDefinition__ElementsAssignment_2_1_1"


    // $ANTLR start "rule__TraceElementInline__NameAssignment_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5271:1: rule__TraceElementInline__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__TraceElementInline__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5275:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5276:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5276:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5277:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceElementInline__NameAssignment_010594);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__TraceElementInline__NameAssignment_0"


    // $ANTLR start "rule__TraceElementInline__TypeAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5286:1: rule__TraceElementInline__TypeAssignment_2 : ( ruleTypeExpression ) ;
    public final void rule__TraceElementInline__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5290:1: ( ( ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5291:1: ( ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5291:1: ( ruleTypeExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5292:1: ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_rule__TraceElementInline__TypeAssignment_210625);
            ruleTypeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TraceElementInline__TypeAssignment_2"


    // $ANTLR start "rule__TraceElementExpanded__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5301:1: rule__TraceElementExpanded__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TraceElementExpanded__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5305:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5306:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5306:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5307:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceElementExpanded__NameAssignment_110656);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TraceElementExpanded__NameAssignment_1"


    // $ANTLR start "rule__TraceElementExpanded__TypeAssignment_3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5316:1: rule__TraceElementExpanded__TypeAssignment_3 : ( ruleTypeExpression ) ;
    public final void rule__TraceElementExpanded__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5320:1: ( ( ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5321:1: ( ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5321:1: ( ruleTypeExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5322:1: ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_rule__TraceElementExpanded__TypeAssignment_310687);
            ruleTypeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__TraceElementExpanded__TypeAssignment_3"


    // $ANTLR start "rule__ClassUse__ModelAssignment_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5331:1: rule__ClassUse__ModelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassUse__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5335:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5336:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5336:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5337:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5338:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5339:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelRepresentModelIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClassUse__ModelAssignment_010722); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getModelRepresentModelIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
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
    // $ANTLR end "rule__ClassUse__ModelAssignment_0"


    // $ANTLR start "rule__ClassUse__ClassNameAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5350:1: rule__ClassUse__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__ClassUse__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5354:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5355:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5355:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5356:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getClassNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ClassUse__ClassNameAssignment_210757);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getClassNameEStringParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ClassUse__ClassNameAssignment_2"


    // $ANTLR start "rule__PropertyWrite__ReceptorAssignment_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5365:1: rule__PropertyWrite__ReceptorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyWrite__ReceptorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5369:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5370:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5370:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5371:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorVariableCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5372:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5373:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropertyWrite__ReceptorAssignment_010792); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getReceptorVariableIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getReceptorVariableCrossReference_0_0()); 
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
    // $ANTLR end "rule__PropertyWrite__ReceptorAssignment_0"


    // $ANTLR start "rule__PropertyWrite__PropertyAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5384:1: rule__PropertyWrite__PropertyAssignment_2 : ( RULE_ID ) ;
    public final void rule__PropertyWrite__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5388:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5389:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5389:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5390:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getPropertyIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropertyWrite__PropertyAssignment_210827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getPropertyIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__PropertyWrite__PropertyAssignment_2"


    // $ANTLR start "rule__PropertyWrite__ExpressionAssignment_4"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5399:1: rule__PropertyWrite__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__PropertyWrite__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5403:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5404:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5404:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5405:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getExpressionExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__PropertyWrite__ExpressionAssignment_410858);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteAccess().getExpressionExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__PropertyWrite__ExpressionAssignment_4"


    // $ANTLR start "rule__DefineVariable__NameAssignment_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5414:1: rule__DefineVariable__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DefineVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5418:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5419:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5419:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5420:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DefineVariable__NameAssignment_010889);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__DefineVariable__NameAssignment_0"


    // $ANTLR start "rule__DefineVariable__ExpressionAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5429:1: rule__DefineVariable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__DefineVariable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5433:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5434:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5434:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5435:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__DefineVariable__ExpressionAssignment_210920);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__DefineVariable__ExpressionAssignment_2"


    // $ANTLR start "rule__ModelReference__ModelAssignment_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5444:1: rule__ModelReference__ModelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModelReference__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5448:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5449:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5449:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5450:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5451:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5452:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelRepresentModelIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ModelReference__ModelAssignment_010955); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getModelRepresentModelIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
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
    // $ANTLR end "rule__ModelReference__ModelAssignment_0"


    // $ANTLR start "rule__ModelReference__ClassNameAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5463:1: rule__ModelReference__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModelReference__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5467:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5468:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5468:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5469:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ModelReference__ClassNameAssignment_210990);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ModelReference__ClassNameAssignment_2"


    // $ANTLR start "rule__VariableReference__VariableAssignment"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5478:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5482:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5483:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5483:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5484:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5485:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5486:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment11025); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
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
    // $ANTLR end "rule__VariableReference__VariableAssignment"


    // $ANTLR start "rule__ClosureDeclaration__FormalParametersAssignment_1_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5497:1: rule__ClosureDeclaration__FormalParametersAssignment_1_1 : ( ruleClosureParameter ) ;
    public final void rule__ClosureDeclaration__FormalParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5501:1: ( ( ruleClosureParameter ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5502:1: ( ruleClosureParameter )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5502:1: ( ruleClosureParameter )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5503:1: ruleClosureParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_111060);
            ruleClosureParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__ClosureDeclaration__FormalParametersAssignment_1_1"


    // $ANTLR start "rule__ClosureDeclaration__FormalParametersAssignment_1_2_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5512:1: rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 : ( ruleClosureParameter ) ;
    public final void rule__ClosureDeclaration__FormalParametersAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5516:1: ( ( ruleClosureParameter ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5517:1: ( ruleClosureParameter )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5517:1: ( ruleClosureParameter )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5518:1: ruleClosureParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_2_111091);
            ruleClosureParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__ClosureDeclaration__FormalParametersAssignment_1_2_1"


    // $ANTLR start "rule__ClosureDeclaration__StatementsAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5527:1: rule__ClosureDeclaration__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__ClosureDeclaration__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5531:1: ( ( ruleStatement ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5532:1: ( ruleStatement )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5532:1: ( ruleStatement )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5533:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__ClosureDeclaration__StatementsAssignment_211122);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ClosureDeclaration__StatementsAssignment_2"


    // $ANTLR start "rule__ClosureParameter__NameAssignment"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5542:1: rule__ClosureParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__ClosureParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5546:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5547:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5547:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5548:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClosureParameter__NameAssignment11153); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureParameterAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ClosureParameter__NameAssignment"


    // $ANTLR start "rule__MethodCall__BinaryOpAssignment_1_0_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5557:1: rule__MethodCall__BinaryOpAssignment_1_0_1 : ( ruleBinaryOp ) ;
    public final void rule__MethodCall__BinaryOpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5561:1: ( ( ruleBinaryOp ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5562:1: ( ruleBinaryOp )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5562:1: ( ruleBinaryOp )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5563:1: ruleBinaryOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOp_in_rule__MethodCall__BinaryOpAssignment_1_0_111184);
            ruleBinaryOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__MethodCall__BinaryOpAssignment_1_0_1"


    // $ANTLR start "rule__MethodCall__RightAssignment_1_0_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5572:1: rule__MethodCall__RightAssignment_1_0_2 : ( ruleExpression ) ;
    public final void rule__MethodCall__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5576:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5577:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5577:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5578:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__RightAssignment_1_0_211215);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__MethodCall__RightAssignment_1_0_2"


    // $ANTLR start "rule__MethodCall__MethodNameAssignment_1_1_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5587:1: rule__MethodCall__MethodNameAssignment_1_1_2 : ( ruleEString ) ;
    public final void rule__MethodCall__MethodNameAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5591:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5592:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5592:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5593:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MethodCall__MethodNameAssignment_1_1_211246);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__MethodCall__MethodNameAssignment_1_1_2"


    // $ANTLR start "rule__MethodCall__WithParametersAssignment_1_1_3_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5602:1: rule__MethodCall__WithParametersAssignment_1_1_3_0 : ( ( '(' ) ) ;
    public final void rule__MethodCall__WithParametersAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5606:1: ( ( ( '(' ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5607:1: ( ( '(' ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5607:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5608:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5609:1: ( '(' )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5610:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MethodCall__WithParametersAssignment_1_1_3_011282); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0()); 
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
    // $ANTLR end "rule__MethodCall__WithParametersAssignment_1_1_3_0"


    // $ANTLR start "rule__MethodCall__ParametersAssignment_1_1_3_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5625:1: rule__MethodCall__ParametersAssignment_1_1_3_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5629:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5630:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5630:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5631:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_111321);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_1_0()); 
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
    // $ANTLR end "rule__MethodCall__ParametersAssignment_1_1_3_1"


    // $ANTLR start "rule__MethodCall__ParametersAssignment_1_1_3_2_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5640:1: rule__MethodCall__ParametersAssignment_1_1_3_2_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_1_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5644:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5645:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5645:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5646:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_2_111352);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_2_1_0()); 
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
    // $ANTLR end "rule__MethodCall__ParametersAssignment_1_1_3_2_1"


    // $ANTLR start "rule__MethodCall__ParametersAssignment_1_2_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5655:1: rule__MethodCall__ParametersAssignment_1_2_2 : ( ruleKeywordParameter ) ;
    public final void rule__MethodCall__ParametersAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5659:1: ( ( ruleKeywordParameter ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5660:1: ( ruleKeywordParameter )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5660:1: ( ruleKeywordParameter )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5661:1: ruleKeywordParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersKeywordParameterParserRuleCall_1_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeywordParameter_in_rule__MethodCall__ParametersAssignment_1_2_211383);
            ruleKeywordParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersKeywordParameterParserRuleCall_1_2_2_0()); 
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
    // $ANTLR end "rule__MethodCall__ParametersAssignment_1_2_2"


    // $ANTLR start "rule__KeywordParameter__KeywordAssignment_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5670:1: rule__KeywordParameter__KeywordAssignment_0 : ( RULE_KEYWORD_ID ) ;
    public final void rule__KeywordParameter__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5674:1: ( ( RULE_KEYWORD_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5675:1: ( RULE_KEYWORD_ID )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5675:1: ( RULE_KEYWORD_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5676:1: RULE_KEYWORD_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordParameterAccess().getKeywordKEYWORD_IDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_KEYWORD_ID,FollowSets000.FOLLOW_RULE_KEYWORD_ID_in_rule__KeywordParameter__KeywordAssignment_011414); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordParameterAccess().getKeywordKEYWORD_IDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__KeywordParameter__KeywordAssignment_0"


    // $ANTLR start "rule__KeywordParameter__ValueAssignment_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5685:1: rule__KeywordParameter__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__KeywordParameter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5689:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5690:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5690:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5691:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordParameterAccess().getValueExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__KeywordParameter__ValueAssignment_111445);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordParameterAccess().getValueExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__KeywordParameter__ValueAssignment_1"


    // $ANTLR start "rule__MatchTraceExpression__TraceAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5700:1: rule__MatchTraceExpression__TraceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MatchTraceExpression__TraceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5704:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5705:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5705:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5706:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5707:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5708:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchTraceExpression__TraceAssignment_211480); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
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
    // $ANTLR end "rule__MatchTraceExpression__TraceAssignment_2"


    // $ANTLR start "rule__MatchTraceExpression__TraceExprAssignment_5"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5719:1: rule__MatchTraceExpression__TraceExprAssignment_5 : ( ruleTraceExprLanguage ) ;
    public final void rule__MatchTraceExpression__TraceExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5723:1: ( ( ruleTraceExprLanguage ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5724:1: ( ruleTraceExprLanguage )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5724:1: ( ruleTraceExprLanguage )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5725:1: ruleTraceExprLanguage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_rule__MatchTraceExpression__TraceExprAssignment_511515);
            ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__MatchTraceExpression__TraceExprAssignment_5"


    // $ANTLR start "rule__TraceExprLanguage__TraceVarAssignment_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5734:1: rule__TraceExprLanguage__TraceVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TraceExprLanguage__TraceVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5738:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5739:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5739:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5740:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5741:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5742:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TraceExprLanguage__TraceVarAssignment_011550); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
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
    // $ANTLR end "rule__TraceExprLanguage__TraceVarAssignment_0"


    // $ANTLR start "rule__TraceExprLanguage__ExprAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5753:1: rule__TraceExprLanguage__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__TraceExprLanguage__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5757:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5758:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5758:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5759:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__TraceExprLanguage__ExprAssignment_211585);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TraceExprLanguage__ExprAssignment_2"


    // $ANTLR start "rule__PutTraceExpression__TraceAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5768:1: rule__PutTraceExpression__TraceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PutTraceExpression__TraceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5772:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5773:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5773:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5774:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5775:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5776:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceExpression__TraceAssignment_211620); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
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
    // $ANTLR end "rule__PutTraceExpression__TraceAssignment_2"


    // $ANTLR start "rule__PutTraceExpression__ParametersAssignment_5"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5787:1: rule__PutTraceExpression__ParametersAssignment_5 : ( rulePutTraceParameter ) ;
    public final void rule__PutTraceExpression__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5791:1: ( ( rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5792:1: ( rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5792:1: ( rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5793:1: rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_511655);
            rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__PutTraceExpression__ParametersAssignment_5"


    // $ANTLR start "rule__PutTraceExpression__ParametersAssignment_6_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5802:1: rule__PutTraceExpression__ParametersAssignment_6_1 : ( rulePutTraceParameter ) ;
    public final void rule__PutTraceExpression__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5806:1: ( ( rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5807:1: ( rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5807:1: ( rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5808:1: rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_6_111686);
            rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__PutTraceExpression__ParametersAssignment_6_1"


    // $ANTLR start "rule__PutTraceParameter__TraceVarAssignment_0"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5817:1: rule__PutTraceParameter__TraceVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PutTraceParameter__TraceVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5821:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5822:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5822:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5823:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5824:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5825:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceParameter__TraceVarAssignment_011721); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
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
    // $ANTLR end "rule__PutTraceParameter__TraceVarAssignment_0"


    // $ANTLR start "rule__PutTraceParameter__ValueAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5836:1: rule__PutTraceParameter__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__PutTraceParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5840:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5841:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5841:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5842:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__PutTraceParameter__ValueAssignment_211756);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__PutTraceParameter__ValueAssignment_2"


    // $ANTLR start "rule__NumLiteral__ValueAssignment"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5851:1: rule__NumLiteral__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NumLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5855:1: ( ( ruleEInt ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5856:1: ( ruleEInt )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5856:1: ( ruleEInt )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5857:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NumLiteral__ValueAssignment11787);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
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
    // $ANTLR end "rule__NumLiteral__ValueAssignment"


    // $ANTLR start "rule__KoanRule__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5866:1: rule__KoanRule__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__KoanRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5870:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5871:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5871:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5872:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KoanRule__NameAssignment_111818);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__KoanRule__NameAssignment_1"


    // $ANTLR start "rule__KoanRule__MatcherAssignment_2"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5881:1: rule__KoanRule__MatcherAssignment_2 : ( ruleMatcher ) ;
    public final void rule__KoanRule__MatcherAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5885:1: ( ( ruleMatcher ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5886:1: ( ruleMatcher )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5886:1: ( ruleMatcher )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5887:1: ruleMatcher
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getMatcherMatcherParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatcher_in_rule__KoanRule__MatcherAssignment_211849);
            ruleMatcher();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getMatcherMatcherParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__KoanRule__MatcherAssignment_2"


    // $ANTLR start "rule__KoanRule__StatementsAssignment_3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5896:1: rule__KoanRule__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__KoanRule__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5900:1: ( ( ruleStatement ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5901:1: ( ruleStatement )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5901:1: ( ruleStatement )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5902:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKoanRuleAccess().getStatementsStatementParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__KoanRule__StatementsAssignment_311880);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKoanRuleAccess().getStatementsStatementParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__KoanRule__StatementsAssignment_3"


    // $ANTLR start "rule__ForAllMatcher__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5911:1: rule__ForAllMatcher__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForAllMatcher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5915:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5916:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5916:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5917:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ForAllMatcher__NameAssignment_111911); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ForAllMatcher__NameAssignment_1"


    // $ANTLR start "rule__ForAllMatcher__TypeAssignment_3"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5926:1: rule__ForAllMatcher__TypeAssignment_3 : ( ruleClassUse ) ;
    public final void rule__ForAllMatcher__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5930:1: ( ( ruleClassUse ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5931:1: ( ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5931:1: ( ruleClassUse )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5932:1: ruleClassUse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getTypeClassUseParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_rule__ForAllMatcher__TypeAssignment_311942);
            ruleClassUse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getTypeClassUseParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ForAllMatcher__TypeAssignment_3"


    // $ANTLR start "rule__ForAllMatcher__ChildAssignment_4"
    // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5941:1: rule__ForAllMatcher__ChildAssignment_4 : ( ruleMatcher ) ;
    public final void rule__ForAllMatcher__ChildAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5945:1: ( ( ruleMatcher ) )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5946:1: ( ruleMatcher )
            {
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5946:1: ( ruleMatcher )
            // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:5947:1: ruleMatcher
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllMatcherAccess().getChildMatcherParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatcher_in_rule__ForAllMatcher__ChildAssignment_411973);
            ruleMatcher();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllMatcherAccess().getChildMatcherParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__ForAllMatcher__ChildAssignment_4"

    // $ANTLR start synpred24_InternalKoan
    public final void synpred24_InternalKoan_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3209:2: ( rule__MethodCall__Alternatives_1 )
        // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3209:2: rule__MethodCall__Alternatives_1
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Alternatives_1_in_synpred24_InternalKoan6503);
        rule__MethodCall__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalKoan

    // $ANTLR start synpred25_InternalKoan
    public final void synpred25_InternalKoan_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3424:2: ( rule__MethodCall__Group_1_1_3__0 )
        // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3424:2: rule__MethodCall__Group_1_1_3__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0_in_synpred25_InternalKoan6931);
        rule__MethodCall__Group_1_1_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalKoan

    // $ANTLR start synpred27_InternalKoan
    public final void synpred27_InternalKoan_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3748:2: ( rule__MethodCall__ParametersAssignment_1_2_2 )
        // ../org.eclectic.frontend.syntax.koan.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalKoan.g:3748:2: rule__MethodCall__ParametersAssignment_1_2_2
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_2_2_in_synpred27_InternalKoan7565);
        rule__MethodCall__ParametersAssignment_1_2_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalKoan

    // Delegated rules

    public final boolean synpred27_InternalKoan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalKoan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalKoan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalKoan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalKoan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalKoan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\22\uffff";
    static final String DFA16_eofS =
        "\1\2\21\uffff";
    static final String DFA16_minS =
        "\1\4\1\0\20\uffff";
    static final String DFA16_maxS =
        "\1\45\1\0\20\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA16_specialS =
        "\1\uffff\1\0\20\uffff}>";
    static final String[] DFA16_transitionS = {
            "\4\2\5\uffff\1\2\3\uffff\1\1\1\2\2\uffff\1\2\1\uffff\2\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "3424:1: ( rule__MethodCall__Group_1_1_3__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalKoan()) ) {s = 17;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappingTransformation74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__0_in_ruleMappingTransformation100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__0_in_ruleTransformationDefinitionParameter160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceInterface_in_entryRuleTraceInterface187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceInterface194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__0_in_ruleTraceInterface220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceDefinition254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__0_in_ruleTraceDefinition280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementInline314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__0_in_ruleTraceElementInline340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementExpanded374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__0_in_ruleTraceElementExpanded400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpression434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTypeExpression460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_entryRuleClassUse486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassUse493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__0_in_ruleClassUse519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyWrite613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__0_in_rulePropertyWrite639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefineVariable673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__0_in_ruleDefineVariable699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelReference733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__0_in_ruleModelReference759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_ruleExpression819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__0_in_ruleParenthesizedExpression938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_ruleLiteral998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration1084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureDeclaration1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__0_in_ruleClosureDeclaration1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter1144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureParameter1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureParameter__NameAssignment_in_ruleClosureParameter1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall1204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeywordParameter_in_entryRuleKeywordParameter1264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeywordParameter1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeywordParameter__Group__0_in_ruleKeywordParameter1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression1324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchTraceExpression1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__0_in_ruleMatchTraceExpression1357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage1384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceExprLanguage1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__0_in_ruleTraceExprLanguage1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression1444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceExpression1451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__0_in_rulePutTraceExpression1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter1504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceParameter1511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__0_in_rulePutTraceParameter1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral1564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumLiteral__ValueAssignment_in_ruleNumLiteral1597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKoanRule_in_entryRuleKoanRule1624 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKoanRule1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__0_in_ruleKoanRule1657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatcher_in_entryRuleMatcher1684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatcher1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForAllMatcher_in_ruleMatcher1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForAllMatcher_in_entryRuleForAllMatcher1743 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForAllMatcher1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__0_in_ruleForAllMatcher1776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1863 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOp__Alternatives_in_ruleBinaryOp1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__0_in_rule__TraceDefinition__Alternatives_21968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__0_in_rule__TraceDefinition__Alternatives_21986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_rule__Statement__Alternatives2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Statement__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_rule__Statement__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_rule__Statement__Alternatives2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__PrimaryExpression__Alternatives2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_rule__PrimaryExpression__Alternatives2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rule__PrimaryExpression__Alternatives2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_rule__PrimaryExpression__Alternatives2170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rule__PrimaryExpression__Alternatives2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__0_in_rule__MethodCall__Alternatives_12219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_2__0_in_rule__MethodCall__Alternatives_12272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BinaryOp__Alternatives2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BinaryOp__Alternatives2376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BinaryOp__Alternatives2397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BinaryOp__Alternatives2418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__0__Impl_in_rule__MappingTransformation__Group__02451 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__1_in_rule__MappingTransformation__Group__02454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MappingTransformation__Group__0__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__1__Impl_in_rule__MappingTransformation__Group__12513 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__2_in_rule__MappingTransformation__Group__12516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__NameAssignment_1_in_rule__MappingTransformation__Group__1__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__2__Impl_in_rule__MappingTransformation__Group__22573 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__3_in_rule__MappingTransformation__Group__22576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MappingTransformation__Group__2__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__3__Impl_in_rule__MappingTransformation__Group__32635 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__4_in_rule__MappingTransformation__Group__32638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__InModelsAssignment_3_in_rule__MappingTransformation__Group__3__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__4__Impl_in_rule__MappingTransformation__Group__42695 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__5_in_rule__MappingTransformation__Group__42698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MappingTransformation__Group__4__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__5__Impl_in_rule__MappingTransformation__Group__52757 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__6_in_rule__MappingTransformation__Group__52760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MappingTransformation__Group__5__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__6__Impl_in_rule__MappingTransformation__Group__62819 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__7_in_rule__MappingTransformation__Group__62822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MappingTransformation__Group__6__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__7__Impl_in_rule__MappingTransformation__Group__72881 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__8_in_rule__MappingTransformation__Group__72884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__OutModelsAssignment_7_in_rule__MappingTransformation__Group__7__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__8__Impl_in_rule__MappingTransformation__Group__82941 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__9_in_rule__MappingTransformation__Group__82944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MappingTransformation__Group__8__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__9__Impl_in_rule__MappingTransformation__Group__93003 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__10_in_rule__MappingTransformation__Group__93006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__TraceInterfaceAssignment_9_in_rule__MappingTransformation__Group__9__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__10__Impl_in_rule__MappingTransformation__Group__103063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__RulesAssignment_10_in_rule__MappingTransformation__Group__10__Impl3092 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__RulesAssignment_10_in_rule__MappingTransformation__Group__10__Impl3104 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__0__Impl_in_rule__TransformationDefinitionParameter__Group__03159 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__1_in_rule__TransformationDefinitionParameter__Group__03162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__1__Impl_in_rule__TransformationDefinitionParameter__Group__13220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__NameAssignment_1_in_rule__TransformationDefinitionParameter__Group__1__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__0__Impl_in_rule__TraceInterface__Group__03281 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__1_in_rule__TraceInterface__Group__03284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TraceInterface__Group__0__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__1__Impl_in_rule__TraceInterface__Group__13343 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__2_in_rule__TraceInterface__Group__13346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__NameAssignment_1_in_rule__TraceInterface__Group__1__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__2__Impl_in_rule__TraceInterface__Group__23403 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__3_in_rule__TraceInterface__Group__23406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__DefinitionsAssignment_2_in_rule__TraceInterface__Group__2__Impl3435 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__TraceInterface__DefinitionsAssignment_2_in_rule__TraceInterface__Group__2__Impl3447 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__3__Impl_in_rule__TraceInterface__Group__33480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TraceInterface__Group__3__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__0__Impl_in_rule__TraceDefinition__Group__03547 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__1_in_rule__TraceDefinition__Group__03550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TraceDefinition__Group__0__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__1__Impl_in_rule__TraceDefinition__Group__13609 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__2_in_rule__TraceDefinition__Group__13612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__NameAssignment_1_in_rule__TraceDefinition__Group__1__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__2__Impl_in_rule__TraceDefinition__Group__23669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Alternatives_2_in_rule__TraceDefinition__Group__2__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__0__Impl_in_rule__TraceDefinition__Group_2_0__03732 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__1_in_rule__TraceDefinition__Group_2_0__03735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TraceDefinition__Group_2_0__0__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__1__Impl_in_rule__TraceDefinition__Group_2_0__13794 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__2_in_rule__TraceDefinition__Group_2_0__13797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_1_in_rule__TraceDefinition__Group_2_0__1__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__2__Impl_in_rule__TraceDefinition__Group_2_0__23854 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__3_in_rule__TraceDefinition__Group_2_0__23857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__0_in_rule__TraceDefinition__Group_2_0__2__Impl3884 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__3__Impl_in_rule__TraceDefinition__Group_2_0__33915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TraceDefinition__Group_2_0__3__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__0__Impl_in_rule__TraceDefinition__Group_2_0_2__03982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__1_in_rule__TraceDefinition__Group_2_0_2__03985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TraceDefinition__Group_2_0_2__0__Impl4013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__1__Impl_in_rule__TraceDefinition__Group_2_0_2__14044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_2_1_in_rule__TraceDefinition__Group_2_0_2__1__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__0__Impl_in_rule__TraceDefinition__Group_2_1__04105 = new BitSet(new long[]{0x0000000008A00000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__1_in_rule__TraceDefinition__Group_2_1__04108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_0_in_rule__TraceDefinition__Group_2_1__0__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__1__Impl_in_rule__TraceDefinition__Group_2_1__14165 = new BitSet(new long[]{0x0000000008A00000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__2_in_rule__TraceDefinition__Group_2_1__14168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_1_in_rule__TraceDefinition__Group_2_1__1__Impl4195 = new BitSet(new long[]{0x0000000008800002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__2__Impl_in_rule__TraceDefinition__Group_2_1__24226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TraceDefinition__Group_2_1__2__Impl4254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__0__Impl_in_rule__TraceElementInline__Group__04291 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__1_in_rule__TraceElementInline__Group__04294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__NameAssignment_0_in_rule__TraceElementInline__Group__0__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__1__Impl_in_rule__TraceElementInline__Group__14351 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__2_in_rule__TraceElementInline__Group__14354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TraceElementInline__Group__1__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__2__Impl_in_rule__TraceElementInline__Group__24413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__TypeAssignment_2_in_rule__TraceElementInline__Group__2__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__0__Impl_in_rule__TraceElementExpanded__Group__04476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__1_in_rule__TraceElementExpanded__Group__04479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TraceElementExpanded__Group__0__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__1__Impl_in_rule__TraceElementExpanded__Group__14538 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__2_in_rule__TraceElementExpanded__Group__14541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__NameAssignment_1_in_rule__TraceElementExpanded__Group__1__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__2__Impl_in_rule__TraceElementExpanded__Group__24598 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__3_in_rule__TraceElementExpanded__Group__24601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TraceElementExpanded__Group__2__Impl4629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__3__Impl_in_rule__TraceElementExpanded__Group__34660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__TypeAssignment_3_in_rule__TraceElementExpanded__Group__3__Impl4687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__0__Impl_in_rule__ClassUse__Group__04725 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__1_in_rule__ClassUse__Group__04728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__ModelAssignment_0_in_rule__ClassUse__Group__0__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__1__Impl_in_rule__ClassUse__Group__14785 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__2_in_rule__ClassUse__Group__14788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ClassUse__Group__1__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__2__Impl_in_rule__ClassUse__Group__24847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__ClassNameAssignment_2_in_rule__ClassUse__Group__2__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__0__Impl_in_rule__PropertyWrite__Group__04910 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__1_in_rule__PropertyWrite__Group__04913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__ReceptorAssignment_0_in_rule__PropertyWrite__Group__0__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__1__Impl_in_rule__PropertyWrite__Group__14970 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__2_in_rule__PropertyWrite__Group__14973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PropertyWrite__Group__1__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__2__Impl_in_rule__PropertyWrite__Group__25032 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__3_in_rule__PropertyWrite__Group__25035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__PropertyAssignment_2_in_rule__PropertyWrite__Group__2__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__3__Impl_in_rule__PropertyWrite__Group__35092 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__4_in_rule__PropertyWrite__Group__35095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PropertyWrite__Group__3__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__4__Impl_in_rule__PropertyWrite__Group__45154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__ExpressionAssignment_4_in_rule__PropertyWrite__Group__4__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__0__Impl_in_rule__DefineVariable__Group__05221 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__1_in_rule__DefineVariable__Group__05224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__NameAssignment_0_in_rule__DefineVariable__Group__0__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__1__Impl_in_rule__DefineVariable__Group__15281 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__2_in_rule__DefineVariable__Group__15284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__DefineVariable__Group__1__Impl5312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__2__Impl_in_rule__DefineVariable__Group__25343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__ExpressionAssignment_2_in_rule__DefineVariable__Group__2__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__0__Impl_in_rule__ModelReference__Group__05406 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__1_in_rule__ModelReference__Group__05409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__ModelAssignment_0_in_rule__ModelReference__Group__0__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__1__Impl_in_rule__ModelReference__Group__15466 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__2_in_rule__ModelReference__Group__15469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ModelReference__Group__1__Impl5497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__2__Impl_in_rule__ModelReference__Group__25528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__ClassNameAssignment_2_in_rule__ModelReference__Group__2__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__0__Impl_in_rule__ParenthesizedExpression__Group__05591 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__1_in_rule__ParenthesizedExpression__Group__05594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ParenthesizedExpression__Group__0__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__1__Impl_in_rule__ParenthesizedExpression__Group__15653 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__2_in_rule__ParenthesizedExpression__Group__15656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ParenthesizedExpression__Group__1__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__2__Impl_in_rule__ParenthesizedExpression__Group__25712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ParenthesizedExpression__Group__2__Impl5740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__0__Impl_in_rule__ClosureDeclaration__Group__05777 = new BitSet(new long[]{0x0000002280822070L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__1_in_rule__ClosureDeclaration__Group__05780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ClosureDeclaration__Group__0__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__1__Impl_in_rule__ClosureDeclaration__Group__15839 = new BitSet(new long[]{0x0000002280822070L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__2_in_rule__ClosureDeclaration__Group__15842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__0_in_rule__ClosureDeclaration__Group__1__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__2__Impl_in_rule__ClosureDeclaration__Group__25900 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__3_in_rule__ClosureDeclaration__Group__25903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl5932 = new BitSet(new long[]{0x0000002280822072L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl5944 = new BitSet(new long[]{0x0000002280822072L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__3__Impl_in_rule__ClosureDeclaration__Group__35977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ClosureDeclaration__Group__3__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__0__Impl_in_rule__ClosureDeclaration__Group_1__06044 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__1_in_rule__ClosureDeclaration__Group_1__06047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ClosureDeclaration__Group_1__0__Impl6075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__1__Impl_in_rule__ClosureDeclaration__Group_1__16106 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__2_in_rule__ClosureDeclaration__Group_1__16109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_1_in_rule__ClosureDeclaration__Group_1__1__Impl6136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__2__Impl_in_rule__ClosureDeclaration__Group_1__26166 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__3_in_rule__ClosureDeclaration__Group_1__26169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__0_in_rule__ClosureDeclaration__Group_1__2__Impl6196 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__3__Impl_in_rule__ClosureDeclaration__Group_1__36227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ClosureDeclaration__Group_1__3__Impl6255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__0__Impl_in_rule__ClosureDeclaration__Group_1_2__06294 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__1_in_rule__ClosureDeclaration__Group_1_2__06297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ClosureDeclaration__Group_1_2__0__Impl6325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__1__Impl_in_rule__ClosureDeclaration__Group_1_2__16356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_2_1_in_rule__ClosureDeclaration__Group_1_2__1__Impl6383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__06417 = new BitSet(new long[]{0x000000002000F000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__06420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__MethodCall__Group__0__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__16476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Alternatives_1_in_rule__MethodCall__Group__1__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__0__Impl_in_rule__MethodCall__Group_1_0__06538 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__1_in_rule__MethodCall__Group_1_0__06541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__1__Impl_in_rule__MethodCall__Group_1_0__16599 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__2_in_rule__MethodCall__Group_1_0__16602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__BinaryOpAssignment_1_0_1_in_rule__MethodCall__Group_1_0__1__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__2__Impl_in_rule__MethodCall__Group_1_0__26659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__RightAssignment_1_0_2_in_rule__MethodCall__Group_1_0__2__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0__Impl_in_rule__MethodCall__Group_1_1__06722 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__1_in_rule__MethodCall__Group_1_1__06725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_0__0_in_rule__MethodCall__Group_1_1__0__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__1__Impl_in_rule__MethodCall__Group_1_1__16782 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__2_in_rule__MethodCall__Group_1_1__16785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MethodCall__Group_1_1__1__Impl6813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__2__Impl_in_rule__MethodCall__Group_1_1__26844 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__3_in_rule__MethodCall__Group_1_1__26847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__MethodNameAssignment_1_1_2_in_rule__MethodCall__Group_1_1__2__Impl6874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__3__Impl_in_rule__MethodCall__Group_1_1__36904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0_in_rule__MethodCall__Group_1_1__3__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_0__0__Impl_in_rule__MethodCall__Group_1_1_0__06970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0__Impl_in_rule__MethodCall__Group_1_1_3__07030 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__1_in_rule__MethodCall__Group_1_1_3__07033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__WithParametersAssignment_1_1_3_0_in_rule__MethodCall__Group_1_1_3__0__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__1__Impl_in_rule__MethodCall__Group_1_1_3__17090 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__2_in_rule__MethodCall__Group_1_1_3__17093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_1_in_rule__MethodCall__Group_1_1_3__1__Impl7120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__2__Impl_in_rule__MethodCall__Group_1_1_3__27150 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__3_in_rule__MethodCall__Group_1_1_3__27153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__0_in_rule__MethodCall__Group_1_1_3__2__Impl7180 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__3__Impl_in_rule__MethodCall__Group_1_1_3__37211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MethodCall__Group_1_1_3__3__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__0__Impl_in_rule__MethodCall__Group_1_1_3_2__07278 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__1_in_rule__MethodCall__Group_1_1_3_2__07281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MethodCall__Group_1_1_3_2__0__Impl7309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__1__Impl_in_rule__MethodCall__Group_1_1_3_2__17340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_2_1_in_rule__MethodCall__Group_1_1_3_2__1__Impl7367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_2__0__Impl_in_rule__MethodCall__Group_1_2__07401 = new BitSet(new long[]{0x000000002000F000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_2__1_in_rule__MethodCall__Group_1_2__07404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_2__1__Impl_in_rule__MethodCall__Group_1_2__17462 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_2__2_in_rule__MethodCall__Group_1_2__17465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MethodCall__Group_1_2__1__Impl7493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_2__2__Impl_in_rule__MethodCall__Group_1_2__27524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_2_2_in_rule__MethodCall__Group_1_2__2__Impl7553 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_2_2_in_rule__MethodCall__Group_1_2__2__Impl7565 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_rule__KeywordParameter__Group__0__Impl_in_rule__KeywordParameter__Group__07604 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__KeywordParameter__Group__1_in_rule__KeywordParameter__Group__07607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeywordParameter__KeywordAssignment_0_in_rule__KeywordParameter__Group__0__Impl7634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeywordParameter__Group__1__Impl_in_rule__KeywordParameter__Group__17664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeywordParameter__ValueAssignment_1_in_rule__KeywordParameter__Group__1__Impl7691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__0__Impl_in_rule__MatchTraceExpression__Group__07725 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__1_in_rule__MatchTraceExpression__Group__07728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MatchTraceExpression__Group__0__Impl7756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__1__Impl_in_rule__MatchTraceExpression__Group__17787 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__2_in_rule__MatchTraceExpression__Group__17790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__0_in_rule__MatchTraceExpression__Group__1__Impl7817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__2__Impl_in_rule__MatchTraceExpression__Group__27848 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__3_in_rule__MatchTraceExpression__Group__27851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__TraceAssignment_2_in_rule__MatchTraceExpression__Group__2__Impl7878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__3__Impl_in_rule__MatchTraceExpression__Group__37908 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__4_in_rule__MatchTraceExpression__Group__37911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MatchTraceExpression__Group__3__Impl7939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__4__Impl_in_rule__MatchTraceExpression__Group__47970 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__5_in_rule__MatchTraceExpression__Group__47973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MatchTraceExpression__Group__4__Impl8001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__5__Impl_in_rule__MatchTraceExpression__Group__58032 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__6_in_rule__MatchTraceExpression__Group__58035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__TraceExprAssignment_5_in_rule__MatchTraceExpression__Group__5__Impl8062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__6__Impl_in_rule__MatchTraceExpression__Group__68092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MatchTraceExpression__Group__6__Impl8120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__0__Impl_in_rule__MatchTraceExpression__Group_1__08165 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__1_in_rule__MatchTraceExpression__Group_1__08168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchTraceExpression__Group_1__0__Impl8195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__1__Impl_in_rule__MatchTraceExpression__Group_1__18224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MatchTraceExpression__Group_1__1__Impl8252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__0__Impl_in_rule__TraceExprLanguage__Group__08287 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__1_in_rule__TraceExprLanguage__Group__08290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__TraceVarAssignment_0_in_rule__TraceExprLanguage__Group__0__Impl8317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__1__Impl_in_rule__TraceExprLanguage__Group__18347 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__2_in_rule__TraceExprLanguage__Group__18350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TraceExprLanguage__Group__1__Impl8378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__2__Impl_in_rule__TraceExprLanguage__Group__28409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__ExprAssignment_2_in_rule__TraceExprLanguage__Group__2__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__0__Impl_in_rule__PutTraceExpression__Group__08472 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__1_in_rule__PutTraceExpression__Group__08475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PutTraceExpression__Group__0__Impl8503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__1__Impl_in_rule__PutTraceExpression__Group__18534 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__2_in_rule__PutTraceExpression__Group__18537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__0_in_rule__PutTraceExpression__Group__1__Impl8564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__2__Impl_in_rule__PutTraceExpression__Group__28595 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__3_in_rule__PutTraceExpression__Group__28598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__TraceAssignment_2_in_rule__PutTraceExpression__Group__2__Impl8625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__3__Impl_in_rule__PutTraceExpression__Group__38655 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__4_in_rule__PutTraceExpression__Group__38658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PutTraceExpression__Group__3__Impl8686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__4__Impl_in_rule__PutTraceExpression__Group__48717 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__5_in_rule__PutTraceExpression__Group__48720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__PutTraceExpression__Group__4__Impl8748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__5__Impl_in_rule__PutTraceExpression__Group__58779 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__6_in_rule__PutTraceExpression__Group__58782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__ParametersAssignment_5_in_rule__PutTraceExpression__Group__5__Impl8809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__6__Impl_in_rule__PutTraceExpression__Group__68839 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__7_in_rule__PutTraceExpression__Group__68842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl8871 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl8883 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__7__Impl_in_rule__PutTraceExpression__Group__78916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__PutTraceExpression__Group__7__Impl8944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__0__Impl_in_rule__PutTraceExpression__Group_1__08991 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__1_in_rule__PutTraceExpression__Group_1__08994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceExpression__Group_1__0__Impl9021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__1__Impl_in_rule__PutTraceExpression__Group_1__19050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__PutTraceExpression__Group_1__1__Impl9078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0__Impl_in_rule__PutTraceExpression__Group_6__09113 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__1_in_rule__PutTraceExpression__Group_6__09116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__PutTraceExpression__Group_6__0__Impl9144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__1__Impl_in_rule__PutTraceExpression__Group_6__19175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__ParametersAssignment_6_1_in_rule__PutTraceExpression__Group_6__1__Impl9202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__0__Impl_in_rule__PutTraceParameter__Group__09236 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__1_in_rule__PutTraceParameter__Group__09239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__TraceVarAssignment_0_in_rule__PutTraceParameter__Group__0__Impl9266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__1__Impl_in_rule__PutTraceParameter__Group__19296 = new BitSet(new long[]{0x0000000200822060L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__2_in_rule__PutTraceParameter__Group__19299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PutTraceParameter__Group__1__Impl9327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__2__Impl_in_rule__PutTraceParameter__Group__29358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__ValueAssignment_2_in_rule__PutTraceParameter__Group__2__Impl9385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__0__Impl_in_rule__KoanRule__Group__09421 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__1_in_rule__KoanRule__Group__09424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__KoanRule__Group__0__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__1__Impl_in_rule__KoanRule__Group__19483 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__2_in_rule__KoanRule__Group__19486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KoanRule__NameAssignment_1_in_rule__KoanRule__Group__1__Impl9513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__2__Impl_in_rule__KoanRule__Group__29543 = new BitSet(new long[]{0x0000002280822070L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__3_in_rule__KoanRule__Group__29546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KoanRule__MatcherAssignment_2_in_rule__KoanRule__Group__2__Impl9573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__3__Impl_in_rule__KoanRule__Group__39603 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__4_in_rule__KoanRule__Group__39606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KoanRule__StatementsAssignment_3_in_rule__KoanRule__Group__3__Impl9635 = new BitSet(new long[]{0x0000002280822072L});
        public static final BitSet FOLLOW_rule__KoanRule__StatementsAssignment_3_in_rule__KoanRule__Group__3__Impl9647 = new BitSet(new long[]{0x0000002280822072L});
        public static final BitSet FOLLOW_rule__KoanRule__Group__4__Impl_in_rule__KoanRule__Group__49680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__KoanRule__Group__4__Impl9708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__0__Impl_in_rule__ForAllMatcher__Group__09749 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__1_in_rule__ForAllMatcher__Group__09752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ForAllMatcher__Group__0__Impl9780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__1__Impl_in_rule__ForAllMatcher__Group__19811 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__2_in_rule__ForAllMatcher__Group__19814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__NameAssignment_1_in_rule__ForAllMatcher__Group__1__Impl9841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__2__Impl_in_rule__ForAllMatcher__Group__29871 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__3_in_rule__ForAllMatcher__Group__29874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ForAllMatcher__Group__2__Impl9902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__3__Impl_in_rule__ForAllMatcher__Group__39933 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__4_in_rule__ForAllMatcher__Group__39936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__TypeAssignment_3_in_rule__ForAllMatcher__Group__3__Impl9963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__Group__4__Impl_in_rule__ForAllMatcher__Group__49993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForAllMatcher__ChildAssignment_4_in_rule__ForAllMatcher__Group__4__Impl10020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__010061 = new BitSet(new long[]{0x0000000000002040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__010064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EInt__Group__0__Impl10093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__110126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl10153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MappingTransformation__NameAssignment_110191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__InModelsAssignment_310222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__OutModelsAssignment_710253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceInterface_in_rule__MappingTransformation__TraceInterfaceAssignment_910284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKoanRule_in_rule__MappingTransformation__RulesAssignment_1010315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TransformationDefinitionParameter__NameAssignment_110346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceInterface__NameAssignment_110377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_rule__TraceInterface__DefinitionsAssignment_210408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceDefinition__NameAssignment_110439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_110470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_2_110501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_010532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_110563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceElementInline__NameAssignment_010594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_rule__TraceElementInline__TypeAssignment_210625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceElementExpanded__NameAssignment_110656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_rule__TraceElementExpanded__TypeAssignment_310687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClassUse__ModelAssignment_010722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ClassUse__ClassNameAssignment_210757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyWrite__ReceptorAssignment_010792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyWrite__PropertyAssignment_210827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__PropertyWrite__ExpressionAssignment_410858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DefineVariable__NameAssignment_010889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__DefineVariable__ExpressionAssignment_210920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ModelReference__ModelAssignment_010955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ModelReference__ClassNameAssignment_210990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment11025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_111060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_2_111091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__ClosureDeclaration__StatementsAssignment_211122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClosureParameter__NameAssignment11153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOp_in_rule__MethodCall__BinaryOpAssignment_1_0_111184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__RightAssignment_1_0_211215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MethodCall__MethodNameAssignment_1_1_211246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MethodCall__WithParametersAssignment_1_1_3_011282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_111321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_2_111352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeywordParameter_in_rule__MethodCall__ParametersAssignment_1_2_211383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_KEYWORD_ID_in_rule__KeywordParameter__KeywordAssignment_011414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__KeywordParameter__ValueAssignment_111445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchTraceExpression__TraceAssignment_211480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_rule__MatchTraceExpression__TraceExprAssignment_511515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TraceExprLanguage__TraceVarAssignment_011550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__TraceExprLanguage__ExprAssignment_211585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceExpression__TraceAssignment_211620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_511655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_6_111686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceParameter__TraceVarAssignment_011721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__PutTraceParameter__ValueAssignment_211756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NumLiteral__ValueAssignment11787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KoanRule__NameAssignment_111818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatcher_in_rule__KoanRule__MatcherAssignment_211849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__KoanRule__StatementsAssignment_311880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ForAllMatcher__NameAssignment_111911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_rule__ForAllMatcher__TypeAssignment_311942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatcher_in_rule__ForAllMatcher__ChildAssignment_411973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Alternatives_1_in_synpred24_InternalKoan6503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0_in_synpred25_InternalKoan6931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_2_2_in_synpred27_InternalKoan7565 = new BitSet(new long[]{0x0000000000000002L});
    }


}