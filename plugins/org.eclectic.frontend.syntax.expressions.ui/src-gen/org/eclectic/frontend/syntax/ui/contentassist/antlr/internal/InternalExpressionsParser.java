package org.eclectic.frontend.syntax.ui.contentassist.antlr.internal; 

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
import org.eclectic.frontend.syntax.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_KEYWORD_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'^'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'trace'", "'end'", "'link'", "'{'", "'}'", "';'", "':'", "'var'", "'!'", "'.'", "'='", "'if'", "'elsif'", "'else'", "'('", "')'", "'|'", "','", "'match'", "'with'", "'['", "']'", "'put'"
    };
    public static final int T__42=42;
    public static final int RULE_KEYWORD_ID=7;
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
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


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTraceInterface"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:61:1: entryRuleTraceInterface : ruleTraceInterface EOF ;
    public final void entryRuleTraceInterface() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: ( ruleTraceInterface EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:63:1: ruleTraceInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceInterface_in_entryRuleTraceInterface67);
            ruleTraceInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceInterface74); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:70:1: ruleTraceInterface : ( ( rule__TraceInterface__Group__0 ) ) ;
    public final void ruleTraceInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:74:2: ( ( ( rule__TraceInterface__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( ( rule__TraceInterface__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( ( rule__TraceInterface__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( rule__TraceInterface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:77:1: ( rule__TraceInterface__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:77:2: rule__TraceInterface__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__0_in_ruleTraceInterface100);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:89:1: entryRuleTraceDefinition : ruleTraceDefinition EOF ;
    public final void entryRuleTraceDefinition() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: ( ruleTraceDefinition EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:91:1: ruleTraceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition127);
            ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceDefinitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceDefinition134); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:98:1: ruleTraceDefinition : ( ( rule__TraceDefinition__Group__0 ) ) ;
    public final void ruleTraceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:102:2: ( ( ( rule__TraceDefinition__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( ( rule__TraceDefinition__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( ( rule__TraceDefinition__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( rule__TraceDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:105:1: ( rule__TraceDefinition__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:105:2: rule__TraceDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__0_in_ruleTraceDefinition160);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:117:1: entryRuleTraceElementInline : ruleTraceElementInline EOF ;
    public final void entryRuleTraceElementInline() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: ( ruleTraceElementInline EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:119:1: ruleTraceElementInline EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline187);
            ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementInlineRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementInline194); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:126:1: ruleTraceElementInline : ( ( rule__TraceElementInline__Group__0 ) ) ;
    public final void ruleTraceElementInline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:130:2: ( ( ( rule__TraceElementInline__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( ( rule__TraceElementInline__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( ( rule__TraceElementInline__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( rule__TraceElementInline__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:133:1: ( rule__TraceElementInline__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:133:2: rule__TraceElementInline__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__0_in_ruleTraceElementInline220);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:145:1: entryRuleTraceElementExpanded : ruleTraceElementExpanded EOF ;
    public final void entryRuleTraceElementExpanded() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: ( ruleTraceElementExpanded EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:147:1: ruleTraceElementExpanded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded247);
            ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceElementExpandedRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementExpanded254); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:154:1: ruleTraceElementExpanded : ( ( rule__TraceElementExpanded__Group__0 ) ) ;
    public final void ruleTraceElementExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:158:2: ( ( ( rule__TraceElementExpanded__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( ( rule__TraceElementExpanded__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( ( rule__TraceElementExpanded__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( rule__TraceElementExpanded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:161:1: ( rule__TraceElementExpanded__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:161:2: rule__TraceElementExpanded__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__0_in_ruleTraceElementExpanded280);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: entryRuleTypeExpression : ruleTypeExpression EOF ;
    public final void entryRuleTypeExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: ( ruleTypeExpression EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:175:1: ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression307);
            ruleTypeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpression314); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:182:1: ruleTypeExpression : ( ruleClassUse ) ;
    public final void ruleTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:186:2: ( ( ruleClassUse ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( ruleClassUse )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ruleClassUse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTypeExpression340);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: entryRuleClassUse : ruleClassUse EOF ;
    public final void entryRuleClassUse() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: ( ruleClassUse EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:203:1: ruleClassUse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_entryRuleClassUse366);
            ruleClassUse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassUse373); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:210:1: ruleClassUse : ( ( rule__ClassUse__Group__0 ) ) ;
    public final void ruleClassUse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:214:2: ( ( ( rule__ClassUse__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( ( rule__ClassUse__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( ( rule__ClassUse__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( rule__ClassUse__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:217:1: ( rule__ClassUse__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:217:2: rule__ClassUse__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__0_in_ruleClassUse399);
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


    // $ANTLR start "entryRuleSingleAnnotation"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:229:1: entryRuleSingleAnnotation : ruleSingleAnnotation EOF ;
    public final void entryRuleSingleAnnotation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: ( ruleSingleAnnotation EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:231:1: ruleSingleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation426);
            ruleSingleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleAnnotation433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSingleAnnotation"


    // $ANTLR start "ruleSingleAnnotation"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:238:1: ruleSingleAnnotation : ( rulePotencyAnnotation ) ;
    public final void ruleSingleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:242:2: ( ( rulePotencyAnnotation ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( rulePotencyAnnotation )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( rulePotencyAnnotation )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: rulePotencyAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleAnnotationAccess().getPotencyAnnotationParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation459);
            rulePotencyAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleAnnotationAccess().getPotencyAnnotationParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleAnnotation"


    // $ANTLR start "entryRulePotencyAnnotation"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:257:1: entryRulePotencyAnnotation : rulePotencyAnnotation EOF ;
    public final void entryRulePotencyAnnotation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: ( rulePotencyAnnotation EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:259:1: rulePotencyAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPotencyAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation485);
            rulePotencyAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPotencyAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePotencyAnnotation492); if (state.failed) return ;

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
    // $ANTLR end "entryRulePotencyAnnotation"


    // $ANTLR start "rulePotencyAnnotation"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:266:1: rulePotencyAnnotation : ( ( rule__PotencyAnnotation__Group__0 ) ) ;
    public final void rulePotencyAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:270:2: ( ( ( rule__PotencyAnnotation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( ( rule__PotencyAnnotation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( ( rule__PotencyAnnotation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( rule__PotencyAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPotencyAnnotationAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( rule__PotencyAnnotation__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:273:2: rule__PotencyAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Group__0_in_rulePotencyAnnotation518);
            rule__PotencyAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPotencyAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePotencyAnnotation"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:285:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: ( ruleStatement EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:287:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement545);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement552); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:294:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:298:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: ( rule__Statement__Alternatives )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:301:2: rule__Statement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statement__Alternatives_in_ruleStatement578);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:313:1: entryRulePropertyWrite : rulePropertyWrite EOF ;
    public final void entryRulePropertyWrite() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: ( rulePropertyWrite EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:315:1: rulePropertyWrite EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite605);
            rulePropertyWrite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyWriteRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyWrite612); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:322:1: rulePropertyWrite : ( ( rule__PropertyWrite__Group__0 ) ) ;
    public final void rulePropertyWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:326:2: ( ( ( rule__PropertyWrite__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( ( rule__PropertyWrite__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( ( rule__PropertyWrite__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( rule__PropertyWrite__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ( rule__PropertyWrite__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:329:2: rule__PropertyWrite__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__0_in_rulePropertyWrite638);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:341:1: entryRuleDefineVariable : ruleDefineVariable EOF ;
    public final void entryRuleDefineVariable() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: ( ruleDefineVariable EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:343:1: ruleDefineVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable665);
            ruleDefineVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefineVariableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefineVariable672); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:350:1: ruleDefineVariable : ( ( rule__DefineVariable__Group__0 ) ) ;
    public final void ruleDefineVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:354:2: ( ( ( rule__DefineVariable__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( ( rule__DefineVariable__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( ( rule__DefineVariable__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( rule__DefineVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:357:1: ( rule__DefineVariable__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:357:2: rule__DefineVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__0_in_ruleDefineVariable698);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: ( ruleModelReference EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_entryRuleModelReference725);
            ruleModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelReference732); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:378:1: ruleModelReference : ( ( rule__ModelReference__Group__0 ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:382:2: ( ( ( rule__ModelReference__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( ( rule__ModelReference__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( ( rule__ModelReference__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( rule__ModelReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:385:1: ( rule__ModelReference__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:385:2: rule__ModelReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__0_in_ruleModelReference758);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:397:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: ( ruleExpression EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:399:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression785);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression792); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:406:1: ruleExpression : ( ruleMethodCall ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:410:2: ( ( ruleMethodCall ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ruleMethodCall )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ruleMethodCall )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_ruleExpression818);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:425:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:426:1: ( rulePrimaryExpression EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:427:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression844);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression851); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:434:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:438:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:441:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:441:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression877);
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


    // $ANTLR start "entryRuleIfExpr"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:453:1: entryRuleIfExpr : ruleIfExpr EOF ;
    public final void entryRuleIfExpr() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:454:1: ( ruleIfExpr EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:455:1: ruleIfExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpr_in_entryRuleIfExpr904);
            ruleIfExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpr911); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfExpr"


    // $ANTLR start "ruleIfExpr"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:462:1: ruleIfExpr : ( ( rule__IfExpr__Group__0 ) ) ;
    public final void ruleIfExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:466:2: ( ( ( rule__IfExpr__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( ( rule__IfExpr__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( ( rule__IfExpr__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( rule__IfExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:469:1: ( rule__IfExpr__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:469:2: rule__IfExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__0_in_ruleIfExpr937);
            rule__IfExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfExpr"


    // $ANTLR start "entryRuleConditionBranch"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:481:1: entryRuleConditionBranch : ruleConditionBranch EOF ;
    public final void entryRuleConditionBranch() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:482:1: ( ruleConditionBranch EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:483:1: ruleConditionBranch EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBranchRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionBranch_in_entryRuleConditionBranch964);
            ruleConditionBranch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBranchRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditionBranch971); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConditionBranch"


    // $ANTLR start "ruleConditionBranch"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:490:1: ruleConditionBranch : ( ( rule__ConditionBranch__Group__0 ) ) ;
    public final void ruleConditionBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:494:2: ( ( ( rule__ConditionBranch__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( ( rule__ConditionBranch__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( ( rule__ConditionBranch__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( rule__ConditionBranch__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBranchAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:497:1: ( rule__ConditionBranch__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:497:2: rule__ConditionBranch__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConditionBranch__Group__0_in_ruleConditionBranch997);
            rule__ConditionBranch__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBranchAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionBranch"


    // $ANTLR start "entryRuleBranchBranch"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:509:1: entryRuleBranchBranch : ruleBranchBranch EOF ;
    public final void entryRuleBranchBranch() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:510:1: ( ruleBranchBranch EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:511:1: ruleBranchBranch EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBranchBranchRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBranchBranch_in_entryRuleBranchBranch1024);
            ruleBranchBranch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBranchBranchRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBranchBranch1031); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBranchBranch"


    // $ANTLR start "ruleBranchBranch"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:518:1: ruleBranchBranch : ( ( ( rule__BranchBranch__StatementsAssignment ) ) ( ( rule__BranchBranch__StatementsAssignment )* ) ) ;
    public final void ruleBranchBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:522:2: ( ( ( ( rule__BranchBranch__StatementsAssignment ) ) ( ( rule__BranchBranch__StatementsAssignment )* ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( ( rule__BranchBranch__StatementsAssignment ) ) ( ( rule__BranchBranch__StatementsAssignment )* ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( ( rule__BranchBranch__StatementsAssignment ) ) ( ( rule__BranchBranch__StatementsAssignment )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( ( rule__BranchBranch__StatementsAssignment ) ) ( ( rule__BranchBranch__StatementsAssignment )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( ( rule__BranchBranch__StatementsAssignment ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:525:1: ( rule__BranchBranch__StatementsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBranchBranchAccess().getStatementsAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:526:1: ( rule__BranchBranch__StatementsAssignment )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:526:2: rule__BranchBranch__StatementsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BranchBranch__StatementsAssignment_in_ruleBranchBranch1059);
            rule__BranchBranch__StatementsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBranchBranchAccess().getStatementsAssignment()); 
            }

            }

            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:529:1: ( ( rule__BranchBranch__StatementsAssignment )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:530:1: ( rule__BranchBranch__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBranchBranchAccess().getStatementsAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:531:1: ( rule__BranchBranch__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_INT)||(LA1_0>=14 && LA1_0<=15)||LA1_0==17||LA1_0==23||LA1_0==31||LA1_0==34||LA1_0==38||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:531:2: rule__BranchBranch__StatementsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BranchBranch__StatementsAssignment_in_ruleBranchBranch1071);
            	    rule__BranchBranch__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBranchBranchAccess().getStatementsAssignment()); 
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
    // $ANTLR end "ruleBranchBranch"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:544:1: entryRuleParenthesizedExpression : ruleParenthesizedExpression EOF ;
    public final void entryRuleParenthesizedExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:545:1: ( ruleParenthesizedExpression EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:546:1: ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression1101);
            ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedExpression1108); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:553:1: ruleParenthesizedExpression : ( ( rule__ParenthesizedExpression__Group__0 ) ) ;
    public final void ruleParenthesizedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:557:2: ( ( ( rule__ParenthesizedExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:558:1: ( ( rule__ParenthesizedExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:558:1: ( ( rule__ParenthesizedExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:559:1: ( rule__ParenthesizedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:560:1: ( rule__ParenthesizedExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:560:2: rule__ParenthesizedExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__0_in_ruleParenthesizedExpression1134);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:572:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:573:1: ( ruleLiteral EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:574:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral1161);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral1168); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:581:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:585:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:586:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:586:1: ( ( rule__Literal__Alternatives ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:587:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:588:1: ( rule__Literal__Alternatives )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:588:2: rule__Literal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1194);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:600:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:601:1: ( ruleVariableReference EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:602:1: ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference1221);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference1228); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: ruleVariableReference : ( ( rule__VariableReference__VariableAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:613:2: ( ( ( rule__VariableReference__VariableAssignment ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:614:1: ( ( rule__VariableReference__VariableAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:614:1: ( ( rule__VariableReference__VariableAssignment ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:615:1: ( rule__VariableReference__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:616:1: ( rule__VariableReference__VariableAssignment )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:616:2: rule__VariableReference__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference1254);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:628:1: entryRuleClosureDeclaration : ruleClosureDeclaration EOF ;
    public final void entryRuleClosureDeclaration() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:629:1: ( ruleClosureDeclaration EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:630:1: ruleClosureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration1281);
            ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureDeclaration1288); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:637:1: ruleClosureDeclaration : ( ( rule__ClosureDeclaration__Group__0 ) ) ;
    public final void ruleClosureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:641:2: ( ( ( rule__ClosureDeclaration__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:642:1: ( ( rule__ClosureDeclaration__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:642:1: ( ( rule__ClosureDeclaration__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:643:1: ( rule__ClosureDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:644:1: ( rule__ClosureDeclaration__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:644:2: rule__ClosureDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__0_in_ruleClosureDeclaration1314);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:656:1: entryRuleClosureParameter : ruleClosureParameter EOF ;
    public final void entryRuleClosureParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:657:1: ( ruleClosureParameter EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:658:1: ruleClosureParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter1341);
            ruleClosureParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureParameter1348); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:665:1: ruleClosureParameter : ( ( rule__ClosureParameter__NameAssignment ) ) ;
    public final void ruleClosureParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:669:2: ( ( ( rule__ClosureParameter__NameAssignment ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:670:1: ( ( rule__ClosureParameter__NameAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:670:1: ( ( rule__ClosureParameter__NameAssignment ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:671:1: ( rule__ClosureParameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterAccess().getNameAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:672:1: ( rule__ClosureParameter__NameAssignment )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:672:2: rule__ClosureParameter__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureParameter__NameAssignment_in_ruleClosureParameter1374);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:684:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:685:1: ( ruleMethodCall EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:686:1: ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_entryRuleMethodCall1401);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodCall1408); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:693:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:697:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( rule__MethodCall__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( rule__MethodCall__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( rule__MethodCall__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:700:2: rule__MethodCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall1434);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:716:1: entryRuleMatchTraceExpression : ruleMatchTraceExpression EOF ;
    public final void entryRuleMatchTraceExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:717:1: ( ruleMatchTraceExpression EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:718:1: ruleMatchTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression1465);
            ruleMatchTraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTraceExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchTraceExpression1472); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:725:1: ruleMatchTraceExpression : ( ( rule__MatchTraceExpression__Group__0 ) ) ;
    public final void ruleMatchTraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:729:2: ( ( ( rule__MatchTraceExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:730:1: ( ( rule__MatchTraceExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:730:1: ( ( rule__MatchTraceExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:731:1: ( rule__MatchTraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:732:1: ( rule__MatchTraceExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:732:2: rule__MatchTraceExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__0_in_ruleMatchTraceExpression1498);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:744:1: entryRuleTraceExprLanguage : ruleTraceExprLanguage EOF ;
    public final void entryRuleTraceExprLanguage() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:745:1: ( ruleTraceExprLanguage EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:746:1: ruleTraceExprLanguage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage1525);
            ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceExprLanguageRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceExprLanguage1532); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:753:1: ruleTraceExprLanguage : ( ( rule__TraceExprLanguage__Group__0 ) ) ;
    public final void ruleTraceExprLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:757:2: ( ( ( rule__TraceExprLanguage__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: ( ( rule__TraceExprLanguage__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: ( ( rule__TraceExprLanguage__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:759:1: ( rule__TraceExprLanguage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:760:1: ( rule__TraceExprLanguage__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:760:2: rule__TraceExprLanguage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__0_in_ruleTraceExprLanguage1558);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:772:1: entryRulePutTraceExpression : rulePutTraceExpression EOF ;
    public final void entryRulePutTraceExpression() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:773:1: ( rulePutTraceExpression EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:774:1: rulePutTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression1585);
            rulePutTraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceExpression1592); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:781:1: rulePutTraceExpression : ( ( rule__PutTraceExpression__Group__0 ) ) ;
    public final void rulePutTraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:785:2: ( ( ( rule__PutTraceExpression__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:786:1: ( ( rule__PutTraceExpression__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:786:1: ( ( rule__PutTraceExpression__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:787:1: ( rule__PutTraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:788:1: ( rule__PutTraceExpression__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:788:2: rule__PutTraceExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__0_in_rulePutTraceExpression1618);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:800:1: entryRulePutTraceParameter : rulePutTraceParameter EOF ;
    public final void entryRulePutTraceParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:801:1: ( rulePutTraceParameter EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:802:1: rulePutTraceParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter1645);
            rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceParameter1652); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:809:1: rulePutTraceParameter : ( ( rule__PutTraceParameter__Group__0 ) ) ;
    public final void rulePutTraceParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:813:2: ( ( ( rule__PutTraceParameter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:814:1: ( ( rule__PutTraceParameter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:814:1: ( ( rule__PutTraceParameter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:815:1: ( rule__PutTraceParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:816:1: ( rule__PutTraceParameter__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:816:2: rule__PutTraceParameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__0_in_rulePutTraceParameter1678);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:828:1: entryRuleNumLiteral : ruleNumLiteral EOF ;
    public final void entryRuleNumLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:829:1: ( ruleNumLiteral EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:830:1: ruleNumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral1705);
            ruleNumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumLiteral1712); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:837:1: ruleNumLiteral : ( ( rule__NumLiteral__ValueAssignment ) ) ;
    public final void ruleNumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:841:2: ( ( ( rule__NumLiteral__ValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:842:1: ( ( rule__NumLiteral__ValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:842:1: ( ( rule__NumLiteral__ValueAssignment ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:843:1: ( rule__NumLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:844:1: ( rule__NumLiteral__ValueAssignment )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:844:2: rule__NumLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumLiteral__ValueAssignment_in_ruleNumLiteral1738);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:856:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:857:1: ( ruleFloatLiteral EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:858:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1765);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatLiteral1772); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:865:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:869:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:870:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:870:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:871:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:872:1: ( rule__FloatLiteral__ValueAssignment )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:872:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1798);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:884:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:885:1: ( ruleEDouble EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:886:1: ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1825);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1832); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:893:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:897:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:898:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:898:1: ( ( rule__EDouble__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:899:1: ( rule__EDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:900:1: ( rule__EDouble__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:900:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1858);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:912:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:913:1: ( ruleStringLiteral EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:914:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1885);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral1892); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:921:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:925:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:926:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:926:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:927:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:928:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:928:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1918);
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


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:940:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:941:1: ( ruleBooleanLiteral EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:942:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1945);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteral1952); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:949:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:953:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:954:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:954:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:955:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:956:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:956:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1978);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:969:1: ( ruleEString EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:970:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2005);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2012); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:977:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:981:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:982:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:982:1: ( ( rule__EString__Alternatives ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:983:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:984:1: ( rule__EString__Alternatives )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:984:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString2038);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:996:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:997:1: ( ruleEInt EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:998:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2065);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2072); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1005:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1009:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1010:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1010:1: ( ( rule__EInt__Group__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1011:1: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1012:1: ( rule__EInt__Group__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1012:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt2098);
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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1024:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1025:1: ( ruleEBoolean EOF )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1026:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean2125);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean2132); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1033:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1037:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1038:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1038:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1039:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1040:1: ( rule__EBoolean__Alternatives )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1040:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean2158);
            rule__EBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleBinaryOp"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1055:1: ruleBinaryOp : ( ( rule__BinaryOp__Alternatives ) ) ;
    public final void ruleBinaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1059:1: ( ( ( rule__BinaryOp__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1060:1: ( ( rule__BinaryOp__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1060:1: ( ( rule__BinaryOp__Alternatives ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1061:1: ( rule__BinaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAccess().getAlternatives()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1062:1: ( rule__BinaryOp__Alternatives )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1062:2: rule__BinaryOp__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOp__Alternatives_in_ruleBinaryOp2197);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1073:1: rule__TraceDefinition__Alternatives_2 : ( ( ( rule__TraceDefinition__Group_2_0__0 ) ) | ( ( rule__TraceDefinition__Group_2_1__0 ) ) );
    public final void rule__TraceDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1077:1: ( ( ( rule__TraceDefinition__Group_2_0__0 ) ) | ( ( rule__TraceDefinition__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1078:1: ( ( rule__TraceDefinition__Group_2_0__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1078:1: ( ( rule__TraceDefinition__Group_2_0__0 ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1079:1: ( rule__TraceDefinition__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTraceDefinitionAccess().getGroup_2_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1080:1: ( rule__TraceDefinition__Group_2_0__0 )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1080:2: rule__TraceDefinition__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__0_in_rule__TraceDefinition__Alternatives_22232);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1084:6: ( ( rule__TraceDefinition__Group_2_1__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1084:6: ( ( rule__TraceDefinition__Group_2_1__0 ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1085:1: ( rule__TraceDefinition__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTraceDefinitionAccess().getGroup_2_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1086:1: ( rule__TraceDefinition__Group_2_1__0 )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1086:2: rule__TraceDefinition__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__0_in_rule__TraceDefinition__Alternatives_22250);
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


    // $ANTLR start "rule__PotencyAnnotation__Alternatives_0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1095:1: rule__PotencyAnnotation__Alternatives_0 : ( ( '@' ) | ( '^' ) );
    public final void rule__PotencyAnnotation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1099:1: ( ( '@' ) | ( '^' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1100:1: ( '@' )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1100:1: ( '@' )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1101:1: '@'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPotencyAnnotationAccess().getCommercialAtKeyword_0_0()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__PotencyAnnotation__Alternatives_02284); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPotencyAnnotationAccess().getCommercialAtKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1108:6: ( '^' )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1108:6: ( '^' )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1109:1: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPotencyAnnotationAccess().getCircumflexAccentKeyword_0_1()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__PotencyAnnotation__Alternatives_02304); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPotencyAnnotationAccess().getCircumflexAccentKeyword_0_1()); 
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
    // $ANTLR end "rule__PotencyAnnotation__Alternatives_0"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1121:1: rule__Statement__Alternatives : ( ( ruleDefineVariable ) | ( ruleExpression ) | ( rulePutTraceExpression ) | ( rulePropertyWrite ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1125:1: ( ( ruleDefineVariable ) | ( ruleExpression ) | ( rulePutTraceExpression ) | ( rulePropertyWrite ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==30) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_STRING && LA4_1<=RULE_INT)||(LA4_1>=14 && LA4_1<=19)||LA4_1==21||(LA4_1>=23 && LA4_1<=24)||LA4_1==29||(LA4_1>=31 && LA4_1<=34)||LA4_1==38||LA4_1==42) ) {
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
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==RULE_STRING) ) {
                        alt4=2;
                    }
                    else if ( (LA4_6==RULE_ID) ) {
                        int LA4_7 = input.LA(4);

                        if ( (LA4_7==EOF||(LA4_7>=RULE_STRING && LA4_7<=RULE_INT)||(LA4_7>=14 && LA4_7<=15)||LA4_7==17||LA4_7==21||(LA4_7>=23 && LA4_7<=24)||LA4_7==29||(LA4_7>=31 && LA4_7<=34)||LA4_7==38||LA4_7==42) ) {
                            alt4=2;
                        }
                        else if ( (LA4_7==30) ) {
                            alt4=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case RULE_INT:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 21:
                case 23:
                case 24:
                case 28:
                case 31:
                case 32:
                case 33:
                case 34:
                case 38:
                case 42:
                    {
                    alt4=2;
                    }
                    break;
                case 30:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INT:
            case 14:
            case 15:
            case 17:
            case 23:
            case 31:
            case 34:
            case 38:
                {
                alt4=2;
                }
                break;
            case 42:
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( ruleDefineVariable )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( ruleDefineVariable )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1127:1: ruleDefineVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_rule__Statement__Alternatives2338);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1132:6: ( ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1132:6: ( ruleExpression )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1133:1: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Statement__Alternatives2355);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1138:6: ( rulePutTraceExpression )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1138:6: ( rulePutTraceExpression )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1139:1: rulePutTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPutTraceExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_rule__Statement__Alternatives2372);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1144:6: ( rulePropertyWrite )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1144:6: ( rulePropertyWrite )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1145:1: rulePropertyWrite
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPropertyWriteParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_rule__Statement__Alternatives2389);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1155:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( ruleVariableReference ) | ( ruleModelReference ) | ( ruleParenthesizedExpression ) | ( ruleMatchTraceExpression ) | ( ruleClosureDeclaration ) | ( ruleIfExpr ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1159:1: ( ( ruleLiteral ) | ( ruleVariableReference ) | ( ruleModelReference ) | ( ruleParenthesizedExpression ) | ( ruleMatchTraceExpression ) | ( ruleClosureDeclaration ) | ( ruleIfExpr ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 14:
            case 15:
            case 17:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==28) ) {
                    alt5=3;
                }
                else if ( (LA5_2==EOF||(LA5_2>=RULE_STRING && LA5_2<=RULE_INT)||(LA5_2>=14 && LA5_2<=19)||LA5_2==21||(LA5_2>=23 && LA5_2<=24)||LA5_2==29||(LA5_2>=31 && LA5_2<=35)||(LA5_2>=37 && LA5_2<=38)||(LA5_2>=41 && LA5_2<=42)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 38:
                {
                alt5=5;
                }
                break;
            case 23:
                {
                alt5=6;
                }
                break;
            case 31:
                {
                alt5=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1160:1: ( ruleLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1160:1: ( ruleLiteral )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1161:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__PrimaryExpression__Alternatives2421);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1166:6: ( ruleVariableReference )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1166:6: ( ruleVariableReference )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1167:1: ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2438);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1172:6: ( ruleModelReference )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1172:6: ( ruleModelReference )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1173:1: ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_rule__PrimaryExpression__Alternatives2455);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1178:6: ( ruleParenthesizedExpression )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1178:6: ( ruleParenthesizedExpression )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1179:1: ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_rule__PrimaryExpression__Alternatives2472);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1184:6: ( ruleMatchTraceExpression )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1184:6: ( ruleMatchTraceExpression )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1185:1: ruleMatchTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_rule__PrimaryExpression__Alternatives2489);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1190:6: ( ruleClosureDeclaration )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1190:6: ( ruleClosureDeclaration )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1191:1: ruleClosureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rule__PrimaryExpression__Alternatives2506);
                    ruleClosureDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1196:6: ( ruleIfExpr )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1196:6: ( ruleIfExpr )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1197:1: ruleIfExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getIfExprParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpr_in_rule__PrimaryExpression__Alternatives2523);
                    ruleIfExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getIfExprParserRuleCall_6()); 
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1207:1: rule__Literal__Alternatives : ( ( ruleFloatLiteral ) | ( ruleNumLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1211:1: ( ( ruleFloatLiteral ) | ( ruleNumLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==29) ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==RULE_INT) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_5>=RULE_STRING && LA6_5<=RULE_ID)) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==EOF||(LA6_1>=RULE_STRING && LA6_1<=RULE_INT)||(LA6_1>=14 && LA6_1<=19)||LA6_1==21||(LA6_1>=23 && LA6_1<=24)||(LA6_1>=31 && LA6_1<=35)||(LA6_1>=37 && LA6_1<=38)||(LA6_1>=41 && LA6_1<=42)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 14:
            case 15:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1212:1: ( ruleFloatLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1212:1: ( ruleFloatLiteral )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1213:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2555);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1218:6: ( ruleNumLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1218:6: ( ruleNumLiteral )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1219:1: ruleNumLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_rule__Literal__Alternatives2572);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1224:6: ( ruleStringLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1224:6: ( ruleStringLiteral )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1225:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2589);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1230:6: ( ruleBooleanLiteral )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1230:6: ( ruleBooleanLiteral )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1231:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2606);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1241:1: rule__MethodCall__Alternatives_1 : ( ( ( rule__MethodCall__Group_1_0__0 ) ) | ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) ) );
    public final void rule__MethodCall__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1245:1: ( ( ( rule__MethodCall__Group_1_0__0 ) ) | ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=16 && LA8_0<=19)) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1246:1: ( ( rule__MethodCall__Group_1_0__0 ) )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1246:1: ( ( rule__MethodCall__Group_1_0__0 ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1247:1: ( rule__MethodCall__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1248:1: ( rule__MethodCall__Group_1_0__0 )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1248:2: rule__MethodCall__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__0_in_rule__MethodCall__Alternatives_12638);
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
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1252:6: ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1252:6: ( ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1253:1: ( ( rule__MethodCall__Group_1_1__0 ) ) ( ( rule__MethodCall__Group_1_1__0 )* )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1253:1: ( ( rule__MethodCall__Group_1_1__0 ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1254:1: ( rule__MethodCall__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1255:1: ( rule__MethodCall__Group_1_1__0 )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1255:2: rule__MethodCall__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12658);
                    rule__MethodCall__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }

                    }

                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1258:1: ( ( rule__MethodCall__Group_1_1__0 )* )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1259:1: ( rule__MethodCall__Group_1_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodCallAccess().getGroup_1_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1260:1: ( rule__MethodCall__Group_1_1__0 )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==29) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1260:2: rule__MethodCall__Group_1_1__0
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12670);
                    	    rule__MethodCall__Group_1_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1271:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1275:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1276:1: ( RULE_STRING )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1276:1: ( RULE_STRING )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1277:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2707); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1282:6: ( RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1282:6: ( RULE_ID )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1283:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2724); if (state.failed) return ;
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1293:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1297:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1298:1: ( 'true' )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1298:1: ( 'true' )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1299:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__EBoolean__Alternatives2757); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1306:6: ( 'false' )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1306:6: ( 'false' )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1307:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__EBoolean__Alternatives2777); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__BinaryOp__Alternatives"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1319:1: rule__BinaryOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__BinaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1323:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            case 19:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: ( ( '+' ) )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: ( ( '+' ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1325:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1326:1: ( '+' )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1326:3: '+'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__BinaryOp__Alternatives2812); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1331:6: ( ( '-' ) )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1331:6: ( ( '-' ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1332:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1333:1: ( '-' )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1333:3: '-'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BinaryOp__Alternatives2833); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1338:6: ( ( '*' ) )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1338:6: ( ( '*' ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1339:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1340:1: ( '*' )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1340:3: '*'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BinaryOp__Alternatives2854); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1345:6: ( ( '/' ) )
                    {
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1345:6: ( ( '/' ) )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1346:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAccess().getDIVEnumLiteralDeclaration_3()); 
                    }
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1347:1: ( '/' )
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1347:3: '/'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BinaryOp__Alternatives2875); if (state.failed) return ;

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


    // $ANTLR start "rule__TraceInterface__Group__0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1359:1: rule__TraceInterface__Group__0 : rule__TraceInterface__Group__0__Impl rule__TraceInterface__Group__1 ;
    public final void rule__TraceInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1363:1: ( rule__TraceInterface__Group__0__Impl rule__TraceInterface__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1364:2: rule__TraceInterface__Group__0__Impl rule__TraceInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__0__Impl_in_rule__TraceInterface__Group__02908);
            rule__TraceInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__1_in_rule__TraceInterface__Group__02911);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1371:1: rule__TraceInterface__Group__0__Impl : ( 'trace' ) ;
    public final void rule__TraceInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1375:1: ( ( 'trace' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1376:1: ( 'trace' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1376:1: ( 'trace' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1377:1: 'trace'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getTraceKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TraceInterface__Group__0__Impl2939); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1390:1: rule__TraceInterface__Group__1 : rule__TraceInterface__Group__1__Impl rule__TraceInterface__Group__2 ;
    public final void rule__TraceInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1394:1: ( rule__TraceInterface__Group__1__Impl rule__TraceInterface__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1395:2: rule__TraceInterface__Group__1__Impl rule__TraceInterface__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__1__Impl_in_rule__TraceInterface__Group__12970);
            rule__TraceInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__2_in_rule__TraceInterface__Group__12973);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1402:1: rule__TraceInterface__Group__1__Impl : ( ( rule__TraceInterface__NameAssignment_1 ) ) ;
    public final void rule__TraceInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1406:1: ( ( ( rule__TraceInterface__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1407:1: ( ( rule__TraceInterface__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1407:1: ( ( rule__TraceInterface__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1408:1: ( rule__TraceInterface__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1409:1: ( rule__TraceInterface__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1409:2: rule__TraceInterface__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__NameAssignment_1_in_rule__TraceInterface__Group__1__Impl3000);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1419:1: rule__TraceInterface__Group__2 : rule__TraceInterface__Group__2__Impl rule__TraceInterface__Group__3 ;
    public final void rule__TraceInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1423:1: ( rule__TraceInterface__Group__2__Impl rule__TraceInterface__Group__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1424:2: rule__TraceInterface__Group__2__Impl rule__TraceInterface__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__2__Impl_in_rule__TraceInterface__Group__23030);
            rule__TraceInterface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__3_in_rule__TraceInterface__Group__23033);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1431:1: rule__TraceInterface__Group__2__Impl : ( ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* ) ) ;
    public final void rule__TraceInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1435:1: ( ( ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1436:1: ( ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1436:1: ( ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1437:1: ( ( rule__TraceInterface__DefinitionsAssignment_2 ) ) ( ( rule__TraceInterface__DefinitionsAssignment_2 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1437:1: ( ( rule__TraceInterface__DefinitionsAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1438:1: ( rule__TraceInterface__DefinitionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getDefinitionsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1439:1: ( rule__TraceInterface__DefinitionsAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1439:2: rule__TraceInterface__DefinitionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__DefinitionsAssignment_2_in_rule__TraceInterface__Group__2__Impl3062);
            rule__TraceInterface__DefinitionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceInterfaceAccess().getDefinitionsAssignment_2()); 
            }

            }

            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1442:1: ( ( rule__TraceInterface__DefinitionsAssignment_2 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1443:1: ( rule__TraceInterface__DefinitionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getDefinitionsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1444:1: ( rule__TraceInterface__DefinitionsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1444:2: rule__TraceInterface__DefinitionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__DefinitionsAssignment_2_in_rule__TraceInterface__Group__2__Impl3074);
            	    rule__TraceInterface__DefinitionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1455:1: rule__TraceInterface__Group__3 : rule__TraceInterface__Group__3__Impl ;
    public final void rule__TraceInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1459:1: ( rule__TraceInterface__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1460:2: rule__TraceInterface__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceInterface__Group__3__Impl_in_rule__TraceInterface__Group__33107);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1466:1: rule__TraceInterface__Group__3__Impl : ( 'end' ) ;
    public final void rule__TraceInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1470:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1471:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1471:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1472:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getEndKeyword_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TraceInterface__Group__3__Impl3135); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1493:1: rule__TraceDefinition__Group__0 : rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1 ;
    public final void rule__TraceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1497:1: ( rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1498:2: rule__TraceDefinition__Group__0__Impl rule__TraceDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__0__Impl_in_rule__TraceDefinition__Group__03174);
            rule__TraceDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__1_in_rule__TraceDefinition__Group__03177);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1505:1: rule__TraceDefinition__Group__0__Impl : ( 'link' ) ;
    public final void rule__TraceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1509:1: ( ( 'link' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1510:1: ( 'link' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1510:1: ( 'link' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1511:1: 'link'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TraceDefinition__Group__0__Impl3205); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1524:1: rule__TraceDefinition__Group__1 : rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2 ;
    public final void rule__TraceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1528:1: ( rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1529:2: rule__TraceDefinition__Group__1__Impl rule__TraceDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__1__Impl_in_rule__TraceDefinition__Group__13236);
            rule__TraceDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__2_in_rule__TraceDefinition__Group__13239);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1536:1: rule__TraceDefinition__Group__1__Impl : ( ( rule__TraceDefinition__NameAssignment_1 ) ) ;
    public final void rule__TraceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1540:1: ( ( ( rule__TraceDefinition__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1541:1: ( ( rule__TraceDefinition__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1541:1: ( ( rule__TraceDefinition__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1542:1: ( rule__TraceDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1543:1: ( rule__TraceDefinition__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1543:2: rule__TraceDefinition__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__NameAssignment_1_in_rule__TraceDefinition__Group__1__Impl3266);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1553:1: rule__TraceDefinition__Group__2 : rule__TraceDefinition__Group__2__Impl ;
    public final void rule__TraceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1557:1: ( rule__TraceDefinition__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1558:2: rule__TraceDefinition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group__2__Impl_in_rule__TraceDefinition__Group__23296);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1564:1: rule__TraceDefinition__Group__2__Impl : ( ( rule__TraceDefinition__Alternatives_2 ) ) ;
    public final void rule__TraceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1568:1: ( ( ( rule__TraceDefinition__Alternatives_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1569:1: ( ( rule__TraceDefinition__Alternatives_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1569:1: ( ( rule__TraceDefinition__Alternatives_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1570:1: ( rule__TraceDefinition__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getAlternatives_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1571:1: ( rule__TraceDefinition__Alternatives_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1571:2: rule__TraceDefinition__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Alternatives_2_in_rule__TraceDefinition__Group__2__Impl3323);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1587:1: rule__TraceDefinition__Group_2_0__0 : rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1 ;
    public final void rule__TraceDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1591:1: ( rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1592:2: rule__TraceDefinition__Group_2_0__0__Impl rule__TraceDefinition__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__0__Impl_in_rule__TraceDefinition__Group_2_0__03359);
            rule__TraceDefinition__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__1_in_rule__TraceDefinition__Group_2_0__03362);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1599:1: rule__TraceDefinition__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__TraceDefinition__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1603:1: ( ( '{' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: ( '{' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: ( '{' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1605:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TraceDefinition__Group_2_0__0__Impl3390); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1618:1: rule__TraceDefinition__Group_2_0__1 : rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2 ;
    public final void rule__TraceDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1622:1: ( rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1623:2: rule__TraceDefinition__Group_2_0__1__Impl rule__TraceDefinition__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__1__Impl_in_rule__TraceDefinition__Group_2_0__13421);
            rule__TraceDefinition__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__2_in_rule__TraceDefinition__Group_2_0__13424);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1630:1: rule__TraceDefinition__Group_2_0__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) ) ;
    public final void rule__TraceDefinition__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1634:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1635:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1635:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1636:1: ( rule__TraceDefinition__ElementsAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1637:1: ( rule__TraceDefinition__ElementsAssignment_2_0_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1637:2: rule__TraceDefinition__ElementsAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_1_in_rule__TraceDefinition__Group_2_0__1__Impl3451);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1647:1: rule__TraceDefinition__Group_2_0__2 : rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3 ;
    public final void rule__TraceDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1651:1: ( rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1652:2: rule__TraceDefinition__Group_2_0__2__Impl rule__TraceDefinition__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__2__Impl_in_rule__TraceDefinition__Group_2_0__23481);
            rule__TraceDefinition__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__3_in_rule__TraceDefinition__Group_2_0__23484);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1659:1: rule__TraceDefinition__Group_2_0__2__Impl : ( ( rule__TraceDefinition__Group_2_0_2__0 )* ) ;
    public final void rule__TraceDefinition__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1663:1: ( ( ( rule__TraceDefinition__Group_2_0_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1664:1: ( ( rule__TraceDefinition__Group_2_0_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1664:1: ( ( rule__TraceDefinition__Group_2_0_2__0 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1665:1: ( rule__TraceDefinition__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getGroup_2_0_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1666:1: ( rule__TraceDefinition__Group_2_0_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1666:2: rule__TraceDefinition__Group_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__0_in_rule__TraceDefinition__Group_2_0__2__Impl3511);
            	    rule__TraceDefinition__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1676:1: rule__TraceDefinition__Group_2_0__3 : rule__TraceDefinition__Group_2_0__3__Impl ;
    public final void rule__TraceDefinition__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1680:1: ( rule__TraceDefinition__Group_2_0__3__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1681:2: rule__TraceDefinition__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0__3__Impl_in_rule__TraceDefinition__Group_2_0__33542);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1687:1: rule__TraceDefinition__Group_2_0__3__Impl : ( '}' ) ;
    public final void rule__TraceDefinition__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1691:1: ( ( '}' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1692:1: ( '}' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1692:1: ( '}' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1693:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TraceDefinition__Group_2_0__3__Impl3570); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1714:1: rule__TraceDefinition__Group_2_0_2__0 : rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1 ;
    public final void rule__TraceDefinition__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1718:1: ( rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1719:2: rule__TraceDefinition__Group_2_0_2__0__Impl rule__TraceDefinition__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__0__Impl_in_rule__TraceDefinition__Group_2_0_2__03609);
            rule__TraceDefinition__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__1_in_rule__TraceDefinition__Group_2_0_2__03612);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1726:1: rule__TraceDefinition__Group_2_0_2__0__Impl : ( ';' ) ;
    public final void rule__TraceDefinition__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1730:1: ( ( ';' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: ( ';' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: ( ';' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1732:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__TraceDefinition__Group_2_0_2__0__Impl3640); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1745:1: rule__TraceDefinition__Group_2_0_2__1 : rule__TraceDefinition__Group_2_0_2__1__Impl ;
    public final void rule__TraceDefinition__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1749:1: ( rule__TraceDefinition__Group_2_0_2__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1750:2: rule__TraceDefinition__Group_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_0_2__1__Impl_in_rule__TraceDefinition__Group_2_0_2__13671);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1756:1: rule__TraceDefinition__Group_2_0_2__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) ) ;
    public final void rule__TraceDefinition__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1760:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1761:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1761:1: ( ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1762:1: ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1763:1: ( rule__TraceDefinition__ElementsAssignment_2_0_2_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1763:2: rule__TraceDefinition__ElementsAssignment_2_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_2_1_in_rule__TraceDefinition__Group_2_0_2__1__Impl3698);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1777:1: rule__TraceDefinition__Group_2_1__0 : rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1 ;
    public final void rule__TraceDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1781:1: ( rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1782:2: rule__TraceDefinition__Group_2_1__0__Impl rule__TraceDefinition__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__0__Impl_in_rule__TraceDefinition__Group_2_1__03732);
            rule__TraceDefinition__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__1_in_rule__TraceDefinition__Group_2_1__03735);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1789:1: rule__TraceDefinition__Group_2_1__0__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) ) ;
    public final void rule__TraceDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1793:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1794:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1794:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1795:1: ( rule__TraceDefinition__ElementsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1796:1: ( rule__TraceDefinition__ElementsAssignment_2_1_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1796:2: rule__TraceDefinition__ElementsAssignment_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_0_in_rule__TraceDefinition__Group_2_1__0__Impl3762);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1806:1: rule__TraceDefinition__Group_2_1__1 : rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2 ;
    public final void rule__TraceDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1810:1: ( rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1811:2: rule__TraceDefinition__Group_2_1__1__Impl rule__TraceDefinition__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__1__Impl_in_rule__TraceDefinition__Group_2_1__13792);
            rule__TraceDefinition__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__2_in_rule__TraceDefinition__Group_2_1__13795);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1818:1: rule__TraceDefinition__Group_2_1__1__Impl : ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* ) ;
    public final void rule__TraceDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1822:1: ( ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1823:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1823:1: ( ( rule__TraceDefinition__ElementsAssignment_2_1_1 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1824:1: ( rule__TraceDefinition__ElementsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1825:1: ( rule__TraceDefinition__ElementsAssignment_2_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1825:2: rule__TraceDefinition__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_1_in_rule__TraceDefinition__Group_2_1__1__Impl3822);
            	    rule__TraceDefinition__ElementsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1835:1: rule__TraceDefinition__Group_2_1__2 : rule__TraceDefinition__Group_2_1__2__Impl ;
    public final void rule__TraceDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1839:1: ( rule__TraceDefinition__Group_2_1__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1840:2: rule__TraceDefinition__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceDefinition__Group_2_1__2__Impl_in_rule__TraceDefinition__Group_2_1__23853);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1846:1: rule__TraceDefinition__Group_2_1__2__Impl : ( 'end' ) ;
    public final void rule__TraceDefinition__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1850:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1851:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1851:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1852:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getEndKeyword_2_1_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TraceDefinition__Group_2_1__2__Impl3881); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1871:1: rule__TraceElementInline__Group__0 : rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1 ;
    public final void rule__TraceElementInline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1875:1: ( rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1876:2: rule__TraceElementInline__Group__0__Impl rule__TraceElementInline__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__0__Impl_in_rule__TraceElementInline__Group__03918);
            rule__TraceElementInline__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__1_in_rule__TraceElementInline__Group__03921);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1883:1: rule__TraceElementInline__Group__0__Impl : ( ( rule__TraceElementInline__NameAssignment_0 ) ) ;
    public final void rule__TraceElementInline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1887:1: ( ( ( rule__TraceElementInline__NameAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1888:1: ( ( rule__TraceElementInline__NameAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1888:1: ( ( rule__TraceElementInline__NameAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1889:1: ( rule__TraceElementInline__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getNameAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1890:1: ( rule__TraceElementInline__NameAssignment_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1890:2: rule__TraceElementInline__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__NameAssignment_0_in_rule__TraceElementInline__Group__0__Impl3948);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1900:1: rule__TraceElementInline__Group__1 : rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2 ;
    public final void rule__TraceElementInline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1904:1: ( rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1905:2: rule__TraceElementInline__Group__1__Impl rule__TraceElementInline__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__1__Impl_in_rule__TraceElementInline__Group__13978);
            rule__TraceElementInline__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__2_in_rule__TraceElementInline__Group__13981);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1912:1: rule__TraceElementInline__Group__1__Impl : ( ':' ) ;
    public final void rule__TraceElementInline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1916:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1917:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1917:1: ( ':' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1918:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getColonKeyword_1()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__TraceElementInline__Group__1__Impl4009); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1931:1: rule__TraceElementInline__Group__2 : rule__TraceElementInline__Group__2__Impl ;
    public final void rule__TraceElementInline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1935:1: ( rule__TraceElementInline__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1936:2: rule__TraceElementInline__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__Group__2__Impl_in_rule__TraceElementInline__Group__24040);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1942:1: rule__TraceElementInline__Group__2__Impl : ( ( rule__TraceElementInline__TypeAssignment_2 ) ) ;
    public final void rule__TraceElementInline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1946:1: ( ( ( rule__TraceElementInline__TypeAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1947:1: ( ( rule__TraceElementInline__TypeAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1947:1: ( ( rule__TraceElementInline__TypeAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1948:1: ( rule__TraceElementInline__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getTypeAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1949:1: ( rule__TraceElementInline__TypeAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1949:2: rule__TraceElementInline__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementInline__TypeAssignment_2_in_rule__TraceElementInline__Group__2__Impl4067);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1965:1: rule__TraceElementExpanded__Group__0 : rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1 ;
    public final void rule__TraceElementExpanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1969:1: ( rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1970:2: rule__TraceElementExpanded__Group__0__Impl rule__TraceElementExpanded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__0__Impl_in_rule__TraceElementExpanded__Group__04103);
            rule__TraceElementExpanded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__1_in_rule__TraceElementExpanded__Group__04106);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1977:1: rule__TraceElementExpanded__Group__0__Impl : ( 'var' ) ;
    public final void rule__TraceElementExpanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1981:1: ( ( 'var' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1982:1: ( 'var' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1982:1: ( 'var' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1983:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TraceElementExpanded__Group__0__Impl4134); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:1996:1: rule__TraceElementExpanded__Group__1 : rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2 ;
    public final void rule__TraceElementExpanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2000:1: ( rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2001:2: rule__TraceElementExpanded__Group__1__Impl rule__TraceElementExpanded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__1__Impl_in_rule__TraceElementExpanded__Group__14165);
            rule__TraceElementExpanded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__2_in_rule__TraceElementExpanded__Group__14168);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2008:1: rule__TraceElementExpanded__Group__1__Impl : ( ( rule__TraceElementExpanded__NameAssignment_1 ) ) ;
    public final void rule__TraceElementExpanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2012:1: ( ( ( rule__TraceElementExpanded__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2013:1: ( ( rule__TraceElementExpanded__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2013:1: ( ( rule__TraceElementExpanded__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2014:1: ( rule__TraceElementExpanded__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2015:1: ( rule__TraceElementExpanded__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2015:2: rule__TraceElementExpanded__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__NameAssignment_1_in_rule__TraceElementExpanded__Group__1__Impl4195);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2025:1: rule__TraceElementExpanded__Group__2 : rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3 ;
    public final void rule__TraceElementExpanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2029:1: ( rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2030:2: rule__TraceElementExpanded__Group__2__Impl rule__TraceElementExpanded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__2__Impl_in_rule__TraceElementExpanded__Group__24225);
            rule__TraceElementExpanded__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__3_in_rule__TraceElementExpanded__Group__24228);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2037:1: rule__TraceElementExpanded__Group__2__Impl : ( ':' ) ;
    public final void rule__TraceElementExpanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2041:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2042:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2042:1: ( ':' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2043:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__TraceElementExpanded__Group__2__Impl4256); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2056:1: rule__TraceElementExpanded__Group__3 : rule__TraceElementExpanded__Group__3__Impl ;
    public final void rule__TraceElementExpanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2060:1: ( rule__TraceElementExpanded__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2061:2: rule__TraceElementExpanded__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__Group__3__Impl_in_rule__TraceElementExpanded__Group__34287);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2067:1: rule__TraceElementExpanded__Group__3__Impl : ( ( rule__TraceElementExpanded__TypeAssignment_3 ) ) ;
    public final void rule__TraceElementExpanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2071:1: ( ( ( rule__TraceElementExpanded__TypeAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2072:1: ( ( rule__TraceElementExpanded__TypeAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2072:1: ( ( rule__TraceElementExpanded__TypeAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2073:1: ( rule__TraceElementExpanded__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getTypeAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2074:1: ( rule__TraceElementExpanded__TypeAssignment_3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2074:2: rule__TraceElementExpanded__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceElementExpanded__TypeAssignment_3_in_rule__TraceElementExpanded__Group__3__Impl4314);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2092:1: rule__ClassUse__Group__0 : rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1 ;
    public final void rule__ClassUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2096:1: ( rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2097:2: rule__ClassUse__Group__0__Impl rule__ClassUse__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__0__Impl_in_rule__ClassUse__Group__04352);
            rule__ClassUse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__1_in_rule__ClassUse__Group__04355);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2104:1: rule__ClassUse__Group__0__Impl : ( ( rule__ClassUse__ModelAssignment_0 ) ) ;
    public final void rule__ClassUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2108:1: ( ( ( rule__ClassUse__ModelAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2109:1: ( ( rule__ClassUse__ModelAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2109:1: ( ( rule__ClassUse__ModelAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2110:1: ( rule__ClassUse__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2111:1: ( rule__ClassUse__ModelAssignment_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2111:2: rule__ClassUse__ModelAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__ModelAssignment_0_in_rule__ClassUse__Group__0__Impl4382);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2121:1: rule__ClassUse__Group__1 : rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2 ;
    public final void rule__ClassUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2125:1: ( rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2126:2: rule__ClassUse__Group__1__Impl rule__ClassUse__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__1__Impl_in_rule__ClassUse__Group__14412);
            rule__ClassUse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__2_in_rule__ClassUse__Group__14415);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2133:1: rule__ClassUse__Group__1__Impl : ( '!' ) ;
    public final void rule__ClassUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2137:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2138:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2138:1: ( '!' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2139:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ClassUse__Group__1__Impl4443); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2152:1: rule__ClassUse__Group__2 : rule__ClassUse__Group__2__Impl rule__ClassUse__Group__3 ;
    public final void rule__ClassUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2156:1: ( rule__ClassUse__Group__2__Impl rule__ClassUse__Group__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2157:2: rule__ClassUse__Group__2__Impl rule__ClassUse__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__2__Impl_in_rule__ClassUse__Group__24474);
            rule__ClassUse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__3_in_rule__ClassUse__Group__24477);
            rule__ClassUse__Group__3();

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2164:1: rule__ClassUse__Group__2__Impl : ( ( rule__ClassUse__ClassNameAssignment_2 ) ) ;
    public final void rule__ClassUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2168:1: ( ( ( rule__ClassUse__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2169:1: ( ( rule__ClassUse__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2169:1: ( ( rule__ClassUse__ClassNameAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2170:1: ( rule__ClassUse__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getClassNameAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2171:1: ( rule__ClassUse__ClassNameAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2171:2: rule__ClassUse__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__ClassNameAssignment_2_in_rule__ClassUse__Group__2__Impl4504);
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


    // $ANTLR start "rule__ClassUse__Group__3"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2181:1: rule__ClassUse__Group__3 : rule__ClassUse__Group__3__Impl rule__ClassUse__Group__4 ;
    public final void rule__ClassUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2185:1: ( rule__ClassUse__Group__3__Impl rule__ClassUse__Group__4 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2186:2: rule__ClassUse__Group__3__Impl rule__ClassUse__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__3__Impl_in_rule__ClassUse__Group__34534);
            rule__ClassUse__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__4_in_rule__ClassUse__Group__34537);
            rule__ClassUse__Group__4();

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
    // $ANTLR end "rule__ClassUse__Group__3"


    // $ANTLR start "rule__ClassUse__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2193:1: rule__ClassUse__Group__3__Impl : ( ( rule__ClassUse__AnnotationsAssignment_3 )? ) ;
    public final void rule__ClassUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2197:1: ( ( ( rule__ClassUse__AnnotationsAssignment_3 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2198:1: ( ( rule__ClassUse__AnnotationsAssignment_3 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2198:1: ( ( rule__ClassUse__AnnotationsAssignment_3 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2199:1: ( rule__ClassUse__AnnotationsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getAnnotationsAssignment_3()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2200:1: ( rule__ClassUse__AnnotationsAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=12 && LA15_0<=13)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2200:2: rule__ClassUse__AnnotationsAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClassUse__AnnotationsAssignment_3_in_rule__ClassUse__Group__3__Impl4564);
                    rule__ClassUse__AnnotationsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getAnnotationsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassUse__Group__3__Impl"


    // $ANTLR start "rule__ClassUse__Group__4"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2210:1: rule__ClassUse__Group__4 : rule__ClassUse__Group__4__Impl ;
    public final void rule__ClassUse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2214:1: ( rule__ClassUse__Group__4__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2215:2: rule__ClassUse__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassUse__Group__4__Impl_in_rule__ClassUse__Group__44595);
            rule__ClassUse__Group__4__Impl();

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
    // $ANTLR end "rule__ClassUse__Group__4"


    // $ANTLR start "rule__ClassUse__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2221:1: rule__ClassUse__Group__4__Impl : ( ( rule__ClassUse__StrictTypeAssignment_4 )? ) ;
    public final void rule__ClassUse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2225:1: ( ( ( rule__ClassUse__StrictTypeAssignment_4 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2226:1: ( ( rule__ClassUse__StrictTypeAssignment_4 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2226:1: ( ( rule__ClassUse__StrictTypeAssignment_4 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2227:1: ( rule__ClassUse__StrictTypeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getStrictTypeAssignment_4()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2228:1: ( rule__ClassUse__StrictTypeAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2228:2: rule__ClassUse__StrictTypeAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClassUse__StrictTypeAssignment_4_in_rule__ClassUse__Group__4__Impl4622);
                    rule__ClassUse__StrictTypeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getStrictTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassUse__Group__4__Impl"


    // $ANTLR start "rule__PotencyAnnotation__Group__0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2248:1: rule__PotencyAnnotation__Group__0 : rule__PotencyAnnotation__Group__0__Impl rule__PotencyAnnotation__Group__1 ;
    public final void rule__PotencyAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2252:1: ( rule__PotencyAnnotation__Group__0__Impl rule__PotencyAnnotation__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2253:2: rule__PotencyAnnotation__Group__0__Impl rule__PotencyAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Group__0__Impl_in_rule__PotencyAnnotation__Group__04663);
            rule__PotencyAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Group__1_in_rule__PotencyAnnotation__Group__04666);
            rule__PotencyAnnotation__Group__1();

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
    // $ANTLR end "rule__PotencyAnnotation__Group__0"


    // $ANTLR start "rule__PotencyAnnotation__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2260:1: rule__PotencyAnnotation__Group__0__Impl : ( ( rule__PotencyAnnotation__Alternatives_0 ) ) ;
    public final void rule__PotencyAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2264:1: ( ( ( rule__PotencyAnnotation__Alternatives_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2265:1: ( ( rule__PotencyAnnotation__Alternatives_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2265:1: ( ( rule__PotencyAnnotation__Alternatives_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2266:1: ( rule__PotencyAnnotation__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPotencyAnnotationAccess().getAlternatives_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2267:1: ( rule__PotencyAnnotation__Alternatives_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2267:2: rule__PotencyAnnotation__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Alternatives_0_in_rule__PotencyAnnotation__Group__0__Impl4693);
            rule__PotencyAnnotation__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPotencyAnnotationAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PotencyAnnotation__Group__0__Impl"


    // $ANTLR start "rule__PotencyAnnotation__Group__1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2277:1: rule__PotencyAnnotation__Group__1 : rule__PotencyAnnotation__Group__1__Impl ;
    public final void rule__PotencyAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2281:1: ( rule__PotencyAnnotation__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2282:2: rule__PotencyAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Group__1__Impl_in_rule__PotencyAnnotation__Group__14723);
            rule__PotencyAnnotation__Group__1__Impl();

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
    // $ANTLR end "rule__PotencyAnnotation__Group__1"


    // $ANTLR start "rule__PotencyAnnotation__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2288:1: rule__PotencyAnnotation__Group__1__Impl : ( ( rule__PotencyAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__PotencyAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2292:1: ( ( ( rule__PotencyAnnotation__ValueAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2293:1: ( ( rule__PotencyAnnotation__ValueAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2293:1: ( ( rule__PotencyAnnotation__ValueAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2294:1: ( rule__PotencyAnnotation__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPotencyAnnotationAccess().getValueAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2295:1: ( rule__PotencyAnnotation__ValueAssignment_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2295:2: rule__PotencyAnnotation__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__ValueAssignment_1_in_rule__PotencyAnnotation__Group__1__Impl4750);
            rule__PotencyAnnotation__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPotencyAnnotationAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PotencyAnnotation__Group__1__Impl"


    // $ANTLR start "rule__PropertyWrite__Group__0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2309:1: rule__PropertyWrite__Group__0 : rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1 ;
    public final void rule__PropertyWrite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2313:1: ( rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2314:2: rule__PropertyWrite__Group__0__Impl rule__PropertyWrite__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__0__Impl_in_rule__PropertyWrite__Group__04784);
            rule__PropertyWrite__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__1_in_rule__PropertyWrite__Group__04787);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2321:1: rule__PropertyWrite__Group__0__Impl : ( ( rule__PropertyWrite__ReceptorAssignment_0 ) ) ;
    public final void rule__PropertyWrite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2325:1: ( ( ( rule__PropertyWrite__ReceptorAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2326:1: ( ( rule__PropertyWrite__ReceptorAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2326:1: ( ( rule__PropertyWrite__ReceptorAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2327:1: ( rule__PropertyWrite__ReceptorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2328:1: ( rule__PropertyWrite__ReceptorAssignment_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2328:2: rule__PropertyWrite__ReceptorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__ReceptorAssignment_0_in_rule__PropertyWrite__Group__0__Impl4814);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2338:1: rule__PropertyWrite__Group__1 : rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2 ;
    public final void rule__PropertyWrite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2342:1: ( rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2343:2: rule__PropertyWrite__Group__1__Impl rule__PropertyWrite__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__1__Impl_in_rule__PropertyWrite__Group__14844);
            rule__PropertyWrite__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__2_in_rule__PropertyWrite__Group__14847);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2350:1: rule__PropertyWrite__Group__1__Impl : ( '.' ) ;
    public final void rule__PropertyWrite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2354:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2355:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2355:1: ( '.' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2356:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getFullStopKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PropertyWrite__Group__1__Impl4875); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2369:1: rule__PropertyWrite__Group__2 : rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3 ;
    public final void rule__PropertyWrite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2373:1: ( rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2374:2: rule__PropertyWrite__Group__2__Impl rule__PropertyWrite__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__2__Impl_in_rule__PropertyWrite__Group__24906);
            rule__PropertyWrite__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__3_in_rule__PropertyWrite__Group__24909);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2381:1: rule__PropertyWrite__Group__2__Impl : ( ( rule__PropertyWrite__PropertyAssignment_2 ) ) ;
    public final void rule__PropertyWrite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2385:1: ( ( ( rule__PropertyWrite__PropertyAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2386:1: ( ( rule__PropertyWrite__PropertyAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2386:1: ( ( rule__PropertyWrite__PropertyAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2387:1: ( rule__PropertyWrite__PropertyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getPropertyAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2388:1: ( rule__PropertyWrite__PropertyAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2388:2: rule__PropertyWrite__PropertyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__PropertyAssignment_2_in_rule__PropertyWrite__Group__2__Impl4936);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2398:1: rule__PropertyWrite__Group__3 : rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4 ;
    public final void rule__PropertyWrite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2402:1: ( rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2403:2: rule__PropertyWrite__Group__3__Impl rule__PropertyWrite__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__3__Impl_in_rule__PropertyWrite__Group__34966);
            rule__PropertyWrite__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__4_in_rule__PropertyWrite__Group__34969);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2410:1: rule__PropertyWrite__Group__3__Impl : ( '=' ) ;
    public final void rule__PropertyWrite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2414:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2415:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2415:1: ( '=' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2416:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getEqualsSignKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PropertyWrite__Group__3__Impl4997); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2429:1: rule__PropertyWrite__Group__4 : rule__PropertyWrite__Group__4__Impl ;
    public final void rule__PropertyWrite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2433:1: ( rule__PropertyWrite__Group__4__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2434:2: rule__PropertyWrite__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__Group__4__Impl_in_rule__PropertyWrite__Group__45028);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2440:1: rule__PropertyWrite__Group__4__Impl : ( ( rule__PropertyWrite__ExpressionAssignment_4 ) ) ;
    public final void rule__PropertyWrite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2444:1: ( ( ( rule__PropertyWrite__ExpressionAssignment_4 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2445:1: ( ( rule__PropertyWrite__ExpressionAssignment_4 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2445:1: ( ( rule__PropertyWrite__ExpressionAssignment_4 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2446:1: ( rule__PropertyWrite__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getExpressionAssignment_4()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2447:1: ( rule__PropertyWrite__ExpressionAssignment_4 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2447:2: rule__PropertyWrite__ExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyWrite__ExpressionAssignment_4_in_rule__PropertyWrite__Group__4__Impl5055);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2467:1: rule__DefineVariable__Group__0 : rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1 ;
    public final void rule__DefineVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2471:1: ( rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2472:2: rule__DefineVariable__Group__0__Impl rule__DefineVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__0__Impl_in_rule__DefineVariable__Group__05095);
            rule__DefineVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__1_in_rule__DefineVariable__Group__05098);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2479:1: rule__DefineVariable__Group__0__Impl : ( ( rule__DefineVariable__NameAssignment_0 ) ) ;
    public final void rule__DefineVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2483:1: ( ( ( rule__DefineVariable__NameAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2484:1: ( ( rule__DefineVariable__NameAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2484:1: ( ( rule__DefineVariable__NameAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2485:1: ( rule__DefineVariable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getNameAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2486:1: ( rule__DefineVariable__NameAssignment_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2486:2: rule__DefineVariable__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__NameAssignment_0_in_rule__DefineVariable__Group__0__Impl5125);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2496:1: rule__DefineVariable__Group__1 : rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2 ;
    public final void rule__DefineVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2500:1: ( rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2501:2: rule__DefineVariable__Group__1__Impl rule__DefineVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__1__Impl_in_rule__DefineVariable__Group__15155);
            rule__DefineVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__2_in_rule__DefineVariable__Group__15158);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2508:1: rule__DefineVariable__Group__1__Impl : ( '=' ) ;
    public final void rule__DefineVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2512:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2513:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2513:1: ( '=' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2514:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__DefineVariable__Group__1__Impl5186); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2527:1: rule__DefineVariable__Group__2 : rule__DefineVariable__Group__2__Impl ;
    public final void rule__DefineVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2531:1: ( rule__DefineVariable__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2532:2: rule__DefineVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__Group__2__Impl_in_rule__DefineVariable__Group__25217);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2538:1: rule__DefineVariable__Group__2__Impl : ( ( rule__DefineVariable__ExpressionAssignment_2 ) ) ;
    public final void rule__DefineVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2542:1: ( ( ( rule__DefineVariable__ExpressionAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2543:1: ( ( rule__DefineVariable__ExpressionAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2543:1: ( ( rule__DefineVariable__ExpressionAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2544:1: ( rule__DefineVariable__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getExpressionAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2545:1: ( rule__DefineVariable__ExpressionAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2545:2: rule__DefineVariable__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DefineVariable__ExpressionAssignment_2_in_rule__DefineVariable__Group__2__Impl5244);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2561:1: rule__ModelReference__Group__0 : rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 ;
    public final void rule__ModelReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2565:1: ( rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2566:2: rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__0__Impl_in_rule__ModelReference__Group__05280);
            rule__ModelReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__1_in_rule__ModelReference__Group__05283);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2573:1: rule__ModelReference__Group__0__Impl : ( ( rule__ModelReference__ModelAssignment_0 ) ) ;
    public final void rule__ModelReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2577:1: ( ( ( rule__ModelReference__ModelAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2578:1: ( ( rule__ModelReference__ModelAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2578:1: ( ( rule__ModelReference__ModelAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2579:1: ( rule__ModelReference__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2580:1: ( rule__ModelReference__ModelAssignment_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2580:2: rule__ModelReference__ModelAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__ModelAssignment_0_in_rule__ModelReference__Group__0__Impl5310);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2590:1: rule__ModelReference__Group__1 : rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2 ;
    public final void rule__ModelReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2594:1: ( rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2595:2: rule__ModelReference__Group__1__Impl rule__ModelReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__1__Impl_in_rule__ModelReference__Group__15340);
            rule__ModelReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__2_in_rule__ModelReference__Group__15343);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2602:1: rule__ModelReference__Group__1__Impl : ( '!' ) ;
    public final void rule__ModelReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2606:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2607:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2607:1: ( '!' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2608:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ModelReference__Group__1__Impl5371); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2621:1: rule__ModelReference__Group__2 : rule__ModelReference__Group__2__Impl ;
    public final void rule__ModelReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2625:1: ( rule__ModelReference__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2626:2: rule__ModelReference__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__Group__2__Impl_in_rule__ModelReference__Group__25402);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2632:1: rule__ModelReference__Group__2__Impl : ( ( rule__ModelReference__ClassNameAssignment_2 ) ) ;
    public final void rule__ModelReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2636:1: ( ( ( rule__ModelReference__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2637:1: ( ( rule__ModelReference__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2637:1: ( ( rule__ModelReference__ClassNameAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2638:1: ( rule__ModelReference__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getClassNameAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2639:1: ( rule__ModelReference__ClassNameAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2639:2: rule__ModelReference__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelReference__ClassNameAssignment_2_in_rule__ModelReference__Group__2__Impl5429);
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


    // $ANTLR start "rule__IfExpr__Group__0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2655:1: rule__IfExpr__Group__0 : rule__IfExpr__Group__0__Impl rule__IfExpr__Group__1 ;
    public final void rule__IfExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2659:1: ( rule__IfExpr__Group__0__Impl rule__IfExpr__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2660:2: rule__IfExpr__Group__0__Impl rule__IfExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__0__Impl_in_rule__IfExpr__Group__05465);
            rule__IfExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__1_in_rule__IfExpr__Group__05468);
            rule__IfExpr__Group__1();

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
    // $ANTLR end "rule__IfExpr__Group__0"


    // $ANTLR start "rule__IfExpr__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2667:1: rule__IfExpr__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2671:1: ( ( 'if' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2672:1: ( 'if' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2672:1: ( 'if' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2673:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getIfKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__IfExpr__Group__0__Impl5496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group__0__Impl"


    // $ANTLR start "rule__IfExpr__Group__1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2686:1: rule__IfExpr__Group__1 : rule__IfExpr__Group__1__Impl rule__IfExpr__Group__2 ;
    public final void rule__IfExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2690:1: ( rule__IfExpr__Group__1__Impl rule__IfExpr__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2691:2: rule__IfExpr__Group__1__Impl rule__IfExpr__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__1__Impl_in_rule__IfExpr__Group__15527);
            rule__IfExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__2_in_rule__IfExpr__Group__15530);
            rule__IfExpr__Group__2();

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
    // $ANTLR end "rule__IfExpr__Group__1"


    // $ANTLR start "rule__IfExpr__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2698:1: rule__IfExpr__Group__1__Impl : ( ( rule__IfExpr__ThenAssignment_1 ) ) ;
    public final void rule__IfExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2702:1: ( ( ( rule__IfExpr__ThenAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2703:1: ( ( rule__IfExpr__ThenAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2703:1: ( ( rule__IfExpr__ThenAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2704:1: ( rule__IfExpr__ThenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getThenAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2705:1: ( rule__IfExpr__ThenAssignment_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2705:2: rule__IfExpr__ThenAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__ThenAssignment_1_in_rule__IfExpr__Group__1__Impl5557);
            rule__IfExpr__ThenAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getThenAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group__1__Impl"


    // $ANTLR start "rule__IfExpr__Group__2"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2715:1: rule__IfExpr__Group__2 : rule__IfExpr__Group__2__Impl rule__IfExpr__Group__3 ;
    public final void rule__IfExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2719:1: ( rule__IfExpr__Group__2__Impl rule__IfExpr__Group__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2720:2: rule__IfExpr__Group__2__Impl rule__IfExpr__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__2__Impl_in_rule__IfExpr__Group__25587);
            rule__IfExpr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__3_in_rule__IfExpr__Group__25590);
            rule__IfExpr__Group__3();

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
    // $ANTLR end "rule__IfExpr__Group__2"


    // $ANTLR start "rule__IfExpr__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2727:1: rule__IfExpr__Group__2__Impl : ( ( rule__IfExpr__Group_2__0 )* ) ;
    public final void rule__IfExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2731:1: ( ( ( rule__IfExpr__Group_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2732:1: ( ( rule__IfExpr__Group_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2732:1: ( ( rule__IfExpr__Group_2__0 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2733:1: ( rule__IfExpr__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getGroup_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2734:1: ( rule__IfExpr__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2734:2: rule__IfExpr__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group_2__0_in_rule__IfExpr__Group__2__Impl5617);
            	    rule__IfExpr__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group__2__Impl"


    // $ANTLR start "rule__IfExpr__Group__3"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2744:1: rule__IfExpr__Group__3 : rule__IfExpr__Group__3__Impl rule__IfExpr__Group__4 ;
    public final void rule__IfExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2748:1: ( rule__IfExpr__Group__3__Impl rule__IfExpr__Group__4 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2749:2: rule__IfExpr__Group__3__Impl rule__IfExpr__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__3__Impl_in_rule__IfExpr__Group__35648);
            rule__IfExpr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__4_in_rule__IfExpr__Group__35651);
            rule__IfExpr__Group__4();

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
    // $ANTLR end "rule__IfExpr__Group__3"


    // $ANTLR start "rule__IfExpr__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2756:1: rule__IfExpr__Group__3__Impl : ( ( rule__IfExpr__Group_3__0 )? ) ;
    public final void rule__IfExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2760:1: ( ( ( rule__IfExpr__Group_3__0 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2761:1: ( ( rule__IfExpr__Group_3__0 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2761:1: ( ( rule__IfExpr__Group_3__0 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2762:1: ( rule__IfExpr__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getGroup_3()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2763:1: ( rule__IfExpr__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2763:2: rule__IfExpr__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group_3__0_in_rule__IfExpr__Group__3__Impl5678);
                    rule__IfExpr__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group__3__Impl"


    // $ANTLR start "rule__IfExpr__Group__4"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2773:1: rule__IfExpr__Group__4 : rule__IfExpr__Group__4__Impl ;
    public final void rule__IfExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2777:1: ( rule__IfExpr__Group__4__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2778:2: rule__IfExpr__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group__4__Impl_in_rule__IfExpr__Group__45709);
            rule__IfExpr__Group__4__Impl();

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
    // $ANTLR end "rule__IfExpr__Group__4"


    // $ANTLR start "rule__IfExpr__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2784:1: rule__IfExpr__Group__4__Impl : ( 'end' ) ;
    public final void rule__IfExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2788:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2789:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2789:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2790:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getEndKeyword_4()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__IfExpr__Group__4__Impl5737); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getEndKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group__4__Impl"


    // $ANTLR start "rule__IfExpr__Group_2__0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2813:1: rule__IfExpr__Group_2__0 : rule__IfExpr__Group_2__0__Impl rule__IfExpr__Group_2__1 ;
    public final void rule__IfExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2817:1: ( rule__IfExpr__Group_2__0__Impl rule__IfExpr__Group_2__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2818:2: rule__IfExpr__Group_2__0__Impl rule__IfExpr__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group_2__0__Impl_in_rule__IfExpr__Group_2__05778);
            rule__IfExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group_2__1_in_rule__IfExpr__Group_2__05781);
            rule__IfExpr__Group_2__1();

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
    // $ANTLR end "rule__IfExpr__Group_2__0"


    // $ANTLR start "rule__IfExpr__Group_2__0__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2825:1: rule__IfExpr__Group_2__0__Impl : ( 'elsif' ) ;
    public final void rule__IfExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2829:1: ( ( 'elsif' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2830:1: ( 'elsif' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2830:1: ( 'elsif' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2831:1: 'elsif'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getElsifKeyword_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__IfExpr__Group_2__0__Impl5809); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getElsifKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group_2__0__Impl"


    // $ANTLR start "rule__IfExpr__Group_2__1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2844:1: rule__IfExpr__Group_2__1 : rule__IfExpr__Group_2__1__Impl ;
    public final void rule__IfExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2848:1: ( rule__IfExpr__Group_2__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2849:2: rule__IfExpr__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group_2__1__Impl_in_rule__IfExpr__Group_2__15840);
            rule__IfExpr__Group_2__1__Impl();

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
    // $ANTLR end "rule__IfExpr__Group_2__1"


    // $ANTLR start "rule__IfExpr__Group_2__1__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2855:1: rule__IfExpr__Group_2__1__Impl : ( ( rule__IfExpr__ElsifsAssignment_2_1 ) ) ;
    public final void rule__IfExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2859:1: ( ( ( rule__IfExpr__ElsifsAssignment_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2860:1: ( ( rule__IfExpr__ElsifsAssignment_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2860:1: ( ( rule__IfExpr__ElsifsAssignment_2_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2861:1: ( rule__IfExpr__ElsifsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getElsifsAssignment_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2862:1: ( rule__IfExpr__ElsifsAssignment_2_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2862:2: rule__IfExpr__ElsifsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__ElsifsAssignment_2_1_in_rule__IfExpr__Group_2__1__Impl5867);
            rule__IfExpr__ElsifsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getElsifsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group_2__1__Impl"


    // $ANTLR start "rule__IfExpr__Group_3__0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2876:1: rule__IfExpr__Group_3__0 : rule__IfExpr__Group_3__0__Impl rule__IfExpr__Group_3__1 ;
    public final void rule__IfExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2880:1: ( rule__IfExpr__Group_3__0__Impl rule__IfExpr__Group_3__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2881:2: rule__IfExpr__Group_3__0__Impl rule__IfExpr__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group_3__0__Impl_in_rule__IfExpr__Group_3__05901);
            rule__IfExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group_3__1_in_rule__IfExpr__Group_3__05904);
            rule__IfExpr__Group_3__1();

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
    // $ANTLR end "rule__IfExpr__Group_3__0"


    // $ANTLR start "rule__IfExpr__Group_3__0__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2888:1: rule__IfExpr__Group_3__0__Impl : ( 'else' ) ;
    public final void rule__IfExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2892:1: ( ( 'else' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2893:1: ( 'else' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2893:1: ( 'else' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2894:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getElseKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__IfExpr__Group_3__0__Impl5932); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getElseKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group_3__0__Impl"


    // $ANTLR start "rule__IfExpr__Group_3__1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2907:1: rule__IfExpr__Group_3__1 : rule__IfExpr__Group_3__1__Impl ;
    public final void rule__IfExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2911:1: ( rule__IfExpr__Group_3__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2912:2: rule__IfExpr__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__Group_3__1__Impl_in_rule__IfExpr__Group_3__15963);
            rule__IfExpr__Group_3__1__Impl();

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
    // $ANTLR end "rule__IfExpr__Group_3__1"


    // $ANTLR start "rule__IfExpr__Group_3__1__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2918:1: rule__IfExpr__Group_3__1__Impl : ( ( rule__IfExpr__ElseAssignment_3_1 ) ) ;
    public final void rule__IfExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2922:1: ( ( ( rule__IfExpr__ElseAssignment_3_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2923:1: ( ( rule__IfExpr__ElseAssignment_3_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2923:1: ( ( rule__IfExpr__ElseAssignment_3_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2924:1: ( rule__IfExpr__ElseAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getElseAssignment_3_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2925:1: ( rule__IfExpr__ElseAssignment_3_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2925:2: rule__IfExpr__ElseAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfExpr__ElseAssignment_3_1_in_rule__IfExpr__Group_3__1__Impl5990);
            rule__IfExpr__ElseAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getElseAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__Group_3__1__Impl"


    // $ANTLR start "rule__ConditionBranch__Group__0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2939:1: rule__ConditionBranch__Group__0 : rule__ConditionBranch__Group__0__Impl rule__ConditionBranch__Group__1 ;
    public final void rule__ConditionBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2943:1: ( rule__ConditionBranch__Group__0__Impl rule__ConditionBranch__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2944:2: rule__ConditionBranch__Group__0__Impl rule__ConditionBranch__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConditionBranch__Group__0__Impl_in_rule__ConditionBranch__Group__06024);
            rule__ConditionBranch__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ConditionBranch__Group__1_in_rule__ConditionBranch__Group__06027);
            rule__ConditionBranch__Group__1();

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
    // $ANTLR end "rule__ConditionBranch__Group__0"


    // $ANTLR start "rule__ConditionBranch__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2951:1: rule__ConditionBranch__Group__0__Impl : ( ( rule__ConditionBranch__ConditionAssignment_0 ) ) ;
    public final void rule__ConditionBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2955:1: ( ( ( rule__ConditionBranch__ConditionAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2956:1: ( ( rule__ConditionBranch__ConditionAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2956:1: ( ( rule__ConditionBranch__ConditionAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2957:1: ( rule__ConditionBranch__ConditionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBranchAccess().getConditionAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2958:1: ( rule__ConditionBranch__ConditionAssignment_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2958:2: rule__ConditionBranch__ConditionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConditionBranch__ConditionAssignment_0_in_rule__ConditionBranch__Group__0__Impl6054);
            rule__ConditionBranch__ConditionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBranchAccess().getConditionAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBranch__Group__0__Impl"


    // $ANTLR start "rule__ConditionBranch__Group__1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2968:1: rule__ConditionBranch__Group__1 : rule__ConditionBranch__Group__1__Impl ;
    public final void rule__ConditionBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2972:1: ( rule__ConditionBranch__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2973:2: rule__ConditionBranch__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConditionBranch__Group__1__Impl_in_rule__ConditionBranch__Group__16084);
            rule__ConditionBranch__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionBranch__Group__1"


    // $ANTLR start "rule__ConditionBranch__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2979:1: rule__ConditionBranch__Group__1__Impl : ( ( ( rule__ConditionBranch__StatementsAssignment_1 ) ) ( ( rule__ConditionBranch__StatementsAssignment_1 )* ) ) ;
    public final void rule__ConditionBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2983:1: ( ( ( ( rule__ConditionBranch__StatementsAssignment_1 ) ) ( ( rule__ConditionBranch__StatementsAssignment_1 )* ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2984:1: ( ( ( rule__ConditionBranch__StatementsAssignment_1 ) ) ( ( rule__ConditionBranch__StatementsAssignment_1 )* ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2984:1: ( ( ( rule__ConditionBranch__StatementsAssignment_1 ) ) ( ( rule__ConditionBranch__StatementsAssignment_1 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2985:1: ( ( rule__ConditionBranch__StatementsAssignment_1 ) ) ( ( rule__ConditionBranch__StatementsAssignment_1 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2985:1: ( ( rule__ConditionBranch__StatementsAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2986:1: ( rule__ConditionBranch__StatementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBranchAccess().getStatementsAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2987:1: ( rule__ConditionBranch__StatementsAssignment_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2987:2: rule__ConditionBranch__StatementsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConditionBranch__StatementsAssignment_1_in_rule__ConditionBranch__Group__1__Impl6113);
            rule__ConditionBranch__StatementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBranchAccess().getStatementsAssignment_1()); 
            }

            }

            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2990:1: ( ( rule__ConditionBranch__StatementsAssignment_1 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2991:1: ( rule__ConditionBranch__StatementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBranchAccess().getStatementsAssignment_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2992:1: ( rule__ConditionBranch__StatementsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_INT)||(LA19_0>=14 && LA19_0<=15)||LA19_0==17||LA19_0==23||LA19_0==31||LA19_0==34||LA19_0==38||LA19_0==42) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:2992:2: rule__ConditionBranch__StatementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ConditionBranch__StatementsAssignment_1_in_rule__ConditionBranch__Group__1__Impl6125);
            	    rule__ConditionBranch__StatementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBranchAccess().getStatementsAssignment_1()); 
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
    // $ANTLR end "rule__ConditionBranch__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3007:1: rule__ParenthesizedExpression__Group__0 : rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 ;
    public final void rule__ParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3011:1: ( rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3012:2: rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__0__Impl_in_rule__ParenthesizedExpression__Group__06162);
            rule__ParenthesizedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__1_in_rule__ParenthesizedExpression__Group__06165);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3019:1: rule__ParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3023:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3024:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3024:1: ( '(' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3025:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ParenthesizedExpression__Group__0__Impl6193); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3038:1: rule__ParenthesizedExpression__Group__1 : rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 ;
    public final void rule__ParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3042:1: ( rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3043:2: rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__1__Impl_in_rule__ParenthesizedExpression__Group__16224);
            rule__ParenthesizedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__2_in_rule__ParenthesizedExpression__Group__16227);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3050:1: rule__ParenthesizedExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3054:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3055:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3055:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3056:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ParenthesizedExpression__Group__1__Impl6254);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3067:1: rule__ParenthesizedExpression__Group__2 : rule__ParenthesizedExpression__Group__2__Impl ;
    public final void rule__ParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3071:1: ( rule__ParenthesizedExpression__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3072:2: rule__ParenthesizedExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParenthesizedExpression__Group__2__Impl_in_rule__ParenthesizedExpression__Group__26283);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3078:1: rule__ParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3082:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3083:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3083:1: ( ')' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3084:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ParenthesizedExpression__Group__2__Impl6311); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3103:1: rule__ClosureDeclaration__Group__0 : rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1 ;
    public final void rule__ClosureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3107:1: ( rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3108:2: rule__ClosureDeclaration__Group__0__Impl rule__ClosureDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__0__Impl_in_rule__ClosureDeclaration__Group__06348);
            rule__ClosureDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__1_in_rule__ClosureDeclaration__Group__06351);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3115:1: rule__ClosureDeclaration__Group__0__Impl : ( '{' ) ;
    public final void rule__ClosureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3119:1: ( ( '{' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3120:1: ( '{' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3120:1: ( '{' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3121:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ClosureDeclaration__Group__0__Impl6379); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3134:1: rule__ClosureDeclaration__Group__1 : rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2 ;
    public final void rule__ClosureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3138:1: ( rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3139:2: rule__ClosureDeclaration__Group__1__Impl rule__ClosureDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__1__Impl_in_rule__ClosureDeclaration__Group__16410);
            rule__ClosureDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__2_in_rule__ClosureDeclaration__Group__16413);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3146:1: rule__ClosureDeclaration__Group__1__Impl : ( ( rule__ClosureDeclaration__Group_1__0 )? ) ;
    public final void rule__ClosureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3150:1: ( ( ( rule__ClosureDeclaration__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3151:1: ( ( rule__ClosureDeclaration__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3151:1: ( ( rule__ClosureDeclaration__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3152:1: ( rule__ClosureDeclaration__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3153:1: ( rule__ClosureDeclaration__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3153:2: rule__ClosureDeclaration__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__0_in_rule__ClosureDeclaration__Group__1__Impl6440);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3163:1: rule__ClosureDeclaration__Group__2 : rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3 ;
    public final void rule__ClosureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3167:1: ( rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3168:2: rule__ClosureDeclaration__Group__2__Impl rule__ClosureDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__2__Impl_in_rule__ClosureDeclaration__Group__26471);
            rule__ClosureDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__3_in_rule__ClosureDeclaration__Group__26474);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3175:1: rule__ClosureDeclaration__Group__2__Impl : ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) ) ;
    public final void rule__ClosureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3179:1: ( ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3180:1: ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3180:1: ( ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3181:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) ) ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3181:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3182:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3183:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3183:2: rule__ClosureDeclaration__StatementsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl6503);
            rule__ClosureDeclaration__StatementsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }

            }

            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3186:1: ( ( rule__ClosureDeclaration__StatementsAssignment_2 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3187:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3188:1: ( rule__ClosureDeclaration__StatementsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=14 && LA21_0<=15)||LA21_0==17||LA21_0==23||LA21_0==31||LA21_0==34||LA21_0==38||LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3188:2: rule__ClosureDeclaration__StatementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl6515);
            	    rule__ClosureDeclaration__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3199:1: rule__ClosureDeclaration__Group__3 : rule__ClosureDeclaration__Group__3__Impl ;
    public final void rule__ClosureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3203:1: ( rule__ClosureDeclaration__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3204:2: rule__ClosureDeclaration__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group__3__Impl_in_rule__ClosureDeclaration__Group__36548);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3210:1: rule__ClosureDeclaration__Group__3__Impl : ( '}' ) ;
    public final void rule__ClosureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3214:1: ( ( '}' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3215:1: ( '}' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3215:1: ( '}' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3216:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ClosureDeclaration__Group__3__Impl6576); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3237:1: rule__ClosureDeclaration__Group_1__0 : rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1 ;
    public final void rule__ClosureDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3241:1: ( rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3242:2: rule__ClosureDeclaration__Group_1__0__Impl rule__ClosureDeclaration__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__0__Impl_in_rule__ClosureDeclaration__Group_1__06615);
            rule__ClosureDeclaration__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__1_in_rule__ClosureDeclaration__Group_1__06618);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3249:1: rule__ClosureDeclaration__Group_1__0__Impl : ( '|' ) ;
    public final void rule__ClosureDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3253:1: ( ( '|' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3254:1: ( '|' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3254:1: ( '|' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3255:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ClosureDeclaration__Group_1__0__Impl6646); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3268:1: rule__ClosureDeclaration__Group_1__1 : rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2 ;
    public final void rule__ClosureDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3272:1: ( rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3273:2: rule__ClosureDeclaration__Group_1__1__Impl rule__ClosureDeclaration__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__1__Impl_in_rule__ClosureDeclaration__Group_1__16677);
            rule__ClosureDeclaration__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__2_in_rule__ClosureDeclaration__Group_1__16680);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3280:1: rule__ClosureDeclaration__Group_1__1__Impl : ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) ) ;
    public final void rule__ClosureDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3284:1: ( ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3285:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3285:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3286:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3287:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3287:2: rule__ClosureDeclaration__FormalParametersAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_1_in_rule__ClosureDeclaration__Group_1__1__Impl6707);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3297:1: rule__ClosureDeclaration__Group_1__2 : rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3 ;
    public final void rule__ClosureDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3301:1: ( rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3302:2: rule__ClosureDeclaration__Group_1__2__Impl rule__ClosureDeclaration__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__2__Impl_in_rule__ClosureDeclaration__Group_1__26737);
            rule__ClosureDeclaration__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__3_in_rule__ClosureDeclaration__Group_1__26740);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3309:1: rule__ClosureDeclaration__Group_1__2__Impl : ( ( rule__ClosureDeclaration__Group_1_2__0 )* ) ;
    public final void rule__ClosureDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3313:1: ( ( ( rule__ClosureDeclaration__Group_1_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3314:1: ( ( rule__ClosureDeclaration__Group_1_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3314:1: ( ( rule__ClosureDeclaration__Group_1_2__0 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3315:1: ( rule__ClosureDeclaration__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getGroup_1_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3316:1: ( rule__ClosureDeclaration__Group_1_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3316:2: rule__ClosureDeclaration__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__0_in_rule__ClosureDeclaration__Group_1__2__Impl6767);
            	    rule__ClosureDeclaration__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3326:1: rule__ClosureDeclaration__Group_1__3 : rule__ClosureDeclaration__Group_1__3__Impl ;
    public final void rule__ClosureDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3330:1: ( rule__ClosureDeclaration__Group_1__3__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3331:2: rule__ClosureDeclaration__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1__3__Impl_in_rule__ClosureDeclaration__Group_1__36798);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3337:1: rule__ClosureDeclaration__Group_1__3__Impl : ( '|' ) ;
    public final void rule__ClosureDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3341:1: ( ( '|' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3342:1: ( '|' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3342:1: ( '|' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3343:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ClosureDeclaration__Group_1__3__Impl6826); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3364:1: rule__ClosureDeclaration__Group_1_2__0 : rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1 ;
    public final void rule__ClosureDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3368:1: ( rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3369:2: rule__ClosureDeclaration__Group_1_2__0__Impl rule__ClosureDeclaration__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__0__Impl_in_rule__ClosureDeclaration__Group_1_2__06865);
            rule__ClosureDeclaration__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__1_in_rule__ClosureDeclaration__Group_1_2__06868);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3376:1: rule__ClosureDeclaration__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ClosureDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3380:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3381:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3381:1: ( ',' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3382:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ClosureDeclaration__Group_1_2__0__Impl6896); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3395:1: rule__ClosureDeclaration__Group_1_2__1 : rule__ClosureDeclaration__Group_1_2__1__Impl ;
    public final void rule__ClosureDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3399:1: ( rule__ClosureDeclaration__Group_1_2__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3400:2: rule__ClosureDeclaration__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__Group_1_2__1__Impl_in_rule__ClosureDeclaration__Group_1_2__16927);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3406:1: rule__ClosureDeclaration__Group_1_2__1__Impl : ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) ) ;
    public final void rule__ClosureDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3410:1: ( ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3411:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3411:1: ( ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3412:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3413:1: ( rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3413:2: rule__ClosureDeclaration__FormalParametersAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_2_1_in_rule__ClosureDeclaration__Group_1_2__1__Impl6954);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3427:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3431:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3432:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__06988);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__06991);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3439:1: rule__MethodCall__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3443:1: ( ( rulePrimaryExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3444:1: ( rulePrimaryExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3444:1: ( rulePrimaryExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3445:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_rule__MethodCall__Group__0__Impl7018);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3456:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3460:1: ( rule__MethodCall__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3461:2: rule__MethodCall__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__17047);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3467:1: rule__MethodCall__Group__1__Impl : ( ( rule__MethodCall__Alternatives_1 )? ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3471:1: ( ( ( rule__MethodCall__Alternatives_1 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3472:1: ( ( rule__MethodCall__Alternatives_1 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3472:1: ( ( rule__MethodCall__Alternatives_1 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3473:1: ( rule__MethodCall__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getAlternatives_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3474:1: ( rule__MethodCall__Alternatives_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16||(LA23_0>=18 && LA23_0<=19)||LA23_0==29) ) {
                alt23=1;
            }
            else if ( (LA23_0==17) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==RULE_INT) ) {
                    int LA23_4 = input.LA(3);

                    if ( (synpred34_InternalExpressions()) ) {
                        alt23=1;
                    }
                }
                else if ( ((LA23_2>=RULE_STRING && LA23_2<=RULE_ID)||(LA23_2>=14 && LA23_2<=15)||LA23_2==17||LA23_2==23||LA23_2==31||LA23_2==34||LA23_2==38) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3474:2: rule__MethodCall__Alternatives_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Alternatives_1_in_rule__MethodCall__Group__1__Impl7074);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3488:1: rule__MethodCall__Group_1_0__0 : rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1 ;
    public final void rule__MethodCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3492:1: ( rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3493:2: rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__0__Impl_in_rule__MethodCall__Group_1_0__07109);
            rule__MethodCall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__1_in_rule__MethodCall__Group_1_0__07112);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3500:1: rule__MethodCall__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MethodCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3504:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3505:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3505:1: ( () )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3506:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3507:1: ()
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3509:1: 
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3519:1: rule__MethodCall__Group_1_0__1 : rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2 ;
    public final void rule__MethodCall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3523:1: ( rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3524:2: rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__1__Impl_in_rule__MethodCall__Group_1_0__17170);
            rule__MethodCall__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__2_in_rule__MethodCall__Group_1_0__17173);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3531:1: rule__MethodCall__Group_1_0__1__Impl : ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) ) ;
    public final void rule__MethodCall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3535:1: ( ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3536:1: ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3536:1: ( ( rule__MethodCall__BinaryOpAssignment_1_0_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3537:1: ( rule__MethodCall__BinaryOpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryOpAssignment_1_0_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3538:1: ( rule__MethodCall__BinaryOpAssignment_1_0_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3538:2: rule__MethodCall__BinaryOpAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__BinaryOpAssignment_1_0_1_in_rule__MethodCall__Group_1_0__1__Impl7200);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3548:1: rule__MethodCall__Group_1_0__2 : rule__MethodCall__Group_1_0__2__Impl ;
    public final void rule__MethodCall__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3552:1: ( rule__MethodCall__Group_1_0__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3553:2: rule__MethodCall__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_0__2__Impl_in_rule__MethodCall__Group_1_0__27230);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3559:1: rule__MethodCall__Group_1_0__2__Impl : ( ( rule__MethodCall__RightAssignment_1_0_2 ) ) ;
    public final void rule__MethodCall__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3563:1: ( ( ( rule__MethodCall__RightAssignment_1_0_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3564:1: ( ( rule__MethodCall__RightAssignment_1_0_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3564:1: ( ( rule__MethodCall__RightAssignment_1_0_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3565:1: ( rule__MethodCall__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3566:1: ( rule__MethodCall__RightAssignment_1_0_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3566:2: rule__MethodCall__RightAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__RightAssignment_1_0_2_in_rule__MethodCall__Group_1_0__2__Impl7257);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3582:1: rule__MethodCall__Group_1_1__0 : rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1 ;
    public final void rule__MethodCall__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3586:1: ( rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3587:2: rule__MethodCall__Group_1_1__0__Impl rule__MethodCall__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__0__Impl_in_rule__MethodCall__Group_1_1__07293);
            rule__MethodCall__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__1_in_rule__MethodCall__Group_1_1__07296);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3594:1: rule__MethodCall__Group_1_1__0__Impl : ( ( rule__MethodCall__Group_1_1_0__0 ) ) ;
    public final void rule__MethodCall__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3598:1: ( ( ( rule__MethodCall__Group_1_1_0__0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3599:1: ( ( rule__MethodCall__Group_1_1_0__0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3599:1: ( ( rule__MethodCall__Group_1_1_0__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3600:1: ( rule__MethodCall__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3601:1: ( rule__MethodCall__Group_1_1_0__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3601:2: rule__MethodCall__Group_1_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_0__0_in_rule__MethodCall__Group_1_1__0__Impl7323);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3611:1: rule__MethodCall__Group_1_1__1 : rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2 ;
    public final void rule__MethodCall__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3615:1: ( rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3616:2: rule__MethodCall__Group_1_1__1__Impl rule__MethodCall__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__1__Impl_in_rule__MethodCall__Group_1_1__17353);
            rule__MethodCall__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__2_in_rule__MethodCall__Group_1_1__17356);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3623:1: rule__MethodCall__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3627:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3628:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3628:1: ( '.' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3629:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MethodCall__Group_1_1__1__Impl7384); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3642:1: rule__MethodCall__Group_1_1__2 : rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3 ;
    public final void rule__MethodCall__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3646:1: ( rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3647:2: rule__MethodCall__Group_1_1__2__Impl rule__MethodCall__Group_1_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__2__Impl_in_rule__MethodCall__Group_1_1__27415);
            rule__MethodCall__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__3_in_rule__MethodCall__Group_1_1__27418);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3654:1: rule__MethodCall__Group_1_1__2__Impl : ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) ) ;
    public final void rule__MethodCall__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3658:1: ( ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3659:1: ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3659:1: ( ( rule__MethodCall__MethodNameAssignment_1_1_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3660:1: ( rule__MethodCall__MethodNameAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodNameAssignment_1_1_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3661:1: ( rule__MethodCall__MethodNameAssignment_1_1_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3661:2: rule__MethodCall__MethodNameAssignment_1_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__MethodNameAssignment_1_1_2_in_rule__MethodCall__Group_1_1__2__Impl7445);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3671:1: rule__MethodCall__Group_1_1__3 : rule__MethodCall__Group_1_1__3__Impl rule__MethodCall__Group_1_1__4 ;
    public final void rule__MethodCall__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3675:1: ( rule__MethodCall__Group_1_1__3__Impl rule__MethodCall__Group_1_1__4 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3676:2: rule__MethodCall__Group_1_1__3__Impl rule__MethodCall__Group_1_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__3__Impl_in_rule__MethodCall__Group_1_1__37475);
            rule__MethodCall__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__4_in_rule__MethodCall__Group_1_1__37478);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3683:1: rule__MethodCall__Group_1_1__3__Impl : ( ( rule__MethodCall__Group_1_1_3__0 )? ) ;
    public final void rule__MethodCall__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3687:1: ( ( ( rule__MethodCall__Group_1_1_3__0 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3688:1: ( ( rule__MethodCall__Group_1_1_3__0 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3688:1: ( ( rule__MethodCall__Group_1_1_3__0 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3689:1: ( rule__MethodCall__Group_1_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_3()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3690:1: ( rule__MethodCall__Group_1_1_3__0 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3690:2: rule__MethodCall__Group_1_1_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0_in_rule__MethodCall__Group_1_1__3__Impl7505);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3700:1: rule__MethodCall__Group_1_1__4 : rule__MethodCall__Group_1_1__4__Impl ;
    public final void rule__MethodCall__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3704:1: ( rule__MethodCall__Group_1_1__4__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3705:2: rule__MethodCall__Group_1_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1__4__Impl_in_rule__MethodCall__Group_1_1__47536);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3711:1: rule__MethodCall__Group_1_1__4__Impl : ( ( rule__MethodCall__ParametersAssignment_1_1_4 )? ) ;
    public final void rule__MethodCall__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3715:1: ( ( ( rule__MethodCall__ParametersAssignment_1_1_4 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3716:1: ( ( rule__MethodCall__ParametersAssignment_1_1_4 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3716:1: ( ( rule__MethodCall__ParametersAssignment_1_1_4 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3717:1: ( rule__MethodCall__ParametersAssignment_1_1_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_4()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3718:1: ( rule__MethodCall__ParametersAssignment_1_1_4 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3718:2: rule__MethodCall__ParametersAssignment_1_1_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_4_in_rule__MethodCall__Group_1_1__4__Impl7563);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3738:1: rule__MethodCall__Group_1_1_0__0 : rule__MethodCall__Group_1_1_0__0__Impl ;
    public final void rule__MethodCall__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3742:1: ( rule__MethodCall__Group_1_1_0__0__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3743:2: rule__MethodCall__Group_1_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_0__0__Impl_in_rule__MethodCall__Group_1_1_0__07604);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3749:1: rule__MethodCall__Group_1_1_0__0__Impl : ( () ) ;
    public final void rule__MethodCall__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3753:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3754:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3754:1: ( () )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3755:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodCallReceptorAction_1_1_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3756:1: ()
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3758:1: 
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3770:1: rule__MethodCall__Group_1_1_3__0 : rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1 ;
    public final void rule__MethodCall__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3774:1: ( rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3775:2: rule__MethodCall__Group_1_1_3__0__Impl rule__MethodCall__Group_1_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0__Impl_in_rule__MethodCall__Group_1_1_3__07664);
            rule__MethodCall__Group_1_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__1_in_rule__MethodCall__Group_1_1_3__07667);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3782:1: rule__MethodCall__Group_1_1_3__0__Impl : ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) ) ;
    public final void rule__MethodCall__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3786:1: ( ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3787:1: ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3787:1: ( ( rule__MethodCall__WithParametersAssignment_1_1_3_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3788:1: ( rule__MethodCall__WithParametersAssignment_1_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersAssignment_1_1_3_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3789:1: ( rule__MethodCall__WithParametersAssignment_1_1_3_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3789:2: rule__MethodCall__WithParametersAssignment_1_1_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__WithParametersAssignment_1_1_3_0_in_rule__MethodCall__Group_1_1_3__0__Impl7694);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3799:1: rule__MethodCall__Group_1_1_3__1 : rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2 ;
    public final void rule__MethodCall__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3803:1: ( rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3804:2: rule__MethodCall__Group_1_1_3__1__Impl rule__MethodCall__Group_1_1_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__1__Impl_in_rule__MethodCall__Group_1_1_3__17724);
            rule__MethodCall__Group_1_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__2_in_rule__MethodCall__Group_1_1_3__17727);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3811:1: rule__MethodCall__Group_1_1_3__1__Impl : ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) ) ;
    public final void rule__MethodCall__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3815:1: ( ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3816:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3816:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3817:1: ( rule__MethodCall__ParametersAssignment_1_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3818:1: ( rule__MethodCall__ParametersAssignment_1_1_3_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3818:2: rule__MethodCall__ParametersAssignment_1_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_1_in_rule__MethodCall__Group_1_1_3__1__Impl7754);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3828:1: rule__MethodCall__Group_1_1_3__2 : rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3 ;
    public final void rule__MethodCall__Group_1_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3832:1: ( rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3833:2: rule__MethodCall__Group_1_1_3__2__Impl rule__MethodCall__Group_1_1_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__2__Impl_in_rule__MethodCall__Group_1_1_3__27784);
            rule__MethodCall__Group_1_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__3_in_rule__MethodCall__Group_1_1_3__27787);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3840:1: rule__MethodCall__Group_1_1_3__2__Impl : ( ( rule__MethodCall__Group_1_1_3_2__0 )* ) ;
    public final void rule__MethodCall__Group_1_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3844:1: ( ( ( rule__MethodCall__Group_1_1_3_2__0 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3845:1: ( ( rule__MethodCall__Group_1_1_3_2__0 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3845:1: ( ( rule__MethodCall__Group_1_1_3_2__0 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3846:1: ( rule__MethodCall__Group_1_1_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_1_1_3_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3847:1: ( rule__MethodCall__Group_1_1_3_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3847:2: rule__MethodCall__Group_1_1_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__0_in_rule__MethodCall__Group_1_1_3__2__Impl7814);
            	    rule__MethodCall__Group_1_1_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3857:1: rule__MethodCall__Group_1_1_3__3 : rule__MethodCall__Group_1_1_3__3__Impl ;
    public final void rule__MethodCall__Group_1_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3861:1: ( rule__MethodCall__Group_1_1_3__3__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3862:2: rule__MethodCall__Group_1_1_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__3__Impl_in_rule__MethodCall__Group_1_1_3__37845);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3868:1: rule__MethodCall__Group_1_1_3__3__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group_1_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3872:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3873:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3873:1: ( ')' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3874:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_1_3_3()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MethodCall__Group_1_1_3__3__Impl7873); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3895:1: rule__MethodCall__Group_1_1_3_2__0 : rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1 ;
    public final void rule__MethodCall__Group_1_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3899:1: ( rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3900:2: rule__MethodCall__Group_1_1_3_2__0__Impl rule__MethodCall__Group_1_1_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__0__Impl_in_rule__MethodCall__Group_1_1_3_2__07912);
            rule__MethodCall__Group_1_1_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__1_in_rule__MethodCall__Group_1_1_3_2__07915);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3907:1: rule__MethodCall__Group_1_1_3_2__0__Impl : ( ',' ) ;
    public final void rule__MethodCall__Group_1_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3911:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3912:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3912:1: ( ',' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3913:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getCommaKeyword_1_1_3_2_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MethodCall__Group_1_1_3_2__0__Impl7943); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3926:1: rule__MethodCall__Group_1_1_3_2__1 : rule__MethodCall__Group_1_1_3_2__1__Impl ;
    public final void rule__MethodCall__Group_1_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3930:1: ( rule__MethodCall__Group_1_1_3_2__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3931:2: rule__MethodCall__Group_1_1_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3_2__1__Impl_in_rule__MethodCall__Group_1_1_3_2__17974);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3937:1: rule__MethodCall__Group_1_1_3_2__1__Impl : ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) ) ;
    public final void rule__MethodCall__Group_1_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3941:1: ( ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3942:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3942:1: ( ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3943:1: ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_2_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3944:1: ( rule__MethodCall__ParametersAssignment_1_1_3_2_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3944:2: rule__MethodCall__ParametersAssignment_1_1_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_2_1_in_rule__MethodCall__Group_1_1_3_2__1__Impl8001);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3977:1: rule__MatchTraceExpression__Group__0 : rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1 ;
    public final void rule__MatchTraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3981:1: ( rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3982:2: rule__MatchTraceExpression__Group__0__Impl rule__MatchTraceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__0__Impl_in_rule__MatchTraceExpression__Group__08054);
            rule__MatchTraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__1_in_rule__MatchTraceExpression__Group__08057);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3989:1: rule__MatchTraceExpression__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchTraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3993:1: ( ( 'match' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3994:1: ( 'match' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3994:1: ( 'match' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3995:1: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MatchTraceExpression__Group__0__Impl8085); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4008:1: rule__MatchTraceExpression__Group__1 : rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2 ;
    public final void rule__MatchTraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4012:1: ( rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4013:2: rule__MatchTraceExpression__Group__1__Impl rule__MatchTraceExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__1__Impl_in_rule__MatchTraceExpression__Group__18116);
            rule__MatchTraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__2_in_rule__MatchTraceExpression__Group__18119);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4020:1: rule__MatchTraceExpression__Group__1__Impl : ( ( rule__MatchTraceExpression__Group_1__0 )? ) ;
    public final void rule__MatchTraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4024:1: ( ( ( rule__MatchTraceExpression__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4025:1: ( ( rule__MatchTraceExpression__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4025:1: ( ( rule__MatchTraceExpression__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4026:1: ( rule__MatchTraceExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4027:1: ( rule__MatchTraceExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==28) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4027:2: rule__MatchTraceExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__0_in_rule__MatchTraceExpression__Group__1__Impl8146);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4037:1: rule__MatchTraceExpression__Group__2 : rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3 ;
    public final void rule__MatchTraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4041:1: ( rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4042:2: rule__MatchTraceExpression__Group__2__Impl rule__MatchTraceExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__2__Impl_in_rule__MatchTraceExpression__Group__28177);
            rule__MatchTraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__3_in_rule__MatchTraceExpression__Group__28180);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4049:1: rule__MatchTraceExpression__Group__2__Impl : ( ( rule__MatchTraceExpression__TraceAssignment_2 ) ) ;
    public final void rule__MatchTraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4053:1: ( ( ( rule__MatchTraceExpression__TraceAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4054:1: ( ( rule__MatchTraceExpression__TraceAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4054:1: ( ( rule__MatchTraceExpression__TraceAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4055:1: ( rule__MatchTraceExpression__TraceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4056:1: ( rule__MatchTraceExpression__TraceAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4056:2: rule__MatchTraceExpression__TraceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__TraceAssignment_2_in_rule__MatchTraceExpression__Group__2__Impl8207);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4066:1: rule__MatchTraceExpression__Group__3 : rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4 ;
    public final void rule__MatchTraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4070:1: ( rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4071:2: rule__MatchTraceExpression__Group__3__Impl rule__MatchTraceExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__3__Impl_in_rule__MatchTraceExpression__Group__38237);
            rule__MatchTraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__4_in_rule__MatchTraceExpression__Group__38240);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4078:1: rule__MatchTraceExpression__Group__3__Impl : ( 'with' ) ;
    public final void rule__MatchTraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4082:1: ( ( 'with' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4083:1: ( 'with' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4083:1: ( 'with' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4084:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MatchTraceExpression__Group__3__Impl8268); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4097:1: rule__MatchTraceExpression__Group__4 : rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5 ;
    public final void rule__MatchTraceExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4101:1: ( rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4102:2: rule__MatchTraceExpression__Group__4__Impl rule__MatchTraceExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__4__Impl_in_rule__MatchTraceExpression__Group__48299);
            rule__MatchTraceExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__5_in_rule__MatchTraceExpression__Group__48302);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4109:1: rule__MatchTraceExpression__Group__4__Impl : ( '[' ) ;
    public final void rule__MatchTraceExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4113:1: ( ( '[' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4114:1: ( '[' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4114:1: ( '[' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4115:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MatchTraceExpression__Group__4__Impl8330); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4128:1: rule__MatchTraceExpression__Group__5 : rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6 ;
    public final void rule__MatchTraceExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4132:1: ( rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4133:2: rule__MatchTraceExpression__Group__5__Impl rule__MatchTraceExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__5__Impl_in_rule__MatchTraceExpression__Group__58361);
            rule__MatchTraceExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__6_in_rule__MatchTraceExpression__Group__58364);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4140:1: rule__MatchTraceExpression__Group__5__Impl : ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) ) ;
    public final void rule__MatchTraceExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4144:1: ( ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4145:1: ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4145:1: ( ( rule__MatchTraceExpression__TraceExprAssignment_5 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4146:1: ( rule__MatchTraceExpression__TraceExprAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceExprAssignment_5()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4147:1: ( rule__MatchTraceExpression__TraceExprAssignment_5 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4147:2: rule__MatchTraceExpression__TraceExprAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__TraceExprAssignment_5_in_rule__MatchTraceExpression__Group__5__Impl8391);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4157:1: rule__MatchTraceExpression__Group__6 : rule__MatchTraceExpression__Group__6__Impl ;
    public final void rule__MatchTraceExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4161:1: ( rule__MatchTraceExpression__Group__6__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4162:2: rule__MatchTraceExpression__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group__6__Impl_in_rule__MatchTraceExpression__Group__68421);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4168:1: rule__MatchTraceExpression__Group__6__Impl : ( ']' ) ;
    public final void rule__MatchTraceExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4172:1: ( ( ']' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4173:1: ( ']' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4173:1: ( ']' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4174:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getRightSquareBracketKeyword_6()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MatchTraceExpression__Group__6__Impl8449); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4201:1: rule__MatchTraceExpression__Group_1__0 : rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1 ;
    public final void rule__MatchTraceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4205:1: ( rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4206:2: rule__MatchTraceExpression__Group_1__0__Impl rule__MatchTraceExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__0__Impl_in_rule__MatchTraceExpression__Group_1__08494);
            rule__MatchTraceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__1_in_rule__MatchTraceExpression__Group_1__08497);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4213:1: rule__MatchTraceExpression__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__MatchTraceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4217:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4218:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4218:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4219:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchTraceExpression__Group_1__0__Impl8524); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4230:1: rule__MatchTraceExpression__Group_1__1 : rule__MatchTraceExpression__Group_1__1__Impl ;
    public final void rule__MatchTraceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4234:1: ( rule__MatchTraceExpression__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4235:2: rule__MatchTraceExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchTraceExpression__Group_1__1__Impl_in_rule__MatchTraceExpression__Group_1__18553);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4241:1: rule__MatchTraceExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__MatchTraceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4245:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4246:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4246:1: ( '!' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4247:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MatchTraceExpression__Group_1__1__Impl8581); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4264:1: rule__TraceExprLanguage__Group__0 : rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1 ;
    public final void rule__TraceExprLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4268:1: ( rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4269:2: rule__TraceExprLanguage__Group__0__Impl rule__TraceExprLanguage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__0__Impl_in_rule__TraceExprLanguage__Group__08616);
            rule__TraceExprLanguage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__1_in_rule__TraceExprLanguage__Group__08619);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4276:1: rule__TraceExprLanguage__Group__0__Impl : ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) ) ;
    public final void rule__TraceExprLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4280:1: ( ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4281:1: ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4281:1: ( ( rule__TraceExprLanguage__TraceVarAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4282:1: ( rule__TraceExprLanguage__TraceVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4283:1: ( rule__TraceExprLanguage__TraceVarAssignment_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4283:2: rule__TraceExprLanguage__TraceVarAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__TraceVarAssignment_0_in_rule__TraceExprLanguage__Group__0__Impl8646);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4293:1: rule__TraceExprLanguage__Group__1 : rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2 ;
    public final void rule__TraceExprLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4297:1: ( rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4298:2: rule__TraceExprLanguage__Group__1__Impl rule__TraceExprLanguage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__1__Impl_in_rule__TraceExprLanguage__Group__18676);
            rule__TraceExprLanguage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__2_in_rule__TraceExprLanguage__Group__18679);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4305:1: rule__TraceExprLanguage__Group__1__Impl : ( '=' ) ;
    public final void rule__TraceExprLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4309:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4310:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4310:1: ( '=' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4311:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TraceExprLanguage__Group__1__Impl8707); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4324:1: rule__TraceExprLanguage__Group__2 : rule__TraceExprLanguage__Group__2__Impl ;
    public final void rule__TraceExprLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4328:1: ( rule__TraceExprLanguage__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4329:2: rule__TraceExprLanguage__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__Group__2__Impl_in_rule__TraceExprLanguage__Group__28738);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4335:1: rule__TraceExprLanguage__Group__2__Impl : ( ( rule__TraceExprLanguage__ExprAssignment_2 ) ) ;
    public final void rule__TraceExprLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4339:1: ( ( ( rule__TraceExprLanguage__ExprAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4340:1: ( ( rule__TraceExprLanguage__ExprAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4340:1: ( ( rule__TraceExprLanguage__ExprAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4341:1: ( rule__TraceExprLanguage__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getExprAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4342:1: ( rule__TraceExprLanguage__ExprAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4342:2: rule__TraceExprLanguage__ExprAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TraceExprLanguage__ExprAssignment_2_in_rule__TraceExprLanguage__Group__2__Impl8765);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4358:1: rule__PutTraceExpression__Group__0 : rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1 ;
    public final void rule__PutTraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4362:1: ( rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4363:2: rule__PutTraceExpression__Group__0__Impl rule__PutTraceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__0__Impl_in_rule__PutTraceExpression__Group__08801);
            rule__PutTraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__1_in_rule__PutTraceExpression__Group__08804);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4370:1: rule__PutTraceExpression__Group__0__Impl : ( 'put' ) ;
    public final void rule__PutTraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4374:1: ( ( 'put' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4375:1: ( 'put' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4375:1: ( 'put' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4376:1: 'put'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getPutKeyword_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__PutTraceExpression__Group__0__Impl8832); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4389:1: rule__PutTraceExpression__Group__1 : rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2 ;
    public final void rule__PutTraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4393:1: ( rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4394:2: rule__PutTraceExpression__Group__1__Impl rule__PutTraceExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__1__Impl_in_rule__PutTraceExpression__Group__18863);
            rule__PutTraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__2_in_rule__PutTraceExpression__Group__18866);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4401:1: rule__PutTraceExpression__Group__1__Impl : ( ( rule__PutTraceExpression__Group_1__0 )? ) ;
    public final void rule__PutTraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4405:1: ( ( ( rule__PutTraceExpression__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4406:1: ( ( rule__PutTraceExpression__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4406:1: ( ( rule__PutTraceExpression__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4407:1: ( rule__PutTraceExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4408:1: ( rule__PutTraceExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==28) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4408:2: rule__PutTraceExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__0_in_rule__PutTraceExpression__Group__1__Impl8893);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4418:1: rule__PutTraceExpression__Group__2 : rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3 ;
    public final void rule__PutTraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4422:1: ( rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4423:2: rule__PutTraceExpression__Group__2__Impl rule__PutTraceExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__2__Impl_in_rule__PutTraceExpression__Group__28924);
            rule__PutTraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__3_in_rule__PutTraceExpression__Group__28927);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4430:1: rule__PutTraceExpression__Group__2__Impl : ( ( rule__PutTraceExpression__TraceAssignment_2 ) ) ;
    public final void rule__PutTraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4434:1: ( ( ( rule__PutTraceExpression__TraceAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4435:1: ( ( rule__PutTraceExpression__TraceAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4435:1: ( ( rule__PutTraceExpression__TraceAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4436:1: ( rule__PutTraceExpression__TraceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4437:1: ( rule__PutTraceExpression__TraceAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4437:2: rule__PutTraceExpression__TraceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__TraceAssignment_2_in_rule__PutTraceExpression__Group__2__Impl8954);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4447:1: rule__PutTraceExpression__Group__3 : rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4 ;
    public final void rule__PutTraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4451:1: ( rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4452:2: rule__PutTraceExpression__Group__3__Impl rule__PutTraceExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__3__Impl_in_rule__PutTraceExpression__Group__38984);
            rule__PutTraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__4_in_rule__PutTraceExpression__Group__38987);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4459:1: rule__PutTraceExpression__Group__3__Impl : ( 'with' ) ;
    public final void rule__PutTraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4463:1: ( ( 'with' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4464:1: ( 'with' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4464:1: ( 'with' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4465:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getWithKeyword_3()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__PutTraceExpression__Group__3__Impl9015); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4478:1: rule__PutTraceExpression__Group__4 : rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5 ;
    public final void rule__PutTraceExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4482:1: ( rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4483:2: rule__PutTraceExpression__Group__4__Impl rule__PutTraceExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__4__Impl_in_rule__PutTraceExpression__Group__49046);
            rule__PutTraceExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__5_in_rule__PutTraceExpression__Group__49049);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4490:1: rule__PutTraceExpression__Group__4__Impl : ( '[' ) ;
    public final void rule__PutTraceExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4494:1: ( ( '[' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4495:1: ( '[' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4495:1: ( '[' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4496:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getLeftSquareBracketKeyword_4()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__PutTraceExpression__Group__4__Impl9077); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4509:1: rule__PutTraceExpression__Group__5 : rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6 ;
    public final void rule__PutTraceExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4513:1: ( rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4514:2: rule__PutTraceExpression__Group__5__Impl rule__PutTraceExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__5__Impl_in_rule__PutTraceExpression__Group__59108);
            rule__PutTraceExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__6_in_rule__PutTraceExpression__Group__59111);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4521:1: rule__PutTraceExpression__Group__5__Impl : ( ( rule__PutTraceExpression__ParametersAssignment_5 ) ) ;
    public final void rule__PutTraceExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4525:1: ( ( ( rule__PutTraceExpression__ParametersAssignment_5 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4526:1: ( ( rule__PutTraceExpression__ParametersAssignment_5 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4526:1: ( ( rule__PutTraceExpression__ParametersAssignment_5 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4527:1: ( rule__PutTraceExpression__ParametersAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_5()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4528:1: ( rule__PutTraceExpression__ParametersAssignment_5 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4528:2: rule__PutTraceExpression__ParametersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__ParametersAssignment_5_in_rule__PutTraceExpression__Group__5__Impl9138);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4538:1: rule__PutTraceExpression__Group__6 : rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7 ;
    public final void rule__PutTraceExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4542:1: ( rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4543:2: rule__PutTraceExpression__Group__6__Impl rule__PutTraceExpression__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__6__Impl_in_rule__PutTraceExpression__Group__69168);
            rule__PutTraceExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__7_in_rule__PutTraceExpression__Group__69171);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4550:1: rule__PutTraceExpression__Group__6__Impl : ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) ) ;
    public final void rule__PutTraceExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4554:1: ( ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4555:1: ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4555:1: ( ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4556:1: ( ( rule__PutTraceExpression__Group_6__0 ) ) ( ( rule__PutTraceExpression__Group_6__0 )* )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4556:1: ( ( rule__PutTraceExpression__Group_6__0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4557:1: ( rule__PutTraceExpression__Group_6__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4558:1: ( rule__PutTraceExpression__Group_6__0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4558:2: rule__PutTraceExpression__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl9200);
            rule__PutTraceExpression__Group_6__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }

            }

            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4561:1: ( ( rule__PutTraceExpression__Group_6__0 )* )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4562:1: ( rule__PutTraceExpression__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getGroup_6()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4563:1: ( rule__PutTraceExpression__Group_6__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4563:2: rule__PutTraceExpression__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl9212);
            	    rule__PutTraceExpression__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4574:1: rule__PutTraceExpression__Group__7 : rule__PutTraceExpression__Group__7__Impl ;
    public final void rule__PutTraceExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4578:1: ( rule__PutTraceExpression__Group__7__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4579:2: rule__PutTraceExpression__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group__7__Impl_in_rule__PutTraceExpression__Group__79245);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4585:1: rule__PutTraceExpression__Group__7__Impl : ( ']' ) ;
    public final void rule__PutTraceExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4589:1: ( ( ']' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4590:1: ( ']' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4590:1: ( ']' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4591:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getRightSquareBracketKeyword_7()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__PutTraceExpression__Group__7__Impl9273); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4620:1: rule__PutTraceExpression__Group_1__0 : rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1 ;
    public final void rule__PutTraceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4624:1: ( rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4625:2: rule__PutTraceExpression__Group_1__0__Impl rule__PutTraceExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__0__Impl_in_rule__PutTraceExpression__Group_1__09320);
            rule__PutTraceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__1_in_rule__PutTraceExpression__Group_1__09323);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4632:1: rule__PutTraceExpression__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__PutTraceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4636:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4637:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4637:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4638:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceExpression__Group_1__0__Impl9350); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4649:1: rule__PutTraceExpression__Group_1__1 : rule__PutTraceExpression__Group_1__1__Impl ;
    public final void rule__PutTraceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4653:1: ( rule__PutTraceExpression__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4654:2: rule__PutTraceExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_1__1__Impl_in_rule__PutTraceExpression__Group_1__19379);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4660:1: rule__PutTraceExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__PutTraceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4664:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4665:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4665:1: ( '!' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4666:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__PutTraceExpression__Group_1__1__Impl9407); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4683:1: rule__PutTraceExpression__Group_6__0 : rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1 ;
    public final void rule__PutTraceExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4687:1: ( rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4688:2: rule__PutTraceExpression__Group_6__0__Impl rule__PutTraceExpression__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__0__Impl_in_rule__PutTraceExpression__Group_6__09442);
            rule__PutTraceExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__1_in_rule__PutTraceExpression__Group_6__09445);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4695:1: rule__PutTraceExpression__Group_6__0__Impl : ( ',' ) ;
    public final void rule__PutTraceExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4699:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4700:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4700:1: ( ',' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4701:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getCommaKeyword_6_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PutTraceExpression__Group_6__0__Impl9473); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4714:1: rule__PutTraceExpression__Group_6__1 : rule__PutTraceExpression__Group_6__1__Impl ;
    public final void rule__PutTraceExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4718:1: ( rule__PutTraceExpression__Group_6__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4719:2: rule__PutTraceExpression__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__Group_6__1__Impl_in_rule__PutTraceExpression__Group_6__19504);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4725:1: rule__PutTraceExpression__Group_6__1__Impl : ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) ) ;
    public final void rule__PutTraceExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4729:1: ( ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4730:1: ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4730:1: ( ( rule__PutTraceExpression__ParametersAssignment_6_1 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4731:1: ( rule__PutTraceExpression__ParametersAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_6_1()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4732:1: ( rule__PutTraceExpression__ParametersAssignment_6_1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4732:2: rule__PutTraceExpression__ParametersAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceExpression__ParametersAssignment_6_1_in_rule__PutTraceExpression__Group_6__1__Impl9531);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4746:1: rule__PutTraceParameter__Group__0 : rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1 ;
    public final void rule__PutTraceParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4750:1: ( rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4751:2: rule__PutTraceParameter__Group__0__Impl rule__PutTraceParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__0__Impl_in_rule__PutTraceParameter__Group__09565);
            rule__PutTraceParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__1_in_rule__PutTraceParameter__Group__09568);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4758:1: rule__PutTraceParameter__Group__0__Impl : ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) ) ;
    public final void rule__PutTraceParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4762:1: ( ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4763:1: ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4763:1: ( ( rule__PutTraceParameter__TraceVarAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4764:1: ( rule__PutTraceParameter__TraceVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarAssignment_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4765:1: ( rule__PutTraceParameter__TraceVarAssignment_0 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4765:2: rule__PutTraceParameter__TraceVarAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__TraceVarAssignment_0_in_rule__PutTraceParameter__Group__0__Impl9595);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4775:1: rule__PutTraceParameter__Group__1 : rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2 ;
    public final void rule__PutTraceParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4779:1: ( rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4780:2: rule__PutTraceParameter__Group__1__Impl rule__PutTraceParameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__1__Impl_in_rule__PutTraceParameter__Group__19625);
            rule__PutTraceParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__2_in_rule__PutTraceParameter__Group__19628);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4787:1: rule__PutTraceParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__PutTraceParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4791:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4792:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4792:1: ( '=' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4793:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PutTraceParameter__Group__1__Impl9656); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4806:1: rule__PutTraceParameter__Group__2 : rule__PutTraceParameter__Group__2__Impl ;
    public final void rule__PutTraceParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4810:1: ( rule__PutTraceParameter__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4811:2: rule__PutTraceParameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__Group__2__Impl_in_rule__PutTraceParameter__Group__29687);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4817:1: rule__PutTraceParameter__Group__2__Impl : ( ( rule__PutTraceParameter__ValueAssignment_2 ) ) ;
    public final void rule__PutTraceParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4821:1: ( ( ( rule__PutTraceParameter__ValueAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4822:1: ( ( rule__PutTraceParameter__ValueAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4822:1: ( ( rule__PutTraceParameter__ValueAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4823:1: ( rule__PutTraceParameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getValueAssignment_2()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4824:1: ( rule__PutTraceParameter__ValueAssignment_2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4824:2: rule__PutTraceParameter__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PutTraceParameter__ValueAssignment_2_in_rule__PutTraceParameter__Group__2__Impl9714);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4840:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4844:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4845:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__09750);
            rule__EDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__09753);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4852:1: rule__EDouble__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4856:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4857:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4857:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4858:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl9780); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4869:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4873:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4874:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__19809);
            rule__EDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__19812);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4881:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4885:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4886:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4886:1: ( '.' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4887:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EDouble__Group__1__Impl9840); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4900:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4904:1: ( rule__EDouble__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4905:2: rule__EDouble__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__29871);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4911:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4915:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4916:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4916:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4917:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl9898); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4934:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4938:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4939:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09933);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09936);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4946:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4950:1: ( ( ( '-' )? ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4951:1: ( ( '-' )? )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4951:1: ( ( '-' )? )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4952:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4953:1: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4954:2: '-'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__EInt__Group__0__Impl9965); if (state.failed) return ;

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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4965:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4969:1: ( rule__EInt__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4970:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19998);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4976:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4980:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4981:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4981:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:4982:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl10025); if (state.failed) return ;
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


    // $ANTLR start "rule__TraceInterface__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5000:1: rule__TraceInterface__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TraceInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5004:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5005:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5005:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5006:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceInterface__NameAssignment_110065);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5015:1: rule__TraceInterface__DefinitionsAssignment_2 : ( ruleTraceDefinition ) ;
    public final void rule__TraceInterface__DefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5019:1: ( ( ruleTraceDefinition ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5020:1: ( ruleTraceDefinition )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5020:1: ( ruleTraceDefinition )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5021:1: ruleTraceDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceInterfaceAccess().getDefinitionsTraceDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_rule__TraceInterface__DefinitionsAssignment_210096);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5030:1: rule__TraceDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TraceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5034:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5035:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5035:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5036:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceDefinition__NameAssignment_110127);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5045:1: rule__TraceDefinition__ElementsAssignment_2_0_1 : ( ruleTraceElementInline ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5049:1: ( ( ruleTraceElementInline ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5050:1: ( ruleTraceElementInline )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5050:1: ( ruleTraceElementInline )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5051:1: ruleTraceElementInline
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_110158);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5060:1: rule__TraceDefinition__ElementsAssignment_2_0_2_1 : ( ruleTraceElementInline ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5064:1: ( ( ruleTraceElementInline ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5065:1: ( ruleTraceElementInline )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5065:1: ( ruleTraceElementInline )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5066:1: ruleTraceElementInline
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_2_110189);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5075:1: rule__TraceDefinition__ElementsAssignment_2_1_0 : ( ruleTraceElementExpanded ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5079:1: ( ( ruleTraceElementExpanded ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5080:1: ( ruleTraceElementExpanded )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5080:1: ( ruleTraceElementExpanded )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5081:1: ruleTraceElementExpanded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_010220);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5090:1: rule__TraceDefinition__ElementsAssignment_2_1_1 : ( ruleTraceElementExpanded ) ;
    public final void rule__TraceDefinition__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5094:1: ( ( ruleTraceElementExpanded ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5095:1: ( ruleTraceElementExpanded )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5095:1: ( ruleTraceElementExpanded )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5096:1: ruleTraceElementExpanded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_110251);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5105:1: rule__TraceElementInline__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__TraceElementInline__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5109:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5110:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5110:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5111:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceElementInline__NameAssignment_010282);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5120:1: rule__TraceElementInline__TypeAssignment_2 : ( ruleTypeExpression ) ;
    public final void rule__TraceElementInline__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5124:1: ( ( ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5125:1: ( ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5125:1: ( ruleTypeExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5126:1: ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_rule__TraceElementInline__TypeAssignment_210313);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5135:1: rule__TraceElementExpanded__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TraceElementExpanded__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5139:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5140:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5140:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5141:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TraceElementExpanded__NameAssignment_110344);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5150:1: rule__TraceElementExpanded__TypeAssignment_3 : ( ruleTypeExpression ) ;
    public final void rule__TraceElementExpanded__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5154:1: ( ( ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5155:1: ( ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5155:1: ( ruleTypeExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5156:1: ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_rule__TraceElementExpanded__TypeAssignment_310375);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5165:1: rule__ClassUse__ModelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassUse__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5169:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5170:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5170:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5171:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5172:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5173:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getModelRepresentModelIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClassUse__ModelAssignment_010410); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5184:1: rule__ClassUse__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ClassUse__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5188:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5189:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5189:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5190:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getClassNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClassUse__ClassNameAssignment_210445); if (state.failed) return ;
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


    // $ANTLR start "rule__ClassUse__AnnotationsAssignment_3"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5199:1: rule__ClassUse__AnnotationsAssignment_3 : ( ruleSingleAnnotation ) ;
    public final void rule__ClassUse__AnnotationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5203:1: ( ( ruleSingleAnnotation ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5204:1: ( ruleSingleAnnotation )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5204:1: ( ruleSingleAnnotation )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5205:1: ruleSingleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getAnnotationsSingleAnnotationParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_rule__ClassUse__AnnotationsAssignment_310476);
            ruleSingleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getAnnotationsSingleAnnotationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassUse__AnnotationsAssignment_3"


    // $ANTLR start "rule__ClassUse__StrictTypeAssignment_4"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5214:1: rule__ClassUse__StrictTypeAssignment_4 : ( ( '!' ) ) ;
    public final void rule__ClassUse__StrictTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5218:1: ( ( ( '!' ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5219:1: ( ( '!' ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5219:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5220:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getStrictTypeExclamationMarkKeyword_4_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5221:1: ( '!' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5222:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassUseAccess().getStrictTypeExclamationMarkKeyword_4_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ClassUse__StrictTypeAssignment_410512); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getStrictTypeExclamationMarkKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassUseAccess().getStrictTypeExclamationMarkKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassUse__StrictTypeAssignment_4"


    // $ANTLR start "rule__PotencyAnnotation__ValueAssignment_1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5237:1: rule__PotencyAnnotation__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__PotencyAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5241:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5242:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5242:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5243:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPotencyAnnotationAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__PotencyAnnotation__ValueAssignment_110551); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPotencyAnnotationAccess().getValueINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PotencyAnnotation__ValueAssignment_1"


    // $ANTLR start "rule__PropertyWrite__ReceptorAssignment_0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5252:1: rule__PropertyWrite__ReceptorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyWrite__ReceptorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5256:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5257:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5257:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5258:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorVariableCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5259:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5260:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getReceptorVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropertyWrite__ReceptorAssignment_010586); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5271:1: rule__PropertyWrite__PropertyAssignment_2 : ( RULE_ID ) ;
    public final void rule__PropertyWrite__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5275:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5276:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5276:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5277:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getPropertyIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropertyWrite__PropertyAssignment_210621); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5286:1: rule__PropertyWrite__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__PropertyWrite__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5290:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5291:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5291:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5292:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyWriteAccess().getExpressionExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__PropertyWrite__ExpressionAssignment_410652);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5301:1: rule__DefineVariable__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DefineVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5305:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5306:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5306:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5307:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DefineVariable__NameAssignment_010683);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5316:1: rule__DefineVariable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__DefineVariable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5320:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5321:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5321:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5322:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__DefineVariable__ExpressionAssignment_210714);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5331:1: rule__ModelReference__ModelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModelReference__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5335:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5336:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5336:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5337:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5338:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5339:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getModelRepresentModelIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ModelReference__ModelAssignment_010749); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5350:1: rule__ModelReference__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModelReference__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5354:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5355:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5355:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5356:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ModelReference__ClassNameAssignment_210784);
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


    // $ANTLR start "rule__IfExpr__ThenAssignment_1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5365:1: rule__IfExpr__ThenAssignment_1 : ( ruleConditionBranch ) ;
    public final void rule__IfExpr__ThenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5369:1: ( ( ruleConditionBranch ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5370:1: ( ruleConditionBranch )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5370:1: ( ruleConditionBranch )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5371:1: ruleConditionBranch
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getThenConditionBranchParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionBranch_in_rule__IfExpr__ThenAssignment_110815);
            ruleConditionBranch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getThenConditionBranchParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__ThenAssignment_1"


    // $ANTLR start "rule__IfExpr__ElsifsAssignment_2_1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5380:1: rule__IfExpr__ElsifsAssignment_2_1 : ( ruleConditionBranch ) ;
    public final void rule__IfExpr__ElsifsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5384:1: ( ( ruleConditionBranch ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5385:1: ( ruleConditionBranch )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5385:1: ( ruleConditionBranch )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5386:1: ruleConditionBranch
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getElsifsConditionBranchParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionBranch_in_rule__IfExpr__ElsifsAssignment_2_110846);
            ruleConditionBranch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getElsifsConditionBranchParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__ElsifsAssignment_2_1"


    // $ANTLR start "rule__IfExpr__ElseAssignment_3_1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5395:1: rule__IfExpr__ElseAssignment_3_1 : ( ruleBranchBranch ) ;
    public final void rule__IfExpr__ElseAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5399:1: ( ( ruleBranchBranch ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5400:1: ( ruleBranchBranch )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5400:1: ( ruleBranchBranch )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5401:1: ruleBranchBranch
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExprAccess().getElseBranchBranchParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBranchBranch_in_rule__IfExpr__ElseAssignment_3_110877);
            ruleBranchBranch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExprAccess().getElseBranchBranchParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpr__ElseAssignment_3_1"


    // $ANTLR start "rule__ConditionBranch__ConditionAssignment_0"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5410:1: rule__ConditionBranch__ConditionAssignment_0 : ( ruleExpression ) ;
    public final void rule__ConditionBranch__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5414:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5415:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5415:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5416:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBranchAccess().getConditionExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ConditionBranch__ConditionAssignment_010908);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBranchAccess().getConditionExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBranch__ConditionAssignment_0"


    // $ANTLR start "rule__ConditionBranch__StatementsAssignment_1"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5425:1: rule__ConditionBranch__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__ConditionBranch__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5429:1: ( ( ruleStatement ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5430:1: ( ruleStatement )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5430:1: ( ruleStatement )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5431:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBranchAccess().getStatementsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__ConditionBranch__StatementsAssignment_110939);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBranchAccess().getStatementsStatementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBranch__StatementsAssignment_1"


    // $ANTLR start "rule__BranchBranch__StatementsAssignment"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5440:1: rule__BranchBranch__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__BranchBranch__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5444:1: ( ( ruleStatement ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5445:1: ( ruleStatement )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5445:1: ( ruleStatement )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5446:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBranchBranchAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__BranchBranch__StatementsAssignment10970);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBranchBranchAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchBranch__StatementsAssignment"


    // $ANTLR start "rule__VariableReference__VariableAssignment"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5455:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5459:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5460:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5460:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5461:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5462:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5463:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment11005); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5474:1: rule__ClosureDeclaration__FormalParametersAssignment_1_1 : ( ruleClosureParameter ) ;
    public final void rule__ClosureDeclaration__FormalParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5478:1: ( ( ruleClosureParameter ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5479:1: ( ruleClosureParameter )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5479:1: ( ruleClosureParameter )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5480:1: ruleClosureParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_111040);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5489:1: rule__ClosureDeclaration__FormalParametersAssignment_1_2_1 : ( ruleClosureParameter ) ;
    public final void rule__ClosureDeclaration__FormalParametersAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5493:1: ( ( ruleClosureParameter ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5494:1: ( ruleClosureParameter )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5494:1: ( ruleClosureParameter )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5495:1: ruleClosureParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_2_111071);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5504:1: rule__ClosureDeclaration__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__ClosureDeclaration__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5508:1: ( ( ruleStatement ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5509:1: ( ruleStatement )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5509:1: ( ruleStatement )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5510:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__ClosureDeclaration__StatementsAssignment_211102);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5519:1: rule__ClosureParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__ClosureParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5523:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5524:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5524:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5525:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosureParameterAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClosureParameter__NameAssignment11133); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5534:1: rule__MethodCall__BinaryOpAssignment_1_0_1 : ( ruleBinaryOp ) ;
    public final void rule__MethodCall__BinaryOpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5538:1: ( ( ruleBinaryOp ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5539:1: ( ruleBinaryOp )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5539:1: ( ruleBinaryOp )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5540:1: ruleBinaryOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOp_in_rule__MethodCall__BinaryOpAssignment_1_0_111164);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5549:1: rule__MethodCall__RightAssignment_1_0_2 : ( ruleExpression ) ;
    public final void rule__MethodCall__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5553:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5554:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5554:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5555:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__RightAssignment_1_0_211195);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5564:1: rule__MethodCall__MethodNameAssignment_1_1_2 : ( ruleEString ) ;
    public final void rule__MethodCall__MethodNameAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5568:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5569:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5569:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5570:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MethodCall__MethodNameAssignment_1_1_211226);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5579:1: rule__MethodCall__WithParametersAssignment_1_1_3_0 : ( ( '(' ) ) ;
    public final void rule__MethodCall__WithParametersAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5583:1: ( ( ( '(' ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5584:1: ( ( '(' ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5584:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5585:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5586:1: ( '(' )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5587:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MethodCall__WithParametersAssignment_1_1_3_011262); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5602:1: rule__MethodCall__ParametersAssignment_1_1_3_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5606:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5607:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5607:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5608:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_111301);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5617:1: rule__MethodCall__ParametersAssignment_1_1_3_2_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_1_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5621:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5622:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5622:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5623:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_2_111332);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5632:1: rule__MethodCall__ParametersAssignment_1_1_4 : ( ruleClosureDeclaration ) ;
    public final void rule__MethodCall__ParametersAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5636:1: ( ( ruleClosureDeclaration ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5637:1: ( ruleClosureDeclaration )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5637:1: ( ruleClosureDeclaration )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5638:1: ruleClosureDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getParametersClosureDeclarationParserRuleCall_1_1_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rule__MethodCall__ParametersAssignment_1_1_411363);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5669:1: rule__MatchTraceExpression__TraceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MatchTraceExpression__TraceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5673:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5674:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5674:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5675:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5676:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5677:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchTraceExpression__TraceAssignment_211420); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5688:1: rule__MatchTraceExpression__TraceExprAssignment_5 : ( ruleTraceExprLanguage ) ;
    public final void rule__MatchTraceExpression__TraceExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5692:1: ( ( ruleTraceExprLanguage ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5693:1: ( ruleTraceExprLanguage )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5693:1: ( ruleTraceExprLanguage )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5694:1: ruleTraceExprLanguage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_rule__MatchTraceExpression__TraceExprAssignment_511455);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5703:1: rule__TraceExprLanguage__TraceVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TraceExprLanguage__TraceVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5707:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5708:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5708:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5709:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5710:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5711:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TraceExprLanguage__TraceVarAssignment_011490); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5722:1: rule__TraceExprLanguage__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__TraceExprLanguage__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5726:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5727:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5727:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5728:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__TraceExprLanguage__ExprAssignment_211525);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5737:1: rule__PutTraceExpression__TraceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PutTraceExpression__TraceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5741:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5742:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5742:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5743:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5744:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5745:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceExpression__TraceAssignment_211560); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5756:1: rule__PutTraceExpression__ParametersAssignment_5 : ( rulePutTraceParameter ) ;
    public final void rule__PutTraceExpression__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5760:1: ( ( rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5761:1: ( rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5761:1: ( rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5762:1: rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_511595);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5771:1: rule__PutTraceExpression__ParametersAssignment_6_1 : ( rulePutTraceParameter ) ;
    public final void rule__PutTraceExpression__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5775:1: ( ( rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5776:1: ( rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5776:1: ( rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5777:1: rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_6_111626);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5786:1: rule__PutTraceParameter__TraceVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PutTraceParameter__TraceVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5790:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5791:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5791:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5792:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
            }
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5793:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5794:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PutTraceParameter__TraceVarAssignment_011661); if (state.failed) return ;
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5805:1: rule__PutTraceParameter__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__PutTraceParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5809:1: ( ( ruleExpression ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5810:1: ( ruleExpression )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5810:1: ( ruleExpression )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5811:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__PutTraceParameter__ValueAssignment_211696);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5820:1: rule__NumLiteral__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NumLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5824:1: ( ( ruleEInt ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5825:1: ( ruleEInt )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5825:1: ( ruleEInt )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5826:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NumLiteral__ValueAssignment11727);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5835:1: rule__FloatLiteral__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5839:1: ( ( ruleEDouble ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5840:1: ( ruleEDouble )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5840:1: ( ruleEDouble )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5841:1: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueEDoubleParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__FloatLiteral__ValueAssignment11758);
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
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5850:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5854:1: ( ( RULE_STRING ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5855:1: ( RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5855:1: ( RULE_STRING )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5856:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11789); if (state.failed) return ;
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


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5865:1: rule__BooleanLiteral__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5869:1: ( ( ruleEBoolean ) )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5870:1: ( ruleEBoolean )
            {
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5870:1: ( ruleEBoolean )
            // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:5871:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueEBooleanParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BooleanLiteral__ValueAssignment11820);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueEBooleanParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"

    // $ANTLR start synpred34_InternalExpressions
    public final void synpred34_InternalExpressions_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3474:2: ( rule__MethodCall__Alternatives_1 )
        // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3474:2: rule__MethodCall__Alternatives_1
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Alternatives_1_in_synpred34_InternalExpressions7074);
        rule__MethodCall__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalExpressions

    // $ANTLR start synpred35_InternalExpressions
    public final void synpred35_InternalExpressions_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3690:2: ( rule__MethodCall__Group_1_1_3__0 )
        // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3690:2: rule__MethodCall__Group_1_1_3__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__Group_1_1_3__0_in_synpred35_InternalExpressions7505);
        rule__MethodCall__Group_1_1_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalExpressions

    // $ANTLR start synpred36_InternalExpressions
    public final void synpred36_InternalExpressions_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3718:2: ( rule__MethodCall__ParametersAssignment_1_1_4 )
        // ../org.eclectic.frontend.syntax.expressions.ui/src-gen/org/eclectic/frontend/syntax/ui/contentassist/antlr/internal/InternalExpressions.g:3718:2: rule__MethodCall__ParametersAssignment_1_1_4
        {
        pushFollow(FollowSets000.FOLLOW_rule__MethodCall__ParametersAssignment_1_1_4_in_synpred36_InternalExpressions7563);
        rule__MethodCall__ParametersAssignment_1_1_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalExpressions

    // Delegated rules

    public final boolean synpred36_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA24_eotS =
        "\26\uffff";
    static final String DFA24_eofS =
        "\1\2\25\uffff";
    static final String DFA24_minS =
        "\1\4\1\0\24\uffff";
    static final String DFA24_maxS =
        "\1\52\1\0\24\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\22\uffff\1\1";
    static final String DFA24_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA24_transitionS = {
            "\3\2\7\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\3\2\1\1\1\2\1\uffff\2\2\2\uffff\2\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "3690:1: ( rule__MethodCall__Group_1_1_3__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalExpressions()) ) {s = 21;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\26\uffff";
    static final String DFA25_eofS =
        "\1\2\25\uffff";
    static final String DFA25_minS =
        "\1\4\1\0\24\uffff";
    static final String DFA25_maxS =
        "\1\52\1\0\24\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\22\uffff\1\1";
    static final String DFA25_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA25_transitionS = {
            "\3\2\7\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\1\1\2\4\uffff"+
            "\1\2\1\uffff\5\2\1\uffff\2\2\2\uffff\2\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "3718:1: ( rule__MethodCall__ParametersAssignment_1_1_4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalExpressions()) ) {s = 21;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTraceInterface_in_entryRuleTraceInterface67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceInterface74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__0_in_ruleTraceInterface100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceDefinition134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__0_in_ruleTraceDefinition160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementInline194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__0_in_ruleTraceElementInline220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementExpanded254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__0_in_ruleTraceElementExpanded280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpression314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTypeExpression340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_entryRuleClassUse366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassUse373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__0_in_ruleClassUse399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleAnnotation433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePotencyAnnotation492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Group__0_in_rulePotencyAnnotation518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyWrite612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__0_in_rulePropertyWrite638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefineVariable672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__0_in_ruleDefineVariable698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelReference732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__0_in_ruleModelReference758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_ruleExpression818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpr_in_entryRuleIfExpr904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpr911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__0_in_ruleIfExpr937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionBranch_in_entryRuleConditionBranch964 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditionBranch971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConditionBranch__Group__0_in_ruleConditionBranch997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBranchBranch_in_entryRuleBranchBranch1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBranchBranch1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BranchBranch__StatementsAssignment_in_ruleBranchBranch1059 = new BitSet(new long[]{0x000004448082C072L});
        public static final BitSet FOLLOW_rule__BranchBranch__StatementsAssignment_in_ruleBranchBranch1071 = new BitSet(new long[]{0x000004448082C072L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression1101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__0_in_ruleParenthesizedExpression1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference1221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration1281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureDeclaration1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__0_in_ruleClosureDeclaration1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter1341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureParameter1348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureParameter__NameAssignment_in_ruleClosureParameter1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall1401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall1408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression1465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchTraceExpression1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__0_in_ruleMatchTraceExpression1498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage1525 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceExprLanguage1532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__0_in_ruleTraceExprLanguage1558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression1585 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceExpression1592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__0_in_rulePutTraceExpression1618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter1645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceParameter1652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__0_in_rulePutTraceParameter1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral1705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumLiteral__ValueAssignment_in_ruleNumLiteral1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1765 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1885 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString2038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt2098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean2158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOp__Alternatives_in_ruleBinaryOp2197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__0_in_rule__TraceDefinition__Alternatives_22232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__0_in_rule__TraceDefinition__Alternatives_22250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__PotencyAnnotation__Alternatives_02284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__PotencyAnnotation__Alternatives_02304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_rule__Statement__Alternatives2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Statement__Alternatives2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_rule__Statement__Alternatives2372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_rule__Statement__Alternatives2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__PrimaryExpression__Alternatives2421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_rule__PrimaryExpression__Alternatives2455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rule__PrimaryExpression__Alternatives2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_rule__PrimaryExpression__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rule__PrimaryExpression__Alternatives2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpr_in_rule__PrimaryExpression__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_rule__Literal__Alternatives2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__0_in_rule__MethodCall__Alternatives_12638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0_in_rule__MethodCall__Alternatives_12670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EBoolean__Alternatives2757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EBoolean__Alternatives2777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__BinaryOp__Alternatives2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BinaryOp__Alternatives2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BinaryOp__Alternatives2854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BinaryOp__Alternatives2875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__0__Impl_in_rule__TraceInterface__Group__02908 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__1_in_rule__TraceInterface__Group__02911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TraceInterface__Group__0__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__1__Impl_in_rule__TraceInterface__Group__12970 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__2_in_rule__TraceInterface__Group__12973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__NameAssignment_1_in_rule__TraceInterface__Group__1__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__2__Impl_in_rule__TraceInterface__Group__23030 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__3_in_rule__TraceInterface__Group__23033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceInterface__DefinitionsAssignment_2_in_rule__TraceInterface__Group__2__Impl3062 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__TraceInterface__DefinitionsAssignment_2_in_rule__TraceInterface__Group__2__Impl3074 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__TraceInterface__Group__3__Impl_in_rule__TraceInterface__Group__33107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TraceInterface__Group__3__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__0__Impl_in_rule__TraceDefinition__Group__03174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__1_in_rule__TraceDefinition__Group__03177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TraceDefinition__Group__0__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__1__Impl_in_rule__TraceDefinition__Group__13236 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__2_in_rule__TraceDefinition__Group__13239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__NameAssignment_1_in_rule__TraceDefinition__Group__1__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group__2__Impl_in_rule__TraceDefinition__Group__23296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Alternatives_2_in_rule__TraceDefinition__Group__2__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__0__Impl_in_rule__TraceDefinition__Group_2_0__03359 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__1_in_rule__TraceDefinition__Group_2_0__03362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TraceDefinition__Group_2_0__0__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__1__Impl_in_rule__TraceDefinition__Group_2_0__13421 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__2_in_rule__TraceDefinition__Group_2_0__13424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_1_in_rule__TraceDefinition__Group_2_0__1__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__2__Impl_in_rule__TraceDefinition__Group_2_0__23481 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__3_in_rule__TraceDefinition__Group_2_0__23484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__0_in_rule__TraceDefinition__Group_2_0__2__Impl3511 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0__3__Impl_in_rule__TraceDefinition__Group_2_0__33542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TraceDefinition__Group_2_0__3__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__0__Impl_in_rule__TraceDefinition__Group_2_0_2__03609 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__1_in_rule__TraceDefinition__Group_2_0_2__03612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TraceDefinition__Group_2_0_2__0__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_0_2__1__Impl_in_rule__TraceDefinition__Group_2_0_2__13671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_0_2_1_in_rule__TraceDefinition__Group_2_0_2__1__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__0__Impl_in_rule__TraceDefinition__Group_2_1__03732 = new BitSet(new long[]{0x0000000008A00000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__1_in_rule__TraceDefinition__Group_2_1__03735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_0_in_rule__TraceDefinition__Group_2_1__0__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__1__Impl_in_rule__TraceDefinition__Group_2_1__13792 = new BitSet(new long[]{0x0000000008A00000L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__2_in_rule__TraceDefinition__Group_2_1__13795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__ElementsAssignment_2_1_1_in_rule__TraceDefinition__Group_2_1__1__Impl3822 = new BitSet(new long[]{0x0000000008800002L});
        public static final BitSet FOLLOW_rule__TraceDefinition__Group_2_1__2__Impl_in_rule__TraceDefinition__Group_2_1__23853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TraceDefinition__Group_2_1__2__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__0__Impl_in_rule__TraceElementInline__Group__03918 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__1_in_rule__TraceElementInline__Group__03921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__NameAssignment_0_in_rule__TraceElementInline__Group__0__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__1__Impl_in_rule__TraceElementInline__Group__13978 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__2_in_rule__TraceElementInline__Group__13981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TraceElementInline__Group__1__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__Group__2__Impl_in_rule__TraceElementInline__Group__24040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementInline__TypeAssignment_2_in_rule__TraceElementInline__Group__2__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__0__Impl_in_rule__TraceElementExpanded__Group__04103 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__1_in_rule__TraceElementExpanded__Group__04106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TraceElementExpanded__Group__0__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__1__Impl_in_rule__TraceElementExpanded__Group__14165 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__2_in_rule__TraceElementExpanded__Group__14168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__NameAssignment_1_in_rule__TraceElementExpanded__Group__1__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__2__Impl_in_rule__TraceElementExpanded__Group__24225 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__3_in_rule__TraceElementExpanded__Group__24228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TraceElementExpanded__Group__2__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__Group__3__Impl_in_rule__TraceElementExpanded__Group__34287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceElementExpanded__TypeAssignment_3_in_rule__TraceElementExpanded__Group__3__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__0__Impl_in_rule__ClassUse__Group__04352 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__1_in_rule__ClassUse__Group__04355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__ModelAssignment_0_in_rule__ClassUse__Group__0__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__1__Impl_in_rule__ClassUse__Group__14412 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__2_in_rule__ClassUse__Group__14415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ClassUse__Group__1__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__2__Impl_in_rule__ClassUse__Group__24474 = new BitSet(new long[]{0x0000000010003000L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__3_in_rule__ClassUse__Group__24477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__ClassNameAssignment_2_in_rule__ClassUse__Group__2__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__3__Impl_in_rule__ClassUse__Group__34534 = new BitSet(new long[]{0x0000000010003000L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__4_in_rule__ClassUse__Group__34537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__AnnotationsAssignment_3_in_rule__ClassUse__Group__3__Impl4564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__Group__4__Impl_in_rule__ClassUse__Group__44595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassUse__StrictTypeAssignment_4_in_rule__ClassUse__Group__4__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Group__0__Impl_in_rule__PotencyAnnotation__Group__04663 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Group__1_in_rule__PotencyAnnotation__Group__04666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Alternatives_0_in_rule__PotencyAnnotation__Group__0__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Group__1__Impl_in_rule__PotencyAnnotation__Group__14723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__ValueAssignment_1_in_rule__PotencyAnnotation__Group__1__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__0__Impl_in_rule__PropertyWrite__Group__04784 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__1_in_rule__PropertyWrite__Group__04787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__ReceptorAssignment_0_in_rule__PropertyWrite__Group__0__Impl4814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__1__Impl_in_rule__PropertyWrite__Group__14844 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__2_in_rule__PropertyWrite__Group__14847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PropertyWrite__Group__1__Impl4875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__2__Impl_in_rule__PropertyWrite__Group__24906 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__3_in_rule__PropertyWrite__Group__24909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__PropertyAssignment_2_in_rule__PropertyWrite__Group__2__Impl4936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__3__Impl_in_rule__PropertyWrite__Group__34966 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__4_in_rule__PropertyWrite__Group__34969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PropertyWrite__Group__3__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__Group__4__Impl_in_rule__PropertyWrite__Group__45028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyWrite__ExpressionAssignment_4_in_rule__PropertyWrite__Group__4__Impl5055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__0__Impl_in_rule__DefineVariable__Group__05095 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__1_in_rule__DefineVariable__Group__05098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__NameAssignment_0_in_rule__DefineVariable__Group__0__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__1__Impl_in_rule__DefineVariable__Group__15155 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__2_in_rule__DefineVariable__Group__15158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__DefineVariable__Group__1__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__Group__2__Impl_in_rule__DefineVariable__Group__25217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DefineVariable__ExpressionAssignment_2_in_rule__DefineVariable__Group__2__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__0__Impl_in_rule__ModelReference__Group__05280 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__1_in_rule__ModelReference__Group__05283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__ModelAssignment_0_in_rule__ModelReference__Group__0__Impl5310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__1__Impl_in_rule__ModelReference__Group__15340 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__2_in_rule__ModelReference__Group__15343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ModelReference__Group__1__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__Group__2__Impl_in_rule__ModelReference__Group__25402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelReference__ClassNameAssignment_2_in_rule__ModelReference__Group__2__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__0__Impl_in_rule__IfExpr__Group__05465 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__1_in_rule__IfExpr__Group__05468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__IfExpr__Group__0__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__1__Impl_in_rule__IfExpr__Group__15527 = new BitSet(new long[]{0x0000000300200000L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__2_in_rule__IfExpr__Group__15530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__ThenAssignment_1_in_rule__IfExpr__Group__1__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__2__Impl_in_rule__IfExpr__Group__25587 = new BitSet(new long[]{0x0000000300200000L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__3_in_rule__IfExpr__Group__25590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group_2__0_in_rule__IfExpr__Group__2__Impl5617 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__3__Impl_in_rule__IfExpr__Group__35648 = new BitSet(new long[]{0x0000000300200000L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__4_in_rule__IfExpr__Group__35651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group_3__0_in_rule__IfExpr__Group__3__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group__4__Impl_in_rule__IfExpr__Group__45709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__IfExpr__Group__4__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group_2__0__Impl_in_rule__IfExpr__Group_2__05778 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__IfExpr__Group_2__1_in_rule__IfExpr__Group_2__05781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__IfExpr__Group_2__0__Impl5809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group_2__1__Impl_in_rule__IfExpr__Group_2__15840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__ElsifsAssignment_2_1_in_rule__IfExpr__Group_2__1__Impl5867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group_3__0__Impl_in_rule__IfExpr__Group_3__05901 = new BitSet(new long[]{0x000004448082C070L});
        public static final BitSet FOLLOW_rule__IfExpr__Group_3__1_in_rule__IfExpr__Group_3__05904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__IfExpr__Group_3__0__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__Group_3__1__Impl_in_rule__IfExpr__Group_3__15963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfExpr__ElseAssignment_3_1_in_rule__IfExpr__Group_3__1__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConditionBranch__Group__0__Impl_in_rule__ConditionBranch__Group__06024 = new BitSet(new long[]{0x000004448082C070L});
        public static final BitSet FOLLOW_rule__ConditionBranch__Group__1_in_rule__ConditionBranch__Group__06027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConditionBranch__ConditionAssignment_0_in_rule__ConditionBranch__Group__0__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConditionBranch__Group__1__Impl_in_rule__ConditionBranch__Group__16084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConditionBranch__StatementsAssignment_1_in_rule__ConditionBranch__Group__1__Impl6113 = new BitSet(new long[]{0x000004448082C072L});
        public static final BitSet FOLLOW_rule__ConditionBranch__StatementsAssignment_1_in_rule__ConditionBranch__Group__1__Impl6125 = new BitSet(new long[]{0x000004448082C072L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__0__Impl_in_rule__ParenthesizedExpression__Group__06162 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__1_in_rule__ParenthesizedExpression__Group__06165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ParenthesizedExpression__Group__0__Impl6193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__1__Impl_in_rule__ParenthesizedExpression__Group__16224 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__2_in_rule__ParenthesizedExpression__Group__16227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ParenthesizedExpression__Group__1__Impl6254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParenthesizedExpression__Group__2__Impl_in_rule__ParenthesizedExpression__Group__26283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParenthesizedExpression__Group__2__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__0__Impl_in_rule__ClosureDeclaration__Group__06348 = new BitSet(new long[]{0x000004548082C070L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__1_in_rule__ClosureDeclaration__Group__06351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ClosureDeclaration__Group__0__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__1__Impl_in_rule__ClosureDeclaration__Group__16410 = new BitSet(new long[]{0x000004548082C070L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__2_in_rule__ClosureDeclaration__Group__16413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__0_in_rule__ClosureDeclaration__Group__1__Impl6440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__2__Impl_in_rule__ClosureDeclaration__Group__26471 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__3_in_rule__ClosureDeclaration__Group__26474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl6503 = new BitSet(new long[]{0x000004548082C072L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__StatementsAssignment_2_in_rule__ClosureDeclaration__Group__2__Impl6515 = new BitSet(new long[]{0x000004548082C072L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group__3__Impl_in_rule__ClosureDeclaration__Group__36548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ClosureDeclaration__Group__3__Impl6576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__0__Impl_in_rule__ClosureDeclaration__Group_1__06615 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__1_in_rule__ClosureDeclaration__Group_1__06618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ClosureDeclaration__Group_1__0__Impl6646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__1__Impl_in_rule__ClosureDeclaration__Group_1__16677 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__2_in_rule__ClosureDeclaration__Group_1__16680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_1_in_rule__ClosureDeclaration__Group_1__1__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__2__Impl_in_rule__ClosureDeclaration__Group_1__26737 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__3_in_rule__ClosureDeclaration__Group_1__26740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__0_in_rule__ClosureDeclaration__Group_1__2__Impl6767 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1__3__Impl_in_rule__ClosureDeclaration__Group_1__36798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ClosureDeclaration__Group_1__3__Impl6826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__0__Impl_in_rule__ClosureDeclaration__Group_1_2__06865 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__1_in_rule__ClosureDeclaration__Group_1_2__06868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ClosureDeclaration__Group_1_2__0__Impl6896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__Group_1_2__1__Impl_in_rule__ClosureDeclaration__Group_1_2__16927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClosureDeclaration__FormalParametersAssignment_1_2_1_in_rule__ClosureDeclaration__Group_1_2__1__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__06988 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__06991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__MethodCall__Group__0__Impl7018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__17047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Alternatives_1_in_rule__MethodCall__Group__1__Impl7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__0__Impl_in_rule__MethodCall__Group_1_0__07109 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__1_in_rule__MethodCall__Group_1_0__07112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__1__Impl_in_rule__MethodCall__Group_1_0__17170 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__2_in_rule__MethodCall__Group_1_0__17173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__BinaryOpAssignment_1_0_1_in_rule__MethodCall__Group_1_0__1__Impl7200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_0__2__Impl_in_rule__MethodCall__Group_1_0__27230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__RightAssignment_1_0_2_in_rule__MethodCall__Group_1_0__2__Impl7257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__0__Impl_in_rule__MethodCall__Group_1_1__07293 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__1_in_rule__MethodCall__Group_1_1__07296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_0__0_in_rule__MethodCall__Group_1_1__0__Impl7323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__1__Impl_in_rule__MethodCall__Group_1_1__17353 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__2_in_rule__MethodCall__Group_1_1__17356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MethodCall__Group_1_1__1__Impl7384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__2__Impl_in_rule__MethodCall__Group_1_1__27415 = new BitSet(new long[]{0x0000000400800000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__3_in_rule__MethodCall__Group_1_1__27418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__MethodNameAssignment_1_1_2_in_rule__MethodCall__Group_1_1__2__Impl7445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__3__Impl_in_rule__MethodCall__Group_1_1__37475 = new BitSet(new long[]{0x0000000400800000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__4_in_rule__MethodCall__Group_1_1__37478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0_in_rule__MethodCall__Group_1_1__3__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1__4__Impl_in_rule__MethodCall__Group_1_1__47536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_4_in_rule__MethodCall__Group_1_1__4__Impl7563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_0__0__Impl_in_rule__MethodCall__Group_1_1_0__07604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0__Impl_in_rule__MethodCall__Group_1_1_3__07664 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__1_in_rule__MethodCall__Group_1_1_3__07667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__WithParametersAssignment_1_1_3_0_in_rule__MethodCall__Group_1_1_3__0__Impl7694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__1__Impl_in_rule__MethodCall__Group_1_1_3__17724 = new BitSet(new long[]{0x0000002800000000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__2_in_rule__MethodCall__Group_1_1_3__17727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_1_in_rule__MethodCall__Group_1_1_3__1__Impl7754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__2__Impl_in_rule__MethodCall__Group_1_1_3__27784 = new BitSet(new long[]{0x0000002800000000L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__3_in_rule__MethodCall__Group_1_1_3__27787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__0_in_rule__MethodCall__Group_1_1_3__2__Impl7814 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__3__Impl_in_rule__MethodCall__Group_1_1_3__37845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MethodCall__Group_1_1_3__3__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__0__Impl_in_rule__MethodCall__Group_1_1_3_2__07912 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__1_in_rule__MethodCall__Group_1_1_3_2__07915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MethodCall__Group_1_1_3_2__0__Impl7943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3_2__1__Impl_in_rule__MethodCall__Group_1_1_3_2__17974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_3_2_1_in_rule__MethodCall__Group_1_1_3_2__1__Impl8001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__0__Impl_in_rule__MatchTraceExpression__Group__08054 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__1_in_rule__MatchTraceExpression__Group__08057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MatchTraceExpression__Group__0__Impl8085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__1__Impl_in_rule__MatchTraceExpression__Group__18116 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__2_in_rule__MatchTraceExpression__Group__18119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__0_in_rule__MatchTraceExpression__Group__1__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__2__Impl_in_rule__MatchTraceExpression__Group__28177 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__3_in_rule__MatchTraceExpression__Group__28180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__TraceAssignment_2_in_rule__MatchTraceExpression__Group__2__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__3__Impl_in_rule__MatchTraceExpression__Group__38237 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__4_in_rule__MatchTraceExpression__Group__38240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MatchTraceExpression__Group__3__Impl8268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__4__Impl_in_rule__MatchTraceExpression__Group__48299 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__5_in_rule__MatchTraceExpression__Group__48302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MatchTraceExpression__Group__4__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__5__Impl_in_rule__MatchTraceExpression__Group__58361 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__6_in_rule__MatchTraceExpression__Group__58364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__TraceExprAssignment_5_in_rule__MatchTraceExpression__Group__5__Impl8391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group__6__Impl_in_rule__MatchTraceExpression__Group__68421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MatchTraceExpression__Group__6__Impl8449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__0__Impl_in_rule__MatchTraceExpression__Group_1__08494 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__1_in_rule__MatchTraceExpression__Group_1__08497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchTraceExpression__Group_1__0__Impl8524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchTraceExpression__Group_1__1__Impl_in_rule__MatchTraceExpression__Group_1__18553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MatchTraceExpression__Group_1__1__Impl8581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__0__Impl_in_rule__TraceExprLanguage__Group__08616 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__1_in_rule__TraceExprLanguage__Group__08619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__TraceVarAssignment_0_in_rule__TraceExprLanguage__Group__0__Impl8646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__1__Impl_in_rule__TraceExprLanguage__Group__18676 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__2_in_rule__TraceExprLanguage__Group__18679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TraceExprLanguage__Group__1__Impl8707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__Group__2__Impl_in_rule__TraceExprLanguage__Group__28738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TraceExprLanguage__ExprAssignment_2_in_rule__TraceExprLanguage__Group__2__Impl8765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__0__Impl_in_rule__PutTraceExpression__Group__08801 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__1_in_rule__PutTraceExpression__Group__08804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__PutTraceExpression__Group__0__Impl8832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__1__Impl_in_rule__PutTraceExpression__Group__18863 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__2_in_rule__PutTraceExpression__Group__18866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__0_in_rule__PutTraceExpression__Group__1__Impl8893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__2__Impl_in_rule__PutTraceExpression__Group__28924 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__3_in_rule__PutTraceExpression__Group__28927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__TraceAssignment_2_in_rule__PutTraceExpression__Group__2__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__3__Impl_in_rule__PutTraceExpression__Group__38984 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__4_in_rule__PutTraceExpression__Group__38987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__PutTraceExpression__Group__3__Impl9015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__4__Impl_in_rule__PutTraceExpression__Group__49046 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__5_in_rule__PutTraceExpression__Group__49049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__PutTraceExpression__Group__4__Impl9077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__5__Impl_in_rule__PutTraceExpression__Group__59108 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__6_in_rule__PutTraceExpression__Group__59111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__ParametersAssignment_5_in_rule__PutTraceExpression__Group__5__Impl9138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__6__Impl_in_rule__PutTraceExpression__Group__69168 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__7_in_rule__PutTraceExpression__Group__69171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl9200 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0_in_rule__PutTraceExpression__Group__6__Impl9212 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group__7__Impl_in_rule__PutTraceExpression__Group__79245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__PutTraceExpression__Group__7__Impl9273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__0__Impl_in_rule__PutTraceExpression__Group_1__09320 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__1_in_rule__PutTraceExpression__Group_1__09323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceExpression__Group_1__0__Impl9350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_1__1__Impl_in_rule__PutTraceExpression__Group_1__19379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__PutTraceExpression__Group_1__1__Impl9407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__0__Impl_in_rule__PutTraceExpression__Group_6__09442 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__1_in_rule__PutTraceExpression__Group_6__09445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PutTraceExpression__Group_6__0__Impl9473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__Group_6__1__Impl_in_rule__PutTraceExpression__Group_6__19504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceExpression__ParametersAssignment_6_1_in_rule__PutTraceExpression__Group_6__1__Impl9531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__0__Impl_in_rule__PutTraceParameter__Group__09565 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__1_in_rule__PutTraceParameter__Group__09568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__TraceVarAssignment_0_in_rule__PutTraceParameter__Group__0__Impl9595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__1__Impl_in_rule__PutTraceParameter__Group__19625 = new BitSet(new long[]{0x000000448082C070L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__2_in_rule__PutTraceParameter__Group__19628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PutTraceParameter__Group__1__Impl9656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__Group__2__Impl_in_rule__PutTraceParameter__Group__29687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PutTraceParameter__ValueAssignment_2_in_rule__PutTraceParameter__Group__2__Impl9714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__09750 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__09753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl9780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__19809 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__19812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EDouble__Group__1__Impl9840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__29871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl9898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09933 = new BitSet(new long[]{0x0000000000020040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__EInt__Group__0__Impl9965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl10025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceInterface__NameAssignment_110065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_rule__TraceInterface__DefinitionsAssignment_210096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceDefinition__NameAssignment_110127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_110158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_rule__TraceDefinition__ElementsAssignment_2_0_2_110189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_010220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_rule__TraceDefinition__ElementsAssignment_2_1_110251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceElementInline__NameAssignment_010282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_rule__TraceElementInline__TypeAssignment_210313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TraceElementExpanded__NameAssignment_110344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_rule__TraceElementExpanded__TypeAssignment_310375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClassUse__ModelAssignment_010410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClassUse__ClassNameAssignment_210445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_rule__ClassUse__AnnotationsAssignment_310476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ClassUse__StrictTypeAssignment_410512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__PotencyAnnotation__ValueAssignment_110551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyWrite__ReceptorAssignment_010586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyWrite__PropertyAssignment_210621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__PropertyWrite__ExpressionAssignment_410652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DefineVariable__NameAssignment_010683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__DefineVariable__ExpressionAssignment_210714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ModelReference__ModelAssignment_010749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ModelReference__ClassNameAssignment_210784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionBranch_in_rule__IfExpr__ThenAssignment_110815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionBranch_in_rule__IfExpr__ElsifsAssignment_2_110846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBranchBranch_in_rule__IfExpr__ElseAssignment_3_110877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionBranch__ConditionAssignment_010908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__ConditionBranch__StatementsAssignment_110939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__BranchBranch__StatementsAssignment10970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment11005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_111040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_rule__ClosureDeclaration__FormalParametersAssignment_1_2_111071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__ClosureDeclaration__StatementsAssignment_211102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClosureParameter__NameAssignment11133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOp_in_rule__MethodCall__BinaryOpAssignment_1_0_111164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__RightAssignment_1_0_211195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MethodCall__MethodNameAssignment_1_1_211226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MethodCall__WithParametersAssignment_1_1_3_011262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_111301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__MethodCall__ParametersAssignment_1_1_3_2_111332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rule__MethodCall__ParametersAssignment_1_1_411363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchTraceExpression__TraceAssignment_211420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_rule__MatchTraceExpression__TraceExprAssignment_511455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TraceExprLanguage__TraceVarAssignment_011490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__TraceExprLanguage__ExprAssignment_211525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceExpression__TraceAssignment_211560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_511595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rule__PutTraceExpression__ParametersAssignment_6_111626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PutTraceParameter__TraceVarAssignment_011661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__PutTraceParameter__ValueAssignment_211696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NumLiteral__ValueAssignment11727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__FloatLiteral__ValueAssignment11758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanLiteral__ValueAssignment11820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Alternatives_1_in_synpred34_InternalExpressions7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__Group_1_1_3__0_in_synpred35_InternalExpressions7505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MethodCall__ParametersAssignment_1_1_4_in_synpred36_InternalExpressions7563 = new BitSet(new long[]{0x0000000000000002L});
    }


}