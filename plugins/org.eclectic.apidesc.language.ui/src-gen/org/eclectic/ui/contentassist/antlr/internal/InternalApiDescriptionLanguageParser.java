package org.eclectic.ui.contentassist.antlr.internal; 

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
import org.eclectic.services.ApiDescriptionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalApiDescriptionLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'api'", "'described'", "'by'", "'generic'", "'mapper'", "'metaclass'", "'to'", "'{'", "'}'", "'empty'", "'constructor'", "'('", "')'", "','", "'set'", "'='", "'attr'", "':'", "'get'", "'ref'", "'method'", "'iterator'", "'finished'", "'next'", "'observer'", "'update'", "'['", "']'", "'<'", "'>'", "'.'", "'*'", "'Array'", "'Collection'", "'void'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalApiDescriptionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApiDescriptionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApiDescriptionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g"; }


     
     	private ApiDescriptionLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ApiDescriptionLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleApiDescription"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:61:1: entryRuleApiDescription : ruleApiDescription EOF ;
    public final void entryRuleApiDescription() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:62:1: ( ruleApiDescription EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:63:1: ruleApiDescription EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleApiDescription_in_entryRuleApiDescription67);
            ruleApiDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleApiDescription74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleApiDescription"


    // $ANTLR start "ruleApiDescription"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:70:1: ruleApiDescription : ( ( rule__ApiDescription__Group__0 ) ) ;
    public final void ruleApiDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:74:2: ( ( ( rule__ApiDescription__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:75:1: ( ( rule__ApiDescription__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:75:1: ( ( rule__ApiDescription__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:76:1: ( rule__ApiDescription__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:77:1: ( rule__ApiDescription__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:77:2: rule__ApiDescription__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__0_in_ruleApiDescription100);
            rule__ApiDescription__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApiDescription"


    // $ANTLR start "entryRuleClassMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:89:1: entryRuleClassMapping : ruleClassMapping EOF ;
    public final void entryRuleClassMapping() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:90:1: ( ruleClassMapping EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:91:1: ruleClassMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassMapping_in_entryRuleClassMapping127);
            ruleClassMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassMappingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassMapping134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClassMapping"


    // $ANTLR start "ruleClassMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:98:1: ruleClassMapping : ( ruleSimpleClassMapping ) ;
    public final void ruleClassMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:102:2: ( ( ruleSimpleClassMapping ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:103:1: ( ruleSimpleClassMapping )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:103:1: ( ruleSimpleClassMapping )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:104:1: ruleSimpleClassMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassMappingAccess().getSimpleClassMappingParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleClassMapping_in_ruleClassMapping160);
            ruleSimpleClassMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassMappingAccess().getSimpleClassMappingParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassMapping"


    // $ANTLR start "entryRuleSimpleClassMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:117:1: entryRuleSimpleClassMapping : ruleSimpleClassMapping EOF ;
    public final void entryRuleSimpleClassMapping() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:118:1: ( ruleSimpleClassMapping EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:119:1: ruleSimpleClassMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleClassMapping_in_entryRuleSimpleClassMapping186);
            ruleSimpleClassMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleClassMapping193); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleClassMapping"


    // $ANTLR start "ruleSimpleClassMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:126:1: ruleSimpleClassMapping : ( ( rule__SimpleClassMapping__Group__0 ) ) ;
    public final void ruleSimpleClassMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:130:2: ( ( ( rule__SimpleClassMapping__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:131:1: ( ( rule__SimpleClassMapping__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:131:1: ( ( rule__SimpleClassMapping__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:132:1: ( rule__SimpleClassMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:133:1: ( rule__SimpleClassMapping__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:133:2: rule__SimpleClassMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__0_in_ruleSimpleClassMapping219);
            rule__SimpleClassMapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleClassMapping"


    // $ANTLR start "entryRuleCreationMechanism"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:145:1: entryRuleCreationMechanism : ruleCreationMechanism EOF ;
    public final void entryRuleCreationMechanism() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:146:1: ( ruleCreationMechanism EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:147:1: ruleCreationMechanism EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCreationMechanismRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCreationMechanism_in_entryRuleCreationMechanism246);
            ruleCreationMechanism();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCreationMechanismRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCreationMechanism253); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCreationMechanism"


    // $ANTLR start "ruleCreationMechanism"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:154:1: ruleCreationMechanism : ( ( rule__CreationMechanism__Alternatives ) ) ;
    public final void ruleCreationMechanism() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:158:2: ( ( ( rule__CreationMechanism__Alternatives ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:159:1: ( ( rule__CreationMechanism__Alternatives ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:159:1: ( ( rule__CreationMechanism__Alternatives ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:160:1: ( rule__CreationMechanism__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCreationMechanismAccess().getAlternatives()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:161:1: ( rule__CreationMechanism__Alternatives )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:161:2: rule__CreationMechanism__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CreationMechanism__Alternatives_in_ruleCreationMechanism279);
            rule__CreationMechanism__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCreationMechanismAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreationMechanism"


    // $ANTLR start "entryRuleEmptyConstructor"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:173:1: entryRuleEmptyConstructor : ruleEmptyConstructor EOF ;
    public final void entryRuleEmptyConstructor() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:174:1: ( ruleEmptyConstructor EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:175:1: ruleEmptyConstructor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmptyConstructor_in_entryRuleEmptyConstructor306);
            ruleEmptyConstructor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmptyConstructor313); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmptyConstructor"


    // $ANTLR start "ruleEmptyConstructor"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:182:1: ruleEmptyConstructor : ( ( rule__EmptyConstructor__Group__0 ) ) ;
    public final void ruleEmptyConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:186:2: ( ( ( rule__EmptyConstructor__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:187:1: ( ( rule__EmptyConstructor__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:187:1: ( ( rule__EmptyConstructor__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:188:1: ( rule__EmptyConstructor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:189:1: ( rule__EmptyConstructor__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:189:2: rule__EmptyConstructor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group__0_in_ruleEmptyConstructor339);
            rule__EmptyConstructor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyConstructor"


    // $ANTLR start "entryRuleNonEmptyConstructor"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:201:1: entryRuleNonEmptyConstructor : ruleNonEmptyConstructor EOF ;
    public final void entryRuleNonEmptyConstructor() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:202:1: ( ruleNonEmptyConstructor EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:203:1: ruleNonEmptyConstructor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonEmptyConstructor_in_entryRuleNonEmptyConstructor366);
            ruleNonEmptyConstructor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonEmptyConstructor373); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNonEmptyConstructor"


    // $ANTLR start "ruleNonEmptyConstructor"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:210:1: ruleNonEmptyConstructor : ( ( rule__NonEmptyConstructor__Group__0 ) ) ;
    public final void ruleNonEmptyConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:214:2: ( ( ( rule__NonEmptyConstructor__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:215:1: ( ( rule__NonEmptyConstructor__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:215:1: ( ( rule__NonEmptyConstructor__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:216:1: ( rule__NonEmptyConstructor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:217:1: ( rule__NonEmptyConstructor__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:217:2: rule__NonEmptyConstructor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__0_in_ruleNonEmptyConstructor399);
            rule__NonEmptyConstructor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonEmptyConstructor"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:229:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:230:1: ( ruleStatement EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:231:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement426);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement433); if (state.failed) return ;

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
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:238:1: ruleStatement : ( ruleSetFeature ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:242:2: ( ( ruleSetFeature ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:243:1: ( ruleSetFeature )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:243:1: ( ruleSetFeature )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:244:1: ruleSetFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSetFeatureParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSetFeature_in_ruleStatement459);
            ruleSetFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSetFeatureParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleSetFeature"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:257:1: entryRuleSetFeature : ruleSetFeature EOF ;
    public final void entryRuleSetFeature() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:258:1: ( ruleSetFeature EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:259:1: ruleSetFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSetFeature_in_entryRuleSetFeature485);
            ruleSetFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetFeature492); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSetFeature"


    // $ANTLR start "ruleSetFeature"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:266:1: ruleSetFeature : ( ( rule__SetFeature__Group__0 ) ) ;
    public final void ruleSetFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:270:2: ( ( ( rule__SetFeature__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:271:1: ( ( rule__SetFeature__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:271:1: ( ( rule__SetFeature__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:272:1: ( rule__SetFeature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:273:1: ( rule__SetFeature__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:273:2: rule__SetFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Group__0_in_ruleSetFeature518);
            rule__SetFeature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetFeature"


    // $ANTLR start "entryRuleFeatureMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:285:1: entryRuleFeatureMapping : ruleFeatureMapping EOF ;
    public final void entryRuleFeatureMapping() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:286:1: ( ruleFeatureMapping EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:287:1: ruleFeatureMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping545);
            ruleFeatureMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMappingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureMapping552); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeatureMapping"


    // $ANTLR start "ruleFeatureMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:294:1: ruleFeatureMapping : ( ( rule__FeatureMapping__Alternatives ) ) ;
    public final void ruleFeatureMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:298:2: ( ( ( rule__FeatureMapping__Alternatives ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:299:1: ( ( rule__FeatureMapping__Alternatives ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:299:1: ( ( rule__FeatureMapping__Alternatives ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:300:1: ( rule__FeatureMapping__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMappingAccess().getAlternatives()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:301:1: ( rule__FeatureMapping__Alternatives )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:301:2: rule__FeatureMapping__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Alternatives_in_ruleFeatureMapping578);
            rule__FeatureMapping__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMappingAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureMapping"


    // $ANTLR start "entryRuleSimpleAttributeMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:313:1: entryRuleSimpleAttributeMapping : ruleSimpleAttributeMapping EOF ;
    public final void entryRuleSimpleAttributeMapping() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:314:1: ( ruleSimpleAttributeMapping EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:315:1: ruleSimpleAttributeMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAttributeMapping_in_entryRuleSimpleAttributeMapping605);
            ruleSimpleAttributeMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAttributeMapping612); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleAttributeMapping"


    // $ANTLR start "ruleSimpleAttributeMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:322:1: ruleSimpleAttributeMapping : ( ( rule__SimpleAttributeMapping__Group__0 ) ) ;
    public final void ruleSimpleAttributeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:326:2: ( ( ( rule__SimpleAttributeMapping__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:327:1: ( ( rule__SimpleAttributeMapping__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:327:1: ( ( rule__SimpleAttributeMapping__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:328:1: ( rule__SimpleAttributeMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:329:1: ( rule__SimpleAttributeMapping__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:329:2: rule__SimpleAttributeMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__0_in_ruleSimpleAttributeMapping638);
            rule__SimpleAttributeMapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleAttributeMapping"


    // $ANTLR start "entryRuleSimpleReferenceMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:341:1: entryRuleSimpleReferenceMapping : ruleSimpleReferenceMapping EOF ;
    public final void entryRuleSimpleReferenceMapping() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:342:1: ( ruleSimpleReferenceMapping EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:343:1: ruleSimpleReferenceMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleReferenceMapping_in_entryRuleSimpleReferenceMapping665);
            ruleSimpleReferenceMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleReferenceMapping672); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleReferenceMapping"


    // $ANTLR start "ruleSimpleReferenceMapping"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:350:1: ruleSimpleReferenceMapping : ( ( rule__SimpleReferenceMapping__Group__0 ) ) ;
    public final void ruleSimpleReferenceMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:354:2: ( ( ( rule__SimpleReferenceMapping__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:355:1: ( ( rule__SimpleReferenceMapping__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:355:1: ( ( rule__SimpleReferenceMapping__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:356:1: ( rule__SimpleReferenceMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:357:1: ( rule__SimpleReferenceMapping__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:357:2: rule__SimpleReferenceMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__0_in_ruleSimpleReferenceMapping698);
            rule__SimpleReferenceMapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleReferenceMapping"


    // $ANTLR start "entryRuleGetMechanism"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:369:1: entryRuleGetMechanism : ruleGetMechanism EOF ;
    public final void entryRuleGetMechanism() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:370:1: ( ruleGetMechanism EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:371:1: ruleGetMechanism EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetMechanismRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGetMechanism_in_entryRuleGetMechanism725);
            ruleGetMechanism();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetMechanismRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGetMechanism732); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGetMechanism"


    // $ANTLR start "ruleGetMechanism"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:378:1: ruleGetMechanism : ( ( rule__GetMechanism__Alternatives ) ) ;
    public final void ruleGetMechanism() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:382:2: ( ( ( rule__GetMechanism__Alternatives ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:383:1: ( ( rule__GetMechanism__Alternatives ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:383:1: ( ( rule__GetMechanism__Alternatives ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:384:1: ( rule__GetMechanism__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetMechanismAccess().getAlternatives()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:385:1: ( rule__GetMechanism__Alternatives )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:385:2: rule__GetMechanism__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GetMechanism__Alternatives_in_ruleGetMechanism758);
            rule__GetMechanism__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetMechanismAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetMechanism"


    // $ANTLR start "entryRuleSetMechanism"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:397:1: entryRuleSetMechanism : ruleSetMechanism EOF ;
    public final void entryRuleSetMechanism() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:398:1: ( ruleSetMechanism EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:399:1: ruleSetMechanism EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMechanismRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSetMechanism_in_entryRuleSetMechanism785);
            ruleSetMechanism();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMechanismRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetMechanism792); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSetMechanism"


    // $ANTLR start "ruleSetMechanism"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:406:1: ruleSetMechanism : ( ( rule__SetMechanism__Alternatives ) ) ;
    public final void ruleSetMechanism() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:410:2: ( ( ( rule__SetMechanism__Alternatives ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:411:1: ( ( rule__SetMechanism__Alternatives ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:411:1: ( ( rule__SetMechanism__Alternatives ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:412:1: ( rule__SetMechanism__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMechanismAccess().getAlternatives()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:413:1: ( rule__SetMechanism__Alternatives )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:413:2: rule__SetMechanism__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetMechanism__Alternatives_in_ruleSetMechanism818);
            rule__SetMechanism__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMechanismAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetMechanism"


    // $ANTLR start "entryRuleSimpleGet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:425:1: entryRuleSimpleGet : ruleSimpleGet EOF ;
    public final void entryRuleSimpleGet() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:426:1: ( ruleSimpleGet EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:427:1: ruleSimpleGet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleGetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleGet_in_entryRuleSimpleGet845);
            ruleSimpleGet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleGetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleGet852); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleGet"


    // $ANTLR start "ruleSimpleGet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:434:1: ruleSimpleGet : ( ( rule__SimpleGet__Group__0 ) ) ;
    public final void ruleSimpleGet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:438:2: ( ( ( rule__SimpleGet__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:439:1: ( ( rule__SimpleGet__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:439:1: ( ( rule__SimpleGet__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:440:1: ( rule__SimpleGet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleGetAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:441:1: ( rule__SimpleGet__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:441:2: rule__SimpleGet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleGet__Group__0_in_ruleSimpleGet878);
            rule__SimpleGet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleGetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleGet"


    // $ANTLR start "entryRuleSimpleSet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:453:1: entryRuleSimpleSet : ruleSimpleSet EOF ;
    public final void entryRuleSimpleSet() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:454:1: ( ruleSimpleSet EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:455:1: ruleSimpleSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleSet_in_entryRuleSimpleSet905);
            ruleSimpleSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleSet912); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleSet"


    // $ANTLR start "ruleSimpleSet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:462:1: ruleSimpleSet : ( ( rule__SimpleSet__Group__0 ) ) ;
    public final void ruleSimpleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:466:2: ( ( ( rule__SimpleSet__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:467:1: ( ( rule__SimpleSet__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:467:1: ( ( rule__SimpleSet__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:468:1: ( rule__SimpleSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSetAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:469:1: ( rule__SimpleSet__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:469:2: rule__SimpleSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleSet__Group__0_in_ruleSimpleSet938);
            rule__SimpleSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleSet"


    // $ANTLR start "entryRuleGenericGet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:481:1: entryRuleGenericGet : ruleGenericGet EOF ;
    public final void entryRuleGenericGet() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:482:1: ( ruleGenericGet EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:483:1: ruleGenericGet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericGetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGenericGet_in_entryRuleGenericGet965);
            ruleGenericGet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericGetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericGet972); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGenericGet"


    // $ANTLR start "ruleGenericGet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:490:1: ruleGenericGet : ( ( rule__GenericGet__Group__0 ) ) ;
    public final void ruleGenericGet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:494:2: ( ( ( rule__GenericGet__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:495:1: ( ( rule__GenericGet__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:495:1: ( ( rule__GenericGet__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:496:1: ( rule__GenericGet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericGetAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:497:1: ( rule__GenericGet__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:497:2: rule__GenericGet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericGet__Group__0_in_ruleGenericGet998);
            rule__GenericGet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericGetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericGet"


    // $ANTLR start "entryRuleGenericSet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:509:1: entryRuleGenericSet : ruleGenericSet EOF ;
    public final void entryRuleGenericSet() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:510:1: ( ruleGenericSet EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:511:1: ruleGenericSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGenericSet_in_entryRuleGenericSet1025);
            ruleGenericSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericSet1032); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGenericSet"


    // $ANTLR start "ruleGenericSet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:518:1: ruleGenericSet : ( ( rule__GenericSet__Group__0 ) ) ;
    public final void ruleGenericSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:522:2: ( ( ( rule__GenericSet__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:523:1: ( ( rule__GenericSet__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:523:1: ( ( rule__GenericSet__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:524:1: ( rule__GenericSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericSetAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:525:1: ( rule__GenericSet__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:525:2: rule__GenericSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericSet__Group__0_in_ruleGenericSet1058);
            rule__GenericSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericSet"


    // $ANTLR start "entryRuleIteratorGet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:537:1: entryRuleIteratorGet : ruleIteratorGet EOF ;
    public final void entryRuleIteratorGet() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:538:1: ( ruleIteratorGet EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:539:1: ruleIteratorGet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIteratorGet_in_entryRuleIteratorGet1085);
            ruleIteratorGet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIteratorGet1092); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIteratorGet"


    // $ANTLR start "ruleIteratorGet"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:546:1: ruleIteratorGet : ( ( rule__IteratorGet__Group__0 ) ) ;
    public final void ruleIteratorGet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:550:2: ( ( ( rule__IteratorGet__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:551:1: ( ( rule__IteratorGet__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:551:1: ( ( rule__IteratorGet__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:552:1: ( rule__IteratorGet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:553:1: ( rule__IteratorGet__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:553:2: rule__IteratorGet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__Group__0_in_ruleIteratorGet1118);
            rule__IteratorGet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIteratorGet"


    // $ANTLR start "entryRuleDeclaredElement"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:565:1: entryRuleDeclaredElement : ruleDeclaredElement EOF ;
    public final void entryRuleDeclaredElement() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:566:1: ( ruleDeclaredElement EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:567:1: ruleDeclaredElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclaredElement_in_entryRuleDeclaredElement1145);
            ruleDeclaredElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaredElement1152); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaredElement"


    // $ANTLR start "ruleDeclaredElement"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:574:1: ruleDeclaredElement : ( ( rule__DeclaredElement__Alternatives ) ) ;
    public final void ruleDeclaredElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:578:2: ( ( ( rule__DeclaredElement__Alternatives ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:579:1: ( ( rule__DeclaredElement__Alternatives ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:579:1: ( ( rule__DeclaredElement__Alternatives ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:580:1: ( rule__DeclaredElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredElementAccess().getAlternatives()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:581:1: ( rule__DeclaredElement__Alternatives )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:581:2: rule__DeclaredElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredElement__Alternatives_in_ruleDeclaredElement1178);
            rule__DeclaredElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredElement"


    // $ANTLR start "entryRuleIteratorDescription"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:593:1: entryRuleIteratorDescription : ruleIteratorDescription EOF ;
    public final void entryRuleIteratorDescription() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:594:1: ( ruleIteratorDescription EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:595:1: ruleIteratorDescription EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIteratorDescription_in_entryRuleIteratorDescription1205);
            ruleIteratorDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIteratorDescription1212); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIteratorDescription"


    // $ANTLR start "ruleIteratorDescription"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:602:1: ruleIteratorDescription : ( ( rule__IteratorDescription__Group__0 ) ) ;
    public final void ruleIteratorDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:606:2: ( ( ( rule__IteratorDescription__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:607:1: ( ( rule__IteratorDescription__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:607:1: ( ( rule__IteratorDescription__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:608:1: ( rule__IteratorDescription__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:609:1: ( rule__IteratorDescription__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:609:2: rule__IteratorDescription__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__0_in_ruleIteratorDescription1238);
            rule__IteratorDescription__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIteratorDescription"


    // $ANTLR start "entryRuleObserverDescription"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:621:1: entryRuleObserverDescription : ruleObserverDescription EOF ;
    public final void entryRuleObserverDescription() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:622:1: ( ruleObserverDescription EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:623:1: ruleObserverDescription EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleObserverDescription_in_entryRuleObserverDescription1265);
            ruleObserverDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObserverDescription1272); if (state.failed) return ;

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
    // $ANTLR end "entryRuleObserverDescription"


    // $ANTLR start "ruleObserverDescription"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:630:1: ruleObserverDescription : ( ( rule__ObserverDescription__Group__0 ) ) ;
    public final void ruleObserverDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:634:2: ( ( ( rule__ObserverDescription__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:635:1: ( ( rule__ObserverDescription__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:635:1: ( ( rule__ObserverDescription__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:636:1: ( rule__ObserverDescription__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:637:1: ( rule__ObserverDescription__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:637:2: rule__ObserverDescription__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__0_in_ruleObserverDescription1298);
            rule__ObserverDescription__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObserverDescription"


    // $ANTLR start "entryRuleUpdateMethod"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:649:1: entryRuleUpdateMethod : ruleUpdateMethod EOF ;
    public final void entryRuleUpdateMethod() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:650:1: ( ruleUpdateMethod EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:651:1: ruleUpdateMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUpdateMethod_in_entryRuleUpdateMethod1325);
            ruleUpdateMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUpdateMethod1332); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUpdateMethod"


    // $ANTLR start "ruleUpdateMethod"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:658:1: ruleUpdateMethod : ( ( rule__UpdateMethod__Group__0 ) ) ;
    public final void ruleUpdateMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:662:2: ( ( ( rule__UpdateMethod__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:663:1: ( ( rule__UpdateMethod__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:663:1: ( ( rule__UpdateMethod__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:664:1: ( rule__UpdateMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:665:1: ( rule__UpdateMethod__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:665:2: rule__UpdateMethod__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__0_in_ruleUpdateMethod1358);
            rule__UpdateMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdateMethod"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:677:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:678:1: ( ruleEString EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:679:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1385);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1392); if (state.failed) return ;

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
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:686:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:690:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:691:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:691:1: ( ( rule__EString__Alternatives ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:692:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:693:1: ( rule__EString__Alternatives )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:693:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1418);
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


    // $ANTLR start "entryRuleMethod"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:705:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:706:1: ( ruleMethod EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:707:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_entryRuleMethod1445);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethod1452); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:714:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:718:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:719:1: ( ( rule__Method__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:719:1: ( ( rule__Method__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:720:1: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:721:1: ( rule__Method__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:721:2: rule__Method__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__0_in_ruleMethod1478);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:733:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:734:1: ( ruleEBoolean EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:735:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1505);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1512); if (state.failed) return ;

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
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:742:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:746:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:747:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:747:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:748:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:749:1: ( rule__EBoolean__Alternatives )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:749:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1538);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:761:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:762:1: ( ruleQualifiedName EOF )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:763:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1565);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName1572); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:770:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:774:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:775:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:775:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:776:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:777:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:777:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1598);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__CreationMechanism__Alternatives"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:793:1: rule__CreationMechanism__Alternatives : ( ( ruleEmptyConstructor ) | ( ruleNonEmptyConstructor ) );
    public final void rule__CreationMechanism__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:797:1: ( ( ruleEmptyConstructor ) | ( ruleNonEmptyConstructor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
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
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:798:1: ( ruleEmptyConstructor )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:798:1: ( ruleEmptyConstructor )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:799:1: ruleEmptyConstructor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCreationMechanismAccess().getEmptyConstructorParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmptyConstructor_in_rule__CreationMechanism__Alternatives1638);
                    ruleEmptyConstructor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCreationMechanismAccess().getEmptyConstructorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:804:6: ( ruleNonEmptyConstructor )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:804:6: ( ruleNonEmptyConstructor )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:805:1: ruleNonEmptyConstructor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCreationMechanismAccess().getNonEmptyConstructorParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNonEmptyConstructor_in_rule__CreationMechanism__Alternatives1655);
                    ruleNonEmptyConstructor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCreationMechanismAccess().getNonEmptyConstructorParserRuleCall_1()); 
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
    // $ANTLR end "rule__CreationMechanism__Alternatives"


    // $ANTLR start "rule__SetFeature__Alternatives_3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:815:1: rule__SetFeature__Alternatives_3 : ( ( ( rule__SetFeature__IntValueAssignment_3_0 ) ) | ( ( rule__SetFeature__StrValueAssignment_3_1 ) ) | ( ( rule__SetFeature__BoolValueAssignment_3_2 ) ) );
    public final void rule__SetFeature__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:819:1: ( ( ( rule__SetFeature__IntValueAssignment_3_0 ) ) | ( ( rule__SetFeature__StrValueAssignment_3_1 ) ) | ( ( rule__SetFeature__BoolValueAssignment_3_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case 11:
            case 12:
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
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:820:1: ( ( rule__SetFeature__IntValueAssignment_3_0 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:820:1: ( ( rule__SetFeature__IntValueAssignment_3_0 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:821:1: ( rule__SetFeature__IntValueAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetFeatureAccess().getIntValueAssignment_3_0()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:822:1: ( rule__SetFeature__IntValueAssignment_3_0 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:822:2: rule__SetFeature__IntValueAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetFeature__IntValueAssignment_3_0_in_rule__SetFeature__Alternatives_31687);
                    rule__SetFeature__IntValueAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetFeatureAccess().getIntValueAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:826:6: ( ( rule__SetFeature__StrValueAssignment_3_1 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:826:6: ( ( rule__SetFeature__StrValueAssignment_3_1 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:827:1: ( rule__SetFeature__StrValueAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetFeatureAccess().getStrValueAssignment_3_1()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:828:1: ( rule__SetFeature__StrValueAssignment_3_1 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:828:2: rule__SetFeature__StrValueAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetFeature__StrValueAssignment_3_1_in_rule__SetFeature__Alternatives_31705);
                    rule__SetFeature__StrValueAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetFeatureAccess().getStrValueAssignment_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:832:6: ( ( rule__SetFeature__BoolValueAssignment_3_2 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:832:6: ( ( rule__SetFeature__BoolValueAssignment_3_2 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:833:1: ( rule__SetFeature__BoolValueAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetFeatureAccess().getBoolValueAssignment_3_2()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:834:1: ( rule__SetFeature__BoolValueAssignment_3_2 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:834:2: rule__SetFeature__BoolValueAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetFeature__BoolValueAssignment_3_2_in_rule__SetFeature__Alternatives_31723);
                    rule__SetFeature__BoolValueAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetFeatureAccess().getBoolValueAssignment_3_2()); 
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
    // $ANTLR end "rule__SetFeature__Alternatives_3"


    // $ANTLR start "rule__FeatureMapping__Alternatives"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:843:1: rule__FeatureMapping__Alternatives : ( ( ruleSimpleAttributeMapping ) | ( ruleSimpleReferenceMapping ) );
    public final void rule__FeatureMapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:847:1: ( ( ruleSimpleAttributeMapping ) | ( ruleSimpleReferenceMapping ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
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
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:848:1: ( ruleSimpleAttributeMapping )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:848:1: ( ruleSimpleAttributeMapping )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:849:1: ruleSimpleAttributeMapping
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureMappingAccess().getSimpleAttributeMappingParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleAttributeMapping_in_rule__FeatureMapping__Alternatives1756);
                    ruleSimpleAttributeMapping();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureMappingAccess().getSimpleAttributeMappingParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:854:6: ( ruleSimpleReferenceMapping )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:854:6: ( ruleSimpleReferenceMapping )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:855:1: ruleSimpleReferenceMapping
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureMappingAccess().getSimpleReferenceMappingParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleReferenceMapping_in_rule__FeatureMapping__Alternatives1773);
                    ruleSimpleReferenceMapping();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureMappingAccess().getSimpleReferenceMappingParserRuleCall_1()); 
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
    // $ANTLR end "rule__FeatureMapping__Alternatives"


    // $ANTLR start "rule__GetMechanism__Alternatives"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:865:1: rule__GetMechanism__Alternatives : ( ( ruleSimpleGet ) | ( ruleGenericGet ) | ( ruleIteratorGet ) );
    public final void rule__GetMechanism__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:869:1: ( ( ruleSimpleGet ) | ( ruleGenericGet ) | ( ruleIteratorGet ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 34:
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
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:870:1: ( ruleSimpleGet )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:870:1: ( ruleSimpleGet )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:871:1: ruleSimpleGet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGetMechanismAccess().getSimpleGetParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleGet_in_rule__GetMechanism__Alternatives1805);
                    ruleSimpleGet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGetMechanismAccess().getSimpleGetParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:876:6: ( ruleGenericGet )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:876:6: ( ruleGenericGet )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:877:1: ruleGenericGet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGetMechanismAccess().getGenericGetParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGenericGet_in_rule__GetMechanism__Alternatives1822);
                    ruleGenericGet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGetMechanismAccess().getGenericGetParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:882:6: ( ruleIteratorGet )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:882:6: ( ruleIteratorGet )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:883:1: ruleIteratorGet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGetMechanismAccess().getIteratorGetParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIteratorGet_in_rule__GetMechanism__Alternatives1839);
                    ruleIteratorGet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGetMechanismAccess().getIteratorGetParserRuleCall_2()); 
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
    // $ANTLR end "rule__GetMechanism__Alternatives"


    // $ANTLR start "rule__SetMechanism__Alternatives"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:893:1: rule__SetMechanism__Alternatives : ( ( ruleSimpleSet ) | ( ruleGenericSet ) );
    public final void rule__SetMechanism__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:897:1: ( ( ruleSimpleSet ) | ( ruleGenericSet ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:898:1: ( ruleSimpleSet )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:898:1: ( ruleSimpleSet )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:899:1: ruleSimpleSet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetMechanismAccess().getSimpleSetParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleSet_in_rule__SetMechanism__Alternatives1871);
                    ruleSimpleSet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetMechanismAccess().getSimpleSetParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:904:6: ( ruleGenericSet )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:904:6: ( ruleGenericSet )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:905:1: ruleGenericSet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetMechanismAccess().getGenericSetParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGenericSet_in_rule__SetMechanism__Alternatives1888);
                    ruleGenericSet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetMechanismAccess().getGenericSetParserRuleCall_1()); 
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
    // $ANTLR end "rule__SetMechanism__Alternatives"


    // $ANTLR start "rule__DeclaredElement__Alternatives"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:915:1: rule__DeclaredElement__Alternatives : ( ( ruleIteratorDescription ) | ( ruleObserverDescription ) );
    public final void rule__DeclaredElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:919:1: ( ( ruleIteratorDescription ) | ( ruleObserverDescription ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            else if ( (LA6_0==37) ) {
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
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:920:1: ( ruleIteratorDescription )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:920:1: ( ruleIteratorDescription )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:921:1: ruleIteratorDescription
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaredElementAccess().getIteratorDescriptionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIteratorDescription_in_rule__DeclaredElement__Alternatives1920);
                    ruleIteratorDescription();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclaredElementAccess().getIteratorDescriptionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:926:6: ( ruleObserverDescription )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:926:6: ( ruleObserverDescription )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:927:1: ruleObserverDescription
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaredElementAccess().getObserverDescriptionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleObserverDescription_in_rule__DeclaredElement__Alternatives1937);
                    ruleObserverDescription();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclaredElementAccess().getObserverDescriptionParserRuleCall_1()); 
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
    // $ANTLR end "rule__DeclaredElement__Alternatives"


    // $ANTLR start "rule__UpdateMethod__Alternatives_7"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:937:1: rule__UpdateMethod__Alternatives_7 : ( ( ( rule__UpdateMethod__Group_7_0__0 ) ) | ( ( rule__UpdateMethod__Group_7_1__0 ) ) | ( ( rule__UpdateMethod__ReturnTypeAssignment_7_2 ) ) | ( ( rule__UpdateMethod__ReturnVoidAssignment_7_3 ) ) );
    public final void rule__UpdateMethod__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:941:1: ( ( ( rule__UpdateMethod__Group_7_0__0 ) ) | ( ( rule__UpdateMethod__Group_7_1__0 ) ) | ( ( rule__UpdateMethod__ReturnTypeAssignment_7_2 ) ) | ( ( rule__UpdateMethod__ReturnVoidAssignment_7_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            case 47:
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
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:942:1: ( ( rule__UpdateMethod__Group_7_0__0 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:942:1: ( ( rule__UpdateMethod__Group_7_0__0 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:943:1: ( rule__UpdateMethod__Group_7_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUpdateMethodAccess().getGroup_7_0()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:944:1: ( rule__UpdateMethod__Group_7_0__0 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:944:2: rule__UpdateMethod__Group_7_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_0__0_in_rule__UpdateMethod__Alternatives_71969);
                    rule__UpdateMethod__Group_7_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUpdateMethodAccess().getGroup_7_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:948:6: ( ( rule__UpdateMethod__Group_7_1__0 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:948:6: ( ( rule__UpdateMethod__Group_7_1__0 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:949:1: ( rule__UpdateMethod__Group_7_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUpdateMethodAccess().getGroup_7_1()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:950:1: ( rule__UpdateMethod__Group_7_1__0 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:950:2: rule__UpdateMethod__Group_7_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_1__0_in_rule__UpdateMethod__Alternatives_71987);
                    rule__UpdateMethod__Group_7_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUpdateMethodAccess().getGroup_7_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:954:6: ( ( rule__UpdateMethod__ReturnTypeAssignment_7_2 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:954:6: ( ( rule__UpdateMethod__ReturnTypeAssignment_7_2 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:955:1: ( rule__UpdateMethod__ReturnTypeAssignment_7_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUpdateMethodAccess().getReturnTypeAssignment_7_2()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:956:1: ( rule__UpdateMethod__ReturnTypeAssignment_7_2 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:956:2: rule__UpdateMethod__ReturnTypeAssignment_7_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__ReturnTypeAssignment_7_2_in_rule__UpdateMethod__Alternatives_72005);
                    rule__UpdateMethod__ReturnTypeAssignment_7_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUpdateMethodAccess().getReturnTypeAssignment_7_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:960:6: ( ( rule__UpdateMethod__ReturnVoidAssignment_7_3 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:960:6: ( ( rule__UpdateMethod__ReturnVoidAssignment_7_3 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:961:1: ( rule__UpdateMethod__ReturnVoidAssignment_7_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUpdateMethodAccess().getReturnVoidAssignment_7_3()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:962:1: ( rule__UpdateMethod__ReturnVoidAssignment_7_3 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:962:2: rule__UpdateMethod__ReturnVoidAssignment_7_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__ReturnVoidAssignment_7_3_in_rule__UpdateMethod__Alternatives_72023);
                    rule__UpdateMethod__ReturnVoidAssignment_7_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUpdateMethodAccess().getReturnVoidAssignment_7_3()); 
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
    // $ANTLR end "rule__UpdateMethod__Alternatives_7"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:971:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:975:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
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
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:976:1: ( RULE_STRING )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:976:1: ( RULE_STRING )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:977:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2056); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:982:6: ( RULE_ID )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:982:6: ( RULE_ID )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:983:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2073); if (state.failed) return ;
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


    // $ANTLR start "rule__Method__Alternatives_5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:993:1: rule__Method__Alternatives_5 : ( ( ( rule__Method__Group_5_0__0 ) ) | ( ( rule__Method__Group_5_1__0 ) ) | ( ( rule__Method__ReturnTypeAssignment_5_2 ) ) | ( ( rule__Method__ReturnVoidAssignment_5_3 ) ) );
    public final void rule__Method__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:997:1: ( ( ( rule__Method__Group_5_0__0 ) ) | ( ( rule__Method__Group_5_1__0 ) ) | ( ( rule__Method__ReturnTypeAssignment_5_2 ) ) | ( ( rule__Method__ReturnVoidAssignment_5_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt9=1;
                }
                break;
            case 46:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            case 47:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:998:1: ( ( rule__Method__Group_5_0__0 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:998:1: ( ( rule__Method__Group_5_0__0 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:999:1: ( rule__Method__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getGroup_5_0()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1000:1: ( rule__Method__Group_5_0__0 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1000:2: rule__Method__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_0__0_in_rule__Method__Alternatives_52105);
                    rule__Method__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getGroup_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1004:6: ( ( rule__Method__Group_5_1__0 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1004:6: ( ( rule__Method__Group_5_1__0 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1005:1: ( rule__Method__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getGroup_5_1()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1006:1: ( rule__Method__Group_5_1__0 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1006:2: rule__Method__Group_5_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_1__0_in_rule__Method__Alternatives_52123);
                    rule__Method__Group_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getGroup_5_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1010:6: ( ( rule__Method__ReturnTypeAssignment_5_2 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1010:6: ( ( rule__Method__ReturnTypeAssignment_5_2 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1011:1: ( rule__Method__ReturnTypeAssignment_5_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_2()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1012:1: ( rule__Method__ReturnTypeAssignment_5_2 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1012:2: rule__Method__ReturnTypeAssignment_5_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Method__ReturnTypeAssignment_5_2_in_rule__Method__Alternatives_52141);
                    rule__Method__ReturnTypeAssignment_5_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1016:6: ( ( rule__Method__ReturnVoidAssignment_5_3 ) )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1016:6: ( ( rule__Method__ReturnVoidAssignment_5_3 ) )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1017:1: ( rule__Method__ReturnVoidAssignment_5_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getReturnVoidAssignment_5_3()); 
                    }
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1018:1: ( rule__Method__ReturnVoidAssignment_5_3 )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1018:2: rule__Method__ReturnVoidAssignment_5_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Method__ReturnVoidAssignment_5_3_in_rule__Method__Alternatives_52159);
                    rule__Method__ReturnVoidAssignment_5_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getReturnVoidAssignment_5_3()); 
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
    // $ANTLR end "rule__Method__Alternatives_5"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1027:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1031:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
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
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1032:1: ( 'true' )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1032:1: ( 'true' )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1033:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives2193); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1040:6: ( 'false' )
                    {
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1040:6: ( 'false' )
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1041:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives2213); if (state.failed) return ;
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


    // $ANTLR start "rule__ApiDescription__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1057:1: rule__ApiDescription__Group__0 : rule__ApiDescription__Group__0__Impl rule__ApiDescription__Group__1 ;
    public final void rule__ApiDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1061:1: ( rule__ApiDescription__Group__0__Impl rule__ApiDescription__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1062:2: rule__ApiDescription__Group__0__Impl rule__ApiDescription__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__0__Impl_in_rule__ApiDescription__Group__02247);
            rule__ApiDescription__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__1_in_rule__ApiDescription__Group__02250);
            rule__ApiDescription__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__0"


    // $ANTLR start "rule__ApiDescription__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1069:1: rule__ApiDescription__Group__0__Impl : ( 'api' ) ;
    public final void rule__ApiDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1073:1: ( ( 'api' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1074:1: ( 'api' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1074:1: ( 'api' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1075:1: 'api'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getApiKeyword_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ApiDescription__Group__0__Impl2278); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getApiKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__0__Impl"


    // $ANTLR start "rule__ApiDescription__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1088:1: rule__ApiDescription__Group__1 : rule__ApiDescription__Group__1__Impl rule__ApiDescription__Group__2 ;
    public final void rule__ApiDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1092:1: ( rule__ApiDescription__Group__1__Impl rule__ApiDescription__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1093:2: rule__ApiDescription__Group__1__Impl rule__ApiDescription__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__1__Impl_in_rule__ApiDescription__Group__12309);
            rule__ApiDescription__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__2_in_rule__ApiDescription__Group__12312);
            rule__ApiDescription__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__1"


    // $ANTLR start "rule__ApiDescription__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1100:1: rule__ApiDescription__Group__1__Impl : ( ( rule__ApiDescription__ApiNameAssignment_1 ) ) ;
    public final void rule__ApiDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1104:1: ( ( ( rule__ApiDescription__ApiNameAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1105:1: ( ( rule__ApiDescription__ApiNameAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1105:1: ( ( rule__ApiDescription__ApiNameAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1106:1: ( rule__ApiDescription__ApiNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getApiNameAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1107:1: ( rule__ApiDescription__ApiNameAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1107:2: rule__ApiDescription__ApiNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__ApiNameAssignment_1_in_rule__ApiDescription__Group__1__Impl2339);
            rule__ApiDescription__ApiNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getApiNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__1__Impl"


    // $ANTLR start "rule__ApiDescription__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1117:1: rule__ApiDescription__Group__2 : rule__ApiDescription__Group__2__Impl rule__ApiDescription__Group__3 ;
    public final void rule__ApiDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1121:1: ( rule__ApiDescription__Group__2__Impl rule__ApiDescription__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1122:2: rule__ApiDescription__Group__2__Impl rule__ApiDescription__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__2__Impl_in_rule__ApiDescription__Group__22369);
            rule__ApiDescription__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__3_in_rule__ApiDescription__Group__22372);
            rule__ApiDescription__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__2"


    // $ANTLR start "rule__ApiDescription__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1129:1: rule__ApiDescription__Group__2__Impl : ( 'described' ) ;
    public final void rule__ApiDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1133:1: ( ( 'described' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1134:1: ( 'described' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1134:1: ( 'described' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1135:1: 'described'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getDescribedKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ApiDescription__Group__2__Impl2400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getDescribedKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__2__Impl"


    // $ANTLR start "rule__ApiDescription__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1148:1: rule__ApiDescription__Group__3 : rule__ApiDescription__Group__3__Impl rule__ApiDescription__Group__4 ;
    public final void rule__ApiDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1152:1: ( rule__ApiDescription__Group__3__Impl rule__ApiDescription__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1153:2: rule__ApiDescription__Group__3__Impl rule__ApiDescription__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__3__Impl_in_rule__ApiDescription__Group__32431);
            rule__ApiDescription__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__4_in_rule__ApiDescription__Group__32434);
            rule__ApiDescription__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__3"


    // $ANTLR start "rule__ApiDescription__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1160:1: rule__ApiDescription__Group__3__Impl : ( 'by' ) ;
    public final void rule__ApiDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1164:1: ( ( 'by' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1165:1: ( 'by' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1165:1: ( 'by' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1166:1: 'by'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getByKeyword_3()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__ApiDescription__Group__3__Impl2462); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getByKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__3__Impl"


    // $ANTLR start "rule__ApiDescription__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1179:1: rule__ApiDescription__Group__4 : rule__ApiDescription__Group__4__Impl rule__ApiDescription__Group__5 ;
    public final void rule__ApiDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1183:1: ( rule__ApiDescription__Group__4__Impl rule__ApiDescription__Group__5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1184:2: rule__ApiDescription__Group__4__Impl rule__ApiDescription__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__4__Impl_in_rule__ApiDescription__Group__42493);
            rule__ApiDescription__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__5_in_rule__ApiDescription__Group__42496);
            rule__ApiDescription__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__4"


    // $ANTLR start "rule__ApiDescription__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1191:1: rule__ApiDescription__Group__4__Impl : ( ( rule__ApiDescription__MetamodelNameAssignment_4 ) ) ;
    public final void rule__ApiDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1195:1: ( ( ( rule__ApiDescription__MetamodelNameAssignment_4 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1196:1: ( ( rule__ApiDescription__MetamodelNameAssignment_4 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1196:1: ( ( rule__ApiDescription__MetamodelNameAssignment_4 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1197:1: ( rule__ApiDescription__MetamodelNameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getMetamodelNameAssignment_4()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1198:1: ( rule__ApiDescription__MetamodelNameAssignment_4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1198:2: rule__ApiDescription__MetamodelNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__MetamodelNameAssignment_4_in_rule__ApiDescription__Group__4__Impl2523);
            rule__ApiDescription__MetamodelNameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getMetamodelNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__4__Impl"


    // $ANTLR start "rule__ApiDescription__Group__5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1208:1: rule__ApiDescription__Group__5 : rule__ApiDescription__Group__5__Impl rule__ApiDescription__Group__6 ;
    public final void rule__ApiDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1212:1: ( rule__ApiDescription__Group__5__Impl rule__ApiDescription__Group__6 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1213:2: rule__ApiDescription__Group__5__Impl rule__ApiDescription__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__5__Impl_in_rule__ApiDescription__Group__52553);
            rule__ApiDescription__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__6_in_rule__ApiDescription__Group__52556);
            rule__ApiDescription__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__5"


    // $ANTLR start "rule__ApiDescription__Group__5__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1220:1: rule__ApiDescription__Group__5__Impl : ( ( rule__ApiDescription__Group_5__0 )? ) ;
    public final void rule__ApiDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1224:1: ( ( ( rule__ApiDescription__Group_5__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1225:1: ( ( rule__ApiDescription__Group_5__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1225:1: ( ( rule__ApiDescription__Group_5__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1226:1: ( rule__ApiDescription__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getGroup_5()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1227:1: ( rule__ApiDescription__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1227:2: rule__ApiDescription__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group_5__0_in_rule__ApiDescription__Group__5__Impl2583);
                    rule__ApiDescription__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__5__Impl"


    // $ANTLR start "rule__ApiDescription__Group__6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1237:1: rule__ApiDescription__Group__6 : rule__ApiDescription__Group__6__Impl rule__ApiDescription__Group__7 ;
    public final void rule__ApiDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1241:1: ( rule__ApiDescription__Group__6__Impl rule__ApiDescription__Group__7 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1242:2: rule__ApiDescription__Group__6__Impl rule__ApiDescription__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__6__Impl_in_rule__ApiDescription__Group__62614);
            rule__ApiDescription__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__7_in_rule__ApiDescription__Group__62617);
            rule__ApiDescription__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__6"


    // $ANTLR start "rule__ApiDescription__Group__6__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1249:1: rule__ApiDescription__Group__6__Impl : ( ( rule__ApiDescription__DeclaredElementsAssignment_6 )* ) ;
    public final void rule__ApiDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1253:1: ( ( ( rule__ApiDescription__DeclaredElementsAssignment_6 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1254:1: ( ( rule__ApiDescription__DeclaredElementsAssignment_6 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1254:1: ( ( rule__ApiDescription__DeclaredElementsAssignment_6 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1255:1: ( rule__ApiDescription__DeclaredElementsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getDeclaredElementsAssignment_6()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1256:1: ( rule__ApiDescription__DeclaredElementsAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34||LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1256:2: rule__ApiDescription__DeclaredElementsAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__DeclaredElementsAssignment_6_in_rule__ApiDescription__Group__6__Impl2644);
            	    rule__ApiDescription__DeclaredElementsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getDeclaredElementsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__6__Impl"


    // $ANTLR start "rule__ApiDescription__Group__7"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1266:1: rule__ApiDescription__Group__7 : rule__ApiDescription__Group__7__Impl ;
    public final void rule__ApiDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1270:1: ( rule__ApiDescription__Group__7__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1271:2: rule__ApiDescription__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group__7__Impl_in_rule__ApiDescription__Group__72675);
            rule__ApiDescription__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group__7"


    // $ANTLR start "rule__ApiDescription__Group__7__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1277:1: rule__ApiDescription__Group__7__Impl : ( ( ( rule__ApiDescription__ClassMappingsAssignment_7 ) ) ( ( rule__ApiDescription__ClassMappingsAssignment_7 )* ) ) ;
    public final void rule__ApiDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1281:1: ( ( ( ( rule__ApiDescription__ClassMappingsAssignment_7 ) ) ( ( rule__ApiDescription__ClassMappingsAssignment_7 )* ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1282:1: ( ( ( rule__ApiDescription__ClassMappingsAssignment_7 ) ) ( ( rule__ApiDescription__ClassMappingsAssignment_7 )* ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1282:1: ( ( ( rule__ApiDescription__ClassMappingsAssignment_7 ) ) ( ( rule__ApiDescription__ClassMappingsAssignment_7 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1283:1: ( ( rule__ApiDescription__ClassMappingsAssignment_7 ) ) ( ( rule__ApiDescription__ClassMappingsAssignment_7 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1283:1: ( ( rule__ApiDescription__ClassMappingsAssignment_7 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1284:1: ( rule__ApiDescription__ClassMappingsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getClassMappingsAssignment_7()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1285:1: ( rule__ApiDescription__ClassMappingsAssignment_7 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1285:2: rule__ApiDescription__ClassMappingsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__ClassMappingsAssignment_7_in_rule__ApiDescription__Group__7__Impl2704);
            rule__ApiDescription__ClassMappingsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getClassMappingsAssignment_7()); 
            }

            }

            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1288:1: ( ( rule__ApiDescription__ClassMappingsAssignment_7 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1289:1: ( rule__ApiDescription__ClassMappingsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getClassMappingsAssignment_7()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1290:1: ( rule__ApiDescription__ClassMappingsAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1290:2: rule__ApiDescription__ClassMappingsAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__ClassMappingsAssignment_7_in_rule__ApiDescription__Group__7__Impl2716);
            	    rule__ApiDescription__ClassMappingsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getClassMappingsAssignment_7()); 
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
    // $ANTLR end "rule__ApiDescription__Group__7__Impl"


    // $ANTLR start "rule__ApiDescription__Group_5__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1317:1: rule__ApiDescription__Group_5__0 : rule__ApiDescription__Group_5__0__Impl rule__ApiDescription__Group_5__1 ;
    public final void rule__ApiDescription__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1321:1: ( rule__ApiDescription__Group_5__0__Impl rule__ApiDescription__Group_5__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1322:2: rule__ApiDescription__Group_5__0__Impl rule__ApiDescription__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group_5__0__Impl_in_rule__ApiDescription__Group_5__02765);
            rule__ApiDescription__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group_5__1_in_rule__ApiDescription__Group_5__02768);
            rule__ApiDescription__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group_5__0"


    // $ANTLR start "rule__ApiDescription__Group_5__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1329:1: rule__ApiDescription__Group_5__0__Impl : ( 'generic' ) ;
    public final void rule__ApiDescription__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1333:1: ( ( 'generic' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1334:1: ( 'generic' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1334:1: ( 'generic' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1335:1: 'generic'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getGenericKeyword_5_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ApiDescription__Group_5__0__Impl2796); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getGenericKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group_5__0__Impl"


    // $ANTLR start "rule__ApiDescription__Group_5__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1348:1: rule__ApiDescription__Group_5__1 : rule__ApiDescription__Group_5__1__Impl rule__ApiDescription__Group_5__2 ;
    public final void rule__ApiDescription__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1352:1: ( rule__ApiDescription__Group_5__1__Impl rule__ApiDescription__Group_5__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1353:2: rule__ApiDescription__Group_5__1__Impl rule__ApiDescription__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group_5__1__Impl_in_rule__ApiDescription__Group_5__12827);
            rule__ApiDescription__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group_5__2_in_rule__ApiDescription__Group_5__12830);
            rule__ApiDescription__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group_5__1"


    // $ANTLR start "rule__ApiDescription__Group_5__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1360:1: rule__ApiDescription__Group_5__1__Impl : ( 'mapper' ) ;
    public final void rule__ApiDescription__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1364:1: ( ( 'mapper' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1365:1: ( 'mapper' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1365:1: ( 'mapper' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1366:1: 'mapper'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getMapperKeyword_5_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ApiDescription__Group_5__1__Impl2858); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getMapperKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group_5__1__Impl"


    // $ANTLR start "rule__ApiDescription__Group_5__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1379:1: rule__ApiDescription__Group_5__2 : rule__ApiDescription__Group_5__2__Impl ;
    public final void rule__ApiDescription__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1383:1: ( rule__ApiDescription__Group_5__2__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1384:2: rule__ApiDescription__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__Group_5__2__Impl_in_rule__ApiDescription__Group_5__22889);
            rule__ApiDescription__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group_5__2"


    // $ANTLR start "rule__ApiDescription__Group_5__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1390:1: rule__ApiDescription__Group_5__2__Impl : ( ( rule__ApiDescription__MapperClassNameAssignment_5_2 ) ) ;
    public final void rule__ApiDescription__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1394:1: ( ( ( rule__ApiDescription__MapperClassNameAssignment_5_2 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1395:1: ( ( rule__ApiDescription__MapperClassNameAssignment_5_2 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1395:1: ( ( rule__ApiDescription__MapperClassNameAssignment_5_2 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1396:1: ( rule__ApiDescription__MapperClassNameAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getMapperClassNameAssignment_5_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1397:1: ( rule__ApiDescription__MapperClassNameAssignment_5_2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1397:2: rule__ApiDescription__MapperClassNameAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ApiDescription__MapperClassNameAssignment_5_2_in_rule__ApiDescription__Group_5__2__Impl2916);
            rule__ApiDescription__MapperClassNameAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getMapperClassNameAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__Group_5__2__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1413:1: rule__SimpleClassMapping__Group__0 : rule__SimpleClassMapping__Group__0__Impl rule__SimpleClassMapping__Group__1 ;
    public final void rule__SimpleClassMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1417:1: ( rule__SimpleClassMapping__Group__0__Impl rule__SimpleClassMapping__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1418:2: rule__SimpleClassMapping__Group__0__Impl rule__SimpleClassMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__0__Impl_in_rule__SimpleClassMapping__Group__02952);
            rule__SimpleClassMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__1_in_rule__SimpleClassMapping__Group__02955);
            rule__SimpleClassMapping__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__0"


    // $ANTLR start "rule__SimpleClassMapping__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1425:1: rule__SimpleClassMapping__Group__0__Impl : ( 'metaclass' ) ;
    public final void rule__SimpleClassMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1429:1: ( ( 'metaclass' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1430:1: ( 'metaclass' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1430:1: ( 'metaclass' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1431:1: 'metaclass'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getMetaclassKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__SimpleClassMapping__Group__0__Impl2983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getMetaclassKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__0__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1444:1: rule__SimpleClassMapping__Group__1 : rule__SimpleClassMapping__Group__1__Impl rule__SimpleClassMapping__Group__2 ;
    public final void rule__SimpleClassMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1448:1: ( rule__SimpleClassMapping__Group__1__Impl rule__SimpleClassMapping__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1449:2: rule__SimpleClassMapping__Group__1__Impl rule__SimpleClassMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__1__Impl_in_rule__SimpleClassMapping__Group__13014);
            rule__SimpleClassMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__2_in_rule__SimpleClassMapping__Group__13017);
            rule__SimpleClassMapping__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__1"


    // $ANTLR start "rule__SimpleClassMapping__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1456:1: rule__SimpleClassMapping__Group__1__Impl : ( ( rule__SimpleClassMapping__MetaclassNameAssignment_1 ) ) ;
    public final void rule__SimpleClassMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1460:1: ( ( ( rule__SimpleClassMapping__MetaclassNameAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1461:1: ( ( rule__SimpleClassMapping__MetaclassNameAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1461:1: ( ( rule__SimpleClassMapping__MetaclassNameAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1462:1: ( rule__SimpleClassMapping__MetaclassNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getMetaclassNameAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1463:1: ( rule__SimpleClassMapping__MetaclassNameAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1463:2: rule__SimpleClassMapping__MetaclassNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__MetaclassNameAssignment_1_in_rule__SimpleClassMapping__Group__1__Impl3044);
            rule__SimpleClassMapping__MetaclassNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getMetaclassNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__1__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1473:1: rule__SimpleClassMapping__Group__2 : rule__SimpleClassMapping__Group__2__Impl rule__SimpleClassMapping__Group__3 ;
    public final void rule__SimpleClassMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1477:1: ( rule__SimpleClassMapping__Group__2__Impl rule__SimpleClassMapping__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1478:2: rule__SimpleClassMapping__Group__2__Impl rule__SimpleClassMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__2__Impl_in_rule__SimpleClassMapping__Group__23074);
            rule__SimpleClassMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__3_in_rule__SimpleClassMapping__Group__23077);
            rule__SimpleClassMapping__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__2"


    // $ANTLR start "rule__SimpleClassMapping__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1485:1: rule__SimpleClassMapping__Group__2__Impl : ( 'to' ) ;
    public final void rule__SimpleClassMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1489:1: ( ( 'to' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1490:1: ( 'to' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1490:1: ( 'to' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1491:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getToKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SimpleClassMapping__Group__2__Impl3105); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getToKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__2__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1504:1: rule__SimpleClassMapping__Group__3 : rule__SimpleClassMapping__Group__3__Impl rule__SimpleClassMapping__Group__4 ;
    public final void rule__SimpleClassMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1508:1: ( rule__SimpleClassMapping__Group__3__Impl rule__SimpleClassMapping__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1509:2: rule__SimpleClassMapping__Group__3__Impl rule__SimpleClassMapping__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__3__Impl_in_rule__SimpleClassMapping__Group__33136);
            rule__SimpleClassMapping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__4_in_rule__SimpleClassMapping__Group__33139);
            rule__SimpleClassMapping__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__3"


    // $ANTLR start "rule__SimpleClassMapping__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1516:1: rule__SimpleClassMapping__Group__3__Impl : ( ( rule__SimpleClassMapping__CanonicalClassNameAssignment_3 ) ) ;
    public final void rule__SimpleClassMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1520:1: ( ( ( rule__SimpleClassMapping__CanonicalClassNameAssignment_3 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1521:1: ( ( rule__SimpleClassMapping__CanonicalClassNameAssignment_3 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1521:1: ( ( rule__SimpleClassMapping__CanonicalClassNameAssignment_3 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1522:1: ( rule__SimpleClassMapping__CanonicalClassNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getCanonicalClassNameAssignment_3()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1523:1: ( rule__SimpleClassMapping__CanonicalClassNameAssignment_3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1523:2: rule__SimpleClassMapping__CanonicalClassNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__CanonicalClassNameAssignment_3_in_rule__SimpleClassMapping__Group__3__Impl3166);
            rule__SimpleClassMapping__CanonicalClassNameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getCanonicalClassNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__3__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1533:1: rule__SimpleClassMapping__Group__4 : rule__SimpleClassMapping__Group__4__Impl ;
    public final void rule__SimpleClassMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1537:1: ( rule__SimpleClassMapping__Group__4__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1538:2: rule__SimpleClassMapping__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group__4__Impl_in_rule__SimpleClassMapping__Group__43196);
            rule__SimpleClassMapping__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__4"


    // $ANTLR start "rule__SimpleClassMapping__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1544:1: rule__SimpleClassMapping__Group__4__Impl : ( ( rule__SimpleClassMapping__Group_4__0 )? ) ;
    public final void rule__SimpleClassMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1548:1: ( ( ( rule__SimpleClassMapping__Group_4__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1549:1: ( ( rule__SimpleClassMapping__Group_4__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1549:1: ( ( rule__SimpleClassMapping__Group_4__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1550:1: ( rule__SimpleClassMapping__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getGroup_4()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1551:1: ( rule__SimpleClassMapping__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1551:2: rule__SimpleClassMapping__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group_4__0_in_rule__SimpleClassMapping__Group__4__Impl3223);
                    rule__SimpleClassMapping__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group__4__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group_4__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1571:1: rule__SimpleClassMapping__Group_4__0 : rule__SimpleClassMapping__Group_4__0__Impl rule__SimpleClassMapping__Group_4__1 ;
    public final void rule__SimpleClassMapping__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1575:1: ( rule__SimpleClassMapping__Group_4__0__Impl rule__SimpleClassMapping__Group_4__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1576:2: rule__SimpleClassMapping__Group_4__0__Impl rule__SimpleClassMapping__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group_4__0__Impl_in_rule__SimpleClassMapping__Group_4__03264);
            rule__SimpleClassMapping__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group_4__1_in_rule__SimpleClassMapping__Group_4__03267);
            rule__SimpleClassMapping__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group_4__0"


    // $ANTLR start "rule__SimpleClassMapping__Group_4__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1583:1: rule__SimpleClassMapping__Group_4__0__Impl : ( '{' ) ;
    public final void rule__SimpleClassMapping__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1587:1: ( ( '{' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1588:1: ( '{' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1588:1: ( '{' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1589:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getLeftCurlyBracketKeyword_4_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__SimpleClassMapping__Group_4__0__Impl3295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getLeftCurlyBracketKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group_4__0__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group_4__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1602:1: rule__SimpleClassMapping__Group_4__1 : rule__SimpleClassMapping__Group_4__1__Impl rule__SimpleClassMapping__Group_4__2 ;
    public final void rule__SimpleClassMapping__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1606:1: ( rule__SimpleClassMapping__Group_4__1__Impl rule__SimpleClassMapping__Group_4__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1607:2: rule__SimpleClassMapping__Group_4__1__Impl rule__SimpleClassMapping__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group_4__1__Impl_in_rule__SimpleClassMapping__Group_4__13326);
            rule__SimpleClassMapping__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group_4__2_in_rule__SimpleClassMapping__Group_4__13329);
            rule__SimpleClassMapping__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group_4__1"


    // $ANTLR start "rule__SimpleClassMapping__Group_4__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1614:1: rule__SimpleClassMapping__Group_4__1__Impl : ( ( rule__SimpleClassMapping__CreationAssignment_4_1 ) ) ;
    public final void rule__SimpleClassMapping__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1618:1: ( ( ( rule__SimpleClassMapping__CreationAssignment_4_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1619:1: ( ( rule__SimpleClassMapping__CreationAssignment_4_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1619:1: ( ( rule__SimpleClassMapping__CreationAssignment_4_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1620:1: ( rule__SimpleClassMapping__CreationAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getCreationAssignment_4_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1621:1: ( rule__SimpleClassMapping__CreationAssignment_4_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1621:2: rule__SimpleClassMapping__CreationAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__CreationAssignment_4_1_in_rule__SimpleClassMapping__Group_4__1__Impl3356);
            rule__SimpleClassMapping__CreationAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getCreationAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group_4__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1631:1: rule__SimpleClassMapping__Group_4__2 : rule__SimpleClassMapping__Group_4__2__Impl rule__SimpleClassMapping__Group_4__3 ;
    public final void rule__SimpleClassMapping__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1635:1: ( rule__SimpleClassMapping__Group_4__2__Impl rule__SimpleClassMapping__Group_4__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1636:2: rule__SimpleClassMapping__Group_4__2__Impl rule__SimpleClassMapping__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group_4__2__Impl_in_rule__SimpleClassMapping__Group_4__23386);
            rule__SimpleClassMapping__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group_4__3_in_rule__SimpleClassMapping__Group_4__23389);
            rule__SimpleClassMapping__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group_4__2"


    // $ANTLR start "rule__SimpleClassMapping__Group_4__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1643:1: rule__SimpleClassMapping__Group_4__2__Impl : ( ( rule__SimpleClassMapping__FeatureMappingsAssignment_4_2 )* ) ;
    public final void rule__SimpleClassMapping__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1647:1: ( ( ( rule__SimpleClassMapping__FeatureMappingsAssignment_4_2 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1648:1: ( ( rule__SimpleClassMapping__FeatureMappingsAssignment_4_2 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1648:1: ( ( rule__SimpleClassMapping__FeatureMappingsAssignment_4_2 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1649:1: ( rule__SimpleClassMapping__FeatureMappingsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getFeatureMappingsAssignment_4_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1650:1: ( rule__SimpleClassMapping__FeatureMappingsAssignment_4_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29||LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1650:2: rule__SimpleClassMapping__FeatureMappingsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__FeatureMappingsAssignment_4_2_in_rule__SimpleClassMapping__Group_4__2__Impl3416);
            	    rule__SimpleClassMapping__FeatureMappingsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getFeatureMappingsAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group_4__2__Impl"


    // $ANTLR start "rule__SimpleClassMapping__Group_4__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1660:1: rule__SimpleClassMapping__Group_4__3 : rule__SimpleClassMapping__Group_4__3__Impl ;
    public final void rule__SimpleClassMapping__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1664:1: ( rule__SimpleClassMapping__Group_4__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1665:2: rule__SimpleClassMapping__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleClassMapping__Group_4__3__Impl_in_rule__SimpleClassMapping__Group_4__33447);
            rule__SimpleClassMapping__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group_4__3"


    // $ANTLR start "rule__SimpleClassMapping__Group_4__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1671:1: rule__SimpleClassMapping__Group_4__3__Impl : ( '}' ) ;
    public final void rule__SimpleClassMapping__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1675:1: ( ( '}' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1676:1: ( '}' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1676:1: ( '}' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1677:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getRightCurlyBracketKeyword_4_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__SimpleClassMapping__Group_4__3__Impl3475); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getRightCurlyBracketKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__Group_4__3__Impl"


    // $ANTLR start "rule__EmptyConstructor__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1698:1: rule__EmptyConstructor__Group__0 : rule__EmptyConstructor__Group__0__Impl rule__EmptyConstructor__Group__1 ;
    public final void rule__EmptyConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1702:1: ( rule__EmptyConstructor__Group__0__Impl rule__EmptyConstructor__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1703:2: rule__EmptyConstructor__Group__0__Impl rule__EmptyConstructor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group__0__Impl_in_rule__EmptyConstructor__Group__03514);
            rule__EmptyConstructor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group__1_in_rule__EmptyConstructor__Group__03517);
            rule__EmptyConstructor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group__0"


    // $ANTLR start "rule__EmptyConstructor__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1710:1: rule__EmptyConstructor__Group__0__Impl : ( 'empty' ) ;
    public final void rule__EmptyConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1714:1: ( ( 'empty' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1715:1: ( 'empty' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1715:1: ( 'empty' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1716:1: 'empty'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getEmptyKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EmptyConstructor__Group__0__Impl3545); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getEmptyKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group__0__Impl"


    // $ANTLR start "rule__EmptyConstructor__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1729:1: rule__EmptyConstructor__Group__1 : rule__EmptyConstructor__Group__1__Impl rule__EmptyConstructor__Group__2 ;
    public final void rule__EmptyConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1733:1: ( rule__EmptyConstructor__Group__1__Impl rule__EmptyConstructor__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1734:2: rule__EmptyConstructor__Group__1__Impl rule__EmptyConstructor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group__1__Impl_in_rule__EmptyConstructor__Group__13576);
            rule__EmptyConstructor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group__2_in_rule__EmptyConstructor__Group__13579);
            rule__EmptyConstructor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group__1"


    // $ANTLR start "rule__EmptyConstructor__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1741:1: rule__EmptyConstructor__Group__1__Impl : ( () ) ;
    public final void rule__EmptyConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1745:1: ( ( () ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1746:1: ( () )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1746:1: ( () )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1747:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getConstructorAction_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1748:1: ()
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1750:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getConstructorAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group__1__Impl"


    // $ANTLR start "rule__EmptyConstructor__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1760:1: rule__EmptyConstructor__Group__2 : rule__EmptyConstructor__Group__2__Impl rule__EmptyConstructor__Group__3 ;
    public final void rule__EmptyConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1764:1: ( rule__EmptyConstructor__Group__2__Impl rule__EmptyConstructor__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1765:2: rule__EmptyConstructor__Group__2__Impl rule__EmptyConstructor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group__2__Impl_in_rule__EmptyConstructor__Group__23637);
            rule__EmptyConstructor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group__3_in_rule__EmptyConstructor__Group__23640);
            rule__EmptyConstructor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group__2"


    // $ANTLR start "rule__EmptyConstructor__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1772:1: rule__EmptyConstructor__Group__2__Impl : ( 'constructor' ) ;
    public final void rule__EmptyConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1776:1: ( ( 'constructor' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1777:1: ( 'constructor' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1777:1: ( 'constructor' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1778:1: 'constructor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getConstructorKeyword_2()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__EmptyConstructor__Group__2__Impl3668); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getConstructorKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group__2__Impl"


    // $ANTLR start "rule__EmptyConstructor__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1791:1: rule__EmptyConstructor__Group__3 : rule__EmptyConstructor__Group__3__Impl ;
    public final void rule__EmptyConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1795:1: ( rule__EmptyConstructor__Group__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1796:2: rule__EmptyConstructor__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group__3__Impl_in_rule__EmptyConstructor__Group__33699);
            rule__EmptyConstructor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group__3"


    // $ANTLR start "rule__EmptyConstructor__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1802:1: rule__EmptyConstructor__Group__3__Impl : ( ( rule__EmptyConstructor__Group_3__0 )? ) ;
    public final void rule__EmptyConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1806:1: ( ( ( rule__EmptyConstructor__Group_3__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1807:1: ( ( rule__EmptyConstructor__Group_3__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1807:1: ( ( rule__EmptyConstructor__Group_3__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1808:1: ( rule__EmptyConstructor__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getGroup_3()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1809:1: ( rule__EmptyConstructor__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1809:2: rule__EmptyConstructor__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group_3__0_in_rule__EmptyConstructor__Group__3__Impl3726);
                    rule__EmptyConstructor__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group__3__Impl"


    // $ANTLR start "rule__EmptyConstructor__Group_3__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1827:1: rule__EmptyConstructor__Group_3__0 : rule__EmptyConstructor__Group_3__0__Impl rule__EmptyConstructor__Group_3__1 ;
    public final void rule__EmptyConstructor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1831:1: ( rule__EmptyConstructor__Group_3__0__Impl rule__EmptyConstructor__Group_3__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1832:2: rule__EmptyConstructor__Group_3__0__Impl rule__EmptyConstructor__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group_3__0__Impl_in_rule__EmptyConstructor__Group_3__03765);
            rule__EmptyConstructor__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group_3__1_in_rule__EmptyConstructor__Group_3__03768);
            rule__EmptyConstructor__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group_3__0"


    // $ANTLR start "rule__EmptyConstructor__Group_3__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1839:1: rule__EmptyConstructor__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EmptyConstructor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1843:1: ( ( '{' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1844:1: ( '{' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1844:1: ( '{' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1845:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getLeftCurlyBracketKeyword_3_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__EmptyConstructor__Group_3__0__Impl3796); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getLeftCurlyBracketKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group_3__0__Impl"


    // $ANTLR start "rule__EmptyConstructor__Group_3__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1858:1: rule__EmptyConstructor__Group_3__1 : rule__EmptyConstructor__Group_3__1__Impl rule__EmptyConstructor__Group_3__2 ;
    public final void rule__EmptyConstructor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1862:1: ( rule__EmptyConstructor__Group_3__1__Impl rule__EmptyConstructor__Group_3__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1863:2: rule__EmptyConstructor__Group_3__1__Impl rule__EmptyConstructor__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group_3__1__Impl_in_rule__EmptyConstructor__Group_3__13827);
            rule__EmptyConstructor__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group_3__2_in_rule__EmptyConstructor__Group_3__13830);
            rule__EmptyConstructor__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group_3__1"


    // $ANTLR start "rule__EmptyConstructor__Group_3__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1870:1: rule__EmptyConstructor__Group_3__1__Impl : ( ( ( rule__EmptyConstructor__StatementAssignment_3_1 ) ) ( ( rule__EmptyConstructor__StatementAssignment_3_1 )* ) ) ;
    public final void rule__EmptyConstructor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1874:1: ( ( ( ( rule__EmptyConstructor__StatementAssignment_3_1 ) ) ( ( rule__EmptyConstructor__StatementAssignment_3_1 )* ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1875:1: ( ( ( rule__EmptyConstructor__StatementAssignment_3_1 ) ) ( ( rule__EmptyConstructor__StatementAssignment_3_1 )* ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1875:1: ( ( ( rule__EmptyConstructor__StatementAssignment_3_1 ) ) ( ( rule__EmptyConstructor__StatementAssignment_3_1 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1876:1: ( ( rule__EmptyConstructor__StatementAssignment_3_1 ) ) ( ( rule__EmptyConstructor__StatementAssignment_3_1 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1876:1: ( ( rule__EmptyConstructor__StatementAssignment_3_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1877:1: ( rule__EmptyConstructor__StatementAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getStatementAssignment_3_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1878:1: ( rule__EmptyConstructor__StatementAssignment_3_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1878:2: rule__EmptyConstructor__StatementAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__StatementAssignment_3_1_in_rule__EmptyConstructor__Group_3__1__Impl3859);
            rule__EmptyConstructor__StatementAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getStatementAssignment_3_1()); 
            }

            }

            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1881:1: ( ( rule__EmptyConstructor__StatementAssignment_3_1 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1882:1: ( rule__EmptyConstructor__StatementAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getStatementAssignment_3_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1883:1: ( rule__EmptyConstructor__StatementAssignment_3_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1883:2: rule__EmptyConstructor__StatementAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__StatementAssignment_3_1_in_rule__EmptyConstructor__Group_3__1__Impl3871);
            	    rule__EmptyConstructor__StatementAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getStatementAssignment_3_1()); 
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
    // $ANTLR end "rule__EmptyConstructor__Group_3__1__Impl"


    // $ANTLR start "rule__EmptyConstructor__Group_3__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1894:1: rule__EmptyConstructor__Group_3__2 : rule__EmptyConstructor__Group_3__2__Impl ;
    public final void rule__EmptyConstructor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1898:1: ( rule__EmptyConstructor__Group_3__2__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1899:2: rule__EmptyConstructor__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmptyConstructor__Group_3__2__Impl_in_rule__EmptyConstructor__Group_3__23904);
            rule__EmptyConstructor__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group_3__2"


    // $ANTLR start "rule__EmptyConstructor__Group_3__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1905:1: rule__EmptyConstructor__Group_3__2__Impl : ( '}' ) ;
    public final void rule__EmptyConstructor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1909:1: ( ( '}' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1910:1: ( '}' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1910:1: ( '}' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1911:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getRightCurlyBracketKeyword_3_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__EmptyConstructor__Group_3__2__Impl3932); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getRightCurlyBracketKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__Group_3__2__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1930:1: rule__NonEmptyConstructor__Group__0 : rule__NonEmptyConstructor__Group__0__Impl rule__NonEmptyConstructor__Group__1 ;
    public final void rule__NonEmptyConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1934:1: ( rule__NonEmptyConstructor__Group__0__Impl rule__NonEmptyConstructor__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1935:2: rule__NonEmptyConstructor__Group__0__Impl rule__NonEmptyConstructor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__0__Impl_in_rule__NonEmptyConstructor__Group__03969);
            rule__NonEmptyConstructor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__1_in_rule__NonEmptyConstructor__Group__03972);
            rule__NonEmptyConstructor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__0"


    // $ANTLR start "rule__NonEmptyConstructor__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1942:1: rule__NonEmptyConstructor__Group__0__Impl : ( () ) ;
    public final void rule__NonEmptyConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1946:1: ( ( () ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1947:1: ( () )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1947:1: ( () )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1948:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getConstructorAction_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1949:1: ()
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1951:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getConstructorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__0__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1961:1: rule__NonEmptyConstructor__Group__1 : rule__NonEmptyConstructor__Group__1__Impl rule__NonEmptyConstructor__Group__2 ;
    public final void rule__NonEmptyConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1965:1: ( rule__NonEmptyConstructor__Group__1__Impl rule__NonEmptyConstructor__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1966:2: rule__NonEmptyConstructor__Group__1__Impl rule__NonEmptyConstructor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__1__Impl_in_rule__NonEmptyConstructor__Group__14030);
            rule__NonEmptyConstructor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__2_in_rule__NonEmptyConstructor__Group__14033);
            rule__NonEmptyConstructor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__1"


    // $ANTLR start "rule__NonEmptyConstructor__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1973:1: rule__NonEmptyConstructor__Group__1__Impl : ( 'constructor' ) ;
    public final void rule__NonEmptyConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1977:1: ( ( 'constructor' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1978:1: ( 'constructor' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1978:1: ( 'constructor' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1979:1: 'constructor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getConstructorKeyword_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__NonEmptyConstructor__Group__1__Impl4061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getConstructorKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__1__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1992:1: rule__NonEmptyConstructor__Group__2 : rule__NonEmptyConstructor__Group__2__Impl rule__NonEmptyConstructor__Group__3 ;
    public final void rule__NonEmptyConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1996:1: ( rule__NonEmptyConstructor__Group__2__Impl rule__NonEmptyConstructor__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:1997:2: rule__NonEmptyConstructor__Group__2__Impl rule__NonEmptyConstructor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__2__Impl_in_rule__NonEmptyConstructor__Group__24092);
            rule__NonEmptyConstructor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__3_in_rule__NonEmptyConstructor__Group__24095);
            rule__NonEmptyConstructor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__2"


    // $ANTLR start "rule__NonEmptyConstructor__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2004:1: rule__NonEmptyConstructor__Group__2__Impl : ( '(' ) ;
    public final void rule__NonEmptyConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2008:1: ( ( '(' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2009:1: ( '(' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2009:1: ( '(' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2010:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__NonEmptyConstructor__Group__2__Impl4123); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__2__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2023:1: rule__NonEmptyConstructor__Group__3 : rule__NonEmptyConstructor__Group__3__Impl rule__NonEmptyConstructor__Group__4 ;
    public final void rule__NonEmptyConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2027:1: ( rule__NonEmptyConstructor__Group__3__Impl rule__NonEmptyConstructor__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2028:2: rule__NonEmptyConstructor__Group__3__Impl rule__NonEmptyConstructor__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__3__Impl_in_rule__NonEmptyConstructor__Group__34154);
            rule__NonEmptyConstructor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__4_in_rule__NonEmptyConstructor__Group__34157);
            rule__NonEmptyConstructor__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__3"


    // $ANTLR start "rule__NonEmptyConstructor__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2035:1: rule__NonEmptyConstructor__Group__3__Impl : ( ( rule__NonEmptyConstructor__ParametersAssignment_3 ) ) ;
    public final void rule__NonEmptyConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2039:1: ( ( ( rule__NonEmptyConstructor__ParametersAssignment_3 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2040:1: ( ( rule__NonEmptyConstructor__ParametersAssignment_3 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2040:1: ( ( rule__NonEmptyConstructor__ParametersAssignment_3 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2041:1: ( rule__NonEmptyConstructor__ParametersAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getParametersAssignment_3()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2042:1: ( rule__NonEmptyConstructor__ParametersAssignment_3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2042:2: rule__NonEmptyConstructor__ParametersAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__ParametersAssignment_3_in_rule__NonEmptyConstructor__Group__3__Impl4184);
            rule__NonEmptyConstructor__ParametersAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getParametersAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__3__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2052:1: rule__NonEmptyConstructor__Group__4 : rule__NonEmptyConstructor__Group__4__Impl rule__NonEmptyConstructor__Group__5 ;
    public final void rule__NonEmptyConstructor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2056:1: ( rule__NonEmptyConstructor__Group__4__Impl rule__NonEmptyConstructor__Group__5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2057:2: rule__NonEmptyConstructor__Group__4__Impl rule__NonEmptyConstructor__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__4__Impl_in_rule__NonEmptyConstructor__Group__44214);
            rule__NonEmptyConstructor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__5_in_rule__NonEmptyConstructor__Group__44217);
            rule__NonEmptyConstructor__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__4"


    // $ANTLR start "rule__NonEmptyConstructor__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2064:1: rule__NonEmptyConstructor__Group__4__Impl : ( ( rule__NonEmptyConstructor__Group_4__0 )* ) ;
    public final void rule__NonEmptyConstructor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2068:1: ( ( ( rule__NonEmptyConstructor__Group_4__0 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2069:1: ( ( rule__NonEmptyConstructor__Group_4__0 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2069:1: ( ( rule__NonEmptyConstructor__Group_4__0 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2070:1: ( rule__NonEmptyConstructor__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getGroup_4()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2071:1: ( rule__NonEmptyConstructor__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2071:2: rule__NonEmptyConstructor__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_4__0_in_rule__NonEmptyConstructor__Group__4__Impl4244);
            	    rule__NonEmptyConstructor__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__4__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group__5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2081:1: rule__NonEmptyConstructor__Group__5 : rule__NonEmptyConstructor__Group__5__Impl rule__NonEmptyConstructor__Group__6 ;
    public final void rule__NonEmptyConstructor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2085:1: ( rule__NonEmptyConstructor__Group__5__Impl rule__NonEmptyConstructor__Group__6 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2086:2: rule__NonEmptyConstructor__Group__5__Impl rule__NonEmptyConstructor__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__5__Impl_in_rule__NonEmptyConstructor__Group__54275);
            rule__NonEmptyConstructor__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__6_in_rule__NonEmptyConstructor__Group__54278);
            rule__NonEmptyConstructor__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__5"


    // $ANTLR start "rule__NonEmptyConstructor__Group__5__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2093:1: rule__NonEmptyConstructor__Group__5__Impl : ( ')' ) ;
    public final void rule__NonEmptyConstructor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2097:1: ( ( ')' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2098:1: ( ')' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2098:1: ( ')' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2099:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__NonEmptyConstructor__Group__5__Impl4306); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__5__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group__6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2112:1: rule__NonEmptyConstructor__Group__6 : rule__NonEmptyConstructor__Group__6__Impl ;
    public final void rule__NonEmptyConstructor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2116:1: ( rule__NonEmptyConstructor__Group__6__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2117:2: rule__NonEmptyConstructor__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group__6__Impl_in_rule__NonEmptyConstructor__Group__64337);
            rule__NonEmptyConstructor__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__6"


    // $ANTLR start "rule__NonEmptyConstructor__Group__6__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2123:1: rule__NonEmptyConstructor__Group__6__Impl : ( ( rule__NonEmptyConstructor__Group_6__0 )? ) ;
    public final void rule__NonEmptyConstructor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2127:1: ( ( ( rule__NonEmptyConstructor__Group_6__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2128:1: ( ( rule__NonEmptyConstructor__Group_6__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2128:1: ( ( rule__NonEmptyConstructor__Group_6__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2129:1: ( rule__NonEmptyConstructor__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getGroup_6()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2130:1: ( rule__NonEmptyConstructor__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2130:2: rule__NonEmptyConstructor__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_6__0_in_rule__NonEmptyConstructor__Group__6__Impl4364);
                    rule__NonEmptyConstructor__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group__6__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group_4__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2154:1: rule__NonEmptyConstructor__Group_4__0 : rule__NonEmptyConstructor__Group_4__0__Impl rule__NonEmptyConstructor__Group_4__1 ;
    public final void rule__NonEmptyConstructor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2158:1: ( rule__NonEmptyConstructor__Group_4__0__Impl rule__NonEmptyConstructor__Group_4__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2159:2: rule__NonEmptyConstructor__Group_4__0__Impl rule__NonEmptyConstructor__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_4__0__Impl_in_rule__NonEmptyConstructor__Group_4__04409);
            rule__NonEmptyConstructor__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_4__1_in_rule__NonEmptyConstructor__Group_4__04412);
            rule__NonEmptyConstructor__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_4__0"


    // $ANTLR start "rule__NonEmptyConstructor__Group_4__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2166:1: rule__NonEmptyConstructor__Group_4__0__Impl : ( ',' ) ;
    public final void rule__NonEmptyConstructor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2170:1: ( ( ',' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2171:1: ( ',' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2171:1: ( ',' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2172:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getCommaKeyword_4_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__NonEmptyConstructor__Group_4__0__Impl4440); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_4__0__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group_4__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2185:1: rule__NonEmptyConstructor__Group_4__1 : rule__NonEmptyConstructor__Group_4__1__Impl ;
    public final void rule__NonEmptyConstructor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2189:1: ( rule__NonEmptyConstructor__Group_4__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2190:2: rule__NonEmptyConstructor__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_4__1__Impl_in_rule__NonEmptyConstructor__Group_4__14471);
            rule__NonEmptyConstructor__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_4__1"


    // $ANTLR start "rule__NonEmptyConstructor__Group_4__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2196:1: rule__NonEmptyConstructor__Group_4__1__Impl : ( ( rule__NonEmptyConstructor__ParametersAssignment_4_1 ) ) ;
    public final void rule__NonEmptyConstructor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2200:1: ( ( ( rule__NonEmptyConstructor__ParametersAssignment_4_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2201:1: ( ( rule__NonEmptyConstructor__ParametersAssignment_4_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2201:1: ( ( rule__NonEmptyConstructor__ParametersAssignment_4_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2202:1: ( rule__NonEmptyConstructor__ParametersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getParametersAssignment_4_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2203:1: ( rule__NonEmptyConstructor__ParametersAssignment_4_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2203:2: rule__NonEmptyConstructor__ParametersAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__ParametersAssignment_4_1_in_rule__NonEmptyConstructor__Group_4__1__Impl4498);
            rule__NonEmptyConstructor__ParametersAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getParametersAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_4__1__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group_6__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2217:1: rule__NonEmptyConstructor__Group_6__0 : rule__NonEmptyConstructor__Group_6__0__Impl rule__NonEmptyConstructor__Group_6__1 ;
    public final void rule__NonEmptyConstructor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2221:1: ( rule__NonEmptyConstructor__Group_6__0__Impl rule__NonEmptyConstructor__Group_6__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2222:2: rule__NonEmptyConstructor__Group_6__0__Impl rule__NonEmptyConstructor__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_6__0__Impl_in_rule__NonEmptyConstructor__Group_6__04532);
            rule__NonEmptyConstructor__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_6__1_in_rule__NonEmptyConstructor__Group_6__04535);
            rule__NonEmptyConstructor__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_6__0"


    // $ANTLR start "rule__NonEmptyConstructor__Group_6__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2229:1: rule__NonEmptyConstructor__Group_6__0__Impl : ( '{' ) ;
    public final void rule__NonEmptyConstructor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2233:1: ( ( '{' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2234:1: ( '{' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2234:1: ( '{' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2235:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getLeftCurlyBracketKeyword_6_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__NonEmptyConstructor__Group_6__0__Impl4563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getLeftCurlyBracketKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_6__0__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group_6__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2248:1: rule__NonEmptyConstructor__Group_6__1 : rule__NonEmptyConstructor__Group_6__1__Impl rule__NonEmptyConstructor__Group_6__2 ;
    public final void rule__NonEmptyConstructor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2252:1: ( rule__NonEmptyConstructor__Group_6__1__Impl rule__NonEmptyConstructor__Group_6__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2253:2: rule__NonEmptyConstructor__Group_6__1__Impl rule__NonEmptyConstructor__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_6__1__Impl_in_rule__NonEmptyConstructor__Group_6__14594);
            rule__NonEmptyConstructor__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_6__2_in_rule__NonEmptyConstructor__Group_6__14597);
            rule__NonEmptyConstructor__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_6__1"


    // $ANTLR start "rule__NonEmptyConstructor__Group_6__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2260:1: rule__NonEmptyConstructor__Group_6__1__Impl : ( ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 ) ) ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 )* ) ) ;
    public final void rule__NonEmptyConstructor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2264:1: ( ( ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 ) ) ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 )* ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2265:1: ( ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 ) ) ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 )* ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2265:1: ( ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 ) ) ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2266:1: ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 ) ) ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2266:1: ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2267:1: ( rule__NonEmptyConstructor__StatementAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getStatementAssignment_6_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2268:1: ( rule__NonEmptyConstructor__StatementAssignment_6_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2268:2: rule__NonEmptyConstructor__StatementAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__StatementAssignment_6_1_in_rule__NonEmptyConstructor__Group_6__1__Impl4626);
            rule__NonEmptyConstructor__StatementAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getStatementAssignment_6_1()); 
            }

            }

            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2271:1: ( ( rule__NonEmptyConstructor__StatementAssignment_6_1 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2272:1: ( rule__NonEmptyConstructor__StatementAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getStatementAssignment_6_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2273:1: ( rule__NonEmptyConstructor__StatementAssignment_6_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2273:2: rule__NonEmptyConstructor__StatementAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__StatementAssignment_6_1_in_rule__NonEmptyConstructor__Group_6__1__Impl4638);
            	    rule__NonEmptyConstructor__StatementAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getStatementAssignment_6_1()); 
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
    // $ANTLR end "rule__NonEmptyConstructor__Group_6__1__Impl"


    // $ANTLR start "rule__NonEmptyConstructor__Group_6__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2284:1: rule__NonEmptyConstructor__Group_6__2 : rule__NonEmptyConstructor__Group_6__2__Impl ;
    public final void rule__NonEmptyConstructor__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2288:1: ( rule__NonEmptyConstructor__Group_6__2__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2289:2: rule__NonEmptyConstructor__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonEmptyConstructor__Group_6__2__Impl_in_rule__NonEmptyConstructor__Group_6__24671);
            rule__NonEmptyConstructor__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_6__2"


    // $ANTLR start "rule__NonEmptyConstructor__Group_6__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2295:1: rule__NonEmptyConstructor__Group_6__2__Impl : ( '}' ) ;
    public final void rule__NonEmptyConstructor__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2299:1: ( ( '}' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2300:1: ( '}' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2300:1: ( '}' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2301:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getRightCurlyBracketKeyword_6_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__NonEmptyConstructor__Group_6__2__Impl4699); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getRightCurlyBracketKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__Group_6__2__Impl"


    // $ANTLR start "rule__SetFeature__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2320:1: rule__SetFeature__Group__0 : rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 ;
    public final void rule__SetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2324:1: ( rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2325:2: rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Group__0__Impl_in_rule__SetFeature__Group__04736);
            rule__SetFeature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Group__1_in_rule__SetFeature__Group__04739);
            rule__SetFeature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group__0"


    // $ANTLR start "rule__SetFeature__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2332:1: rule__SetFeature__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2336:1: ( ( 'set' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2337:1: ( 'set' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2337:1: ( 'set' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2338:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getSetKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__SetFeature__Group__0__Impl4767); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getSetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group__0__Impl"


    // $ANTLR start "rule__SetFeature__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2351:1: rule__SetFeature__Group__1 : rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 ;
    public final void rule__SetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2355:1: ( rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2356:2: rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Group__1__Impl_in_rule__SetFeature__Group__14798);
            rule__SetFeature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Group__2_in_rule__SetFeature__Group__14801);
            rule__SetFeature__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group__1"


    // $ANTLR start "rule__SetFeature__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2363:1: rule__SetFeature__Group__1__Impl : ( ( rule__SetFeature__FeatureAssignment_1 ) ) ;
    public final void rule__SetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2367:1: ( ( ( rule__SetFeature__FeatureAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2368:1: ( ( rule__SetFeature__FeatureAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2368:1: ( ( rule__SetFeature__FeatureAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2369:1: ( rule__SetFeature__FeatureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getFeatureAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2370:1: ( rule__SetFeature__FeatureAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2370:2: rule__SetFeature__FeatureAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__FeatureAssignment_1_in_rule__SetFeature__Group__1__Impl4828);
            rule__SetFeature__FeatureAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getFeatureAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group__1__Impl"


    // $ANTLR start "rule__SetFeature__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2380:1: rule__SetFeature__Group__2 : rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 ;
    public final void rule__SetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2384:1: ( rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2385:2: rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Group__2__Impl_in_rule__SetFeature__Group__24858);
            rule__SetFeature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Group__3_in_rule__SetFeature__Group__24861);
            rule__SetFeature__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group__2"


    // $ANTLR start "rule__SetFeature__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2392:1: rule__SetFeature__Group__2__Impl : ( '=' ) ;
    public final void rule__SetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2396:1: ( ( '=' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2397:1: ( '=' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2397:1: ( '=' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2398:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getEqualsSignKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__SetFeature__Group__2__Impl4889); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group__2__Impl"


    // $ANTLR start "rule__SetFeature__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2411:1: rule__SetFeature__Group__3 : rule__SetFeature__Group__3__Impl ;
    public final void rule__SetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2415:1: ( rule__SetFeature__Group__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2416:2: rule__SetFeature__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Group__3__Impl_in_rule__SetFeature__Group__34920);
            rule__SetFeature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group__3"


    // $ANTLR start "rule__SetFeature__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2422:1: rule__SetFeature__Group__3__Impl : ( ( rule__SetFeature__Alternatives_3 ) ) ;
    public final void rule__SetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2426:1: ( ( ( rule__SetFeature__Alternatives_3 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2427:1: ( ( rule__SetFeature__Alternatives_3 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2427:1: ( ( rule__SetFeature__Alternatives_3 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2428:1: ( rule__SetFeature__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getAlternatives_3()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2429:1: ( rule__SetFeature__Alternatives_3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2429:2: rule__SetFeature__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetFeature__Alternatives_3_in_rule__SetFeature__Group__3__Impl4947);
            rule__SetFeature__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group__3__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2447:1: rule__SimpleAttributeMapping__Group__0 : rule__SimpleAttributeMapping__Group__0__Impl rule__SimpleAttributeMapping__Group__1 ;
    public final void rule__SimpleAttributeMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2451:1: ( rule__SimpleAttributeMapping__Group__0__Impl rule__SimpleAttributeMapping__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2452:2: rule__SimpleAttributeMapping__Group__0__Impl rule__SimpleAttributeMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__0__Impl_in_rule__SimpleAttributeMapping__Group__04985);
            rule__SimpleAttributeMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__1_in_rule__SimpleAttributeMapping__Group__04988);
            rule__SimpleAttributeMapping__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__0"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2459:1: rule__SimpleAttributeMapping__Group__0__Impl : ( 'attr' ) ;
    public final void rule__SimpleAttributeMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2463:1: ( ( 'attr' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2464:1: ( 'attr' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2464:1: ( 'attr' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2465:1: 'attr'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getAttrKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__SimpleAttributeMapping__Group__0__Impl5016); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getAttrKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__0__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2478:1: rule__SimpleAttributeMapping__Group__1 : rule__SimpleAttributeMapping__Group__1__Impl rule__SimpleAttributeMapping__Group__2 ;
    public final void rule__SimpleAttributeMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2482:1: ( rule__SimpleAttributeMapping__Group__1__Impl rule__SimpleAttributeMapping__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2483:2: rule__SimpleAttributeMapping__Group__1__Impl rule__SimpleAttributeMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__1__Impl_in_rule__SimpleAttributeMapping__Group__15047);
            rule__SimpleAttributeMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__2_in_rule__SimpleAttributeMapping__Group__15050);
            rule__SimpleAttributeMapping__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__1"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2490:1: rule__SimpleAttributeMapping__Group__1__Impl : ( ( rule__SimpleAttributeMapping__FeatureNameAssignment_1 ) ) ;
    public final void rule__SimpleAttributeMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2494:1: ( ( ( rule__SimpleAttributeMapping__FeatureNameAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2495:1: ( ( rule__SimpleAttributeMapping__FeatureNameAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2495:1: ( ( rule__SimpleAttributeMapping__FeatureNameAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2496:1: ( rule__SimpleAttributeMapping__FeatureNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getFeatureNameAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2497:1: ( rule__SimpleAttributeMapping__FeatureNameAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2497:2: rule__SimpleAttributeMapping__FeatureNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__FeatureNameAssignment_1_in_rule__SimpleAttributeMapping__Group__1__Impl5077);
            rule__SimpleAttributeMapping__FeatureNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getFeatureNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__1__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2507:1: rule__SimpleAttributeMapping__Group__2 : rule__SimpleAttributeMapping__Group__2__Impl rule__SimpleAttributeMapping__Group__3 ;
    public final void rule__SimpleAttributeMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2511:1: ( rule__SimpleAttributeMapping__Group__2__Impl rule__SimpleAttributeMapping__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2512:2: rule__SimpleAttributeMapping__Group__2__Impl rule__SimpleAttributeMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__2__Impl_in_rule__SimpleAttributeMapping__Group__25107);
            rule__SimpleAttributeMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__3_in_rule__SimpleAttributeMapping__Group__25110);
            rule__SimpleAttributeMapping__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__2"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2519:1: rule__SimpleAttributeMapping__Group__2__Impl : ( ( rule__SimpleAttributeMapping__IsMultivaluedAssignment_2 )? ) ;
    public final void rule__SimpleAttributeMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2523:1: ( ( ( rule__SimpleAttributeMapping__IsMultivaluedAssignment_2 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2524:1: ( ( rule__SimpleAttributeMapping__IsMultivaluedAssignment_2 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2524:1: ( ( rule__SimpleAttributeMapping__IsMultivaluedAssignment_2 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2525:1: ( rule__SimpleAttributeMapping__IsMultivaluedAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getIsMultivaluedAssignment_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2526:1: ( rule__SimpleAttributeMapping__IsMultivaluedAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2526:2: rule__SimpleAttributeMapping__IsMultivaluedAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__IsMultivaluedAssignment_2_in_rule__SimpleAttributeMapping__Group__2__Impl5137);
                    rule__SimpleAttributeMapping__IsMultivaluedAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getIsMultivaluedAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__2__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2536:1: rule__SimpleAttributeMapping__Group__3 : rule__SimpleAttributeMapping__Group__3__Impl rule__SimpleAttributeMapping__Group__4 ;
    public final void rule__SimpleAttributeMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2540:1: ( rule__SimpleAttributeMapping__Group__3__Impl rule__SimpleAttributeMapping__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2541:2: rule__SimpleAttributeMapping__Group__3__Impl rule__SimpleAttributeMapping__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__3__Impl_in_rule__SimpleAttributeMapping__Group__35168);
            rule__SimpleAttributeMapping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__4_in_rule__SimpleAttributeMapping__Group__35171);
            rule__SimpleAttributeMapping__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__3"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2548:1: rule__SimpleAttributeMapping__Group__3__Impl : ( ':' ) ;
    public final void rule__SimpleAttributeMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2552:1: ( ( ':' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2553:1: ( ':' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2553:1: ( ':' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2554:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getColonKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SimpleAttributeMapping__Group__3__Impl5199); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__3__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2567:1: rule__SimpleAttributeMapping__Group__4 : rule__SimpleAttributeMapping__Group__4__Impl rule__SimpleAttributeMapping__Group__5 ;
    public final void rule__SimpleAttributeMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2571:1: ( rule__SimpleAttributeMapping__Group__4__Impl rule__SimpleAttributeMapping__Group__5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2572:2: rule__SimpleAttributeMapping__Group__4__Impl rule__SimpleAttributeMapping__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__4__Impl_in_rule__SimpleAttributeMapping__Group__45230);
            rule__SimpleAttributeMapping__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__5_in_rule__SimpleAttributeMapping__Group__45233);
            rule__SimpleAttributeMapping__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__4"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2579:1: rule__SimpleAttributeMapping__Group__4__Impl : ( ( rule__SimpleAttributeMapping__TypeAssignment_4 ) ) ;
    public final void rule__SimpleAttributeMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2583:1: ( ( ( rule__SimpleAttributeMapping__TypeAssignment_4 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2584:1: ( ( rule__SimpleAttributeMapping__TypeAssignment_4 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2584:1: ( ( rule__SimpleAttributeMapping__TypeAssignment_4 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2585:1: ( rule__SimpleAttributeMapping__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getTypeAssignment_4()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2586:1: ( rule__SimpleAttributeMapping__TypeAssignment_4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2586:2: rule__SimpleAttributeMapping__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__TypeAssignment_4_in_rule__SimpleAttributeMapping__Group__4__Impl5260);
            rule__SimpleAttributeMapping__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__4__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2596:1: rule__SimpleAttributeMapping__Group__5 : rule__SimpleAttributeMapping__Group__5__Impl rule__SimpleAttributeMapping__Group__6 ;
    public final void rule__SimpleAttributeMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2600:1: ( rule__SimpleAttributeMapping__Group__5__Impl rule__SimpleAttributeMapping__Group__6 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2601:2: rule__SimpleAttributeMapping__Group__5__Impl rule__SimpleAttributeMapping__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__5__Impl_in_rule__SimpleAttributeMapping__Group__55290);
            rule__SimpleAttributeMapping__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__6_in_rule__SimpleAttributeMapping__Group__55293);
            rule__SimpleAttributeMapping__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__5"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__5__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2608:1: rule__SimpleAttributeMapping__Group__5__Impl : ( ( rule__SimpleAttributeMapping__Group_5__0 )? ) ;
    public final void rule__SimpleAttributeMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2612:1: ( ( ( rule__SimpleAttributeMapping__Group_5__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2613:1: ( ( rule__SimpleAttributeMapping__Group_5__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2613:1: ( ( rule__SimpleAttributeMapping__Group_5__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2614:1: ( rule__SimpleAttributeMapping__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getGroup_5()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2615:1: ( rule__SimpleAttributeMapping__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2615:2: rule__SimpleAttributeMapping__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_5__0_in_rule__SimpleAttributeMapping__Group__5__Impl5320);
                    rule__SimpleAttributeMapping__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__5__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2625:1: rule__SimpleAttributeMapping__Group__6 : rule__SimpleAttributeMapping__Group__6__Impl rule__SimpleAttributeMapping__Group__7 ;
    public final void rule__SimpleAttributeMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2629:1: ( rule__SimpleAttributeMapping__Group__6__Impl rule__SimpleAttributeMapping__Group__7 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2630:2: rule__SimpleAttributeMapping__Group__6__Impl rule__SimpleAttributeMapping__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__6__Impl_in_rule__SimpleAttributeMapping__Group__65351);
            rule__SimpleAttributeMapping__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__7_in_rule__SimpleAttributeMapping__Group__65354);
            rule__SimpleAttributeMapping__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__6"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__6__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2637:1: rule__SimpleAttributeMapping__Group__6__Impl : ( ( rule__SimpleAttributeMapping__Group_6__0 )? ) ;
    public final void rule__SimpleAttributeMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2641:1: ( ( ( rule__SimpleAttributeMapping__Group_6__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2642:1: ( ( rule__SimpleAttributeMapping__Group_6__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2642:1: ( ( rule__SimpleAttributeMapping__Group_6__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2643:1: ( rule__SimpleAttributeMapping__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getGroup_6()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2644:1: ( rule__SimpleAttributeMapping__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2644:2: rule__SimpleAttributeMapping__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_6__0_in_rule__SimpleAttributeMapping__Group__6__Impl5381);
                    rule__SimpleAttributeMapping__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__6__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__7"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2654:1: rule__SimpleAttributeMapping__Group__7 : rule__SimpleAttributeMapping__Group__7__Impl ;
    public final void rule__SimpleAttributeMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2658:1: ( rule__SimpleAttributeMapping__Group__7__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2659:2: rule__SimpleAttributeMapping__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group__7__Impl_in_rule__SimpleAttributeMapping__Group__75412);
            rule__SimpleAttributeMapping__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__7"


    // $ANTLR start "rule__SimpleAttributeMapping__Group__7__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2665:1: rule__SimpleAttributeMapping__Group__7__Impl : ( ( rule__SimpleAttributeMapping__Group_7__0 )? ) ;
    public final void rule__SimpleAttributeMapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2669:1: ( ( ( rule__SimpleAttributeMapping__Group_7__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2670:1: ( ( rule__SimpleAttributeMapping__Group_7__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2670:1: ( ( rule__SimpleAttributeMapping__Group_7__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2671:1: ( rule__SimpleAttributeMapping__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getGroup_7()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2672:1: ( rule__SimpleAttributeMapping__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2672:2: rule__SimpleAttributeMapping__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_7__0_in_rule__SimpleAttributeMapping__Group__7__Impl5439);
                    rule__SimpleAttributeMapping__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group__7__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_5__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2698:1: rule__SimpleAttributeMapping__Group_5__0 : rule__SimpleAttributeMapping__Group_5__0__Impl rule__SimpleAttributeMapping__Group_5__1 ;
    public final void rule__SimpleAttributeMapping__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2702:1: ( rule__SimpleAttributeMapping__Group_5__0__Impl rule__SimpleAttributeMapping__Group_5__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2703:2: rule__SimpleAttributeMapping__Group_5__0__Impl rule__SimpleAttributeMapping__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_5__0__Impl_in_rule__SimpleAttributeMapping__Group_5__05486);
            rule__SimpleAttributeMapping__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_5__1_in_rule__SimpleAttributeMapping__Group_5__05489);
            rule__SimpleAttributeMapping__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_5__0"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_5__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2710:1: rule__SimpleAttributeMapping__Group_5__0__Impl : ( 'constructor' ) ;
    public final void rule__SimpleAttributeMapping__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2714:1: ( ( 'constructor' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2715:1: ( 'constructor' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2715:1: ( 'constructor' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2716:1: 'constructor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getConstructorKeyword_5_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SimpleAttributeMapping__Group_5__0__Impl5517); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getConstructorKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_5__0__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_5__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2729:1: rule__SimpleAttributeMapping__Group_5__1 : rule__SimpleAttributeMapping__Group_5__1__Impl rule__SimpleAttributeMapping__Group_5__2 ;
    public final void rule__SimpleAttributeMapping__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2733:1: ( rule__SimpleAttributeMapping__Group_5__1__Impl rule__SimpleAttributeMapping__Group_5__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2734:2: rule__SimpleAttributeMapping__Group_5__1__Impl rule__SimpleAttributeMapping__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_5__1__Impl_in_rule__SimpleAttributeMapping__Group_5__15548);
            rule__SimpleAttributeMapping__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_5__2_in_rule__SimpleAttributeMapping__Group_5__15551);
            rule__SimpleAttributeMapping__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_5__1"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_5__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2741:1: rule__SimpleAttributeMapping__Group_5__1__Impl : ( ':' ) ;
    public final void rule__SimpleAttributeMapping__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2745:1: ( ( ':' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2746:1: ( ':' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2746:1: ( ':' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2747:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getColonKeyword_5_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SimpleAttributeMapping__Group_5__1__Impl5579); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getColonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_5__1__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_5__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2760:1: rule__SimpleAttributeMapping__Group_5__2 : rule__SimpleAttributeMapping__Group_5__2__Impl ;
    public final void rule__SimpleAttributeMapping__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2764:1: ( rule__SimpleAttributeMapping__Group_5__2__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2765:2: rule__SimpleAttributeMapping__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_5__2__Impl_in_rule__SimpleAttributeMapping__Group_5__25610);
            rule__SimpleAttributeMapping__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_5__2"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_5__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2771:1: rule__SimpleAttributeMapping__Group_5__2__Impl : ( ( rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2 ) ) ;
    public final void rule__SimpleAttributeMapping__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2775:1: ( ( ( rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2776:1: ( ( rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2776:1: ( ( rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2777:1: ( rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getConstructorTypeAssignment_5_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2778:1: ( rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2778:2: rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2_in_rule__SimpleAttributeMapping__Group_5__2__Impl5637);
            rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getConstructorTypeAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_5__2__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_6__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2794:1: rule__SimpleAttributeMapping__Group_6__0 : rule__SimpleAttributeMapping__Group_6__0__Impl rule__SimpleAttributeMapping__Group_6__1 ;
    public final void rule__SimpleAttributeMapping__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2798:1: ( rule__SimpleAttributeMapping__Group_6__0__Impl rule__SimpleAttributeMapping__Group_6__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2799:2: rule__SimpleAttributeMapping__Group_6__0__Impl rule__SimpleAttributeMapping__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_6__0__Impl_in_rule__SimpleAttributeMapping__Group_6__05673);
            rule__SimpleAttributeMapping__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_6__1_in_rule__SimpleAttributeMapping__Group_6__05676);
            rule__SimpleAttributeMapping__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_6__0"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_6__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2806:1: rule__SimpleAttributeMapping__Group_6__0__Impl : ( 'get' ) ;
    public final void rule__SimpleAttributeMapping__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2810:1: ( ( 'get' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2811:1: ( 'get' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2811:1: ( 'get' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2812:1: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getGetKeyword_6_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SimpleAttributeMapping__Group_6__0__Impl5704); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getGetKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_6__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2825:1: rule__SimpleAttributeMapping__Group_6__1 : rule__SimpleAttributeMapping__Group_6__1__Impl ;
    public final void rule__SimpleAttributeMapping__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2829:1: ( rule__SimpleAttributeMapping__Group_6__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2830:2: rule__SimpleAttributeMapping__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_6__1__Impl_in_rule__SimpleAttributeMapping__Group_6__15735);
            rule__SimpleAttributeMapping__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_6__1"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_6__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2836:1: rule__SimpleAttributeMapping__Group_6__1__Impl : ( ( rule__SimpleAttributeMapping__GetMethodAssignment_6_1 ) ) ;
    public final void rule__SimpleAttributeMapping__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2840:1: ( ( ( rule__SimpleAttributeMapping__GetMethodAssignment_6_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2841:1: ( ( rule__SimpleAttributeMapping__GetMethodAssignment_6_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2841:1: ( ( rule__SimpleAttributeMapping__GetMethodAssignment_6_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2842:1: ( rule__SimpleAttributeMapping__GetMethodAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getGetMethodAssignment_6_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2843:1: ( rule__SimpleAttributeMapping__GetMethodAssignment_6_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2843:2: rule__SimpleAttributeMapping__GetMethodAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__GetMethodAssignment_6_1_in_rule__SimpleAttributeMapping__Group_6__1__Impl5762);
            rule__SimpleAttributeMapping__GetMethodAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getGetMethodAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_6__1__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_7__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2857:1: rule__SimpleAttributeMapping__Group_7__0 : rule__SimpleAttributeMapping__Group_7__0__Impl rule__SimpleAttributeMapping__Group_7__1 ;
    public final void rule__SimpleAttributeMapping__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2861:1: ( rule__SimpleAttributeMapping__Group_7__0__Impl rule__SimpleAttributeMapping__Group_7__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2862:2: rule__SimpleAttributeMapping__Group_7__0__Impl rule__SimpleAttributeMapping__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_7__0__Impl_in_rule__SimpleAttributeMapping__Group_7__05796);
            rule__SimpleAttributeMapping__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_7__1_in_rule__SimpleAttributeMapping__Group_7__05799);
            rule__SimpleAttributeMapping__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_7__0"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_7__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2869:1: rule__SimpleAttributeMapping__Group_7__0__Impl : ( 'set' ) ;
    public final void rule__SimpleAttributeMapping__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2873:1: ( ( 'set' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2874:1: ( 'set' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2874:1: ( 'set' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2875:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getSetKeyword_7_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__SimpleAttributeMapping__Group_7__0__Impl5827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getSetKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_7__0__Impl"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_7__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2888:1: rule__SimpleAttributeMapping__Group_7__1 : rule__SimpleAttributeMapping__Group_7__1__Impl ;
    public final void rule__SimpleAttributeMapping__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2892:1: ( rule__SimpleAttributeMapping__Group_7__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2893:2: rule__SimpleAttributeMapping__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__Group_7__1__Impl_in_rule__SimpleAttributeMapping__Group_7__15858);
            rule__SimpleAttributeMapping__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_7__1"


    // $ANTLR start "rule__SimpleAttributeMapping__Group_7__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2899:1: rule__SimpleAttributeMapping__Group_7__1__Impl : ( ( rule__SimpleAttributeMapping__SetMethodAssignment_7_1 ) ) ;
    public final void rule__SimpleAttributeMapping__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2903:1: ( ( ( rule__SimpleAttributeMapping__SetMethodAssignment_7_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2904:1: ( ( rule__SimpleAttributeMapping__SetMethodAssignment_7_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2904:1: ( ( rule__SimpleAttributeMapping__SetMethodAssignment_7_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2905:1: ( rule__SimpleAttributeMapping__SetMethodAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getSetMethodAssignment_7_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2906:1: ( rule__SimpleAttributeMapping__SetMethodAssignment_7_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2906:2: rule__SimpleAttributeMapping__SetMethodAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttributeMapping__SetMethodAssignment_7_1_in_rule__SimpleAttributeMapping__Group_7__1__Impl5885);
            rule__SimpleAttributeMapping__SetMethodAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getSetMethodAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__Group_7__1__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2920:1: rule__SimpleReferenceMapping__Group__0 : rule__SimpleReferenceMapping__Group__0__Impl rule__SimpleReferenceMapping__Group__1 ;
    public final void rule__SimpleReferenceMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2924:1: ( rule__SimpleReferenceMapping__Group__0__Impl rule__SimpleReferenceMapping__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2925:2: rule__SimpleReferenceMapping__Group__0__Impl rule__SimpleReferenceMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__0__Impl_in_rule__SimpleReferenceMapping__Group__05919);
            rule__SimpleReferenceMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__1_in_rule__SimpleReferenceMapping__Group__05922);
            rule__SimpleReferenceMapping__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__0"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2932:1: rule__SimpleReferenceMapping__Group__0__Impl : ( 'ref' ) ;
    public final void rule__SimpleReferenceMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2936:1: ( ( 'ref' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2937:1: ( 'ref' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2937:1: ( 'ref' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2938:1: 'ref'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getRefKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SimpleReferenceMapping__Group__0__Impl5950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getRefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__0__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2951:1: rule__SimpleReferenceMapping__Group__1 : rule__SimpleReferenceMapping__Group__1__Impl rule__SimpleReferenceMapping__Group__2 ;
    public final void rule__SimpleReferenceMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2955:1: ( rule__SimpleReferenceMapping__Group__1__Impl rule__SimpleReferenceMapping__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2956:2: rule__SimpleReferenceMapping__Group__1__Impl rule__SimpleReferenceMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__1__Impl_in_rule__SimpleReferenceMapping__Group__15981);
            rule__SimpleReferenceMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__2_in_rule__SimpleReferenceMapping__Group__15984);
            rule__SimpleReferenceMapping__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__1"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2963:1: rule__SimpleReferenceMapping__Group__1__Impl : ( ( rule__SimpleReferenceMapping__FeatureNameAssignment_1 ) ) ;
    public final void rule__SimpleReferenceMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2967:1: ( ( ( rule__SimpleReferenceMapping__FeatureNameAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2968:1: ( ( rule__SimpleReferenceMapping__FeatureNameAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2968:1: ( ( rule__SimpleReferenceMapping__FeatureNameAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2969:1: ( rule__SimpleReferenceMapping__FeatureNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getFeatureNameAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2970:1: ( rule__SimpleReferenceMapping__FeatureNameAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2970:2: rule__SimpleReferenceMapping__FeatureNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__FeatureNameAssignment_1_in_rule__SimpleReferenceMapping__Group__1__Impl6011);
            rule__SimpleReferenceMapping__FeatureNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getFeatureNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__1__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2980:1: rule__SimpleReferenceMapping__Group__2 : rule__SimpleReferenceMapping__Group__2__Impl rule__SimpleReferenceMapping__Group__3 ;
    public final void rule__SimpleReferenceMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2984:1: ( rule__SimpleReferenceMapping__Group__2__Impl rule__SimpleReferenceMapping__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2985:2: rule__SimpleReferenceMapping__Group__2__Impl rule__SimpleReferenceMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__2__Impl_in_rule__SimpleReferenceMapping__Group__26041);
            rule__SimpleReferenceMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__3_in_rule__SimpleReferenceMapping__Group__26044);
            rule__SimpleReferenceMapping__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__2"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2992:1: rule__SimpleReferenceMapping__Group__2__Impl : ( ( rule__SimpleReferenceMapping__IsMultivaluedAssignment_2 )? ) ;
    public final void rule__SimpleReferenceMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2996:1: ( ( ( rule__SimpleReferenceMapping__IsMultivaluedAssignment_2 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2997:1: ( ( rule__SimpleReferenceMapping__IsMultivaluedAssignment_2 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2997:1: ( ( rule__SimpleReferenceMapping__IsMultivaluedAssignment_2 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2998:1: ( rule__SimpleReferenceMapping__IsMultivaluedAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getIsMultivaluedAssignment_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2999:1: ( rule__SimpleReferenceMapping__IsMultivaluedAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:2999:2: rule__SimpleReferenceMapping__IsMultivaluedAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__IsMultivaluedAssignment_2_in_rule__SimpleReferenceMapping__Group__2__Impl6071);
                    rule__SimpleReferenceMapping__IsMultivaluedAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getIsMultivaluedAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__2__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3009:1: rule__SimpleReferenceMapping__Group__3 : rule__SimpleReferenceMapping__Group__3__Impl rule__SimpleReferenceMapping__Group__4 ;
    public final void rule__SimpleReferenceMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3013:1: ( rule__SimpleReferenceMapping__Group__3__Impl rule__SimpleReferenceMapping__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3014:2: rule__SimpleReferenceMapping__Group__3__Impl rule__SimpleReferenceMapping__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__3__Impl_in_rule__SimpleReferenceMapping__Group__36102);
            rule__SimpleReferenceMapping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__4_in_rule__SimpleReferenceMapping__Group__36105);
            rule__SimpleReferenceMapping__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__3"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3021:1: rule__SimpleReferenceMapping__Group__3__Impl : ( ':' ) ;
    public final void rule__SimpleReferenceMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3025:1: ( ( ':' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3026:1: ( ':' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3026:1: ( ':' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3027:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getColonKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SimpleReferenceMapping__Group__3__Impl6133); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__3__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3040:1: rule__SimpleReferenceMapping__Group__4 : rule__SimpleReferenceMapping__Group__4__Impl rule__SimpleReferenceMapping__Group__5 ;
    public final void rule__SimpleReferenceMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3044:1: ( rule__SimpleReferenceMapping__Group__4__Impl rule__SimpleReferenceMapping__Group__5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3045:2: rule__SimpleReferenceMapping__Group__4__Impl rule__SimpleReferenceMapping__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__4__Impl_in_rule__SimpleReferenceMapping__Group__46164);
            rule__SimpleReferenceMapping__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__5_in_rule__SimpleReferenceMapping__Group__46167);
            rule__SimpleReferenceMapping__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__4"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3052:1: rule__SimpleReferenceMapping__Group__4__Impl : ( ( rule__SimpleReferenceMapping__TypeAssignment_4 ) ) ;
    public final void rule__SimpleReferenceMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3056:1: ( ( ( rule__SimpleReferenceMapping__TypeAssignment_4 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3057:1: ( ( rule__SimpleReferenceMapping__TypeAssignment_4 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3057:1: ( ( rule__SimpleReferenceMapping__TypeAssignment_4 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3058:1: ( rule__SimpleReferenceMapping__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getTypeAssignment_4()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3059:1: ( rule__SimpleReferenceMapping__TypeAssignment_4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3059:2: rule__SimpleReferenceMapping__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__TypeAssignment_4_in_rule__SimpleReferenceMapping__Group__4__Impl6194);
            rule__SimpleReferenceMapping__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__4__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3069:1: rule__SimpleReferenceMapping__Group__5 : rule__SimpleReferenceMapping__Group__5__Impl rule__SimpleReferenceMapping__Group__6 ;
    public final void rule__SimpleReferenceMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3073:1: ( rule__SimpleReferenceMapping__Group__5__Impl rule__SimpleReferenceMapping__Group__6 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3074:2: rule__SimpleReferenceMapping__Group__5__Impl rule__SimpleReferenceMapping__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__5__Impl_in_rule__SimpleReferenceMapping__Group__56224);
            rule__SimpleReferenceMapping__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__6_in_rule__SimpleReferenceMapping__Group__56227);
            rule__SimpleReferenceMapping__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__5"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__5__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3081:1: rule__SimpleReferenceMapping__Group__5__Impl : ( ( rule__SimpleReferenceMapping__Group_5__0 )? ) ;
    public final void rule__SimpleReferenceMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3085:1: ( ( ( rule__SimpleReferenceMapping__Group_5__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3086:1: ( ( rule__SimpleReferenceMapping__Group_5__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3086:1: ( ( rule__SimpleReferenceMapping__Group_5__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3087:1: ( rule__SimpleReferenceMapping__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getGroup_5()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3088:1: ( rule__SimpleReferenceMapping__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3088:2: rule__SimpleReferenceMapping__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_5__0_in_rule__SimpleReferenceMapping__Group__5__Impl6254);
                    rule__SimpleReferenceMapping__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__5__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3098:1: rule__SimpleReferenceMapping__Group__6 : rule__SimpleReferenceMapping__Group__6__Impl rule__SimpleReferenceMapping__Group__7 ;
    public final void rule__SimpleReferenceMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3102:1: ( rule__SimpleReferenceMapping__Group__6__Impl rule__SimpleReferenceMapping__Group__7 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3103:2: rule__SimpleReferenceMapping__Group__6__Impl rule__SimpleReferenceMapping__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__6__Impl_in_rule__SimpleReferenceMapping__Group__66285);
            rule__SimpleReferenceMapping__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__7_in_rule__SimpleReferenceMapping__Group__66288);
            rule__SimpleReferenceMapping__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__6"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__6__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3110:1: rule__SimpleReferenceMapping__Group__6__Impl : ( ( rule__SimpleReferenceMapping__Group_6__0 )? ) ;
    public final void rule__SimpleReferenceMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3114:1: ( ( ( rule__SimpleReferenceMapping__Group_6__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3115:1: ( ( rule__SimpleReferenceMapping__Group_6__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3115:1: ( ( rule__SimpleReferenceMapping__Group_6__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3116:1: ( rule__SimpleReferenceMapping__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getGroup_6()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3117:1: ( rule__SimpleReferenceMapping__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3117:2: rule__SimpleReferenceMapping__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_6__0_in_rule__SimpleReferenceMapping__Group__6__Impl6315);
                    rule__SimpleReferenceMapping__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__6__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__7"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3127:1: rule__SimpleReferenceMapping__Group__7 : rule__SimpleReferenceMapping__Group__7__Impl ;
    public final void rule__SimpleReferenceMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3131:1: ( rule__SimpleReferenceMapping__Group__7__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3132:2: rule__SimpleReferenceMapping__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group__7__Impl_in_rule__SimpleReferenceMapping__Group__76346);
            rule__SimpleReferenceMapping__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__7"


    // $ANTLR start "rule__SimpleReferenceMapping__Group__7__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3138:1: rule__SimpleReferenceMapping__Group__7__Impl : ( ( rule__SimpleReferenceMapping__Group_7__0 )? ) ;
    public final void rule__SimpleReferenceMapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3142:1: ( ( ( rule__SimpleReferenceMapping__Group_7__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3143:1: ( ( rule__SimpleReferenceMapping__Group_7__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3143:1: ( ( rule__SimpleReferenceMapping__Group_7__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3144:1: ( rule__SimpleReferenceMapping__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getGroup_7()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3145:1: ( rule__SimpleReferenceMapping__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3145:2: rule__SimpleReferenceMapping__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_7__0_in_rule__SimpleReferenceMapping__Group__7__Impl6373);
                    rule__SimpleReferenceMapping__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group__7__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_5__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3171:1: rule__SimpleReferenceMapping__Group_5__0 : rule__SimpleReferenceMapping__Group_5__0__Impl rule__SimpleReferenceMapping__Group_5__1 ;
    public final void rule__SimpleReferenceMapping__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3175:1: ( rule__SimpleReferenceMapping__Group_5__0__Impl rule__SimpleReferenceMapping__Group_5__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3176:2: rule__SimpleReferenceMapping__Group_5__0__Impl rule__SimpleReferenceMapping__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_5__0__Impl_in_rule__SimpleReferenceMapping__Group_5__06420);
            rule__SimpleReferenceMapping__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_5__1_in_rule__SimpleReferenceMapping__Group_5__06423);
            rule__SimpleReferenceMapping__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_5__0"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_5__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3183:1: rule__SimpleReferenceMapping__Group_5__0__Impl : ( 'constructor' ) ;
    public final void rule__SimpleReferenceMapping__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3187:1: ( ( 'constructor' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3188:1: ( 'constructor' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3188:1: ( 'constructor' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3189:1: 'constructor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getConstructorKeyword_5_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SimpleReferenceMapping__Group_5__0__Impl6451); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getConstructorKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_5__0__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_5__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3202:1: rule__SimpleReferenceMapping__Group_5__1 : rule__SimpleReferenceMapping__Group_5__1__Impl rule__SimpleReferenceMapping__Group_5__2 ;
    public final void rule__SimpleReferenceMapping__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3206:1: ( rule__SimpleReferenceMapping__Group_5__1__Impl rule__SimpleReferenceMapping__Group_5__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3207:2: rule__SimpleReferenceMapping__Group_5__1__Impl rule__SimpleReferenceMapping__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_5__1__Impl_in_rule__SimpleReferenceMapping__Group_5__16482);
            rule__SimpleReferenceMapping__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_5__2_in_rule__SimpleReferenceMapping__Group_5__16485);
            rule__SimpleReferenceMapping__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_5__1"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_5__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3214:1: rule__SimpleReferenceMapping__Group_5__1__Impl : ( ':' ) ;
    public final void rule__SimpleReferenceMapping__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3218:1: ( ( ':' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3219:1: ( ':' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3219:1: ( ':' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3220:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getColonKeyword_5_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SimpleReferenceMapping__Group_5__1__Impl6513); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getColonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_5__1__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_5__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3233:1: rule__SimpleReferenceMapping__Group_5__2 : rule__SimpleReferenceMapping__Group_5__2__Impl ;
    public final void rule__SimpleReferenceMapping__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3237:1: ( rule__SimpleReferenceMapping__Group_5__2__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3238:2: rule__SimpleReferenceMapping__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_5__2__Impl_in_rule__SimpleReferenceMapping__Group_5__26544);
            rule__SimpleReferenceMapping__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_5__2"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_5__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3244:1: rule__SimpleReferenceMapping__Group_5__2__Impl : ( ( rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2 ) ) ;
    public final void rule__SimpleReferenceMapping__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3248:1: ( ( ( rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3249:1: ( ( rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3249:1: ( ( rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3250:1: ( rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getConstructorTypeAssignment_5_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3251:1: ( rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3251:2: rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2_in_rule__SimpleReferenceMapping__Group_5__2__Impl6571);
            rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getConstructorTypeAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_5__2__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_6__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3267:1: rule__SimpleReferenceMapping__Group_6__0 : rule__SimpleReferenceMapping__Group_6__0__Impl rule__SimpleReferenceMapping__Group_6__1 ;
    public final void rule__SimpleReferenceMapping__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3271:1: ( rule__SimpleReferenceMapping__Group_6__0__Impl rule__SimpleReferenceMapping__Group_6__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3272:2: rule__SimpleReferenceMapping__Group_6__0__Impl rule__SimpleReferenceMapping__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_6__0__Impl_in_rule__SimpleReferenceMapping__Group_6__06607);
            rule__SimpleReferenceMapping__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_6__1_in_rule__SimpleReferenceMapping__Group_6__06610);
            rule__SimpleReferenceMapping__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_6__0"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_6__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3279:1: rule__SimpleReferenceMapping__Group_6__0__Impl : ( 'get' ) ;
    public final void rule__SimpleReferenceMapping__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3283:1: ( ( 'get' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3284:1: ( 'get' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3284:1: ( 'get' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3285:1: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getGetKeyword_6_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SimpleReferenceMapping__Group_6__0__Impl6638); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getGetKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_6__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3298:1: rule__SimpleReferenceMapping__Group_6__1 : rule__SimpleReferenceMapping__Group_6__1__Impl ;
    public final void rule__SimpleReferenceMapping__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3302:1: ( rule__SimpleReferenceMapping__Group_6__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3303:2: rule__SimpleReferenceMapping__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_6__1__Impl_in_rule__SimpleReferenceMapping__Group_6__16669);
            rule__SimpleReferenceMapping__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_6__1"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_6__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3309:1: rule__SimpleReferenceMapping__Group_6__1__Impl : ( ( rule__SimpleReferenceMapping__GetMethodAssignment_6_1 ) ) ;
    public final void rule__SimpleReferenceMapping__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3313:1: ( ( ( rule__SimpleReferenceMapping__GetMethodAssignment_6_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3314:1: ( ( rule__SimpleReferenceMapping__GetMethodAssignment_6_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3314:1: ( ( rule__SimpleReferenceMapping__GetMethodAssignment_6_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3315:1: ( rule__SimpleReferenceMapping__GetMethodAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getGetMethodAssignment_6_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3316:1: ( rule__SimpleReferenceMapping__GetMethodAssignment_6_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3316:2: rule__SimpleReferenceMapping__GetMethodAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__GetMethodAssignment_6_1_in_rule__SimpleReferenceMapping__Group_6__1__Impl6696);
            rule__SimpleReferenceMapping__GetMethodAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getGetMethodAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_6__1__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_7__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3330:1: rule__SimpleReferenceMapping__Group_7__0 : rule__SimpleReferenceMapping__Group_7__0__Impl rule__SimpleReferenceMapping__Group_7__1 ;
    public final void rule__SimpleReferenceMapping__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3334:1: ( rule__SimpleReferenceMapping__Group_7__0__Impl rule__SimpleReferenceMapping__Group_7__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3335:2: rule__SimpleReferenceMapping__Group_7__0__Impl rule__SimpleReferenceMapping__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_7__0__Impl_in_rule__SimpleReferenceMapping__Group_7__06730);
            rule__SimpleReferenceMapping__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_7__1_in_rule__SimpleReferenceMapping__Group_7__06733);
            rule__SimpleReferenceMapping__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_7__0"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_7__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3342:1: rule__SimpleReferenceMapping__Group_7__0__Impl : ( 'set' ) ;
    public final void rule__SimpleReferenceMapping__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3346:1: ( ( 'set' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3347:1: ( 'set' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3347:1: ( 'set' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3348:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getSetKeyword_7_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__SimpleReferenceMapping__Group_7__0__Impl6761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getSetKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_7__0__Impl"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_7__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3361:1: rule__SimpleReferenceMapping__Group_7__1 : rule__SimpleReferenceMapping__Group_7__1__Impl ;
    public final void rule__SimpleReferenceMapping__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3365:1: ( rule__SimpleReferenceMapping__Group_7__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3366:2: rule__SimpleReferenceMapping__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__Group_7__1__Impl_in_rule__SimpleReferenceMapping__Group_7__16792);
            rule__SimpleReferenceMapping__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_7__1"


    // $ANTLR start "rule__SimpleReferenceMapping__Group_7__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3372:1: rule__SimpleReferenceMapping__Group_7__1__Impl : ( ( rule__SimpleReferenceMapping__SetMethodAssignment_7_1 ) ) ;
    public final void rule__SimpleReferenceMapping__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3376:1: ( ( ( rule__SimpleReferenceMapping__SetMethodAssignment_7_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3377:1: ( ( rule__SimpleReferenceMapping__SetMethodAssignment_7_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3377:1: ( ( rule__SimpleReferenceMapping__SetMethodAssignment_7_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3378:1: ( rule__SimpleReferenceMapping__SetMethodAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getSetMethodAssignment_7_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3379:1: ( rule__SimpleReferenceMapping__SetMethodAssignment_7_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3379:2: rule__SimpleReferenceMapping__SetMethodAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleReferenceMapping__SetMethodAssignment_7_1_in_rule__SimpleReferenceMapping__Group_7__1__Impl6819);
            rule__SimpleReferenceMapping__SetMethodAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getSetMethodAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__Group_7__1__Impl"


    // $ANTLR start "rule__SimpleGet__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3393:1: rule__SimpleGet__Group__0 : rule__SimpleGet__Group__0__Impl rule__SimpleGet__Group__1 ;
    public final void rule__SimpleGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3397:1: ( rule__SimpleGet__Group__0__Impl rule__SimpleGet__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3398:2: rule__SimpleGet__Group__0__Impl rule__SimpleGet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleGet__Group__0__Impl_in_rule__SimpleGet__Group__06853);
            rule__SimpleGet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleGet__Group__1_in_rule__SimpleGet__Group__06856);
            rule__SimpleGet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleGet__Group__0"


    // $ANTLR start "rule__SimpleGet__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3405:1: rule__SimpleGet__Group__0__Impl : ( 'method' ) ;
    public final void rule__SimpleGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3409:1: ( ( 'method' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3410:1: ( 'method' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3410:1: ( 'method' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3411:1: 'method'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleGetAccess().getMethodKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SimpleGet__Group__0__Impl6884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleGetAccess().getMethodKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleGet__Group__0__Impl"


    // $ANTLR start "rule__SimpleGet__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3424:1: rule__SimpleGet__Group__1 : rule__SimpleGet__Group__1__Impl ;
    public final void rule__SimpleGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3428:1: ( rule__SimpleGet__Group__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3429:2: rule__SimpleGet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleGet__Group__1__Impl_in_rule__SimpleGet__Group__16915);
            rule__SimpleGet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleGet__Group__1"


    // $ANTLR start "rule__SimpleGet__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3435:1: rule__SimpleGet__Group__1__Impl : ( ( rule__SimpleGet__GetterAssignment_1 ) ) ;
    public final void rule__SimpleGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3439:1: ( ( ( rule__SimpleGet__GetterAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3440:1: ( ( rule__SimpleGet__GetterAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3440:1: ( ( rule__SimpleGet__GetterAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3441:1: ( rule__SimpleGet__GetterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleGetAccess().getGetterAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3442:1: ( rule__SimpleGet__GetterAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3442:2: rule__SimpleGet__GetterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleGet__GetterAssignment_1_in_rule__SimpleGet__Group__1__Impl6942);
            rule__SimpleGet__GetterAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleGetAccess().getGetterAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleGet__Group__1__Impl"


    // $ANTLR start "rule__SimpleSet__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3456:1: rule__SimpleSet__Group__0 : rule__SimpleSet__Group__0__Impl rule__SimpleSet__Group__1 ;
    public final void rule__SimpleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3460:1: ( rule__SimpleSet__Group__0__Impl rule__SimpleSet__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3461:2: rule__SimpleSet__Group__0__Impl rule__SimpleSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleSet__Group__0__Impl_in_rule__SimpleSet__Group__06976);
            rule__SimpleSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleSet__Group__1_in_rule__SimpleSet__Group__06979);
            rule__SimpleSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSet__Group__0"


    // $ANTLR start "rule__SimpleSet__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3468:1: rule__SimpleSet__Group__0__Impl : ( 'method' ) ;
    public final void rule__SimpleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3472:1: ( ( 'method' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3473:1: ( 'method' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3473:1: ( 'method' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3474:1: 'method'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSetAccess().getMethodKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SimpleSet__Group__0__Impl7007); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSetAccess().getMethodKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSet__Group__0__Impl"


    // $ANTLR start "rule__SimpleSet__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3487:1: rule__SimpleSet__Group__1 : rule__SimpleSet__Group__1__Impl ;
    public final void rule__SimpleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3491:1: ( rule__SimpleSet__Group__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3492:2: rule__SimpleSet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleSet__Group__1__Impl_in_rule__SimpleSet__Group__17038);
            rule__SimpleSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSet__Group__1"


    // $ANTLR start "rule__SimpleSet__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3498:1: rule__SimpleSet__Group__1__Impl : ( ( rule__SimpleSet__SetterAssignment_1 ) ) ;
    public final void rule__SimpleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3502:1: ( ( ( rule__SimpleSet__SetterAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3503:1: ( ( rule__SimpleSet__SetterAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3503:1: ( ( rule__SimpleSet__SetterAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3504:1: ( rule__SimpleSet__SetterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSetAccess().getSetterAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3505:1: ( rule__SimpleSet__SetterAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3505:2: rule__SimpleSet__SetterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleSet__SetterAssignment_1_in_rule__SimpleSet__Group__1__Impl7065);
            rule__SimpleSet__SetterAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSetAccess().getSetterAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSet__Group__1__Impl"


    // $ANTLR start "rule__GenericGet__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3519:1: rule__GenericGet__Group__0 : rule__GenericGet__Group__0__Impl rule__GenericGet__Group__1 ;
    public final void rule__GenericGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3523:1: ( rule__GenericGet__Group__0__Impl rule__GenericGet__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3524:2: rule__GenericGet__Group__0__Impl rule__GenericGet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericGet__Group__0__Impl_in_rule__GenericGet__Group__07099);
            rule__GenericGet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GenericGet__Group__1_in_rule__GenericGet__Group__07102);
            rule__GenericGet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericGet__Group__0"


    // $ANTLR start "rule__GenericGet__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3531:1: rule__GenericGet__Group__0__Impl : ( 'generic' ) ;
    public final void rule__GenericGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3535:1: ( ( 'generic' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3536:1: ( 'generic' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3536:1: ( 'generic' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3537:1: 'generic'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericGetAccess().getGenericKeyword_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__GenericGet__Group__0__Impl7130); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericGetAccess().getGenericKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericGet__Group__0__Impl"


    // $ANTLR start "rule__GenericGet__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3550:1: rule__GenericGet__Group__1 : rule__GenericGet__Group__1__Impl ;
    public final void rule__GenericGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3554:1: ( rule__GenericGet__Group__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3555:2: rule__GenericGet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericGet__Group__1__Impl_in_rule__GenericGet__Group__17161);
            rule__GenericGet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericGet__Group__1"


    // $ANTLR start "rule__GenericGet__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3561:1: rule__GenericGet__Group__1__Impl : ( ( rule__GenericGet__GetterAssignment_1 ) ) ;
    public final void rule__GenericGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3565:1: ( ( ( rule__GenericGet__GetterAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3566:1: ( ( rule__GenericGet__GetterAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3566:1: ( ( rule__GenericGet__GetterAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3567:1: ( rule__GenericGet__GetterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericGetAccess().getGetterAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3568:1: ( rule__GenericGet__GetterAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3568:2: rule__GenericGet__GetterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericGet__GetterAssignment_1_in_rule__GenericGet__Group__1__Impl7188);
            rule__GenericGet__GetterAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericGetAccess().getGetterAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericGet__Group__1__Impl"


    // $ANTLR start "rule__GenericSet__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3582:1: rule__GenericSet__Group__0 : rule__GenericSet__Group__0__Impl rule__GenericSet__Group__1 ;
    public final void rule__GenericSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3586:1: ( rule__GenericSet__Group__0__Impl rule__GenericSet__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3587:2: rule__GenericSet__Group__0__Impl rule__GenericSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericSet__Group__0__Impl_in_rule__GenericSet__Group__07222);
            rule__GenericSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GenericSet__Group__1_in_rule__GenericSet__Group__07225);
            rule__GenericSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericSet__Group__0"


    // $ANTLR start "rule__GenericSet__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3594:1: rule__GenericSet__Group__0__Impl : ( 'generic' ) ;
    public final void rule__GenericSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3598:1: ( ( 'generic' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3599:1: ( 'generic' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3599:1: ( 'generic' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3600:1: 'generic'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericSetAccess().getGenericKeyword_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__GenericSet__Group__0__Impl7253); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericSetAccess().getGenericKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericSet__Group__0__Impl"


    // $ANTLR start "rule__GenericSet__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3613:1: rule__GenericSet__Group__1 : rule__GenericSet__Group__1__Impl ;
    public final void rule__GenericSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3617:1: ( rule__GenericSet__Group__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3618:2: rule__GenericSet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericSet__Group__1__Impl_in_rule__GenericSet__Group__17284);
            rule__GenericSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericSet__Group__1"


    // $ANTLR start "rule__GenericSet__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3624:1: rule__GenericSet__Group__1__Impl : ( ( rule__GenericSet__SetterAssignment_1 ) ) ;
    public final void rule__GenericSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3628:1: ( ( ( rule__GenericSet__SetterAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3629:1: ( ( rule__GenericSet__SetterAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3629:1: ( ( rule__GenericSet__SetterAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3630:1: ( rule__GenericSet__SetterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericSetAccess().getSetterAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3631:1: ( rule__GenericSet__SetterAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3631:2: rule__GenericSet__SetterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericSet__SetterAssignment_1_in_rule__GenericSet__Group__1__Impl7311);
            rule__GenericSet__SetterAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericSetAccess().getSetterAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericSet__Group__1__Impl"


    // $ANTLR start "rule__IteratorGet__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3645:1: rule__IteratorGet__Group__0 : rule__IteratorGet__Group__0__Impl rule__IteratorGet__Group__1 ;
    public final void rule__IteratorGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3649:1: ( rule__IteratorGet__Group__0__Impl rule__IteratorGet__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3650:2: rule__IteratorGet__Group__0__Impl rule__IteratorGet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__Group__0__Impl_in_rule__IteratorGet__Group__07345);
            rule__IteratorGet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__Group__1_in_rule__IteratorGet__Group__07348);
            rule__IteratorGet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__Group__0"


    // $ANTLR start "rule__IteratorGet__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3657:1: rule__IteratorGet__Group__0__Impl : ( 'iterator' ) ;
    public final void rule__IteratorGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3661:1: ( ( 'iterator' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3662:1: ( 'iterator' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3662:1: ( 'iterator' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3663:1: 'iterator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetAccess().getIteratorKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__IteratorGet__Group__0__Impl7376); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetAccess().getIteratorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__Group__0__Impl"


    // $ANTLR start "rule__IteratorGet__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3676:1: rule__IteratorGet__Group__1 : rule__IteratorGet__Group__1__Impl rule__IteratorGet__Group__2 ;
    public final void rule__IteratorGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3680:1: ( rule__IteratorGet__Group__1__Impl rule__IteratorGet__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3681:2: rule__IteratorGet__Group__1__Impl rule__IteratorGet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__Group__1__Impl_in_rule__IteratorGet__Group__17407);
            rule__IteratorGet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__Group__2_in_rule__IteratorGet__Group__17410);
            rule__IteratorGet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__Group__1"


    // $ANTLR start "rule__IteratorGet__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3688:1: rule__IteratorGet__Group__1__Impl : ( ( rule__IteratorGet__IteratorAssignment_1 ) ) ;
    public final void rule__IteratorGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3692:1: ( ( ( rule__IteratorGet__IteratorAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3693:1: ( ( rule__IteratorGet__IteratorAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3693:1: ( ( rule__IteratorGet__IteratorAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3694:1: ( rule__IteratorGet__IteratorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetAccess().getIteratorAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3695:1: ( rule__IteratorGet__IteratorAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3695:2: rule__IteratorGet__IteratorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__IteratorAssignment_1_in_rule__IteratorGet__Group__1__Impl7437);
            rule__IteratorGet__IteratorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetAccess().getIteratorAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__Group__1__Impl"


    // $ANTLR start "rule__IteratorGet__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3705:1: rule__IteratorGet__Group__2 : rule__IteratorGet__Group__2__Impl rule__IteratorGet__Group__3 ;
    public final void rule__IteratorGet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3709:1: ( rule__IteratorGet__Group__2__Impl rule__IteratorGet__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3710:2: rule__IteratorGet__Group__2__Impl rule__IteratorGet__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__Group__2__Impl_in_rule__IteratorGet__Group__27467);
            rule__IteratorGet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__Group__3_in_rule__IteratorGet__Group__27470);
            rule__IteratorGet__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__Group__2"


    // $ANTLR start "rule__IteratorGet__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3717:1: rule__IteratorGet__Group__2__Impl : ( 'method' ) ;
    public final void rule__IteratorGet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3721:1: ( ( 'method' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3722:1: ( 'method' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3722:1: ( 'method' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3723:1: 'method'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetAccess().getMethodKeyword_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__IteratorGet__Group__2__Impl7498); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetAccess().getMethodKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__Group__2__Impl"


    // $ANTLR start "rule__IteratorGet__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3736:1: rule__IteratorGet__Group__3 : rule__IteratorGet__Group__3__Impl ;
    public final void rule__IteratorGet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3740:1: ( rule__IteratorGet__Group__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3741:2: rule__IteratorGet__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__Group__3__Impl_in_rule__IteratorGet__Group__37529);
            rule__IteratorGet__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__Group__3"


    // $ANTLR start "rule__IteratorGet__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3747:1: rule__IteratorGet__Group__3__Impl : ( ( rule__IteratorGet__GetIteratorAssignment_3 ) ) ;
    public final void rule__IteratorGet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3751:1: ( ( ( rule__IteratorGet__GetIteratorAssignment_3 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3752:1: ( ( rule__IteratorGet__GetIteratorAssignment_3 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3752:1: ( ( rule__IteratorGet__GetIteratorAssignment_3 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3753:1: ( rule__IteratorGet__GetIteratorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetAccess().getGetIteratorAssignment_3()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3754:1: ( rule__IteratorGet__GetIteratorAssignment_3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3754:2: rule__IteratorGet__GetIteratorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorGet__GetIteratorAssignment_3_in_rule__IteratorGet__Group__3__Impl7556);
            rule__IteratorGet__GetIteratorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetAccess().getGetIteratorAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__Group__3__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3772:1: rule__IteratorDescription__Group__0 : rule__IteratorDescription__Group__0__Impl rule__IteratorDescription__Group__1 ;
    public final void rule__IteratorDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3776:1: ( rule__IteratorDescription__Group__0__Impl rule__IteratorDescription__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3777:2: rule__IteratorDescription__Group__0__Impl rule__IteratorDescription__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__0__Impl_in_rule__IteratorDescription__Group__07594);
            rule__IteratorDescription__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__1_in_rule__IteratorDescription__Group__07597);
            rule__IteratorDescription__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__0"


    // $ANTLR start "rule__IteratorDescription__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3784:1: rule__IteratorDescription__Group__0__Impl : ( 'iterator' ) ;
    public final void rule__IteratorDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3788:1: ( ( 'iterator' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3789:1: ( 'iterator' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3789:1: ( 'iterator' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3790:1: 'iterator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getIteratorKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__IteratorDescription__Group__0__Impl7625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getIteratorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__0__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3803:1: rule__IteratorDescription__Group__1 : rule__IteratorDescription__Group__1__Impl rule__IteratorDescription__Group__2 ;
    public final void rule__IteratorDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3807:1: ( rule__IteratorDescription__Group__1__Impl rule__IteratorDescription__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3808:2: rule__IteratorDescription__Group__1__Impl rule__IteratorDescription__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__1__Impl_in_rule__IteratorDescription__Group__17656);
            rule__IteratorDescription__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__2_in_rule__IteratorDescription__Group__17659);
            rule__IteratorDescription__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__1"


    // $ANTLR start "rule__IteratorDescription__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3815:1: rule__IteratorDescription__Group__1__Impl : ( ( rule__IteratorDescription__NameAssignment_1 ) ) ;
    public final void rule__IteratorDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3819:1: ( ( ( rule__IteratorDescription__NameAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3820:1: ( ( rule__IteratorDescription__NameAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3820:1: ( ( rule__IteratorDescription__NameAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3821:1: ( rule__IteratorDescription__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3822:1: ( rule__IteratorDescription__NameAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3822:2: rule__IteratorDescription__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__NameAssignment_1_in_rule__IteratorDescription__Group__1__Impl7686);
            rule__IteratorDescription__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__1__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3832:1: rule__IteratorDescription__Group__2 : rule__IteratorDescription__Group__2__Impl rule__IteratorDescription__Group__3 ;
    public final void rule__IteratorDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3836:1: ( rule__IteratorDescription__Group__2__Impl rule__IteratorDescription__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3837:2: rule__IteratorDescription__Group__2__Impl rule__IteratorDescription__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__2__Impl_in_rule__IteratorDescription__Group__27716);
            rule__IteratorDescription__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__3_in_rule__IteratorDescription__Group__27719);
            rule__IteratorDescription__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__2"


    // $ANTLR start "rule__IteratorDescription__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3844:1: rule__IteratorDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__IteratorDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3848:1: ( ( ':' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3849:1: ( ':' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3849:1: ( ':' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3850:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getColonKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__IteratorDescription__Group__2__Impl7747); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__2__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3863:1: rule__IteratorDescription__Group__3 : rule__IteratorDescription__Group__3__Impl rule__IteratorDescription__Group__4 ;
    public final void rule__IteratorDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3867:1: ( rule__IteratorDescription__Group__3__Impl rule__IteratorDescription__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3868:2: rule__IteratorDescription__Group__3__Impl rule__IteratorDescription__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__3__Impl_in_rule__IteratorDescription__Group__37778);
            rule__IteratorDescription__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__4_in_rule__IteratorDescription__Group__37781);
            rule__IteratorDescription__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__3"


    // $ANTLR start "rule__IteratorDescription__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3875:1: rule__IteratorDescription__Group__3__Impl : ( ( rule__IteratorDescription__IteratorClassAssignment_3 ) ) ;
    public final void rule__IteratorDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3879:1: ( ( ( rule__IteratorDescription__IteratorClassAssignment_3 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3880:1: ( ( rule__IteratorDescription__IteratorClassAssignment_3 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3880:1: ( ( rule__IteratorDescription__IteratorClassAssignment_3 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3881:1: ( rule__IteratorDescription__IteratorClassAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getIteratorClassAssignment_3()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3882:1: ( rule__IteratorDescription__IteratorClassAssignment_3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3882:2: rule__IteratorDescription__IteratorClassAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__IteratorClassAssignment_3_in_rule__IteratorDescription__Group__3__Impl7808);
            rule__IteratorDescription__IteratorClassAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getIteratorClassAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__3__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3892:1: rule__IteratorDescription__Group__4 : rule__IteratorDescription__Group__4__Impl rule__IteratorDescription__Group__5 ;
    public final void rule__IteratorDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3896:1: ( rule__IteratorDescription__Group__4__Impl rule__IteratorDescription__Group__5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3897:2: rule__IteratorDescription__Group__4__Impl rule__IteratorDescription__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__4__Impl_in_rule__IteratorDescription__Group__47838);
            rule__IteratorDescription__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__5_in_rule__IteratorDescription__Group__47841);
            rule__IteratorDescription__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__4"


    // $ANTLR start "rule__IteratorDescription__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3904:1: rule__IteratorDescription__Group__4__Impl : ( '{' ) ;
    public final void rule__IteratorDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3908:1: ( ( '{' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3909:1: ( '{' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3909:1: ( '{' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3910:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__IteratorDescription__Group__4__Impl7869); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__4__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3923:1: rule__IteratorDescription__Group__5 : rule__IteratorDescription__Group__5__Impl rule__IteratorDescription__Group__6 ;
    public final void rule__IteratorDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3927:1: ( rule__IteratorDescription__Group__5__Impl rule__IteratorDescription__Group__6 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3928:2: rule__IteratorDescription__Group__5__Impl rule__IteratorDescription__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__5__Impl_in_rule__IteratorDescription__Group__57900);
            rule__IteratorDescription__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__6_in_rule__IteratorDescription__Group__57903);
            rule__IteratorDescription__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__5"


    // $ANTLR start "rule__IteratorDescription__Group__5__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3935:1: rule__IteratorDescription__Group__5__Impl : ( 'finished' ) ;
    public final void rule__IteratorDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3939:1: ( ( 'finished' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3940:1: ( 'finished' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3940:1: ( 'finished' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3941:1: 'finished'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getFinishedKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__IteratorDescription__Group__5__Impl7931); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getFinishedKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__5__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3954:1: rule__IteratorDescription__Group__6 : rule__IteratorDescription__Group__6__Impl rule__IteratorDescription__Group__7 ;
    public final void rule__IteratorDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3958:1: ( rule__IteratorDescription__Group__6__Impl rule__IteratorDescription__Group__7 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3959:2: rule__IteratorDescription__Group__6__Impl rule__IteratorDescription__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__6__Impl_in_rule__IteratorDescription__Group__67962);
            rule__IteratorDescription__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__7_in_rule__IteratorDescription__Group__67965);
            rule__IteratorDescription__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__6"


    // $ANTLR start "rule__IteratorDescription__Group__6__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3966:1: rule__IteratorDescription__Group__6__Impl : ( ( rule__IteratorDescription__HasFinishedAssignment_6 ) ) ;
    public final void rule__IteratorDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3970:1: ( ( ( rule__IteratorDescription__HasFinishedAssignment_6 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3971:1: ( ( rule__IteratorDescription__HasFinishedAssignment_6 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3971:1: ( ( rule__IteratorDescription__HasFinishedAssignment_6 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3972:1: ( rule__IteratorDescription__HasFinishedAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getHasFinishedAssignment_6()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3973:1: ( rule__IteratorDescription__HasFinishedAssignment_6 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3973:2: rule__IteratorDescription__HasFinishedAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__HasFinishedAssignment_6_in_rule__IteratorDescription__Group__6__Impl7992);
            rule__IteratorDescription__HasFinishedAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getHasFinishedAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__6__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__7"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3983:1: rule__IteratorDescription__Group__7 : rule__IteratorDescription__Group__7__Impl rule__IteratorDescription__Group__8 ;
    public final void rule__IteratorDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3987:1: ( rule__IteratorDescription__Group__7__Impl rule__IteratorDescription__Group__8 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3988:2: rule__IteratorDescription__Group__7__Impl rule__IteratorDescription__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__7__Impl_in_rule__IteratorDescription__Group__78022);
            rule__IteratorDescription__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__8_in_rule__IteratorDescription__Group__78025);
            rule__IteratorDescription__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__7"


    // $ANTLR start "rule__IteratorDescription__Group__7__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3995:1: rule__IteratorDescription__Group__7__Impl : ( 'next' ) ;
    public final void rule__IteratorDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:3999:1: ( ( 'next' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4000:1: ( 'next' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4000:1: ( 'next' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4001:1: 'next'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getNextKeyword_7()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__IteratorDescription__Group__7__Impl8053); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getNextKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__7__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__8"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4014:1: rule__IteratorDescription__Group__8 : rule__IteratorDescription__Group__8__Impl rule__IteratorDescription__Group__9 ;
    public final void rule__IteratorDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4018:1: ( rule__IteratorDescription__Group__8__Impl rule__IteratorDescription__Group__9 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4019:2: rule__IteratorDescription__Group__8__Impl rule__IteratorDescription__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__8__Impl_in_rule__IteratorDescription__Group__88084);
            rule__IteratorDescription__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__9_in_rule__IteratorDescription__Group__88087);
            rule__IteratorDescription__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__8"


    // $ANTLR start "rule__IteratorDescription__Group__8__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4026:1: rule__IteratorDescription__Group__8__Impl : ( ( rule__IteratorDescription__NextElementAssignment_8 ) ) ;
    public final void rule__IteratorDescription__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4030:1: ( ( ( rule__IteratorDescription__NextElementAssignment_8 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4031:1: ( ( rule__IteratorDescription__NextElementAssignment_8 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4031:1: ( ( rule__IteratorDescription__NextElementAssignment_8 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4032:1: ( rule__IteratorDescription__NextElementAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getNextElementAssignment_8()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4033:1: ( rule__IteratorDescription__NextElementAssignment_8 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4033:2: rule__IteratorDescription__NextElementAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__NextElementAssignment_8_in_rule__IteratorDescription__Group__8__Impl8114);
            rule__IteratorDescription__NextElementAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getNextElementAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__8__Impl"


    // $ANTLR start "rule__IteratorDescription__Group__9"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4043:1: rule__IteratorDescription__Group__9 : rule__IteratorDescription__Group__9__Impl ;
    public final void rule__IteratorDescription__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4047:1: ( rule__IteratorDescription__Group__9__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4048:2: rule__IteratorDescription__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IteratorDescription__Group__9__Impl_in_rule__IteratorDescription__Group__98144);
            rule__IteratorDescription__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__9"


    // $ANTLR start "rule__IteratorDescription__Group__9__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4054:1: rule__IteratorDescription__Group__9__Impl : ( '}' ) ;
    public final void rule__IteratorDescription__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4058:1: ( ( '}' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4059:1: ( '}' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4059:1: ( '}' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4060:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__IteratorDescription__Group__9__Impl8172); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__Group__9__Impl"


    // $ANTLR start "rule__ObserverDescription__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4093:1: rule__ObserverDescription__Group__0 : rule__ObserverDescription__Group__0__Impl rule__ObserverDescription__Group__1 ;
    public final void rule__ObserverDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4097:1: ( rule__ObserverDescription__Group__0__Impl rule__ObserverDescription__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4098:2: rule__ObserverDescription__Group__0__Impl rule__ObserverDescription__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__0__Impl_in_rule__ObserverDescription__Group__08223);
            rule__ObserverDescription__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__1_in_rule__ObserverDescription__Group__08226);
            rule__ObserverDescription__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__0"


    // $ANTLR start "rule__ObserverDescription__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4105:1: rule__ObserverDescription__Group__0__Impl : ( 'observer' ) ;
    public final void rule__ObserverDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4109:1: ( ( 'observer' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4110:1: ( 'observer' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4110:1: ( 'observer' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4111:1: 'observer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getObserverKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ObserverDescription__Group__0__Impl8254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getObserverKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__0__Impl"


    // $ANTLR start "rule__ObserverDescription__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4124:1: rule__ObserverDescription__Group__1 : rule__ObserverDescription__Group__1__Impl rule__ObserverDescription__Group__2 ;
    public final void rule__ObserverDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4128:1: ( rule__ObserverDescription__Group__1__Impl rule__ObserverDescription__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4129:2: rule__ObserverDescription__Group__1__Impl rule__ObserverDescription__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__1__Impl_in_rule__ObserverDescription__Group__18285);
            rule__ObserverDescription__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__2_in_rule__ObserverDescription__Group__18288);
            rule__ObserverDescription__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__1"


    // $ANTLR start "rule__ObserverDescription__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4136:1: rule__ObserverDescription__Group__1__Impl : ( ( rule__ObserverDescription__NameAssignment_1 ) ) ;
    public final void rule__ObserverDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4140:1: ( ( ( rule__ObserverDescription__NameAssignment_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4141:1: ( ( rule__ObserverDescription__NameAssignment_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4141:1: ( ( rule__ObserverDescription__NameAssignment_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4142:1: ( rule__ObserverDescription__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getNameAssignment_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4143:1: ( rule__ObserverDescription__NameAssignment_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4143:2: rule__ObserverDescription__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__NameAssignment_1_in_rule__ObserverDescription__Group__1__Impl8315);
            rule__ObserverDescription__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__1__Impl"


    // $ANTLR start "rule__ObserverDescription__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4153:1: rule__ObserverDescription__Group__2 : rule__ObserverDescription__Group__2__Impl rule__ObserverDescription__Group__3 ;
    public final void rule__ObserverDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4157:1: ( rule__ObserverDescription__Group__2__Impl rule__ObserverDescription__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4158:2: rule__ObserverDescription__Group__2__Impl rule__ObserverDescription__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__2__Impl_in_rule__ObserverDescription__Group__28345);
            rule__ObserverDescription__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__3_in_rule__ObserverDescription__Group__28348);
            rule__ObserverDescription__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__2"


    // $ANTLR start "rule__ObserverDescription__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4165:1: rule__ObserverDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__ObserverDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4169:1: ( ( ':' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4170:1: ( ':' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4170:1: ( ':' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4171:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getColonKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ObserverDescription__Group__2__Impl8376); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__2__Impl"


    // $ANTLR start "rule__ObserverDescription__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4184:1: rule__ObserverDescription__Group__3 : rule__ObserverDescription__Group__3__Impl rule__ObserverDescription__Group__4 ;
    public final void rule__ObserverDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4188:1: ( rule__ObserverDescription__Group__3__Impl rule__ObserverDescription__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4189:2: rule__ObserverDescription__Group__3__Impl rule__ObserverDescription__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__3__Impl_in_rule__ObserverDescription__Group__38407);
            rule__ObserverDescription__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__4_in_rule__ObserverDescription__Group__38410);
            rule__ObserverDescription__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__3"


    // $ANTLR start "rule__ObserverDescription__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4196:1: rule__ObserverDescription__Group__3__Impl : ( ( rule__ObserverDescription__ObserverClassAssignment_3 ) ) ;
    public final void rule__ObserverDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4200:1: ( ( ( rule__ObserverDescription__ObserverClassAssignment_3 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4201:1: ( ( rule__ObserverDescription__ObserverClassAssignment_3 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4201:1: ( ( rule__ObserverDescription__ObserverClassAssignment_3 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4202:1: ( rule__ObserverDescription__ObserverClassAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getObserverClassAssignment_3()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4203:1: ( rule__ObserverDescription__ObserverClassAssignment_3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4203:2: rule__ObserverDescription__ObserverClassAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__ObserverClassAssignment_3_in_rule__ObserverDescription__Group__3__Impl8437);
            rule__ObserverDescription__ObserverClassAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getObserverClassAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__3__Impl"


    // $ANTLR start "rule__ObserverDescription__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4213:1: rule__ObserverDescription__Group__4 : rule__ObserverDescription__Group__4__Impl rule__ObserverDescription__Group__5 ;
    public final void rule__ObserverDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4217:1: ( rule__ObserverDescription__Group__4__Impl rule__ObserverDescription__Group__5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4218:2: rule__ObserverDescription__Group__4__Impl rule__ObserverDescription__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__4__Impl_in_rule__ObserverDescription__Group__48467);
            rule__ObserverDescription__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__5_in_rule__ObserverDescription__Group__48470);
            rule__ObserverDescription__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__4"


    // $ANTLR start "rule__ObserverDescription__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4225:1: rule__ObserverDescription__Group__4__Impl : ( '{' ) ;
    public final void rule__ObserverDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4229:1: ( ( '{' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4230:1: ( '{' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4230:1: ( '{' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4231:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ObserverDescription__Group__4__Impl8498); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__4__Impl"


    // $ANTLR start "rule__ObserverDescription__Group__5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4244:1: rule__ObserverDescription__Group__5 : rule__ObserverDescription__Group__5__Impl rule__ObserverDescription__Group__6 ;
    public final void rule__ObserverDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4248:1: ( rule__ObserverDescription__Group__5__Impl rule__ObserverDescription__Group__6 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4249:2: rule__ObserverDescription__Group__5__Impl rule__ObserverDescription__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__5__Impl_in_rule__ObserverDescription__Group__58529);
            rule__ObserverDescription__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__6_in_rule__ObserverDescription__Group__58532);
            rule__ObserverDescription__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__5"


    // $ANTLR start "rule__ObserverDescription__Group__5__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4256:1: rule__ObserverDescription__Group__5__Impl : ( ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 ) ) ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 )* ) ) ;
    public final void rule__ObserverDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4260:1: ( ( ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 ) ) ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 )* ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4261:1: ( ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 ) ) ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 )* ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4261:1: ( ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 ) ) ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4262:1: ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 ) ) ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4262:1: ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4263:1: ( rule__ObserverDescription__UpdateMethodsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getUpdateMethodsAssignment_5()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4264:1: ( rule__ObserverDescription__UpdateMethodsAssignment_5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4264:2: rule__ObserverDescription__UpdateMethodsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__UpdateMethodsAssignment_5_in_rule__ObserverDescription__Group__5__Impl8561);
            rule__ObserverDescription__UpdateMethodsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getUpdateMethodsAssignment_5()); 
            }

            }

            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4267:1: ( ( rule__ObserverDescription__UpdateMethodsAssignment_5 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4268:1: ( rule__ObserverDescription__UpdateMethodsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getUpdateMethodsAssignment_5()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4269:1: ( rule__ObserverDescription__UpdateMethodsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4269:2: rule__ObserverDescription__UpdateMethodsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__UpdateMethodsAssignment_5_in_rule__ObserverDescription__Group__5__Impl8573);
            	    rule__ObserverDescription__UpdateMethodsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getUpdateMethodsAssignment_5()); 
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
    // $ANTLR end "rule__ObserverDescription__Group__5__Impl"


    // $ANTLR start "rule__ObserverDescription__Group__6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4280:1: rule__ObserverDescription__Group__6 : rule__ObserverDescription__Group__6__Impl ;
    public final void rule__ObserverDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4284:1: ( rule__ObserverDescription__Group__6__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4285:2: rule__ObserverDescription__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObserverDescription__Group__6__Impl_in_rule__ObserverDescription__Group__68606);
            rule__ObserverDescription__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__6"


    // $ANTLR start "rule__ObserverDescription__Group__6__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4291:1: rule__ObserverDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__ObserverDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4295:1: ( ( '}' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4296:1: ( '}' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4296:1: ( '}' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4297:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ObserverDescription__Group__6__Impl8634); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__Group__6__Impl"


    // $ANTLR start "rule__UpdateMethod__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4324:1: rule__UpdateMethod__Group__0 : rule__UpdateMethod__Group__0__Impl rule__UpdateMethod__Group__1 ;
    public final void rule__UpdateMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4328:1: ( rule__UpdateMethod__Group__0__Impl rule__UpdateMethod__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4329:2: rule__UpdateMethod__Group__0__Impl rule__UpdateMethod__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__0__Impl_in_rule__UpdateMethod__Group__08679);
            rule__UpdateMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__1_in_rule__UpdateMethod__Group__08682);
            rule__UpdateMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__0"


    // $ANTLR start "rule__UpdateMethod__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4336:1: rule__UpdateMethod__Group__0__Impl : ( 'update' ) ;
    public final void rule__UpdateMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4340:1: ( ( 'update' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4341:1: ( 'update' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4341:1: ( 'update' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4342:1: 'update'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getUpdateKeyword_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__UpdateMethod__Group__0__Impl8710); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getUpdateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__0__Impl"


    // $ANTLR start "rule__UpdateMethod__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4355:1: rule__UpdateMethod__Group__1 : rule__UpdateMethod__Group__1__Impl rule__UpdateMethod__Group__2 ;
    public final void rule__UpdateMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4359:1: ( rule__UpdateMethod__Group__1__Impl rule__UpdateMethod__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4360:2: rule__UpdateMethod__Group__1__Impl rule__UpdateMethod__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__1__Impl_in_rule__UpdateMethod__Group__18741);
            rule__UpdateMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__2_in_rule__UpdateMethod__Group__18744);
            rule__UpdateMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__1"


    // $ANTLR start "rule__UpdateMethod__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4367:1: rule__UpdateMethod__Group__1__Impl : ( ( rule__UpdateMethod__Group_1__0 )? ) ;
    public final void rule__UpdateMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4371:1: ( ( ( rule__UpdateMethod__Group_1__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4372:1: ( ( rule__UpdateMethod__Group_1__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4372:1: ( ( rule__UpdateMethod__Group_1__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4373:1: ( rule__UpdateMethod__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getGroup_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4374:1: ( rule__UpdateMethod__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4374:2: rule__UpdateMethod__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1__0_in_rule__UpdateMethod__Group__1__Impl8771);
                    rule__UpdateMethod__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__1__Impl"


    // $ANTLR start "rule__UpdateMethod__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4384:1: rule__UpdateMethod__Group__2 : rule__UpdateMethod__Group__2__Impl rule__UpdateMethod__Group__3 ;
    public final void rule__UpdateMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4388:1: ( rule__UpdateMethod__Group__2__Impl rule__UpdateMethod__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4389:2: rule__UpdateMethod__Group__2__Impl rule__UpdateMethod__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__2__Impl_in_rule__UpdateMethod__Group__28802);
            rule__UpdateMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__3_in_rule__UpdateMethod__Group__28805);
            rule__UpdateMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__2"


    // $ANTLR start "rule__UpdateMethod__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4396:1: rule__UpdateMethod__Group__2__Impl : ( ( rule__UpdateMethod__NameAssignment_2 ) ) ;
    public final void rule__UpdateMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4400:1: ( ( ( rule__UpdateMethod__NameAssignment_2 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4401:1: ( ( rule__UpdateMethod__NameAssignment_2 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4401:1: ( ( rule__UpdateMethod__NameAssignment_2 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4402:1: ( rule__UpdateMethod__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getNameAssignment_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4403:1: ( rule__UpdateMethod__NameAssignment_2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4403:2: rule__UpdateMethod__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__NameAssignment_2_in_rule__UpdateMethod__Group__2__Impl8832);
            rule__UpdateMethod__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__2__Impl"


    // $ANTLR start "rule__UpdateMethod__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4413:1: rule__UpdateMethod__Group__3 : rule__UpdateMethod__Group__3__Impl rule__UpdateMethod__Group__4 ;
    public final void rule__UpdateMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4417:1: ( rule__UpdateMethod__Group__3__Impl rule__UpdateMethod__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4418:2: rule__UpdateMethod__Group__3__Impl rule__UpdateMethod__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__3__Impl_in_rule__UpdateMethod__Group__38862);
            rule__UpdateMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__4_in_rule__UpdateMethod__Group__38865);
            rule__UpdateMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__3"


    // $ANTLR start "rule__UpdateMethod__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4425:1: rule__UpdateMethod__Group__3__Impl : ( '(' ) ;
    public final void rule__UpdateMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4429:1: ( ( '(' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4430:1: ( '(' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4430:1: ( '(' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4431:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__UpdateMethod__Group__3__Impl8893); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__3__Impl"


    // $ANTLR start "rule__UpdateMethod__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4444:1: rule__UpdateMethod__Group__4 : rule__UpdateMethod__Group__4__Impl rule__UpdateMethod__Group__5 ;
    public final void rule__UpdateMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4448:1: ( rule__UpdateMethod__Group__4__Impl rule__UpdateMethod__Group__5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4449:2: rule__UpdateMethod__Group__4__Impl rule__UpdateMethod__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__4__Impl_in_rule__UpdateMethod__Group__48924);
            rule__UpdateMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__5_in_rule__UpdateMethod__Group__48927);
            rule__UpdateMethod__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__4"


    // $ANTLR start "rule__UpdateMethod__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4456:1: rule__UpdateMethod__Group__4__Impl : ( ( rule__UpdateMethod__Group_4__0 )? ) ;
    public final void rule__UpdateMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4460:1: ( ( ( rule__UpdateMethod__Group_4__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4461:1: ( ( rule__UpdateMethod__Group_4__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4461:1: ( ( rule__UpdateMethod__Group_4__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4462:1: ( rule__UpdateMethod__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getGroup_4()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4463:1: ( rule__UpdateMethod__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4463:2: rule__UpdateMethod__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_4__0_in_rule__UpdateMethod__Group__4__Impl8954);
                    rule__UpdateMethod__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__4__Impl"


    // $ANTLR start "rule__UpdateMethod__Group__5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4473:1: rule__UpdateMethod__Group__5 : rule__UpdateMethod__Group__5__Impl rule__UpdateMethod__Group__6 ;
    public final void rule__UpdateMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4477:1: ( rule__UpdateMethod__Group__5__Impl rule__UpdateMethod__Group__6 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4478:2: rule__UpdateMethod__Group__5__Impl rule__UpdateMethod__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__5__Impl_in_rule__UpdateMethod__Group__58985);
            rule__UpdateMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__6_in_rule__UpdateMethod__Group__58988);
            rule__UpdateMethod__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__5"


    // $ANTLR start "rule__UpdateMethod__Group__5__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4485:1: rule__UpdateMethod__Group__5__Impl : ( ')' ) ;
    public final void rule__UpdateMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4489:1: ( ( ')' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4490:1: ( ')' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4490:1: ( ')' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4491:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__UpdateMethod__Group__5__Impl9016); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__5__Impl"


    // $ANTLR start "rule__UpdateMethod__Group__6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4504:1: rule__UpdateMethod__Group__6 : rule__UpdateMethod__Group__6__Impl rule__UpdateMethod__Group__7 ;
    public final void rule__UpdateMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4508:1: ( rule__UpdateMethod__Group__6__Impl rule__UpdateMethod__Group__7 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4509:2: rule__UpdateMethod__Group__6__Impl rule__UpdateMethod__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__6__Impl_in_rule__UpdateMethod__Group__69047);
            rule__UpdateMethod__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__7_in_rule__UpdateMethod__Group__69050);
            rule__UpdateMethod__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__6"


    // $ANTLR start "rule__UpdateMethod__Group__6__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4516:1: rule__UpdateMethod__Group__6__Impl : ( ':' ) ;
    public final void rule__UpdateMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4520:1: ( ( ':' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4521:1: ( ':' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4521:1: ( ':' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4522:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getColonKeyword_6()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__UpdateMethod__Group__6__Impl9078); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getColonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__6__Impl"


    // $ANTLR start "rule__UpdateMethod__Group__7"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4535:1: rule__UpdateMethod__Group__7 : rule__UpdateMethod__Group__7__Impl ;
    public final void rule__UpdateMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4539:1: ( rule__UpdateMethod__Group__7__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4540:2: rule__UpdateMethod__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group__7__Impl_in_rule__UpdateMethod__Group__79109);
            rule__UpdateMethod__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__7"


    // $ANTLR start "rule__UpdateMethod__Group__7__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4546:1: rule__UpdateMethod__Group__7__Impl : ( ( rule__UpdateMethod__Alternatives_7 ) ) ;
    public final void rule__UpdateMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4550:1: ( ( ( rule__UpdateMethod__Alternatives_7 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4551:1: ( ( rule__UpdateMethod__Alternatives_7 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4551:1: ( ( rule__UpdateMethod__Alternatives_7 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4552:1: ( rule__UpdateMethod__Alternatives_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getAlternatives_7()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4553:1: ( rule__UpdateMethod__Alternatives_7 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4553:2: rule__UpdateMethod__Alternatives_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Alternatives_7_in_rule__UpdateMethod__Group__7__Impl9136);
            rule__UpdateMethod__Alternatives_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getAlternatives_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group__7__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_1__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4579:1: rule__UpdateMethod__Group_1__0 : rule__UpdateMethod__Group_1__0__Impl rule__UpdateMethod__Group_1__1 ;
    public final void rule__UpdateMethod__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4583:1: ( rule__UpdateMethod__Group_1__0__Impl rule__UpdateMethod__Group_1__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4584:2: rule__UpdateMethod__Group_1__0__Impl rule__UpdateMethod__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1__0__Impl_in_rule__UpdateMethod__Group_1__09182);
            rule__UpdateMethod__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1__1_in_rule__UpdateMethod__Group_1__09185);
            rule__UpdateMethod__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1__0"


    // $ANTLR start "rule__UpdateMethod__Group_1__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4591:1: rule__UpdateMethod__Group_1__0__Impl : ( '[' ) ;
    public final void rule__UpdateMethod__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4595:1: ( ( '[' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4596:1: ( '[' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4596:1: ( '[' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4597:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__UpdateMethod__Group_1__0__Impl9213); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1__0__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_1__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4610:1: rule__UpdateMethod__Group_1__1 : rule__UpdateMethod__Group_1__1__Impl rule__UpdateMethod__Group_1__2 ;
    public final void rule__UpdateMethod__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4614:1: ( rule__UpdateMethod__Group_1__1__Impl rule__UpdateMethod__Group_1__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4615:2: rule__UpdateMethod__Group_1__1__Impl rule__UpdateMethod__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1__1__Impl_in_rule__UpdateMethod__Group_1__19244);
            rule__UpdateMethod__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1__2_in_rule__UpdateMethod__Group_1__19247);
            rule__UpdateMethod__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1__1"


    // $ANTLR start "rule__UpdateMethod__Group_1__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4622:1: rule__UpdateMethod__Group_1__1__Impl : ( ( rule__UpdateMethod__InterestAssignment_1_1 ) ) ;
    public final void rule__UpdateMethod__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4626:1: ( ( ( rule__UpdateMethod__InterestAssignment_1_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4627:1: ( ( rule__UpdateMethod__InterestAssignment_1_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4627:1: ( ( rule__UpdateMethod__InterestAssignment_1_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4628:1: ( rule__UpdateMethod__InterestAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getInterestAssignment_1_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4629:1: ( rule__UpdateMethod__InterestAssignment_1_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4629:2: rule__UpdateMethod__InterestAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__InterestAssignment_1_1_in_rule__UpdateMethod__Group_1__1__Impl9274);
            rule__UpdateMethod__InterestAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getInterestAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1__1__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_1__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4639:1: rule__UpdateMethod__Group_1__2 : rule__UpdateMethod__Group_1__2__Impl rule__UpdateMethod__Group_1__3 ;
    public final void rule__UpdateMethod__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4643:1: ( rule__UpdateMethod__Group_1__2__Impl rule__UpdateMethod__Group_1__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4644:2: rule__UpdateMethod__Group_1__2__Impl rule__UpdateMethod__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1__2__Impl_in_rule__UpdateMethod__Group_1__29304);
            rule__UpdateMethod__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1__3_in_rule__UpdateMethod__Group_1__29307);
            rule__UpdateMethod__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1__2"


    // $ANTLR start "rule__UpdateMethod__Group_1__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4651:1: rule__UpdateMethod__Group_1__2__Impl : ( ( rule__UpdateMethod__Group_1_2__0 )* ) ;
    public final void rule__UpdateMethod__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4655:1: ( ( ( rule__UpdateMethod__Group_1_2__0 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4656:1: ( ( rule__UpdateMethod__Group_1_2__0 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4656:1: ( ( rule__UpdateMethod__Group_1_2__0 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4657:1: ( rule__UpdateMethod__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getGroup_1_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4658:1: ( rule__UpdateMethod__Group_1_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4658:2: rule__UpdateMethod__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1_2__0_in_rule__UpdateMethod__Group_1__2__Impl9334);
            	    rule__UpdateMethod__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1__2__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_1__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4668:1: rule__UpdateMethod__Group_1__3 : rule__UpdateMethod__Group_1__3__Impl ;
    public final void rule__UpdateMethod__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4672:1: ( rule__UpdateMethod__Group_1__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4673:2: rule__UpdateMethod__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1__3__Impl_in_rule__UpdateMethod__Group_1__39365);
            rule__UpdateMethod__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1__3"


    // $ANTLR start "rule__UpdateMethod__Group_1__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4679:1: rule__UpdateMethod__Group_1__3__Impl : ( ']' ) ;
    public final void rule__UpdateMethod__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4683:1: ( ( ']' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4684:1: ( ']' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4684:1: ( ']' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4685:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__UpdateMethod__Group_1__3__Impl9393); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getRightSquareBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1__3__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_1_2__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4706:1: rule__UpdateMethod__Group_1_2__0 : rule__UpdateMethod__Group_1_2__0__Impl rule__UpdateMethod__Group_1_2__1 ;
    public final void rule__UpdateMethod__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4710:1: ( rule__UpdateMethod__Group_1_2__0__Impl rule__UpdateMethod__Group_1_2__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4711:2: rule__UpdateMethod__Group_1_2__0__Impl rule__UpdateMethod__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1_2__0__Impl_in_rule__UpdateMethod__Group_1_2__09432);
            rule__UpdateMethod__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1_2__1_in_rule__UpdateMethod__Group_1_2__09435);
            rule__UpdateMethod__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1_2__0"


    // $ANTLR start "rule__UpdateMethod__Group_1_2__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4718:1: rule__UpdateMethod__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__UpdateMethod__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4722:1: ( ( ',' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4723:1: ( ',' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4723:1: ( ',' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4724:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__UpdateMethod__Group_1_2__0__Impl9463); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1_2__0__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_1_2__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4737:1: rule__UpdateMethod__Group_1_2__1 : rule__UpdateMethod__Group_1_2__1__Impl ;
    public final void rule__UpdateMethod__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4741:1: ( rule__UpdateMethod__Group_1_2__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4742:2: rule__UpdateMethod__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_1_2__1__Impl_in_rule__UpdateMethod__Group_1_2__19494);
            rule__UpdateMethod__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1_2__1"


    // $ANTLR start "rule__UpdateMethod__Group_1_2__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4748:1: rule__UpdateMethod__Group_1_2__1__Impl : ( ( rule__UpdateMethod__InterestAssignment_1_2_1 ) ) ;
    public final void rule__UpdateMethod__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4752:1: ( ( ( rule__UpdateMethod__InterestAssignment_1_2_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4753:1: ( ( rule__UpdateMethod__InterestAssignment_1_2_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4753:1: ( ( rule__UpdateMethod__InterestAssignment_1_2_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4754:1: ( rule__UpdateMethod__InterestAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getInterestAssignment_1_2_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4755:1: ( rule__UpdateMethod__InterestAssignment_1_2_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4755:2: rule__UpdateMethod__InterestAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__InterestAssignment_1_2_1_in_rule__UpdateMethod__Group_1_2__1__Impl9521);
            rule__UpdateMethod__InterestAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getInterestAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_1_2__1__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_4__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4769:1: rule__UpdateMethod__Group_4__0 : rule__UpdateMethod__Group_4__0__Impl rule__UpdateMethod__Group_4__1 ;
    public final void rule__UpdateMethod__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4773:1: ( rule__UpdateMethod__Group_4__0__Impl rule__UpdateMethod__Group_4__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4774:2: rule__UpdateMethod__Group_4__0__Impl rule__UpdateMethod__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_4__0__Impl_in_rule__UpdateMethod__Group_4__09555);
            rule__UpdateMethod__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_4__1_in_rule__UpdateMethod__Group_4__09558);
            rule__UpdateMethod__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_4__0"


    // $ANTLR start "rule__UpdateMethod__Group_4__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4781:1: rule__UpdateMethod__Group_4__0__Impl : ( ( rule__UpdateMethod__ParameterTypesAssignment_4_0 ) ) ;
    public final void rule__UpdateMethod__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4785:1: ( ( ( rule__UpdateMethod__ParameterTypesAssignment_4_0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4786:1: ( ( rule__UpdateMethod__ParameterTypesAssignment_4_0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4786:1: ( ( rule__UpdateMethod__ParameterTypesAssignment_4_0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4787:1: ( rule__UpdateMethod__ParameterTypesAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getParameterTypesAssignment_4_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4788:1: ( rule__UpdateMethod__ParameterTypesAssignment_4_0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4788:2: rule__UpdateMethod__ParameterTypesAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__ParameterTypesAssignment_4_0_in_rule__UpdateMethod__Group_4__0__Impl9585);
            rule__UpdateMethod__ParameterTypesAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getParameterTypesAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_4__0__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_4__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4798:1: rule__UpdateMethod__Group_4__1 : rule__UpdateMethod__Group_4__1__Impl ;
    public final void rule__UpdateMethod__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4802:1: ( rule__UpdateMethod__Group_4__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4803:2: rule__UpdateMethod__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_4__1__Impl_in_rule__UpdateMethod__Group_4__19615);
            rule__UpdateMethod__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_4__1"


    // $ANTLR start "rule__UpdateMethod__Group_4__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4809:1: rule__UpdateMethod__Group_4__1__Impl : ( ( rule__UpdateMethod__Group_4_1__0 )* ) ;
    public final void rule__UpdateMethod__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4813:1: ( ( ( rule__UpdateMethod__Group_4_1__0 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4814:1: ( ( rule__UpdateMethod__Group_4_1__0 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4814:1: ( ( rule__UpdateMethod__Group_4_1__0 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4815:1: ( rule__UpdateMethod__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getGroup_4_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4816:1: ( rule__UpdateMethod__Group_4_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4816:2: rule__UpdateMethod__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_4_1__0_in_rule__UpdateMethod__Group_4__1__Impl9642);
            	    rule__UpdateMethod__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_4__1__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_4_1__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4830:1: rule__UpdateMethod__Group_4_1__0 : rule__UpdateMethod__Group_4_1__0__Impl rule__UpdateMethod__Group_4_1__1 ;
    public final void rule__UpdateMethod__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4834:1: ( rule__UpdateMethod__Group_4_1__0__Impl rule__UpdateMethod__Group_4_1__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4835:2: rule__UpdateMethod__Group_4_1__0__Impl rule__UpdateMethod__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_4_1__0__Impl_in_rule__UpdateMethod__Group_4_1__09677);
            rule__UpdateMethod__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_4_1__1_in_rule__UpdateMethod__Group_4_1__09680);
            rule__UpdateMethod__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_4_1__0"


    // $ANTLR start "rule__UpdateMethod__Group_4_1__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4842:1: rule__UpdateMethod__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__UpdateMethod__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4846:1: ( ( ',' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4847:1: ( ',' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4847:1: ( ',' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4848:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__UpdateMethod__Group_4_1__0__Impl9708); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getCommaKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_4_1__0__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_4_1__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4861:1: rule__UpdateMethod__Group_4_1__1 : rule__UpdateMethod__Group_4_1__1__Impl ;
    public final void rule__UpdateMethod__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4865:1: ( rule__UpdateMethod__Group_4_1__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4866:2: rule__UpdateMethod__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_4_1__1__Impl_in_rule__UpdateMethod__Group_4_1__19739);
            rule__UpdateMethod__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_4_1__1"


    // $ANTLR start "rule__UpdateMethod__Group_4_1__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4872:1: rule__UpdateMethod__Group_4_1__1__Impl : ( ( rule__UpdateMethod__ParameterTypesAssignment_4_1_1 ) ) ;
    public final void rule__UpdateMethod__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4876:1: ( ( ( rule__UpdateMethod__ParameterTypesAssignment_4_1_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4877:1: ( ( rule__UpdateMethod__ParameterTypesAssignment_4_1_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4877:1: ( ( rule__UpdateMethod__ParameterTypesAssignment_4_1_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4878:1: ( rule__UpdateMethod__ParameterTypesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getParameterTypesAssignment_4_1_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4879:1: ( rule__UpdateMethod__ParameterTypesAssignment_4_1_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4879:2: rule__UpdateMethod__ParameterTypesAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__ParameterTypesAssignment_4_1_1_in_rule__UpdateMethod__Group_4_1__1__Impl9766);
            rule__UpdateMethod__ParameterTypesAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getParameterTypesAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_4_1__1__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_7_0__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4893:1: rule__UpdateMethod__Group_7_0__0 : rule__UpdateMethod__Group_7_0__0__Impl rule__UpdateMethod__Group_7_0__1 ;
    public final void rule__UpdateMethod__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4897:1: ( rule__UpdateMethod__Group_7_0__0__Impl rule__UpdateMethod__Group_7_0__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4898:2: rule__UpdateMethod__Group_7_0__0__Impl rule__UpdateMethod__Group_7_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_0__0__Impl_in_rule__UpdateMethod__Group_7_0__09800);
            rule__UpdateMethod__Group_7_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_0__1_in_rule__UpdateMethod__Group_7_0__09803);
            rule__UpdateMethod__Group_7_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_0__0"


    // $ANTLR start "rule__UpdateMethod__Group_7_0__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4905:1: rule__UpdateMethod__Group_7_0__0__Impl : ( ( rule__UpdateMethod__ReturnArrayAssignment_7_0_0 ) ) ;
    public final void rule__UpdateMethod__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4909:1: ( ( ( rule__UpdateMethod__ReturnArrayAssignment_7_0_0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4910:1: ( ( rule__UpdateMethod__ReturnArrayAssignment_7_0_0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4910:1: ( ( rule__UpdateMethod__ReturnArrayAssignment_7_0_0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4911:1: ( rule__UpdateMethod__ReturnArrayAssignment_7_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnArrayAssignment_7_0_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4912:1: ( rule__UpdateMethod__ReturnArrayAssignment_7_0_0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4912:2: rule__UpdateMethod__ReturnArrayAssignment_7_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__ReturnArrayAssignment_7_0_0_in_rule__UpdateMethod__Group_7_0__0__Impl9830);
            rule__UpdateMethod__ReturnArrayAssignment_7_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnArrayAssignment_7_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_0__0__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_7_0__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4922:1: rule__UpdateMethod__Group_7_0__1 : rule__UpdateMethod__Group_7_0__1__Impl rule__UpdateMethod__Group_7_0__2 ;
    public final void rule__UpdateMethod__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4926:1: ( rule__UpdateMethod__Group_7_0__1__Impl rule__UpdateMethod__Group_7_0__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4927:2: rule__UpdateMethod__Group_7_0__1__Impl rule__UpdateMethod__Group_7_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_0__1__Impl_in_rule__UpdateMethod__Group_7_0__19860);
            rule__UpdateMethod__Group_7_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_0__2_in_rule__UpdateMethod__Group_7_0__19863);
            rule__UpdateMethod__Group_7_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_0__1"


    // $ANTLR start "rule__UpdateMethod__Group_7_0__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4934:1: rule__UpdateMethod__Group_7_0__1__Impl : ( '<' ) ;
    public final void rule__UpdateMethod__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4938:1: ( ( '<' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4939:1: ( '<' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4939:1: ( '<' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4940:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getLessThanSignKeyword_7_0_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__UpdateMethod__Group_7_0__1__Impl9891); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getLessThanSignKeyword_7_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_0__1__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_7_0__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4953:1: rule__UpdateMethod__Group_7_0__2 : rule__UpdateMethod__Group_7_0__2__Impl rule__UpdateMethod__Group_7_0__3 ;
    public final void rule__UpdateMethod__Group_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4957:1: ( rule__UpdateMethod__Group_7_0__2__Impl rule__UpdateMethod__Group_7_0__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4958:2: rule__UpdateMethod__Group_7_0__2__Impl rule__UpdateMethod__Group_7_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_0__2__Impl_in_rule__UpdateMethod__Group_7_0__29922);
            rule__UpdateMethod__Group_7_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_0__3_in_rule__UpdateMethod__Group_7_0__29925);
            rule__UpdateMethod__Group_7_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_0__2"


    // $ANTLR start "rule__UpdateMethod__Group_7_0__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4965:1: rule__UpdateMethod__Group_7_0__2__Impl : ( ( rule__UpdateMethod__ReturnTypeAssignment_7_0_2 ) ) ;
    public final void rule__UpdateMethod__Group_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4969:1: ( ( ( rule__UpdateMethod__ReturnTypeAssignment_7_0_2 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4970:1: ( ( rule__UpdateMethod__ReturnTypeAssignment_7_0_2 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4970:1: ( ( rule__UpdateMethod__ReturnTypeAssignment_7_0_2 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4971:1: ( rule__UpdateMethod__ReturnTypeAssignment_7_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnTypeAssignment_7_0_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4972:1: ( rule__UpdateMethod__ReturnTypeAssignment_7_0_2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4972:2: rule__UpdateMethod__ReturnTypeAssignment_7_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__ReturnTypeAssignment_7_0_2_in_rule__UpdateMethod__Group_7_0__2__Impl9952);
            rule__UpdateMethod__ReturnTypeAssignment_7_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnTypeAssignment_7_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_0__2__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_7_0__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4982:1: rule__UpdateMethod__Group_7_0__3 : rule__UpdateMethod__Group_7_0__3__Impl ;
    public final void rule__UpdateMethod__Group_7_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4986:1: ( rule__UpdateMethod__Group_7_0__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4987:2: rule__UpdateMethod__Group_7_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_0__3__Impl_in_rule__UpdateMethod__Group_7_0__39982);
            rule__UpdateMethod__Group_7_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_0__3"


    // $ANTLR start "rule__UpdateMethod__Group_7_0__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4993:1: rule__UpdateMethod__Group_7_0__3__Impl : ( '>' ) ;
    public final void rule__UpdateMethod__Group_7_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4997:1: ( ( '>' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4998:1: ( '>' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4998:1: ( '>' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:4999:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getGreaterThanSignKeyword_7_0_3()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__UpdateMethod__Group_7_0__3__Impl10010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getGreaterThanSignKeyword_7_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_0__3__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_7_1__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5020:1: rule__UpdateMethod__Group_7_1__0 : rule__UpdateMethod__Group_7_1__0__Impl rule__UpdateMethod__Group_7_1__1 ;
    public final void rule__UpdateMethod__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5024:1: ( rule__UpdateMethod__Group_7_1__0__Impl rule__UpdateMethod__Group_7_1__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5025:2: rule__UpdateMethod__Group_7_1__0__Impl rule__UpdateMethod__Group_7_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_1__0__Impl_in_rule__UpdateMethod__Group_7_1__010049);
            rule__UpdateMethod__Group_7_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_1__1_in_rule__UpdateMethod__Group_7_1__010052);
            rule__UpdateMethod__Group_7_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_1__0"


    // $ANTLR start "rule__UpdateMethod__Group_7_1__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5032:1: rule__UpdateMethod__Group_7_1__0__Impl : ( ( rule__UpdateMethod__ReturnCollectionAssignment_7_1_0 ) ) ;
    public final void rule__UpdateMethod__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5036:1: ( ( ( rule__UpdateMethod__ReturnCollectionAssignment_7_1_0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5037:1: ( ( rule__UpdateMethod__ReturnCollectionAssignment_7_1_0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5037:1: ( ( rule__UpdateMethod__ReturnCollectionAssignment_7_1_0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5038:1: ( rule__UpdateMethod__ReturnCollectionAssignment_7_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnCollectionAssignment_7_1_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5039:1: ( rule__UpdateMethod__ReturnCollectionAssignment_7_1_0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5039:2: rule__UpdateMethod__ReturnCollectionAssignment_7_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__ReturnCollectionAssignment_7_1_0_in_rule__UpdateMethod__Group_7_1__0__Impl10079);
            rule__UpdateMethod__ReturnCollectionAssignment_7_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnCollectionAssignment_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_1__0__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_7_1__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5049:1: rule__UpdateMethod__Group_7_1__1 : rule__UpdateMethod__Group_7_1__1__Impl rule__UpdateMethod__Group_7_1__2 ;
    public final void rule__UpdateMethod__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5053:1: ( rule__UpdateMethod__Group_7_1__1__Impl rule__UpdateMethod__Group_7_1__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5054:2: rule__UpdateMethod__Group_7_1__1__Impl rule__UpdateMethod__Group_7_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_1__1__Impl_in_rule__UpdateMethod__Group_7_1__110109);
            rule__UpdateMethod__Group_7_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_1__2_in_rule__UpdateMethod__Group_7_1__110112);
            rule__UpdateMethod__Group_7_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_1__1"


    // $ANTLR start "rule__UpdateMethod__Group_7_1__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5061:1: rule__UpdateMethod__Group_7_1__1__Impl : ( '<' ) ;
    public final void rule__UpdateMethod__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5065:1: ( ( '<' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5066:1: ( '<' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5066:1: ( '<' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5067:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getLessThanSignKeyword_7_1_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__UpdateMethod__Group_7_1__1__Impl10140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getLessThanSignKeyword_7_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_1__1__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_7_1__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5080:1: rule__UpdateMethod__Group_7_1__2 : rule__UpdateMethod__Group_7_1__2__Impl rule__UpdateMethod__Group_7_1__3 ;
    public final void rule__UpdateMethod__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5084:1: ( rule__UpdateMethod__Group_7_1__2__Impl rule__UpdateMethod__Group_7_1__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5085:2: rule__UpdateMethod__Group_7_1__2__Impl rule__UpdateMethod__Group_7_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_1__2__Impl_in_rule__UpdateMethod__Group_7_1__210171);
            rule__UpdateMethod__Group_7_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_1__3_in_rule__UpdateMethod__Group_7_1__210174);
            rule__UpdateMethod__Group_7_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_1__2"


    // $ANTLR start "rule__UpdateMethod__Group_7_1__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5092:1: rule__UpdateMethod__Group_7_1__2__Impl : ( ( rule__UpdateMethod__ReturnTypeAssignment_7_1_2 ) ) ;
    public final void rule__UpdateMethod__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5096:1: ( ( ( rule__UpdateMethod__ReturnTypeAssignment_7_1_2 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5097:1: ( ( rule__UpdateMethod__ReturnTypeAssignment_7_1_2 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5097:1: ( ( rule__UpdateMethod__ReturnTypeAssignment_7_1_2 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5098:1: ( rule__UpdateMethod__ReturnTypeAssignment_7_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnTypeAssignment_7_1_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5099:1: ( rule__UpdateMethod__ReturnTypeAssignment_7_1_2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5099:2: rule__UpdateMethod__ReturnTypeAssignment_7_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__ReturnTypeAssignment_7_1_2_in_rule__UpdateMethod__Group_7_1__2__Impl10201);
            rule__UpdateMethod__ReturnTypeAssignment_7_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnTypeAssignment_7_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_1__2__Impl"


    // $ANTLR start "rule__UpdateMethod__Group_7_1__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5109:1: rule__UpdateMethod__Group_7_1__3 : rule__UpdateMethod__Group_7_1__3__Impl ;
    public final void rule__UpdateMethod__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5113:1: ( rule__UpdateMethod__Group_7_1__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5114:2: rule__UpdateMethod__Group_7_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UpdateMethod__Group_7_1__3__Impl_in_rule__UpdateMethod__Group_7_1__310231);
            rule__UpdateMethod__Group_7_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_1__3"


    // $ANTLR start "rule__UpdateMethod__Group_7_1__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5120:1: rule__UpdateMethod__Group_7_1__3__Impl : ( '>' ) ;
    public final void rule__UpdateMethod__Group_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5124:1: ( ( '>' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5125:1: ( '>' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5125:1: ( '>' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5126:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getGreaterThanSignKeyword_7_1_3()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__UpdateMethod__Group_7_1__3__Impl10259); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getGreaterThanSignKeyword_7_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__Group_7_1__3__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5147:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5151:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5152:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__010298);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__1_in_rule__Method__Group__010301);
            rule__Method__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5159:1: rule__Method__Group__0__Impl : ( ( rule__Method__NameAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5163:1: ( ( ( rule__Method__NameAssignment_0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5164:1: ( ( rule__Method__NameAssignment_0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5164:1: ( ( rule__Method__NameAssignment_0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5165:1: ( rule__Method__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5166:1: ( rule__Method__NameAssignment_0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5166:2: rule__Method__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__NameAssignment_0_in_rule__Method__Group__0__Impl10328);
            rule__Method__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5176:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5180:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5181:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__110358);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__2_in_rule__Method__Group__110361);
            rule__Method__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5188:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5192:1: ( ( '(' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5193:1: ( '(' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5193:1: ( '(' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5194:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Method__Group__1__Impl10389); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5207:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5211:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5212:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__210420);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__3_in_rule__Method__Group__210423);
            rule__Method__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5219:1: rule__Method__Group__2__Impl : ( ( rule__Method__Group_2__0 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5223:1: ( ( ( rule__Method__Group_2__0 )? ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5224:1: ( ( rule__Method__Group_2__0 )? )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5224:1: ( ( rule__Method__Group_2__0 )? )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5225:1: ( rule__Method__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5226:1: ( rule__Method__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5226:2: rule__Method__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__0_in_rule__Method__Group__2__Impl10450);
                    rule__Method__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5236:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5240:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5241:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__310481);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__4_in_rule__Method__Group__310484);
            rule__Method__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5248:1: rule__Method__Group__3__Impl : ( ')' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5252:1: ( ( ')' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5253:1: ( ')' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5253:1: ( ')' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5254:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Method__Group__3__Impl10512); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5267:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5271:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5272:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__410543);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__5_in_rule__Method__Group__410546);
            rule__Method__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5279:1: rule__Method__Group__4__Impl : ( ':' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5283:1: ( ( ':' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5284:1: ( ':' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5284:1: ( ':' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5285:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getColonKeyword_4()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Method__Group__4__Impl10574); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getColonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5298:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5302:1: ( rule__Method__Group__5__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5303:2: rule__Method__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__510605);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5309:1: rule__Method__Group__5__Impl : ( ( rule__Method__Alternatives_5 ) ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5313:1: ( ( ( rule__Method__Alternatives_5 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5314:1: ( ( rule__Method__Alternatives_5 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5314:1: ( ( rule__Method__Alternatives_5 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5315:1: ( rule__Method__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives_5()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5316:1: ( rule__Method__Alternatives_5 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5316:2: rule__Method__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Alternatives_5_in_rule__Method__Group__5__Impl10632);
            rule__Method__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAlternatives_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_2__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5338:1: rule__Method__Group_2__0 : rule__Method__Group_2__0__Impl rule__Method__Group_2__1 ;
    public final void rule__Method__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5342:1: ( rule__Method__Group_2__0__Impl rule__Method__Group_2__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5343:2: rule__Method__Group_2__0__Impl rule__Method__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__0__Impl_in_rule__Method__Group_2__010674);
            rule__Method__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__1_in_rule__Method__Group_2__010677);
            rule__Method__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__0"


    // $ANTLR start "rule__Method__Group_2__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5350:1: rule__Method__Group_2__0__Impl : ( ( rule__Method__ParameterTypesAssignment_2_0 ) ) ;
    public final void rule__Method__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5354:1: ( ( ( rule__Method__ParameterTypesAssignment_2_0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5355:1: ( ( rule__Method__ParameterTypesAssignment_2_0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5355:1: ( ( rule__Method__ParameterTypesAssignment_2_0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5356:1: ( rule__Method__ParameterTypesAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParameterTypesAssignment_2_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5357:1: ( rule__Method__ParameterTypesAssignment_2_0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5357:2: rule__Method__ParameterTypesAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__ParameterTypesAssignment_2_0_in_rule__Method__Group_2__0__Impl10704);
            rule__Method__ParameterTypesAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParameterTypesAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__0__Impl"


    // $ANTLR start "rule__Method__Group_2__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5367:1: rule__Method__Group_2__1 : rule__Method__Group_2__1__Impl ;
    public final void rule__Method__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5371:1: ( rule__Method__Group_2__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5372:2: rule__Method__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__1__Impl_in_rule__Method__Group_2__110734);
            rule__Method__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__1"


    // $ANTLR start "rule__Method__Group_2__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5378:1: rule__Method__Group_2__1__Impl : ( ( rule__Method__Group_2_1__0 )* ) ;
    public final void rule__Method__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5382:1: ( ( ( rule__Method__Group_2_1__0 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5383:1: ( ( rule__Method__Group_2_1__0 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5383:1: ( ( rule__Method__Group_2_1__0 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5384:1: ( rule__Method__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_2_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5385:1: ( rule__Method__Group_2_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5385:2: rule__Method__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_1__0_in_rule__Method__Group_2__1__Impl10761);
            	    rule__Method__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__1__Impl"


    // $ANTLR start "rule__Method__Group_2_1__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5399:1: rule__Method__Group_2_1__0 : rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 ;
    public final void rule__Method__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5403:1: ( rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5404:2: rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_1__0__Impl_in_rule__Method__Group_2_1__010796);
            rule__Method__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_1__1_in_rule__Method__Group_2_1__010799);
            rule__Method__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__0"


    // $ANTLR start "rule__Method__Group_2_1__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5411:1: rule__Method__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5415:1: ( ( ',' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5416:1: ( ',' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5416:1: ( ',' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5417:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Method__Group_2_1__0__Impl10827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__0__Impl"


    // $ANTLR start "rule__Method__Group_2_1__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5430:1: rule__Method__Group_2_1__1 : rule__Method__Group_2_1__1__Impl ;
    public final void rule__Method__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5434:1: ( rule__Method__Group_2_1__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5435:2: rule__Method__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_1__1__Impl_in_rule__Method__Group_2_1__110858);
            rule__Method__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__1"


    // $ANTLR start "rule__Method__Group_2_1__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5441:1: rule__Method__Group_2_1__1__Impl : ( ( rule__Method__ParameterTypesAssignment_2_1_1 ) ) ;
    public final void rule__Method__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5445:1: ( ( ( rule__Method__ParameterTypesAssignment_2_1_1 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5446:1: ( ( rule__Method__ParameterTypesAssignment_2_1_1 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5446:1: ( ( rule__Method__ParameterTypesAssignment_2_1_1 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5447:1: ( rule__Method__ParameterTypesAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParameterTypesAssignment_2_1_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5448:1: ( rule__Method__ParameterTypesAssignment_2_1_1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5448:2: rule__Method__ParameterTypesAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__ParameterTypesAssignment_2_1_1_in_rule__Method__Group_2_1__1__Impl10885);
            rule__Method__ParameterTypesAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParameterTypesAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__1__Impl"


    // $ANTLR start "rule__Method__Group_5_0__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5462:1: rule__Method__Group_5_0__0 : rule__Method__Group_5_0__0__Impl rule__Method__Group_5_0__1 ;
    public final void rule__Method__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5466:1: ( rule__Method__Group_5_0__0__Impl rule__Method__Group_5_0__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5467:2: rule__Method__Group_5_0__0__Impl rule__Method__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_0__0__Impl_in_rule__Method__Group_5_0__010919);
            rule__Method__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_0__1_in_rule__Method__Group_5_0__010922);
            rule__Method__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_0__0"


    // $ANTLR start "rule__Method__Group_5_0__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5474:1: rule__Method__Group_5_0__0__Impl : ( ( rule__Method__ReturnArrayAssignment_5_0_0 ) ) ;
    public final void rule__Method__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5478:1: ( ( ( rule__Method__ReturnArrayAssignment_5_0_0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5479:1: ( ( rule__Method__ReturnArrayAssignment_5_0_0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5479:1: ( ( rule__Method__ReturnArrayAssignment_5_0_0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5480:1: ( rule__Method__ReturnArrayAssignment_5_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnArrayAssignment_5_0_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5481:1: ( rule__Method__ReturnArrayAssignment_5_0_0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5481:2: rule__Method__ReturnArrayAssignment_5_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__ReturnArrayAssignment_5_0_0_in_rule__Method__Group_5_0__0__Impl10949);
            rule__Method__ReturnArrayAssignment_5_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnArrayAssignment_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_0__0__Impl"


    // $ANTLR start "rule__Method__Group_5_0__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5491:1: rule__Method__Group_5_0__1 : rule__Method__Group_5_0__1__Impl rule__Method__Group_5_0__2 ;
    public final void rule__Method__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5495:1: ( rule__Method__Group_5_0__1__Impl rule__Method__Group_5_0__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5496:2: rule__Method__Group_5_0__1__Impl rule__Method__Group_5_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_0__1__Impl_in_rule__Method__Group_5_0__110979);
            rule__Method__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_0__2_in_rule__Method__Group_5_0__110982);
            rule__Method__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_0__1"


    // $ANTLR start "rule__Method__Group_5_0__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5503:1: rule__Method__Group_5_0__1__Impl : ( '<' ) ;
    public final void rule__Method__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5507:1: ( ( '<' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5508:1: ( '<' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5508:1: ( '<' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5509:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLessThanSignKeyword_5_0_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Method__Group_5_0__1__Impl11010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLessThanSignKeyword_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_0__1__Impl"


    // $ANTLR start "rule__Method__Group_5_0__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5522:1: rule__Method__Group_5_0__2 : rule__Method__Group_5_0__2__Impl rule__Method__Group_5_0__3 ;
    public final void rule__Method__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5526:1: ( rule__Method__Group_5_0__2__Impl rule__Method__Group_5_0__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5527:2: rule__Method__Group_5_0__2__Impl rule__Method__Group_5_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_0__2__Impl_in_rule__Method__Group_5_0__211041);
            rule__Method__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_0__3_in_rule__Method__Group_5_0__211044);
            rule__Method__Group_5_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_0__2"


    // $ANTLR start "rule__Method__Group_5_0__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5534:1: rule__Method__Group_5_0__2__Impl : ( ( rule__Method__ReturnTypeAssignment_5_0_2 ) ) ;
    public final void rule__Method__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5538:1: ( ( ( rule__Method__ReturnTypeAssignment_5_0_2 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5539:1: ( ( rule__Method__ReturnTypeAssignment_5_0_2 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5539:1: ( ( rule__Method__ReturnTypeAssignment_5_0_2 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5540:1: ( rule__Method__ReturnTypeAssignment_5_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_0_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5541:1: ( rule__Method__ReturnTypeAssignment_5_0_2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5541:2: rule__Method__ReturnTypeAssignment_5_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__ReturnTypeAssignment_5_0_2_in_rule__Method__Group_5_0__2__Impl11071);
            rule__Method__ReturnTypeAssignment_5_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_0__2__Impl"


    // $ANTLR start "rule__Method__Group_5_0__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5551:1: rule__Method__Group_5_0__3 : rule__Method__Group_5_0__3__Impl ;
    public final void rule__Method__Group_5_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5555:1: ( rule__Method__Group_5_0__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5556:2: rule__Method__Group_5_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_0__3__Impl_in_rule__Method__Group_5_0__311101);
            rule__Method__Group_5_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_0__3"


    // $ANTLR start "rule__Method__Group_5_0__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5562:1: rule__Method__Group_5_0__3__Impl : ( '>' ) ;
    public final void rule__Method__Group_5_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5566:1: ( ( '>' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5567:1: ( '>' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5567:1: ( '>' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5568:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGreaterThanSignKeyword_5_0_3()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Method__Group_5_0__3__Impl11129); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGreaterThanSignKeyword_5_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_0__3__Impl"


    // $ANTLR start "rule__Method__Group_5_1__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5589:1: rule__Method__Group_5_1__0 : rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1 ;
    public final void rule__Method__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5593:1: ( rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5594:2: rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_1__0__Impl_in_rule__Method__Group_5_1__011168);
            rule__Method__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_1__1_in_rule__Method__Group_5_1__011171);
            rule__Method__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__0"


    // $ANTLR start "rule__Method__Group_5_1__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5601:1: rule__Method__Group_5_1__0__Impl : ( ( rule__Method__ReturnCollectionAssignment_5_1_0 ) ) ;
    public final void rule__Method__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5605:1: ( ( ( rule__Method__ReturnCollectionAssignment_5_1_0 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5606:1: ( ( rule__Method__ReturnCollectionAssignment_5_1_0 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5606:1: ( ( rule__Method__ReturnCollectionAssignment_5_1_0 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5607:1: ( rule__Method__ReturnCollectionAssignment_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnCollectionAssignment_5_1_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5608:1: ( rule__Method__ReturnCollectionAssignment_5_1_0 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5608:2: rule__Method__ReturnCollectionAssignment_5_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__ReturnCollectionAssignment_5_1_0_in_rule__Method__Group_5_1__0__Impl11198);
            rule__Method__ReturnCollectionAssignment_5_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnCollectionAssignment_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__0__Impl"


    // $ANTLR start "rule__Method__Group_5_1__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5618:1: rule__Method__Group_5_1__1 : rule__Method__Group_5_1__1__Impl rule__Method__Group_5_1__2 ;
    public final void rule__Method__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5622:1: ( rule__Method__Group_5_1__1__Impl rule__Method__Group_5_1__2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5623:2: rule__Method__Group_5_1__1__Impl rule__Method__Group_5_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_1__1__Impl_in_rule__Method__Group_5_1__111228);
            rule__Method__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_1__2_in_rule__Method__Group_5_1__111231);
            rule__Method__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__1"


    // $ANTLR start "rule__Method__Group_5_1__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5630:1: rule__Method__Group_5_1__1__Impl : ( '<' ) ;
    public final void rule__Method__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5634:1: ( ( '<' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5635:1: ( '<' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5635:1: ( '<' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5636:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLessThanSignKeyword_5_1_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Method__Group_5_1__1__Impl11259); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLessThanSignKeyword_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__1__Impl"


    // $ANTLR start "rule__Method__Group_5_1__2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5649:1: rule__Method__Group_5_1__2 : rule__Method__Group_5_1__2__Impl rule__Method__Group_5_1__3 ;
    public final void rule__Method__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5653:1: ( rule__Method__Group_5_1__2__Impl rule__Method__Group_5_1__3 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5654:2: rule__Method__Group_5_1__2__Impl rule__Method__Group_5_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_1__2__Impl_in_rule__Method__Group_5_1__211290);
            rule__Method__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_1__3_in_rule__Method__Group_5_1__211293);
            rule__Method__Group_5_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__2"


    // $ANTLR start "rule__Method__Group_5_1__2__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5661:1: rule__Method__Group_5_1__2__Impl : ( ( rule__Method__ReturnTypeAssignment_5_1_2 ) ) ;
    public final void rule__Method__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5665:1: ( ( ( rule__Method__ReturnTypeAssignment_5_1_2 ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5666:1: ( ( rule__Method__ReturnTypeAssignment_5_1_2 ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5666:1: ( ( rule__Method__ReturnTypeAssignment_5_1_2 ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5667:1: ( rule__Method__ReturnTypeAssignment_5_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_1_2()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5668:1: ( rule__Method__ReturnTypeAssignment_5_1_2 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5668:2: rule__Method__ReturnTypeAssignment_5_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__ReturnTypeAssignment_5_1_2_in_rule__Method__Group_5_1__2__Impl11320);
            rule__Method__ReturnTypeAssignment_5_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__2__Impl"


    // $ANTLR start "rule__Method__Group_5_1__3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5678:1: rule__Method__Group_5_1__3 : rule__Method__Group_5_1__3__Impl ;
    public final void rule__Method__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5682:1: ( rule__Method__Group_5_1__3__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5683:2: rule__Method__Group_5_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_5_1__3__Impl_in_rule__Method__Group_5_1__311350);
            rule__Method__Group_5_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__3"


    // $ANTLR start "rule__Method__Group_5_1__3__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5689:1: rule__Method__Group_5_1__3__Impl : ( '>' ) ;
    public final void rule__Method__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5693:1: ( ( '>' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5694:1: ( '>' )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5694:1: ( '>' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5695:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGreaterThanSignKeyword_5_1_3()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Method__Group_5_1__3__Impl11378); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGreaterThanSignKeyword_5_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5716:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5720:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5721:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__011417);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__011420);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5728:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5732:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5733:1: ( RULE_ID )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5733:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5734:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl11447); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5745:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5749:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5750:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__111476);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5756:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5760:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5761:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5761:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5762:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5763:1: ( rule__QualifiedName__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==43) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5763:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl11503);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5777:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5781:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5782:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__011538);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__011541);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5789:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5793:1: ( ( ( '.' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5794:1: ( ( '.' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5794:1: ( ( '.' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5795:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5796:1: ( '.' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5797:2: '.'
            {
            match(input,43,FollowSets000.FOLLOW_43_in_rule__QualifiedName__Group_1__0__Impl11570); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5808:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5812:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5813:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__111602);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5819:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5823:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5824:1: ( RULE_ID )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5824:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5825:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl11629); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ApiDescription__ApiNameAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5841:1: rule__ApiDescription__ApiNameAssignment_1 : ( ruleEString ) ;
    public final void rule__ApiDescription__ApiNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5845:1: ( ( ruleEString ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5846:1: ( ruleEString )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5846:1: ( ruleEString )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5847:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getApiNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ApiDescription__ApiNameAssignment_111667);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getApiNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__ApiNameAssignment_1"


    // $ANTLR start "rule__ApiDescription__MetamodelNameAssignment_4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5856:1: rule__ApiDescription__MetamodelNameAssignment_4 : ( ruleEString ) ;
    public final void rule__ApiDescription__MetamodelNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5860:1: ( ( ruleEString ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5861:1: ( ruleEString )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5861:1: ( ruleEString )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5862:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getMetamodelNameEStringParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ApiDescription__MetamodelNameAssignment_411698);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getMetamodelNameEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__MetamodelNameAssignment_4"


    // $ANTLR start "rule__ApiDescription__MapperClassNameAssignment_5_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5871:1: rule__ApiDescription__MapperClassNameAssignment_5_2 : ( ruleQualifiedName ) ;
    public final void rule__ApiDescription__MapperClassNameAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5875:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5876:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5876:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5877:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getMapperClassNameQualifiedNameParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__ApiDescription__MapperClassNameAssignment_5_211729);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getMapperClassNameQualifiedNameParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__MapperClassNameAssignment_5_2"


    // $ANTLR start "rule__ApiDescription__DeclaredElementsAssignment_6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5886:1: rule__ApiDescription__DeclaredElementsAssignment_6 : ( ruleDeclaredElement ) ;
    public final void rule__ApiDescription__DeclaredElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5890:1: ( ( ruleDeclaredElement ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5891:1: ( ruleDeclaredElement )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5891:1: ( ruleDeclaredElement )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5892:1: ruleDeclaredElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getDeclaredElementsDeclaredElementParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclaredElement_in_rule__ApiDescription__DeclaredElementsAssignment_611760);
            ruleDeclaredElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getDeclaredElementsDeclaredElementParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__DeclaredElementsAssignment_6"


    // $ANTLR start "rule__ApiDescription__ClassMappingsAssignment_7"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5901:1: rule__ApiDescription__ClassMappingsAssignment_7 : ( ruleClassMapping ) ;
    public final void rule__ApiDescription__ClassMappingsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5905:1: ( ( ruleClassMapping ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5906:1: ( ruleClassMapping )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5906:1: ( ruleClassMapping )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5907:1: ruleClassMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApiDescriptionAccess().getClassMappingsClassMappingParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassMapping_in_rule__ApiDescription__ClassMappingsAssignment_711791);
            ruleClassMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApiDescriptionAccess().getClassMappingsClassMappingParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiDescription__ClassMappingsAssignment_7"


    // $ANTLR start "rule__SimpleClassMapping__MetaclassNameAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5916:1: rule__SimpleClassMapping__MetaclassNameAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleClassMapping__MetaclassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5920:1: ( ( ruleEString ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5921:1: ( ruleEString )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5921:1: ( ruleEString )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5922:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getMetaclassNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleClassMapping__MetaclassNameAssignment_111822);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getMetaclassNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__MetaclassNameAssignment_1"


    // $ANTLR start "rule__SimpleClassMapping__CanonicalClassNameAssignment_3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5931:1: rule__SimpleClassMapping__CanonicalClassNameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__SimpleClassMapping__CanonicalClassNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5935:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5936:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5936:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5937:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getCanonicalClassNameQualifiedNameParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__SimpleClassMapping__CanonicalClassNameAssignment_311853);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getCanonicalClassNameQualifiedNameParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__CanonicalClassNameAssignment_3"


    // $ANTLR start "rule__SimpleClassMapping__CreationAssignment_4_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5946:1: rule__SimpleClassMapping__CreationAssignment_4_1 : ( ruleCreationMechanism ) ;
    public final void rule__SimpleClassMapping__CreationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5950:1: ( ( ruleCreationMechanism ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5951:1: ( ruleCreationMechanism )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5951:1: ( ruleCreationMechanism )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5952:1: ruleCreationMechanism
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getCreationCreationMechanismParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCreationMechanism_in_rule__SimpleClassMapping__CreationAssignment_4_111884);
            ruleCreationMechanism();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getCreationCreationMechanismParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__CreationAssignment_4_1"


    // $ANTLR start "rule__SimpleClassMapping__FeatureMappingsAssignment_4_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5961:1: rule__SimpleClassMapping__FeatureMappingsAssignment_4_2 : ( ruleFeatureMapping ) ;
    public final void rule__SimpleClassMapping__FeatureMappingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5965:1: ( ( ruleFeatureMapping ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5966:1: ( ruleFeatureMapping )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5966:1: ( ruleFeatureMapping )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5967:1: ruleFeatureMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleClassMappingAccess().getFeatureMappingsFeatureMappingParserRuleCall_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_rule__SimpleClassMapping__FeatureMappingsAssignment_4_211915);
            ruleFeatureMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleClassMappingAccess().getFeatureMappingsFeatureMappingParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClassMapping__FeatureMappingsAssignment_4_2"


    // $ANTLR start "rule__EmptyConstructor__StatementAssignment_3_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5976:1: rule__EmptyConstructor__StatementAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__EmptyConstructor__StatementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5980:1: ( ( ruleStatement ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5981:1: ( ruleStatement )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5981:1: ( ruleStatement )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5982:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyConstructorAccess().getStatementStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__EmptyConstructor__StatementAssignment_3_111946);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyConstructorAccess().getStatementStatementParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyConstructor__StatementAssignment_3_1"


    // $ANTLR start "rule__NonEmptyConstructor__ParametersAssignment_3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5991:1: rule__NonEmptyConstructor__ParametersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__NonEmptyConstructor__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5995:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5996:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5996:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5997:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingCrossReference_3_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5998:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:5999:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__NonEmptyConstructor__ParametersAssignment_311981); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__ParametersAssignment_3"


    // $ANTLR start "rule__NonEmptyConstructor__ParametersAssignment_4_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6010:1: rule__NonEmptyConstructor__ParametersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__NonEmptyConstructor__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6014:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6015:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6015:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6016:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingCrossReference_4_1_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6017:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6018:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__NonEmptyConstructor__ParametersAssignment_4_112020); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__ParametersAssignment_4_1"


    // $ANTLR start "rule__NonEmptyConstructor__StatementAssignment_6_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6029:1: rule__NonEmptyConstructor__StatementAssignment_6_1 : ( ruleStatement ) ;
    public final void rule__NonEmptyConstructor__StatementAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6033:1: ( ( ruleStatement ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6034:1: ( ruleStatement )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6034:1: ( ruleStatement )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6035:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonEmptyConstructorAccess().getStatementStatementParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_rule__NonEmptyConstructor__StatementAssignment_6_112055);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonEmptyConstructorAccess().getStatementStatementParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonEmptyConstructor__StatementAssignment_6_1"


    // $ANTLR start "rule__SetFeature__FeatureAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6044:1: rule__SetFeature__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetFeature__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6048:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6049:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6049:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6050:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getFeatureFeatureMappingCrossReference_1_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6051:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6052:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getFeatureFeatureMappingIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetFeature__FeatureAssignment_112090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getFeatureFeatureMappingIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getFeatureFeatureMappingCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__FeatureAssignment_1"


    // $ANTLR start "rule__SetFeature__IntValueAssignment_3_0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6063:1: rule__SetFeature__IntValueAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__SetFeature__IntValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6067:1: ( ( RULE_INT ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6068:1: ( RULE_INT )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6068:1: ( RULE_INT )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6069:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getIntValueINTTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__SetFeature__IntValueAssignment_3_012125); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getIntValueINTTerminalRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__IntValueAssignment_3_0"


    // $ANTLR start "rule__SetFeature__StrValueAssignment_3_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6078:1: rule__SetFeature__StrValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SetFeature__StrValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6082:1: ( ( RULE_STRING ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6083:1: ( RULE_STRING )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6083:1: ( RULE_STRING )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6084:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getStrValueSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__SetFeature__StrValueAssignment_3_112156); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getStrValueSTRINGTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__StrValueAssignment_3_1"


    // $ANTLR start "rule__SetFeature__BoolValueAssignment_3_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6093:1: rule__SetFeature__BoolValueAssignment_3_2 : ( ruleEBoolean ) ;
    public final void rule__SetFeature__BoolValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6097:1: ( ( ruleEBoolean ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6098:1: ( ruleEBoolean )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6098:1: ( ruleEBoolean )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6099:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetFeatureAccess().getBoolValueEBooleanParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__SetFeature__BoolValueAssignment_3_212187);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetFeatureAccess().getBoolValueEBooleanParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__BoolValueAssignment_3_2"


    // $ANTLR start "rule__SimpleAttributeMapping__FeatureNameAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6108:1: rule__SimpleAttributeMapping__FeatureNameAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleAttributeMapping__FeatureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6112:1: ( ( ruleEString ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6113:1: ( ruleEString )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6113:1: ( ruleEString )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6114:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getFeatureNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleAttributeMapping__FeatureNameAssignment_112218);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getFeatureNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__FeatureNameAssignment_1"


    // $ANTLR start "rule__SimpleAttributeMapping__IsMultivaluedAssignment_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6123:1: rule__SimpleAttributeMapping__IsMultivaluedAssignment_2 : ( ( '*' ) ) ;
    public final void rule__SimpleAttributeMapping__IsMultivaluedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6127:1: ( ( ( '*' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6128:1: ( ( '*' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6128:1: ( ( '*' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6129:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getIsMultivaluedAsteriskKeyword_2_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6130:1: ( '*' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6131:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getIsMultivaluedAsteriskKeyword_2_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_44_in_rule__SimpleAttributeMapping__IsMultivaluedAssignment_212254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getIsMultivaluedAsteriskKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getIsMultivaluedAsteriskKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__IsMultivaluedAssignment_2"


    // $ANTLR start "rule__SimpleAttributeMapping__TypeAssignment_4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6146:1: rule__SimpleAttributeMapping__TypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__SimpleAttributeMapping__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6150:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6151:1: ( RULE_ID )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6151:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6152:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getTypeIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SimpleAttributeMapping__TypeAssignment_412293); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getTypeIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__TypeAssignment_4"


    // $ANTLR start "rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6161:1: rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2 : ( ruleQualifiedName ) ;
    public final void rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6165:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6166:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6166:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6167:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getConstructorTypeQualifiedNameParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_212324);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getConstructorTypeQualifiedNameParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2"


    // $ANTLR start "rule__SimpleAttributeMapping__GetMethodAssignment_6_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6176:1: rule__SimpleAttributeMapping__GetMethodAssignment_6_1 : ( ruleGetMechanism ) ;
    public final void rule__SimpleAttributeMapping__GetMethodAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6180:1: ( ( ruleGetMechanism ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6181:1: ( ruleGetMechanism )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6181:1: ( ruleGetMechanism )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6182:1: ruleGetMechanism
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getGetMethodGetMechanismParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGetMechanism_in_rule__SimpleAttributeMapping__GetMethodAssignment_6_112355);
            ruleGetMechanism();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getGetMethodGetMechanismParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__GetMethodAssignment_6_1"


    // $ANTLR start "rule__SimpleAttributeMapping__SetMethodAssignment_7_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6191:1: rule__SimpleAttributeMapping__SetMethodAssignment_7_1 : ( ruleSetMechanism ) ;
    public final void rule__SimpleAttributeMapping__SetMethodAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6195:1: ( ( ruleSetMechanism ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6196:1: ( ruleSetMechanism )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6196:1: ( ruleSetMechanism )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6197:1: ruleSetMechanism
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAttributeMappingAccess().getSetMethodSetMechanismParserRuleCall_7_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSetMechanism_in_rule__SimpleAttributeMapping__SetMethodAssignment_7_112386);
            ruleSetMechanism();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAttributeMappingAccess().getSetMethodSetMechanismParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeMapping__SetMethodAssignment_7_1"


    // $ANTLR start "rule__SimpleReferenceMapping__FeatureNameAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6206:1: rule__SimpleReferenceMapping__FeatureNameAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleReferenceMapping__FeatureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6210:1: ( ( ruleEString ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6211:1: ( ruleEString )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6211:1: ( ruleEString )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6212:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getFeatureNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleReferenceMapping__FeatureNameAssignment_112417);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getFeatureNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__FeatureNameAssignment_1"


    // $ANTLR start "rule__SimpleReferenceMapping__IsMultivaluedAssignment_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6221:1: rule__SimpleReferenceMapping__IsMultivaluedAssignment_2 : ( ( '*' ) ) ;
    public final void rule__SimpleReferenceMapping__IsMultivaluedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6225:1: ( ( ( '*' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6226:1: ( ( '*' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6226:1: ( ( '*' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6227:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getIsMultivaluedAsteriskKeyword_2_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6228:1: ( '*' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6229:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getIsMultivaluedAsteriskKeyword_2_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_44_in_rule__SimpleReferenceMapping__IsMultivaluedAssignment_212453); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getIsMultivaluedAsteriskKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getIsMultivaluedAsteriskKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__IsMultivaluedAssignment_2"


    // $ANTLR start "rule__SimpleReferenceMapping__TypeAssignment_4"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6244:1: rule__SimpleReferenceMapping__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleReferenceMapping__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6248:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6249:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6249:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6250:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getTypeClassMappingCrossReference_4_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6251:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6252:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getTypeClassMappingIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SimpleReferenceMapping__TypeAssignment_412496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getTypeClassMappingIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getTypeClassMappingCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__TypeAssignment_4"


    // $ANTLR start "rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6263:1: rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2 : ( ruleQualifiedName ) ;
    public final void rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6267:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6268:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6268:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6269:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getConstructorTypeQualifiedNameParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_212531);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getConstructorTypeQualifiedNameParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2"


    // $ANTLR start "rule__SimpleReferenceMapping__GetMethodAssignment_6_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6278:1: rule__SimpleReferenceMapping__GetMethodAssignment_6_1 : ( ruleGetMechanism ) ;
    public final void rule__SimpleReferenceMapping__GetMethodAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6282:1: ( ( ruleGetMechanism ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6283:1: ( ruleGetMechanism )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6283:1: ( ruleGetMechanism )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6284:1: ruleGetMechanism
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getGetMethodGetMechanismParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGetMechanism_in_rule__SimpleReferenceMapping__GetMethodAssignment_6_112562);
            ruleGetMechanism();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getGetMethodGetMechanismParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__GetMethodAssignment_6_1"


    // $ANTLR start "rule__SimpleReferenceMapping__SetMethodAssignment_7_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6293:1: rule__SimpleReferenceMapping__SetMethodAssignment_7_1 : ( ruleSetMechanism ) ;
    public final void rule__SimpleReferenceMapping__SetMethodAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6297:1: ( ( ruleSetMechanism ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6298:1: ( ruleSetMechanism )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6298:1: ( ruleSetMechanism )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6299:1: ruleSetMechanism
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReferenceMappingAccess().getSetMethodSetMechanismParserRuleCall_7_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSetMechanism_in_rule__SimpleReferenceMapping__SetMethodAssignment_7_112593);
            ruleSetMechanism();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReferenceMappingAccess().getSetMethodSetMechanismParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReferenceMapping__SetMethodAssignment_7_1"


    // $ANTLR start "rule__SimpleGet__GetterAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6308:1: rule__SimpleGet__GetterAssignment_1 : ( ruleMethod ) ;
    public final void rule__SimpleGet__GetterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6312:1: ( ( ruleMethod ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6313:1: ( ruleMethod )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6313:1: ( ruleMethod )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6314:1: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleGetAccess().getGetterMethodParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__SimpleGet__GetterAssignment_112624);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleGetAccess().getGetterMethodParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleGet__GetterAssignment_1"


    // $ANTLR start "rule__SimpleSet__SetterAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6323:1: rule__SimpleSet__SetterAssignment_1 : ( ruleMethod ) ;
    public final void rule__SimpleSet__SetterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6327:1: ( ( ruleMethod ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6328:1: ( ruleMethod )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6328:1: ( ruleMethod )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6329:1: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSetAccess().getSetterMethodParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__SimpleSet__SetterAssignment_112655);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSetAccess().getSetterMethodParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSet__SetterAssignment_1"


    // $ANTLR start "rule__GenericGet__GetterAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6338:1: rule__GenericGet__GetterAssignment_1 : ( ruleMethod ) ;
    public final void rule__GenericGet__GetterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6342:1: ( ( ruleMethod ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6343:1: ( ruleMethod )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6343:1: ( ruleMethod )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6344:1: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericGetAccess().getGetterMethodParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__GenericGet__GetterAssignment_112686);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericGetAccess().getGetterMethodParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericGet__GetterAssignment_1"


    // $ANTLR start "rule__GenericSet__SetterAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6353:1: rule__GenericSet__SetterAssignment_1 : ( ruleMethod ) ;
    public final void rule__GenericSet__SetterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6357:1: ( ( ruleMethod ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6358:1: ( ruleMethod )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6358:1: ( ruleMethod )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6359:1: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericSetAccess().getSetterMethodParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__GenericSet__SetterAssignment_112717);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericSetAccess().getSetterMethodParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericSet__SetterAssignment_1"


    // $ANTLR start "rule__IteratorGet__IteratorAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6368:1: rule__IteratorGet__IteratorAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IteratorGet__IteratorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6372:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6373:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6373:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6374:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetAccess().getIteratorIteratorDescriptionCrossReference_1_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6375:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6376:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetAccess().getIteratorIteratorDescriptionIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__IteratorGet__IteratorAssignment_112752); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetAccess().getIteratorIteratorDescriptionIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetAccess().getIteratorIteratorDescriptionCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__IteratorAssignment_1"


    // $ANTLR start "rule__IteratorGet__GetIteratorAssignment_3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6387:1: rule__IteratorGet__GetIteratorAssignment_3 : ( ruleMethod ) ;
    public final void rule__IteratorGet__GetIteratorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6391:1: ( ( ruleMethod ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6392:1: ( ruleMethod )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6392:1: ( ruleMethod )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6393:1: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorGetAccess().getGetIteratorMethodParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__IteratorGet__GetIteratorAssignment_312787);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorGetAccess().getGetIteratorMethodParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorGet__GetIteratorAssignment_3"


    // $ANTLR start "rule__IteratorDescription__NameAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6402:1: rule__IteratorDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IteratorDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6406:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6407:1: ( RULE_ID )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6407:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6408:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__IteratorDescription__NameAssignment_112818); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__NameAssignment_1"


    // $ANTLR start "rule__IteratorDescription__IteratorClassAssignment_3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6417:1: rule__IteratorDescription__IteratorClassAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__IteratorDescription__IteratorClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6421:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6422:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6422:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6423:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getIteratorClassQualifiedNameParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__IteratorDescription__IteratorClassAssignment_312849);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getIteratorClassQualifiedNameParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__IteratorClassAssignment_3"


    // $ANTLR start "rule__IteratorDescription__HasFinishedAssignment_6"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6432:1: rule__IteratorDescription__HasFinishedAssignment_6 : ( ruleMethod ) ;
    public final void rule__IteratorDescription__HasFinishedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6436:1: ( ( ruleMethod ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6437:1: ( ruleMethod )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6437:1: ( ruleMethod )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6438:1: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getHasFinishedMethodParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__IteratorDescription__HasFinishedAssignment_612880);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getHasFinishedMethodParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__HasFinishedAssignment_6"


    // $ANTLR start "rule__IteratorDescription__NextElementAssignment_8"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6447:1: rule__IteratorDescription__NextElementAssignment_8 : ( ruleMethod ) ;
    public final void rule__IteratorDescription__NextElementAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6451:1: ( ( ruleMethod ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6452:1: ( ruleMethod )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6452:1: ( ruleMethod )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6453:1: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIteratorDescriptionAccess().getNextElementMethodParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__IteratorDescription__NextElementAssignment_812911);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIteratorDescriptionAccess().getNextElementMethodParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IteratorDescription__NextElementAssignment_8"


    // $ANTLR start "rule__ObserverDescription__NameAssignment_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6462:1: rule__ObserverDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObserverDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6466:1: ( ( RULE_ID ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6467:1: ( RULE_ID )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6467:1: ( RULE_ID )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6468:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ObserverDescription__NameAssignment_112942); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__NameAssignment_1"


    // $ANTLR start "rule__ObserverDescription__ObserverClassAssignment_3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6477:1: rule__ObserverDescription__ObserverClassAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__ObserverDescription__ObserverClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6481:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6482:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6482:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6483:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getObserverClassQualifiedNameParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__ObserverDescription__ObserverClassAssignment_312973);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getObserverClassQualifiedNameParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__ObserverClassAssignment_3"


    // $ANTLR start "rule__ObserverDescription__UpdateMethodsAssignment_5"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6492:1: rule__ObserverDescription__UpdateMethodsAssignment_5 : ( ruleUpdateMethod ) ;
    public final void rule__ObserverDescription__UpdateMethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6496:1: ( ( ruleUpdateMethod ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6497:1: ( ruleUpdateMethod )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6497:1: ( ruleUpdateMethod )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6498:1: ruleUpdateMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDescriptionAccess().getUpdateMethodsUpdateMethodParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUpdateMethod_in_rule__ObserverDescription__UpdateMethodsAssignment_513004);
            ruleUpdateMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDescriptionAccess().getUpdateMethodsUpdateMethodParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDescription__UpdateMethodsAssignment_5"


    // $ANTLR start "rule__UpdateMethod__InterestAssignment_1_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6507:1: rule__UpdateMethod__InterestAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__UpdateMethod__InterestAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6511:1: ( ( RULE_INT ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6512:1: ( RULE_INT )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6512:1: ( RULE_INT )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6513:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getInterestINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__UpdateMethod__InterestAssignment_1_113035); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getInterestINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__InterestAssignment_1_1"


    // $ANTLR start "rule__UpdateMethod__InterestAssignment_1_2_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6522:1: rule__UpdateMethod__InterestAssignment_1_2_1 : ( RULE_INT ) ;
    public final void rule__UpdateMethod__InterestAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6526:1: ( ( RULE_INT ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6527:1: ( RULE_INT )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6527:1: ( RULE_INT )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6528:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getInterestINTTerminalRuleCall_1_2_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__UpdateMethod__InterestAssignment_1_2_113066); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getInterestINTTerminalRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__InterestAssignment_1_2_1"


    // $ANTLR start "rule__UpdateMethod__NameAssignment_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6537:1: rule__UpdateMethod__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UpdateMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6541:1: ( ( ruleEString ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6542:1: ( ruleEString )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6542:1: ( ruleEString )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6543:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UpdateMethod__NameAssignment_213097);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__NameAssignment_2"


    // $ANTLR start "rule__UpdateMethod__ParameterTypesAssignment_4_0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6552:1: rule__UpdateMethod__ParameterTypesAssignment_4_0 : ( ruleQualifiedName ) ;
    public final void rule__UpdateMethod__ParameterTypesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6556:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6557:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6557:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6558:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getParameterTypesQualifiedNameParserRuleCall_4_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ParameterTypesAssignment_4_013128);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getParameterTypesQualifiedNameParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__ParameterTypesAssignment_4_0"


    // $ANTLR start "rule__UpdateMethod__ParameterTypesAssignment_4_1_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6567:1: rule__UpdateMethod__ParameterTypesAssignment_4_1_1 : ( ruleQualifiedName ) ;
    public final void rule__UpdateMethod__ParameterTypesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6571:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6572:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6572:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6573:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getParameterTypesQualifiedNameParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ParameterTypesAssignment_4_1_113159);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getParameterTypesQualifiedNameParserRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__ParameterTypesAssignment_4_1_1"


    // $ANTLR start "rule__UpdateMethod__ReturnArrayAssignment_7_0_0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6582:1: rule__UpdateMethod__ReturnArrayAssignment_7_0_0 : ( ( 'Array' ) ) ;
    public final void rule__UpdateMethod__ReturnArrayAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6586:1: ( ( ( 'Array' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6587:1: ( ( 'Array' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6587:1: ( ( 'Array' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6588:1: ( 'Array' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnArrayArrayKeyword_7_0_0_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6589:1: ( 'Array' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6590:1: 'Array'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnArrayArrayKeyword_7_0_0_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_45_in_rule__UpdateMethod__ReturnArrayAssignment_7_0_013195); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnArrayArrayKeyword_7_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnArrayArrayKeyword_7_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__ReturnArrayAssignment_7_0_0"


    // $ANTLR start "rule__UpdateMethod__ReturnTypeAssignment_7_0_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6605:1: rule__UpdateMethod__ReturnTypeAssignment_7_0_2 : ( ruleQualifiedName ) ;
    public final void rule__UpdateMethod__ReturnTypeAssignment_7_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6609:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6610:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6610:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6611:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ReturnTypeAssignment_7_0_213234);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__ReturnTypeAssignment_7_0_2"


    // $ANTLR start "rule__UpdateMethod__ReturnCollectionAssignment_7_1_0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6620:1: rule__UpdateMethod__ReturnCollectionAssignment_7_1_0 : ( ( 'Collection' ) ) ;
    public final void rule__UpdateMethod__ReturnCollectionAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6624:1: ( ( ( 'Collection' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6625:1: ( ( 'Collection' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6625:1: ( ( 'Collection' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6626:1: ( 'Collection' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnCollectionCollectionKeyword_7_1_0_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6627:1: ( 'Collection' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6628:1: 'Collection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnCollectionCollectionKeyword_7_1_0_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_46_in_rule__UpdateMethod__ReturnCollectionAssignment_7_1_013270); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnCollectionCollectionKeyword_7_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnCollectionCollectionKeyword_7_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__ReturnCollectionAssignment_7_1_0"


    // $ANTLR start "rule__UpdateMethod__ReturnTypeAssignment_7_1_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6643:1: rule__UpdateMethod__ReturnTypeAssignment_7_1_2 : ( ruleQualifiedName ) ;
    public final void rule__UpdateMethod__ReturnTypeAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6647:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6648:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6648:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6649:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ReturnTypeAssignment_7_1_213309);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__ReturnTypeAssignment_7_1_2"


    // $ANTLR start "rule__UpdateMethod__ReturnTypeAssignment_7_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6658:1: rule__UpdateMethod__ReturnTypeAssignment_7_2 : ( ruleQualifiedName ) ;
    public final void rule__UpdateMethod__ReturnTypeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6662:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6663:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6663:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6664:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ReturnTypeAssignment_7_213340);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__ReturnTypeAssignment_7_2"


    // $ANTLR start "rule__UpdateMethod__ReturnVoidAssignment_7_3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6673:1: rule__UpdateMethod__ReturnVoidAssignment_7_3 : ( ( 'void' ) ) ;
    public final void rule__UpdateMethod__ReturnVoidAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6677:1: ( ( ( 'void' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6678:1: ( ( 'void' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6678:1: ( ( 'void' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6679:1: ( 'void' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnVoidVoidKeyword_7_3_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6680:1: ( 'void' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6681:1: 'void'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpdateMethodAccess().getReturnVoidVoidKeyword_7_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_47_in_rule__UpdateMethod__ReturnVoidAssignment_7_313376); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnVoidVoidKeyword_7_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpdateMethodAccess().getReturnVoidVoidKeyword_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateMethod__ReturnVoidAssignment_7_3"


    // $ANTLR start "rule__Method__NameAssignment_0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6696:1: rule__Method__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6700:1: ( ( ruleEString ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6701:1: ( ruleEString )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6701:1: ( ruleEString )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6702:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Method__NameAssignment_013415);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_0"


    // $ANTLR start "rule__Method__ParameterTypesAssignment_2_0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6711:1: rule__Method__ParameterTypesAssignment_2_0 : ( ruleQualifiedName ) ;
    public final void rule__Method__ParameterTypesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6715:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6716:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6716:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6717:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParameterTypesQualifiedNameParserRuleCall_2_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Method__ParameterTypesAssignment_2_013446);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParameterTypesQualifiedNameParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterTypesAssignment_2_0"


    // $ANTLR start "rule__Method__ParameterTypesAssignment_2_1_1"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6726:1: rule__Method__ParameterTypesAssignment_2_1_1 : ( ruleQualifiedName ) ;
    public final void rule__Method__ParameterTypesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6730:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6731:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6731:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6732:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParameterTypesQualifiedNameParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Method__ParameterTypesAssignment_2_1_113477);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParameterTypesQualifiedNameParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterTypesAssignment_2_1_1"


    // $ANTLR start "rule__Method__ReturnArrayAssignment_5_0_0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6741:1: rule__Method__ReturnArrayAssignment_5_0_0 : ( ( 'Array' ) ) ;
    public final void rule__Method__ReturnArrayAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6745:1: ( ( ( 'Array' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6746:1: ( ( 'Array' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6746:1: ( ( 'Array' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6747:1: ( 'Array' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnArrayArrayKeyword_5_0_0_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6748:1: ( 'Array' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6749:1: 'Array'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnArrayArrayKeyword_5_0_0_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Method__ReturnArrayAssignment_5_0_013513); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnArrayArrayKeyword_5_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnArrayArrayKeyword_5_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnArrayAssignment_5_0_0"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_5_0_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6764:1: rule__Method__ReturnTypeAssignment_5_0_2 : ( ruleQualifiedName ) ;
    public final void rule__Method__ReturnTypeAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6768:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6769:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6769:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6770:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Method__ReturnTypeAssignment_5_0_213552);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_5_0_2"


    // $ANTLR start "rule__Method__ReturnCollectionAssignment_5_1_0"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6779:1: rule__Method__ReturnCollectionAssignment_5_1_0 : ( ( 'Collection' ) ) ;
    public final void rule__Method__ReturnCollectionAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6783:1: ( ( ( 'Collection' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6784:1: ( ( 'Collection' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6784:1: ( ( 'Collection' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6785:1: ( 'Collection' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnCollectionCollectionKeyword_5_1_0_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6786:1: ( 'Collection' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6787:1: 'Collection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnCollectionCollectionKeyword_5_1_0_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Method__ReturnCollectionAssignment_5_1_013588); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnCollectionCollectionKeyword_5_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnCollectionCollectionKeyword_5_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnCollectionAssignment_5_1_0"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_5_1_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6802:1: rule__Method__ReturnTypeAssignment_5_1_2 : ( ruleQualifiedName ) ;
    public final void rule__Method__ReturnTypeAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6806:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6807:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6807:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6808:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Method__ReturnTypeAssignment_5_1_213627);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_5_1_2"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_5_2"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6817:1: rule__Method__ReturnTypeAssignment_5_2 : ( ruleQualifiedName ) ;
    public final void rule__Method__ReturnTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6821:1: ( ( ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6822:1: ( ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6822:1: ( ruleQualifiedName )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6823:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Method__ReturnTypeAssignment_5_213658);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_5_2"


    // $ANTLR start "rule__Method__ReturnVoidAssignment_5_3"
    // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6832:1: rule__Method__ReturnVoidAssignment_5_3 : ( ( 'void' ) ) ;
    public final void rule__Method__ReturnVoidAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6836:1: ( ( ( 'void' ) ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6837:1: ( ( 'void' ) )
            {
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6837:1: ( ( 'void' ) )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6838:1: ( 'void' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnVoidVoidKeyword_5_3_0()); 
            }
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6839:1: ( 'void' )
            // ../org.eclectic.apidesc.language.ui/src-gen/org/eclectic/ui/contentassist/antlr/internal/InternalApiDescriptionLanguage.g:6840:1: 'void'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnVoidVoidKeyword_5_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Method__ReturnVoidAssignment_5_313694); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnVoidVoidKeyword_5_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnVoidVoidKeyword_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnVoidAssignment_5_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleApiDescription_in_entryRuleApiDescription67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleApiDescription74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__0_in_ruleApiDescription100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassMapping_in_entryRuleClassMapping127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassMapping134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleClassMapping_in_ruleClassMapping160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleClassMapping_in_entryRuleSimpleClassMapping186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClassMapping193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__0_in_ruleSimpleClassMapping219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreationMechanism_in_entryRuleCreationMechanism246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCreationMechanism253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CreationMechanism__Alternatives_in_ruleCreationMechanism279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmptyConstructor_in_entryRuleEmptyConstructor306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmptyConstructor313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group__0_in_ruleEmptyConstructor339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonEmptyConstructor_in_entryRuleNonEmptyConstructor366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonEmptyConstructor373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__0_in_ruleNonEmptyConstructor399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetFeature_in_ruleStatement459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetFeature_in_entryRuleSetFeature485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetFeature492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__Group__0_in_ruleSetFeature518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMapping552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Alternatives_in_ruleFeatureMapping578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttributeMapping_in_entryRuleSimpleAttributeMapping605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttributeMapping612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__0_in_ruleSimpleAttributeMapping638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleReferenceMapping_in_entryRuleSimpleReferenceMapping665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleReferenceMapping672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__0_in_ruleSimpleReferenceMapping698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGetMechanism_in_entryRuleGetMechanism725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGetMechanism732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GetMechanism__Alternatives_in_ruleGetMechanism758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetMechanism_in_entryRuleSetMechanism785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetMechanism792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetMechanism__Alternatives_in_ruleSetMechanism818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleGet_in_entryRuleSimpleGet845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleGet852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleGet__Group__0_in_ruleSimpleGet878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleSet_in_entryRuleSimpleSet905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSet912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleSet__Group__0_in_ruleSimpleSet938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericGet_in_entryRuleGenericGet965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericGet972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericGet__Group__0_in_ruleGenericGet998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericSet_in_entryRuleGenericSet1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericSet1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericSet__Group__0_in_ruleGenericSet1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIteratorGet_in_entryRuleIteratorGet1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIteratorGet1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorGet__Group__0_in_ruleIteratorGet1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredElement_in_entryRuleDeclaredElement1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredElement1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredElement__Alternatives_in_ruleDeclaredElement1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIteratorDescription_in_entryRuleIteratorDescription1205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIteratorDescription1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__0_in_ruleIteratorDescription1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserverDescription_in_entryRuleObserverDescription1265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObserverDescription1272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__0_in_ruleObserverDescription1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUpdateMethod_in_entryRuleUpdateMethod1325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUpdateMethod1332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__0_in_ruleUpdateMethod1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethod1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod1478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmptyConstructor_in_rule__CreationMechanism__Alternatives1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonEmptyConstructor_in_rule__CreationMechanism__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__IntValueAssignment_3_0_in_rule__SetFeature__Alternatives_31687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__StrValueAssignment_3_1_in_rule__SetFeature__Alternatives_31705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__BoolValueAssignment_3_2_in_rule__SetFeature__Alternatives_31723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttributeMapping_in_rule__FeatureMapping__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleReferenceMapping_in_rule__FeatureMapping__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleGet_in_rule__GetMechanism__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericGet_in_rule__GetMechanism__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIteratorGet_in_rule__GetMechanism__Alternatives1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleSet_in_rule__SetMechanism__Alternatives1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericSet_in_rule__SetMechanism__Alternatives1888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIteratorDescription_in_rule__DeclaredElement__Alternatives1920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserverDescription_in_rule__DeclaredElement__Alternatives1937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_0__0_in_rule__UpdateMethod__Alternatives_71969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_1__0_in_rule__UpdateMethod__Alternatives_71987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__ReturnTypeAssignment_7_2_in_rule__UpdateMethod__Alternatives_72005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__ReturnVoidAssignment_7_3_in_rule__UpdateMethod__Alternatives_72023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_0__0_in_rule__Method__Alternatives_52105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_1__0_in_rule__Method__Alternatives_52123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_5_2_in_rule__Method__Alternatives_52141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__ReturnVoidAssignment_5_3_in_rule__Method__Alternatives_52159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives2193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__0__Impl_in_rule__ApiDescription__Group__02247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__1_in_rule__ApiDescription__Group__02250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ApiDescription__Group__0__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__1__Impl_in_rule__ApiDescription__Group__12309 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__2_in_rule__ApiDescription__Group__12312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__ApiNameAssignment_1_in_rule__ApiDescription__Group__1__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__2__Impl_in_rule__ApiDescription__Group__22369 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__3_in_rule__ApiDescription__Group__22372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ApiDescription__Group__2__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__3__Impl_in_rule__ApiDescription__Group__32431 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__4_in_rule__ApiDescription__Group__32434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ApiDescription__Group__3__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__4__Impl_in_rule__ApiDescription__Group__42493 = new BitSet(new long[]{0x0000002400050000L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__5_in_rule__ApiDescription__Group__42496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__MetamodelNameAssignment_4_in_rule__ApiDescription__Group__4__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__5__Impl_in_rule__ApiDescription__Group__52553 = new BitSet(new long[]{0x0000002400050000L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__6_in_rule__ApiDescription__Group__52556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group_5__0_in_rule__ApiDescription__Group__5__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__6__Impl_in_rule__ApiDescription__Group__62614 = new BitSet(new long[]{0x0000002400050000L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__7_in_rule__ApiDescription__Group__62617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__DeclaredElementsAssignment_6_in_rule__ApiDescription__Group__6__Impl2644 = new BitSet(new long[]{0x0000002400000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group__7__Impl_in_rule__ApiDescription__Group__72675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__ClassMappingsAssignment_7_in_rule__ApiDescription__Group__7__Impl2704 = new BitSet(new long[]{0x0000002400050002L});
        public static final BitSet FOLLOW_rule__ApiDescription__ClassMappingsAssignment_7_in_rule__ApiDescription__Group__7__Impl2716 = new BitSet(new long[]{0x0000002400050002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group_5__0__Impl_in_rule__ApiDescription__Group_5__02765 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group_5__1_in_rule__ApiDescription__Group_5__02768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ApiDescription__Group_5__0__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group_5__1__Impl_in_rule__ApiDescription__Group_5__12827 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group_5__2_in_rule__ApiDescription__Group_5__12830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ApiDescription__Group_5__1__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__Group_5__2__Impl_in_rule__ApiDescription__Group_5__22889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ApiDescription__MapperClassNameAssignment_5_2_in_rule__ApiDescription__Group_5__2__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__0__Impl_in_rule__SimpleClassMapping__Group__02952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__1_in_rule__SimpleClassMapping__Group__02955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__SimpleClassMapping__Group__0__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__1__Impl_in_rule__SimpleClassMapping__Group__13014 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__2_in_rule__SimpleClassMapping__Group__13017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__MetaclassNameAssignment_1_in_rule__SimpleClassMapping__Group__1__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__2__Impl_in_rule__SimpleClassMapping__Group__23074 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__3_in_rule__SimpleClassMapping__Group__23077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SimpleClassMapping__Group__2__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__3__Impl_in_rule__SimpleClassMapping__Group__33136 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__4_in_rule__SimpleClassMapping__Group__33139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__CanonicalClassNameAssignment_3_in_rule__SimpleClassMapping__Group__3__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group__4__Impl_in_rule__SimpleClassMapping__Group__43196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group_4__0_in_rule__SimpleClassMapping__Group__4__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group_4__0__Impl_in_rule__SimpleClassMapping__Group_4__03264 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group_4__1_in_rule__SimpleClassMapping__Group_4__03267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__SimpleClassMapping__Group_4__0__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group_4__1__Impl_in_rule__SimpleClassMapping__Group_4__13326 = new BitSet(new long[]{0x0000000120200000L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group_4__2_in_rule__SimpleClassMapping__Group_4__13329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__CreationAssignment_4_1_in_rule__SimpleClassMapping__Group_4__1__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group_4__2__Impl_in_rule__SimpleClassMapping__Group_4__23386 = new BitSet(new long[]{0x0000000120200000L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group_4__3_in_rule__SimpleClassMapping__Group_4__23389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__FeatureMappingsAssignment_4_2_in_rule__SimpleClassMapping__Group_4__2__Impl3416 = new BitSet(new long[]{0x0000000120000002L});
        public static final BitSet FOLLOW_rule__SimpleClassMapping__Group_4__3__Impl_in_rule__SimpleClassMapping__Group_4__33447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__SimpleClassMapping__Group_4__3__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group__0__Impl_in_rule__EmptyConstructor__Group__03514 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group__1_in_rule__EmptyConstructor__Group__03517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EmptyConstructor__Group__0__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group__1__Impl_in_rule__EmptyConstructor__Group__13576 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group__2_in_rule__EmptyConstructor__Group__13579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group__2__Impl_in_rule__EmptyConstructor__Group__23637 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group__3_in_rule__EmptyConstructor__Group__23640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EmptyConstructor__Group__2__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group__3__Impl_in_rule__EmptyConstructor__Group__33699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group_3__0_in_rule__EmptyConstructor__Group__3__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group_3__0__Impl_in_rule__EmptyConstructor__Group_3__03765 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group_3__1_in_rule__EmptyConstructor__Group_3__03768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EmptyConstructor__Group_3__0__Impl3796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group_3__1__Impl_in_rule__EmptyConstructor__Group_3__13827 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group_3__2_in_rule__EmptyConstructor__Group_3__13830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__StatementAssignment_3_1_in_rule__EmptyConstructor__Group_3__1__Impl3859 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__StatementAssignment_3_1_in_rule__EmptyConstructor__Group_3__1__Impl3871 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__EmptyConstructor__Group_3__2__Impl_in_rule__EmptyConstructor__Group_3__23904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EmptyConstructor__Group_3__2__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__0__Impl_in_rule__NonEmptyConstructor__Group__03969 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__1_in_rule__NonEmptyConstructor__Group__03972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__1__Impl_in_rule__NonEmptyConstructor__Group__14030 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__2_in_rule__NonEmptyConstructor__Group__14033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__NonEmptyConstructor__Group__1__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__2__Impl_in_rule__NonEmptyConstructor__Group__24092 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__3_in_rule__NonEmptyConstructor__Group__24095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__NonEmptyConstructor__Group__2__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__3__Impl_in_rule__NonEmptyConstructor__Group__34154 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__4_in_rule__NonEmptyConstructor__Group__34157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__ParametersAssignment_3_in_rule__NonEmptyConstructor__Group__3__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__4__Impl_in_rule__NonEmptyConstructor__Group__44214 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__5_in_rule__NonEmptyConstructor__Group__44217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_4__0_in_rule__NonEmptyConstructor__Group__4__Impl4244 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__5__Impl_in_rule__NonEmptyConstructor__Group__54275 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__6_in_rule__NonEmptyConstructor__Group__54278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__NonEmptyConstructor__Group__5__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group__6__Impl_in_rule__NonEmptyConstructor__Group__64337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_6__0_in_rule__NonEmptyConstructor__Group__6__Impl4364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_4__0__Impl_in_rule__NonEmptyConstructor__Group_4__04409 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_4__1_in_rule__NonEmptyConstructor__Group_4__04412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__NonEmptyConstructor__Group_4__0__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_4__1__Impl_in_rule__NonEmptyConstructor__Group_4__14471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__ParametersAssignment_4_1_in_rule__NonEmptyConstructor__Group_4__1__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_6__0__Impl_in_rule__NonEmptyConstructor__Group_6__04532 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_6__1_in_rule__NonEmptyConstructor__Group_6__04535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__NonEmptyConstructor__Group_6__0__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_6__1__Impl_in_rule__NonEmptyConstructor__Group_6__14594 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_6__2_in_rule__NonEmptyConstructor__Group_6__14597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__StatementAssignment_6_1_in_rule__NonEmptyConstructor__Group_6__1__Impl4626 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__StatementAssignment_6_1_in_rule__NonEmptyConstructor__Group_6__1__Impl4638 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__NonEmptyConstructor__Group_6__2__Impl_in_rule__NonEmptyConstructor__Group_6__24671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__NonEmptyConstructor__Group_6__2__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__Group__0__Impl_in_rule__SetFeature__Group__04736 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SetFeature__Group__1_in_rule__SetFeature__Group__04739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SetFeature__Group__0__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__Group__1__Impl_in_rule__SetFeature__Group__14798 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__SetFeature__Group__2_in_rule__SetFeature__Group__14801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__FeatureAssignment_1_in_rule__SetFeature__Group__1__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__Group__2__Impl_in_rule__SetFeature__Group__24858 = new BitSet(new long[]{0x0000000000001850L});
        public static final BitSet FOLLOW_rule__SetFeature__Group__3_in_rule__SetFeature__Group__24861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__SetFeature__Group__2__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__Group__3__Impl_in_rule__SetFeature__Group__34920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetFeature__Alternatives_3_in_rule__SetFeature__Group__3__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__0__Impl_in_rule__SimpleAttributeMapping__Group__04985 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__1_in_rule__SimpleAttributeMapping__Group__04988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SimpleAttributeMapping__Group__0__Impl5016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__1__Impl_in_rule__SimpleAttributeMapping__Group__15047 = new BitSet(new long[]{0x0000100040000000L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__2_in_rule__SimpleAttributeMapping__Group__15050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__FeatureNameAssignment_1_in_rule__SimpleAttributeMapping__Group__1__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__2__Impl_in_rule__SimpleAttributeMapping__Group__25107 = new BitSet(new long[]{0x0000100040000000L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__3_in_rule__SimpleAttributeMapping__Group__25110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__IsMultivaluedAssignment_2_in_rule__SimpleAttributeMapping__Group__2__Impl5137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__3__Impl_in_rule__SimpleAttributeMapping__Group__35168 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__4_in_rule__SimpleAttributeMapping__Group__35171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SimpleAttributeMapping__Group__3__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__4__Impl_in_rule__SimpleAttributeMapping__Group__45230 = new BitSet(new long[]{0x0000000088800000L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__5_in_rule__SimpleAttributeMapping__Group__45233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__TypeAssignment_4_in_rule__SimpleAttributeMapping__Group__4__Impl5260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__5__Impl_in_rule__SimpleAttributeMapping__Group__55290 = new BitSet(new long[]{0x0000000088800000L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__6_in_rule__SimpleAttributeMapping__Group__55293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_5__0_in_rule__SimpleAttributeMapping__Group__5__Impl5320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__6__Impl_in_rule__SimpleAttributeMapping__Group__65351 = new BitSet(new long[]{0x0000000088800000L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__7_in_rule__SimpleAttributeMapping__Group__65354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_6__0_in_rule__SimpleAttributeMapping__Group__6__Impl5381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group__7__Impl_in_rule__SimpleAttributeMapping__Group__75412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_7__0_in_rule__SimpleAttributeMapping__Group__7__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_5__0__Impl_in_rule__SimpleAttributeMapping__Group_5__05486 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_5__1_in_rule__SimpleAttributeMapping__Group_5__05489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SimpleAttributeMapping__Group_5__0__Impl5517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_5__1__Impl_in_rule__SimpleAttributeMapping__Group_5__15548 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_5__2_in_rule__SimpleAttributeMapping__Group_5__15551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SimpleAttributeMapping__Group_5__1__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_5__2__Impl_in_rule__SimpleAttributeMapping__Group_5__25610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_2_in_rule__SimpleAttributeMapping__Group_5__2__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_6__0__Impl_in_rule__SimpleAttributeMapping__Group_6__05673 = new BitSet(new long[]{0x0000000600010000L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_6__1_in_rule__SimpleAttributeMapping__Group_6__05676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SimpleAttributeMapping__Group_6__0__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_6__1__Impl_in_rule__SimpleAttributeMapping__Group_6__15735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__GetMethodAssignment_6_1_in_rule__SimpleAttributeMapping__Group_6__1__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_7__0__Impl_in_rule__SimpleAttributeMapping__Group_7__05796 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_7__1_in_rule__SimpleAttributeMapping__Group_7__05799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SimpleAttributeMapping__Group_7__0__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__Group_7__1__Impl_in_rule__SimpleAttributeMapping__Group_7__15858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttributeMapping__SetMethodAssignment_7_1_in_rule__SimpleAttributeMapping__Group_7__1__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__0__Impl_in_rule__SimpleReferenceMapping__Group__05919 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__1_in_rule__SimpleReferenceMapping__Group__05922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SimpleReferenceMapping__Group__0__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__1__Impl_in_rule__SimpleReferenceMapping__Group__15981 = new BitSet(new long[]{0x0000100040000000L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__2_in_rule__SimpleReferenceMapping__Group__15984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__FeatureNameAssignment_1_in_rule__SimpleReferenceMapping__Group__1__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__2__Impl_in_rule__SimpleReferenceMapping__Group__26041 = new BitSet(new long[]{0x0000100040000000L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__3_in_rule__SimpleReferenceMapping__Group__26044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__IsMultivaluedAssignment_2_in_rule__SimpleReferenceMapping__Group__2__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__3__Impl_in_rule__SimpleReferenceMapping__Group__36102 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__4_in_rule__SimpleReferenceMapping__Group__36105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SimpleReferenceMapping__Group__3__Impl6133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__4__Impl_in_rule__SimpleReferenceMapping__Group__46164 = new BitSet(new long[]{0x0000000088800000L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__5_in_rule__SimpleReferenceMapping__Group__46167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__TypeAssignment_4_in_rule__SimpleReferenceMapping__Group__4__Impl6194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__5__Impl_in_rule__SimpleReferenceMapping__Group__56224 = new BitSet(new long[]{0x0000000088800000L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__6_in_rule__SimpleReferenceMapping__Group__56227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_5__0_in_rule__SimpleReferenceMapping__Group__5__Impl6254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__6__Impl_in_rule__SimpleReferenceMapping__Group__66285 = new BitSet(new long[]{0x0000000088800000L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__7_in_rule__SimpleReferenceMapping__Group__66288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_6__0_in_rule__SimpleReferenceMapping__Group__6__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group__7__Impl_in_rule__SimpleReferenceMapping__Group__76346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_7__0_in_rule__SimpleReferenceMapping__Group__7__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_5__0__Impl_in_rule__SimpleReferenceMapping__Group_5__06420 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_5__1_in_rule__SimpleReferenceMapping__Group_5__06423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SimpleReferenceMapping__Group_5__0__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_5__1__Impl_in_rule__SimpleReferenceMapping__Group_5__16482 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_5__2_in_rule__SimpleReferenceMapping__Group_5__16485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SimpleReferenceMapping__Group_5__1__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_5__2__Impl_in_rule__SimpleReferenceMapping__Group_5__26544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_2_in_rule__SimpleReferenceMapping__Group_5__2__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_6__0__Impl_in_rule__SimpleReferenceMapping__Group_6__06607 = new BitSet(new long[]{0x0000000600010000L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_6__1_in_rule__SimpleReferenceMapping__Group_6__06610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SimpleReferenceMapping__Group_6__0__Impl6638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_6__1__Impl_in_rule__SimpleReferenceMapping__Group_6__16669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__GetMethodAssignment_6_1_in_rule__SimpleReferenceMapping__Group_6__1__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_7__0__Impl_in_rule__SimpleReferenceMapping__Group_7__06730 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_7__1_in_rule__SimpleReferenceMapping__Group_7__06733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SimpleReferenceMapping__Group_7__0__Impl6761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__Group_7__1__Impl_in_rule__SimpleReferenceMapping__Group_7__16792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleReferenceMapping__SetMethodAssignment_7_1_in_rule__SimpleReferenceMapping__Group_7__1__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleGet__Group__0__Impl_in_rule__SimpleGet__Group__06853 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleGet__Group__1_in_rule__SimpleGet__Group__06856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SimpleGet__Group__0__Impl6884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleGet__Group__1__Impl_in_rule__SimpleGet__Group__16915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleGet__GetterAssignment_1_in_rule__SimpleGet__Group__1__Impl6942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleSet__Group__0__Impl_in_rule__SimpleSet__Group__06976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleSet__Group__1_in_rule__SimpleSet__Group__06979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SimpleSet__Group__0__Impl7007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleSet__Group__1__Impl_in_rule__SimpleSet__Group__17038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleSet__SetterAssignment_1_in_rule__SimpleSet__Group__1__Impl7065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericGet__Group__0__Impl_in_rule__GenericGet__Group__07099 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__GenericGet__Group__1_in_rule__GenericGet__Group__07102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__GenericGet__Group__0__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericGet__Group__1__Impl_in_rule__GenericGet__Group__17161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericGet__GetterAssignment_1_in_rule__GenericGet__Group__1__Impl7188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericSet__Group__0__Impl_in_rule__GenericSet__Group__07222 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__GenericSet__Group__1_in_rule__GenericSet__Group__07225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__GenericSet__Group__0__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericSet__Group__1__Impl_in_rule__GenericSet__Group__17284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericSet__SetterAssignment_1_in_rule__GenericSet__Group__1__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorGet__Group__0__Impl_in_rule__IteratorGet__Group__07345 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IteratorGet__Group__1_in_rule__IteratorGet__Group__07348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__IteratorGet__Group__0__Impl7376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorGet__Group__1__Impl_in_rule__IteratorGet__Group__17407 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__IteratorGet__Group__2_in_rule__IteratorGet__Group__17410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorGet__IteratorAssignment_1_in_rule__IteratorGet__Group__1__Impl7437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorGet__Group__2__Impl_in_rule__IteratorGet__Group__27467 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IteratorGet__Group__3_in_rule__IteratorGet__Group__27470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__IteratorGet__Group__2__Impl7498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorGet__Group__3__Impl_in_rule__IteratorGet__Group__37529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorGet__GetIteratorAssignment_3_in_rule__IteratorGet__Group__3__Impl7556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__0__Impl_in_rule__IteratorDescription__Group__07594 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__1_in_rule__IteratorDescription__Group__07597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__IteratorDescription__Group__0__Impl7625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__1__Impl_in_rule__IteratorDescription__Group__17656 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__2_in_rule__IteratorDescription__Group__17659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__NameAssignment_1_in_rule__IteratorDescription__Group__1__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__2__Impl_in_rule__IteratorDescription__Group__27716 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__3_in_rule__IteratorDescription__Group__27719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__IteratorDescription__Group__2__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__3__Impl_in_rule__IteratorDescription__Group__37778 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__4_in_rule__IteratorDescription__Group__37781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__IteratorClassAssignment_3_in_rule__IteratorDescription__Group__3__Impl7808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__4__Impl_in_rule__IteratorDescription__Group__47838 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__5_in_rule__IteratorDescription__Group__47841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__IteratorDescription__Group__4__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__5__Impl_in_rule__IteratorDescription__Group__57900 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__6_in_rule__IteratorDescription__Group__57903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__IteratorDescription__Group__5__Impl7931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__6__Impl_in_rule__IteratorDescription__Group__67962 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__7_in_rule__IteratorDescription__Group__67965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__HasFinishedAssignment_6_in_rule__IteratorDescription__Group__6__Impl7992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__7__Impl_in_rule__IteratorDescription__Group__78022 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__8_in_rule__IteratorDescription__Group__78025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__IteratorDescription__Group__7__Impl8053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__8__Impl_in_rule__IteratorDescription__Group__88084 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__9_in_rule__IteratorDescription__Group__88087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__NextElementAssignment_8_in_rule__IteratorDescription__Group__8__Impl8114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IteratorDescription__Group__9__Impl_in_rule__IteratorDescription__Group__98144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__IteratorDescription__Group__9__Impl8172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__0__Impl_in_rule__ObserverDescription__Group__08223 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__1_in_rule__ObserverDescription__Group__08226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ObserverDescription__Group__0__Impl8254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__1__Impl_in_rule__ObserverDescription__Group__18285 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__2_in_rule__ObserverDescription__Group__18288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__NameAssignment_1_in_rule__ObserverDescription__Group__1__Impl8315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__2__Impl_in_rule__ObserverDescription__Group__28345 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__3_in_rule__ObserverDescription__Group__28348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ObserverDescription__Group__2__Impl8376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__3__Impl_in_rule__ObserverDescription__Group__38407 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__4_in_rule__ObserverDescription__Group__38410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__ObserverClassAssignment_3_in_rule__ObserverDescription__Group__3__Impl8437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__4__Impl_in_rule__ObserverDescription__Group__48467 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__5_in_rule__ObserverDescription__Group__48470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ObserverDescription__Group__4__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__5__Impl_in_rule__ObserverDescription__Group__58529 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__6_in_rule__ObserverDescription__Group__58532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__UpdateMethodsAssignment_5_in_rule__ObserverDescription__Group__5__Impl8561 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__UpdateMethodsAssignment_5_in_rule__ObserverDescription__Group__5__Impl8573 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__ObserverDescription__Group__6__Impl_in_rule__ObserverDescription__Group__68606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ObserverDescription__Group__6__Impl8634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__0__Impl_in_rule__UpdateMethod__Group__08679 = new BitSet(new long[]{0x0000008000000030L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__1_in_rule__UpdateMethod__Group__08682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__UpdateMethod__Group__0__Impl8710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__1__Impl_in_rule__UpdateMethod__Group__18741 = new BitSet(new long[]{0x0000008000000030L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__2_in_rule__UpdateMethod__Group__18744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1__0_in_rule__UpdateMethod__Group__1__Impl8771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__2__Impl_in_rule__UpdateMethod__Group__28802 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__3_in_rule__UpdateMethod__Group__28805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__NameAssignment_2_in_rule__UpdateMethod__Group__2__Impl8832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__3__Impl_in_rule__UpdateMethod__Group__38862 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__4_in_rule__UpdateMethod__Group__38865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__UpdateMethod__Group__3__Impl8893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__4__Impl_in_rule__UpdateMethod__Group__48924 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__5_in_rule__UpdateMethod__Group__48927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_4__0_in_rule__UpdateMethod__Group__4__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__5__Impl_in_rule__UpdateMethod__Group__58985 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__6_in_rule__UpdateMethod__Group__58988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__UpdateMethod__Group__5__Impl9016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__6__Impl_in_rule__UpdateMethod__Group__69047 = new BitSet(new long[]{0x0000E00000000020L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__7_in_rule__UpdateMethod__Group__69050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__UpdateMethod__Group__6__Impl9078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group__7__Impl_in_rule__UpdateMethod__Group__79109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Alternatives_7_in_rule__UpdateMethod__Group__7__Impl9136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1__0__Impl_in_rule__UpdateMethod__Group_1__09182 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1__1_in_rule__UpdateMethod__Group_1__09185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__UpdateMethod__Group_1__0__Impl9213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1__1__Impl_in_rule__UpdateMethod__Group_1__19244 = new BitSet(new long[]{0x0000010004000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1__2_in_rule__UpdateMethod__Group_1__19247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__InterestAssignment_1_1_in_rule__UpdateMethod__Group_1__1__Impl9274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1__2__Impl_in_rule__UpdateMethod__Group_1__29304 = new BitSet(new long[]{0x0000010004000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1__3_in_rule__UpdateMethod__Group_1__29307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1_2__0_in_rule__UpdateMethod__Group_1__2__Impl9334 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1__3__Impl_in_rule__UpdateMethod__Group_1__39365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__UpdateMethod__Group_1__3__Impl9393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1_2__0__Impl_in_rule__UpdateMethod__Group_1_2__09432 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1_2__1_in_rule__UpdateMethod__Group_1_2__09435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__UpdateMethod__Group_1_2__0__Impl9463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_1_2__1__Impl_in_rule__UpdateMethod__Group_1_2__19494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__InterestAssignment_1_2_1_in_rule__UpdateMethod__Group_1_2__1__Impl9521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_4__0__Impl_in_rule__UpdateMethod__Group_4__09555 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_4__1_in_rule__UpdateMethod__Group_4__09558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__ParameterTypesAssignment_4_0_in_rule__UpdateMethod__Group_4__0__Impl9585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_4__1__Impl_in_rule__UpdateMethod__Group_4__19615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_4_1__0_in_rule__UpdateMethod__Group_4__1__Impl9642 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_4_1__0__Impl_in_rule__UpdateMethod__Group_4_1__09677 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_4_1__1_in_rule__UpdateMethod__Group_4_1__09680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__UpdateMethod__Group_4_1__0__Impl9708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_4_1__1__Impl_in_rule__UpdateMethod__Group_4_1__19739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__ParameterTypesAssignment_4_1_1_in_rule__UpdateMethod__Group_4_1__1__Impl9766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_0__0__Impl_in_rule__UpdateMethod__Group_7_0__09800 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_0__1_in_rule__UpdateMethod__Group_7_0__09803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__ReturnArrayAssignment_7_0_0_in_rule__UpdateMethod__Group_7_0__0__Impl9830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_0__1__Impl_in_rule__UpdateMethod__Group_7_0__19860 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_0__2_in_rule__UpdateMethod__Group_7_0__19863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__UpdateMethod__Group_7_0__1__Impl9891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_0__2__Impl_in_rule__UpdateMethod__Group_7_0__29922 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_0__3_in_rule__UpdateMethod__Group_7_0__29925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__ReturnTypeAssignment_7_0_2_in_rule__UpdateMethod__Group_7_0__2__Impl9952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_0__3__Impl_in_rule__UpdateMethod__Group_7_0__39982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__UpdateMethod__Group_7_0__3__Impl10010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_1__0__Impl_in_rule__UpdateMethod__Group_7_1__010049 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_1__1_in_rule__UpdateMethod__Group_7_1__010052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__ReturnCollectionAssignment_7_1_0_in_rule__UpdateMethod__Group_7_1__0__Impl10079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_1__1__Impl_in_rule__UpdateMethod__Group_7_1__110109 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_1__2_in_rule__UpdateMethod__Group_7_1__110112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__UpdateMethod__Group_7_1__1__Impl10140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_1__2__Impl_in_rule__UpdateMethod__Group_7_1__210171 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_1__3_in_rule__UpdateMethod__Group_7_1__210174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__ReturnTypeAssignment_7_1_2_in_rule__UpdateMethod__Group_7_1__2__Impl10201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UpdateMethod__Group_7_1__3__Impl_in_rule__UpdateMethod__Group_7_1__310231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__UpdateMethod__Group_7_1__3__Impl10259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__010298 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__010301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__NameAssignment_0_in_rule__Method__Group__0__Impl10328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__110358 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__110361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Method__Group__1__Impl10389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__210420 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__210423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2__0_in_rule__Method__Group__2__Impl10450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__310481 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__310484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Method__Group__3__Impl10512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__410543 = new BitSet(new long[]{0x0000E00000000020L});
        public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__410546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Method__Group__4__Impl10574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__510605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Alternatives_5_in_rule__Method__Group__5__Impl10632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2__0__Impl_in_rule__Method__Group_2__010674 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Method__Group_2__1_in_rule__Method__Group_2__010677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__ParameterTypesAssignment_2_0_in_rule__Method__Group_2__0__Impl10704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2__1__Impl_in_rule__Method__Group_2__110734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2_1__0_in_rule__Method__Group_2__1__Impl10761 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2_1__0__Impl_in_rule__Method__Group_2_1__010796 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Method__Group_2_1__1_in_rule__Method__Group_2_1__010799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Method__Group_2_1__0__Impl10827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2_1__1__Impl_in_rule__Method__Group_2_1__110858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__ParameterTypesAssignment_2_1_1_in_rule__Method__Group_2_1__1__Impl10885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_0__0__Impl_in_rule__Method__Group_5_0__010919 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Method__Group_5_0__1_in_rule__Method__Group_5_0__010922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__ReturnArrayAssignment_5_0_0_in_rule__Method__Group_5_0__0__Impl10949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_0__1__Impl_in_rule__Method__Group_5_0__110979 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Method__Group_5_0__2_in_rule__Method__Group_5_0__110982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Method__Group_5_0__1__Impl11010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_0__2__Impl_in_rule__Method__Group_5_0__211041 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Method__Group_5_0__3_in_rule__Method__Group_5_0__211044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_5_0_2_in_rule__Method__Group_5_0__2__Impl11071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_0__3__Impl_in_rule__Method__Group_5_0__311101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Method__Group_5_0__3__Impl11129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_1__0__Impl_in_rule__Method__Group_5_1__011168 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Method__Group_5_1__1_in_rule__Method__Group_5_1__011171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__ReturnCollectionAssignment_5_1_0_in_rule__Method__Group_5_1__0__Impl11198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_1__1__Impl_in_rule__Method__Group_5_1__111228 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Method__Group_5_1__2_in_rule__Method__Group_5_1__111231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Method__Group_5_1__1__Impl11259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_1__2__Impl_in_rule__Method__Group_5_1__211290 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Method__Group_5_1__3_in_rule__Method__Group_5_1__211293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_5_1_2_in_rule__Method__Group_5_1__2__Impl11320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_5_1__3__Impl_in_rule__Method__Group_5_1__311350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Method__Group_5_1__3__Impl11378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__011417 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__011420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl11447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__111476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl11503 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__011538 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__011541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__QualifiedName__Group_1__0__Impl11570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__111602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl11629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ApiDescription__ApiNameAssignment_111667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ApiDescription__MetamodelNameAssignment_411698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ApiDescription__MapperClassNameAssignment_5_211729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredElement_in_rule__ApiDescription__DeclaredElementsAssignment_611760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassMapping_in_rule__ApiDescription__ClassMappingsAssignment_711791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleClassMapping__MetaclassNameAssignment_111822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SimpleClassMapping__CanonicalClassNameAssignment_311853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreationMechanism_in_rule__SimpleClassMapping__CreationAssignment_4_111884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_rule__SimpleClassMapping__FeatureMappingsAssignment_4_211915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__EmptyConstructor__StatementAssignment_3_111946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__NonEmptyConstructor__ParametersAssignment_311981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__NonEmptyConstructor__ParametersAssignment_4_112020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_rule__NonEmptyConstructor__StatementAssignment_6_112055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetFeature__FeatureAssignment_112090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__SetFeature__IntValueAssignment_3_012125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__SetFeature__StrValueAssignment_3_112156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__SetFeature__BoolValueAssignment_3_212187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleAttributeMapping__FeatureNameAssignment_112218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__SimpleAttributeMapping__IsMultivaluedAssignment_212254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleAttributeMapping__TypeAssignment_412293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SimpleAttributeMapping__ConstructorTypeAssignment_5_212324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGetMechanism_in_rule__SimpleAttributeMapping__GetMethodAssignment_6_112355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetMechanism_in_rule__SimpleAttributeMapping__SetMethodAssignment_7_112386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleReferenceMapping__FeatureNameAssignment_112417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__SimpleReferenceMapping__IsMultivaluedAssignment_212453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleReferenceMapping__TypeAssignment_412496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SimpleReferenceMapping__ConstructorTypeAssignment_5_212531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGetMechanism_in_rule__SimpleReferenceMapping__GetMethodAssignment_6_112562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetMechanism_in_rule__SimpleReferenceMapping__SetMethodAssignment_7_112593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__SimpleGet__GetterAssignment_112624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__SimpleSet__SetterAssignment_112655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__GenericGet__GetterAssignment_112686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__GenericSet__SetterAssignment_112717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__IteratorGet__IteratorAssignment_112752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__IteratorGet__GetIteratorAssignment_312787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__IteratorDescription__NameAssignment_112818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__IteratorDescription__IteratorClassAssignment_312849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__IteratorDescription__HasFinishedAssignment_612880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__IteratorDescription__NextElementAssignment_812911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ObserverDescription__NameAssignment_112942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ObserverDescription__ObserverClassAssignment_312973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUpdateMethod_in_rule__ObserverDescription__UpdateMethodsAssignment_513004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__UpdateMethod__InterestAssignment_1_113035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__UpdateMethod__InterestAssignment_1_2_113066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UpdateMethod__NameAssignment_213097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ParameterTypesAssignment_4_013128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ParameterTypesAssignment_4_1_113159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__UpdateMethod__ReturnArrayAssignment_7_0_013195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ReturnTypeAssignment_7_0_213234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__UpdateMethod__ReturnCollectionAssignment_7_1_013270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ReturnTypeAssignment_7_1_213309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__UpdateMethod__ReturnTypeAssignment_7_213340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__UpdateMethod__ReturnVoidAssignment_7_313376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Method__NameAssignment_013415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Method__ParameterTypesAssignment_2_013446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Method__ParameterTypesAssignment_2_1_113477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Method__ReturnArrayAssignment_5_0_013513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Method__ReturnTypeAssignment_5_0_213552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Method__ReturnCollectionAssignment_5_1_013588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Method__ReturnTypeAssignment_5_1_213627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Method__ReturnTypeAssignment_5_213658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Method__ReturnVoidAssignment_5_313694 = new BitSet(new long[]{0x0000000000000002L});
    }


}