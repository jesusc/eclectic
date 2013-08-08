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
import org.eclectic.frontend.services.ScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_KEYWORD_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'script'", "'('", "')'", "'->'", "'link'", "'{'", "'}'", "';'", "'end'", "':'", "'var'", "'!'", "'.'", "'='", "'|'", "','", "'match'", "'with'", "'['", "']'", "'put'"
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
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScriptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g"; }


     
     	private ScriptGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ScriptGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleScriptedTransformation"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:61:1: entryRuleScriptedTransformation : ruleScriptedTransformation EOF ;
    public final void entryRuleScriptedTransformation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:62:1: ( ruleScriptedTransformation EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:63:1: ruleScriptedTransformation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleScriptedTransformation_in_entryRuleScriptedTransformation67);
            ruleScriptedTransformation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScriptedTransformation74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleScriptedTransformation"


    // $ANTLR start "ruleScriptedTransformation"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:70:1: ruleScriptedTransformation : ( ( rule__ScriptedTransformation__Group__0 ) ) ;
    public final void ruleScriptedTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:74:2: ( ( ( rule__ScriptedTransformation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:75:1: ( ( rule__ScriptedTransformation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:75:1: ( ( rule__ScriptedTransformation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:76:1: ( rule__ScriptedTransformation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:77:1: ( rule__ScriptedTransformation__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:77:2: rule__ScriptedTransformation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__0_in_ruleScriptedTransformation100);
            rule__ScriptedTransformation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getGroup()); 
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
    // $ANTLR end "ruleScriptedTransformation"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:89:1: entryRuleTransformationDefinitionParameter : ruleTransformationDefinitionParameter EOF ;
    public final void entryRuleTransformationDefinitionParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:90:1: ( ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:91:1: ruleTransformationDefinitionParameter EOF
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:98:1: ruleTransformationDefinitionParameter : ( ( rule__TransformationDefinitionParameter__Group__0 ) ) ;
    public final void ruleTransformationDefinitionParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:102:2: ( ( ( rule__TransformationDefinitionParameter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:103:1: ( ( rule__TransformationDefinitionParameter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:103:1: ( ( rule__TransformationDefinitionParameter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:104:1: ( rule__TransformationDefinitionParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:105:1: ( rule__TransformationDefinitionParameter__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:105:2: rule__TransformationDefinitionParameter__Group__0
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


    // $ANTLR start "entryRuleTraceDefinition"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:119:1: entryRuleTraceDefinition : ruleTraceDefinition EOF ;
    public final void entryRuleTraceDefinition() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:120:1: ( ruleTraceDefinition EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:121:1: ruleTraceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition189);
            ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceDefinition196); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:128:1: ruleTraceDefinition : ( ( rule__TraceDefinition__Group__0 ) ) ;
    public final void ruleTraceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:132:2: ( ( ( rule__TraceDefinition__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:133:1: ( ( rule__TraceDefinition__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:133:1: ( ( rule__TraceDefinition__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:134:1: ( rule__TraceDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:135:1: ( rule__TraceDefinition__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:135:2: rule__TraceDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__0_in_ruleTraceDefinition222);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:147:1: entryRuleTraceElementInline : ruleTraceElementInline EOF ;
    public final void entryRuleTraceElementInline() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:148:1: ( ruleTraceElementInline EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:149:1: ruleTraceElementInline EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline249);
            ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementInline256); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:156:1: ruleTraceElementInline : ( ( rule__TraceElementInline__Group__0 ) ) ;
    public final void ruleTraceElementInline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:160:2: ( ( ( rule__TraceElementInline__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:161:1: ( ( rule__TraceElementInline__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:161:1: ( ( rule__TraceElementInline__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:162:1: ( rule__TraceElementInline__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:163:1: ( rule__TraceElementInline__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:163:2: rule__TraceElementInline__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__0_in_ruleTraceElementInline282);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:175:1: entryRuleTraceElementExpanded : ruleTraceElementExpanded EOF ;
    public final void entryRuleTraceElementExpanded() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:176:1: ( ruleTraceElementExpanded EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:177:1: ruleTraceElementExpanded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded309);
            ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementExpanded316); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:184:1: ruleTraceElementExpanded : ( ( rule__TraceElementExpanded__Group__0 ) ) ;
    public final void ruleTraceElementExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:188:2: ( ( ( rule__TraceElementExpanded__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:189:1: ( ( rule__TraceElementExpanded__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:189:1: ( ( rule__TraceElementExpanded__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:190:1: ( rule__TraceElementExpanded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:191:1: ( rule__TraceElementExpanded__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:191:2: rule__TraceElementExpanded__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__0_in_ruleTraceElementExpanded342);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:203:1: entryRuleTypeExpression : ruleTypeExpression EOF ;
    public final void entryRuleTypeExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:204:1: ( ruleTypeExpression EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:205:1: ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression369);
            ruleTypeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpression376); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:212:1: ruleTypeExpression : ( ruleClassUse ) ;
    public final void ruleTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:216:2: ( ( ruleClassUse ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:217:1: ( ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:217:1: ( ruleClassUse )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:218:1: ruleClassUse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTypeExpression402);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:231:1: entryRuleClassUse : ruleClassUse EOF ;
    public final void entryRuleClassUse() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:232:1: ( ruleClassUse EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:233:1: ruleClassUse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_entryRuleClassUse428);
            ruleClassUse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassUse435); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:240:1: ruleClassUse : ( ( rule__ClassUse__Group__0 ) ) ;
    public final void ruleClassUse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:244:2: ( ( ( rule__ClassUse__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:245:1: ( ( rule__ClassUse__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:245:1: ( ( rule__ClassUse__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:246:1: ( rule__ClassUse__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:247:1: ( rule__ClassUse__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:247:2: rule__ClassUse__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__0_in_ruleClassUse461);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:259:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:260:1: ( ruleStatement EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:261:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement488);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement495); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:268:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:272:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:273:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:273:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:274:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:275:1: ( rule__Statement__Alternatives )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:275:2: rule__Statement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statement__Alternatives_in_ruleStatement521);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:287:1: entryRulePropertyWrite : rulePropertyWrite EOF ;
    public final void entryRulePropertyWrite() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:288:1: ( rulePropertyWrite EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:289:1: rulePropertyWrite EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite548);
            rulePropertyWrite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyWrite555); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:296:1: rulePropertyWrite : ( ( rule__PropertyWrite__Group__0 ) ) ;
    public final void rulePropertyWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:300:2: ( ( ( rule__PropertyWrite__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:301:1: ( ( rule__PropertyWrite__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:301:1: ( ( rule__PropertyWrite__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:302:1: ( rule__PropertyWrite__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:303:1: ( rule__PropertyWrite__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:303:2: rule__PropertyWrite__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__0_in_rulePropertyWrite581);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:315:1: entryRuleDefineVariable : ruleDefineVariable EOF ;
    public final void entryRuleDefineVariable() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:316:1: ( ruleDefineVariable EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:317:1: ruleDefineVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable608);
            ruleDefineVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefineVariable615); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:324:1: ruleDefineVariable : ( ( rule__DefineVariable__Group__0 ) ) ;
    public final void ruleDefineVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:328:2: ( ( ( rule__DefineVariable__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:329:1: ( ( rule__DefineVariable__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:329:1: ( ( rule__DefineVariable__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:330:1: ( rule__DefineVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:331:1: ( rule__DefineVariable__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:331:2: rule__DefineVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__0_in_ruleDefineVariable641);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:343:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:344:1: ( ruleModelReference EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:345:1: ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_entryRuleModelReference668);
            ruleModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelReference675); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:352:1: ruleModelReference : ( ( rule__ModelReference__Group__0 ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:356:2: ( ( ( rule__ModelReference__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:357:1: ( ( rule__ModelReference__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:357:1: ( ( rule__ModelReference__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:358:1: ( rule__ModelReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:359:1: ( rule__ModelReference__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:359:2: rule__ModelReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__0_in_ruleModelReference701);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:371:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:372:1: ( ruleExpression EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:373:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression728);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression735); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:380:1: ruleExpression : ( ruleMethodCall ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:384:2: ( ( ruleMethodCall ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:385:1: ( ruleMethodCall )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:385:1: ( ruleMethodCall )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:386:1: ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_ruleExpression761);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:399:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:400:1: ( rulePrimaryExpression EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:401:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression787);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression794); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:408:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:412:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:413:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:413:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:414:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:415:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:415:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression820);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:427:1: entryRuleParenthesizedExpression : ruleParenthesizedExpression EOF ;
    public final void entryRuleParenthesizedExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:428:1: ( ruleParenthesizedExpression EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:429:1: ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression847);
            ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedExpression854); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:436:1: ruleParenthesizedExpression : ( ( rule__ParenthesizedExpression__Group__0 ) ) ;
    public final void ruleParenthesizedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:440:2: ( ( ( rule__ParenthesizedExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:441:1: ( ( rule__ParenthesizedExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:441:1: ( ( rule__ParenthesizedExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:442:1: ( rule__ParenthesizedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:443:1: ( rule__ParenthesizedExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:443:2: rule__ParenthesizedExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__0_in_ruleParenthesizedExpression880);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:455:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:456:1: ( ruleLiteral EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:457:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral907);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral914); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:464:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:468:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:469:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:469:1: ( ( rule__Literal__Alternatives ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:470:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:471:1: ( rule__Literal__Alternatives )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:471:2: rule__Literal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Alternatives_in_ruleLiteral940);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:483:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:484:1: ( ruleVariableReference EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:485:1: ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference967);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference974); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:492:1: ruleVariableReference : ( ( rule__VariableReference__VariableAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:496:2: ( ( ( rule__VariableReference__VariableAssignment ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:497:1: ( ( rule__VariableReference__VariableAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:497:1: ( ( rule__VariableReference__VariableAssignment ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:498:1: ( rule__VariableReference__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:499:1: ( rule__VariableReference__VariableAssignment )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:499:2: rule__VariableReference__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference1000);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:511:1: entryRuleClosureDeclaration : ruleClosureDeclaration EOF ;
    public final void entryRuleClosureDeclaration() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:512:1: ( ruleClosureDeclaration EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:513:1: ruleClosureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration1027);
            ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureDeclaration1034); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:520:1: ruleClosureDeclaration : ( ( rule__ClosureDeclaration__Group__0 ) ) ;
    public final void ruleClosureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:524:2: ( ( ( rule__ClosureDeclaration__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:525:1: ( ( rule__ClosureDeclaration__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:525:1: ( ( rule__ClosureDeclaration__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:526:1: ( rule__ClosureDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:527:1: ( rule__ClosureDeclaration__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:527:2: rule__ClosureDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__0_in_ruleClosureDeclaration1060);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:539:1: entryRuleClosureParameter : ruleClosureParameter EOF ;
    public final void entryRuleClosureParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:540:1: ( ruleClosureParameter EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:541:1: ruleClosureParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter1087);
            ruleClosureParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureParameter1094); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:548:1: ruleClosureParameter : ( ( rule__ClosureParameter__NameAssignment ) ) ;
    public final void ruleClosureParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:552:2: ( ( ( rule__ClosureParameter__NameAssignment ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:553:1: ( ( rule__ClosureParameter__NameAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:553:1: ( ( rule__ClosureParameter__NameAssignment ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:554:1: ( rule__ClosureParameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterAccess().getNameAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:555:1: ( rule__ClosureParameter__NameAssignment )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:555:2: rule__ClosureParameter__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureParameter__NameAssignment_in_ruleClosureParameter1120);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:567:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:568:1: ( ruleMethodCall EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:569:1: ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_entryRuleMethodCall1147);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodCall1154); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:576:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:580:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:581:1: ( ( rule__MethodCall__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:581:1: ( ( rule__MethodCall__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:582:1: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:583:1: ( rule__MethodCall__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:583:2: rule__MethodCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall1180);
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


    // $ANTLR start "entryRuleMatchTraceExpression"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:599:1: entryRuleMatchTraceExpression : ruleMatchTraceExpression EOF ;
    public final void entryRuleMatchTraceExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:600:1: ( ruleMatchTraceExpression EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:601:1: ruleMatchTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression1211);
            ruleMatchTraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchTraceExpression1218); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:608:1: ruleMatchTraceExpression : ( ( rule__MatchTraceExpression__Group__0 ) ) ;
    public final void ruleMatchTraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:612:2: ( ( ( rule__MatchTraceExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:613:1: ( ( rule__MatchTraceExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:613:1: ( ( rule__MatchTraceExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:614:1: ( rule__MatchTraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:615:1: ( rule__MatchTraceExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:615:2: rule__MatchTraceExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__0_in_ruleMatchTraceExpression1244);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:627:1: entryRuleTraceExprLanguage : ruleTraceExprLanguage EOF ;
    public final void entryRuleTraceExprLanguage() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:628:1: ( ruleTraceExprLanguage EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:629:1: ruleTraceExprLanguage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage1271);
            ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceExprLanguage1278); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:636:1: ruleTraceExprLanguage : ( ( rule__TraceExprLanguage__Group__0 ) ) ;
    public final void ruleTraceExprLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:640:2: ( ( ( rule__TraceExprLanguage__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:641:1: ( ( rule__TraceExprLanguage__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:641:1: ( ( rule__TraceExprLanguage__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:642:1: ( rule__TraceExprLanguage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:643:1: ( rule__TraceExprLanguage__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:643:2: rule__TraceExprLanguage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__0_in_ruleTraceExprLanguage1304);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:655:1: entryRulePutTraceExpression : rulePutTraceExpression EOF ;
    public final void entryRulePutTraceExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:656:1: ( rulePutTraceExpression EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:657:1: rulePutTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression1331);
            rulePutTraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceExpression1338); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:664:1: rulePutTraceExpression : ( ( rule__PutTraceExpression__Group__0 ) ) ;
    public final void rulePutTraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:668:2: ( ( ( rule__PutTraceExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:669:1: ( ( rule__PutTraceExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:669:1: ( ( rule__PutTraceExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:670:1: ( rule__PutTraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:671:1: ( rule__PutTraceExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:671:2: rule__PutTraceExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__0_in_rulePutTraceExpression1364);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:683:1: entryRulePutTraceParameter : rulePutTraceParameter EOF ;
    public final void entryRulePutTraceParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:684:1: ( rulePutTraceParameter EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:685:1: rulePutTraceParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter1391);
            rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceParameter1398); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:692:1: rulePutTraceParameter : ( ( rule__PutTraceParameter__Group__0 ) ) ;
    public final void rulePutTraceParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:696:2: ( ( ( rule__PutTraceParameter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:697:1: ( ( rule__PutTraceParameter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:697:1: ( ( rule__PutTraceParameter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:698:1: ( rule__PutTraceParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:699:1: ( rule__PutTraceParameter__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:699:2: rule__PutTraceParameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__0_in_rulePutTraceParameter1424);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:711:1: entryRuleNumLiteral : ruleNumLiteral EOF ;
    public final void entryRuleNumLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:712:1: ( ruleNumLiteral EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:713:1: ruleNumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral1451);
            ruleNumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumLiteral1458); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:720:1: ruleNumLiteral : ( ( rule__NumLiteral__ValueAssignment ) ) ;
    public final void ruleNumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:724:2: ( ( ( rule__NumLiteral__ValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:725:1: ( ( rule__NumLiteral__ValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:725:1: ( ( rule__NumLiteral__ValueAssignment ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:726:1: ( rule__NumLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:727:1: ( rule__NumLiteral__ValueAssignment )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:727:2: rule__NumLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumLiteral__ValueAssignment_in_ruleNumLiteral1484);
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


    // $ANTLR start "entryRuleFloatLiteral"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:739:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:740:1: ( ruleFloatLiteral EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:741:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1511);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatLiteral1518); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:748:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:752:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:753:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:753:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:754:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:755:1: ( rule__FloatLiteral__ValueAssignment )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:755:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1544);
            rule__FloatLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleEDouble"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:767:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:768:1: ( ruleEDouble EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:769:1: ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1571);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1578); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:776:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:780:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:781:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:781:1: ( ( rule__EDouble__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:782:1: ( rule__EDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:783:1: ( rule__EDouble__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:783:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1604);
            rule__EDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup()); 
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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:795:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:796:1: ( ruleStringLiteral EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:797:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1631);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral1638); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:804:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:808:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:809:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:809:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:810:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:811:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:811:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1664);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:823:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:824:1: ( ruleEString EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:825:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1691);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1698); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:832:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:836:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:837:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:837:1: ( ( rule__EString__Alternatives ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:838:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:839:1: ( rule__EString__Alternatives )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:839:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1724);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:851:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:852:1: ( ruleEInt EOF )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:853:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1751);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1758); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:860:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:864:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:865:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:865:1: ( ( rule__EInt__Group__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:866:1: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:867:1: ( rule__EInt__Group__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:867:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1784);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:880:1: ruleBinaryOp : ( ( rule__BinaryOp__Alternatives ) ) ;
    public final void ruleBinaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:884:1: ( ( ( rule__BinaryOp__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:885:1: ( ( rule__BinaryOp__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:885:1: ( ( rule__BinaryOp__Alternatives ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:886:1: ( rule__BinaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:887:1: ( rule__BinaryOp__Alternatives )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:887:2: rule__BinaryOp__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOp__Alternatives_in_ruleBinaryOp1821);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:898:1: rule__TraceDefinition__Alternatives_2 : ( ( ( rule__TraceDefinition__Group_2_0__0 ) ) | ( ( rule__TraceDefinition__Group_2_1__0 ) ) );
    public final void rule__TraceDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:902:1: ( ( ( rule__TraceDefinition__Group_2_0__0 ) ) | ( ( rule__TraceDefinition__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:903:1: ( ( rule__TraceDefinition__Group_2_0__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:903:1: ( ( rule__TraceDefinition__Group_2_0__0 ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:904:1: ( rule__TraceDefinition__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTraceDefinitionAccess().getGroup_2_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:905:1: ( rule__TraceDefinition__Group_2_0__0 )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:905:2: rule__TraceDefinition__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__0_in_rule__TraceDefinition__Alternatives_21856);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:909:6: ( ( rule__TraceDefinition__Group_2_1__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:909:6: ( ( rule__TraceDefinition__Group_2_1__0 ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:910:1: ( rule__TraceDefinition__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTraceDefinitionAccess().getGroup_2_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:911:1: ( rule__TraceDefinition__Group_2_1__0 )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:911:2: rule__TraceDefinition__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__0_in_rule__TraceDefinition__Alternatives_21874);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:920:1: rule__Statement__Alternatives : ( ( ruleDefineVariable ) | ( ruleExpression ) | ( rulePutTraceExpression ) | ( rulePropertyWrite ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:924:1: ( ( ruleDefineVariable ) | ( ruleExpression ) | ( rulePutTraceExpression ) | ( rulePropertyWrite ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==29) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_STRING && LA2_1<=RULE_INT)||(LA2_1>=12 && LA2_1<=15)||LA2_1==17||(LA2_1>=21 && LA2_1<=22)||LA2_1==28||LA2_1==32||LA2_1==36) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt2=1;
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
                case 22:
                case 27:
                case 32:
                case 36:
                    {
                    alt2=2;
                    }
                    break;
                case 28:
                    {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==RULE_ID) ) {
                        int LA2_7 = input.LA(4);

                        if ( (LA2_7==EOF||(LA2_7>=RULE_STRING && LA2_7<=RULE_INT)||LA2_7==13||LA2_7==17||(LA2_7>=21 && LA2_7<=22)||LA2_7==28||LA2_7==32||LA2_7==36) ) {
                            alt2=2;
                        }
                        else if ( (LA2_7==29) ) {
                            alt2=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_6==RULE_STRING) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
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
            case 21:
            case 32:
                {
                alt2=2;
                }
                break;
            case 36:
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:925:1: ( ruleDefineVariable )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:925:1: ( ruleDefineVariable )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:926:1: ruleDefineVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_rule__Statement__Alternatives1907);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:931:6: ( ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:931:6: ( ruleExpression )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:932:1: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Statement__Alternatives1924);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:937:6: ( rulePutTraceExpression )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:937:6: ( rulePutTraceExpression )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:938:1: rulePutTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPutTraceExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_rule__Statement__Alternatives1941);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:943:6: ( rulePropertyWrite )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:943:6: ( rulePropertyWrite )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:944:1: rulePropertyWrite
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPropertyWriteParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_rule__Statement__Alternatives1958);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:954:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( ruleVariableReference ) | ( ruleModelReference ) | ( ruleParenthesizedExpression ) | ( ruleMatchTraceExpression ) | ( ruleClosureDeclaration ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:958:1: ( ( ruleLiteral ) | ( ruleVariableReference ) | ( ruleModelReference ) | ( ruleParenthesizedExpression ) | ( ruleMatchTraceExpression ) | ( ruleClosureDeclaration ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 13:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==27) ) {
                    alt3=3;
                }
                else if ( (LA3_2==EOF||(LA3_2>=RULE_STRING && LA3_2<=RULE_INT)||(LA3_2>=12 && LA3_2<=15)||(LA3_2>=17 && LA3_2<=18)||(LA3_2>=21 && LA3_2<=22)||LA3_2==28||(LA3_2>=31 && LA3_2<=32)||(LA3_2>=35 && LA3_2<=36)) ) {
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
            case 32:
                {
                alt3=5;
                }
                break;
            case 21:
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:959:1: ( ruleLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:959:1: ( ruleLiteral )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:960:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__PrimaryExpression__Alternatives1990);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:965:6: ( ruleVariableReference )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:965:6: ( ruleVariableReference )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:966:1: ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2007);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:971:6: ( ruleModelReference )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:971:6: ( ruleModelReference )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:972:1: ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_rule__PrimaryExpression__Alternatives2024);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:977:6: ( ruleParenthesizedExpression )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:977:6: ( ruleParenthesizedExpression )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:978:1: ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_rule__PrimaryExpression__Alternatives2041);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:983:6: ( ruleMatchTraceExpression )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:983:6: ( ruleMatchTraceExpression )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:984:1: ruleMatchTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_rule__PrimaryExpression__Alternatives2058);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:989:6: ( ruleClosureDeclaration )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:989:6: ( ruleClosureDeclaration )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:990:1: ruleClosureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rule__PrimaryExpression__Alternatives2075);
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


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1000:1: rule__Literal__Alternatives : ( ( ruleFloatLiteral ) | ( ruleNumLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1004:1: ( ( ruleFloatLiteral ) | ( ruleNumLiteral ) | ( ruleStringLiteral ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==28) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==RULE_INT) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_STRING && LA4_1<=RULE_INT)||(LA4_1>=12 && LA4_1<=15)||(LA4_1>=17 && LA4_1<=18)||(LA4_1>=21 && LA4_1<=22)||(LA4_1>=31 && LA4_1<=32)||(LA4_1>=35 && LA4_1<=36)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1005:1: ( ruleFloatLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1005:1: ( ruleFloatLiteral )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1006:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2107);
                    ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1011:6: ( ruleNumLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1011:6: ( ruleNumLiteral )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1012:1: ruleNumLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_rule__Literal__Alternatives2124);
                    ruleNumLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1017:6: ( ruleStringLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1017:6: ( ruleStringLiteral )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1018:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2141);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__MethodCall__Alternatives_1"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1028:1: rule__MethodCall__Alternatives_1 : ( ( ( rule__MethodCall__Group_1_0__0 ) ) | ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) ) );
    public final void rule__MethodCall__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1032:1: ( ( ( rule__MethodCall__Group_1_0__0 ) ) | ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=12 && LA6_0<=15)) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1033:1: ( ( rule__MethodCall__Group_1_0__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1033:1: ( ( rule__MethodCall__Group_1_0__0 ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1034:1: ( rule__MethodCall__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1035:1: ( rule__MethodCall__Group_1_0__0 )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1035:2: rule__MethodCall__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__0_in_rule__MethodCall__Alternatives_12173);
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
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1039:6: ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1039:6: ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1040:1: ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1040:1: ( ( rule__MethodCall__Group_1_1__0 ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1041:1: ( rule__MethodCall__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1042:1: ( rule__MethodCall__Group_1_1__0 )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1042:2: rule__MethodCall__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12193);
                    rule__MethodCall__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }

                    }

                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1045:1: ( ( rule__MethodCall__Group_1_1__0 )* )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1046:1: ( rule__MethodCall__Group_1_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1047:1: ( rule__MethodCall__Group_1_1__0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==28) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1047:2: rule__MethodCall__Group_1_1__0
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12205);
                    	    rule__MethodCall__Group_1_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1058:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1062:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1063:1: ( RULE_STRING )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1063:1: ( RULE_STRING )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1064:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2242); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1069:6: ( RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1069:6: ( RULE_ID )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1070:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2259); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1080:1: rule__BinaryOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__BinaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1084:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1085:1: ( ( '+' ) )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1085:1: ( ( '+' ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1086:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1087:1: ( '+' )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1087:3: '+'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__BinaryOp__Alternatives2292); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1092:6: ( ( '-' ) )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1092:6: ( ( '-' ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1093:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1094:1: ( '-' )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1094:3: '-'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__BinaryOp__Alternatives2313); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1099:6: ( ( '*' ) )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1099:6: ( ( '*' ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1100:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1101:1: ( '*' )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1101:3: '*'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__BinaryOp__Alternatives2334); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1106:6: ( ( '/' ) )
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1106:6: ( ( '/' ) )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1107:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getDIVEnumLiteralDeclaration_3()); 
                    }
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1108:1: ( '/' )
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1108:3: '/'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__BinaryOp__Alternatives2355); if (state.failed) return ;

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


    // $ANTLR start "rule__ScriptedTransformation__Group__0"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1120:1: rule__ScriptedTransformation__Group__0 : rule__ScriptedTransformation__Group__0__Impl rule__ScriptedTransformation__Group__1 ;
    public final void rule__ScriptedTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1124:1: ( rule__ScriptedTransformation__Group__0__Impl rule__ScriptedTransformation__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1125:2: rule__ScriptedTransformation__Group__0__Impl rule__ScriptedTransformation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__0__Impl_in_rule__ScriptedTransformation__Group__02388);
            rule__ScriptedTransformation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__1_in_rule__ScriptedTransformation__Group__02391);
            rule__ScriptedTransformation__Group__1();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__0"


    // $ANTLR start "rule__ScriptedTransformation__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1132:1: rule__ScriptedTransformation__Group__0__Impl : ( 'script' ) ;
    public final void rule__ScriptedTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1136:1: ( ( 'script' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1137:1: ( 'script' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1137:1: ( 'script' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1138:1: 'script'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getScriptKeyword_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ScriptedTransformation__Group__0__Impl2419); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getScriptKeyword_0()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__0__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__1"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1151:1: rule__ScriptedTransformation__Group__1 : rule__ScriptedTransformation__Group__1__Impl rule__ScriptedTransformation__Group__2 ;
    public final void rule__ScriptedTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1155:1: ( rule__ScriptedTransformation__Group__1__Impl rule__ScriptedTransformation__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1156:2: rule__ScriptedTransformation__Group__1__Impl rule__ScriptedTransformation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__1__Impl_in_rule__ScriptedTransformation__Group__12450);
            rule__ScriptedTransformation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__2_in_rule__ScriptedTransformation__Group__12453);
            rule__ScriptedTransformation__Group__2();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__1"


    // $ANTLR start "rule__ScriptedTransformation__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1163:1: rule__ScriptedTransformation__Group__1__Impl : ( ( rule__ScriptedTransformation__NameAssignment_1 ) ) ;
    public final void rule__ScriptedTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1167:1: ( ( ( rule__ScriptedTransformation__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1168:1: ( ( rule__ScriptedTransformation__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1168:1: ( ( rule__ScriptedTransformation__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1169:1: ( rule__ScriptedTransformation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1170:1: ( rule__ScriptedTransformation__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1170:2: rule__ScriptedTransformation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__NameAssignment_1_in_rule__ScriptedTransformation__Group__1__Impl2480);
            rule__ScriptedTransformation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__1__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__2"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1180:1: rule__ScriptedTransformation__Group__2 : rule__ScriptedTransformation__Group__2__Impl rule__ScriptedTransformation__Group__3 ;
    public final void rule__ScriptedTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1184:1: ( rule__ScriptedTransformation__Group__2__Impl rule__ScriptedTransformation__Group__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1185:2: rule__ScriptedTransformation__Group__2__Impl rule__ScriptedTransformation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__2__Impl_in_rule__ScriptedTransformation__Group__22510);
            rule__ScriptedTransformation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__3_in_rule__ScriptedTransformation__Group__22513);
            rule__ScriptedTransformation__Group__3();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__2"


    // $ANTLR start "rule__ScriptedTransformation__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1192:1: rule__ScriptedTransformation__Group__2__Impl : ( '(' ) ;
    public final void rule__ScriptedTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1196:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1197:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1197:1: ( '(' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1198:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ScriptedTransformation__Group__2__Impl2541); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__2__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__3"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1211:1: rule__ScriptedTransformation__Group__3 : rule__ScriptedTransformation__Group__3__Impl rule__ScriptedTransformation__Group__4 ;
    public final void rule__ScriptedTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1215:1: ( rule__ScriptedTransformation__Group__3__Impl rule__ScriptedTransformation__Group__4 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1216:2: rule__ScriptedTransformation__Group__3__Impl rule__ScriptedTransformation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__3__Impl_in_rule__ScriptedTransformation__Group__32572);
            rule__ScriptedTransformation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__4_in_rule__ScriptedTransformation__Group__32575);
            rule__ScriptedTransformation__Group__4();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__3"


    // $ANTLR start "rule__ScriptedTransformation__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1223:1: rule__ScriptedTransformation__Group__3__Impl : ( ( rule__ScriptedTransformation__InModelsAssignment_3 ) ) ;
    public final void rule__ScriptedTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1227:1: ( ( ( rule__ScriptedTransformation__InModelsAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1228:1: ( ( rule__ScriptedTransformation__InModelsAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1228:1: ( ( rule__ScriptedTransformation__InModelsAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1229:1: ( rule__ScriptedTransformation__InModelsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getInModelsAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1230:1: ( rule__ScriptedTransformation__InModelsAssignment_3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1230:2: rule__ScriptedTransformation__InModelsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__InModelsAssignment_3_in_rule__ScriptedTransformation__Group__3__Impl2602);
            rule__ScriptedTransformation__InModelsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getInModelsAssignment_3()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__3__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__4"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1240:1: rule__ScriptedTransformation__Group__4 : rule__ScriptedTransformation__Group__4__Impl rule__ScriptedTransformation__Group__5 ;
    public final void rule__ScriptedTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1244:1: ( rule__ScriptedTransformation__Group__4__Impl rule__ScriptedTransformation__Group__5 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1245:2: rule__ScriptedTransformation__Group__4__Impl rule__ScriptedTransformation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__4__Impl_in_rule__ScriptedTransformation__Group__42632);
            rule__ScriptedTransformation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__5_in_rule__ScriptedTransformation__Group__42635);
            rule__ScriptedTransformation__Group__5();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__4"


    // $ANTLR start "rule__ScriptedTransformation__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1252:1: rule__ScriptedTransformation__Group__4__Impl : ( ')' ) ;
    public final void rule__ScriptedTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1256:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1257:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1257:1: ( ')' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1258:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ScriptedTransformation__Group__4__Impl2663); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__4__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__5"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1271:1: rule__ScriptedTransformation__Group__5 : rule__ScriptedTransformation__Group__5__Impl rule__ScriptedTransformation__Group__6 ;
    public final void rule__ScriptedTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1275:1: ( rule__ScriptedTransformation__Group__5__Impl rule__ScriptedTransformation__Group__6 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1276:2: rule__ScriptedTransformation__Group__5__Impl rule__ScriptedTransformation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__5__Impl_in_rule__ScriptedTransformation__Group__52694);
            rule__ScriptedTransformation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__6_in_rule__ScriptedTransformation__Group__52697);
            rule__ScriptedTransformation__Group__6();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__5"


    // $ANTLR start "rule__ScriptedTransformation__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1283:1: rule__ScriptedTransformation__Group__5__Impl : ( '->' ) ;
    public final void rule__ScriptedTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1287:1: ( ( '->' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1288:1: ( '->' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1288:1: ( '->' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1289:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ScriptedTransformation__Group__5__Impl2725); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__5__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__6"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1302:1: rule__ScriptedTransformation__Group__6 : rule__ScriptedTransformation__Group__6__Impl rule__ScriptedTransformation__Group__7 ;
    public final void rule__ScriptedTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1306:1: ( rule__ScriptedTransformation__Group__6__Impl rule__ScriptedTransformation__Group__7 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1307:2: rule__ScriptedTransformation__Group__6__Impl rule__ScriptedTransformation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__6__Impl_in_rule__ScriptedTransformation__Group__62756);
            rule__ScriptedTransformation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__7_in_rule__ScriptedTransformation__Group__62759);
            rule__ScriptedTransformation__Group__7();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__6"


    // $ANTLR start "rule__ScriptedTransformation__Group__6__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1314:1: rule__ScriptedTransformation__Group__6__Impl : ( '(' ) ;
    public final void rule__ScriptedTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1318:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1319:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1319:1: ( '(' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1320:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ScriptedTransformation__Group__6__Impl2787); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getLeftParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__6__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__7"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1333:1: rule__ScriptedTransformation__Group__7 : rule__ScriptedTransformation__Group__7__Impl rule__ScriptedTransformation__Group__8 ;
    public final void rule__ScriptedTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1337:1: ( rule__ScriptedTransformation__Group__7__Impl rule__ScriptedTransformation__Group__8 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1338:2: rule__ScriptedTransformation__Group__7__Impl rule__ScriptedTransformation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__7__Impl_in_rule__ScriptedTransformation__Group__72818);
            rule__ScriptedTransformation__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__8_in_rule__ScriptedTransformation__Group__72821);
            rule__ScriptedTransformation__Group__8();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__7"


    // $ANTLR start "rule__ScriptedTransformation__Group__7__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1345:1: rule__ScriptedTransformation__Group__7__Impl : ( ( rule__ScriptedTransformation__OutModelsAssignment_7 ) ) ;
    public final void rule__ScriptedTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1349:1: ( ( ( rule__ScriptedTransformation__OutModelsAssignment_7 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1350:1: ( ( rule__ScriptedTransformation__OutModelsAssignment_7 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1350:1: ( ( rule__ScriptedTransformation__OutModelsAssignment_7 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1351:1: ( rule__ScriptedTransformation__OutModelsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getOutModelsAssignment_7()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1352:1: ( rule__ScriptedTransformation__OutModelsAssignment_7 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1352:2: rule__ScriptedTransformation__OutModelsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__OutModelsAssignment_7_in_rule__ScriptedTransformation__Group__7__Impl2848);
            rule__ScriptedTransformation__OutModelsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getOutModelsAssignment_7()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__7__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__8"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1362:1: rule__ScriptedTransformation__Group__8 : rule__ScriptedTransformation__Group__8__Impl rule__ScriptedTransformation__Group__9 ;
    public final void rule__ScriptedTransformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1366:1: ( rule__ScriptedTransformation__Group__8__Impl rule__ScriptedTransformation__Group__9 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1367:2: rule__ScriptedTransformation__Group__8__Impl rule__ScriptedTransformation__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__8__Impl_in_rule__ScriptedTransformation__Group__82878);
            rule__ScriptedTransformation__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__9_in_rule__ScriptedTransformation__Group__82881);
            rule__ScriptedTransformation__Group__9();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__8"


    // $ANTLR start "rule__ScriptedTransformation__Group__8__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1374:1: rule__ScriptedTransformation__Group__8__Impl : ( ')' ) ;
    public final void rule__ScriptedTransformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1378:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1379:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1379:1: ( ')' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1380:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ScriptedTransformation__Group__8__Impl2909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getRightParenthesisKeyword_8()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__8__Impl"


    // $ANTLR start "rule__ScriptedTransformation__Group__9"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1393:1: rule__ScriptedTransformation__Group__9 : rule__ScriptedTransformation__Group__9__Impl ;
    public final void rule__ScriptedTransformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1397:1: ( rule__ScriptedTransformation__Group__9__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1398:2: rule__ScriptedTransformation__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__Group__9__Impl_in_rule__ScriptedTransformation__Group__92940);
            rule__ScriptedTransformation__Group__9__Impl();

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
    // $ANTLR end "rule__ScriptedTransformation__Group__9"


    // $ANTLR start "rule__ScriptedTransformation__Group__9__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1404:1: rule__ScriptedTransformation__Group__9__Impl : ( ( ( rule__ScriptedTransformation__StatementsAssignment_9 ) ) ( ( rule__ScriptedTransformation__StatementsAssignment_9 )* ) ) ;
    public final void rule__ScriptedTransformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1408:1: ( ( ( ( rule__ScriptedTransformation__StatementsAssignment_9 ) ) ( ( rule__ScriptedTransformation__StatementsAssignment_9 )* ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1409:1: ( ( ( rule__ScriptedTransformation__StatementsAssignment_9 ) ) ( ( rule__ScriptedTransformation__StatementsAssignment_9 )* ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1409:1: ( ( ( rule__ScriptedTransformation__StatementsAssignment_9 ) ) ( ( rule__ScriptedTransformation__StatementsAssignment_9 )* ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1410:1: ( ( rule__ScriptedTransformation__StatementsAssignment_9 ) ) ( ( rule__ScriptedTransformation__StatementsAssignment_9 )* )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1410:1: ( ( rule__ScriptedTransformation__StatementsAssignment_9 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1411:1: ( rule__ScriptedTransformation__StatementsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getStatementsAssignment_9()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1412:1: ( rule__ScriptedTransformation__StatementsAssignment_9 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1412:2: rule__ScriptedTransformation__StatementsAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__StatementsAssignment_9_in_rule__ScriptedTransformation__Group__9__Impl2969);
            rule__ScriptedTransformation__StatementsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getStatementsAssignment_9()); 
            }

            }

            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1415:1: ( ( rule__ScriptedTransformation__StatementsAssignment_9 )* )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1416:1: ( rule__ScriptedTransformation__StatementsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getStatementsAssignment_9()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1417:1: ( rule__ScriptedTransformation__StatementsAssignment_9 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||LA9_0==13||LA9_0==17||LA9_0==21||LA9_0==32||LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1417:2: rule__ScriptedTransformation__StatementsAssignment_9
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ScriptedTransformation__StatementsAssignment_9_in_rule__ScriptedTransformation__Group__9__Impl2981);
            	    rule__ScriptedTransformation__StatementsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getStatementsAssignment_9()); 
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
    // $ANTLR end "rule__ScriptedTransformation__Group__9__Impl"


    // $ANTLR start "rule__TransformationDefinitionParameter__Group__0"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1448:1: rule__TransformationDefinitionParameter__Group__0 : rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1 ;
    public final void rule__TransformationDefinitionParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1452:1: ( rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1453:2: rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__0__Impl_in_rule__TransformationDefinitionParameter__Group__03034);
            rule__TransformationDefinitionParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__1_in_rule__TransformationDefinitionParameter__Group__03037);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1460:1: rule__TransformationDefinitionParameter__Group__0__Impl : ( () ) ;
    public final void rule__TransformationDefinitionParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1464:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1465:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1465:1: ( () )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1466:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1467:1: ()
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1469:1: 
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1479:1: rule__TransformationDefinitionParameter__Group__1 : rule__TransformationDefinitionParameter__Group__1__Impl ;
    public final void rule__TransformationDefinitionParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1483:1: ( rule__TransformationDefinitionParameter__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1484:2: rule__TransformationDefinitionParameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__1__Impl_in_rule__TransformationDefinitionParameter__Group__13095);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1490:1: rule__TransformationDefinitionParameter__Group__1__Impl : ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) ) ;
    public final void rule__TransformationDefinitionParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1494:1: ( ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1495:1: ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1495:1: ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1496:1: ( rule__TransformationDefinitionParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1497:1: ( rule__TransformationDefinitionParameter__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1497:2: rule__TransformationDefinitionParameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__NameAssignment_1_in_rule__TransformationDefinitionParameter__Group__1__Impl3122);
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


    // $ANTLR start "rule__TraceDefinition__Group__0"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1512:1: rule__TraceDefinition__Group__0 : rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1 ;
    public final void rule__TraceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1516:1: ( rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1517:2: rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__0__Impl_in_rule__TraceDefinition__Group__03157);
            rule__TraceDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__1_in_rule__TraceDefinition__Group__03160);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1524:1: rule__TraceDefinition__Group__0__Impl : ( 'link' ) ;
    public final void rule__TraceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1528:1: ( ( 'link' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1529:1: ( 'link' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1529:1: ( 'link' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1530:1: 'link'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TraceDefinition__Group__0__Impl3188); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1543:1: rule__TraceDefinition__Group__1 : rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2 ;
    public final void rule__TraceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1547:1: ( rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1548:2: rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__1__Impl_in_rule__TraceDefinition__Group__13219);
            rule__TraceDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__2_in_rule__TraceDefinition__Group__13222);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1555:1: rule__TraceDefinition__Group__1__Impl : ( ( rule__TraceDefinition__NameAssignment_1 ) ) ;
    public final void rule__TraceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1559:1: ( ( ( rule__TraceDefinition__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1560:1: ( ( rule__TraceDefinition__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1560:1: ( ( rule__TraceDefinition__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1561:1: ( rule__TraceDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1562:1: ( rule__TraceDefinition__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1562:2: rule__TraceDefinition__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__NameAssignment_1_in_rule__TraceDefinition__Group__1__Impl3249);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1572:1: rule__TraceDefinition__Group__2 : rule__TraceDefinition__Group__2__Impl ;
    public final void rule__TraceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1576:1: ( rule__TraceDefinition__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1577:2: rule__TraceDefinition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__2__Impl_in_rule__TraceDefinition__Group__23279);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1583:1: rule__TraceDefinition__Group__2__Impl : ( ( rule__TraceDefinition__Alternatives_2 ) ) ;
    public final void rule__TraceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1587:1: ( ( ( rule__TraceDefinition__Alternatives_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1588:1: ( ( rule__TraceDefinition__Alternatives_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1588:1: ( ( rule__TraceDefinition__Alternatives_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1589:1: ( rule__TraceDefinition__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getAlternatives_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1590:1: ( rule__TraceDefinition__Alternatives_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1590:2: rule__TraceDefinition__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Alternatives_2_in_rule__TraceDefinition__Group__2__Impl3306);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1606:1: rule__TraceDefinition__Group_2_0__0 : rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1 ;
    public final void rule__TraceDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1610:1: ( rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1611:2: rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__0__Impl_in_rule__TraceDefinition__Group_2_0__03342);
            rule__TraceDefinition__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__1_in_rule__TraceDefinition__Group_2_0__03345);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1618:1: rule__TraceDefinition__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__TraceDefinition__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1622:1: ( ( '{' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1623:1: ( '{' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1623:1: ( '{' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1624:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TraceDefinition__Group_2_0__0__Impl3373); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1637:1: rule__TraceDefinition__Group_2_0__1 : rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2 ;
    public final void rule__TraceDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1641:1: ( rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1642:2: rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__1__Impl_in_rule__TraceDefinition__Group_2_0__13404);
            rule__TraceDefinition__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__2_in_rule__TraceDefinition__Group_2_0__13407);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1649:1: rule__TraceDefinition__Group_2_0__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) ) ;
    public final void rule__TraceDefinition__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1653:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1654:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1654:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1655:1: ( rule__TraceDefinition__ElementsAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1656:1: ( rule__TraceDefinition__ElementsAssignment_2_0_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1656:2: rule__TraceDefinition__ElementsAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_1_in_rule__TraceDefinition__Group_2_0__1__Impl3434);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1666:1: rule__TraceDefinition__Group_2_0__2 : rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3 ;
    public final void rule__TraceDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1670:1: ( rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1671:2: rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__2__Impl_in_rule__TraceDefinition__Group_2_0__23464);
            rule__TraceDefinition__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__3_in_rule__TraceDefinition__Group_2_0__23467);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1678:1: rule__TraceDefinition__Group_2_0__2__Impl : ( ( rule__TraceDefinition__Group_2_0_2__0 )* ) ;
    public final void rule__TraceDefinition__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1682:1: ( ( ( rule__TraceDefinition__Group_2_0_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1683:1: ( ( rule__TraceDefinition__Group_2_0_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1683:1: ( ( rule__TraceDefinition__Group_2_0_2__0 )* )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1684:1: ( rule__TraceDefinition__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getGroup_2_0_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1685:1: ( rule__TraceDefinition__Group_2_0_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1685:2: rule__TraceDefinition__Group_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__0_in_rule__TraceDefinition__Group_2_0__2__Impl3494);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1695:1: rule__TraceDefinition__Group_2_0__3 : rule__TraceDefinition__Group_2_0__3__Impl ;
    public final void rule__TraceDefinition__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1699:1: ( rule__TraceDefinition__Group_2_0__3__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1700:2: rule__TraceDefinition__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__3__Impl_in_rule__TraceDefinition__Group_2_0__33525);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1706:1: rule__TraceDefinition__Group_2_0__3__Impl : ( '}' ) ;
    public final void rule__TraceDefinition__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1710:1: ( ( '}' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1711:1: ( '}' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1711:1: ( '}' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1712:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TraceDefinition__Group_2_0__3__Impl3553); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1733:1: rule__TraceDefinition__Group_2_0_2__0 : rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1 ;
    public final void rule__TraceDefinition__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1737:1: ( rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1738:2: rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__0__Impl_in_rule__TraceDefinition__Group_2_0_2__03592);
            rule__TraceDefinition__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__1_in_rule__TraceDefinition__Group_2_0_2__03595);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1745:1: rule__TraceDefinition__Group_2_0_2__0__Impl : ( ';' ) ;
    public final void rule__TraceDefinition__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1749:1: ( ( ';' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1750:1: ( ';' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1750:1: ( ';' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1751:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TraceDefinition__Group_2_0_2__0__Impl3623); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1764:1: rule__TraceDefinition__Group_2_0_2__1 : rule__TraceDefinition__Group_2_0_2__1__Impl ;
    public final void rule__TraceDefinition__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1768:1: ( rule__TraceDefinition__Group_2_0_2__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1769:2: rule__TraceDefinition__Group_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__1__Impl_in_rule__TraceDefinition__Group_2_0_2__13654);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1775:1: rule__TraceDefinition__Group_2_0_2__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) ) ;
    public final void rule__TraceDefinition__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1779:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1780:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1780:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1781:1: ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1782:1: ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1782:2: rule__TraceDefinition__ElementsAssignment_2_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_2_1_in_rule__TraceDefinition__Group_2_0_2__1__Impl3681);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1796:1: rule__TraceDefinition__Group_2_1__0 : rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1 ;
    public final void rule__TraceDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1800:1: ( rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1801:2: rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__0__Impl_in_rule__TraceDefinition__Group_2_1__03715);
            rule__TraceDefinition__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__1_in_rule__TraceDefinition__Group_2_1__03718);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1808:1: rule__TraceDefinition__Group_2_1__0__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) ) ;
    public final void rule__TraceDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1812:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1813:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1813:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1814:1: ( rule__TraceDefinition__ElementsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1815:1: ( rule__TraceDefinition__ElementsAssignment_2_1_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1815:2: rule__TraceDefinition__ElementsAssignment_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_0_in_rule__TraceDefinition__Group_2_1__0__Impl3745);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1825:1: rule__TraceDefinition__Group_2_1__1 : rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2 ;
    public final void rule__TraceDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1829:1: ( rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1830:2: rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__1__Impl_in_rule__TraceDefinition__Group_2_1__13775);
            rule__TraceDefinition__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__2_in_rule__TraceDefinition__Group_2_1__13778);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1837:1: rule__TraceDefinition__Group_2_1__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* ) ;
    public final void rule__TraceDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1841:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1842:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1842:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1843:1: ( rule__TraceDefinition__ElementsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1844:1: ( rule__TraceDefinition__ElementsAssignment_2_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1844:2: rule__TraceDefinition__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_1_in_rule__TraceDefinition__Group_2_1__1__Impl3805);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1854:1: rule__TraceDefinition__Group_2_1__2 : rule__TraceDefinition__Group_2_1__2__Impl ;
    public final void rule__TraceDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1858:1: ( rule__TraceDefinition__Group_2_1__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1859:2: rule__TraceDefinition__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__2__Impl_in_rule__TraceDefinition__Group_2_1__23836);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1865:1: rule__TraceDefinition__Group_2_1__2__Impl : ( 'end' ) ;
    public final void rule__TraceDefinition__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1869:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1870:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1870:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1871:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getEndKeyword_2_1_2()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TraceDefinition__Group_2_1__2__Impl3864); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1890:1: rule__TraceElementInline__Group__0 : rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1 ;
    public final void rule__TraceElementInline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1894:1: ( rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1895:2: rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__0__Impl_in_rule__TraceElementInline__Group__03901);
            rule__TraceElementInline__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__1_in_rule__TraceElementInline__Group__03904);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1902:1: rule__TraceElementInline__Group__0__Impl : ( ( rule__TraceElementInline__NameAssignment_0 ) ) ;
    public final void rule__TraceElementInline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1906:1: ( ( ( rule__TraceElementInline__NameAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1907:1: ( ( rule__TraceElementInline__NameAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1907:1: ( ( rule__TraceElementInline__NameAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1908:1: ( rule__TraceElementInline__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getNameAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1909:1: ( rule__TraceElementInline__NameAssignment_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1909:2: rule__TraceElementInline__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__NameAssignment_0_in_rule__TraceElementInline__Group__0__Impl3931);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1919:1: rule__TraceElementInline__Group__1 : rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2 ;
    public final void rule__TraceElementInline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1923:1: ( rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1924:2: rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__1__Impl_in_rule__TraceElementInline__Group__13961);
            rule__TraceElementInline__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__2_in_rule__TraceElementInline__Group__13964);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1931:1: rule__TraceElementInline__Group__1__Impl : ( ':' ) ;
    public final void rule__TraceElementInline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1935:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1936:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1936:1: ( ':' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1937:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getColonKeyword_1()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__TraceElementInline__Group__1__Impl3992); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1950:1: rule__TraceElementInline__Group__2 : rule__TraceElementInline__Group__2__Impl ;
    public final void rule__TraceElementInline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1954:1: ( rule__TraceElementInline__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1955:2: rule__TraceElementInline__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__2__Impl_in_rule__TraceElementInline__Group__24023);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1961:1: rule__TraceElementInline__Group__2__Impl : ( ( rule__TraceElementInline__TypeAssignment_2 ) ) ;
    public final void rule__TraceElementInline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1965:1: ( ( ( rule__TraceElementInline__TypeAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1966:1: ( ( rule__TraceElementInline__TypeAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1966:1: ( ( rule__TraceElementInline__TypeAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1967:1: ( rule__TraceElementInline__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getTypeAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1968:1: ( rule__TraceElementInline__TypeAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1968:2: rule__TraceElementInline__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__TypeAssignment_2_in_rule__TraceElementInline__Group__2__Impl4050);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1984:1: rule__TraceElementExpanded__Group__0 : rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1 ;
    public final void rule__TraceElementExpanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1988:1: ( rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1989:2: rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__0__Impl_in_rule__TraceElementExpanded__Group__04086);
            rule__TraceElementExpanded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__1_in_rule__TraceElementExpanded__Group__04089);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1996:1: rule__TraceElementExpanded__Group__0__Impl : ( 'var' ) ;
    public final void rule__TraceElementExpanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2000:1: ( ( 'var' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2001:1: ( 'var' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2001:1: ( 'var' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2002:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__TraceElementExpanded__Group__0__Impl4117); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2015:1: rule__TraceElementExpanded__Group__1 : rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2 ;
    public final void rule__TraceElementExpanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2019:1: ( rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2020:2: rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__1__Impl_in_rule__TraceElementExpanded__Group__14148);
            rule__TraceElementExpanded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__2_in_rule__TraceElementExpanded__Group__14151);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2027:1: rule__TraceElementExpanded__Group__1__Impl : ( ( rule__TraceElementExpanded__NameAssignment_1 ) ) ;
    public final void rule__TraceElementExpanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2031:1: ( ( ( rule__TraceElementExpanded__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2032:1: ( ( rule__TraceElementExpanded__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2032:1: ( ( rule__TraceElementExpanded__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2033:1: ( rule__TraceElementExpanded__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2034:1: ( rule__TraceElementExpanded__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2034:2: rule__TraceElementExpanded__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__NameAssignment_1_in_rule__TraceElementExpanded__Group__1__Impl4178);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2044:1: rule__TraceElementExpanded__Group__2 : rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3 ;
    public final void rule__TraceElementExpanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2048:1: ( rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2049:2: rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__2__Impl_in_rule__TraceElementExpanded__Group__24208);
            rule__TraceElementExpanded__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__3_in_rule__TraceElementExpanded__Group__24211);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2056:1: rule__TraceElementExpanded__Group__2__Impl : ( ':' ) ;
    public final void rule__TraceElementExpanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2060:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2061:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2061:1: ( ':' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2062:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__TraceElementExpanded__Group__2__Impl4239); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2075:1: rule__TraceElementExpanded__Group__3 : rule__TraceElementExpanded__Group__3__Impl ;
    public final void rule__TraceElementExpanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2079:1: ( rule__TraceElementExpanded__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2080:2: rule__TraceElementExpanded__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__3__Impl_in_rule__TraceElementExpanded__Group__34270);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2086:1: rule__TraceElementExpanded__Group__3__Impl : ( ( rule__TraceElementExpanded__TypeAssignment_3 ) ) ;
    public final void rule__TraceElementExpanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2090:1: ( ( ( rule__TraceElementExpanded__TypeAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2091:1: ( ( rule__TraceElementExpanded__TypeAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2091:1: ( ( rule__TraceElementExpanded__TypeAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2092:1: ( rule__TraceElementExpanded__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getTypeAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2093:1: ( rule__TraceElementExpanded__TypeAssignment_3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2093:2: rule__TraceElementExpanded__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__TypeAssignment_3_in_rule__TraceElementExpanded__Group__3__Impl4297);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2111:1: rule__ClassUse__Group__0 : rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1 ;
    public final void rule__ClassUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2115:1: ( rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2116:2: rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__0__Impl_in_rule__ClassUse__Group__04335);
            rule__ClassUse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__1_in_rule__ClassUse__Group__04338);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2123:1: rule__ClassUse__Group__0__Impl : ( ( rule__ClassUse__ModelAssignment_0 ) ) ;
    public final void rule__ClassUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2127:1: ( ( ( rule__ClassUse__ModelAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2128:1: ( ( rule__ClassUse__ModelAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2128:1: ( ( rule__ClassUse__ModelAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2129:1: ( rule__ClassUse__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2130:1: ( rule__ClassUse__ModelAssignment_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2130:2: rule__ClassUse__ModelAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__ModelAssignment_0_in_rule__ClassUse__Group__0__Impl4365);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2140:1: rule__ClassUse__Group__1 : rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2 ;
    public final void rule__ClassUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2144:1: ( rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2145:2: rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__1__Impl_in_rule__ClassUse__Group__14395);
            rule__ClassUse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__2_in_rule__ClassUse__Group__14398);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2152:1: rule__ClassUse__Group__1__Impl : ( '!' ) ;
    public final void rule__ClassUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2156:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2157:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2157:1: ( '!' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2158:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ClassUse__Group__1__Impl4426); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2171:1: rule__ClassUse__Group__2 : rule__ClassUse__Group__2__Impl ;
    public final void rule__ClassUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2175:1: ( rule__ClassUse__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2176:2: rule__ClassUse__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__2__Impl_in_rule__ClassUse__Group__24457);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2182:1: rule__ClassUse__Group__2__Impl : ( ( rule__ClassUse__ClassNameAssignment_2 ) ) ;
    public final void rule__ClassUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2186:1: ( ( ( rule__ClassUse__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2187:1: ( ( rule__ClassUse__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2187:1: ( ( rule__ClassUse__ClassNameAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2188:1: ( rule__ClassUse__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getClassNameAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2189:1: ( rule__ClassUse__ClassNameAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2189:2: rule__ClassUse__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__ClassNameAssignment_2_in_rule__ClassUse__Group__2__Impl4484);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2205:1: rule__PropertyWrite__Group__0 : rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1 ;
    public final void rule__PropertyWrite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2209:1: ( rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2210:2: rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__0__Impl_in_rule__PropertyWrite__Group__04520);
            rule__PropertyWrite__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__1_in_rule__PropertyWrite__Group__04523);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2217:1: rule__PropertyWrite__Group__0__Impl : ( ( rule__PropertyWrite__ReceptorAssignment_0 ) ) ;
    public final void rule__PropertyWrite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2221:1: ( ( ( rule__PropertyWrite__ReceptorAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2222:1: ( ( rule__PropertyWrite__ReceptorAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2222:1: ( ( rule__PropertyWrite__ReceptorAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2223:1: ( rule__PropertyWrite__ReceptorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2224:1: ( rule__PropertyWrite__ReceptorAssignment_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2224:2: rule__PropertyWrite__ReceptorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__ReceptorAssignment_0_in_rule__PropertyWrite__Group__0__Impl4550);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2234:1: rule__PropertyWrite__Group__1 : rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2 ;
    public final void rule__PropertyWrite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2238:1: ( rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2239:2: rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__1__Impl_in_rule__PropertyWrite__Group__14580);
            rule__PropertyWrite__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__2_in_rule__PropertyWrite__Group__14583);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2246:1: rule__PropertyWrite__Group__1__Impl : ( '.' ) ;
    public final void rule__PropertyWrite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2250:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2251:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2251:1: ( '.' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2252:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getFullStopKeyword_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__PropertyWrite__Group__1__Impl4611); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2265:1: rule__PropertyWrite__Group__2 : rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3 ;
    public final void rule__PropertyWrite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2269:1: ( rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2270:2: rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__2__Impl_in_rule__PropertyWrite__Group__24642);
            rule__PropertyWrite__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__3_in_rule__PropertyWrite__Group__24645);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2277:1: rule__PropertyWrite__Group__2__Impl : ( ( rule__PropertyWrite__PropertyAssignment_2 ) ) ;
    public final void rule__PropertyWrite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2281:1: ( ( ( rule__PropertyWrite__PropertyAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2282:1: ( ( rule__PropertyWrite__PropertyAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2282:1: ( ( rule__PropertyWrite__PropertyAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2283:1: ( rule__PropertyWrite__PropertyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getPropertyAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2284:1: ( rule__PropertyWrite__PropertyAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2284:2: rule__PropertyWrite__PropertyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__PropertyAssignment_2_in_rule__PropertyWrite__Group__2__Impl4672);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2294:1: rule__PropertyWrite__Group__3 : rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4 ;
    public final void rule__PropertyWrite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2298:1: ( rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2299:2: rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__3__Impl_in_rule__PropertyWrite__Group__34702);
            rule__PropertyWrite__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__4_in_rule__PropertyWrite__Group__34705);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2306:1: rule__PropertyWrite__Group__3__Impl : ( '=' ) ;
    public final void rule__PropertyWrite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2310:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2311:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2311:1: ( '=' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2312:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getEqualsSignKeyword_3()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PropertyWrite__Group__3__Impl4733); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2325:1: rule__PropertyWrite__Group__4 : rule__PropertyWrite__Group__4__Impl ;
    public final void rule__PropertyWrite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2329:1: ( rule__PropertyWrite__Group__4__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2330:2: rule__PropertyWrite__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__4__Impl_in_rule__PropertyWrite__Group__44764);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2336:1: rule__PropertyWrite__Group__4__Impl : ( ( rule__PropertyWrite__ExpressionAssignment_4 ) ) ;
    public final void rule__PropertyWrite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2340:1: ( ( ( rule__PropertyWrite__ExpressionAssignment_4 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2341:1: ( ( rule__PropertyWrite__ExpressionAssignment_4 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2341:1: ( ( rule__PropertyWrite__ExpressionAssignment_4 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2342:1: ( rule__PropertyWrite__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getExpressionAssignment_4()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2343:1: ( rule__PropertyWrite__ExpressionAssignment_4 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2343:2: rule__PropertyWrite__ExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__ExpressionAssignment_4_in_rule__PropertyWrite__Group__4__Impl4791);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2363:1: rule__DefineVariable__Group__0 : rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1 ;
    public final void rule__DefineVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2367:1: ( rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2368:2: rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__0__Impl_in_rule__DefineVariable__Group__04831);
            rule__DefineVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__1_in_rule__DefineVariable__Group__04834);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2375:1: rule__DefineVariable__Group__0__Impl : ( ( rule__DefineVariable__NameAssignment_0 ) ) ;
    public final void rule__DefineVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2379:1: ( ( ( rule__DefineVariable__NameAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2380:1: ( ( rule__DefineVariable__NameAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2380:1: ( ( rule__DefineVariable__NameAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2381:1: ( rule__DefineVariable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getNameAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2382:1: ( rule__DefineVariable__NameAssignment_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2382:2: rule__DefineVariable__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__NameAssignment_0_in_rule__DefineVariable__Group__0__Impl4861);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2392:1: rule__DefineVariable__Group__1 : rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2 ;
    public final void rule__DefineVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2396:1: ( rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2397:2: rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__1__Impl_in_rule__DefineVariable__Group__14891);
            rule__DefineVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__2_in_rule__DefineVariable__Group__14894);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2404:1: rule__DefineVariable__Group__1__Impl : ( '=' ) ;
    public final void rule__DefineVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2408:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2409:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2409:1: ( '=' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2410:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__DefineVariable__Group__1__Impl4922); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2423:1: rule__DefineVariable__Group__2 : rule__DefineVariable__Group__2__Impl ;
    public final void rule__DefineVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2427:1: ( rule__DefineVariable__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2428:2: rule__DefineVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__2__Impl_in_rule__DefineVariable__Group__24953);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2434:1: rule__DefineVariable__Group__2__Impl : ( ( rule__DefineVariable__ExpressionAssignment_2 ) ) ;
    public final void rule__DefineVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2438:1: ( ( ( rule__DefineVariable__ExpressionAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2439:1: ( ( rule__DefineVariable__ExpressionAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2439:1: ( ( rule__DefineVariable__ExpressionAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2440:1: ( rule__DefineVariable__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getExpressionAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2441:1: ( rule__DefineVariable__ExpressionAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2441:2: rule__DefineVariable__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__ExpressionAssignment_2_in_rule__DefineVariable__Group__2__Impl4980);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2457:1: rule__ModelReference__Group__0 : rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 ;
    public final void rule__ModelReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2461:1: ( rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2462:2: rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__0__Impl_in_rule__ModelReference__Group__05016);
            rule__ModelReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__1_in_rule__ModelReference__Group__05019);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2469:1: rule__ModelReference__Group__0__Impl : ( ( rule__ModelReference__ModelAssignment_0 ) ) ;
    public final void rule__ModelReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2473:1: ( ( ( rule__ModelReference__ModelAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2474:1: ( ( rule__ModelReference__ModelAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2474:1: ( ( rule__ModelReference__ModelAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2475:1: ( rule__ModelReference__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2476:1: ( rule__ModelReference__ModelAssignment_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2476:2: rule__ModelReference__ModelAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__ModelAssignment_0_in_rule__ModelReference__Group__0__Impl5046);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2486:1: rule__ModelReference__Group__1 : rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2 ;
    public final void rule__ModelReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2490:1: ( rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2491:2: rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__1__Impl_in_rule__ModelReference__Group__15076);
            rule__ModelReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__2_in_rule__ModelReference__Group__15079);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2498:1: rule__ModelReference__Group__1__Impl : ( '!' ) ;
    public final void rule__ModelReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2502:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2503:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2503:1: ( '!' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2504:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ModelReference__Group__1__Impl5107); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2517:1: rule__ModelReference__Group__2 : rule__ModelReference__Group__2__Impl ;
    public final void rule__ModelReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2521:1: ( rule__ModelReference__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2522:2: rule__ModelReference__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__2__Impl_in_rule__ModelReference__Group__25138);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2528:1: rule__ModelReference__Group__2__Impl : ( ( rule__ModelReference__ClassNameAssignment_2 ) ) ;
    public final void rule__ModelReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2532:1: ( ( ( rule__ModelReference__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2533:1: ( ( rule__ModelReference__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2533:1: ( ( rule__ModelReference__ClassNameAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2534:1: ( rule__ModelReference__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getClassNameAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2535:1: ( rule__ModelReference__ClassNameAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2535:2: rule__ModelReference__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__ClassNameAssignment_2_in_rule__ModelReference__Group__2__Impl5165);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2551:1: rule__ParenthesizedExpression__Group__0 : rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 ;
    public final void rule__ParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2555:1: ( rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2556:2: rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__0__Impl_in_rule__ParenthesizedExpression__Group__05201);
            rule__ParenthesizedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__1_in_rule__ParenthesizedExpression__Group__05204);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2563:1: rule__ParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2567:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2568:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2568:1: ( '(' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2569:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ParenthesizedExpression__Group__0__Impl5232); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2582:1: rule__ParenthesizedExpression__Group__1 : rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 ;
    public final void rule__ParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2586:1: ( rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2587:2: rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__1__Impl_in_rule__ParenthesizedExpression__Group__15263);
            rule__ParenthesizedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__2_in_rule__ParenthesizedExpression__Group__15266);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2594:1: rule__ParenthesizedExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2598:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2599:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2599:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2600:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ParenthesizedExpression__Group__1__Impl5293);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2611:1: rule__ParenthesizedExpression__Group__2 : rule__ParenthesizedExpression__Group__2__Impl ;
    public final void rule__ParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2615:1: ( rule__ParenthesizedExpression__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2616:2: rule__ParenthesizedExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__2__Impl_in_rule__ParenthesizedExpression__Group__25322);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2622:1: rule__ParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2626:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2627:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2627:1: ( ')' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2628:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ParenthesizedExpression__Group__2__Impl5350); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2647:1: rule__ClosureDeclaration__Group__0 : rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1 ;
    public final void rule__ClosureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2651:1: ( rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2652:2: rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__0__Impl_in_rule__ClosureDeclaration__Group__05387);
            rule__ClosureDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__1_in_rule__ClosureDeclaration__Group__05390);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2659:1: rule__ClosureDeclaration__Group__0__Impl : ( '{' ) ;
    public final void rule__ClosureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2663:1: ( ( '{' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2664:1: ( '{' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2664:1: ( '{' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2665:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ClosureDeclaration__Group__0__Impl5418); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2678:1: rule__ClosureDeclaration__Group__1 : rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2 ;
    public final void rule__ClosureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2682:1: ( rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2683:2: rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__1__Impl_in_rule__ClosureDeclaration__Group__15449);
            rule__ClosureDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__2_in_rule__ClosureDeclaration__Group__15452);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2690:1: rule__ClosureDeclaration__Group__1__Impl : ( ( rule__ClosureDeclaration__Group_1__0 )? ) ;
    public final void rule__ClosureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2694:1: ( ( ( rule__ClosureDeclaration__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2695:1: ( ( rule__ClosureDeclaration__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2695:1: ( ( rule__ClosureDeclaration__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2696:1: ( rule__ClosureDeclaration__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2697:1: ( rule__ClosureDeclaration__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2697:2: rule__ClosureDeclaration__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__0_in_rule__ClosureDeclaration__Group__1__Impl5479);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2707:1: rule__ClosureDeclaration__Group__2 : rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3 ;
    public final void rule__ClosureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2711:1: ( rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2712:2: rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__2__Impl_in_rule__ClosureDeclaration__Group__25510);
            rule__ClosureDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__3_in_rule__ClosureDeclaration__Group__25513);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2719:1: rule__ClosureDeclaration__Group__2__Impl : ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) ) ;
    public final void rule__ClosureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2723:1: ( ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2724:1: ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2724:1: ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2725:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2725:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2726:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2727:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2727:2: rule__ClosureDeclaration__StatementsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl5542);
            rule__ClosureDeclaration__StatementsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }

            }

            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2730:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2731:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2732:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_INT)||LA13_0==13||LA13_0==17||LA13_0==21||LA13_0==32||LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2732:2: rule__ClosureDeclaration__StatementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl5554);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2743:1: rule__ClosureDeclaration__Group__3 : rule__ClosureDeclaration__Group__3__Impl ;
    public final void rule__ClosureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2747:1: ( rule__ClosureDeclaration__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2748:2: rule__ClosureDeclaration__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__3__Impl_in_rule__ClosureDeclaration__Group__35587);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2754:1: rule__ClosureDeclaration__Group__3__Impl : ( '}' ) ;
    public final void rule__ClosureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2758:1: ( ( '}' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2759:1: ( '}' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2759:1: ( '}' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2760:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ClosureDeclaration__Group__3__Impl5615); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2781:1: rule__ClosureDeclaration__Group_1__0 : rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1 ;
    public final void rule__ClosureDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2785:1: ( rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2786:2: rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__0__Impl_in_rule__ClosureDeclaration__Group_1__05654);
            rule__ClosureDeclaration__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__1_in_rule__ClosureDeclaration__Group_1__05657);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2793:1: rule__ClosureDeclaration__Group_1__0__Impl : ( '|' ) ;
    public final void rule__ClosureDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2797:1: ( ( '|' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2798:1: ( '|' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2798:1: ( '|' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2799:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ClosureDeclaration__Group_1__0__Impl5685); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2812:1: rule__ClosureDeclaration__Group_1__1 : rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2 ;
    public final void rule__ClosureDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2816:1: ( rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2817:2: rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__1__Impl_in_rule__ClosureDeclaration__Group_1__15716);
            rule__ClosureDeclaration__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__2_in_rule__ClosureDeclaration__Group_1__15719);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2824:1: rule__ClosureDeclaration__Group_1__1__Impl : ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) ) ;
    public final void rule__ClosureDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2828:1: ( ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2829:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2829:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2830:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2831:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2831:2: rule__ClosureDeclaration__FormalParametersAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_1_in_rule__ClosureDeclaration__Group_1__1__Impl5746);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2841:1: rule__ClosureDeclaration__Group_1__2 : rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3 ;
    public final void rule__ClosureDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2845:1: ( rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2846:2: rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__2__Impl_in_rule__ClosureDeclaration__Group_1__25776);
            rule__ClosureDeclaration__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__3_in_rule__ClosureDeclaration__Group_1__25779);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2853:1: rule__ClosureDeclaration__Group_1__2__Impl : ( ( rule__ClosureDeclaration__Group_1_2__0 )* ) ;
    public final void rule__ClosureDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2857:1: ( ( ( rule__ClosureDeclaration__Group_1_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2858:1: ( ( rule__ClosureDeclaration__Group_1_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2858:1: ( ( rule__ClosureDeclaration__Group_1_2__0 )* )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2859:1: ( rule__ClosureDeclaration__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup_1_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2860:1: ( rule__ClosureDeclaration__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2860:2: rule__ClosureDeclaration__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__0_in_rule__ClosureDeclaration__Group_1__2__Impl5806);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2870:1: rule__ClosureDeclaration__Group_1__3 : rule__ClosureDeclaration__Group_1__3__Impl ;
    public final void rule__ClosureDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2874:1: ( rule__ClosureDeclaration__Group_1__3__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2875:2: rule__ClosureDeclaration__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__3__Impl_in_rule__ClosureDeclaration__Group_1__35837);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2881:1: rule__ClosureDeclaration__Group_1__3__Impl : ( '|' ) ;
    public final void rule__ClosureDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2885:1: ( ( '|' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2886:1: ( '|' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2886:1: ( '|' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2887:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ClosureDeclaration__Group_1__3__Impl5865); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2908:1: rule__ClosureDeclaration__Group_1_2__0 : rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1 ;
    public final void rule__ClosureDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2912:1: ( rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2913:2: rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__0__Impl_in_rule__ClosureDeclaration__Group_1_2__05904);
            rule__ClosureDeclaration__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__1_in_rule__ClosureDeclaration__Group_1_2__05907);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2920:1: rule__ClosureDeclaration__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ClosureDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2924:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2925:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2925:1: ( ',' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2926:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ClosureDeclaration__Group_1_2__0__Impl5935); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2939:1: rule__ClosureDeclaration__Group_1_2__1 : rule__ClosureDeclaration__Group_1_2__1__Impl ;
    public final void rule__ClosureDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2943:1: ( rule__ClosureDeclaration__Group_1_2__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2944:2: rule__ClosureDeclaration__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__1__Impl_in_rule__ClosureDeclaration__Group_1_2__15966);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2950:1: rule__ClosureDeclaration__Group_1_2__1__Impl : ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) ) ;
    public final void rule__ClosureDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2954:1: ( ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2955:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2955:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2956:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2957:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2957:2: rule__ClosureDeclaration__FormalParametersAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_2_1_in_rule__ClosureDeclaration__Group_1_2__1__Impl5993);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2971:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2975:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2976:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__06027);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__06030);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2983:1: rule__MethodCall__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2987:1: ( ( rulePrimaryExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2988:1: ( rulePrimaryExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2988:1: ( rulePrimaryExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:2989:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_rule__MethodCall__Group__0__Impl6057);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3000:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3004:1: ( rule__MethodCall__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3005:2: rule__MethodCall__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__16086);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3011:1: rule__MethodCall__Group__1__Impl : ( ( rule__MethodCall__Alternatives_1 )? ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3015:1: ( ( ( rule__MethodCall__Alternatives_1 )? ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3016:1: ( ( rule__MethodCall__Alternatives_1 )? )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3016:1: ( ( rule__MethodCall__Alternatives_1 )? )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3017:1: ( rule__MethodCall__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getAlternatives_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3018:1: ( rule__MethodCall__Alternatives_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12||(LA15_0>=14 && LA15_0<=15)||LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==13) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==RULE_INT) ) {
                    int LA15_4 = input.LA(3);

                    if ( (synpred24_InternalScript()) ) {
                        alt15=1;
                    }
                }
                else if ( ((LA15_2>=RULE_STRING && LA15_2<=RULE_ID)||LA15_2==13||LA15_2==17||LA15_2==21||LA15_2==32) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3018:2: rule__MethodCall__Alternatives_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Alternatives_1_in_rule__MethodCall__Group__1__Impl6113);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3032:1: rule__MethodCall__Group_1_0__0 : rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1 ;
    public final void rule__MethodCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3036:1: ( rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3037:2: rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__0__Impl_in_rule__MethodCall__Group_1_0__06148);
            rule__MethodCall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__1_in_rule__MethodCall__Group_1_0__06151);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3044:1: rule__MethodCall__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MethodCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3048:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3049:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3049:1: ( () )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3050:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3051:1: ()
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3053:1: 
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3063:1: rule__MethodCall__Group_1_0__1 : rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2 ;
    public final void rule__MethodCall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3067:1: ( rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3068:2: rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__1__Impl_in_rule__MethodCall__Group_1_0__16209);
            rule__MethodCall__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__2_in_rule__MethodCall__Group_1_0__16212);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3075:1: rule__MethodCall__Group_1_0__1__Impl : ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) ) ;
    public final void rule__MethodCall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3079:1: ( ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3080:1: ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3080:1: ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3081:1: ( rule__MethodCall__BinaryOpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryOpAssignment_1_0_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3082:1: ( rule__MethodCall__BinaryOpAssignment_1_0_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3082:2: rule__MethodCall__BinaryOpAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__BinaryOpAssignment_1_0_1_in_rule__MethodCall__Group_1_0__1__Impl6239);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3092:1: rule__MethodCall__Group_1_0__2 : rule__MethodCall__Group_1_0__2__Impl ;
    public final void rule__MethodCall__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3096:1: ( rule__MethodCall__Group_1_0__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3097:2: rule__MethodCall__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__2__Impl_in_rule__MethodCall__Group_1_0__26269);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3103:1: rule__MethodCall__Group_1_0__2__Impl : ( ( rule__MethodCall__RightAssignment_1_0_2 ) ) ;
    public final void rule__MethodCall__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3107:1: ( ( ( rule__MethodCall__RightAssignment_1_0_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3108:1: ( ( rule__MethodCall__RightAssignment_1_0_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3108:1: ( ( rule__MethodCall__RightAssignment_1_0_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3109:1: ( rule__MethodCall__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3110:1: ( rule__MethodCall__RightAssignment_1_0_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3110:2: rule__MethodCall__RightAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__RightAssignment_1_0_2_in_rule__MethodCall__Group_1_0__2__Impl6296);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3126:1: rule__MethodCall__Group_1_1__0 : rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1 ;
    public final void rule__MethodCall__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3130:1: ( rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3131:2: rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0__Impl_in_rule__MethodCall__Group_1_1__06332);
            rule__MethodCall__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__1_in_rule__MethodCall__Group_1_1__06335);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3138:1: rule__MethodCall__Group_1_1__0__Impl : ( ( rule__MethodCall__Group_1_1_0__0 ) ) ;
    public final void rule__MethodCall__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3142:1: ( ( ( rule__MethodCall__Group_1_1_0__0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3143:1: ( ( rule__MethodCall__Group_1_1_0__0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3143:1: ( ( rule__MethodCall__Group_1_1_0__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3144:1: ( rule__MethodCall__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3145:1: ( rule__MethodCall__Group_1_1_0__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3145:2: rule__MethodCall__Group_1_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_0__0_in_rule__MethodCall__Group_1_1__0__Impl6362);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3155:1: rule__MethodCall__Group_1_1__1 : rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2 ;
    public final void rule__MethodCall__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3159:1: ( rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3160:2: rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__1__Impl_in_rule__MethodCall__Group_1_1__16392);
            rule__MethodCall__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__2_in_rule__MethodCall__Group_1_1__16395);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3167:1: rule__MethodCall__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3171:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3172:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3172:1: ( '.' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3173:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MethodCall__Group_1_1__1__Impl6423); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3186:1: rule__MethodCall__Group_1_1__2 : rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3 ;
    public final void rule__MethodCall__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3190:1: ( rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3191:2: rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__2__Impl_in_rule__MethodCall__Group_1_1__26454);
            rule__MethodCall__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__3_in_rule__MethodCall__Group_1_1__26457);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3198:1: rule__MethodCall__Group_1_1__2__Impl : ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) ) ;
    public final void rule__MethodCall__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3202:1: ( ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3203:1: ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3203:1: ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3204:1: ( rule__MethodCall__MethodNameAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodNameAssignment_1_1_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3205:1: ( rule__MethodCall__MethodNameAssignment_1_1_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3205:2: rule__MethodCall__MethodNameAssignment_1_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__MethodNameAssignment_1_1_2_in_rule__MethodCall__Group_1_1__2__Impl6484);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3215:1: rule__MethodCall__Group_1_1__3 : rule__MethodCall__Group_1_1__3__Impl rule__MethodCall__Group_1_1__4 ;
    public final void rule__MethodCall__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3219:1: ( rule__MethodCall__Group_1_1__3__Impl rule__MethodCall__Group_1_1__4 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3220:2: rule__MethodCall__Group_1_1__3__Impl rule__MethodCall__Group_1_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__3__Impl_in_rule__MethodCall__Group_1_1__36514);
            rule__MethodCall__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__4_in_rule__MethodCall__Group_1_1__36517);
            rule__MethodCall__Group_1_1__4();

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3227:1: rule__MethodCall__Group_1_1__3__Impl : ( ( rule__MethodCall__Group_1_1_3__0 )? ) ;
    public final void rule__MethodCall__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3231:1: ( ( ( rule__MethodCall__Group_1_1_3__0 )? ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3232:1: ( ( rule__MethodCall__Group_1_1_3__0 )? )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3232:1: ( ( rule__MethodCall__Group_1_1_3__0 )? )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3233:1: ( rule__MethodCall__Group_1_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_3()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3234:1: ( rule__MethodCall__Group_1_1_3__0 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3234:2: rule__MethodCall__Group_1_1_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0_in_rule__MethodCall__Group_1_1__3__Impl6544);
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


    // $ANTLR start "rule__MethodCall__Group_1_1__4"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3244:1: rule__MethodCall__Group_1_1__4 : rule__MethodCall__Group_1_1__4__Impl ;
    public final void rule__MethodCall__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3248:1: ( rule__MethodCall__Group_1_1__4__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3249:2: rule__MethodCall__Group_1_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__4__Impl_in_rule__MethodCall__Group_1_1__46575);
            rule__MethodCall__Group_1_1__4__Impl();

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
    // $ANTLR end "rule__MethodCall__Group_1_1__4"


    // $ANTLR start "rule__MethodCall__Group_1_1__4__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3255:1: rule__MethodCall__Group_1_1__4__Impl : ( ( rule__MethodCall__ParametersAssignment_1_1_4 )? ) ;
    public final void rule__MethodCall__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3259:1: ( ( ( rule__MethodCall__ParametersAssignment_1_1_4 )? ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3260:1: ( ( rule__MethodCall__ParametersAssignment_1_1_4 )? )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3260:1: ( ( rule__MethodCall__ParametersAssignment_1_1_4 )? )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3261:1: ( rule__MethodCall__ParametersAssignment_1_1_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_4()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3262:1: ( rule__MethodCall__ParametersAssignment_1_1_4 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3262:2: rule__MethodCall__ParametersAssignment_1_1_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_4_in_rule__MethodCall__Group_1_1__4__Impl6602);
                    rule__MethodCall__ParametersAssignment_1_1_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_4()); 
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
    // $ANTLR end "rule__MethodCall__Group_1_1__4__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_1_0__0"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3282:1: rule__MethodCall__Group_1_1_0__0 : rule__MethodCall__Group_1_1_0__0__Impl ;
    public final void rule__MethodCall__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3286:1: ( rule__MethodCall__Group_1_1_0__0__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3287:2: rule__MethodCall__Group_1_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_0__0__Impl_in_rule__MethodCall__Group_1_1_0__06643);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3293:1: rule__MethodCall__Group_1_1_0__0__Impl : ( () ) ;
    public final void rule__MethodCall__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3297:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3298:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3298:1: ( () )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3299:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodCallReceptorAction_1_1_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3300:1: ()
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3302:1: 
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3314:1: rule__MethodCall__Group_1_1_3__0 : rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1 ;
    public final void rule__MethodCall__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3318:1: ( rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3319:2: rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0__Impl_in_rule__MethodCall__Group_1_1_3__06703);
            rule__MethodCall__Group_1_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__1_in_rule__MethodCall__Group_1_1_3__06706);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3326:1: rule__MethodCall__Group_1_1_3__0__Impl : ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) ) ;
    public final void rule__MethodCall__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3330:1: ( ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3331:1: ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3331:1: ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3332:1: ( rule__MethodCall__WithParametersAssignment_1_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersAssignment_1_1_3_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3333:1: ( rule__MethodCall__WithParametersAssignment_1_1_3_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3333:2: rule__MethodCall__WithParametersAssignment_1_1_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__WithParametersAssignment_1_1_3_0_in_rule__MethodCall__Group_1_1_3__0__Impl6733);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3343:1: rule__MethodCall__Group_1_1_3__1 : rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2 ;
    public final void rule__MethodCall__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3347:1: ( rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3348:2: rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__1__Impl_in_rule__MethodCall__Group_1_1_3__16763);
            rule__MethodCall__Group_1_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__2_in_rule__MethodCall__Group_1_1_3__16766);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3355:1: rule__MethodCall__Group_1_1_3__1__Impl : ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) ) ;
    public final void rule__MethodCall__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3359:1: ( ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3360:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3360:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3361:1: ( rule__MethodCall__ParametersAssignment_1_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3362:1: ( rule__MethodCall__ParametersAssignment_1_1_3_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3362:2: rule__MethodCall__ParametersAssignment_1_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_1_in_rule__MethodCall__Group_1_1_3__1__Impl6793);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3372:1: rule__MethodCall__Group_1_1_3__2 : rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3 ;
    public final void rule__MethodCall__Group_1_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3376:1: ( rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3377:2: rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__2__Impl_in_rule__MethodCall__Group_1_1_3__26823);
            rule__MethodCall__Group_1_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__3_in_rule__MethodCall__Group_1_1_3__26826);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3384:1: rule__MethodCall__Group_1_1_3__2__Impl : ( ( rule__MethodCall__Group_1_1_3_2__0 )* ) ;
    public final void rule__MethodCall__Group_1_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3388:1: ( ( ( rule__MethodCall__Group_1_1_3_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3389:1: ( ( rule__MethodCall__Group_1_1_3_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3389:1: ( ( rule__MethodCall__Group_1_1_3_2__0 )* )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3390:1: ( rule__MethodCall__Group_1_1_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_3_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3391:1: ( rule__MethodCall__Group_1_1_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3391:2: rule__MethodCall__Group_1_1_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__0_in_rule__MethodCall__Group_1_1_3__2__Impl6853);
            	    rule__MethodCall__Group_1_1_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3401:1: rule__MethodCall__Group_1_1_3__3 : rule__MethodCall__Group_1_1_3__3__Impl ;
    public final void rule__MethodCall__Group_1_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3405:1: ( rule__MethodCall__Group_1_1_3__3__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3406:2: rule__MethodCall__Group_1_1_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__3__Impl_in_rule__MethodCall__Group_1_1_3__36884);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3412:1: rule__MethodCall__Group_1_1_3__3__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group_1_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3416:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3417:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3417:1: ( ')' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3418:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_1_3_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MethodCall__Group_1_1_3__3__Impl6912); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3439:1: rule__MethodCall__Group_1_1_3_2__0 : rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1 ;
    public final void rule__MethodCall__Group_1_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3443:1: ( rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3444:2: rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__0__Impl_in_rule__MethodCall__Group_1_1_3_2__06951);
            rule__MethodCall__Group_1_1_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__1_in_rule__MethodCall__Group_1_1_3_2__06954);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3451:1: rule__MethodCall__Group_1_1_3_2__0__Impl : ( ',' ) ;
    public final void rule__MethodCall__Group_1_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3455:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3456:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3456:1: ( ',' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3457:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getCommaKeyword_1_1_3_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MethodCall__Group_1_1_3_2__0__Impl6982); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3470:1: rule__MethodCall__Group_1_1_3_2__1 : rule__MethodCall__Group_1_1_3_2__1__Impl ;
    public final void rule__MethodCall__Group_1_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3474:1: ( rule__MethodCall__Group_1_1_3_2__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3475:2: rule__MethodCall__Group_1_1_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__1__Impl_in_rule__MethodCall__Group_1_1_3_2__17013);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3481:1: rule__MethodCall__Group_1_1_3_2__1__Impl : ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) ) ;
    public final void rule__MethodCall__Group_1_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3485:1: ( ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3486:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3486:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3487:1: ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3488:1: ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3488:2: rule__MethodCall__ParametersAssignment_1_1_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_2_1_in_rule__MethodCall__Group_1_1_3_2__1__Impl7040);
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


    // $ANTLR start "rule__MatchTraceExpression__Group__0"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3521:1: rule__MatchTraceExpression__Group__0 : rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1 ;
    public final void rule__MatchTraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3525:1: ( rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3526:2: rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__0__Impl_in_rule__MatchTraceExpression__Group__07093);
            rule__MatchTraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__1_in_rule__MatchTraceExpression__Group__07096);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3533:1: rule__MatchTraceExpression__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchTraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3537:1: ( ( 'match' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3538:1: ( 'match' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3538:1: ( 'match' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3539:1: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MatchTraceExpression__Group__0__Impl7124); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3552:1: rule__MatchTraceExpression__Group__1 : rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2 ;
    public final void rule__MatchTraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3556:1: ( rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3557:2: rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__1__Impl_in_rule__MatchTraceExpression__Group__17155);
            rule__MatchTraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__2_in_rule__MatchTraceExpression__Group__17158);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3564:1: rule__MatchTraceExpression__Group__1__Impl : ( ( rule__MatchTraceExpression__Group_1__0 )? ) ;
    public final void rule__MatchTraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3568:1: ( ( ( rule__MatchTraceExpression__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3569:1: ( ( rule__MatchTraceExpression__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3569:1: ( ( rule__MatchTraceExpression__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3570:1: ( rule__MatchTraceExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3571:1: ( rule__MatchTraceExpression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==27) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3571:2: rule__MatchTraceExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__0_in_rule__MatchTraceExpression__Group__1__Impl7185);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3581:1: rule__MatchTraceExpression__Group__2 : rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3 ;
    public final void rule__MatchTraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3585:1: ( rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3586:2: rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__2__Impl_in_rule__MatchTraceExpression__Group__27216);
            rule__MatchTraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__3_in_rule__MatchTraceExpression__Group__27219);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3593:1: rule__MatchTraceExpression__Group__2__Impl : ( ( rule__MatchTraceExpression__TraceAssignment_2 ) ) ;
    public final void rule__MatchTraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3597:1: ( ( ( rule__MatchTraceExpression__TraceAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3598:1: ( ( rule__MatchTraceExpression__TraceAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3598:1: ( ( rule__MatchTraceExpression__TraceAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3599:1: ( rule__MatchTraceExpression__TraceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3600:1: ( rule__MatchTraceExpression__TraceAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3600:2: rule__MatchTraceExpression__TraceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__TraceAssignment_2_in_rule__MatchTraceExpression__Group__2__Impl7246);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3610:1: rule__MatchTraceExpression__Group__3 : rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4 ;
    public final void rule__MatchTraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3614:1: ( rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3615:2: rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__3__Impl_in_rule__MatchTraceExpression__Group__37276);
            rule__MatchTraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__4_in_rule__MatchTraceExpression__Group__37279);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3622:1: rule__MatchTraceExpression__Group__3__Impl : ( 'with' ) ;
    public final void rule__MatchTraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3626:1: ( ( 'with' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3627:1: ( 'with' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3627:1: ( 'with' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3628:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MatchTraceExpression__Group__3__Impl7307); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3641:1: rule__MatchTraceExpression__Group__4 : rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5 ;
    public final void rule__MatchTraceExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3645:1: ( rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3646:2: rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__4__Impl_in_rule__MatchTraceExpression__Group__47338);
            rule__MatchTraceExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__5_in_rule__MatchTraceExpression__Group__47341);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3653:1: rule__MatchTraceExpression__Group__4__Impl : ( '[' ) ;
    public final void rule__MatchTraceExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3657:1: ( ( '[' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3658:1: ( '[' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3658:1: ( '[' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3659:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MatchTraceExpression__Group__4__Impl7369); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3672:1: rule__MatchTraceExpression__Group__5 : rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6 ;
    public final void rule__MatchTraceExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3676:1: ( rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3677:2: rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__5__Impl_in_rule__MatchTraceExpression__Group__57400);
            rule__MatchTraceExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__6_in_rule__MatchTraceExpression__Group__57403);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3684:1: rule__MatchTraceExpression__Group__5__Impl : ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) ) ;
    public final void rule__MatchTraceExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3688:1: ( ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3689:1: ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3689:1: ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3690:1: ( rule__MatchTraceExpression__TraceExprAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceExprAssignment_5()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3691:1: ( rule__MatchTraceExpression__TraceExprAssignment_5 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3691:2: rule__MatchTraceExpression__TraceExprAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__TraceExprAssignment_5_in_rule__MatchTraceExpression__Group__5__Impl7430);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3701:1: rule__MatchTraceExpression__Group__6 : rule__MatchTraceExpression__Group__6__Impl ;
    public final void rule__MatchTraceExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3705:1: ( rule__MatchTraceExpression__Group__6__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3706:2: rule__MatchTraceExpression__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__6__Impl_in_rule__MatchTraceExpression__Group__67460);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3712:1: rule__MatchTraceExpression__Group__6__Impl : ( ']' ) ;
    public final void rule__MatchTraceExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3716:1: ( ( ']' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3717:1: ( ']' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3717:1: ( ']' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3718:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getRightSquareBracketKeyword_6()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MatchTraceExpression__Group__6__Impl7488); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3745:1: rule__MatchTraceExpression__Group_1__0 : rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1 ;
    public final void rule__MatchTraceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3749:1: ( rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3750:2: rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__0__Impl_in_rule__MatchTraceExpression__Group_1__07533);
            rule__MatchTraceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__1_in_rule__MatchTraceExpression__Group_1__07536);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3757:1: rule__MatchTraceExpression__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__MatchTraceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3761:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3762:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3762:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3763:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchTraceExpression__Group_1__0__Impl7563); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3774:1: rule__MatchTraceExpression__Group_1__1 : rule__MatchTraceExpression__Group_1__1__Impl ;
    public final void rule__MatchTraceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3778:1: ( rule__MatchTraceExpression__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3779:2: rule__MatchTraceExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__1__Impl_in_rule__MatchTraceExpression__Group_1__17592);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3785:1: rule__MatchTraceExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__MatchTraceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3789:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3790:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3790:1: ( '!' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3791:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MatchTraceExpression__Group_1__1__Impl7620); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3808:1: rule__TraceExprLanguage__Group__0 : rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1 ;
    public final void rule__TraceExprLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3812:1: ( rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3813:2: rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__0__Impl_in_rule__TraceExprLanguage__Group__07655);
            rule__TraceExprLanguage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__1_in_rule__TraceExprLanguage__Group__07658);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3820:1: rule__TraceExprLanguage__Group__0__Impl : ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) ) ;
    public final void rule__TraceExprLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3824:1: ( ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3825:1: ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3825:1: ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3826:1: ( rule__TraceExprLanguage__TraceVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3827:1: ( rule__TraceExprLanguage__TraceVarAssignment_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3827:2: rule__TraceExprLanguage__TraceVarAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__TraceVarAssignment_0_in_rule__TraceExprLanguage__Group__0__Impl7685);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3837:1: rule__TraceExprLanguage__Group__1 : rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2 ;
    public final void rule__TraceExprLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3841:1: ( rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3842:2: rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__1__Impl_in_rule__TraceExprLanguage__Group__17715);
            rule__TraceExprLanguage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__2_in_rule__TraceExprLanguage__Group__17718);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3849:1: rule__TraceExprLanguage__Group__1__Impl : ( '=' ) ;
    public final void rule__TraceExprLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3853:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3854:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3854:1: ( '=' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3855:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TraceExprLanguage__Group__1__Impl7746); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3868:1: rule__TraceExprLanguage__Group__2 : rule__TraceExprLanguage__Group__2__Impl ;
    public final void rule__TraceExprLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3872:1: ( rule__TraceExprLanguage__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3873:2: rule__TraceExprLanguage__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__2__Impl_in_rule__TraceExprLanguage__Group__27777);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3879:1: rule__TraceExprLanguage__Group__2__Impl : ( ( rule__TraceExprLanguage__ExprAssignment_2 ) ) ;
    public final void rule__TraceExprLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3883:1: ( ( ( rule__TraceExprLanguage__ExprAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3884:1: ( ( rule__TraceExprLanguage__ExprAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3884:1: ( ( rule__TraceExprLanguage__ExprAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3885:1: ( rule__TraceExprLanguage__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getExprAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3886:1: ( rule__TraceExprLanguage__ExprAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3886:2: rule__TraceExprLanguage__ExprAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__ExprAssignment_2_in_rule__TraceExprLanguage__Group__2__Impl7804);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3902:1: rule__PutTraceExpression__Group__0 : rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1 ;
    public final void rule__PutTraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3906:1: ( rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3907:2: rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__0__Impl_in_rule__PutTraceExpression__Group__07840);
            rule__PutTraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__1_in_rule__PutTraceExpression__Group__07843);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3914:1: rule__PutTraceExpression__Group__0__Impl : ( 'put' ) ;
    public final void rule__PutTraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3918:1: ( ( 'put' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3919:1: ( 'put' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3919:1: ( 'put' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3920:1: 'put'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getPutKeyword_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__PutTraceExpression__Group__0__Impl7871); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3933:1: rule__PutTraceExpression__Group__1 : rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2 ;
    public final void rule__PutTraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3937:1: ( rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3938:2: rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__1__Impl_in_rule__PutTraceExpression__Group__17902);
            rule__PutTraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__2_in_rule__PutTraceExpression__Group__17905);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3945:1: rule__PutTraceExpression__Group__1__Impl : ( ( rule__PutTraceExpression__Group_1__0 )? ) ;
    public final void rule__PutTraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3949:1: ( ( ( rule__PutTraceExpression__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3950:1: ( ( rule__PutTraceExpression__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3950:1: ( ( rule__PutTraceExpression__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3951:1: ( rule__PutTraceExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3952:1: ( rule__PutTraceExpression__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==27) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3952:2: rule__PutTraceExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__0_in_rule__PutTraceExpression__Group__1__Impl7932);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3962:1: rule__PutTraceExpression__Group__2 : rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3 ;
    public final void rule__PutTraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3966:1: ( rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3967:2: rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__2__Impl_in_rule__PutTraceExpression__Group__27963);
            rule__PutTraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__3_in_rule__PutTraceExpression__Group__27966);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3974:1: rule__PutTraceExpression__Group__2__Impl : ( ( rule__PutTraceExpression__TraceAssignment_2 ) ) ;
    public final void rule__PutTraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3978:1: ( ( ( rule__PutTraceExpression__TraceAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3979:1: ( ( rule__PutTraceExpression__TraceAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3979:1: ( ( rule__PutTraceExpression__TraceAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3980:1: ( rule__PutTraceExpression__TraceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3981:1: ( rule__PutTraceExpression__TraceAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3981:2: rule__PutTraceExpression__TraceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__TraceAssignment_2_in_rule__PutTraceExpression__Group__2__Impl7993);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3991:1: rule__PutTraceExpression__Group__3 : rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4 ;
    public final void rule__PutTraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3995:1: ( rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3996:2: rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__3__Impl_in_rule__PutTraceExpression__Group__38023);
            rule__PutTraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__4_in_rule__PutTraceExpression__Group__38026);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4003:1: rule__PutTraceExpression__Group__3__Impl : ( 'with' ) ;
    public final void rule__PutTraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4007:1: ( ( 'with' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4008:1: ( 'with' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4008:1: ( 'with' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4009:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getWithKeyword_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__PutTraceExpression__Group__3__Impl8054); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4022:1: rule__PutTraceExpression__Group__4 : rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5 ;
    public final void rule__PutTraceExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4026:1: ( rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4027:2: rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__4__Impl_in_rule__PutTraceExpression__Group__48085);
            rule__PutTraceExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__5_in_rule__PutTraceExpression__Group__48088);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4034:1: rule__PutTraceExpression__Group__4__Impl : ( '[' ) ;
    public final void rule__PutTraceExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4038:1: ( ( '[' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4039:1: ( '[' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4039:1: ( '[' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4040:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getLeftSquareBracketKeyword_4()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PutTraceExpression__Group__4__Impl8116); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4053:1: rule__PutTraceExpression__Group__5 : rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6 ;
    public final void rule__PutTraceExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4057:1: ( rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4058:2: rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__5__Impl_in_rule__PutTraceExpression__Group__58147);
            rule__PutTraceExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__6_in_rule__PutTraceExpression__Group__58150);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4065:1: rule__PutTraceExpression__Group__5__Impl : ( ( rule__PutTraceExpression__ParametersAssignment_5 ) ) ;
    public final void rule__PutTraceExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4069:1: ( ( ( rule__PutTraceExpression__ParametersAssignment_5 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4070:1: ( ( rule__PutTraceExpression__ParametersAssignment_5 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4070:1: ( ( rule__PutTraceExpression__ParametersAssignment_5 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4071:1: ( rule__PutTraceExpression__ParametersAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_5()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4072:1: ( rule__PutTraceExpression__ParametersAssignment_5 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4072:2: rule__PutTraceExpression__ParametersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__ParametersAssignment_5_in_rule__PutTraceExpression__Group__5__Impl8177);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4082:1: rule__PutTraceExpression__Group__6 : rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7 ;
    public final void rule__PutTraceExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4086:1: ( rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4087:2: rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__6__Impl_in_rule__PutTraceExpression__Group__68207);
            rule__PutTraceExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__7_in_rule__PutTraceExpression__Group__68210);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4094:1: rule__PutTraceExpression__Group__6__Impl : ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) ) ;
    public final void rule__PutTraceExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4098:1: ( ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4099:1: ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4099:1: ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4100:1: ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4100:1: ( ( rule__PutTraceExpression__Group_6__0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4101:1: ( rule__PutTraceExpression__Group_6__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4102:1: ( rule__PutTraceExpression__Group_6__0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4102:2: rule__PutTraceExpression__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl8239);
            rule__PutTraceExpression__Group_6__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }

            }

            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4105:1: ( ( rule__PutTraceExpression__Group_6__0 )* )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4106:1: ( rule__PutTraceExpression__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4107:1: ( rule__PutTraceExpression__Group_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4107:2: rule__PutTraceExpression__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl8251);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4118:1: rule__PutTraceExpression__Group__7 : rule__PutTraceExpression__Group__7__Impl ;
    public final void rule__PutTraceExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4122:1: ( rule__PutTraceExpression__Group__7__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4123:2: rule__PutTraceExpression__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__7__Impl_in_rule__PutTraceExpression__Group__78284);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4129:1: rule__PutTraceExpression__Group__7__Impl : ( ']' ) ;
    public final void rule__PutTraceExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4133:1: ( ( ']' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4134:1: ( ']' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4134:1: ( ']' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4135:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getRightSquareBracketKeyword_7()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__PutTraceExpression__Group__7__Impl8312); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4164:1: rule__PutTraceExpression__Group_1__0 : rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1 ;
    public final void rule__PutTraceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4168:1: ( rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4169:2: rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__0__Impl_in_rule__PutTraceExpression__Group_1__08359);
            rule__PutTraceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__1_in_rule__PutTraceExpression__Group_1__08362);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4176:1: rule__PutTraceExpression__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__PutTraceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4180:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4181:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4181:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4182:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceExpression__Group_1__0__Impl8389); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4193:1: rule__PutTraceExpression__Group_1__1 : rule__PutTraceExpression__Group_1__1__Impl ;
    public final void rule__PutTraceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4197:1: ( rule__PutTraceExpression__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4198:2: rule__PutTraceExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__1__Impl_in_rule__PutTraceExpression__Group_1__18418);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4204:1: rule__PutTraceExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__PutTraceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4208:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4209:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4209:1: ( '!' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4210:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__PutTraceExpression__Group_1__1__Impl8446); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4227:1: rule__PutTraceExpression__Group_6__0 : rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1 ;
    public final void rule__PutTraceExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4231:1: ( rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4232:2: rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0__Impl_in_rule__PutTraceExpression__Group_6__08481);
            rule__PutTraceExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__1_in_rule__PutTraceExpression__Group_6__08484);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4239:1: rule__PutTraceExpression__Group_6__0__Impl : ( ',' ) ;
    public final void rule__PutTraceExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4243:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4244:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4244:1: ( ',' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4245:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getCommaKeyword_6_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__PutTraceExpression__Group_6__0__Impl8512); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4258:1: rule__PutTraceExpression__Group_6__1 : rule__PutTraceExpression__Group_6__1__Impl ;
    public final void rule__PutTraceExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4262:1: ( rule__PutTraceExpression__Group_6__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4263:2: rule__PutTraceExpression__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__1__Impl_in_rule__PutTraceExpression__Group_6__18543);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4269:1: rule__PutTraceExpression__Group_6__1__Impl : ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) ) ;
    public final void rule__PutTraceExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4273:1: ( ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4274:1: ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4274:1: ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4275:1: ( rule__PutTraceExpression__ParametersAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_6_1()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4276:1: ( rule__PutTraceExpression__ParametersAssignment_6_1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4276:2: rule__PutTraceExpression__ParametersAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__ParametersAssignment_6_1_in_rule__PutTraceExpression__Group_6__1__Impl8570);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4290:1: rule__PutTraceParameter__Group__0 : rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1 ;
    public final void rule__PutTraceParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4294:1: ( rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4295:2: rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__0__Impl_in_rule__PutTraceParameter__Group__08604);
            rule__PutTraceParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__1_in_rule__PutTraceParameter__Group__08607);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4302:1: rule__PutTraceParameter__Group__0__Impl : ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) ) ;
    public final void rule__PutTraceParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4306:1: ( ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4307:1: ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4307:1: ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4308:1: ( rule__PutTraceParameter__TraceVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4309:1: ( rule__PutTraceParameter__TraceVarAssignment_0 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4309:2: rule__PutTraceParameter__TraceVarAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__TraceVarAssignment_0_in_rule__PutTraceParameter__Group__0__Impl8634);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4319:1: rule__PutTraceParameter__Group__1 : rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2 ;
    public final void rule__PutTraceParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4323:1: ( rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4324:2: rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__1__Impl_in_rule__PutTraceParameter__Group__18664);
            rule__PutTraceParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__2_in_rule__PutTraceParameter__Group__18667);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4331:1: rule__PutTraceParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__PutTraceParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4335:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4336:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4336:1: ( '=' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4337:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PutTraceParameter__Group__1__Impl8695); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4350:1: rule__PutTraceParameter__Group__2 : rule__PutTraceParameter__Group__2__Impl ;
    public final void rule__PutTraceParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4354:1: ( rule__PutTraceParameter__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4355:2: rule__PutTraceParameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__2__Impl_in_rule__PutTraceParameter__Group__28726);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4361:1: rule__PutTraceParameter__Group__2__Impl : ( ( rule__PutTraceParameter__ValueAssignment_2 ) ) ;
    public final void rule__PutTraceParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4365:1: ( ( ( rule__PutTraceParameter__ValueAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4366:1: ( ( rule__PutTraceParameter__ValueAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4366:1: ( ( rule__PutTraceParameter__ValueAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4367:1: ( rule__PutTraceParameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getValueAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4368:1: ( rule__PutTraceParameter__ValueAssignment_2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4368:2: rule__PutTraceParameter__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__ValueAssignment_2_in_rule__PutTraceParameter__Group__2__Impl8753);
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


    // $ANTLR start "rule__EDouble__Group__0"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4384:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4388:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4389:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__08789);
            rule__EDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__08792);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4396:1: rule__EDouble__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4400:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4401:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4401:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4402:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl8819); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4413:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4417:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4418:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__18848);
            rule__EDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__18851);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4425:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4429:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4430:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4430:1: ( '.' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4431:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__EDouble__Group__1__Impl8879); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4444:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4448:1: ( rule__EDouble__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4449:2: rule__EDouble__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__28910);
            rule__EDouble__Group__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4455:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4459:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4460:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4460:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4461:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl8937); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4478:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4482:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4483:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08972);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08975);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4490:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4494:1: ( ( ( '-' )? ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4495:1: ( ( '-' )? )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4495:1: ( ( '-' )? )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4496:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4497:1: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4498:2: '-'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EInt__Group__0__Impl9004); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4509:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4513:1: ( rule__EInt__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4514:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19037);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4520:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4524:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4525:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4525:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4526:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9064); if (state.failed) return ;
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


    // $ANTLR start "rule__ScriptedTransformation__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4542:1: rule__ScriptedTransformation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ScriptedTransformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4546:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4547:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4547:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4548:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ScriptedTransformation__NameAssignment_19102);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ScriptedTransformation__NameAssignment_1"


    // $ANTLR start "rule__ScriptedTransformation__InModelsAssignment_3"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4557:1: rule__ScriptedTransformation__InModelsAssignment_3 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__ScriptedTransformation__InModelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4561:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4562:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4562:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4563:1: ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__ScriptedTransformation__InModelsAssignment_39133);
            ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ScriptedTransformation__InModelsAssignment_3"


    // $ANTLR start "rule__ScriptedTransformation__OutModelsAssignment_7"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4572:1: rule__ScriptedTransformation__OutModelsAssignment_7 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__ScriptedTransformation__OutModelsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4576:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4577:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4577:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4578:1: ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__ScriptedTransformation__OutModelsAssignment_79164);
            ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__ScriptedTransformation__OutModelsAssignment_7"


    // $ANTLR start "rule__ScriptedTransformation__StatementsAssignment_9"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4587:1: rule__ScriptedTransformation__StatementsAssignment_9 : ( ruleStatement ) ;
    public final void rule__ScriptedTransformation__StatementsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4591:1: ( ( ruleStatement ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4592:1: ( ruleStatement )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4592:1: ( ruleStatement )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4593:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptedTransformationAccess().getStatementsStatementParserRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__ScriptedTransformation__StatementsAssignment_99195);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptedTransformationAccess().getStatementsStatementParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__ScriptedTransformation__StatementsAssignment_9"


    // $ANTLR start "rule__TransformationDefinitionParameter__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4602:1: rule__TransformationDefinitionParameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TransformationDefinitionParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4606:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4607:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4607:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4608:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TransformationDefinitionParameter__NameAssignment_19226);
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


    // $ANTLR start "rule__TraceDefinition__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4619:1: rule__TraceDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TraceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4623:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4624:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4624:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4625:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceDefinition__NameAssignment_19259);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4634:1: rule__TraceDefinition__ElementsAssignment_2_0_1 : ( ruleTraceElementInline ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4638:1: ( ( ruleTraceElementInline ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4639:1: ( ruleTraceElementInline )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4639:1: ( ruleTraceElementInline )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4640:1: ruleTraceElementInline
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_19290);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4649:1: rule__TraceDefinition__ElementsAssignment_2_0_2_1 : ( ruleTraceElementInline ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4653:1: ( ( ruleTraceElementInline ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4654:1: ( ruleTraceElementInline )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4654:1: ( ruleTraceElementInline )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4655:1: ruleTraceElementInline
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_2_19321);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4664:1: rule__TraceDefinition__ElementsAssignment_2_1_0 : ( ruleTraceElementExpanded ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4668:1: ( ( ruleTraceElementExpanded ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4669:1: ( ruleTraceElementExpanded )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4669:1: ( ruleTraceElementExpanded )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4670:1: ruleTraceElementExpanded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_09352);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4679:1: rule__TraceDefinition__ElementsAssignment_2_1_1 : ( ruleTraceElementExpanded ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4683:1: ( ( ruleTraceElementExpanded ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4684:1: ( ruleTraceElementExpanded )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4684:1: ( ruleTraceElementExpanded )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4685:1: ruleTraceElementExpanded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_19383);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4694:1: rule__TraceElementInline__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__TraceElementInline__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4698:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4699:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4699:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4700:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceElementInline__NameAssignment_09414);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4709:1: rule__TraceElementInline__TypeAssignment_2 : ( ruleTypeExpression ) ;
    public final void rule__TraceElementInline__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4713:1: ( ( ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4714:1: ( ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4714:1: ( ruleTypeExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4715:1: ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_rule__TraceElementInline__TypeAssignment_29445);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4724:1: rule__TraceElementExpanded__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TraceElementExpanded__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4728:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4729:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4729:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4730:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceElementExpanded__NameAssignment_19476);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4739:1: rule__TraceElementExpanded__TypeAssignment_3 : ( ruleTypeExpression ) ;
    public final void rule__TraceElementExpanded__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4743:1: ( ( ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4744:1: ( ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4744:1: ( ruleTypeExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4745:1: ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_rule__TraceElementExpanded__TypeAssignment_39507);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4754:1: rule__ClassUse__ModelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassUse__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4758:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4759:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4759:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4760:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4761:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4762:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelRepresentModelIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClassUse__ModelAssignment_09542); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4773:1: rule__ClassUse__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ClassUse__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4777:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4778:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4778:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4779:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getClassNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClassUse__ClassNameAssignment_29577); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getClassNameIDTerminalRuleCall_2_0()); 
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4788:1: rule__PropertyWrite__ReceptorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyWrite__ReceptorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4792:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4793:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4793:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4794:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorVariableCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4795:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4796:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropertyWrite__ReceptorAssignment_09612); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4807:1: rule__PropertyWrite__PropertyAssignment_2 : ( RULE_ID ) ;
    public final void rule__PropertyWrite__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4811:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4812:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4812:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4813:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getPropertyIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropertyWrite__PropertyAssignment_29647); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4822:1: rule__PropertyWrite__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__PropertyWrite__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4826:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4827:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4827:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4828:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getExpressionExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__PropertyWrite__ExpressionAssignment_49678);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4837:1: rule__DefineVariable__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DefineVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4841:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4842:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4842:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4843:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DefineVariable__NameAssignment_09709);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4852:1: rule__DefineVariable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__DefineVariable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4856:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4857:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4857:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4858:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__DefineVariable__ExpressionAssignment_29740);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4867:1: rule__ModelReference__ModelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModelReference__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4871:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4872:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4872:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4873:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4874:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4875:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelRepresentModelIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ModelReference__ModelAssignment_09775); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4886:1: rule__ModelReference__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModelReference__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4890:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4891:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4891:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4892:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ModelReference__ClassNameAssignment_29810);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4901:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4905:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4906:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4906:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4907:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4908:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4909:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment9845); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4920:1: rule__ClosureDeclaration__FormalParametersAssignment_1_1 : ( ruleClosureParameter ) ;
    public final void rule__ClosureDeclaration__FormalParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4924:1: ( ( ruleClosureParameter ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4925:1: ( ruleClosureParameter )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4925:1: ( ruleClosureParameter )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4926:1: ruleClosureParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_19880);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4935:1: rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 : ( ruleClosureParameter ) ;
    public final void rule__ClosureDeclaration__FormalParametersAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4939:1: ( ( ruleClosureParameter ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4940:1: ( ruleClosureParameter )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4940:1: ( ruleClosureParameter )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4941:1: ruleClosureParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_2_19911);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4950:1: rule__ClosureDeclaration__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__ClosureDeclaration__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4954:1: ( ( ruleStatement ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4955:1: ( ruleStatement )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4955:1: ( ruleStatement )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4956:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__ClosureDeclaration__StatementsAssignment_29942);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4965:1: rule__ClosureParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__ClosureParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4969:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4970:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4970:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4971:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClosureParameter__NameAssignment9973); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4980:1: rule__MethodCall__BinaryOpAssignment_1_0_1 : ( ruleBinaryOp ) ;
    public final void rule__MethodCall__BinaryOpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4984:1: ( ( ruleBinaryOp ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4985:1: ( ruleBinaryOp )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4985:1: ( ruleBinaryOp )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4986:1: ruleBinaryOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOp_in_rule__MethodCall__BinaryOpAssignment_1_0_110004);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4995:1: rule__MethodCall__RightAssignment_1_0_2 : ( ruleExpression ) ;
    public final void rule__MethodCall__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:4999:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5000:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5000:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5001:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__RightAssignment_1_0_210035);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5010:1: rule__MethodCall__MethodNameAssignment_1_1_2 : ( ruleEString ) ;
    public final void rule__MethodCall__MethodNameAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5014:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5015:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5015:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5016:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MethodCall__MethodNameAssignment_1_1_210066);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5025:1: rule__MethodCall__WithParametersAssignment_1_1_3_0 : ( ( '(' ) ) ;
    public final void rule__MethodCall__WithParametersAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5029:1: ( ( ( '(' ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5030:1: ( ( '(' ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5030:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5031:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5032:1: ( '(' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5033:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MethodCall__WithParametersAssignment_1_1_3_010102); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5048:1: rule__MethodCall__ParametersAssignment_1_1_3_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5052:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5053:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5053:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5054:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_110141);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5063:1: rule__MethodCall__ParametersAssignment_1_1_3_2_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_1_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5067:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5068:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5068:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5069:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_2_110172);
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


    // $ANTLR start "rule__MethodCall__ParametersAssignment_1_1_4"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5078:1: rule__MethodCall__ParametersAssignment_1_1_4 : ( ruleClosureDeclaration ) ;
    public final void rule__MethodCall__ParametersAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5082:1: ( ( ruleClosureDeclaration ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5083:1: ( ruleClosureDeclaration )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5083:1: ( ruleClosureDeclaration )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5084:1: ruleClosureDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersClosureDeclarationParserRuleCall_1_1_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rule__MethodCall__ParametersAssignment_1_1_410203);
            ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getParametersClosureDeclarationParserRuleCall_1_1_4_0()); 
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
    // $ANTLR end "rule__MethodCall__ParametersAssignment_1_1_4"


    // $ANTLR start "rule__MatchTraceExpression__TraceAssignment_2"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5115:1: rule__MatchTraceExpression__TraceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MatchTraceExpression__TraceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5119:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5120:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5120:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5121:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5122:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5123:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchTraceExpression__TraceAssignment_210260); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5134:1: rule__MatchTraceExpression__TraceExprAssignment_5 : ( ruleTraceExprLanguage ) ;
    public final void rule__MatchTraceExpression__TraceExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5138:1: ( ( ruleTraceExprLanguage ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5139:1: ( ruleTraceExprLanguage )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5139:1: ( ruleTraceExprLanguage )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5140:1: ruleTraceExprLanguage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_rule__MatchTraceExpression__TraceExprAssignment_510295);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5149:1: rule__TraceExprLanguage__TraceVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TraceExprLanguage__TraceVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5153:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5154:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5154:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5155:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5156:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5157:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TraceExprLanguage__TraceVarAssignment_010330); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5168:1: rule__TraceExprLanguage__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__TraceExprLanguage__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5172:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5173:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5173:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5174:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__TraceExprLanguage__ExprAssignment_210365);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5183:1: rule__PutTraceExpression__TraceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PutTraceExpression__TraceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5187:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5188:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5188:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5189:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5190:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5191:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceExpression__TraceAssignment_210400); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5202:1: rule__PutTraceExpression__ParametersAssignment_5 : ( rulePutTraceParameter ) ;
    public final void rule__PutTraceExpression__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5206:1: ( ( rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5207:1: ( rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5207:1: ( rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5208:1: rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_510435);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5217:1: rule__PutTraceExpression__ParametersAssignment_6_1 : ( rulePutTraceParameter ) ;
    public final void rule__PutTraceExpression__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5221:1: ( ( rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5222:1: ( rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5222:1: ( rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5223:1: rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_6_110466);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5232:1: rule__PutTraceParameter__TraceVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PutTraceParameter__TraceVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5236:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5237:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5237:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5238:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5239:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5240:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceParameter__TraceVarAssignment_010501); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5251:1: rule__PutTraceParameter__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__PutTraceParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5255:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5256:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5256:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5257:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__PutTraceParameter__ValueAssignment_210536);
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
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5266:1: rule__NumLiteral__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NumLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5270:1: ( ( ruleEInt ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5271:1: ( ruleEInt )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5271:1: ( ruleEInt )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5272:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NumLiteral__ValueAssignment10567);
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


    // $ANTLR start "rule__FloatLiteral__ValueAssignment"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5281:1: rule__FloatLiteral__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5285:1: ( ( ruleEDouble ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5286:1: ( ruleEDouble )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5286:1: ( ruleEDouble )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5287:1: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueEDoubleParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__FloatLiteral__ValueAssignment10598);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralAccess().getValueEDoubleParserRuleCall_0()); 
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
    // $ANTLR end "rule__FloatLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5296:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5300:1: ( ( RULE_STRING ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5301:1: ( RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5301:1: ( RULE_STRING )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5302:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10629); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"

    // $ANTLR start synpred24_InternalScript
    public final void synpred24_InternalScript_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3018:2: ( rule__MethodCall__Alternatives_1 )
        // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3018:2: rule__MethodCall__Alternatives_1
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Alternatives_1_in_synpred24_InternalScript6113);
        rule__MethodCall__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalScript

    // $ANTLR start synpred25_InternalScript
    public final void synpred25_InternalScript_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3234:2: ( rule__MethodCall__Group_1_1_3__0 )
        // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3234:2: rule__MethodCall__Group_1_1_3__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0_in_synpred25_InternalScript6544);
        rule__MethodCall__Group_1_1_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalScript

    // $ANTLR start synpred26_InternalScript
    public final void synpred26_InternalScript_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3262:2: ( rule__MethodCall__ParametersAssignment_1_1_4 )
        // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:3262:2: rule__MethodCall__ParametersAssignment_1_1_4
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_4_in_synpred26_InternalScript6602);
        rule__MethodCall__ParametersAssignment_1_1_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalScript

    // Delegated rules

    public final boolean synpred26_InternalScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalScript_fragment(); // can never throw exception
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
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA16_eotS =
        "\20\uffff";
    static final String DFA16_eofS =
        "\1\2\17\uffff";
    static final String DFA16_minS =
        "\1\4\1\0\16\uffff";
    static final String DFA16_maxS =
        "\1\44\1\0\16\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA16_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA16_transitionS = {
            "\3\2\6\uffff\1\2\3\uffff\1\1\1\2\2\uffff\2\2\5\uffff\1\2\2\uffff"+
            "\2\2\2\uffff\2\2",
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
            return "3234:1: ( rule__MethodCall__Group_1_1_3__0 )?";
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
                        if ( (synpred25_InternalScript()) ) {s = 15;}

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
    static final String DFA17_eotS =
        "\20\uffff";
    static final String DFA17_eofS =
        "\1\2\17\uffff";
    static final String DFA17_minS =
        "\1\4\1\0\16\uffff";
    static final String DFA17_maxS =
        "\1\44\1\0\16\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA17_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA17_transitionS = {
            "\3\2\6\uffff\1\2\3\uffff\2\2\2\uffff\1\1\1\2\5\uffff\1\2\2\uffff"+
            "\2\2\2\uffff\2\2",
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
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "3262:1: ( rule__MethodCall__ParametersAssignment_1_1_4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalScript()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleScriptedTransformation_in_entryRuleScriptedTransformation67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScriptedTransformation74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__0_in_ruleScriptedTransformation100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__0_in_ruleTransformationDefinitionParameter160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceDefinition196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__0_in_ruleTraceDefinition222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementInline256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__0_in_ruleTraceElementInline282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementExpanded316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__0_in_ruleTraceElementExpanded342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpression376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTypeExpression402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_entryRuleClassUse428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassUse435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__0_in_ruleClassUse461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyWrite555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__0_in_rulePropertyWrite581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefineVariable615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__0_in_ruleDefineVariable641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference668 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelReference675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__0_in_ruleModelReference701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_ruleExpression761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__0_in_ruleParenthesizedExpression880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureDeclaration1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__0_in_ruleClosureDeclaration1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureParameter1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureParameter__NameAssignment_in_ruleClosureParameter1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression1211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchTraceExpression1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__0_in_ruleMatchTraceExpression1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage1271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceExprLanguage1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__0_in_ruleTraceExprLanguage1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression1331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceExpression1338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__0_in_rulePutTraceExpression1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter1391 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceParameter1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__0_in_rulePutTraceParameter1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral1451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumLiteral__ValueAssignment_in_ruleNumLiteral1484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1511 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOp__Alternatives_in_ruleBinaryOp1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__0_in_rule__TraceDefinition__Alternatives_21856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__0_in_rule__TraceDefinition__Alternatives_21874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_rule__Statement__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Statement__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_rule__Statement__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_rule__Statement__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__PrimaryExpression__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_rule__PrimaryExpression__Alternatives2024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rule__PrimaryExpression__Alternatives2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_rule__PrimaryExpression__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rule__PrimaryExpression__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_rule__Literal__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__0_in_rule__MethodCall__Alternatives_12173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BinaryOp__Alternatives2292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BinaryOp__Alternatives2313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BinaryOp__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BinaryOp__Alternatives2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__0__Impl_in_rule__ScriptedTransformation__Group__02388 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__1_in_rule__ScriptedTransformation__Group__02391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ScriptedTransformation__Group__0__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__1__Impl_in_rule__ScriptedTransformation__Group__12450 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__2_in_rule__ScriptedTransformation__Group__12453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__NameAssignment_1_in_rule__ScriptedTransformation__Group__1__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__2__Impl_in_rule__ScriptedTransformation__Group__22510 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__3_in_rule__ScriptedTransformation__Group__22513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ScriptedTransformation__Group__2__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__3__Impl_in_rule__ScriptedTransformation__Group__32572 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__4_in_rule__ScriptedTransformation__Group__32575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__InModelsAssignment_3_in_rule__ScriptedTransformation__Group__3__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__4__Impl_in_rule__ScriptedTransformation__Group__42632 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__5_in_rule__ScriptedTransformation__Group__42635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ScriptedTransformation__Group__4__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__5__Impl_in_rule__ScriptedTransformation__Group__52694 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__6_in_rule__ScriptedTransformation__Group__52697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ScriptedTransformation__Group__5__Impl2725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__6__Impl_in_rule__ScriptedTransformation__Group__62756 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__7_in_rule__ScriptedTransformation__Group__62759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ScriptedTransformation__Group__6__Impl2787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__7__Impl_in_rule__ScriptedTransformation__Group__72818 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__8_in_rule__ScriptedTransformation__Group__72821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__OutModelsAssignment_7_in_rule__ScriptedTransformation__Group__7__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__8__Impl_in_rule__ScriptedTransformation__Group__82878 = new BitSet(new long[]{0x0000001100222070L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__9_in_rule__ScriptedTransformation__Group__82881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ScriptedTransformation__Group__8__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__Group__9__Impl_in_rule__ScriptedTransformation__Group__92940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__StatementsAssignment_9_in_rule__ScriptedTransformation__Group__9__Impl2969 = new BitSet(new long[]{0x0000001100222072L});
        public static final BitSet FOLLOW_rule__ScriptedTransformation__StatementsAssignment_9_in_rule__ScriptedTransformation__Group__9__Impl2981 = new BitSet(new long[]{0x0000001100222072L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__0__Impl_in_rule__TransformationDefinitionParameter__Group__03034 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__1_in_rule__TransformationDefinitionParameter__Group__03037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__1__Impl_in_rule__TransformationDefinitionParameter__Group__13095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__NameAssignment_1_in_rule__TransformationDefinitionParameter__Group__1__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__0__Impl_in_rule__TraceDefinition__Group__03157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__1_in_rule__TraceDefinition__Group__03160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TraceDefinition__Group__0__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__1__Impl_in_rule__TraceDefinition__Group__13219 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__2_in_rule__TraceDefinition__Group__13222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__NameAssignment_1_in_rule__TraceDefinition__Group__1__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__2__Impl_in_rule__TraceDefinition__Group__23279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Alternatives_2_in_rule__TraceDefinition__Group__2__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__0__Impl_in_rule__TraceDefinition__Group_2_0__03342 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__1_in_rule__TraceDefinition__Group_2_0__03345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TraceDefinition__Group_2_0__0__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__1__Impl_in_rule__TraceDefinition__Group_2_0__13404 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__2_in_rule__TraceDefinition__Group_2_0__13407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_1_in_rule__TraceDefinition__Group_2_0__1__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__2__Impl_in_rule__TraceDefinition__Group_2_0__23464 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__3_in_rule__TraceDefinition__Group_2_0__23467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__0_in_rule__TraceDefinition__Group_2_0__2__Impl3494 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__3__Impl_in_rule__TraceDefinition__Group_2_0__33525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TraceDefinition__Group_2_0__3__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__0__Impl_in_rule__TraceDefinition__Group_2_0_2__03592 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__1_in_rule__TraceDefinition__Group_2_0_2__03595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TraceDefinition__Group_2_0_2__0__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__1__Impl_in_rule__TraceDefinition__Group_2_0_2__13654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_2_1_in_rule__TraceDefinition__Group_2_0_2__1__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__0__Impl_in_rule__TraceDefinition__Group_2_1__03715 = new BitSet(new long[]{0x0000000005200000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__1_in_rule__TraceDefinition__Group_2_1__03718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_0_in_rule__TraceDefinition__Group_2_1__0__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__1__Impl_in_rule__TraceDefinition__Group_2_1__13775 = new BitSet(new long[]{0x0000000005200000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__2_in_rule__TraceDefinition__Group_2_1__13778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_1_in_rule__TraceDefinition__Group_2_1__1__Impl3805 = new BitSet(new long[]{0x0000000004200002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__2__Impl_in_rule__TraceDefinition__Group_2_1__23836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TraceDefinition__Group_2_1__2__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__0__Impl_in_rule__TraceElementInline__Group__03901 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__1_in_rule__TraceElementInline__Group__03904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__NameAssignment_0_in_rule__TraceElementInline__Group__0__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__1__Impl_in_rule__TraceElementInline__Group__13961 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__2_in_rule__TraceElementInline__Group__13964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TraceElementInline__Group__1__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__2__Impl_in_rule__TraceElementInline__Group__24023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__TypeAssignment_2_in_rule__TraceElementInline__Group__2__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__0__Impl_in_rule__TraceElementExpanded__Group__04086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__1_in_rule__TraceElementExpanded__Group__04089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TraceElementExpanded__Group__0__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__1__Impl_in_rule__TraceElementExpanded__Group__14148 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__2_in_rule__TraceElementExpanded__Group__14151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__NameAssignment_1_in_rule__TraceElementExpanded__Group__1__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__2__Impl_in_rule__TraceElementExpanded__Group__24208 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__3_in_rule__TraceElementExpanded__Group__24211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TraceElementExpanded__Group__2__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__3__Impl_in_rule__TraceElementExpanded__Group__34270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__TypeAssignment_3_in_rule__TraceElementExpanded__Group__3__Impl4297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__0__Impl_in_rule__ClassUse__Group__04335 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__1_in_rule__ClassUse__Group__04338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__ModelAssignment_0_in_rule__ClassUse__Group__0__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__1__Impl_in_rule__ClassUse__Group__14395 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__2_in_rule__ClassUse__Group__14398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ClassUse__Group__1__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__2__Impl_in_rule__ClassUse__Group__24457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__ClassNameAssignment_2_in_rule__ClassUse__Group__2__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__0__Impl_in_rule__PropertyWrite__Group__04520 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__1_in_rule__PropertyWrite__Group__04523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__ReceptorAssignment_0_in_rule__PropertyWrite__Group__0__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__1__Impl_in_rule__PropertyWrite__Group__14580 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__2_in_rule__PropertyWrite__Group__14583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__PropertyWrite__Group__1__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__2__Impl_in_rule__PropertyWrite__Group__24642 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__3_in_rule__PropertyWrite__Group__24645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__PropertyAssignment_2_in_rule__PropertyWrite__Group__2__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__3__Impl_in_rule__PropertyWrite__Group__34702 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__4_in_rule__PropertyWrite__Group__34705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PropertyWrite__Group__3__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__4__Impl_in_rule__PropertyWrite__Group__44764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__ExpressionAssignment_4_in_rule__PropertyWrite__Group__4__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__0__Impl_in_rule__DefineVariable__Group__04831 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__1_in_rule__DefineVariable__Group__04834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__NameAssignment_0_in_rule__DefineVariable__Group__0__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__1__Impl_in_rule__DefineVariable__Group__14891 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__2_in_rule__DefineVariable__Group__14894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__DefineVariable__Group__1__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__2__Impl_in_rule__DefineVariable__Group__24953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__ExpressionAssignment_2_in_rule__DefineVariable__Group__2__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__0__Impl_in_rule__ModelReference__Group__05016 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__1_in_rule__ModelReference__Group__05019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__ModelAssignment_0_in_rule__ModelReference__Group__0__Impl5046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__1__Impl_in_rule__ModelReference__Group__15076 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__2_in_rule__ModelReference__Group__15079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ModelReference__Group__1__Impl5107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__2__Impl_in_rule__ModelReference__Group__25138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__ClassNameAssignment_2_in_rule__ModelReference__Group__2__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__0__Impl_in_rule__ParenthesizedExpression__Group__05201 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__1_in_rule__ParenthesizedExpression__Group__05204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ParenthesizedExpression__Group__0__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__1__Impl_in_rule__ParenthesizedExpression__Group__15263 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__2_in_rule__ParenthesizedExpression__Group__15266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ParenthesizedExpression__Group__1__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__2__Impl_in_rule__ParenthesizedExpression__Group__25322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ParenthesizedExpression__Group__2__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__0__Impl_in_rule__ClosureDeclaration__Group__05387 = new BitSet(new long[]{0x0000001140222070L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__1_in_rule__ClosureDeclaration__Group__05390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ClosureDeclaration__Group__0__Impl5418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__1__Impl_in_rule__ClosureDeclaration__Group__15449 = new BitSet(new long[]{0x0000001140222070L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__2_in_rule__ClosureDeclaration__Group__15452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__0_in_rule__ClosureDeclaration__Group__1__Impl5479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__2__Impl_in_rule__ClosureDeclaration__Group__25510 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__3_in_rule__ClosureDeclaration__Group__25513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl5542 = new BitSet(new long[]{0x0000001140222072L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl5554 = new BitSet(new long[]{0x0000001140222072L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__3__Impl_in_rule__ClosureDeclaration__Group__35587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ClosureDeclaration__Group__3__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__0__Impl_in_rule__ClosureDeclaration__Group_1__05654 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__1_in_rule__ClosureDeclaration__Group_1__05657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ClosureDeclaration__Group_1__0__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__1__Impl_in_rule__ClosureDeclaration__Group_1__15716 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__2_in_rule__ClosureDeclaration__Group_1__15719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_1_in_rule__ClosureDeclaration__Group_1__1__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__2__Impl_in_rule__ClosureDeclaration__Group_1__25776 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__3_in_rule__ClosureDeclaration__Group_1__25779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__0_in_rule__ClosureDeclaration__Group_1__2__Impl5806 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__3__Impl_in_rule__ClosureDeclaration__Group_1__35837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ClosureDeclaration__Group_1__3__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__0__Impl_in_rule__ClosureDeclaration__Group_1_2__05904 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__1_in_rule__ClosureDeclaration__Group_1_2__05907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ClosureDeclaration__Group_1_2__0__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__1__Impl_in_rule__ClosureDeclaration__Group_1_2__15966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_2_1_in_rule__ClosureDeclaration__Group_1_2__1__Impl5993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__06027 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__06030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__MethodCall__Group__0__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__16086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Alternatives_1_in_rule__MethodCall__Group__1__Impl6113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__0__Impl_in_rule__MethodCall__Group_1_0__06148 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__1_in_rule__MethodCall__Group_1_0__06151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__1__Impl_in_rule__MethodCall__Group_1_0__16209 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__2_in_rule__MethodCall__Group_1_0__16212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__BinaryOpAssignment_1_0_1_in_rule__MethodCall__Group_1_0__1__Impl6239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__2__Impl_in_rule__MethodCall__Group_1_0__26269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__RightAssignment_1_0_2_in_rule__MethodCall__Group_1_0__2__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0__Impl_in_rule__MethodCall__Group_1_1__06332 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__1_in_rule__MethodCall__Group_1_1__06335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_0__0_in_rule__MethodCall__Group_1_1__0__Impl6362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__1__Impl_in_rule__MethodCall__Group_1_1__16392 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__2_in_rule__MethodCall__Group_1_1__16395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MethodCall__Group_1_1__1__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__2__Impl_in_rule__MethodCall__Group_1_1__26454 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__3_in_rule__MethodCall__Group_1_1__26457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__MethodNameAssignment_1_1_2_in_rule__MethodCall__Group_1_1__2__Impl6484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__3__Impl_in_rule__MethodCall__Group_1_1__36514 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__4_in_rule__MethodCall__Group_1_1__36517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0_in_rule__MethodCall__Group_1_1__3__Impl6544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__4__Impl_in_rule__MethodCall__Group_1_1__46575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_4_in_rule__MethodCall__Group_1_1__4__Impl6602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_0__0__Impl_in_rule__MethodCall__Group_1_1_0__06643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0__Impl_in_rule__MethodCall__Group_1_1_3__06703 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__1_in_rule__MethodCall__Group_1_1_3__06706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__WithParametersAssignment_1_1_3_0_in_rule__MethodCall__Group_1_1_3__0__Impl6733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__1__Impl_in_rule__MethodCall__Group_1_1_3__16763 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__2_in_rule__MethodCall__Group_1_1_3__16766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_1_in_rule__MethodCall__Group_1_1_3__1__Impl6793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__2__Impl_in_rule__MethodCall__Group_1_1_3__26823 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__3_in_rule__MethodCall__Group_1_1_3__26826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__0_in_rule__MethodCall__Group_1_1_3__2__Impl6853 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__3__Impl_in_rule__MethodCall__Group_1_1_3__36884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MethodCall__Group_1_1_3__3__Impl6912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__0__Impl_in_rule__MethodCall__Group_1_1_3_2__06951 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__1_in_rule__MethodCall__Group_1_1_3_2__06954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MethodCall__Group_1_1_3_2__0__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__1__Impl_in_rule__MethodCall__Group_1_1_3_2__17013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_2_1_in_rule__MethodCall__Group_1_1_3_2__1__Impl7040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__0__Impl_in_rule__MatchTraceExpression__Group__07093 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__1_in_rule__MatchTraceExpression__Group__07096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MatchTraceExpression__Group__0__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__1__Impl_in_rule__MatchTraceExpression__Group__17155 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__2_in_rule__MatchTraceExpression__Group__17158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__0_in_rule__MatchTraceExpression__Group__1__Impl7185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__2__Impl_in_rule__MatchTraceExpression__Group__27216 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__3_in_rule__MatchTraceExpression__Group__27219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__TraceAssignment_2_in_rule__MatchTraceExpression__Group__2__Impl7246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__3__Impl_in_rule__MatchTraceExpression__Group__37276 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__4_in_rule__MatchTraceExpression__Group__37279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MatchTraceExpression__Group__3__Impl7307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__4__Impl_in_rule__MatchTraceExpression__Group__47338 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__5_in_rule__MatchTraceExpression__Group__47341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MatchTraceExpression__Group__4__Impl7369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__5__Impl_in_rule__MatchTraceExpression__Group__57400 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__6_in_rule__MatchTraceExpression__Group__57403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__TraceExprAssignment_5_in_rule__MatchTraceExpression__Group__5__Impl7430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__6__Impl_in_rule__MatchTraceExpression__Group__67460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MatchTraceExpression__Group__6__Impl7488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__0__Impl_in_rule__MatchTraceExpression__Group_1__07533 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__1_in_rule__MatchTraceExpression__Group_1__07536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchTraceExpression__Group_1__0__Impl7563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__1__Impl_in_rule__MatchTraceExpression__Group_1__17592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MatchTraceExpression__Group_1__1__Impl7620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__0__Impl_in_rule__TraceExprLanguage__Group__07655 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__1_in_rule__TraceExprLanguage__Group__07658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__TraceVarAssignment_0_in_rule__TraceExprLanguage__Group__0__Impl7685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__1__Impl_in_rule__TraceExprLanguage__Group__17715 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__2_in_rule__TraceExprLanguage__Group__17718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TraceExprLanguage__Group__1__Impl7746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__2__Impl_in_rule__TraceExprLanguage__Group__27777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__ExprAssignment_2_in_rule__TraceExprLanguage__Group__2__Impl7804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__0__Impl_in_rule__PutTraceExpression__Group__07840 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__1_in_rule__PutTraceExpression__Group__07843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__PutTraceExpression__Group__0__Impl7871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__1__Impl_in_rule__PutTraceExpression__Group__17902 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__2_in_rule__PutTraceExpression__Group__17905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__0_in_rule__PutTraceExpression__Group__1__Impl7932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__2__Impl_in_rule__PutTraceExpression__Group__27963 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__3_in_rule__PutTraceExpression__Group__27966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__TraceAssignment_2_in_rule__PutTraceExpression__Group__2__Impl7993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__3__Impl_in_rule__PutTraceExpression__Group__38023 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__4_in_rule__PutTraceExpression__Group__38026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__PutTraceExpression__Group__3__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__4__Impl_in_rule__PutTraceExpression__Group__48085 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__5_in_rule__PutTraceExpression__Group__48088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PutTraceExpression__Group__4__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__5__Impl_in_rule__PutTraceExpression__Group__58147 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__6_in_rule__PutTraceExpression__Group__58150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__ParametersAssignment_5_in_rule__PutTraceExpression__Group__5__Impl8177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__6__Impl_in_rule__PutTraceExpression__Group__68207 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__7_in_rule__PutTraceExpression__Group__68210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl8239 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl8251 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__7__Impl_in_rule__PutTraceExpression__Group__78284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__PutTraceExpression__Group__7__Impl8312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__0__Impl_in_rule__PutTraceExpression__Group_1__08359 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__1_in_rule__PutTraceExpression__Group_1__08362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceExpression__Group_1__0__Impl8389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__1__Impl_in_rule__PutTraceExpression__Group_1__18418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__PutTraceExpression__Group_1__1__Impl8446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0__Impl_in_rule__PutTraceExpression__Group_6__08481 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__1_in_rule__PutTraceExpression__Group_6__08484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__PutTraceExpression__Group_6__0__Impl8512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__1__Impl_in_rule__PutTraceExpression__Group_6__18543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__ParametersAssignment_6_1_in_rule__PutTraceExpression__Group_6__1__Impl8570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__0__Impl_in_rule__PutTraceParameter__Group__08604 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__1_in_rule__PutTraceParameter__Group__08607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__TraceVarAssignment_0_in_rule__PutTraceParameter__Group__0__Impl8634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__1__Impl_in_rule__PutTraceParameter__Group__18664 = new BitSet(new long[]{0x0000000100222070L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__2_in_rule__PutTraceParameter__Group__18667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PutTraceParameter__Group__1__Impl8695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__2__Impl_in_rule__PutTraceParameter__Group__28726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__ValueAssignment_2_in_rule__PutTraceParameter__Group__2__Impl8753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__08789 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__08792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl8819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__18848 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__18851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__EDouble__Group__1__Impl8879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__28910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl8937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08972 = new BitSet(new long[]{0x0000000000002040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EInt__Group__0__Impl9004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ScriptedTransformation__NameAssignment_19102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__ScriptedTransformation__InModelsAssignment_39133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__ScriptedTransformation__OutModelsAssignment_79164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__ScriptedTransformation__StatementsAssignment_99195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TransformationDefinitionParameter__NameAssignment_19226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceDefinition__NameAssignment_19259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_19290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_2_19321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_09352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_19383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceElementInline__NameAssignment_09414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_rule__TraceElementInline__TypeAssignment_29445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceElementExpanded__NameAssignment_19476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_rule__TraceElementExpanded__TypeAssignment_39507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClassUse__ModelAssignment_09542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClassUse__ClassNameAssignment_29577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyWrite__ReceptorAssignment_09612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyWrite__PropertyAssignment_29647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__PropertyWrite__ExpressionAssignment_49678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DefineVariable__NameAssignment_09709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__DefineVariable__ExpressionAssignment_29740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ModelReference__ModelAssignment_09775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ModelReference__ClassNameAssignment_29810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment9845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_19880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_2_19911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__ClosureDeclaration__StatementsAssignment_29942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClosureParameter__NameAssignment9973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOp_in_rule__MethodCall__BinaryOpAssignment_1_0_110004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__RightAssignment_1_0_210035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MethodCall__MethodNameAssignment_1_1_210066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MethodCall__WithParametersAssignment_1_1_3_010102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_110141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_2_110172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rule__MethodCall__ParametersAssignment_1_1_410203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchTraceExpression__TraceAssignment_210260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_rule__MatchTraceExpression__TraceExprAssignment_510295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TraceExprLanguage__TraceVarAssignment_010330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__TraceExprLanguage__ExprAssignment_210365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceExpression__TraceAssignment_210400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_510435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_6_110466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceParameter__TraceVarAssignment_010501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__PutTraceParameter__ValueAssignment_210536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NumLiteral__ValueAssignment10567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__FloatLiteral__ValueAssignment10598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Alternatives_1_in_synpred24_InternalScript6113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0_in_synpred25_InternalScript6544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_4_in_synpred26_InternalScript6602 = new BitSet(new long[]{0x0000000000000002L});
    }


}