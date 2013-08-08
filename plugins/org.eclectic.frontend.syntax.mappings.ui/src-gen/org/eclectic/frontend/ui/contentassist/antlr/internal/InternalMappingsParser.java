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
import org.eclectic.frontend.services.MappingsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'^'", "'true'", "'false'", "'mappings'", "'('", "')'", "'->'", "':'", "'uses'", "'as'", "'delegate'", "'from'", "'to'", "','", "'.'", "'end'", "'['", "']'", "'!'", "'linking'", "'='", "'<-'", "'convert'", "'-'", "'*'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMappingsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMappingsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMappingsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g"; }


     
     	private MappingsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MappingsGrammarAccess grammarAccess) {
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:60:1: entryRuleMappingTransformation : ruleMappingTransformation EOF ;
    public final void entryRuleMappingTransformation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:61:1: ( ruleMappingTransformation EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:62:1: ruleMappingTransformation EOF
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:69:1: ruleMappingTransformation : ( ( rule__MappingTransformation__Group__0 ) ) ;
    public final void ruleMappingTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:73:2: ( ( ( rule__MappingTransformation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:74:1: ( ( rule__MappingTransformation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:74:1: ( ( rule__MappingTransformation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:75:1: ( rule__MappingTransformation__Group__0 )
            {
             before(grammarAccess.getMappingTransformationAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:76:1: ( rule__MappingTransformation__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:76:2: rule__MappingTransformation__Group__0
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


    // $ANTLR start "entryRuleAnnotation"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:88:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:89:1: ( ruleAnnotation EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:90:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation121);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation128); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:97:1: ruleAnnotation : ( ruleMetamodelModelAnnotation ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:101:2: ( ( ruleMetamodelModelAnnotation ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:102:1: ( ruleMetamodelModelAnnotation )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:102:1: ( ruleMetamodelModelAnnotation )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:103:1: ruleMetamodelModelAnnotation
            {
             before(grammarAccess.getAnnotationAccess().getMetamodelModelAnnotationParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetamodelModelAnnotation_in_ruleAnnotation154);
            ruleMetamodelModelAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getMetamodelModelAnnotationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleMetamodelModelAnnotation"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:116:1: entryRuleMetamodelModelAnnotation : ruleMetamodelModelAnnotation EOF ;
    public final void entryRuleMetamodelModelAnnotation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:117:1: ( ruleMetamodelModelAnnotation EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:118:1: ruleMetamodelModelAnnotation EOF
            {
             before(grammarAccess.getMetamodelModelAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetamodelModelAnnotation_in_entryRuleMetamodelModelAnnotation180);
            ruleMetamodelModelAnnotation();

            state._fsp--;

             after(grammarAccess.getMetamodelModelAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetamodelModelAnnotation187); 

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
    // $ANTLR end "entryRuleMetamodelModelAnnotation"


    // $ANTLR start "ruleMetamodelModelAnnotation"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:125:1: ruleMetamodelModelAnnotation : ( ( rule__MetamodelModelAnnotation__Group__0 ) ) ;
    public final void ruleMetamodelModelAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:129:2: ( ( ( rule__MetamodelModelAnnotation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:130:1: ( ( rule__MetamodelModelAnnotation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:130:1: ( ( rule__MetamodelModelAnnotation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:131:1: ( rule__MetamodelModelAnnotation__Group__0 )
            {
             before(grammarAccess.getMetamodelModelAnnotationAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:132:1: ( rule__MetamodelModelAnnotation__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:132:2: rule__MetamodelModelAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetamodelModelAnnotation__Group__0_in_ruleMetamodelModelAnnotation213);
            rule__MetamodelModelAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelModelAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelModelAnnotation"


    // $ANTLR start "entryRuleUsesStatements"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:144:1: entryRuleUsesStatements : ruleUsesStatements EOF ;
    public final void entryRuleUsesStatements() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:145:1: ( ruleUsesStatements EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:146:1: ruleUsesStatements EOF
            {
             before(grammarAccess.getUsesStatementsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUsesStatements_in_entryRuleUsesStatements240);
            ruleUsesStatements();

            state._fsp--;

             after(grammarAccess.getUsesStatementsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUsesStatements247); 

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
    // $ANTLR end "entryRuleUsesStatements"


    // $ANTLR start "ruleUsesStatements"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:153:1: ruleUsesStatements : ( ruleUseDeclaration ) ;
    public final void ruleUsesStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:157:2: ( ( ruleUseDeclaration ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:158:1: ( ruleUseDeclaration )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:158:1: ( ruleUseDeclaration )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:159:1: ruleUseDeclaration
            {
             before(grammarAccess.getUsesStatementsAccess().getUseDeclarationParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleUseDeclaration_in_ruleUsesStatements273);
            ruleUseDeclaration();

            state._fsp--;

             after(grammarAccess.getUsesStatementsAccess().getUseDeclarationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsesStatements"


    // $ANTLR start "entryRuleUseDeclaration"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:172:1: entryRuleUseDeclaration : ruleUseDeclaration EOF ;
    public final void entryRuleUseDeclaration() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:173:1: ( ruleUseDeclaration EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:174:1: ruleUseDeclaration EOF
            {
             before(grammarAccess.getUseDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUseDeclaration_in_entryRuleUseDeclaration299);
            ruleUseDeclaration();

            state._fsp--;

             after(grammarAccess.getUseDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUseDeclaration306); 

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
    // $ANTLR end "entryRuleUseDeclaration"


    // $ANTLR start "ruleUseDeclaration"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:181:1: ruleUseDeclaration : ( ( rule__UseDeclaration__Group__0 ) ) ;
    public final void ruleUseDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:185:2: ( ( ( rule__UseDeclaration__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:186:1: ( ( rule__UseDeclaration__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:186:1: ( ( rule__UseDeclaration__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:187:1: ( rule__UseDeclaration__Group__0 )
            {
             before(grammarAccess.getUseDeclarationAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:188:1: ( rule__UseDeclaration__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:188:2: rule__UseDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group__0_in_ruleUseDeclaration332);
            rule__UseDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseDeclaration"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:200:1: entryRuleTransformationDefinitionParameter : ruleTransformationDefinitionParameter EOF ;
    public final void entryRuleTransformationDefinitionParameter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:201:1: ( ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:202:1: ruleTransformationDefinitionParameter EOF
            {
             before(grammarAccess.getTransformationDefinitionParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter359);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getTransformationDefinitionParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter366); 

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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:209:1: ruleTransformationDefinitionParameter : ( ( rule__TransformationDefinitionParameter__Group__0 ) ) ;
    public final void ruleTransformationDefinitionParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:213:2: ( ( ( rule__TransformationDefinitionParameter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:214:1: ( ( rule__TransformationDefinitionParameter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:214:1: ( ( rule__TransformationDefinitionParameter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:215:1: ( rule__TransformationDefinitionParameter__Group__0 )
            {
             before(grammarAccess.getTransformationDefinitionParameterAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:216:1: ( rule__TransformationDefinitionParameter__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:216:2: rule__TransformationDefinitionParameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__0_in_ruleTransformationDefinitionParameter392);
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


    // $ANTLR start "entryRuleDelegate"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:228:1: entryRuleDelegate : ruleDelegate EOF ;
    public final void entryRuleDelegate() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:229:1: ( ruleDelegate EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:230:1: ruleDelegate EOF
            {
             before(grammarAccess.getDelegateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelegate_in_entryRuleDelegate419);
            ruleDelegate();

            state._fsp--;

             after(grammarAccess.getDelegateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelegate426); 

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
    // $ANTLR end "entryRuleDelegate"


    // $ANTLR start "ruleDelegate"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:237:1: ruleDelegate : ( ( rule__Delegate__Group__0 ) ) ;
    public final void ruleDelegate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:241:2: ( ( ( rule__Delegate__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:242:1: ( ( rule__Delegate__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:242:1: ( ( rule__Delegate__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:243:1: ( rule__Delegate__Group__0 )
            {
             before(grammarAccess.getDelegateAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:244:1: ( rule__Delegate__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:244:2: rule__Delegate__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__0_in_ruleDelegate452);
            rule__Delegate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelegate"


    // $ANTLR start "entryRuleContext"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:256:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:257:1: ( ruleContext EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:258:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext479);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext486); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:265:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:269:2: ( ( ( rule__Context__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:270:1: ( ( rule__Context__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:270:1: ( ( rule__Context__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:271:1: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:272:1: ( rule__Context__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:272:2: rule__Context__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__0_in_ruleContext512);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleTag"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:284:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:285:1: ( ruleTag EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:286:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTag_in_entryRuleTag539);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTag546); 

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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:293:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:297:2: ( ( ( rule__Tag__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:298:1: ( ( rule__Tag__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:298:1: ( ( rule__Tag__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:299:1: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:300:1: ( rule__Tag__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:300:2: rule__Tag__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Tag__Group__0_in_ruleTag572);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleMatchedElement"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:312:1: entryRuleMatchedElement : ruleMatchedElement EOF ;
    public final void entryRuleMatchedElement() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:313:1: ( ruleMatchedElement EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:314:1: ruleMatchedElement EOF
            {
             before(grammarAccess.getMatchedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_entryRuleMatchedElement599);
            ruleMatchedElement();

            state._fsp--;

             after(grammarAccess.getMatchedElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchedElement606); 

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
    // $ANTLR end "entryRuleMatchedElement"


    // $ANTLR start "ruleMatchedElement"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:321:1: ruleMatchedElement : ( ( rule__MatchedElement__Group__0 ) ) ;
    public final void ruleMatchedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:325:2: ( ( ( rule__MatchedElement__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:326:1: ( ( rule__MatchedElement__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:326:1: ( ( rule__MatchedElement__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:327:1: ( rule__MatchedElement__Group__0 )
            {
             before(grammarAccess.getMatchedElementAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:328:1: ( rule__MatchedElement__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:328:2: rule__MatchedElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__0_in_ruleMatchedElement632);
            rule__MatchedElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchedElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchedElement"


    // $ANTLR start "entryRuleSingleAnnotation"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:340:1: entryRuleSingleAnnotation : ruleSingleAnnotation EOF ;
    public final void entryRuleSingleAnnotation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:341:1: ( ruleSingleAnnotation EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:342:1: ruleSingleAnnotation EOF
            {
             before(grammarAccess.getSingleAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation659);
            ruleSingleAnnotation();

            state._fsp--;

             after(grammarAccess.getSingleAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleAnnotation666); 

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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:349:1: ruleSingleAnnotation : ( rulePotencyAnnotation ) ;
    public final void ruleSingleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:353:2: ( ( rulePotencyAnnotation ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:354:1: ( rulePotencyAnnotation )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:354:1: ( rulePotencyAnnotation )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:355:1: rulePotencyAnnotation
            {
             before(grammarAccess.getSingleAnnotationAccess().getPotencyAnnotationParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation692);
            rulePotencyAnnotation();

            state._fsp--;

             after(grammarAccess.getSingleAnnotationAccess().getPotencyAnnotationParserRuleCall()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:368:1: entryRulePotencyAnnotation : rulePotencyAnnotation EOF ;
    public final void entryRulePotencyAnnotation() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:369:1: ( rulePotencyAnnotation EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:370:1: rulePotencyAnnotation EOF
            {
             before(grammarAccess.getPotencyAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation718);
            rulePotencyAnnotation();

            state._fsp--;

             after(grammarAccess.getPotencyAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePotencyAnnotation725); 

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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:377:1: rulePotencyAnnotation : ( ( rule__PotencyAnnotation__Group__0 ) ) ;
    public final void rulePotencyAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:381:2: ( ( ( rule__PotencyAnnotation__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:382:1: ( ( rule__PotencyAnnotation__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:382:1: ( ( rule__PotencyAnnotation__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:383:1: ( rule__PotencyAnnotation__Group__0 )
            {
             before(grammarAccess.getPotencyAnnotationAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:384:1: ( rule__PotencyAnnotation__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:384:2: rule__PotencyAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Group__0_in_rulePotencyAnnotation751);
            rule__PotencyAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPotencyAnnotationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleC2CModifier"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:396:1: entryRuleC2CModifier : ruleC2CModifier EOF ;
    public final void entryRuleC2CModifier() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:397:1: ( ruleC2CModifier EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:398:1: ruleC2CModifier EOF
            {
             before(grammarAccess.getC2CModifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleC2CModifier_in_entryRuleC2CModifier778);
            ruleC2CModifier();

            state._fsp--;

             after(grammarAccess.getC2CModifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleC2CModifier785); 

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
    // $ANTLR end "entryRuleC2CModifier"


    // $ANTLR start "ruleC2CModifier"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:405:1: ruleC2CModifier : ( ruleLinkedBy ) ;
    public final void ruleC2CModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:409:2: ( ( ruleLinkedBy ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:410:1: ( ruleLinkedBy )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:410:1: ( ruleLinkedBy )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:411:1: ruleLinkedBy
            {
             before(grammarAccess.getC2CModifierAccess().getLinkedByParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkedBy_in_ruleC2CModifier811);
            ruleLinkedBy();

            state._fsp--;

             after(grammarAccess.getC2CModifierAccess().getLinkedByParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleC2CModifier"


    // $ANTLR start "entryRuleLinkedBy"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:424:1: entryRuleLinkedBy : ruleLinkedBy EOF ;
    public final void entryRuleLinkedBy() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:425:1: ( ruleLinkedBy EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:426:1: ruleLinkedBy EOF
            {
             before(grammarAccess.getLinkedByRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkedBy_in_entryRuleLinkedBy837);
            ruleLinkedBy();

            state._fsp--;

             after(grammarAccess.getLinkedByRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinkedBy844); 

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
    // $ANTLR end "entryRuleLinkedBy"


    // $ANTLR start "ruleLinkedBy"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:433:1: ruleLinkedBy : ( ( rule__LinkedBy__Group__0 ) ) ;
    public final void ruleLinkedBy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:437:2: ( ( ( rule__LinkedBy__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:438:1: ( ( rule__LinkedBy__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:438:1: ( ( rule__LinkedBy__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:439:1: ( rule__LinkedBy__Group__0 )
            {
             before(grammarAccess.getLinkedByAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:440:1: ( rule__LinkedBy__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:440:2: rule__LinkedBy__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__Group__0_in_ruleLinkedBy870);
            rule__LinkedBy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkedByAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkedBy"


    // $ANTLR start "entryRuleAttributeMapping"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:452:1: entryRuleAttributeMapping : ruleAttributeMapping EOF ;
    public final void entryRuleAttributeMapping() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:453:1: ( ruleAttributeMapping EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:454:1: ruleAttributeMapping EOF
            {
             before(grammarAccess.getAttributeMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeMapping_in_entryRuleAttributeMapping897);
            ruleAttributeMapping();

            state._fsp--;

             after(grammarAccess.getAttributeMappingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeMapping904); 

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
    // $ANTLR end "entryRuleAttributeMapping"


    // $ANTLR start "ruleAttributeMapping"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:461:1: ruleAttributeMapping : ( ( rule__AttributeMapping__Group__0 ) ) ;
    public final void ruleAttributeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:465:2: ( ( ( rule__AttributeMapping__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:466:1: ( ( rule__AttributeMapping__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:466:1: ( ( rule__AttributeMapping__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:467:1: ( rule__AttributeMapping__Group__0 )
            {
             before(grammarAccess.getAttributeMappingAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:468:1: ( rule__AttributeMapping__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:468:2: rule__AttributeMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group__0_in_ruleAttributeMapping930);
            rule__AttributeMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeMapping"


    // $ANTLR start "entryRuleAttributeRightPart"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:480:1: entryRuleAttributeRightPart : ruleAttributeRightPart EOF ;
    public final void entryRuleAttributeRightPart() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:481:1: ( ruleAttributeRightPart EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:482:1: ruleAttributeRightPart EOF
            {
             before(grammarAccess.getAttributeRightPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRightPart_in_entryRuleAttributeRightPart957);
            ruleAttributeRightPart();

            state._fsp--;

             after(grammarAccess.getAttributeRightPartRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeRightPart964); 

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
    // $ANTLR end "entryRuleAttributeRightPart"


    // $ANTLR start "ruleAttributeRightPart"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:489:1: ruleAttributeRightPart : ( ( rule__AttributeRightPart__Alternatives ) ) ;
    public final void ruleAttributeRightPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:493:2: ( ( ( rule__AttributeRightPart__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:494:1: ( ( rule__AttributeRightPart__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:494:1: ( ( rule__AttributeRightPart__Alternatives ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:495:1: ( rule__AttributeRightPart__Alternatives )
            {
             before(grammarAccess.getAttributeRightPartAccess().getAlternatives()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:496:1: ( rule__AttributeRightPart__Alternatives )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:496:2: rule__AttributeRightPart__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRightPart__Alternatives_in_ruleAttributeRightPart990);
            rule__AttributeRightPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRightPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeRightPart"


    // $ANTLR start "entryRuleAttribute2Attribute"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:508:1: entryRuleAttribute2Attribute : ruleAttribute2Attribute EOF ;
    public final void entryRuleAttribute2Attribute() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:509:1: ( ruleAttribute2Attribute EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:510:1: ruleAttribute2Attribute EOF
            {
             before(grammarAccess.getAttribute2AttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute2Attribute_in_entryRuleAttribute2Attribute1017);
            ruleAttribute2Attribute();

            state._fsp--;

             after(grammarAccess.getAttribute2AttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute2Attribute1024); 

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
    // $ANTLR end "entryRuleAttribute2Attribute"


    // $ANTLR start "ruleAttribute2Attribute"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:517:1: ruleAttribute2Attribute : ( ( rule__Attribute2Attribute__Group__0 ) ) ;
    public final void ruleAttribute2Attribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:521:2: ( ( ( rule__Attribute2Attribute__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:522:1: ( ( rule__Attribute2Attribute__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:522:1: ( ( rule__Attribute2Attribute__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:523:1: ( rule__Attribute2Attribute__Group__0 )
            {
             before(grammarAccess.getAttribute2AttributeAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:524:1: ( rule__Attribute2Attribute__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:524:2: rule__Attribute2Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group__0_in_ruleAttribute2Attribute1050);
            rule__Attribute2Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttribute2AttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute2Attribute"


    // $ANTLR start "entryRuleAttributeIsString"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:536:1: entryRuleAttributeIsString : ruleAttributeIsString EOF ;
    public final void entryRuleAttributeIsString() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:537:1: ( ruleAttributeIsString EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:538:1: ruleAttributeIsString EOF
            {
             before(grammarAccess.getAttributeIsStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeIsString_in_entryRuleAttributeIsString1077);
            ruleAttributeIsString();

            state._fsp--;

             after(grammarAccess.getAttributeIsStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeIsString1084); 

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
    // $ANTLR end "entryRuleAttributeIsString"


    // $ANTLR start "ruleAttributeIsString"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:545:1: ruleAttributeIsString : ( ( rule__AttributeIsString__StrValueAssignment ) ) ;
    public final void ruleAttributeIsString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:549:2: ( ( ( rule__AttributeIsString__StrValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:550:1: ( ( rule__AttributeIsString__StrValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:550:1: ( ( rule__AttributeIsString__StrValueAssignment ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:551:1: ( rule__AttributeIsString__StrValueAssignment )
            {
             before(grammarAccess.getAttributeIsStringAccess().getStrValueAssignment()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:552:1: ( rule__AttributeIsString__StrValueAssignment )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:552:2: rule__AttributeIsString__StrValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeIsString__StrValueAssignment_in_ruleAttributeIsString1110);
            rule__AttributeIsString__StrValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeIsStringAccess().getStrValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeIsString"


    // $ANTLR start "entryRuleAttributeIsBoolean"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:564:1: entryRuleAttributeIsBoolean : ruleAttributeIsBoolean EOF ;
    public final void entryRuleAttributeIsBoolean() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:565:1: ( ruleAttributeIsBoolean EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:566:1: ruleAttributeIsBoolean EOF
            {
             before(grammarAccess.getAttributeIsBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeIsBoolean_in_entryRuleAttributeIsBoolean1137);
            ruleAttributeIsBoolean();

            state._fsp--;

             after(grammarAccess.getAttributeIsBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeIsBoolean1144); 

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
    // $ANTLR end "entryRuleAttributeIsBoolean"


    // $ANTLR start "ruleAttributeIsBoolean"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:573:1: ruleAttributeIsBoolean : ( ( rule__AttributeIsBoolean__BoolValueAssignment ) ) ;
    public final void ruleAttributeIsBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:577:2: ( ( ( rule__AttributeIsBoolean__BoolValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:578:1: ( ( rule__AttributeIsBoolean__BoolValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:578:1: ( ( rule__AttributeIsBoolean__BoolValueAssignment ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:579:1: ( rule__AttributeIsBoolean__BoolValueAssignment )
            {
             before(grammarAccess.getAttributeIsBooleanAccess().getBoolValueAssignment()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:580:1: ( rule__AttributeIsBoolean__BoolValueAssignment )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:580:2: rule__AttributeIsBoolean__BoolValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeIsBoolean__BoolValueAssignment_in_ruleAttributeIsBoolean1170);
            rule__AttributeIsBoolean__BoolValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeIsBooleanAccess().getBoolValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeIsBoolean"


    // $ANTLR start "entryRuleAttributeIsDouble"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:592:1: entryRuleAttributeIsDouble : ruleAttributeIsDouble EOF ;
    public final void entryRuleAttributeIsDouble() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:593:1: ( ruleAttributeIsDouble EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:594:1: ruleAttributeIsDouble EOF
            {
             before(grammarAccess.getAttributeIsDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeIsDouble_in_entryRuleAttributeIsDouble1197);
            ruleAttributeIsDouble();

            state._fsp--;

             after(grammarAccess.getAttributeIsDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeIsDouble1204); 

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
    // $ANTLR end "entryRuleAttributeIsDouble"


    // $ANTLR start "ruleAttributeIsDouble"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:601:1: ruleAttributeIsDouble : ( ( rule__AttributeIsDouble__DoubleValueAssignment ) ) ;
    public final void ruleAttributeIsDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:605:2: ( ( ( rule__AttributeIsDouble__DoubleValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:606:1: ( ( rule__AttributeIsDouble__DoubleValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:606:1: ( ( rule__AttributeIsDouble__DoubleValueAssignment ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:607:1: ( rule__AttributeIsDouble__DoubleValueAssignment )
            {
             before(grammarAccess.getAttributeIsDoubleAccess().getDoubleValueAssignment()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:608:1: ( rule__AttributeIsDouble__DoubleValueAssignment )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:608:2: rule__AttributeIsDouble__DoubleValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeIsDouble__DoubleValueAssignment_in_ruleAttributeIsDouble1230);
            rule__AttributeIsDouble__DoubleValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeIsDoubleAccess().getDoubleValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeIsDouble"


    // $ANTLR start "entryRuleAttributeIsInteger"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:620:1: entryRuleAttributeIsInteger : ruleAttributeIsInteger EOF ;
    public final void entryRuleAttributeIsInteger() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:621:1: ( ruleAttributeIsInteger EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:622:1: ruleAttributeIsInteger EOF
            {
             before(grammarAccess.getAttributeIsIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeIsInteger_in_entryRuleAttributeIsInteger1257);
            ruleAttributeIsInteger();

            state._fsp--;

             after(grammarAccess.getAttributeIsIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeIsInteger1264); 

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
    // $ANTLR end "entryRuleAttributeIsInteger"


    // $ANTLR start "ruleAttributeIsInteger"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:629:1: ruleAttributeIsInteger : ( ( rule__AttributeIsInteger__IntValueAssignment ) ) ;
    public final void ruleAttributeIsInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:633:2: ( ( ( rule__AttributeIsInteger__IntValueAssignment ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:634:1: ( ( rule__AttributeIsInteger__IntValueAssignment ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:634:1: ( ( rule__AttributeIsInteger__IntValueAssignment ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:635:1: ( rule__AttributeIsInteger__IntValueAssignment )
            {
             before(grammarAccess.getAttributeIsIntegerAccess().getIntValueAssignment()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:636:1: ( rule__AttributeIsInteger__IntValueAssignment )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:636:2: rule__AttributeIsInteger__IntValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeIsInteger__IntValueAssignment_in_ruleAttributeIsInteger1290);
            rule__AttributeIsInteger__IntValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeIsIntegerAccess().getIntValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeIsInteger"


    // $ANTLR start "entryRuleAttributeRef"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:648:1: entryRuleAttributeRef : ruleAttributeRef EOF ;
    public final void entryRuleAttributeRef() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:649:1: ( ruleAttributeRef EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:650:1: ruleAttributeRef EOF
            {
             before(grammarAccess.getAttributeRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_entryRuleAttributeRef1317);
            ruleAttributeRef();

            state._fsp--;

             after(grammarAccess.getAttributeRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeRef1324); 

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
    // $ANTLR end "entryRuleAttributeRef"


    // $ANTLR start "ruleAttributeRef"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:657:1: ruleAttributeRef : ( ( rule__AttributeRef__Group__0 ) ) ;
    public final void ruleAttributeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:661:2: ( ( ( rule__AttributeRef__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:662:1: ( ( rule__AttributeRef__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:662:1: ( ( rule__AttributeRef__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:663:1: ( rule__AttributeRef__Group__0 )
            {
             before(grammarAccess.getAttributeRefAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:664:1: ( rule__AttributeRef__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:664:2: rule__AttributeRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group__0_in_ruleAttributeRef1350);
            rule__AttributeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeRef"


    // $ANTLR start "entryRuleReference2Reference"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:676:1: entryRuleReference2Reference : ruleReference2Reference EOF ;
    public final void entryRuleReference2Reference() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:677:1: ( ruleReference2Reference EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:678:1: ruleReference2Reference EOF
            {
             before(grammarAccess.getReference2ReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference2Reference_in_entryRuleReference2Reference1377);
            ruleReference2Reference();

            state._fsp--;

             after(grammarAccess.getReference2ReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference2Reference1384); 

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
    // $ANTLR end "entryRuleReference2Reference"


    // $ANTLR start "ruleReference2Reference"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:685:1: ruleReference2Reference : ( ( rule__Reference2Reference__Group__0 ) ) ;
    public final void ruleReference2Reference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:689:2: ( ( ( rule__Reference2Reference__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:690:1: ( ( rule__Reference2Reference__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:690:1: ( ( rule__Reference2Reference__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:691:1: ( rule__Reference2Reference__Group__0 )
            {
             before(grammarAccess.getReference2ReferenceAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:692:1: ( rule__Reference2Reference__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:692:2: rule__Reference2Reference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__0_in_ruleReference2Reference1410);
            rule__Reference2Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReference2ReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference2Reference"


    // $ANTLR start "entryRuleReferenceRef"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:704:1: entryRuleReferenceRef : ruleReferenceRef EOF ;
    public final void entryRuleReferenceRef() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:705:1: ( ruleReferenceRef EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:706:1: ruleReferenceRef EOF
            {
             before(grammarAccess.getReferenceRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_entryRuleReferenceRef1437);
            ruleReferenceRef();

            state._fsp--;

             after(grammarAccess.getReferenceRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceRef1444); 

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
    // $ANTLR end "entryRuleReferenceRef"


    // $ANTLR start "ruleReferenceRef"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:713:1: ruleReferenceRef : ( ( rule__ReferenceRef__Group__0 ) ) ;
    public final void ruleReferenceRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:717:2: ( ( ( rule__ReferenceRef__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:718:1: ( ( rule__ReferenceRef__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:718:1: ( ( rule__ReferenceRef__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:719:1: ( rule__ReferenceRef__Group__0 )
            {
             before(grammarAccess.getReferenceRefAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:720:1: ( rule__ReferenceRef__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:720:2: rule__ReferenceRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group__0_in_ruleReferenceRef1470);
            rule__ReferenceRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceRef"


    // $ANTLR start "entryRuleConverter"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:732:1: entryRuleConverter : ruleConverter EOF ;
    public final void entryRuleConverter() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:733:1: ( ruleConverter EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:734:1: ruleConverter EOF
            {
             before(grammarAccess.getConverterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConverter_in_entryRuleConverter1497);
            ruleConverter();

            state._fsp--;

             after(grammarAccess.getConverterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConverter1504); 

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
    // $ANTLR end "entryRuleConverter"


    // $ANTLR start "ruleConverter"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:741:1: ruleConverter : ( ( rule__Converter__Group__0 ) ) ;
    public final void ruleConverter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:745:2: ( ( ( rule__Converter__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:746:1: ( ( rule__Converter__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:746:1: ( ( rule__Converter__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:747:1: ( rule__Converter__Group__0 )
            {
             before(grammarAccess.getConverterAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:748:1: ( rule__Converter__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:748:2: rule__Converter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group__0_in_ruleConverter1530);
            rule__Converter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConverterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConverter"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:760:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:761:1: ( ruleEString EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:762:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1557);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1564); 

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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:769:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:773:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:774:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:774:1: ( ( rule__EString__Alternatives ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:775:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:776:1: ( rule__EString__Alternatives )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:776:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1590);
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


    // $ANTLR start "entryRuleEDouble"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:788:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:789:1: ( ruleEDouble EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:790:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1617);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1624); 

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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:797:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:801:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:802:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:802:1: ( ( rule__EDouble__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:803:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:804:1: ( rule__EDouble__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:804:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1650);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:816:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:817:1: ( ruleEBoolean EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:818:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1677);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1684); 

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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:825:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:829:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:830:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:830:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:831:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:832:1: ( rule__EBoolean__Alternatives )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:832:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1710);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStrictString"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:844:1: entryRuleStrictString : ruleStrictString EOF ;
    public final void entryRuleStrictString() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:845:1: ( ruleStrictString EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:846:1: ruleStrictString EOF
            {
             before(grammarAccess.getStrictStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrictString_in_entryRuleStrictString1737);
            ruleStrictString();

            state._fsp--;

             after(grammarAccess.getStrictStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrictString1744); 

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
    // $ANTLR end "entryRuleStrictString"


    // $ANTLR start "ruleStrictString"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:853:1: ruleStrictString : ( RULE_STRING ) ;
    public final void ruleStrictString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:857:2: ( ( RULE_STRING ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:858:1: ( RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:858:1: ( RULE_STRING )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:859:1: RULE_STRING
            {
             before(grammarAccess.getStrictStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStrictString1770); 
             after(grammarAccess.getStrictStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrictString"


    // $ANTLR start "entryRuleEInt"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:872:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:873:1: ( ruleEInt EOF )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:874:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1796);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1803); 

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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:881:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:885:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:886:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:886:1: ( ( rule__EInt__Group__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:887:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:888:1: ( rule__EInt__Group__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:888:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1829);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__Context__MappingsAlternatives_8_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:900:1: rule__Context__MappingsAlternatives_8_0 : ( ( ruleAttributeMapping ) | ( ruleReference2Reference ) );
    public final void rule__Context__MappingsAlternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:904:1: ( ( ruleAttributeMapping ) | ( ruleReference2Reference ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:905:1: ( ruleAttributeMapping )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:905:1: ( ruleAttributeMapping )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:906:1: ruleAttributeMapping
                    {
                     before(grammarAccess.getContextAccess().getMappingsAttributeMappingParserRuleCall_8_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeMapping_in_rule__Context__MappingsAlternatives_8_01865);
                    ruleAttributeMapping();

                    state._fsp--;

                     after(grammarAccess.getContextAccess().getMappingsAttributeMappingParserRuleCall_8_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:911:6: ( ruleReference2Reference )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:911:6: ( ruleReference2Reference )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:912:1: ruleReference2Reference
                    {
                     before(grammarAccess.getContextAccess().getMappingsReference2ReferenceParserRuleCall_8_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleReference2Reference_in_rule__Context__MappingsAlternatives_8_01882);
                    ruleReference2Reference();

                    state._fsp--;

                     after(grammarAccess.getContextAccess().getMappingsReference2ReferenceParserRuleCall_8_0_1()); 

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
    // $ANTLR end "rule__Context__MappingsAlternatives_8_0"


    // $ANTLR start "rule__PotencyAnnotation__Alternatives_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:922:1: rule__PotencyAnnotation__Alternatives_0 : ( ( '@' ) | ( '^' ) );
    public final void rule__PotencyAnnotation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:926:1: ( ( '@' ) | ( '^' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:927:1: ( '@' )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:927:1: ( '@' )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:928:1: '@'
                    {
                     before(grammarAccess.getPotencyAnnotationAccess().getCommercialAtKeyword_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__PotencyAnnotation__Alternatives_01915); 
                     after(grammarAccess.getPotencyAnnotationAccess().getCommercialAtKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:935:6: ( '^' )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:935:6: ( '^' )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:936:1: '^'
                    {
                     before(grammarAccess.getPotencyAnnotationAccess().getCircumflexAccentKeyword_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__PotencyAnnotation__Alternatives_01935); 
                     after(grammarAccess.getPotencyAnnotationAccess().getCircumflexAccentKeyword_0_1()); 

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


    // $ANTLR start "rule__AttributeRightPart__Alternatives"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:948:1: rule__AttributeRightPart__Alternatives : ( ( ruleAttributeIsString ) | ( ruleAttributeIsBoolean ) | ( ruleAttributeIsDouble ) | ( ruleAttributeIsInteger ) | ( ruleAttribute2Attribute ) );
    public final void rule__AttributeRightPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:952:1: ( ( ruleAttributeIsString ) | ( ruleAttributeIsBoolean ) | ( ruleAttributeIsDouble ) | ( ruleAttributeIsInteger ) | ( ruleAttribute2Attribute ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 13:
            case 14:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==EOF||(LA3_3>=RULE_STRING && LA3_3<=RULE_ID)||LA3_3==27) ) {
                    alt3=4;
                }
                else if ( (LA3_3==26) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case RULE_ID:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:953:1: ( ruleAttributeIsString )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:953:1: ( ruleAttributeIsString )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:954:1: ruleAttributeIsString
                    {
                     before(grammarAccess.getAttributeRightPartAccess().getAttributeIsStringParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeIsString_in_rule__AttributeRightPart__Alternatives1969);
                    ruleAttributeIsString();

                    state._fsp--;

                     after(grammarAccess.getAttributeRightPartAccess().getAttributeIsStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:959:6: ( ruleAttributeIsBoolean )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:959:6: ( ruleAttributeIsBoolean )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:960:1: ruleAttributeIsBoolean
                    {
                     before(grammarAccess.getAttributeRightPartAccess().getAttributeIsBooleanParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeIsBoolean_in_rule__AttributeRightPart__Alternatives1986);
                    ruleAttributeIsBoolean();

                    state._fsp--;

                     after(grammarAccess.getAttributeRightPartAccess().getAttributeIsBooleanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:965:6: ( ruleAttributeIsDouble )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:965:6: ( ruleAttributeIsDouble )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:966:1: ruleAttributeIsDouble
                    {
                     before(grammarAccess.getAttributeRightPartAccess().getAttributeIsDoubleParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeIsDouble_in_rule__AttributeRightPart__Alternatives2003);
                    ruleAttributeIsDouble();

                    state._fsp--;

                     after(grammarAccess.getAttributeRightPartAccess().getAttributeIsDoubleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:971:6: ( ruleAttributeIsInteger )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:971:6: ( ruleAttributeIsInteger )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:972:1: ruleAttributeIsInteger
                    {
                     before(grammarAccess.getAttributeRightPartAccess().getAttributeIsIntegerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeIsInteger_in_rule__AttributeRightPart__Alternatives2020);
                    ruleAttributeIsInteger();

                    state._fsp--;

                     after(grammarAccess.getAttributeRightPartAccess().getAttributeIsIntegerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:977:6: ( ruleAttribute2Attribute )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:977:6: ( ruleAttribute2Attribute )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:978:1: ruleAttribute2Attribute
                    {
                     before(grammarAccess.getAttributeRightPartAccess().getAttribute2AttributeParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute2Attribute_in_rule__AttributeRightPart__Alternatives2037);
                    ruleAttribute2Attribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeRightPartAccess().getAttribute2AttributeParserRuleCall_4()); 

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
    // $ANTLR end "rule__AttributeRightPart__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:988:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:992:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:993:1: ( RULE_STRING )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:993:1: ( RULE_STRING )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:994:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2069); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:999:6: ( RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:999:6: ( RULE_ID )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1000:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2086); 
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1010:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1014:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1015:1: ( 'true' )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1015:1: ( 'true' )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1016:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EBoolean__Alternatives2119); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1023:6: ( 'false' )
                    {
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1023:6: ( 'false' )
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1024:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__EBoolean__Alternatives2139); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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


    // $ANTLR start "rule__MappingTransformation__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1038:1: rule__MappingTransformation__Group__0 : rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1 ;
    public final void rule__MappingTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1042:1: ( rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1043:2: rule__MappingTransformation__Group__0__Impl rule__MappingTransformation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__0__Impl_in_rule__MappingTransformation__Group__02171);
            rule__MappingTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__1_in_rule__MappingTransformation__Group__02174);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1050:1: rule__MappingTransformation__Group__0__Impl : ( 'mappings' ) ;
    public final void rule__MappingTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1054:1: ( ( 'mappings' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1055:1: ( 'mappings' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1055:1: ( 'mappings' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1056:1: 'mappings'
            {
             before(grammarAccess.getMappingTransformationAccess().getMappingsKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__MappingTransformation__Group__0__Impl2202); 
             after(grammarAccess.getMappingTransformationAccess().getMappingsKeyword_0()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1069:1: rule__MappingTransformation__Group__1 : rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2 ;
    public final void rule__MappingTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1073:1: ( rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1074:2: rule__MappingTransformation__Group__1__Impl rule__MappingTransformation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__1__Impl_in_rule__MappingTransformation__Group__12233);
            rule__MappingTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__2_in_rule__MappingTransformation__Group__12236);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1081:1: rule__MappingTransformation__Group__1__Impl : ( ( rule__MappingTransformation__NameAssignment_1 ) ) ;
    public final void rule__MappingTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1085:1: ( ( ( rule__MappingTransformation__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1086:1: ( ( rule__MappingTransformation__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1086:1: ( ( rule__MappingTransformation__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1087:1: ( rule__MappingTransformation__NameAssignment_1 )
            {
             before(grammarAccess.getMappingTransformationAccess().getNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1088:1: ( rule__MappingTransformation__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1088:2: rule__MappingTransformation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__NameAssignment_1_in_rule__MappingTransformation__Group__1__Impl2263);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1098:1: rule__MappingTransformation__Group__2 : rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3 ;
    public final void rule__MappingTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1102:1: ( rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1103:2: rule__MappingTransformation__Group__2__Impl rule__MappingTransformation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__2__Impl_in_rule__MappingTransformation__Group__22293);
            rule__MappingTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__3_in_rule__MappingTransformation__Group__22296);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1110:1: rule__MappingTransformation__Group__2__Impl : ( '(' ) ;
    public final void rule__MappingTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1114:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1115:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1115:1: ( '(' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1116:1: '('
            {
             before(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MappingTransformation__Group__2__Impl2324); 
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1129:1: rule__MappingTransformation__Group__3 : rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4 ;
    public final void rule__MappingTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1133:1: ( rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1134:2: rule__MappingTransformation__Group__3__Impl rule__MappingTransformation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__3__Impl_in_rule__MappingTransformation__Group__32355);
            rule__MappingTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__4_in_rule__MappingTransformation__Group__32358);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1141:1: rule__MappingTransformation__Group__3__Impl : ( ( rule__MappingTransformation__InModelsAssignment_3 ) ) ;
    public final void rule__MappingTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1145:1: ( ( ( rule__MappingTransformation__InModelsAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1146:1: ( ( rule__MappingTransformation__InModelsAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1146:1: ( ( rule__MappingTransformation__InModelsAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1147:1: ( rule__MappingTransformation__InModelsAssignment_3 )
            {
             before(grammarAccess.getMappingTransformationAccess().getInModelsAssignment_3()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1148:1: ( rule__MappingTransformation__InModelsAssignment_3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1148:2: rule__MappingTransformation__InModelsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__InModelsAssignment_3_in_rule__MappingTransformation__Group__3__Impl2385);
            rule__MappingTransformation__InModelsAssignment_3();

            state._fsp--;


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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1158:1: rule__MappingTransformation__Group__4 : rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5 ;
    public final void rule__MappingTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1162:1: ( rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1163:2: rule__MappingTransformation__Group__4__Impl rule__MappingTransformation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__4__Impl_in_rule__MappingTransformation__Group__42415);
            rule__MappingTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__5_in_rule__MappingTransformation__Group__42418);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1170:1: rule__MappingTransformation__Group__4__Impl : ( ')' ) ;
    public final void rule__MappingTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1174:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1175:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1175:1: ( ')' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1176:1: ')'
            {
             before(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MappingTransformation__Group__4__Impl2446); 
             after(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1189:1: rule__MappingTransformation__Group__5 : rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6 ;
    public final void rule__MappingTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1193:1: ( rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1194:2: rule__MappingTransformation__Group__5__Impl rule__MappingTransformation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__5__Impl_in_rule__MappingTransformation__Group__52477);
            rule__MappingTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__6_in_rule__MappingTransformation__Group__52480);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1201:1: rule__MappingTransformation__Group__5__Impl : ( '->' ) ;
    public final void rule__MappingTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1205:1: ( ( '->' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1206:1: ( '->' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1206:1: ( '->' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1207:1: '->'
            {
             before(grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MappingTransformation__Group__5__Impl2508); 
             after(grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1220:1: rule__MappingTransformation__Group__6 : rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7 ;
    public final void rule__MappingTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1224:1: ( rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1225:2: rule__MappingTransformation__Group__6__Impl rule__MappingTransformation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__6__Impl_in_rule__MappingTransformation__Group__62539);
            rule__MappingTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__7_in_rule__MappingTransformation__Group__62542);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1232:1: rule__MappingTransformation__Group__6__Impl : ( '(' ) ;
    public final void rule__MappingTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1236:1: ( ( '(' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1237:1: ( '(' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1237:1: ( '(' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1238:1: '('
            {
             before(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MappingTransformation__Group__6__Impl2570); 
             after(grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1251:1: rule__MappingTransformation__Group__7 : rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8 ;
    public final void rule__MappingTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1255:1: ( rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1256:2: rule__MappingTransformation__Group__7__Impl rule__MappingTransformation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__7__Impl_in_rule__MappingTransformation__Group__72601);
            rule__MappingTransformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__8_in_rule__MappingTransformation__Group__72604);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1263:1: rule__MappingTransformation__Group__7__Impl : ( ( rule__MappingTransformation__OutModelsAssignment_7 ) ) ;
    public final void rule__MappingTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1267:1: ( ( ( rule__MappingTransformation__OutModelsAssignment_7 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1268:1: ( ( rule__MappingTransformation__OutModelsAssignment_7 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1268:1: ( ( rule__MappingTransformation__OutModelsAssignment_7 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1269:1: ( rule__MappingTransformation__OutModelsAssignment_7 )
            {
             before(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_7()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1270:1: ( rule__MappingTransformation__OutModelsAssignment_7 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1270:2: rule__MappingTransformation__OutModelsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__OutModelsAssignment_7_in_rule__MappingTransformation__Group__7__Impl2631);
            rule__MappingTransformation__OutModelsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_7()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1280:1: rule__MappingTransformation__Group__8 : rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9 ;
    public final void rule__MappingTransformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1284:1: ( rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1285:2: rule__MappingTransformation__Group__8__Impl rule__MappingTransformation__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__8__Impl_in_rule__MappingTransformation__Group__82661);
            rule__MappingTransformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__9_in_rule__MappingTransformation__Group__82664);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1292:1: rule__MappingTransformation__Group__8__Impl : ( ')' ) ;
    public final void rule__MappingTransformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1296:1: ( ( ')' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1297:1: ( ')' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1297:1: ( ')' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1298:1: ')'
            {
             before(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MappingTransformation__Group__8__Impl2692); 
             after(grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1311:1: rule__MappingTransformation__Group__9 : rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10 ;
    public final void rule__MappingTransformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1315:1: ( rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1316:2: rule__MappingTransformation__Group__9__Impl rule__MappingTransformation__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__9__Impl_in_rule__MappingTransformation__Group__92723);
            rule__MappingTransformation__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__10_in_rule__MappingTransformation__Group__92726);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1323:1: rule__MappingTransformation__Group__9__Impl : ( ( rule__MappingTransformation__AnnotationsAssignment_9 )* ) ;
    public final void rule__MappingTransformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1327:1: ( ( ( rule__MappingTransformation__AnnotationsAssignment_9 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1328:1: ( ( rule__MappingTransformation__AnnotationsAssignment_9 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1328:1: ( ( rule__MappingTransformation__AnnotationsAssignment_9 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1329:1: ( rule__MappingTransformation__AnnotationsAssignment_9 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getAnnotationsAssignment_9()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1330:1: ( rule__MappingTransformation__AnnotationsAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1330:2: rule__MappingTransformation__AnnotationsAssignment_9
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__AnnotationsAssignment_9_in_rule__MappingTransformation__Group__9__Impl2753);
            	    rule__MappingTransformation__AnnotationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getAnnotationsAssignment_9()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1340:1: rule__MappingTransformation__Group__10 : rule__MappingTransformation__Group__10__Impl rule__MappingTransformation__Group__11 ;
    public final void rule__MappingTransformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1344:1: ( rule__MappingTransformation__Group__10__Impl rule__MappingTransformation__Group__11 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1345:2: rule__MappingTransformation__Group__10__Impl rule__MappingTransformation__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__10__Impl_in_rule__MappingTransformation__Group__102784);
            rule__MappingTransformation__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__11_in_rule__MappingTransformation__Group__102787);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1352:1: rule__MappingTransformation__Group__10__Impl : ( ( rule__MappingTransformation__UsesAssignment_10 )* ) ;
    public final void rule__MappingTransformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1356:1: ( ( ( rule__MappingTransformation__UsesAssignment_10 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1357:1: ( ( rule__MappingTransformation__UsesAssignment_10 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1357:1: ( ( rule__MappingTransformation__UsesAssignment_10 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1358:1: ( rule__MappingTransformation__UsesAssignment_10 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getUsesAssignment_10()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1359:1: ( rule__MappingTransformation__UsesAssignment_10 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1359:2: rule__MappingTransformation__UsesAssignment_10
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__UsesAssignment_10_in_rule__MappingTransformation__Group__10__Impl2814);
            	    rule__MappingTransformation__UsesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getUsesAssignment_10()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1369:1: rule__MappingTransformation__Group__11 : rule__MappingTransformation__Group__11__Impl rule__MappingTransformation__Group__12 ;
    public final void rule__MappingTransformation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1373:1: ( rule__MappingTransformation__Group__11__Impl rule__MappingTransformation__Group__12 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1374:2: rule__MappingTransformation__Group__11__Impl rule__MappingTransformation__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__11__Impl_in_rule__MappingTransformation__Group__112845);
            rule__MappingTransformation__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__12_in_rule__MappingTransformation__Group__112848);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1381:1: rule__MappingTransformation__Group__11__Impl : ( ( rule__MappingTransformation__DelegatesAssignment_11 )* ) ;
    public final void rule__MappingTransformation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1385:1: ( ( ( rule__MappingTransformation__DelegatesAssignment_11 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1386:1: ( ( rule__MappingTransformation__DelegatesAssignment_11 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1386:1: ( ( rule__MappingTransformation__DelegatesAssignment_11 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1387:1: ( rule__MappingTransformation__DelegatesAssignment_11 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getDelegatesAssignment_11()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1388:1: ( rule__MappingTransformation__DelegatesAssignment_11 )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1388:2: rule__MappingTransformation__DelegatesAssignment_11
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__DelegatesAssignment_11_in_rule__MappingTransformation__Group__11__Impl2875);
            	    rule__MappingTransformation__DelegatesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getDelegatesAssignment_11()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1398:1: rule__MappingTransformation__Group__12 : rule__MappingTransformation__Group__12__Impl ;
    public final void rule__MappingTransformation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1402:1: ( rule__MappingTransformation__Group__12__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1403:2: rule__MappingTransformation__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__Group__12__Impl_in_rule__MappingTransformation__Group__122906);
            rule__MappingTransformation__Group__12__Impl();

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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1409:1: rule__MappingTransformation__Group__12__Impl : ( ( ( rule__MappingTransformation__ContextsAssignment_12 ) ) ( ( rule__MappingTransformation__ContextsAssignment_12 )* ) ) ;
    public final void rule__MappingTransformation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1413:1: ( ( ( ( rule__MappingTransformation__ContextsAssignment_12 ) ) ( ( rule__MappingTransformation__ContextsAssignment_12 )* ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1414:1: ( ( ( rule__MappingTransformation__ContextsAssignment_12 ) ) ( ( rule__MappingTransformation__ContextsAssignment_12 )* ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1414:1: ( ( ( rule__MappingTransformation__ContextsAssignment_12 ) ) ( ( rule__MappingTransformation__ContextsAssignment_12 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1415:1: ( ( rule__MappingTransformation__ContextsAssignment_12 ) ) ( ( rule__MappingTransformation__ContextsAssignment_12 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1415:1: ( ( rule__MappingTransformation__ContextsAssignment_12 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1416:1: ( rule__MappingTransformation__ContextsAssignment_12 )
            {
             before(grammarAccess.getMappingTransformationAccess().getContextsAssignment_12()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1417:1: ( rule__MappingTransformation__ContextsAssignment_12 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1417:2: rule__MappingTransformation__ContextsAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__ContextsAssignment_12_in_rule__MappingTransformation__Group__12__Impl2935);
            rule__MappingTransformation__ContextsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getMappingTransformationAccess().getContextsAssignment_12()); 

            }

            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1420:1: ( ( rule__MappingTransformation__ContextsAssignment_12 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1421:1: ( rule__MappingTransformation__ContextsAssignment_12 )*
            {
             before(grammarAccess.getMappingTransformationAccess().getContextsAssignment_12()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1422:1: ( rule__MappingTransformation__ContextsAssignment_12 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23||LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1422:2: rule__MappingTransformation__ContextsAssignment_12
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MappingTransformation__ContextsAssignment_12_in_rule__MappingTransformation__Group__12__Impl2947);
            	    rule__MappingTransformation__ContextsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMappingTransformationAccess().getContextsAssignment_12()); 

            }


            }


            }

        }
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


    // $ANTLR start "rule__MetamodelModelAnnotation__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1459:1: rule__MetamodelModelAnnotation__Group__0 : rule__MetamodelModelAnnotation__Group__0__Impl rule__MetamodelModelAnnotation__Group__1 ;
    public final void rule__MetamodelModelAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1463:1: ( rule__MetamodelModelAnnotation__Group__0__Impl rule__MetamodelModelAnnotation__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1464:2: rule__MetamodelModelAnnotation__Group__0__Impl rule__MetamodelModelAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetamodelModelAnnotation__Group__0__Impl_in_rule__MetamodelModelAnnotation__Group__03006);
            rule__MetamodelModelAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetamodelModelAnnotation__Group__1_in_rule__MetamodelModelAnnotation__Group__03009);
            rule__MetamodelModelAnnotation__Group__1();

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
    // $ANTLR end "rule__MetamodelModelAnnotation__Group__0"


    // $ANTLR start "rule__MetamodelModelAnnotation__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1471:1: rule__MetamodelModelAnnotation__Group__0__Impl : ( ( rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0 ) ) ;
    public final void rule__MetamodelModelAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1475:1: ( ( ( rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1476:1: ( ( rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1476:1: ( ( rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1477:1: ( rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0 )
            {
             before(grammarAccess.getMetamodelModelAnnotationAccess().getAnnotatedElementAssignment_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1478:1: ( rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1478:2: rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0_in_rule__MetamodelModelAnnotation__Group__0__Impl3036);
            rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelModelAnnotationAccess().getAnnotatedElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelModelAnnotation__Group__0__Impl"


    // $ANTLR start "rule__MetamodelModelAnnotation__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1488:1: rule__MetamodelModelAnnotation__Group__1 : rule__MetamodelModelAnnotation__Group__1__Impl rule__MetamodelModelAnnotation__Group__2 ;
    public final void rule__MetamodelModelAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1492:1: ( rule__MetamodelModelAnnotation__Group__1__Impl rule__MetamodelModelAnnotation__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1493:2: rule__MetamodelModelAnnotation__Group__1__Impl rule__MetamodelModelAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetamodelModelAnnotation__Group__1__Impl_in_rule__MetamodelModelAnnotation__Group__13066);
            rule__MetamodelModelAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetamodelModelAnnotation__Group__2_in_rule__MetamodelModelAnnotation__Group__13069);
            rule__MetamodelModelAnnotation__Group__2();

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
    // $ANTLR end "rule__MetamodelModelAnnotation__Group__1"


    // $ANTLR start "rule__MetamodelModelAnnotation__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1500:1: rule__MetamodelModelAnnotation__Group__1__Impl : ( ':' ) ;
    public final void rule__MetamodelModelAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1504:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1505:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1505:1: ( ':' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1506:1: ':'
            {
             before(grammarAccess.getMetamodelModelAnnotationAccess().getColonKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MetamodelModelAnnotation__Group__1__Impl3097); 
             after(grammarAccess.getMetamodelModelAnnotationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelModelAnnotation__Group__1__Impl"


    // $ANTLR start "rule__MetamodelModelAnnotation__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1519:1: rule__MetamodelModelAnnotation__Group__2 : rule__MetamodelModelAnnotation__Group__2__Impl ;
    public final void rule__MetamodelModelAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1523:1: ( rule__MetamodelModelAnnotation__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1524:2: rule__MetamodelModelAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetamodelModelAnnotation__Group__2__Impl_in_rule__MetamodelModelAnnotation__Group__23128);
            rule__MetamodelModelAnnotation__Group__2__Impl();

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
    // $ANTLR end "rule__MetamodelModelAnnotation__Group__2"


    // $ANTLR start "rule__MetamodelModelAnnotation__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1530:1: rule__MetamodelModelAnnotation__Group__2__Impl : ( ( rule__MetamodelModelAnnotation__MetamodelAssignment_2 ) ) ;
    public final void rule__MetamodelModelAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1534:1: ( ( ( rule__MetamodelModelAnnotation__MetamodelAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1535:1: ( ( rule__MetamodelModelAnnotation__MetamodelAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1535:1: ( ( rule__MetamodelModelAnnotation__MetamodelAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1536:1: ( rule__MetamodelModelAnnotation__MetamodelAssignment_2 )
            {
             before(grammarAccess.getMetamodelModelAnnotationAccess().getMetamodelAssignment_2()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1537:1: ( rule__MetamodelModelAnnotation__MetamodelAssignment_2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1537:2: rule__MetamodelModelAnnotation__MetamodelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetamodelModelAnnotation__MetamodelAssignment_2_in_rule__MetamodelModelAnnotation__Group__2__Impl3155);
            rule__MetamodelModelAnnotation__MetamodelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelModelAnnotationAccess().getMetamodelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelModelAnnotation__Group__2__Impl"


    // $ANTLR start "rule__UseDeclaration__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1553:1: rule__UseDeclaration__Group__0 : rule__UseDeclaration__Group__0__Impl rule__UseDeclaration__Group__1 ;
    public final void rule__UseDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1557:1: ( rule__UseDeclaration__Group__0__Impl rule__UseDeclaration__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1558:2: rule__UseDeclaration__Group__0__Impl rule__UseDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group__0__Impl_in_rule__UseDeclaration__Group__03191);
            rule__UseDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group__1_in_rule__UseDeclaration__Group__03194);
            rule__UseDeclaration__Group__1();

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
    // $ANTLR end "rule__UseDeclaration__Group__0"


    // $ANTLR start "rule__UseDeclaration__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1565:1: rule__UseDeclaration__Group__0__Impl : ( 'uses' ) ;
    public final void rule__UseDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1569:1: ( ( 'uses' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1570:1: ( 'uses' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1570:1: ( 'uses' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1571:1: 'uses'
            {
             before(grammarAccess.getUseDeclarationAccess().getUsesKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__UseDeclaration__Group__0__Impl3222); 
             after(grammarAccess.getUseDeclarationAccess().getUsesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDeclaration__Group__0__Impl"


    // $ANTLR start "rule__UseDeclaration__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1584:1: rule__UseDeclaration__Group__1 : rule__UseDeclaration__Group__1__Impl rule__UseDeclaration__Group__2 ;
    public final void rule__UseDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1588:1: ( rule__UseDeclaration__Group__1__Impl rule__UseDeclaration__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1589:2: rule__UseDeclaration__Group__1__Impl rule__UseDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group__1__Impl_in_rule__UseDeclaration__Group__13253);
            rule__UseDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group__2_in_rule__UseDeclaration__Group__13256);
            rule__UseDeclaration__Group__2();

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
    // $ANTLR end "rule__UseDeclaration__Group__1"


    // $ANTLR start "rule__UseDeclaration__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1596:1: rule__UseDeclaration__Group__1__Impl : ( ( rule__UseDeclaration__ModuleAssignment_1 ) ) ;
    public final void rule__UseDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1600:1: ( ( ( rule__UseDeclaration__ModuleAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1601:1: ( ( rule__UseDeclaration__ModuleAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1601:1: ( ( rule__UseDeclaration__ModuleAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1602:1: ( rule__UseDeclaration__ModuleAssignment_1 )
            {
             before(grammarAccess.getUseDeclarationAccess().getModuleAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1603:1: ( rule__UseDeclaration__ModuleAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1603:2: rule__UseDeclaration__ModuleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__ModuleAssignment_1_in_rule__UseDeclaration__Group__1__Impl3283);
            rule__UseDeclaration__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseDeclarationAccess().getModuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDeclaration__Group__1__Impl"


    // $ANTLR start "rule__UseDeclaration__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1613:1: rule__UseDeclaration__Group__2 : rule__UseDeclaration__Group__2__Impl ;
    public final void rule__UseDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1617:1: ( rule__UseDeclaration__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1618:2: rule__UseDeclaration__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group__2__Impl_in_rule__UseDeclaration__Group__23313);
            rule__UseDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__UseDeclaration__Group__2"


    // $ANTLR start "rule__UseDeclaration__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1624:1: rule__UseDeclaration__Group__2__Impl : ( ( rule__UseDeclaration__Group_2__0 )? ) ;
    public final void rule__UseDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1628:1: ( ( ( rule__UseDeclaration__Group_2__0 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1629:1: ( ( rule__UseDeclaration__Group_2__0 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1629:1: ( ( rule__UseDeclaration__Group_2__0 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1630:1: ( rule__UseDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getUseDeclarationAccess().getGroup_2()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1631:1: ( rule__UseDeclaration__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1631:2: rule__UseDeclaration__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group_2__0_in_rule__UseDeclaration__Group__2__Impl3340);
                    rule__UseDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDeclaration__Group__2__Impl"


    // $ANTLR start "rule__UseDeclaration__Group_2__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1647:1: rule__UseDeclaration__Group_2__0 : rule__UseDeclaration__Group_2__0__Impl rule__UseDeclaration__Group_2__1 ;
    public final void rule__UseDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1651:1: ( rule__UseDeclaration__Group_2__0__Impl rule__UseDeclaration__Group_2__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1652:2: rule__UseDeclaration__Group_2__0__Impl rule__UseDeclaration__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group_2__0__Impl_in_rule__UseDeclaration__Group_2__03377);
            rule__UseDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group_2__1_in_rule__UseDeclaration__Group_2__03380);
            rule__UseDeclaration__Group_2__1();

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
    // $ANTLR end "rule__UseDeclaration__Group_2__0"


    // $ANTLR start "rule__UseDeclaration__Group_2__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1659:1: rule__UseDeclaration__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__UseDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1663:1: ( ( 'as' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1664:1: ( 'as' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1664:1: ( 'as' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1665:1: 'as'
            {
             before(grammarAccess.getUseDeclarationAccess().getAsKeyword_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__UseDeclaration__Group_2__0__Impl3408); 
             after(grammarAccess.getUseDeclarationAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__UseDeclaration__Group_2__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1678:1: rule__UseDeclaration__Group_2__1 : rule__UseDeclaration__Group_2__1__Impl ;
    public final void rule__UseDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1682:1: ( rule__UseDeclaration__Group_2__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1683:2: rule__UseDeclaration__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__Group_2__1__Impl_in_rule__UseDeclaration__Group_2__13439);
            rule__UseDeclaration__Group_2__1__Impl();

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
    // $ANTLR end "rule__UseDeclaration__Group_2__1"


    // $ANTLR start "rule__UseDeclaration__Group_2__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1689:1: rule__UseDeclaration__Group_2__1__Impl : ( ( rule__UseDeclaration__AsAssignment_2_1 ) ) ;
    public final void rule__UseDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1693:1: ( ( ( rule__UseDeclaration__AsAssignment_2_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1694:1: ( ( rule__UseDeclaration__AsAssignment_2_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1694:1: ( ( rule__UseDeclaration__AsAssignment_2_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1695:1: ( rule__UseDeclaration__AsAssignment_2_1 )
            {
             before(grammarAccess.getUseDeclarationAccess().getAsAssignment_2_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1696:1: ( rule__UseDeclaration__AsAssignment_2_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1696:2: rule__UseDeclaration__AsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UseDeclaration__AsAssignment_2_1_in_rule__UseDeclaration__Group_2__1__Impl3466);
            rule__UseDeclaration__AsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseDeclarationAccess().getAsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__TransformationDefinitionParameter__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1710:1: rule__TransformationDefinitionParameter__Group__0 : rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1 ;
    public final void rule__TransformationDefinitionParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1714:1: ( rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1715:2: rule__TransformationDefinitionParameter__Group__0__Impl rule__TransformationDefinitionParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__0__Impl_in_rule__TransformationDefinitionParameter__Group__03500);
            rule__TransformationDefinitionParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__1_in_rule__TransformationDefinitionParameter__Group__03503);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1722:1: rule__TransformationDefinitionParameter__Group__0__Impl : ( () ) ;
    public final void rule__TransformationDefinitionParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1726:1: ( ( () ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1727:1: ( () )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1727:1: ( () )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1728:1: ()
            {
             before(grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1729:1: ()
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1731:1: 
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1741:1: rule__TransformationDefinitionParameter__Group__1 : rule__TransformationDefinitionParameter__Group__1__Impl ;
    public final void rule__TransformationDefinitionParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1745:1: ( rule__TransformationDefinitionParameter__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1746:2: rule__TransformationDefinitionParameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__Group__1__Impl_in_rule__TransformationDefinitionParameter__Group__13561);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1752:1: rule__TransformationDefinitionParameter__Group__1__Impl : ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) ) ;
    public final void rule__TransformationDefinitionParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1756:1: ( ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1757:1: ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1757:1: ( ( rule__TransformationDefinitionParameter__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1758:1: ( rule__TransformationDefinitionParameter__NameAssignment_1 )
            {
             before(grammarAccess.getTransformationDefinitionParameterAccess().getNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1759:1: ( rule__TransformationDefinitionParameter__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1759:2: rule__TransformationDefinitionParameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformationDefinitionParameter__NameAssignment_1_in_rule__TransformationDefinitionParameter__Group__1__Impl3588);
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


    // $ANTLR start "rule__Delegate__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1773:1: rule__Delegate__Group__0 : rule__Delegate__Group__0__Impl rule__Delegate__Group__1 ;
    public final void rule__Delegate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1777:1: ( rule__Delegate__Group__0__Impl rule__Delegate__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1778:2: rule__Delegate__Group__0__Impl rule__Delegate__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__0__Impl_in_rule__Delegate__Group__03622);
            rule__Delegate__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__1_in_rule__Delegate__Group__03625);
            rule__Delegate__Group__1();

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
    // $ANTLR end "rule__Delegate__Group__0"


    // $ANTLR start "rule__Delegate__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1785:1: rule__Delegate__Group__0__Impl : ( ( rule__Delegate__TagsAssignment_0 )* ) ;
    public final void rule__Delegate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1789:1: ( ( ( rule__Delegate__TagsAssignment_0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1790:1: ( ( rule__Delegate__TagsAssignment_0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1790:1: ( ( rule__Delegate__TagsAssignment_0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1791:1: ( rule__Delegate__TagsAssignment_0 )*
            {
             before(grammarAccess.getDelegateAccess().getTagsAssignment_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1792:1: ( rule__Delegate__TagsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1792:2: rule__Delegate__TagsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Delegate__TagsAssignment_0_in_rule__Delegate__Group__0__Impl3652);
            	    rule__Delegate__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDelegateAccess().getTagsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__0__Impl"


    // $ANTLR start "rule__Delegate__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1802:1: rule__Delegate__Group__1 : rule__Delegate__Group__1__Impl rule__Delegate__Group__2 ;
    public final void rule__Delegate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1806:1: ( rule__Delegate__Group__1__Impl rule__Delegate__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1807:2: rule__Delegate__Group__1__Impl rule__Delegate__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__1__Impl_in_rule__Delegate__Group__13683);
            rule__Delegate__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__2_in_rule__Delegate__Group__13686);
            rule__Delegate__Group__2();

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
    // $ANTLR end "rule__Delegate__Group__1"


    // $ANTLR start "rule__Delegate__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1814:1: rule__Delegate__Group__1__Impl : ( 'delegate' ) ;
    public final void rule__Delegate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1818:1: ( ( 'delegate' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1819:1: ( 'delegate' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1819:1: ( 'delegate' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1820:1: 'delegate'
            {
             before(grammarAccess.getDelegateAccess().getDelegateKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Delegate__Group__1__Impl3714); 
             after(grammarAccess.getDelegateAccess().getDelegateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__1__Impl"


    // $ANTLR start "rule__Delegate__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1833:1: rule__Delegate__Group__2 : rule__Delegate__Group__2__Impl rule__Delegate__Group__3 ;
    public final void rule__Delegate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1837:1: ( rule__Delegate__Group__2__Impl rule__Delegate__Group__3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1838:2: rule__Delegate__Group__2__Impl rule__Delegate__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__2__Impl_in_rule__Delegate__Group__23745);
            rule__Delegate__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__3_in_rule__Delegate__Group__23748);
            rule__Delegate__Group__3();

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
    // $ANTLR end "rule__Delegate__Group__2"


    // $ANTLR start "rule__Delegate__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1845:1: rule__Delegate__Group__2__Impl : ( 'from' ) ;
    public final void rule__Delegate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1849:1: ( ( 'from' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1850:1: ( 'from' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1850:1: ( 'from' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1851:1: 'from'
            {
             before(grammarAccess.getDelegateAccess().getFromKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Delegate__Group__2__Impl3776); 
             after(grammarAccess.getDelegateAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__2__Impl"


    // $ANTLR start "rule__Delegate__Group__3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1864:1: rule__Delegate__Group__3 : rule__Delegate__Group__3__Impl rule__Delegate__Group__4 ;
    public final void rule__Delegate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1868:1: ( rule__Delegate__Group__3__Impl rule__Delegate__Group__4 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1869:2: rule__Delegate__Group__3__Impl rule__Delegate__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__3__Impl_in_rule__Delegate__Group__33807);
            rule__Delegate__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__4_in_rule__Delegate__Group__33810);
            rule__Delegate__Group__4();

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
    // $ANTLR end "rule__Delegate__Group__3"


    // $ANTLR start "rule__Delegate__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1876:1: rule__Delegate__Group__3__Impl : ( ( rule__Delegate__LeftAssignment_3 ) ) ;
    public final void rule__Delegate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1880:1: ( ( ( rule__Delegate__LeftAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1881:1: ( ( rule__Delegate__LeftAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1881:1: ( ( rule__Delegate__LeftAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1882:1: ( rule__Delegate__LeftAssignment_3 )
            {
             before(grammarAccess.getDelegateAccess().getLeftAssignment_3()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1883:1: ( rule__Delegate__LeftAssignment_3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1883:2: rule__Delegate__LeftAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__LeftAssignment_3_in_rule__Delegate__Group__3__Impl3837);
            rule__Delegate__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__3__Impl"


    // $ANTLR start "rule__Delegate__Group__4"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1893:1: rule__Delegate__Group__4 : rule__Delegate__Group__4__Impl rule__Delegate__Group__5 ;
    public final void rule__Delegate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1897:1: ( rule__Delegate__Group__4__Impl rule__Delegate__Group__5 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1898:2: rule__Delegate__Group__4__Impl rule__Delegate__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__4__Impl_in_rule__Delegate__Group__43867);
            rule__Delegate__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__5_in_rule__Delegate__Group__43870);
            rule__Delegate__Group__5();

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
    // $ANTLR end "rule__Delegate__Group__4"


    // $ANTLR start "rule__Delegate__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1905:1: rule__Delegate__Group__4__Impl : ( ( rule__Delegate__Group_4__0 )* ) ;
    public final void rule__Delegate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1909:1: ( ( ( rule__Delegate__Group_4__0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1910:1: ( ( rule__Delegate__Group_4__0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1910:1: ( ( rule__Delegate__Group_4__0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1911:1: ( rule__Delegate__Group_4__0 )*
            {
             before(grammarAccess.getDelegateAccess().getGroup_4()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1912:1: ( rule__Delegate__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1912:2: rule__Delegate__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_4__0_in_rule__Delegate__Group__4__Impl3897);
            	    rule__Delegate__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDelegateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__4__Impl"


    // $ANTLR start "rule__Delegate__Group__5"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1922:1: rule__Delegate__Group__5 : rule__Delegate__Group__5__Impl rule__Delegate__Group__6 ;
    public final void rule__Delegate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1926:1: ( rule__Delegate__Group__5__Impl rule__Delegate__Group__6 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1927:2: rule__Delegate__Group__5__Impl rule__Delegate__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__5__Impl_in_rule__Delegate__Group__53928);
            rule__Delegate__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__6_in_rule__Delegate__Group__53931);
            rule__Delegate__Group__6();

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
    // $ANTLR end "rule__Delegate__Group__5"


    // $ANTLR start "rule__Delegate__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1934:1: rule__Delegate__Group__5__Impl : ( 'to' ) ;
    public final void rule__Delegate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1938:1: ( ( 'to' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1939:1: ( 'to' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1939:1: ( 'to' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1940:1: 'to'
            {
             before(grammarAccess.getDelegateAccess().getToKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Delegate__Group__5__Impl3959); 
             after(grammarAccess.getDelegateAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__5__Impl"


    // $ANTLR start "rule__Delegate__Group__6"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1953:1: rule__Delegate__Group__6 : rule__Delegate__Group__6__Impl rule__Delegate__Group__7 ;
    public final void rule__Delegate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1957:1: ( rule__Delegate__Group__6__Impl rule__Delegate__Group__7 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1958:2: rule__Delegate__Group__6__Impl rule__Delegate__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__6__Impl_in_rule__Delegate__Group__63990);
            rule__Delegate__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__7_in_rule__Delegate__Group__63993);
            rule__Delegate__Group__7();

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
    // $ANTLR end "rule__Delegate__Group__6"


    // $ANTLR start "rule__Delegate__Group__6__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1965:1: rule__Delegate__Group__6__Impl : ( ( rule__Delegate__Group_6__0 ) ) ;
    public final void rule__Delegate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1969:1: ( ( ( rule__Delegate__Group_6__0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1970:1: ( ( rule__Delegate__Group_6__0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1970:1: ( ( rule__Delegate__Group_6__0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1971:1: ( rule__Delegate__Group_6__0 )
            {
             before(grammarAccess.getDelegateAccess().getGroup_6()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1972:1: ( rule__Delegate__Group_6__0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1972:2: rule__Delegate__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_6__0_in_rule__Delegate__Group__6__Impl4020);
            rule__Delegate__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__6__Impl"


    // $ANTLR start "rule__Delegate__Group__7"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1982:1: rule__Delegate__Group__7 : rule__Delegate__Group__7__Impl rule__Delegate__Group__8 ;
    public final void rule__Delegate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1986:1: ( rule__Delegate__Group__7__Impl rule__Delegate__Group__8 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1987:2: rule__Delegate__Group__7__Impl rule__Delegate__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__7__Impl_in_rule__Delegate__Group__74050);
            rule__Delegate__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__8_in_rule__Delegate__Group__74053);
            rule__Delegate__Group__8();

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
    // $ANTLR end "rule__Delegate__Group__7"


    // $ANTLR start "rule__Delegate__Group__7__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1994:1: rule__Delegate__Group__7__Impl : ( ( rule__Delegate__LinkNameAssignment_7 ) ) ;
    public final void rule__Delegate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1998:1: ( ( ( rule__Delegate__LinkNameAssignment_7 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1999:1: ( ( rule__Delegate__LinkNameAssignment_7 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:1999:1: ( ( rule__Delegate__LinkNameAssignment_7 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2000:1: ( rule__Delegate__LinkNameAssignment_7 )
            {
             before(grammarAccess.getDelegateAccess().getLinkNameAssignment_7()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2001:1: ( rule__Delegate__LinkNameAssignment_7 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2001:2: rule__Delegate__LinkNameAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__LinkNameAssignment_7_in_rule__Delegate__Group__7__Impl4080);
            rule__Delegate__LinkNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getLinkNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__7__Impl"


    // $ANTLR start "rule__Delegate__Group__8"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2011:1: rule__Delegate__Group__8 : rule__Delegate__Group__8__Impl ;
    public final void rule__Delegate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2015:1: ( rule__Delegate__Group__8__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2016:2: rule__Delegate__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group__8__Impl_in_rule__Delegate__Group__84110);
            rule__Delegate__Group__8__Impl();

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
    // $ANTLR end "rule__Delegate__Group__8"


    // $ANTLR start "rule__Delegate__Group__8__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2022:1: rule__Delegate__Group__8__Impl : ( ( rule__Delegate__Group_8__0 )? ) ;
    public final void rule__Delegate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2026:1: ( ( ( rule__Delegate__Group_8__0 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2027:1: ( ( rule__Delegate__Group_8__0 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2027:1: ( ( rule__Delegate__Group_8__0 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2028:1: ( rule__Delegate__Group_8__0 )?
            {
             before(grammarAccess.getDelegateAccess().getGroup_8()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2029:1: ( rule__Delegate__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2029:2: rule__Delegate__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_8__0_in_rule__Delegate__Group__8__Impl4137);
                    rule__Delegate__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelegateAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__8__Impl"


    // $ANTLR start "rule__Delegate__Group_4__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2057:1: rule__Delegate__Group_4__0 : rule__Delegate__Group_4__0__Impl rule__Delegate__Group_4__1 ;
    public final void rule__Delegate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2061:1: ( rule__Delegate__Group_4__0__Impl rule__Delegate__Group_4__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2062:2: rule__Delegate__Group_4__0__Impl rule__Delegate__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_4__0__Impl_in_rule__Delegate__Group_4__04186);
            rule__Delegate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_4__1_in_rule__Delegate__Group_4__04189);
            rule__Delegate__Group_4__1();

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
    // $ANTLR end "rule__Delegate__Group_4__0"


    // $ANTLR start "rule__Delegate__Group_4__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2069:1: rule__Delegate__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Delegate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2073:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2074:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2074:1: ( ',' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2075:1: ','
            {
             before(grammarAccess.getDelegateAccess().getCommaKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Delegate__Group_4__0__Impl4217); 
             after(grammarAccess.getDelegateAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group_4__0__Impl"


    // $ANTLR start "rule__Delegate__Group_4__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2088:1: rule__Delegate__Group_4__1 : rule__Delegate__Group_4__1__Impl ;
    public final void rule__Delegate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2092:1: ( rule__Delegate__Group_4__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2093:2: rule__Delegate__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_4__1__Impl_in_rule__Delegate__Group_4__14248);
            rule__Delegate__Group_4__1__Impl();

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
    // $ANTLR end "rule__Delegate__Group_4__1"


    // $ANTLR start "rule__Delegate__Group_4__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2099:1: rule__Delegate__Group_4__1__Impl : ( ( rule__Delegate__LeftAssignment_4_1 ) ) ;
    public final void rule__Delegate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2103:1: ( ( ( rule__Delegate__LeftAssignment_4_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2104:1: ( ( rule__Delegate__LeftAssignment_4_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2104:1: ( ( rule__Delegate__LeftAssignment_4_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2105:1: ( rule__Delegate__LeftAssignment_4_1 )
            {
             before(grammarAccess.getDelegateAccess().getLeftAssignment_4_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2106:1: ( rule__Delegate__LeftAssignment_4_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2106:2: rule__Delegate__LeftAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__LeftAssignment_4_1_in_rule__Delegate__Group_4__1__Impl4275);
            rule__Delegate__LeftAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getLeftAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group_4__1__Impl"


    // $ANTLR start "rule__Delegate__Group_6__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2120:1: rule__Delegate__Group_6__0 : rule__Delegate__Group_6__0__Impl rule__Delegate__Group_6__1 ;
    public final void rule__Delegate__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2124:1: ( rule__Delegate__Group_6__0__Impl rule__Delegate__Group_6__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2125:2: rule__Delegate__Group_6__0__Impl rule__Delegate__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_6__0__Impl_in_rule__Delegate__Group_6__04309);
            rule__Delegate__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_6__1_in_rule__Delegate__Group_6__04312);
            rule__Delegate__Group_6__1();

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
    // $ANTLR end "rule__Delegate__Group_6__0"


    // $ANTLR start "rule__Delegate__Group_6__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2132:1: rule__Delegate__Group_6__0__Impl : ( ( rule__Delegate__ModuleAssignment_6_0 ) ) ;
    public final void rule__Delegate__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2136:1: ( ( ( rule__Delegate__ModuleAssignment_6_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2137:1: ( ( rule__Delegate__ModuleAssignment_6_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2137:1: ( ( rule__Delegate__ModuleAssignment_6_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2138:1: ( rule__Delegate__ModuleAssignment_6_0 )
            {
             before(grammarAccess.getDelegateAccess().getModuleAssignment_6_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2139:1: ( rule__Delegate__ModuleAssignment_6_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2139:2: rule__Delegate__ModuleAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__ModuleAssignment_6_0_in_rule__Delegate__Group_6__0__Impl4339);
            rule__Delegate__ModuleAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getModuleAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group_6__0__Impl"


    // $ANTLR start "rule__Delegate__Group_6__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2149:1: rule__Delegate__Group_6__1 : rule__Delegate__Group_6__1__Impl ;
    public final void rule__Delegate__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2153:1: ( rule__Delegate__Group_6__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2154:2: rule__Delegate__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_6__1__Impl_in_rule__Delegate__Group_6__14369);
            rule__Delegate__Group_6__1__Impl();

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
    // $ANTLR end "rule__Delegate__Group_6__1"


    // $ANTLR start "rule__Delegate__Group_6__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2160:1: rule__Delegate__Group_6__1__Impl : ( ( rule__Delegate__IsExternalAssignment_6_1 ) ) ;
    public final void rule__Delegate__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2164:1: ( ( ( rule__Delegate__IsExternalAssignment_6_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2165:1: ( ( rule__Delegate__IsExternalAssignment_6_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2165:1: ( ( rule__Delegate__IsExternalAssignment_6_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2166:1: ( rule__Delegate__IsExternalAssignment_6_1 )
            {
             before(grammarAccess.getDelegateAccess().getIsExternalAssignment_6_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2167:1: ( rule__Delegate__IsExternalAssignment_6_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2167:2: rule__Delegate__IsExternalAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__IsExternalAssignment_6_1_in_rule__Delegate__Group_6__1__Impl4396);
            rule__Delegate__IsExternalAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getIsExternalAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group_6__1__Impl"


    // $ANTLR start "rule__Delegate__Group_8__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2181:1: rule__Delegate__Group_8__0 : rule__Delegate__Group_8__0__Impl rule__Delegate__Group_8__1 ;
    public final void rule__Delegate__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2185:1: ( rule__Delegate__Group_8__0__Impl rule__Delegate__Group_8__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2186:2: rule__Delegate__Group_8__0__Impl rule__Delegate__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_8__0__Impl_in_rule__Delegate__Group_8__04430);
            rule__Delegate__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_8__1_in_rule__Delegate__Group_8__04433);
            rule__Delegate__Group_8__1();

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
    // $ANTLR end "rule__Delegate__Group_8__0"


    // $ANTLR start "rule__Delegate__Group_8__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2193:1: rule__Delegate__Group_8__0__Impl : ( '.' ) ;
    public final void rule__Delegate__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2197:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2198:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2198:1: ( '.' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2199:1: '.'
            {
             before(grammarAccess.getDelegateAccess().getFullStopKeyword_8_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Delegate__Group_8__0__Impl4461); 
             after(grammarAccess.getDelegateAccess().getFullStopKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group_8__0__Impl"


    // $ANTLR start "rule__Delegate__Group_8__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2212:1: rule__Delegate__Group_8__1 : rule__Delegate__Group_8__1__Impl ;
    public final void rule__Delegate__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2216:1: ( rule__Delegate__Group_8__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2217:2: rule__Delegate__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__Group_8__1__Impl_in_rule__Delegate__Group_8__14492);
            rule__Delegate__Group_8__1__Impl();

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
    // $ANTLR end "rule__Delegate__Group_8__1"


    // $ANTLR start "rule__Delegate__Group_8__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2223:1: rule__Delegate__Group_8__1__Impl : ( ( rule__Delegate__FeatureNameAssignment_8_1 ) ) ;
    public final void rule__Delegate__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2227:1: ( ( ( rule__Delegate__FeatureNameAssignment_8_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2228:1: ( ( rule__Delegate__FeatureNameAssignment_8_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2228:1: ( ( rule__Delegate__FeatureNameAssignment_8_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2229:1: ( rule__Delegate__FeatureNameAssignment_8_1 )
            {
             before(grammarAccess.getDelegateAccess().getFeatureNameAssignment_8_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2230:1: ( rule__Delegate__FeatureNameAssignment_8_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2230:2: rule__Delegate__FeatureNameAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delegate__FeatureNameAssignment_8_1_in_rule__Delegate__Group_8__1__Impl4519);
            rule__Delegate__FeatureNameAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getFeatureNameAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group_8__1__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2244:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2248:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2249:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__04553);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__1_in_rule__Context__Group__04556);
            rule__Context__Group__1();

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
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2256:1: rule__Context__Group__0__Impl : ( ( rule__Context__TagsAssignment_0 )* ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2260:1: ( ( ( rule__Context__TagsAssignment_0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2261:1: ( ( rule__Context__TagsAssignment_0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2261:1: ( ( rule__Context__TagsAssignment_0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2262:1: ( rule__Context__TagsAssignment_0 )*
            {
             before(grammarAccess.getContextAccess().getTagsAssignment_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2263:1: ( rule__Context__TagsAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2263:2: rule__Context__TagsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__TagsAssignment_0_in_rule__Context__Group__0__Impl4583);
            	    rule__Context__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getTagsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2273:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2277:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2278:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__14614);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__2_in_rule__Context__Group__14617);
            rule__Context__Group__2();

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
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2285:1: rule__Context__Group__1__Impl : ( 'from' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2289:1: ( ( 'from' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2290:1: ( 'from' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2290:1: ( 'from' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2291:1: 'from'
            {
             before(grammarAccess.getContextAccess().getFromKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Context__Group__1__Impl4645); 
             after(grammarAccess.getContextAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2304:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2308:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2309:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__24676);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__3_in_rule__Context__Group__24679);
            rule__Context__Group__3();

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
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2316:1: rule__Context__Group__2__Impl : ( ( rule__Context__LeftAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2320:1: ( ( ( rule__Context__LeftAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2321:1: ( ( rule__Context__LeftAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2321:1: ( ( rule__Context__LeftAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2322:1: ( rule__Context__LeftAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getLeftAssignment_2()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2323:1: ( rule__Context__LeftAssignment_2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2323:2: rule__Context__LeftAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__LeftAssignment_2_in_rule__Context__Group__2__Impl4706);
            rule__Context__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2333:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2337:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2338:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__34736);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__4_in_rule__Context__Group__34739);
            rule__Context__Group__4();

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
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2345:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )* ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2349:1: ( ( ( rule__Context__Group_3__0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2350:1: ( ( rule__Context__Group_3__0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2350:1: ( ( rule__Context__Group_3__0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2351:1: ( rule__Context__Group_3__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2352:1: ( rule__Context__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2352:2: rule__Context__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__0_in_rule__Context__Group__3__Impl4766);
            	    rule__Context__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2362:1: rule__Context__Group__4 : rule__Context__Group__4__Impl rule__Context__Group__5 ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2366:1: ( rule__Context__Group__4__Impl rule__Context__Group__5 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2367:2: rule__Context__Group__4__Impl rule__Context__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__44797);
            rule__Context__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__5_in_rule__Context__Group__44800);
            rule__Context__Group__5();

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
    // $ANTLR end "rule__Context__Group__4"


    // $ANTLR start "rule__Context__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2374:1: rule__Context__Group__4__Impl : ( 'to' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2378:1: ( ( 'to' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2379:1: ( 'to' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2379:1: ( 'to' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2380:1: 'to'
            {
             before(grammarAccess.getContextAccess().getToKeyword_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Context__Group__4__Impl4828); 
             after(grammarAccess.getContextAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__Context__Group__5"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2393:1: rule__Context__Group__5 : rule__Context__Group__5__Impl rule__Context__Group__6 ;
    public final void rule__Context__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2397:1: ( rule__Context__Group__5__Impl rule__Context__Group__6 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2398:2: rule__Context__Group__5__Impl rule__Context__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__5__Impl_in_rule__Context__Group__54859);
            rule__Context__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__6_in_rule__Context__Group__54862);
            rule__Context__Group__6();

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
    // $ANTLR end "rule__Context__Group__5"


    // $ANTLR start "rule__Context__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2405:1: rule__Context__Group__5__Impl : ( ( rule__Context__RightAssignment_5 ) ) ;
    public final void rule__Context__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2409:1: ( ( ( rule__Context__RightAssignment_5 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2410:1: ( ( rule__Context__RightAssignment_5 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2410:1: ( ( rule__Context__RightAssignment_5 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2411:1: ( rule__Context__RightAssignment_5 )
            {
             before(grammarAccess.getContextAccess().getRightAssignment_5()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2412:1: ( rule__Context__RightAssignment_5 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2412:2: rule__Context__RightAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__RightAssignment_5_in_rule__Context__Group__5__Impl4889);
            rule__Context__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__5__Impl"


    // $ANTLR start "rule__Context__Group__6"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2422:1: rule__Context__Group__6 : rule__Context__Group__6__Impl rule__Context__Group__7 ;
    public final void rule__Context__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2426:1: ( rule__Context__Group__6__Impl rule__Context__Group__7 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2427:2: rule__Context__Group__6__Impl rule__Context__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__6__Impl_in_rule__Context__Group__64919);
            rule__Context__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__7_in_rule__Context__Group__64922);
            rule__Context__Group__7();

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
    // $ANTLR end "rule__Context__Group__6"


    // $ANTLR start "rule__Context__Group__6__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2434:1: rule__Context__Group__6__Impl : ( ( rule__Context__Group_6__0 )* ) ;
    public final void rule__Context__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2438:1: ( ( ( rule__Context__Group_6__0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2439:1: ( ( rule__Context__Group_6__0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2439:1: ( ( rule__Context__Group_6__0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2440:1: ( rule__Context__Group_6__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_6()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2441:1: ( rule__Context__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2441:2: rule__Context__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__0_in_rule__Context__Group__6__Impl4949);
            	    rule__Context__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__6__Impl"


    // $ANTLR start "rule__Context__Group__7"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2451:1: rule__Context__Group__7 : rule__Context__Group__7__Impl rule__Context__Group__8 ;
    public final void rule__Context__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2455:1: ( rule__Context__Group__7__Impl rule__Context__Group__8 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2456:2: rule__Context__Group__7__Impl rule__Context__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__7__Impl_in_rule__Context__Group__74980);
            rule__Context__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__8_in_rule__Context__Group__74983);
            rule__Context__Group__8();

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
    // $ANTLR end "rule__Context__Group__7"


    // $ANTLR start "rule__Context__Group__7__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2463:1: rule__Context__Group__7__Impl : ( ( rule__Context__ModifiersAssignment_7 )* ) ;
    public final void rule__Context__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2467:1: ( ( ( rule__Context__ModifiersAssignment_7 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2468:1: ( ( rule__Context__ModifiersAssignment_7 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2468:1: ( ( rule__Context__ModifiersAssignment_7 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2469:1: ( rule__Context__ModifiersAssignment_7 )*
            {
             before(grammarAccess.getContextAccess().getModifiersAssignment_7()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2470:1: ( rule__Context__ModifiersAssignment_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2470:2: rule__Context__ModifiersAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__ModifiersAssignment_7_in_rule__Context__Group__7__Impl5010);
            	    rule__Context__ModifiersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getModifiersAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__7__Impl"


    // $ANTLR start "rule__Context__Group__8"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2480:1: rule__Context__Group__8 : rule__Context__Group__8__Impl rule__Context__Group__9 ;
    public final void rule__Context__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2484:1: ( rule__Context__Group__8__Impl rule__Context__Group__9 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2485:2: rule__Context__Group__8__Impl rule__Context__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__8__Impl_in_rule__Context__Group__85041);
            rule__Context__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__9_in_rule__Context__Group__85044);
            rule__Context__Group__9();

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
    // $ANTLR end "rule__Context__Group__8"


    // $ANTLR start "rule__Context__Group__8__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2492:1: rule__Context__Group__8__Impl : ( ( rule__Context__MappingsAssignment_8 )* ) ;
    public final void rule__Context__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2496:1: ( ( ( rule__Context__MappingsAssignment_8 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2497:1: ( ( rule__Context__MappingsAssignment_8 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2497:1: ( ( rule__Context__MappingsAssignment_8 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2498:1: ( rule__Context__MappingsAssignment_8 )*
            {
             before(grammarAccess.getContextAccess().getMappingsAssignment_8()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2499:1: ( rule__Context__MappingsAssignment_8 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2499:2: rule__Context__MappingsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__MappingsAssignment_8_in_rule__Context__Group__8__Impl5071);
            	    rule__Context__MappingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getMappingsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__8__Impl"


    // $ANTLR start "rule__Context__Group__9"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2509:1: rule__Context__Group__9 : rule__Context__Group__9__Impl ;
    public final void rule__Context__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2513:1: ( rule__Context__Group__9__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2514:2: rule__Context__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__9__Impl_in_rule__Context__Group__95102);
            rule__Context__Group__9__Impl();

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
    // $ANTLR end "rule__Context__Group__9"


    // $ANTLR start "rule__Context__Group__9__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2520:1: rule__Context__Group__9__Impl : ( 'end' ) ;
    public final void rule__Context__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2524:1: ( ( 'end' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2525:1: ( 'end' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2525:1: ( 'end' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2526:1: 'end'
            {
             before(grammarAccess.getContextAccess().getEndKeyword_9()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Context__Group__9__Impl5130); 
             after(grammarAccess.getContextAccess().getEndKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__9__Impl"


    // $ANTLR start "rule__Context__Group_3__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2559:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2563:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2564:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__0__Impl_in_rule__Context__Group_3__05181);
            rule__Context__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__1_in_rule__Context__Group_3__05184);
            rule__Context__Group_3__1();

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
    // $ANTLR end "rule__Context__Group_3__0"


    // $ANTLR start "rule__Context__Group_3__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2571:1: rule__Context__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2575:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2576:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2576:1: ( ',' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2577:1: ','
            {
             before(grammarAccess.getContextAccess().getCommaKeyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Context__Group_3__0__Impl5212); 
             after(grammarAccess.getContextAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__0__Impl"


    // $ANTLR start "rule__Context__Group_3__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2590:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2594:1: ( rule__Context__Group_3__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2595:2: rule__Context__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__1__Impl_in_rule__Context__Group_3__15243);
            rule__Context__Group_3__1__Impl();

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
    // $ANTLR end "rule__Context__Group_3__1"


    // $ANTLR start "rule__Context__Group_3__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2601:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__LeftAssignment_3_1 ) ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2605:1: ( ( ( rule__Context__LeftAssignment_3_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2606:1: ( ( rule__Context__LeftAssignment_3_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2606:1: ( ( rule__Context__LeftAssignment_3_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2607:1: ( rule__Context__LeftAssignment_3_1 )
            {
             before(grammarAccess.getContextAccess().getLeftAssignment_3_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2608:1: ( rule__Context__LeftAssignment_3_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2608:2: rule__Context__LeftAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__LeftAssignment_3_1_in_rule__Context__Group_3__1__Impl5270);
            rule__Context__LeftAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getLeftAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__1__Impl"


    // $ANTLR start "rule__Context__Group_6__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2622:1: rule__Context__Group_6__0 : rule__Context__Group_6__0__Impl rule__Context__Group_6__1 ;
    public final void rule__Context__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2626:1: ( rule__Context__Group_6__0__Impl rule__Context__Group_6__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2627:2: rule__Context__Group_6__0__Impl rule__Context__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__0__Impl_in_rule__Context__Group_6__05304);
            rule__Context__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__1_in_rule__Context__Group_6__05307);
            rule__Context__Group_6__1();

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
    // $ANTLR end "rule__Context__Group_6__0"


    // $ANTLR start "rule__Context__Group_6__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2634:1: rule__Context__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2638:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2639:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2639:1: ( ',' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2640:1: ','
            {
             before(grammarAccess.getContextAccess().getCommaKeyword_6_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Context__Group_6__0__Impl5335); 
             after(grammarAccess.getContextAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__0__Impl"


    // $ANTLR start "rule__Context__Group_6__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2653:1: rule__Context__Group_6__1 : rule__Context__Group_6__1__Impl ;
    public final void rule__Context__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2657:1: ( rule__Context__Group_6__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2658:2: rule__Context__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__1__Impl_in_rule__Context__Group_6__15366);
            rule__Context__Group_6__1__Impl();

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
    // $ANTLR end "rule__Context__Group_6__1"


    // $ANTLR start "rule__Context__Group_6__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2664:1: rule__Context__Group_6__1__Impl : ( ( rule__Context__RightAssignment_6_1 ) ) ;
    public final void rule__Context__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2668:1: ( ( ( rule__Context__RightAssignment_6_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2669:1: ( ( rule__Context__RightAssignment_6_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2669:1: ( ( rule__Context__RightAssignment_6_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2670:1: ( rule__Context__RightAssignment_6_1 )
            {
             before(grammarAccess.getContextAccess().getRightAssignment_6_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2671:1: ( rule__Context__RightAssignment_6_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2671:2: rule__Context__RightAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__RightAssignment_6_1_in_rule__Context__Group_6__1__Impl5393);
            rule__Context__RightAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getRightAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__1__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2685:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2689:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2690:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Tag__Group__0__Impl_in_rule__Tag__Group__05427);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Tag__Group__1_in_rule__Tag__Group__05430);
            rule__Tag__Group__1();

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
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2697:1: rule__Tag__Group__0__Impl : ( '[' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2701:1: ( ( '[' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2702:1: ( '[' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2702:1: ( '[' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2703:1: '['
            {
             before(grammarAccess.getTagAccess().getLeftSquareBracketKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Tag__Group__0__Impl5458); 
             after(grammarAccess.getTagAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2716:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2720:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2721:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Tag__Group__1__Impl_in_rule__Tag__Group__15489);
            rule__Tag__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Tag__Group__2_in_rule__Tag__Group__15492);
            rule__Tag__Group__2();

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
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2728:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__NameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2732:1: ( ( ( rule__Tag__NameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2733:1: ( ( rule__Tag__NameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2733:1: ( ( rule__Tag__NameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2734:1: ( rule__Tag__NameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2735:1: ( rule__Tag__NameAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2735:2: rule__Tag__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Tag__NameAssignment_1_in_rule__Tag__Group__1__Impl5519);
            rule__Tag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2745:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2749:1: ( rule__Tag__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2750:2: rule__Tag__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Tag__Group__2__Impl_in_rule__Tag__Group__25549);
            rule__Tag__Group__2__Impl();

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
    // $ANTLR end "rule__Tag__Group__2"


    // $ANTLR start "rule__Tag__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2756:1: rule__Tag__Group__2__Impl : ( ']' ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2760:1: ( ( ']' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2761:1: ( ']' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2761:1: ( ']' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2762:1: ']'
            {
             before(grammarAccess.getTagAccess().getRightSquareBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Tag__Group__2__Impl5577); 
             after(grammarAccess.getTagAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2__Impl"


    // $ANTLR start "rule__MatchedElement__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2781:1: rule__MatchedElement__Group__0 : rule__MatchedElement__Group__0__Impl rule__MatchedElement__Group__1 ;
    public final void rule__MatchedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2785:1: ( rule__MatchedElement__Group__0__Impl rule__MatchedElement__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2786:2: rule__MatchedElement__Group__0__Impl rule__MatchedElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__0__Impl_in_rule__MatchedElement__Group__05614);
            rule__MatchedElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__1_in_rule__MatchedElement__Group__05617);
            rule__MatchedElement__Group__1();

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
    // $ANTLR end "rule__MatchedElement__Group__0"


    // $ANTLR start "rule__MatchedElement__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2793:1: rule__MatchedElement__Group__0__Impl : ( ( rule__MatchedElement__Group_0__0 )? ) ;
    public final void rule__MatchedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2797:1: ( ( ( rule__MatchedElement__Group_0__0 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2798:1: ( ( rule__MatchedElement__Group_0__0 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2798:1: ( ( rule__MatchedElement__Group_0__0 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2799:1: ( rule__MatchedElement__Group_0__0 )?
            {
             before(grammarAccess.getMatchedElementAccess().getGroup_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2800:1: ( rule__MatchedElement__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==19) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2800:2: rule__MatchedElement__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group_0__0_in_rule__MatchedElement__Group__0__Impl5644);
                    rule__MatchedElement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchedElementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__Group__0__Impl"


    // $ANTLR start "rule__MatchedElement__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2810:1: rule__MatchedElement__Group__1 : rule__MatchedElement__Group__1__Impl rule__MatchedElement__Group__2 ;
    public final void rule__MatchedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2814:1: ( rule__MatchedElement__Group__1__Impl rule__MatchedElement__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2815:2: rule__MatchedElement__Group__1__Impl rule__MatchedElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__1__Impl_in_rule__MatchedElement__Group__15675);
            rule__MatchedElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__2_in_rule__MatchedElement__Group__15678);
            rule__MatchedElement__Group__2();

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
    // $ANTLR end "rule__MatchedElement__Group__1"


    // $ANTLR start "rule__MatchedElement__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2822:1: rule__MatchedElement__Group__1__Impl : ( ( rule__MatchedElement__ModelAssignment_1 ) ) ;
    public final void rule__MatchedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2826:1: ( ( ( rule__MatchedElement__ModelAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2827:1: ( ( rule__MatchedElement__ModelAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2827:1: ( ( rule__MatchedElement__ModelAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2828:1: ( rule__MatchedElement__ModelAssignment_1 )
            {
             before(grammarAccess.getMatchedElementAccess().getModelAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2829:1: ( rule__MatchedElement__ModelAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2829:2: rule__MatchedElement__ModelAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__ModelAssignment_1_in_rule__MatchedElement__Group__1__Impl5705);
            rule__MatchedElement__ModelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchedElementAccess().getModelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__Group__1__Impl"


    // $ANTLR start "rule__MatchedElement__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2839:1: rule__MatchedElement__Group__2 : rule__MatchedElement__Group__2__Impl rule__MatchedElement__Group__3 ;
    public final void rule__MatchedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2843:1: ( rule__MatchedElement__Group__2__Impl rule__MatchedElement__Group__3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2844:2: rule__MatchedElement__Group__2__Impl rule__MatchedElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__2__Impl_in_rule__MatchedElement__Group__25735);
            rule__MatchedElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__3_in_rule__MatchedElement__Group__25738);
            rule__MatchedElement__Group__3();

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
    // $ANTLR end "rule__MatchedElement__Group__2"


    // $ANTLR start "rule__MatchedElement__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2851:1: rule__MatchedElement__Group__2__Impl : ( '!' ) ;
    public final void rule__MatchedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2855:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2856:1: ( '!' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2856:1: ( '!' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2857:1: '!'
            {
             before(grammarAccess.getMatchedElementAccess().getExclamationMarkKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MatchedElement__Group__2__Impl5766); 
             after(grammarAccess.getMatchedElementAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__Group__2__Impl"


    // $ANTLR start "rule__MatchedElement__Group__3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2870:1: rule__MatchedElement__Group__3 : rule__MatchedElement__Group__3__Impl rule__MatchedElement__Group__4 ;
    public final void rule__MatchedElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2874:1: ( rule__MatchedElement__Group__3__Impl rule__MatchedElement__Group__4 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2875:2: rule__MatchedElement__Group__3__Impl rule__MatchedElement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__3__Impl_in_rule__MatchedElement__Group__35797);
            rule__MatchedElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__4_in_rule__MatchedElement__Group__35800);
            rule__MatchedElement__Group__4();

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
    // $ANTLR end "rule__MatchedElement__Group__3"


    // $ANTLR start "rule__MatchedElement__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2882:1: rule__MatchedElement__Group__3__Impl : ( ( rule__MatchedElement__ClassNameAssignment_3 ) ) ;
    public final void rule__MatchedElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2886:1: ( ( ( rule__MatchedElement__ClassNameAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2887:1: ( ( rule__MatchedElement__ClassNameAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2887:1: ( ( rule__MatchedElement__ClassNameAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2888:1: ( rule__MatchedElement__ClassNameAssignment_3 )
            {
             before(grammarAccess.getMatchedElementAccess().getClassNameAssignment_3()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2889:1: ( rule__MatchedElement__ClassNameAssignment_3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2889:2: rule__MatchedElement__ClassNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__ClassNameAssignment_3_in_rule__MatchedElement__Group__3__Impl5827);
            rule__MatchedElement__ClassNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMatchedElementAccess().getClassNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__Group__3__Impl"


    // $ANTLR start "rule__MatchedElement__Group__4"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2899:1: rule__MatchedElement__Group__4 : rule__MatchedElement__Group__4__Impl rule__MatchedElement__Group__5 ;
    public final void rule__MatchedElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2903:1: ( rule__MatchedElement__Group__4__Impl rule__MatchedElement__Group__5 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2904:2: rule__MatchedElement__Group__4__Impl rule__MatchedElement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__4__Impl_in_rule__MatchedElement__Group__45857);
            rule__MatchedElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__5_in_rule__MatchedElement__Group__45860);
            rule__MatchedElement__Group__5();

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
    // $ANTLR end "rule__MatchedElement__Group__4"


    // $ANTLR start "rule__MatchedElement__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2911:1: rule__MatchedElement__Group__4__Impl : ( ( rule__MatchedElement__AnnotationsAssignment_4 )? ) ;
    public final void rule__MatchedElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2915:1: ( ( ( rule__MatchedElement__AnnotationsAssignment_4 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2916:1: ( ( rule__MatchedElement__AnnotationsAssignment_4 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2916:1: ( ( rule__MatchedElement__AnnotationsAssignment_4 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2917:1: ( rule__MatchedElement__AnnotationsAssignment_4 )?
            {
             before(grammarAccess.getMatchedElementAccess().getAnnotationsAssignment_4()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2918:1: ( rule__MatchedElement__AnnotationsAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=11 && LA20_0<=12)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2918:2: rule__MatchedElement__AnnotationsAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__AnnotationsAssignment_4_in_rule__MatchedElement__Group__4__Impl5887);
                    rule__MatchedElement__AnnotationsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchedElementAccess().getAnnotationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__Group__4__Impl"


    // $ANTLR start "rule__MatchedElement__Group__5"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2928:1: rule__MatchedElement__Group__5 : rule__MatchedElement__Group__5__Impl ;
    public final void rule__MatchedElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2932:1: ( rule__MatchedElement__Group__5__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2933:2: rule__MatchedElement__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group__5__Impl_in_rule__MatchedElement__Group__55918);
            rule__MatchedElement__Group__5__Impl();

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
    // $ANTLR end "rule__MatchedElement__Group__5"


    // $ANTLR start "rule__MatchedElement__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2939:1: rule__MatchedElement__Group__5__Impl : ( ( rule__MatchedElement__StrictTypeAssignment_5 )? ) ;
    public final void rule__MatchedElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2943:1: ( ( ( rule__MatchedElement__StrictTypeAssignment_5 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2944:1: ( ( rule__MatchedElement__StrictTypeAssignment_5 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2944:1: ( ( rule__MatchedElement__StrictTypeAssignment_5 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2945:1: ( rule__MatchedElement__StrictTypeAssignment_5 )?
            {
             before(grammarAccess.getMatchedElementAccess().getStrictTypeAssignment_5()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2946:1: ( rule__MatchedElement__StrictTypeAssignment_5 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2946:2: rule__MatchedElement__StrictTypeAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__StrictTypeAssignment_5_in_rule__MatchedElement__Group__5__Impl5945);
                    rule__MatchedElement__StrictTypeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchedElementAccess().getStrictTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__Group__5__Impl"


    // $ANTLR start "rule__MatchedElement__Group_0__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2968:1: rule__MatchedElement__Group_0__0 : rule__MatchedElement__Group_0__0__Impl rule__MatchedElement__Group_0__1 ;
    public final void rule__MatchedElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2972:1: ( rule__MatchedElement__Group_0__0__Impl rule__MatchedElement__Group_0__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2973:2: rule__MatchedElement__Group_0__0__Impl rule__MatchedElement__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group_0__0__Impl_in_rule__MatchedElement__Group_0__05988);
            rule__MatchedElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group_0__1_in_rule__MatchedElement__Group_0__05991);
            rule__MatchedElement__Group_0__1();

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
    // $ANTLR end "rule__MatchedElement__Group_0__0"


    // $ANTLR start "rule__MatchedElement__Group_0__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2980:1: rule__MatchedElement__Group_0__0__Impl : ( ( rule__MatchedElement__NameAssignment_0_0 ) ) ;
    public final void rule__MatchedElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2984:1: ( ( ( rule__MatchedElement__NameAssignment_0_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2985:1: ( ( rule__MatchedElement__NameAssignment_0_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2985:1: ( ( rule__MatchedElement__NameAssignment_0_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2986:1: ( rule__MatchedElement__NameAssignment_0_0 )
            {
             before(grammarAccess.getMatchedElementAccess().getNameAssignment_0_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2987:1: ( rule__MatchedElement__NameAssignment_0_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2987:2: rule__MatchedElement__NameAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__NameAssignment_0_0_in_rule__MatchedElement__Group_0__0__Impl6018);
            rule__MatchedElement__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMatchedElementAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__Group_0__0__Impl"


    // $ANTLR start "rule__MatchedElement__Group_0__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:2997:1: rule__MatchedElement__Group_0__1 : rule__MatchedElement__Group_0__1__Impl ;
    public final void rule__MatchedElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3001:1: ( rule__MatchedElement__Group_0__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3002:2: rule__MatchedElement__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatchedElement__Group_0__1__Impl_in_rule__MatchedElement__Group_0__16048);
            rule__MatchedElement__Group_0__1__Impl();

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
    // $ANTLR end "rule__MatchedElement__Group_0__1"


    // $ANTLR start "rule__MatchedElement__Group_0__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3008:1: rule__MatchedElement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__MatchedElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3012:1: ( ( ':' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3013:1: ( ':' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3013:1: ( ':' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3014:1: ':'
            {
             before(grammarAccess.getMatchedElementAccess().getColonKeyword_0_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MatchedElement__Group_0__1__Impl6076); 
             after(grammarAccess.getMatchedElementAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__Group_0__1__Impl"


    // $ANTLR start "rule__PotencyAnnotation__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3031:1: rule__PotencyAnnotation__Group__0 : rule__PotencyAnnotation__Group__0__Impl rule__PotencyAnnotation__Group__1 ;
    public final void rule__PotencyAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3035:1: ( rule__PotencyAnnotation__Group__0__Impl rule__PotencyAnnotation__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3036:2: rule__PotencyAnnotation__Group__0__Impl rule__PotencyAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Group__0__Impl_in_rule__PotencyAnnotation__Group__06111);
            rule__PotencyAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Group__1_in_rule__PotencyAnnotation__Group__06114);
            rule__PotencyAnnotation__Group__1();

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
    // $ANTLR end "rule__PotencyAnnotation__Group__0"


    // $ANTLR start "rule__PotencyAnnotation__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3043:1: rule__PotencyAnnotation__Group__0__Impl : ( ( rule__PotencyAnnotation__Alternatives_0 ) ) ;
    public final void rule__PotencyAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3047:1: ( ( ( rule__PotencyAnnotation__Alternatives_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3048:1: ( ( rule__PotencyAnnotation__Alternatives_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3048:1: ( ( rule__PotencyAnnotation__Alternatives_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3049:1: ( rule__PotencyAnnotation__Alternatives_0 )
            {
             before(grammarAccess.getPotencyAnnotationAccess().getAlternatives_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3050:1: ( rule__PotencyAnnotation__Alternatives_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3050:2: rule__PotencyAnnotation__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Alternatives_0_in_rule__PotencyAnnotation__Group__0__Impl6141);
            rule__PotencyAnnotation__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPotencyAnnotationAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3060:1: rule__PotencyAnnotation__Group__1 : rule__PotencyAnnotation__Group__1__Impl ;
    public final void rule__PotencyAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3064:1: ( rule__PotencyAnnotation__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3065:2: rule__PotencyAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__Group__1__Impl_in_rule__PotencyAnnotation__Group__16171);
            rule__PotencyAnnotation__Group__1__Impl();

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
    // $ANTLR end "rule__PotencyAnnotation__Group__1"


    // $ANTLR start "rule__PotencyAnnotation__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3071:1: rule__PotencyAnnotation__Group__1__Impl : ( ( rule__PotencyAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__PotencyAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3075:1: ( ( ( rule__PotencyAnnotation__ValueAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3076:1: ( ( rule__PotencyAnnotation__ValueAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3076:1: ( ( rule__PotencyAnnotation__ValueAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3077:1: ( rule__PotencyAnnotation__ValueAssignment_1 )
            {
             before(grammarAccess.getPotencyAnnotationAccess().getValueAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3078:1: ( rule__PotencyAnnotation__ValueAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3078:2: rule__PotencyAnnotation__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PotencyAnnotation__ValueAssignment_1_in_rule__PotencyAnnotation__Group__1__Impl6198);
            rule__PotencyAnnotation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPotencyAnnotationAccess().getValueAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__LinkedBy__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3092:1: rule__LinkedBy__Group__0 : rule__LinkedBy__Group__0__Impl rule__LinkedBy__Group__1 ;
    public final void rule__LinkedBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3096:1: ( rule__LinkedBy__Group__0__Impl rule__LinkedBy__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3097:2: rule__LinkedBy__Group__0__Impl rule__LinkedBy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__Group__0__Impl_in_rule__LinkedBy__Group__06232);
            rule__LinkedBy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__Group__1_in_rule__LinkedBy__Group__06235);
            rule__LinkedBy__Group__1();

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
    // $ANTLR end "rule__LinkedBy__Group__0"


    // $ANTLR start "rule__LinkedBy__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3104:1: rule__LinkedBy__Group__0__Impl : ( 'linking' ) ;
    public final void rule__LinkedBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3108:1: ( ( 'linking' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3109:1: ( 'linking' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3109:1: ( 'linking' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3110:1: 'linking'
            {
             before(grammarAccess.getLinkedByAccess().getLinkingKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__LinkedBy__Group__0__Impl6263); 
             after(grammarAccess.getLinkedByAccess().getLinkingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkedBy__Group__0__Impl"


    // $ANTLR start "rule__LinkedBy__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3123:1: rule__LinkedBy__Group__1 : rule__LinkedBy__Group__1__Impl rule__LinkedBy__Group__2 ;
    public final void rule__LinkedBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3127:1: ( rule__LinkedBy__Group__1__Impl rule__LinkedBy__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3128:2: rule__LinkedBy__Group__1__Impl rule__LinkedBy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__Group__1__Impl_in_rule__LinkedBy__Group__16294);
            rule__LinkedBy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__Group__2_in_rule__LinkedBy__Group__16297);
            rule__LinkedBy__Group__2();

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
    // $ANTLR end "rule__LinkedBy__Group__1"


    // $ANTLR start "rule__LinkedBy__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3135:1: rule__LinkedBy__Group__1__Impl : ( ( rule__LinkedBy__AttributeAssignment_1 ) ) ;
    public final void rule__LinkedBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3139:1: ( ( ( rule__LinkedBy__AttributeAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3140:1: ( ( rule__LinkedBy__AttributeAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3140:1: ( ( rule__LinkedBy__AttributeAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3141:1: ( rule__LinkedBy__AttributeAssignment_1 )
            {
             before(grammarAccess.getLinkedByAccess().getAttributeAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3142:1: ( rule__LinkedBy__AttributeAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3142:2: rule__LinkedBy__AttributeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__AttributeAssignment_1_in_rule__LinkedBy__Group__1__Impl6324);
            rule__LinkedBy__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkedByAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkedBy__Group__1__Impl"


    // $ANTLR start "rule__LinkedBy__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3152:1: rule__LinkedBy__Group__2 : rule__LinkedBy__Group__2__Impl rule__LinkedBy__Group__3 ;
    public final void rule__LinkedBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3156:1: ( rule__LinkedBy__Group__2__Impl rule__LinkedBy__Group__3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3157:2: rule__LinkedBy__Group__2__Impl rule__LinkedBy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__Group__2__Impl_in_rule__LinkedBy__Group__26354);
            rule__LinkedBy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__Group__3_in_rule__LinkedBy__Group__26357);
            rule__LinkedBy__Group__3();

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
    // $ANTLR end "rule__LinkedBy__Group__2"


    // $ANTLR start "rule__LinkedBy__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3164:1: rule__LinkedBy__Group__2__Impl : ( '=' ) ;
    public final void rule__LinkedBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3168:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3169:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3169:1: ( '=' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3170:1: '='
            {
             before(grammarAccess.getLinkedByAccess().getEqualsSignKeyword_2()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__LinkedBy__Group__2__Impl6385); 
             after(grammarAccess.getLinkedByAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkedBy__Group__2__Impl"


    // $ANTLR start "rule__LinkedBy__Group__3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3183:1: rule__LinkedBy__Group__3 : rule__LinkedBy__Group__3__Impl ;
    public final void rule__LinkedBy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3187:1: ( rule__LinkedBy__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3188:2: rule__LinkedBy__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__Group__3__Impl_in_rule__LinkedBy__Group__36416);
            rule__LinkedBy__Group__3__Impl();

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
    // $ANTLR end "rule__LinkedBy__Group__3"


    // $ANTLR start "rule__LinkedBy__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3194:1: rule__LinkedBy__Group__3__Impl : ( ( rule__LinkedBy__LinkedElementAssignment_3 ) ) ;
    public final void rule__LinkedBy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3198:1: ( ( ( rule__LinkedBy__LinkedElementAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3199:1: ( ( rule__LinkedBy__LinkedElementAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3199:1: ( ( rule__LinkedBy__LinkedElementAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3200:1: ( rule__LinkedBy__LinkedElementAssignment_3 )
            {
             before(grammarAccess.getLinkedByAccess().getLinkedElementAssignment_3()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3201:1: ( rule__LinkedBy__LinkedElementAssignment_3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3201:2: rule__LinkedBy__LinkedElementAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LinkedBy__LinkedElementAssignment_3_in_rule__LinkedBy__Group__3__Impl6443);
            rule__LinkedBy__LinkedElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkedByAccess().getLinkedElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkedBy__Group__3__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3219:1: rule__AttributeMapping__Group__0 : rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1 ;
    public final void rule__AttributeMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3223:1: ( rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3224:2: rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group__0__Impl_in_rule__AttributeMapping__Group__06481);
            rule__AttributeMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group__1_in_rule__AttributeMapping__Group__06484);
            rule__AttributeMapping__Group__1();

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
    // $ANTLR end "rule__AttributeMapping__Group__0"


    // $ANTLR start "rule__AttributeMapping__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3231:1: rule__AttributeMapping__Group__0__Impl : ( ( rule__AttributeMapping__LeftAssignment_0 ) ) ;
    public final void rule__AttributeMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3235:1: ( ( ( rule__AttributeMapping__LeftAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3236:1: ( ( rule__AttributeMapping__LeftAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3236:1: ( ( rule__AttributeMapping__LeftAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3237:1: ( rule__AttributeMapping__LeftAssignment_0 )
            {
             before(grammarAccess.getAttributeMappingAccess().getLeftAssignment_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3238:1: ( rule__AttributeMapping__LeftAssignment_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3238:2: rule__AttributeMapping__LeftAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__LeftAssignment_0_in_rule__AttributeMapping__Group__0__Impl6511);
            rule__AttributeMapping__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeMappingAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__0__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3248:1: rule__AttributeMapping__Group__1 : rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2 ;
    public final void rule__AttributeMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3252:1: ( rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3253:2: rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group__1__Impl_in_rule__AttributeMapping__Group__16541);
            rule__AttributeMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group__2_in_rule__AttributeMapping__Group__16544);
            rule__AttributeMapping__Group__2();

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
    // $ANTLR end "rule__AttributeMapping__Group__1"


    // $ANTLR start "rule__AttributeMapping__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3260:1: rule__AttributeMapping__Group__1__Impl : ( ( rule__AttributeMapping__Group_1__0 )* ) ;
    public final void rule__AttributeMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3264:1: ( ( ( rule__AttributeMapping__Group_1__0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3265:1: ( ( rule__AttributeMapping__Group_1__0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3265:1: ( ( rule__AttributeMapping__Group_1__0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3266:1: ( rule__AttributeMapping__Group_1__0 )*
            {
             before(grammarAccess.getAttributeMappingAccess().getGroup_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3267:1: ( rule__AttributeMapping__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3267:2: rule__AttributeMapping__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group_1__0_in_rule__AttributeMapping__Group__1__Impl6571);
            	    rule__AttributeMapping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAttributeMappingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__1__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3277:1: rule__AttributeMapping__Group__2 : rule__AttributeMapping__Group__2__Impl rule__AttributeMapping__Group__3 ;
    public final void rule__AttributeMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3281:1: ( rule__AttributeMapping__Group__2__Impl rule__AttributeMapping__Group__3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3282:2: rule__AttributeMapping__Group__2__Impl rule__AttributeMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group__2__Impl_in_rule__AttributeMapping__Group__26602);
            rule__AttributeMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group__3_in_rule__AttributeMapping__Group__26605);
            rule__AttributeMapping__Group__3();

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
    // $ANTLR end "rule__AttributeMapping__Group__2"


    // $ANTLR start "rule__AttributeMapping__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3289:1: rule__AttributeMapping__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributeMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3293:1: ( ( '=' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3294:1: ( '=' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3294:1: ( '=' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3295:1: '='
            {
             before(grammarAccess.getAttributeMappingAccess().getEqualsSignKeyword_2()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AttributeMapping__Group__2__Impl6633); 
             after(grammarAccess.getAttributeMappingAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__2__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3308:1: rule__AttributeMapping__Group__3 : rule__AttributeMapping__Group__3__Impl ;
    public final void rule__AttributeMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3312:1: ( rule__AttributeMapping__Group__3__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3313:2: rule__AttributeMapping__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group__3__Impl_in_rule__AttributeMapping__Group__36664);
            rule__AttributeMapping__Group__3__Impl();

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
    // $ANTLR end "rule__AttributeMapping__Group__3"


    // $ANTLR start "rule__AttributeMapping__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3319:1: rule__AttributeMapping__Group__3__Impl : ( ( rule__AttributeMapping__RightPartAssignment_3 ) ) ;
    public final void rule__AttributeMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3323:1: ( ( ( rule__AttributeMapping__RightPartAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3324:1: ( ( rule__AttributeMapping__RightPartAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3324:1: ( ( rule__AttributeMapping__RightPartAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3325:1: ( rule__AttributeMapping__RightPartAssignment_3 )
            {
             before(grammarAccess.getAttributeMappingAccess().getRightPartAssignment_3()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3326:1: ( rule__AttributeMapping__RightPartAssignment_3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3326:2: rule__AttributeMapping__RightPartAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__RightPartAssignment_3_in_rule__AttributeMapping__Group__3__Impl6691);
            rule__AttributeMapping__RightPartAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeMappingAccess().getRightPartAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__3__Impl"


    // $ANTLR start "rule__AttributeMapping__Group_1__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3344:1: rule__AttributeMapping__Group_1__0 : rule__AttributeMapping__Group_1__0__Impl rule__AttributeMapping__Group_1__1 ;
    public final void rule__AttributeMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3348:1: ( rule__AttributeMapping__Group_1__0__Impl rule__AttributeMapping__Group_1__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3349:2: rule__AttributeMapping__Group_1__0__Impl rule__AttributeMapping__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group_1__0__Impl_in_rule__AttributeMapping__Group_1__06729);
            rule__AttributeMapping__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group_1__1_in_rule__AttributeMapping__Group_1__06732);
            rule__AttributeMapping__Group_1__1();

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
    // $ANTLR end "rule__AttributeMapping__Group_1__0"


    // $ANTLR start "rule__AttributeMapping__Group_1__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3356:1: rule__AttributeMapping__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3360:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3361:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3361:1: ( ',' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3362:1: ','
            {
             before(grammarAccess.getAttributeMappingAccess().getCommaKeyword_1_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AttributeMapping__Group_1__0__Impl6760); 
             after(grammarAccess.getAttributeMappingAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeMapping__Group_1__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3375:1: rule__AttributeMapping__Group_1__1 : rule__AttributeMapping__Group_1__1__Impl ;
    public final void rule__AttributeMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3379:1: ( rule__AttributeMapping__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3380:2: rule__AttributeMapping__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__Group_1__1__Impl_in_rule__AttributeMapping__Group_1__16791);
            rule__AttributeMapping__Group_1__1__Impl();

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
    // $ANTLR end "rule__AttributeMapping__Group_1__1"


    // $ANTLR start "rule__AttributeMapping__Group_1__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3386:1: rule__AttributeMapping__Group_1__1__Impl : ( ( rule__AttributeMapping__LeftAssignment_1_1 ) ) ;
    public final void rule__AttributeMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3390:1: ( ( ( rule__AttributeMapping__LeftAssignment_1_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3391:1: ( ( rule__AttributeMapping__LeftAssignment_1_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3391:1: ( ( rule__AttributeMapping__LeftAssignment_1_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3392:1: ( rule__AttributeMapping__LeftAssignment_1_1 )
            {
             before(grammarAccess.getAttributeMappingAccess().getLeftAssignment_1_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3393:1: ( rule__AttributeMapping__LeftAssignment_1_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3393:2: rule__AttributeMapping__LeftAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeMapping__LeftAssignment_1_1_in_rule__AttributeMapping__Group_1__1__Impl6818);
            rule__AttributeMapping__LeftAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeMappingAccess().getLeftAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute2Attribute__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3407:1: rule__Attribute2Attribute__Group__0 : rule__Attribute2Attribute__Group__0__Impl rule__Attribute2Attribute__Group__1 ;
    public final void rule__Attribute2Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3411:1: ( rule__Attribute2Attribute__Group__0__Impl rule__Attribute2Attribute__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3412:2: rule__Attribute2Attribute__Group__0__Impl rule__Attribute2Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group__0__Impl_in_rule__Attribute2Attribute__Group__06852);
            rule__Attribute2Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group__1_in_rule__Attribute2Attribute__Group__06855);
            rule__Attribute2Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute2Attribute__Group__0"


    // $ANTLR start "rule__Attribute2Attribute__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3419:1: rule__Attribute2Attribute__Group__0__Impl : ( ( rule__Attribute2Attribute__RightAssignment_0 ) ) ;
    public final void rule__Attribute2Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3423:1: ( ( ( rule__Attribute2Attribute__RightAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3424:1: ( ( rule__Attribute2Attribute__RightAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3424:1: ( ( rule__Attribute2Attribute__RightAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3425:1: ( rule__Attribute2Attribute__RightAssignment_0 )
            {
             before(grammarAccess.getAttribute2AttributeAccess().getRightAssignment_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3426:1: ( rule__Attribute2Attribute__RightAssignment_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3426:2: rule__Attribute2Attribute__RightAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__RightAssignment_0_in_rule__Attribute2Attribute__Group__0__Impl6882);
            rule__Attribute2Attribute__RightAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttribute2AttributeAccess().getRightAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute2Attribute__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3436:1: rule__Attribute2Attribute__Group__1 : rule__Attribute2Attribute__Group__1__Impl rule__Attribute2Attribute__Group__2 ;
    public final void rule__Attribute2Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3440:1: ( rule__Attribute2Attribute__Group__1__Impl rule__Attribute2Attribute__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3441:2: rule__Attribute2Attribute__Group__1__Impl rule__Attribute2Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group__1__Impl_in_rule__Attribute2Attribute__Group__16912);
            rule__Attribute2Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group__2_in_rule__Attribute2Attribute__Group__16915);
            rule__Attribute2Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute2Attribute__Group__1"


    // $ANTLR start "rule__Attribute2Attribute__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3448:1: rule__Attribute2Attribute__Group__1__Impl : ( ( rule__Attribute2Attribute__Group_1__0 )* ) ;
    public final void rule__Attribute2Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3452:1: ( ( ( rule__Attribute2Attribute__Group_1__0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3453:1: ( ( rule__Attribute2Attribute__Group_1__0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3453:1: ( ( rule__Attribute2Attribute__Group_1__0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3454:1: ( rule__Attribute2Attribute__Group_1__0 )*
            {
             before(grammarAccess.getAttribute2AttributeAccess().getGroup_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3455:1: ( rule__Attribute2Attribute__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3455:2: rule__Attribute2Attribute__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group_1__0_in_rule__Attribute2Attribute__Group__1__Impl6942);
            	    rule__Attribute2Attribute__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getAttribute2AttributeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute2Attribute__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3465:1: rule__Attribute2Attribute__Group__2 : rule__Attribute2Attribute__Group__2__Impl ;
    public final void rule__Attribute2Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3469:1: ( rule__Attribute2Attribute__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3470:2: rule__Attribute2Attribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group__2__Impl_in_rule__Attribute2Attribute__Group__26973);
            rule__Attribute2Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute2Attribute__Group__2"


    // $ANTLR start "rule__Attribute2Attribute__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3476:1: rule__Attribute2Attribute__Group__2__Impl : ( ( rule__Attribute2Attribute__ConverterAssignment_2 )? ) ;
    public final void rule__Attribute2Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3480:1: ( ( ( rule__Attribute2Attribute__ConverterAssignment_2 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3481:1: ( ( rule__Attribute2Attribute__ConverterAssignment_2 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3481:1: ( ( rule__Attribute2Attribute__ConverterAssignment_2 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3482:1: ( rule__Attribute2Attribute__ConverterAssignment_2 )?
            {
             before(grammarAccess.getAttribute2AttributeAccess().getConverterAssignment_2()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3483:1: ( rule__Attribute2Attribute__ConverterAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3483:2: rule__Attribute2Attribute__ConverterAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__ConverterAssignment_2_in_rule__Attribute2Attribute__Group__2__Impl7000);
                    rule__Attribute2Attribute__ConverterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttribute2AttributeAccess().getConverterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute2Attribute__Group_1__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3499:1: rule__Attribute2Attribute__Group_1__0 : rule__Attribute2Attribute__Group_1__0__Impl rule__Attribute2Attribute__Group_1__1 ;
    public final void rule__Attribute2Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3503:1: ( rule__Attribute2Attribute__Group_1__0__Impl rule__Attribute2Attribute__Group_1__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3504:2: rule__Attribute2Attribute__Group_1__0__Impl rule__Attribute2Attribute__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group_1__0__Impl_in_rule__Attribute2Attribute__Group_1__07037);
            rule__Attribute2Attribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group_1__1_in_rule__Attribute2Attribute__Group_1__07040);
            rule__Attribute2Attribute__Group_1__1();

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
    // $ANTLR end "rule__Attribute2Attribute__Group_1__0"


    // $ANTLR start "rule__Attribute2Attribute__Group_1__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3511:1: rule__Attribute2Attribute__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute2Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3515:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3516:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3516:1: ( ',' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3517:1: ','
            {
             before(grammarAccess.getAttribute2AttributeAccess().getCommaKeyword_1_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Attribute2Attribute__Group_1__0__Impl7068); 
             after(grammarAccess.getAttribute2AttributeAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2Attribute__Group_1__0__Impl"


    // $ANTLR start "rule__Attribute2Attribute__Group_1__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3530:1: rule__Attribute2Attribute__Group_1__1 : rule__Attribute2Attribute__Group_1__1__Impl ;
    public final void rule__Attribute2Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3534:1: ( rule__Attribute2Attribute__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3535:2: rule__Attribute2Attribute__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__Group_1__1__Impl_in_rule__Attribute2Attribute__Group_1__17099);
            rule__Attribute2Attribute__Group_1__1__Impl();

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
    // $ANTLR end "rule__Attribute2Attribute__Group_1__1"


    // $ANTLR start "rule__Attribute2Attribute__Group_1__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3541:1: rule__Attribute2Attribute__Group_1__1__Impl : ( ( rule__Attribute2Attribute__RightAssignment_1_1 ) ) ;
    public final void rule__Attribute2Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3545:1: ( ( ( rule__Attribute2Attribute__RightAssignment_1_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3546:1: ( ( rule__Attribute2Attribute__RightAssignment_1_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3546:1: ( ( rule__Attribute2Attribute__RightAssignment_1_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3547:1: ( rule__Attribute2Attribute__RightAssignment_1_1 )
            {
             before(grammarAccess.getAttribute2AttributeAccess().getRightAssignment_1_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3548:1: ( rule__Attribute2Attribute__RightAssignment_1_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3548:2: rule__Attribute2Attribute__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute2Attribute__RightAssignment_1_1_in_rule__Attribute2Attribute__Group_1__1__Impl7126);
            rule__Attribute2Attribute__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttribute2AttributeAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2Attribute__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeRef__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3562:1: rule__AttributeRef__Group__0 : rule__AttributeRef__Group__0__Impl rule__AttributeRef__Group__1 ;
    public final void rule__AttributeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3566:1: ( rule__AttributeRef__Group__0__Impl rule__AttributeRef__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3567:2: rule__AttributeRef__Group__0__Impl rule__AttributeRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group__0__Impl_in_rule__AttributeRef__Group__07160);
            rule__AttributeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group__1_in_rule__AttributeRef__Group__07163);
            rule__AttributeRef__Group__1();

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
    // $ANTLR end "rule__AttributeRef__Group__0"


    // $ANTLR start "rule__AttributeRef__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3574:1: rule__AttributeRef__Group__0__Impl : ( ( rule__AttributeRef__Group_0__0 )? ) ;
    public final void rule__AttributeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3578:1: ( ( ( rule__AttributeRef__Group_0__0 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3579:1: ( ( rule__AttributeRef__Group_0__0 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3579:1: ( ( rule__AttributeRef__Group_0__0 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3580:1: ( rule__AttributeRef__Group_0__0 )?
            {
             before(grammarAccess.getAttributeRefAccess().getGroup_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3581:1: ( rule__AttributeRef__Group_0__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==26) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3581:2: rule__AttributeRef__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group_0__0_in_rule__AttributeRef__Group__0__Impl7190);
                    rule__AttributeRef__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeRefAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRef__Group__0__Impl"


    // $ANTLR start "rule__AttributeRef__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3591:1: rule__AttributeRef__Group__1 : rule__AttributeRef__Group__1__Impl rule__AttributeRef__Group__2 ;
    public final void rule__AttributeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3595:1: ( rule__AttributeRef__Group__1__Impl rule__AttributeRef__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3596:2: rule__AttributeRef__Group__1__Impl rule__AttributeRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group__1__Impl_in_rule__AttributeRef__Group__17221);
            rule__AttributeRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group__2_in_rule__AttributeRef__Group__17224);
            rule__AttributeRef__Group__2();

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
    // $ANTLR end "rule__AttributeRef__Group__1"


    // $ANTLR start "rule__AttributeRef__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3603:1: rule__AttributeRef__Group__1__Impl : ( ( rule__AttributeRef__FeatureNameAssignment_1 ) ) ;
    public final void rule__AttributeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3607:1: ( ( ( rule__AttributeRef__FeatureNameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3608:1: ( ( rule__AttributeRef__FeatureNameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3608:1: ( ( rule__AttributeRef__FeatureNameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3609:1: ( rule__AttributeRef__FeatureNameAssignment_1 )
            {
             before(grammarAccess.getAttributeRefAccess().getFeatureNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3610:1: ( rule__AttributeRef__FeatureNameAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3610:2: rule__AttributeRef__FeatureNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__FeatureNameAssignment_1_in_rule__AttributeRef__Group__1__Impl7251);
            rule__AttributeRef__FeatureNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRefAccess().getFeatureNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRef__Group__1__Impl"


    // $ANTLR start "rule__AttributeRef__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3620:1: rule__AttributeRef__Group__2 : rule__AttributeRef__Group__2__Impl ;
    public final void rule__AttributeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3624:1: ( rule__AttributeRef__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3625:2: rule__AttributeRef__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group__2__Impl_in_rule__AttributeRef__Group__27281);
            rule__AttributeRef__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeRef__Group__2"


    // $ANTLR start "rule__AttributeRef__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3631:1: rule__AttributeRef__Group__2__Impl : ( ( rule__AttributeRef__MultivaluedAssignment_2 )? ) ;
    public final void rule__AttributeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3635:1: ( ( ( rule__AttributeRef__MultivaluedAssignment_2 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3636:1: ( ( rule__AttributeRef__MultivaluedAssignment_2 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3636:1: ( ( rule__AttributeRef__MultivaluedAssignment_2 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3637:1: ( rule__AttributeRef__MultivaluedAssignment_2 )?
            {
             before(grammarAccess.getAttributeRefAccess().getMultivaluedAssignment_2()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3638:1: ( rule__AttributeRef__MultivaluedAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3638:2: rule__AttributeRef__MultivaluedAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__MultivaluedAssignment_2_in_rule__AttributeRef__Group__2__Impl7308);
                    rule__AttributeRef__MultivaluedAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeRefAccess().getMultivaluedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRef__Group__2__Impl"


    // $ANTLR start "rule__AttributeRef__Group_0__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3654:1: rule__AttributeRef__Group_0__0 : rule__AttributeRef__Group_0__0__Impl rule__AttributeRef__Group_0__1 ;
    public final void rule__AttributeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3658:1: ( rule__AttributeRef__Group_0__0__Impl rule__AttributeRef__Group_0__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3659:2: rule__AttributeRef__Group_0__0__Impl rule__AttributeRef__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group_0__0__Impl_in_rule__AttributeRef__Group_0__07345);
            rule__AttributeRef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group_0__1_in_rule__AttributeRef__Group_0__07348);
            rule__AttributeRef__Group_0__1();

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
    // $ANTLR end "rule__AttributeRef__Group_0__0"


    // $ANTLR start "rule__AttributeRef__Group_0__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3666:1: rule__AttributeRef__Group_0__0__Impl : ( ( rule__AttributeRef__ReferredElementAssignment_0_0 ) ) ;
    public final void rule__AttributeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3670:1: ( ( ( rule__AttributeRef__ReferredElementAssignment_0_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3671:1: ( ( rule__AttributeRef__ReferredElementAssignment_0_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3671:1: ( ( rule__AttributeRef__ReferredElementAssignment_0_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3672:1: ( rule__AttributeRef__ReferredElementAssignment_0_0 )
            {
             before(grammarAccess.getAttributeRefAccess().getReferredElementAssignment_0_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3673:1: ( rule__AttributeRef__ReferredElementAssignment_0_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3673:2: rule__AttributeRef__ReferredElementAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__ReferredElementAssignment_0_0_in_rule__AttributeRef__Group_0__0__Impl7375);
            rule__AttributeRef__ReferredElementAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRefAccess().getReferredElementAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRef__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeRef__Group_0__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3683:1: rule__AttributeRef__Group_0__1 : rule__AttributeRef__Group_0__1__Impl ;
    public final void rule__AttributeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3687:1: ( rule__AttributeRef__Group_0__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3688:2: rule__AttributeRef__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeRef__Group_0__1__Impl_in_rule__AttributeRef__Group_0__17405);
            rule__AttributeRef__Group_0__1__Impl();

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
    // $ANTLR end "rule__AttributeRef__Group_0__1"


    // $ANTLR start "rule__AttributeRef__Group_0__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3694:1: rule__AttributeRef__Group_0__1__Impl : ( '.' ) ;
    public final void rule__AttributeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3698:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3699:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3699:1: ( '.' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3700:1: '.'
            {
             before(grammarAccess.getAttributeRefAccess().getFullStopKeyword_0_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AttributeRef__Group_0__1__Impl7433); 
             after(grammarAccess.getAttributeRefAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRef__Group_0__1__Impl"


    // $ANTLR start "rule__Reference2Reference__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3717:1: rule__Reference2Reference__Group__0 : rule__Reference2Reference__Group__0__Impl rule__Reference2Reference__Group__1 ;
    public final void rule__Reference2Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3721:1: ( rule__Reference2Reference__Group__0__Impl rule__Reference2Reference__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3722:2: rule__Reference2Reference__Group__0__Impl rule__Reference2Reference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__0__Impl_in_rule__Reference2Reference__Group__07468);
            rule__Reference2Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__1_in_rule__Reference2Reference__Group__07471);
            rule__Reference2Reference__Group__1();

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
    // $ANTLR end "rule__Reference2Reference__Group__0"


    // $ANTLR start "rule__Reference2Reference__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3729:1: rule__Reference2Reference__Group__0__Impl : ( ( rule__Reference2Reference__LeftAssignment_0 ) ) ;
    public final void rule__Reference2Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3733:1: ( ( ( rule__Reference2Reference__LeftAssignment_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3734:1: ( ( rule__Reference2Reference__LeftAssignment_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3734:1: ( ( rule__Reference2Reference__LeftAssignment_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3735:1: ( rule__Reference2Reference__LeftAssignment_0 )
            {
             before(grammarAccess.getReference2ReferenceAccess().getLeftAssignment_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3736:1: ( rule__Reference2Reference__LeftAssignment_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3736:2: rule__Reference2Reference__LeftAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__LeftAssignment_0_in_rule__Reference2Reference__Group__0__Impl7498);
            rule__Reference2Reference__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReference2ReferenceAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference2Reference__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3746:1: rule__Reference2Reference__Group__1 : rule__Reference2Reference__Group__1__Impl rule__Reference2Reference__Group__2 ;
    public final void rule__Reference2Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3750:1: ( rule__Reference2Reference__Group__1__Impl rule__Reference2Reference__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3751:2: rule__Reference2Reference__Group__1__Impl rule__Reference2Reference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__1__Impl_in_rule__Reference2Reference__Group__17528);
            rule__Reference2Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__2_in_rule__Reference2Reference__Group__17531);
            rule__Reference2Reference__Group__2();

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
    // $ANTLR end "rule__Reference2Reference__Group__1"


    // $ANTLR start "rule__Reference2Reference__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3758:1: rule__Reference2Reference__Group__1__Impl : ( ( rule__Reference2Reference__Group_1__0 )* ) ;
    public final void rule__Reference2Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3762:1: ( ( ( rule__Reference2Reference__Group_1__0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3763:1: ( ( rule__Reference2Reference__Group_1__0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3763:1: ( ( rule__Reference2Reference__Group_1__0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3764:1: ( rule__Reference2Reference__Group_1__0 )*
            {
             before(grammarAccess.getReference2ReferenceAccess().getGroup_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3765:1: ( rule__Reference2Reference__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3765:2: rule__Reference2Reference__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group_1__0_in_rule__Reference2Reference__Group__1__Impl7558);
            	    rule__Reference2Reference__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getReference2ReferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference2Reference__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3775:1: rule__Reference2Reference__Group__2 : rule__Reference2Reference__Group__2__Impl rule__Reference2Reference__Group__3 ;
    public final void rule__Reference2Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3779:1: ( rule__Reference2Reference__Group__2__Impl rule__Reference2Reference__Group__3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3780:2: rule__Reference2Reference__Group__2__Impl rule__Reference2Reference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__2__Impl_in_rule__Reference2Reference__Group__27589);
            rule__Reference2Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__3_in_rule__Reference2Reference__Group__27592);
            rule__Reference2Reference__Group__3();

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
    // $ANTLR end "rule__Reference2Reference__Group__2"


    // $ANTLR start "rule__Reference2Reference__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3787:1: rule__Reference2Reference__Group__2__Impl : ( '<-' ) ;
    public final void rule__Reference2Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3791:1: ( ( '<-' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3792:1: ( '<-' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3792:1: ( '<-' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3793:1: '<-'
            {
             before(grammarAccess.getReference2ReferenceAccess().getLessThanSignHyphenMinusKeyword_2()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Reference2Reference__Group__2__Impl7620); 
             after(grammarAccess.getReference2ReferenceAccess().getLessThanSignHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference2Reference__Group__3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3806:1: rule__Reference2Reference__Group__3 : rule__Reference2Reference__Group__3__Impl rule__Reference2Reference__Group__4 ;
    public final void rule__Reference2Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3810:1: ( rule__Reference2Reference__Group__3__Impl rule__Reference2Reference__Group__4 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3811:2: rule__Reference2Reference__Group__3__Impl rule__Reference2Reference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__3__Impl_in_rule__Reference2Reference__Group__37651);
            rule__Reference2Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__4_in_rule__Reference2Reference__Group__37654);
            rule__Reference2Reference__Group__4();

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
    // $ANTLR end "rule__Reference2Reference__Group__3"


    // $ANTLR start "rule__Reference2Reference__Group__3__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3818:1: rule__Reference2Reference__Group__3__Impl : ( ( rule__Reference2Reference__RightAssignment_3 ) ) ;
    public final void rule__Reference2Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3822:1: ( ( ( rule__Reference2Reference__RightAssignment_3 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3823:1: ( ( rule__Reference2Reference__RightAssignment_3 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3823:1: ( ( rule__Reference2Reference__RightAssignment_3 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3824:1: ( rule__Reference2Reference__RightAssignment_3 )
            {
             before(grammarAccess.getReference2ReferenceAccess().getRightAssignment_3()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3825:1: ( rule__Reference2Reference__RightAssignment_3 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3825:2: rule__Reference2Reference__RightAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__RightAssignment_3_in_rule__Reference2Reference__Group__3__Impl7681);
            rule__Reference2Reference__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReference2ReferenceAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference2Reference__Group__4"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3835:1: rule__Reference2Reference__Group__4 : rule__Reference2Reference__Group__4__Impl rule__Reference2Reference__Group__5 ;
    public final void rule__Reference2Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3839:1: ( rule__Reference2Reference__Group__4__Impl rule__Reference2Reference__Group__5 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3840:2: rule__Reference2Reference__Group__4__Impl rule__Reference2Reference__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__4__Impl_in_rule__Reference2Reference__Group__47711);
            rule__Reference2Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__5_in_rule__Reference2Reference__Group__47714);
            rule__Reference2Reference__Group__5();

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
    // $ANTLR end "rule__Reference2Reference__Group__4"


    // $ANTLR start "rule__Reference2Reference__Group__4__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3847:1: rule__Reference2Reference__Group__4__Impl : ( ( rule__Reference2Reference__Group_4__0 )* ) ;
    public final void rule__Reference2Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3851:1: ( ( ( rule__Reference2Reference__Group_4__0 )* ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3852:1: ( ( rule__Reference2Reference__Group_4__0 )* )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3852:1: ( ( rule__Reference2Reference__Group_4__0 )* )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3853:1: ( rule__Reference2Reference__Group_4__0 )*
            {
             before(grammarAccess.getReference2ReferenceAccess().getGroup_4()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3854:1: ( rule__Reference2Reference__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3854:2: rule__Reference2Reference__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group_4__0_in_rule__Reference2Reference__Group__4__Impl7741);
            	    rule__Reference2Reference__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getReference2ReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference2Reference__Group__5"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3864:1: rule__Reference2Reference__Group__5 : rule__Reference2Reference__Group__5__Impl ;
    public final void rule__Reference2Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3868:1: ( rule__Reference2Reference__Group__5__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3869:2: rule__Reference2Reference__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group__5__Impl_in_rule__Reference2Reference__Group__57772);
            rule__Reference2Reference__Group__5__Impl();

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
    // $ANTLR end "rule__Reference2Reference__Group__5"


    // $ANTLR start "rule__Reference2Reference__Group__5__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3875:1: rule__Reference2Reference__Group__5__Impl : ( ( rule__Reference2Reference__ConverterAssignment_5 )? ) ;
    public final void rule__Reference2Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3879:1: ( ( ( rule__Reference2Reference__ConverterAssignment_5 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3880:1: ( ( rule__Reference2Reference__ConverterAssignment_5 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3880:1: ( ( rule__Reference2Reference__ConverterAssignment_5 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3881:1: ( rule__Reference2Reference__ConverterAssignment_5 )?
            {
             before(grammarAccess.getReference2ReferenceAccess().getConverterAssignment_5()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3882:1: ( rule__Reference2Reference__ConverterAssignment_5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3882:2: rule__Reference2Reference__ConverterAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__ConverterAssignment_5_in_rule__Reference2Reference__Group__5__Impl7799);
                    rule__Reference2Reference__ConverterAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReference2ReferenceAccess().getConverterAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference2Reference__Group_1__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3904:1: rule__Reference2Reference__Group_1__0 : rule__Reference2Reference__Group_1__0__Impl rule__Reference2Reference__Group_1__1 ;
    public final void rule__Reference2Reference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3908:1: ( rule__Reference2Reference__Group_1__0__Impl rule__Reference2Reference__Group_1__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3909:2: rule__Reference2Reference__Group_1__0__Impl rule__Reference2Reference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group_1__0__Impl_in_rule__Reference2Reference__Group_1__07842);
            rule__Reference2Reference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group_1__1_in_rule__Reference2Reference__Group_1__07845);
            rule__Reference2Reference__Group_1__1();

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
    // $ANTLR end "rule__Reference2Reference__Group_1__0"


    // $ANTLR start "rule__Reference2Reference__Group_1__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3916:1: rule__Reference2Reference__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Reference2Reference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3920:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3921:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3921:1: ( ',' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3922:1: ','
            {
             before(grammarAccess.getReference2ReferenceAccess().getCommaKeyword_1_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Reference2Reference__Group_1__0__Impl7873); 
             after(grammarAccess.getReference2ReferenceAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group_1__0__Impl"


    // $ANTLR start "rule__Reference2Reference__Group_1__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3935:1: rule__Reference2Reference__Group_1__1 : rule__Reference2Reference__Group_1__1__Impl ;
    public final void rule__Reference2Reference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3939:1: ( rule__Reference2Reference__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3940:2: rule__Reference2Reference__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group_1__1__Impl_in_rule__Reference2Reference__Group_1__17904);
            rule__Reference2Reference__Group_1__1__Impl();

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
    // $ANTLR end "rule__Reference2Reference__Group_1__1"


    // $ANTLR start "rule__Reference2Reference__Group_1__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3946:1: rule__Reference2Reference__Group_1__1__Impl : ( ( rule__Reference2Reference__LeftAssignment_1_1 ) ) ;
    public final void rule__Reference2Reference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3950:1: ( ( ( rule__Reference2Reference__LeftAssignment_1_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3951:1: ( ( rule__Reference2Reference__LeftAssignment_1_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3951:1: ( ( rule__Reference2Reference__LeftAssignment_1_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3952:1: ( rule__Reference2Reference__LeftAssignment_1_1 )
            {
             before(grammarAccess.getReference2ReferenceAccess().getLeftAssignment_1_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3953:1: ( rule__Reference2Reference__LeftAssignment_1_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3953:2: rule__Reference2Reference__LeftAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__LeftAssignment_1_1_in_rule__Reference2Reference__Group_1__1__Impl7931);
            rule__Reference2Reference__LeftAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReference2ReferenceAccess().getLeftAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group_1__1__Impl"


    // $ANTLR start "rule__Reference2Reference__Group_4__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3967:1: rule__Reference2Reference__Group_4__0 : rule__Reference2Reference__Group_4__0__Impl rule__Reference2Reference__Group_4__1 ;
    public final void rule__Reference2Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3971:1: ( rule__Reference2Reference__Group_4__0__Impl rule__Reference2Reference__Group_4__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3972:2: rule__Reference2Reference__Group_4__0__Impl rule__Reference2Reference__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group_4__0__Impl_in_rule__Reference2Reference__Group_4__07965);
            rule__Reference2Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group_4__1_in_rule__Reference2Reference__Group_4__07968);
            rule__Reference2Reference__Group_4__1();

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
    // $ANTLR end "rule__Reference2Reference__Group_4__0"


    // $ANTLR start "rule__Reference2Reference__Group_4__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3979:1: rule__Reference2Reference__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Reference2Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3983:1: ( ( ',' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3984:1: ( ',' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3984:1: ( ',' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3985:1: ','
            {
             before(grammarAccess.getReference2ReferenceAccess().getCommaKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Reference2Reference__Group_4__0__Impl7996); 
             after(grammarAccess.getReference2ReferenceAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference2Reference__Group_4__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:3998:1: rule__Reference2Reference__Group_4__1 : rule__Reference2Reference__Group_4__1__Impl ;
    public final void rule__Reference2Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4002:1: ( rule__Reference2Reference__Group_4__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4003:2: rule__Reference2Reference__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__Group_4__1__Impl_in_rule__Reference2Reference__Group_4__18027);
            rule__Reference2Reference__Group_4__1__Impl();

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
    // $ANTLR end "rule__Reference2Reference__Group_4__1"


    // $ANTLR start "rule__Reference2Reference__Group_4__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4009:1: rule__Reference2Reference__Group_4__1__Impl : ( ( rule__Reference2Reference__RightAssignment_4_1 ) ) ;
    public final void rule__Reference2Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4013:1: ( ( ( rule__Reference2Reference__RightAssignment_4_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4014:1: ( ( rule__Reference2Reference__RightAssignment_4_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4014:1: ( ( rule__Reference2Reference__RightAssignment_4_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4015:1: ( rule__Reference2Reference__RightAssignment_4_1 )
            {
             before(grammarAccess.getReference2ReferenceAccess().getRightAssignment_4_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4016:1: ( rule__Reference2Reference__RightAssignment_4_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4016:2: rule__Reference2Reference__RightAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference2Reference__RightAssignment_4_1_in_rule__Reference2Reference__Group_4__1__Impl8054);
            rule__Reference2Reference__RightAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReference2ReferenceAccess().getRightAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__Group_4__1__Impl"


    // $ANTLR start "rule__ReferenceRef__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4030:1: rule__ReferenceRef__Group__0 : rule__ReferenceRef__Group__0__Impl rule__ReferenceRef__Group__1 ;
    public final void rule__ReferenceRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4034:1: ( rule__ReferenceRef__Group__0__Impl rule__ReferenceRef__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4035:2: rule__ReferenceRef__Group__0__Impl rule__ReferenceRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group__0__Impl_in_rule__ReferenceRef__Group__08088);
            rule__ReferenceRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group__1_in_rule__ReferenceRef__Group__08091);
            rule__ReferenceRef__Group__1();

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
    // $ANTLR end "rule__ReferenceRef__Group__0"


    // $ANTLR start "rule__ReferenceRef__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4042:1: rule__ReferenceRef__Group__0__Impl : ( ( rule__ReferenceRef__Group_0__0 )? ) ;
    public final void rule__ReferenceRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4046:1: ( ( ( rule__ReferenceRef__Group_0__0 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4047:1: ( ( rule__ReferenceRef__Group_0__0 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4047:1: ( ( rule__ReferenceRef__Group_0__0 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4048:1: ( rule__ReferenceRef__Group_0__0 )?
            {
             before(grammarAccess.getReferenceRefAccess().getGroup_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4049:1: ( rule__ReferenceRef__Group_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==26) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4049:2: rule__ReferenceRef__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group_0__0_in_rule__ReferenceRef__Group__0__Impl8118);
                    rule__ReferenceRef__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceRefAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceRef__Group__0__Impl"


    // $ANTLR start "rule__ReferenceRef__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4059:1: rule__ReferenceRef__Group__1 : rule__ReferenceRef__Group__1__Impl rule__ReferenceRef__Group__2 ;
    public final void rule__ReferenceRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4063:1: ( rule__ReferenceRef__Group__1__Impl rule__ReferenceRef__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4064:2: rule__ReferenceRef__Group__1__Impl rule__ReferenceRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group__1__Impl_in_rule__ReferenceRef__Group__18149);
            rule__ReferenceRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group__2_in_rule__ReferenceRef__Group__18152);
            rule__ReferenceRef__Group__2();

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
    // $ANTLR end "rule__ReferenceRef__Group__1"


    // $ANTLR start "rule__ReferenceRef__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4071:1: rule__ReferenceRef__Group__1__Impl : ( ( rule__ReferenceRef__FeatureNameAssignment_1 ) ) ;
    public final void rule__ReferenceRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4075:1: ( ( ( rule__ReferenceRef__FeatureNameAssignment_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4076:1: ( ( rule__ReferenceRef__FeatureNameAssignment_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4076:1: ( ( rule__ReferenceRef__FeatureNameAssignment_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4077:1: ( rule__ReferenceRef__FeatureNameAssignment_1 )
            {
             before(grammarAccess.getReferenceRefAccess().getFeatureNameAssignment_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4078:1: ( rule__ReferenceRef__FeatureNameAssignment_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4078:2: rule__ReferenceRef__FeatureNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__FeatureNameAssignment_1_in_rule__ReferenceRef__Group__1__Impl8179);
            rule__ReferenceRef__FeatureNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceRefAccess().getFeatureNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceRef__Group__1__Impl"


    // $ANTLR start "rule__ReferenceRef__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4088:1: rule__ReferenceRef__Group__2 : rule__ReferenceRef__Group__2__Impl ;
    public final void rule__ReferenceRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4092:1: ( rule__ReferenceRef__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4093:2: rule__ReferenceRef__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group__2__Impl_in_rule__ReferenceRef__Group__28209);
            rule__ReferenceRef__Group__2__Impl();

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
    // $ANTLR end "rule__ReferenceRef__Group__2"


    // $ANTLR start "rule__ReferenceRef__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4099:1: rule__ReferenceRef__Group__2__Impl : ( ( rule__ReferenceRef__MultivaluedAssignment_2 )? ) ;
    public final void rule__ReferenceRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4103:1: ( ( ( rule__ReferenceRef__MultivaluedAssignment_2 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4104:1: ( ( rule__ReferenceRef__MultivaluedAssignment_2 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4104:1: ( ( rule__ReferenceRef__MultivaluedAssignment_2 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4105:1: ( rule__ReferenceRef__MultivaluedAssignment_2 )?
            {
             before(grammarAccess.getReferenceRefAccess().getMultivaluedAssignment_2()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4106:1: ( rule__ReferenceRef__MultivaluedAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4106:2: rule__ReferenceRef__MultivaluedAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__MultivaluedAssignment_2_in_rule__ReferenceRef__Group__2__Impl8236);
                    rule__ReferenceRef__MultivaluedAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceRefAccess().getMultivaluedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceRef__Group__2__Impl"


    // $ANTLR start "rule__ReferenceRef__Group_0__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4122:1: rule__ReferenceRef__Group_0__0 : rule__ReferenceRef__Group_0__0__Impl rule__ReferenceRef__Group_0__1 ;
    public final void rule__ReferenceRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4126:1: ( rule__ReferenceRef__Group_0__0__Impl rule__ReferenceRef__Group_0__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4127:2: rule__ReferenceRef__Group_0__0__Impl rule__ReferenceRef__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group_0__0__Impl_in_rule__ReferenceRef__Group_0__08273);
            rule__ReferenceRef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group_0__1_in_rule__ReferenceRef__Group_0__08276);
            rule__ReferenceRef__Group_0__1();

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
    // $ANTLR end "rule__ReferenceRef__Group_0__0"


    // $ANTLR start "rule__ReferenceRef__Group_0__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4134:1: rule__ReferenceRef__Group_0__0__Impl : ( ( rule__ReferenceRef__ReferredElementAssignment_0_0 ) ) ;
    public final void rule__ReferenceRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4138:1: ( ( ( rule__ReferenceRef__ReferredElementAssignment_0_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4139:1: ( ( rule__ReferenceRef__ReferredElementAssignment_0_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4139:1: ( ( rule__ReferenceRef__ReferredElementAssignment_0_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4140:1: ( rule__ReferenceRef__ReferredElementAssignment_0_0 )
            {
             before(grammarAccess.getReferenceRefAccess().getReferredElementAssignment_0_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4141:1: ( rule__ReferenceRef__ReferredElementAssignment_0_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4141:2: rule__ReferenceRef__ReferredElementAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__ReferredElementAssignment_0_0_in_rule__ReferenceRef__Group_0__0__Impl8303);
            rule__ReferenceRef__ReferredElementAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceRefAccess().getReferredElementAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceRef__Group_0__0__Impl"


    // $ANTLR start "rule__ReferenceRef__Group_0__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4151:1: rule__ReferenceRef__Group_0__1 : rule__ReferenceRef__Group_0__1__Impl ;
    public final void rule__ReferenceRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4155:1: ( rule__ReferenceRef__Group_0__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4156:2: rule__ReferenceRef__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReferenceRef__Group_0__1__Impl_in_rule__ReferenceRef__Group_0__18333);
            rule__ReferenceRef__Group_0__1__Impl();

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
    // $ANTLR end "rule__ReferenceRef__Group_0__1"


    // $ANTLR start "rule__ReferenceRef__Group_0__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4162:1: rule__ReferenceRef__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ReferenceRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4166:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4167:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4167:1: ( '.' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4168:1: '.'
            {
             before(grammarAccess.getReferenceRefAccess().getFullStopKeyword_0_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ReferenceRef__Group_0__1__Impl8361); 
             after(grammarAccess.getReferenceRefAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceRef__Group_0__1__Impl"


    // $ANTLR start "rule__Converter__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4185:1: rule__Converter__Group__0 : rule__Converter__Group__0__Impl rule__Converter__Group__1 ;
    public final void rule__Converter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4189:1: ( rule__Converter__Group__0__Impl rule__Converter__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4190:2: rule__Converter__Group__0__Impl rule__Converter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group__0__Impl_in_rule__Converter__Group__08396);
            rule__Converter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group__1_in_rule__Converter__Group__08399);
            rule__Converter__Group__1();

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
    // $ANTLR end "rule__Converter__Group__0"


    // $ANTLR start "rule__Converter__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4197:1: rule__Converter__Group__0__Impl : ( 'convert' ) ;
    public final void rule__Converter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4201:1: ( ( 'convert' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4202:1: ( 'convert' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4202:1: ( 'convert' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4203:1: 'convert'
            {
             before(grammarAccess.getConverterAccess().getConvertKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Converter__Group__0__Impl8427); 
             after(grammarAccess.getConverterAccess().getConvertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Converter__Group__0__Impl"


    // $ANTLR start "rule__Converter__Group__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4216:1: rule__Converter__Group__1 : rule__Converter__Group__1__Impl rule__Converter__Group__2 ;
    public final void rule__Converter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4220:1: ( rule__Converter__Group__1__Impl rule__Converter__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4221:2: rule__Converter__Group__1__Impl rule__Converter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group__1__Impl_in_rule__Converter__Group__18458);
            rule__Converter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group__2_in_rule__Converter__Group__18461);
            rule__Converter__Group__2();

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
    // $ANTLR end "rule__Converter__Group__1"


    // $ANTLR start "rule__Converter__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4228:1: rule__Converter__Group__1__Impl : ( ( rule__Converter__Group_1__0 )? ) ;
    public final void rule__Converter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4232:1: ( ( ( rule__Converter__Group_1__0 )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4233:1: ( ( rule__Converter__Group_1__0 )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4233:1: ( ( rule__Converter__Group_1__0 )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4234:1: ( rule__Converter__Group_1__0 )?
            {
             before(grammarAccess.getConverterAccess().getGroup_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4235:1: ( rule__Converter__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==26) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4235:2: rule__Converter__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Converter__Group_1__0_in_rule__Converter__Group__1__Impl8488);
                    rule__Converter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConverterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Converter__Group__1__Impl"


    // $ANTLR start "rule__Converter__Group__2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4245:1: rule__Converter__Group__2 : rule__Converter__Group__2__Impl ;
    public final void rule__Converter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4249:1: ( rule__Converter__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4250:2: rule__Converter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group__2__Impl_in_rule__Converter__Group__28519);
            rule__Converter__Group__2__Impl();

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
    // $ANTLR end "rule__Converter__Group__2"


    // $ANTLR start "rule__Converter__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4256:1: rule__Converter__Group__2__Impl : ( ( rule__Converter__ConverterNameAssignment_2 ) ) ;
    public final void rule__Converter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4260:1: ( ( ( rule__Converter__ConverterNameAssignment_2 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4261:1: ( ( rule__Converter__ConverterNameAssignment_2 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4261:1: ( ( rule__Converter__ConverterNameAssignment_2 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4262:1: ( rule__Converter__ConverterNameAssignment_2 )
            {
             before(grammarAccess.getConverterAccess().getConverterNameAssignment_2()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4263:1: ( rule__Converter__ConverterNameAssignment_2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4263:2: rule__Converter__ConverterNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__ConverterNameAssignment_2_in_rule__Converter__Group__2__Impl8546);
            rule__Converter__ConverterNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConverterAccess().getConverterNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Converter__Group__2__Impl"


    // $ANTLR start "rule__Converter__Group_1__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4279:1: rule__Converter__Group_1__0 : rule__Converter__Group_1__0__Impl rule__Converter__Group_1__1 ;
    public final void rule__Converter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4283:1: ( rule__Converter__Group_1__0__Impl rule__Converter__Group_1__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4284:2: rule__Converter__Group_1__0__Impl rule__Converter__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group_1__0__Impl_in_rule__Converter__Group_1__08582);
            rule__Converter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group_1__1_in_rule__Converter__Group_1__08585);
            rule__Converter__Group_1__1();

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
    // $ANTLR end "rule__Converter__Group_1__0"


    // $ANTLR start "rule__Converter__Group_1__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4291:1: rule__Converter__Group_1__0__Impl : ( ( rule__Converter__ModuleAssignment_1_0 ) ) ;
    public final void rule__Converter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4295:1: ( ( ( rule__Converter__ModuleAssignment_1_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4296:1: ( ( rule__Converter__ModuleAssignment_1_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4296:1: ( ( rule__Converter__ModuleAssignment_1_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4297:1: ( rule__Converter__ModuleAssignment_1_0 )
            {
             before(grammarAccess.getConverterAccess().getModuleAssignment_1_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4298:1: ( rule__Converter__ModuleAssignment_1_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4298:2: rule__Converter__ModuleAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__ModuleAssignment_1_0_in_rule__Converter__Group_1__0__Impl8612);
            rule__Converter__ModuleAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConverterAccess().getModuleAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Converter__Group_1__0__Impl"


    // $ANTLR start "rule__Converter__Group_1__1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4308:1: rule__Converter__Group_1__1 : rule__Converter__Group_1__1__Impl ;
    public final void rule__Converter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4312:1: ( rule__Converter__Group_1__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4313:2: rule__Converter__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__Group_1__1__Impl_in_rule__Converter__Group_1__18642);
            rule__Converter__Group_1__1__Impl();

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
    // $ANTLR end "rule__Converter__Group_1__1"


    // $ANTLR start "rule__Converter__Group_1__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4319:1: rule__Converter__Group_1__1__Impl : ( ( rule__Converter__IsExternalAssignment_1_1 ) ) ;
    public final void rule__Converter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4323:1: ( ( ( rule__Converter__IsExternalAssignment_1_1 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4324:1: ( ( rule__Converter__IsExternalAssignment_1_1 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4324:1: ( ( rule__Converter__IsExternalAssignment_1_1 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4325:1: ( rule__Converter__IsExternalAssignment_1_1 )
            {
             before(grammarAccess.getConverterAccess().getIsExternalAssignment_1_1()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4326:1: ( rule__Converter__IsExternalAssignment_1_1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4326:2: rule__Converter__IsExternalAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Converter__IsExternalAssignment_1_1_in_rule__Converter__Group_1__1__Impl8669);
            rule__Converter__IsExternalAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConverterAccess().getIsExternalAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Converter__Group_1__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4340:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4344:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4345:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__08703);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__08706);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4352:1: rule__EDouble__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4356:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4357:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4357:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4358:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl8733); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4369:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4373:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4374:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__18762);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__18765);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4381:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4385:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4386:1: ( '.' )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4386:1: ( '.' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4387:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__EDouble__Group__1__Impl8793); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4400:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4404:1: ( rule__EDouble__Group__2__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4405:2: rule__EDouble__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__28824);
            rule__EDouble__Group__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4411:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4415:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4416:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4416:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4417:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl8851); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4434:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4438:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4439:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08886);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08889);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4446:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4450:1: ( ( ( '-' )? ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4451:1: ( ( '-' )? )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4451:1: ( ( '-' )? )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4452:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4453:1: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4454:2: '-'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__EInt__Group__0__Impl8918); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4465:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4469:1: ( rule__EInt__Group__1__Impl )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4470:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18951);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4476:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4480:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4481:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4481:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4482:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8978); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4498:1: rule__MappingTransformation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MappingTransformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4502:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4503:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4503:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4504:1: ruleEString
            {
             before(grammarAccess.getMappingTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MappingTransformation__NameAssignment_19016);
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
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4513:1: rule__MappingTransformation__InModelsAssignment_3 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__MappingTransformation__InModelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4517:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4518:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4518:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4519:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__InModelsAssignment_39047);
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


    // $ANTLR start "rule__MappingTransformation__OutModelsAssignment_7"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4528:1: rule__MappingTransformation__OutModelsAssignment_7 : ( ruleTransformationDefinitionParameter ) ;
    public final void rule__MappingTransformation__OutModelsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4532:1: ( ( ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4533:1: ( ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4533:1: ( ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4534:1: ruleTransformationDefinitionParameter
            {
             before(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__OutModelsAssignment_79078);
            ruleTransformationDefinitionParameter();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__MappingTransformation__AnnotationsAssignment_9"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4543:1: rule__MappingTransformation__AnnotationsAssignment_9 : ( ruleAnnotation ) ;
    public final void rule__MappingTransformation__AnnotationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4547:1: ( ( ruleAnnotation ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4548:1: ( ruleAnnotation )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4548:1: ( ruleAnnotation )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4549:1: ruleAnnotation
            {
             before(grammarAccess.getMappingTransformationAccess().getAnnotationsAnnotationParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__MappingTransformation__AnnotationsAssignment_99109);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getAnnotationsAnnotationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__AnnotationsAssignment_9"


    // $ANTLR start "rule__MappingTransformation__UsesAssignment_10"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4558:1: rule__MappingTransformation__UsesAssignment_10 : ( ruleUsesStatements ) ;
    public final void rule__MappingTransformation__UsesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4562:1: ( ( ruleUsesStatements ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4563:1: ( ruleUsesStatements )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4563:1: ( ruleUsesStatements )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4564:1: ruleUsesStatements
            {
             before(grammarAccess.getMappingTransformationAccess().getUsesUsesStatementsParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUsesStatements_in_rule__MappingTransformation__UsesAssignment_109140);
            ruleUsesStatements();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getUsesUsesStatementsParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__UsesAssignment_10"


    // $ANTLR start "rule__MappingTransformation__DelegatesAssignment_11"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4573:1: rule__MappingTransformation__DelegatesAssignment_11 : ( ruleDelegate ) ;
    public final void rule__MappingTransformation__DelegatesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4577:1: ( ( ruleDelegate ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4578:1: ( ruleDelegate )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4578:1: ( ruleDelegate )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4579:1: ruleDelegate
            {
             before(grammarAccess.getMappingTransformationAccess().getDelegatesDelegateParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelegate_in_rule__MappingTransformation__DelegatesAssignment_119171);
            ruleDelegate();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getDelegatesDelegateParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__DelegatesAssignment_11"


    // $ANTLR start "rule__MappingTransformation__ContextsAssignment_12"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4588:1: rule__MappingTransformation__ContextsAssignment_12 : ( ruleContext ) ;
    public final void rule__MappingTransformation__ContextsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4592:1: ( ( ruleContext ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4593:1: ( ruleContext )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4593:1: ( ruleContext )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4594:1: ruleContext
            {
             before(grammarAccess.getMappingTransformationAccess().getContextsContextParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_rule__MappingTransformation__ContextsAssignment_129202);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getMappingTransformationAccess().getContextsContextParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingTransformation__ContextsAssignment_12"


    // $ANTLR start "rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4603:1: rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4607:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4608:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4608:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4609:1: ( RULE_ID )
            {
             before(grammarAccess.getMetamodelModelAnnotationAccess().getAnnotatedElementRepresentModelCrossReference_0_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4610:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4611:1: RULE_ID
            {
             before(grammarAccess.getMetamodelModelAnnotationAccess().getAnnotatedElementRepresentModelIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetamodelModelAnnotation__AnnotatedElementAssignment_09237); 
             after(grammarAccess.getMetamodelModelAnnotationAccess().getAnnotatedElementRepresentModelIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMetamodelModelAnnotationAccess().getAnnotatedElementRepresentModelCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0"


    // $ANTLR start "rule__MetamodelModelAnnotation__MetamodelAssignment_2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4622:1: rule__MetamodelModelAnnotation__MetamodelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MetamodelModelAnnotation__MetamodelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4626:1: ( ( RULE_STRING ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4627:1: ( RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4627:1: ( RULE_STRING )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4628:1: RULE_STRING
            {
             before(grammarAccess.getMetamodelModelAnnotationAccess().getMetamodelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__MetamodelModelAnnotation__MetamodelAssignment_29272); 
             after(grammarAccess.getMetamodelModelAnnotationAccess().getMetamodelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelModelAnnotation__MetamodelAssignment_2"


    // $ANTLR start "rule__UseDeclaration__ModuleAssignment_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4637:1: rule__UseDeclaration__ModuleAssignment_1 : ( ruleEString ) ;
    public final void rule__UseDeclaration__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4641:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4642:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4642:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4643:1: ruleEString
            {
             before(grammarAccess.getUseDeclarationAccess().getModuleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UseDeclaration__ModuleAssignment_19303);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUseDeclarationAccess().getModuleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDeclaration__ModuleAssignment_1"


    // $ANTLR start "rule__UseDeclaration__AsAssignment_2_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4652:1: rule__UseDeclaration__AsAssignment_2_1 : ( ruleEString ) ;
    public final void rule__UseDeclaration__AsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4656:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4657:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4657:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4658:1: ruleEString
            {
             before(grammarAccess.getUseDeclarationAccess().getAsEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UseDeclaration__AsAssignment_2_19334);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUseDeclarationAccess().getAsEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDeclaration__AsAssignment_2_1"


    // $ANTLR start "rule__TransformationDefinitionParameter__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4667:1: rule__TransformationDefinitionParameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TransformationDefinitionParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4671:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4672:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4672:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4673:1: ruleEString
            {
             before(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TransformationDefinitionParameter__NameAssignment_19365);
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


    // $ANTLR start "rule__Delegate__TagsAssignment_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4682:1: rule__Delegate__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Delegate__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4686:1: ( ( ruleTag ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4687:1: ( ruleTag )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4687:1: ( ruleTag )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4688:1: ruleTag
            {
             before(grammarAccess.getDelegateAccess().getTagsTagParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTag_in_rule__Delegate__TagsAssignment_09396);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getDelegateAccess().getTagsTagParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__TagsAssignment_0"


    // $ANTLR start "rule__Delegate__LeftAssignment_3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4697:1: rule__Delegate__LeftAssignment_3 : ( ruleMatchedElement ) ;
    public final void rule__Delegate__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4701:1: ( ( ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4702:1: ( ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4702:1: ( ruleMatchedElement )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4703:1: ruleMatchedElement
            {
             before(grammarAccess.getDelegateAccess().getLeftMatchedElementParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_rule__Delegate__LeftAssignment_39427);
            ruleMatchedElement();

            state._fsp--;

             after(grammarAccess.getDelegateAccess().getLeftMatchedElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__LeftAssignment_3"


    // $ANTLR start "rule__Delegate__LeftAssignment_4_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4712:1: rule__Delegate__LeftAssignment_4_1 : ( ruleMatchedElement ) ;
    public final void rule__Delegate__LeftAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4716:1: ( ( ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4717:1: ( ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4717:1: ( ruleMatchedElement )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4718:1: ruleMatchedElement
            {
             before(grammarAccess.getDelegateAccess().getLeftMatchedElementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_rule__Delegate__LeftAssignment_4_19458);
            ruleMatchedElement();

            state._fsp--;

             after(grammarAccess.getDelegateAccess().getLeftMatchedElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__LeftAssignment_4_1"


    // $ANTLR start "rule__Delegate__ModuleAssignment_6_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4727:1: rule__Delegate__ModuleAssignment_6_0 : ( ( RULE_ID ) ) ;
    public final void rule__Delegate__ModuleAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4731:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4732:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4732:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4733:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegateAccess().getModuleUseDeclarationCrossReference_6_0_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4734:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4735:1: RULE_ID
            {
             before(grammarAccess.getDelegateAccess().getModuleUseDeclarationIDTerminalRuleCall_6_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Delegate__ModuleAssignment_6_09493); 
             after(grammarAccess.getDelegateAccess().getModuleUseDeclarationIDTerminalRuleCall_6_0_0_1()); 

            }

             after(grammarAccess.getDelegateAccess().getModuleUseDeclarationCrossReference_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__ModuleAssignment_6_0"


    // $ANTLR start "rule__Delegate__IsExternalAssignment_6_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4746:1: rule__Delegate__IsExternalAssignment_6_1 : ( ( '!' ) ) ;
    public final void rule__Delegate__IsExternalAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4750:1: ( ( ( '!' ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4751:1: ( ( '!' ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4751:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4752:1: ( '!' )
            {
             before(grammarAccess.getDelegateAccess().getIsExternalExclamationMarkKeyword_6_1_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4753:1: ( '!' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4754:1: '!'
            {
             before(grammarAccess.getDelegateAccess().getIsExternalExclamationMarkKeyword_6_1_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Delegate__IsExternalAssignment_6_19533); 
             after(grammarAccess.getDelegateAccess().getIsExternalExclamationMarkKeyword_6_1_0()); 

            }

             after(grammarAccess.getDelegateAccess().getIsExternalExclamationMarkKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__IsExternalAssignment_6_1"


    // $ANTLR start "rule__Delegate__LinkNameAssignment_7"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4769:1: rule__Delegate__LinkNameAssignment_7 : ( ruleEString ) ;
    public final void rule__Delegate__LinkNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4773:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4774:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4774:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4775:1: ruleEString
            {
             before(grammarAccess.getDelegateAccess().getLinkNameEStringParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Delegate__LinkNameAssignment_79572);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegateAccess().getLinkNameEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__LinkNameAssignment_7"


    // $ANTLR start "rule__Delegate__FeatureNameAssignment_8_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4784:1: rule__Delegate__FeatureNameAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Delegate__FeatureNameAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4788:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4789:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4789:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4790:1: ruleEString
            {
             before(grammarAccess.getDelegateAccess().getFeatureNameEStringParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Delegate__FeatureNameAssignment_8_19603);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegateAccess().getFeatureNameEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__FeatureNameAssignment_8_1"


    // $ANTLR start "rule__Context__TagsAssignment_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4799:1: rule__Context__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Context__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4803:1: ( ( ruleTag ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4804:1: ( ruleTag )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4804:1: ( ruleTag )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4805:1: ruleTag
            {
             before(grammarAccess.getContextAccess().getTagsTagParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTag_in_rule__Context__TagsAssignment_09634);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getContextAccess().getTagsTagParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__TagsAssignment_0"


    // $ANTLR start "rule__Context__LeftAssignment_2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4814:1: rule__Context__LeftAssignment_2 : ( ruleMatchedElement ) ;
    public final void rule__Context__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4818:1: ( ( ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4819:1: ( ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4819:1: ( ruleMatchedElement )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4820:1: ruleMatchedElement
            {
             before(grammarAccess.getContextAccess().getLeftMatchedElementParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_rule__Context__LeftAssignment_29665);
            ruleMatchedElement();

            state._fsp--;

             after(grammarAccess.getContextAccess().getLeftMatchedElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__LeftAssignment_2"


    // $ANTLR start "rule__Context__LeftAssignment_3_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4829:1: rule__Context__LeftAssignment_3_1 : ( ruleMatchedElement ) ;
    public final void rule__Context__LeftAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4833:1: ( ( ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4834:1: ( ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4834:1: ( ruleMatchedElement )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4835:1: ruleMatchedElement
            {
             before(grammarAccess.getContextAccess().getLeftMatchedElementParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_rule__Context__LeftAssignment_3_19696);
            ruleMatchedElement();

            state._fsp--;

             after(grammarAccess.getContextAccess().getLeftMatchedElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__LeftAssignment_3_1"


    // $ANTLR start "rule__Context__RightAssignment_5"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4844:1: rule__Context__RightAssignment_5 : ( ruleMatchedElement ) ;
    public final void rule__Context__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4848:1: ( ( ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4849:1: ( ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4849:1: ( ruleMatchedElement )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4850:1: ruleMatchedElement
            {
             before(grammarAccess.getContextAccess().getRightMatchedElementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_rule__Context__RightAssignment_59727);
            ruleMatchedElement();

            state._fsp--;

             after(grammarAccess.getContextAccess().getRightMatchedElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__RightAssignment_5"


    // $ANTLR start "rule__Context__RightAssignment_6_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4859:1: rule__Context__RightAssignment_6_1 : ( ruleMatchedElement ) ;
    public final void rule__Context__RightAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4863:1: ( ( ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4864:1: ( ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4864:1: ( ruleMatchedElement )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4865:1: ruleMatchedElement
            {
             before(grammarAccess.getContextAccess().getRightMatchedElementParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_rule__Context__RightAssignment_6_19758);
            ruleMatchedElement();

            state._fsp--;

             after(grammarAccess.getContextAccess().getRightMatchedElementParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__RightAssignment_6_1"


    // $ANTLR start "rule__Context__ModifiersAssignment_7"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4874:1: rule__Context__ModifiersAssignment_7 : ( ruleC2CModifier ) ;
    public final void rule__Context__ModifiersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4878:1: ( ( ruleC2CModifier ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4879:1: ( ruleC2CModifier )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4879:1: ( ruleC2CModifier )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4880:1: ruleC2CModifier
            {
             before(grammarAccess.getContextAccess().getModifiersC2CModifierParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleC2CModifier_in_rule__Context__ModifiersAssignment_79789);
            ruleC2CModifier();

            state._fsp--;

             after(grammarAccess.getContextAccess().getModifiersC2CModifierParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__ModifiersAssignment_7"


    // $ANTLR start "rule__Context__MappingsAssignment_8"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4889:1: rule__Context__MappingsAssignment_8 : ( ( rule__Context__MappingsAlternatives_8_0 ) ) ;
    public final void rule__Context__MappingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4893:1: ( ( ( rule__Context__MappingsAlternatives_8_0 ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4894:1: ( ( rule__Context__MappingsAlternatives_8_0 ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4894:1: ( ( rule__Context__MappingsAlternatives_8_0 ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4895:1: ( rule__Context__MappingsAlternatives_8_0 )
            {
             before(grammarAccess.getContextAccess().getMappingsAlternatives_8_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4896:1: ( rule__Context__MappingsAlternatives_8_0 )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4896:2: rule__Context__MappingsAlternatives_8_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__MappingsAlternatives_8_0_in_rule__Context__MappingsAssignment_89820);
            rule__Context__MappingsAlternatives_8_0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getMappingsAlternatives_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__MappingsAssignment_8"


    // $ANTLR start "rule__Tag__NameAssignment_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4905:1: rule__Tag__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Tag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4909:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4910:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4910:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4911:1: ruleEString
            {
             before(grammarAccess.getTagAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Tag__NameAssignment_19853);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTagAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__NameAssignment_1"


    // $ANTLR start "rule__MatchedElement__NameAssignment_0_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4920:1: rule__MatchedElement__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__MatchedElement__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4924:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4925:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4925:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4926:1: RULE_ID
            {
             before(grammarAccess.getMatchedElementAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchedElement__NameAssignment_0_09884); 
             after(grammarAccess.getMatchedElementAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__NameAssignment_0_0"


    // $ANTLR start "rule__MatchedElement__ModelAssignment_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4935:1: rule__MatchedElement__ModelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchedElement__ModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4939:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4940:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4940:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4941:1: ( RULE_ID )
            {
             before(grammarAccess.getMatchedElementAccess().getModelRepresentModelCrossReference_1_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4942:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4943:1: RULE_ID
            {
             before(grammarAccess.getMatchedElementAccess().getModelRepresentModelIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchedElement__ModelAssignment_19919); 
             after(grammarAccess.getMatchedElementAccess().getModelRepresentModelIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMatchedElementAccess().getModelRepresentModelCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__ModelAssignment_1"


    // $ANTLR start "rule__MatchedElement__ClassNameAssignment_3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4954:1: rule__MatchedElement__ClassNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__MatchedElement__ClassNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4958:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4959:1: ( RULE_ID )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4959:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4960:1: RULE_ID
            {
             before(grammarAccess.getMatchedElementAccess().getClassNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MatchedElement__ClassNameAssignment_39954); 
             after(grammarAccess.getMatchedElementAccess().getClassNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__ClassNameAssignment_3"


    // $ANTLR start "rule__MatchedElement__AnnotationsAssignment_4"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4969:1: rule__MatchedElement__AnnotationsAssignment_4 : ( ruleSingleAnnotation ) ;
    public final void rule__MatchedElement__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4973:1: ( ( ruleSingleAnnotation ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4974:1: ( ruleSingleAnnotation )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4974:1: ( ruleSingleAnnotation )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4975:1: ruleSingleAnnotation
            {
             before(grammarAccess.getMatchedElementAccess().getAnnotationsSingleAnnotationParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_rule__MatchedElement__AnnotationsAssignment_49985);
            ruleSingleAnnotation();

            state._fsp--;

             after(grammarAccess.getMatchedElementAccess().getAnnotationsSingleAnnotationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__AnnotationsAssignment_4"


    // $ANTLR start "rule__MatchedElement__StrictTypeAssignment_5"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4984:1: rule__MatchedElement__StrictTypeAssignment_5 : ( ( '!' ) ) ;
    public final void rule__MatchedElement__StrictTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4988:1: ( ( ( '!' ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4989:1: ( ( '!' ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4989:1: ( ( '!' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4990:1: ( '!' )
            {
             before(grammarAccess.getMatchedElementAccess().getStrictTypeExclamationMarkKeyword_5_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4991:1: ( '!' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:4992:1: '!'
            {
             before(grammarAccess.getMatchedElementAccess().getStrictTypeExclamationMarkKeyword_5_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MatchedElement__StrictTypeAssignment_510021); 
             after(grammarAccess.getMatchedElementAccess().getStrictTypeExclamationMarkKeyword_5_0()); 

            }

             after(grammarAccess.getMatchedElementAccess().getStrictTypeExclamationMarkKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedElement__StrictTypeAssignment_5"


    // $ANTLR start "rule__PotencyAnnotation__ValueAssignment_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5007:1: rule__PotencyAnnotation__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__PotencyAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5011:1: ( ( RULE_INT ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5012:1: ( RULE_INT )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5012:1: ( RULE_INT )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5013:1: RULE_INT
            {
             before(grammarAccess.getPotencyAnnotationAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__PotencyAnnotation__ValueAssignment_110060); 
             after(grammarAccess.getPotencyAnnotationAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__LinkedBy__AttributeAssignment_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5022:1: rule__LinkedBy__AttributeAssignment_1 : ( ruleAttributeRef ) ;
    public final void rule__LinkedBy__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5026:1: ( ( ruleAttributeRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5027:1: ( ruleAttributeRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5027:1: ( ruleAttributeRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5028:1: ruleAttributeRef
            {
             before(grammarAccess.getLinkedByAccess().getAttributeAttributeRefParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_rule__LinkedBy__AttributeAssignment_110091);
            ruleAttributeRef();

            state._fsp--;

             after(grammarAccess.getLinkedByAccess().getAttributeAttributeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkedBy__AttributeAssignment_1"


    // $ANTLR start "rule__LinkedBy__LinkedElementAssignment_3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5037:1: rule__LinkedBy__LinkedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__LinkedBy__LinkedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5041:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5042:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5042:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5043:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkedByAccess().getLinkedElementMatchedElementCrossReference_3_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5044:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5045:1: RULE_ID
            {
             before(grammarAccess.getLinkedByAccess().getLinkedElementMatchedElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LinkedBy__LinkedElementAssignment_310126); 
             after(grammarAccess.getLinkedByAccess().getLinkedElementMatchedElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLinkedByAccess().getLinkedElementMatchedElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkedBy__LinkedElementAssignment_3"


    // $ANTLR start "rule__AttributeMapping__LeftAssignment_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5056:1: rule__AttributeMapping__LeftAssignment_0 : ( ruleAttributeRef ) ;
    public final void rule__AttributeMapping__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5060:1: ( ( ruleAttributeRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5061:1: ( ruleAttributeRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5061:1: ( ruleAttributeRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5062:1: ruleAttributeRef
            {
             before(grammarAccess.getAttributeMappingAccess().getLeftAttributeRefParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_rule__AttributeMapping__LeftAssignment_010161);
            ruleAttributeRef();

            state._fsp--;

             after(grammarAccess.getAttributeMappingAccess().getLeftAttributeRefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__LeftAssignment_0"


    // $ANTLR start "rule__AttributeMapping__LeftAssignment_1_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5071:1: rule__AttributeMapping__LeftAssignment_1_1 : ( ruleAttributeRef ) ;
    public final void rule__AttributeMapping__LeftAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5075:1: ( ( ruleAttributeRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5076:1: ( ruleAttributeRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5076:1: ( ruleAttributeRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5077:1: ruleAttributeRef
            {
             before(grammarAccess.getAttributeMappingAccess().getLeftAttributeRefParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_rule__AttributeMapping__LeftAssignment_1_110192);
            ruleAttributeRef();

            state._fsp--;

             after(grammarAccess.getAttributeMappingAccess().getLeftAttributeRefParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__LeftAssignment_1_1"


    // $ANTLR start "rule__AttributeMapping__RightPartAssignment_3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5086:1: rule__AttributeMapping__RightPartAssignment_3 : ( ruleAttributeRightPart ) ;
    public final void rule__AttributeMapping__RightPartAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5090:1: ( ( ruleAttributeRightPart ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5091:1: ( ruleAttributeRightPart )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5091:1: ( ruleAttributeRightPart )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5092:1: ruleAttributeRightPart
            {
             before(grammarAccess.getAttributeMappingAccess().getRightPartAttributeRightPartParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRightPart_in_rule__AttributeMapping__RightPartAssignment_310223);
            ruleAttributeRightPart();

            state._fsp--;

             after(grammarAccess.getAttributeMappingAccess().getRightPartAttributeRightPartParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__RightPartAssignment_3"


    // $ANTLR start "rule__Attribute2Attribute__RightAssignment_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5101:1: rule__Attribute2Attribute__RightAssignment_0 : ( ruleAttributeRef ) ;
    public final void rule__Attribute2Attribute__RightAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5105:1: ( ( ruleAttributeRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5106:1: ( ruleAttributeRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5106:1: ( ruleAttributeRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5107:1: ruleAttributeRef
            {
             before(grammarAccess.getAttribute2AttributeAccess().getRightAttributeRefParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_rule__Attribute2Attribute__RightAssignment_010254);
            ruleAttributeRef();

            state._fsp--;

             after(grammarAccess.getAttribute2AttributeAccess().getRightAttributeRefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2Attribute__RightAssignment_0"


    // $ANTLR start "rule__Attribute2Attribute__RightAssignment_1_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5116:1: rule__Attribute2Attribute__RightAssignment_1_1 : ( ruleAttributeRef ) ;
    public final void rule__Attribute2Attribute__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5120:1: ( ( ruleAttributeRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5121:1: ( ruleAttributeRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5121:1: ( ruleAttributeRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5122:1: ruleAttributeRef
            {
             before(grammarAccess.getAttribute2AttributeAccess().getRightAttributeRefParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_rule__Attribute2Attribute__RightAssignment_1_110285);
            ruleAttributeRef();

            state._fsp--;

             after(grammarAccess.getAttribute2AttributeAccess().getRightAttributeRefParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2Attribute__RightAssignment_1_1"


    // $ANTLR start "rule__Attribute2Attribute__ConverterAssignment_2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5131:1: rule__Attribute2Attribute__ConverterAssignment_2 : ( ruleConverter ) ;
    public final void rule__Attribute2Attribute__ConverterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5135:1: ( ( ruleConverter ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5136:1: ( ruleConverter )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5136:1: ( ruleConverter )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5137:1: ruleConverter
            {
             before(grammarAccess.getAttribute2AttributeAccess().getConverterConverterParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConverter_in_rule__Attribute2Attribute__ConverterAssignment_210316);
            ruleConverter();

            state._fsp--;

             after(grammarAccess.getAttribute2AttributeAccess().getConverterConverterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2Attribute__ConverterAssignment_2"


    // $ANTLR start "rule__AttributeIsString__StrValueAssignment"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5146:1: rule__AttributeIsString__StrValueAssignment : ( ruleStrictString ) ;
    public final void rule__AttributeIsString__StrValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5150:1: ( ( ruleStrictString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5151:1: ( ruleStrictString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5151:1: ( ruleStrictString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5152:1: ruleStrictString
            {
             before(grammarAccess.getAttributeIsStringAccess().getStrValueStrictStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrictString_in_rule__AttributeIsString__StrValueAssignment10347);
            ruleStrictString();

            state._fsp--;

             after(grammarAccess.getAttributeIsStringAccess().getStrValueStrictStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeIsString__StrValueAssignment"


    // $ANTLR start "rule__AttributeIsBoolean__BoolValueAssignment"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5161:1: rule__AttributeIsBoolean__BoolValueAssignment : ( ruleEBoolean ) ;
    public final void rule__AttributeIsBoolean__BoolValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5165:1: ( ( ruleEBoolean ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5166:1: ( ruleEBoolean )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5166:1: ( ruleEBoolean )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5167:1: ruleEBoolean
            {
             before(grammarAccess.getAttributeIsBooleanAccess().getBoolValueEBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__AttributeIsBoolean__BoolValueAssignment10378);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAttributeIsBooleanAccess().getBoolValueEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeIsBoolean__BoolValueAssignment"


    // $ANTLR start "rule__AttributeIsDouble__DoubleValueAssignment"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5176:1: rule__AttributeIsDouble__DoubleValueAssignment : ( ruleEDouble ) ;
    public final void rule__AttributeIsDouble__DoubleValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5180:1: ( ( ruleEDouble ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5181:1: ( ruleEDouble )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5181:1: ( ruleEDouble )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5182:1: ruleEDouble
            {
             before(grammarAccess.getAttributeIsDoubleAccess().getDoubleValueEDoubleParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__AttributeIsDouble__DoubleValueAssignment10409);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAttributeIsDoubleAccess().getDoubleValueEDoubleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeIsDouble__DoubleValueAssignment"


    // $ANTLR start "rule__AttributeIsInteger__IntValueAssignment"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5191:1: rule__AttributeIsInteger__IntValueAssignment : ( ruleEInt ) ;
    public final void rule__AttributeIsInteger__IntValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5195:1: ( ( ruleEInt ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5196:1: ( ruleEInt )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5196:1: ( ruleEInt )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5197:1: ruleEInt
            {
             before(grammarAccess.getAttributeIsIntegerAccess().getIntValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__AttributeIsInteger__IntValueAssignment10440);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttributeIsIntegerAccess().getIntValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeIsInteger__IntValueAssignment"


    // $ANTLR start "rule__AttributeRef__ReferredElementAssignment_0_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5206:1: rule__AttributeRef__ReferredElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeRef__ReferredElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5210:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5211:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5211:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5212:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeRefAccess().getReferredElementMatchedElementCrossReference_0_0_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5213:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5214:1: RULE_ID
            {
             before(grammarAccess.getAttributeRefAccess().getReferredElementMatchedElementIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributeRef__ReferredElementAssignment_0_010475); 
             after(grammarAccess.getAttributeRefAccess().getReferredElementMatchedElementIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getAttributeRefAccess().getReferredElementMatchedElementCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRef__ReferredElementAssignment_0_0"


    // $ANTLR start "rule__AttributeRef__FeatureNameAssignment_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5225:1: rule__AttributeRef__FeatureNameAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeRef__FeatureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5229:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5230:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5230:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5231:1: ruleEString
            {
             before(grammarAccess.getAttributeRefAccess().getFeatureNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AttributeRef__FeatureNameAssignment_110510);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeRefAccess().getFeatureNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRef__FeatureNameAssignment_1"


    // $ANTLR start "rule__AttributeRef__MultivaluedAssignment_2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5240:1: rule__AttributeRef__MultivaluedAssignment_2 : ( ( '*' ) ) ;
    public final void rule__AttributeRef__MultivaluedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5244:1: ( ( ( '*' ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5245:1: ( ( '*' ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5245:1: ( ( '*' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5246:1: ( '*' )
            {
             before(grammarAccess.getAttributeRefAccess().getMultivaluedAsteriskKeyword_2_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5247:1: ( '*' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5248:1: '*'
            {
             before(grammarAccess.getAttributeRefAccess().getMultivaluedAsteriskKeyword_2_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__AttributeRef__MultivaluedAssignment_210546); 
             after(grammarAccess.getAttributeRefAccess().getMultivaluedAsteriskKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeRefAccess().getMultivaluedAsteriskKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRef__MultivaluedAssignment_2"


    // $ANTLR start "rule__Reference2Reference__LeftAssignment_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5263:1: rule__Reference2Reference__LeftAssignment_0 : ( ruleReferenceRef ) ;
    public final void rule__Reference2Reference__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5267:1: ( ( ruleReferenceRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5268:1: ( ruleReferenceRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5268:1: ( ruleReferenceRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5269:1: ruleReferenceRef
            {
             before(grammarAccess.getReference2ReferenceAccess().getLeftReferenceRefParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_rule__Reference2Reference__LeftAssignment_010585);
            ruleReferenceRef();

            state._fsp--;

             after(grammarAccess.getReference2ReferenceAccess().getLeftReferenceRefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__LeftAssignment_0"


    // $ANTLR start "rule__Reference2Reference__LeftAssignment_1_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5278:1: rule__Reference2Reference__LeftAssignment_1_1 : ( ruleReferenceRef ) ;
    public final void rule__Reference2Reference__LeftAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5282:1: ( ( ruleReferenceRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5283:1: ( ruleReferenceRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5283:1: ( ruleReferenceRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5284:1: ruleReferenceRef
            {
             before(grammarAccess.getReference2ReferenceAccess().getLeftReferenceRefParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_rule__Reference2Reference__LeftAssignment_1_110616);
            ruleReferenceRef();

            state._fsp--;

             after(grammarAccess.getReference2ReferenceAccess().getLeftReferenceRefParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__LeftAssignment_1_1"


    // $ANTLR start "rule__Reference2Reference__RightAssignment_3"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5293:1: rule__Reference2Reference__RightAssignment_3 : ( ruleReferenceRef ) ;
    public final void rule__Reference2Reference__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5297:1: ( ( ruleReferenceRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5298:1: ( ruleReferenceRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5298:1: ( ruleReferenceRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5299:1: ruleReferenceRef
            {
             before(grammarAccess.getReference2ReferenceAccess().getRightReferenceRefParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_rule__Reference2Reference__RightAssignment_310647);
            ruleReferenceRef();

            state._fsp--;

             after(grammarAccess.getReference2ReferenceAccess().getRightReferenceRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__RightAssignment_3"


    // $ANTLR start "rule__Reference2Reference__RightAssignment_4_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5308:1: rule__Reference2Reference__RightAssignment_4_1 : ( ruleReferenceRef ) ;
    public final void rule__Reference2Reference__RightAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5312:1: ( ( ruleReferenceRef ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5313:1: ( ruleReferenceRef )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5313:1: ( ruleReferenceRef )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5314:1: ruleReferenceRef
            {
             before(grammarAccess.getReference2ReferenceAccess().getRightReferenceRefParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_rule__Reference2Reference__RightAssignment_4_110678);
            ruleReferenceRef();

            state._fsp--;

             after(grammarAccess.getReference2ReferenceAccess().getRightReferenceRefParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__RightAssignment_4_1"


    // $ANTLR start "rule__Reference2Reference__ConverterAssignment_5"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5323:1: rule__Reference2Reference__ConverterAssignment_5 : ( ruleConverter ) ;
    public final void rule__Reference2Reference__ConverterAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5327:1: ( ( ruleConverter ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5328:1: ( ruleConverter )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5328:1: ( ruleConverter )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5329:1: ruleConverter
            {
             before(grammarAccess.getReference2ReferenceAccess().getConverterConverterParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConverter_in_rule__Reference2Reference__ConverterAssignment_510709);
            ruleConverter();

            state._fsp--;

             after(grammarAccess.getReference2ReferenceAccess().getConverterConverterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2Reference__ConverterAssignment_5"


    // $ANTLR start "rule__ReferenceRef__ReferredElementAssignment_0_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5338:1: rule__ReferenceRef__ReferredElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceRef__ReferredElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5342:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5343:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5343:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5344:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceRefAccess().getReferredElementMatchedElementCrossReference_0_0_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5345:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5346:1: RULE_ID
            {
             before(grammarAccess.getReferenceRefAccess().getReferredElementMatchedElementIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ReferenceRef__ReferredElementAssignment_0_010744); 
             after(grammarAccess.getReferenceRefAccess().getReferredElementMatchedElementIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getReferenceRefAccess().getReferredElementMatchedElementCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceRef__ReferredElementAssignment_0_0"


    // $ANTLR start "rule__ReferenceRef__FeatureNameAssignment_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5357:1: rule__ReferenceRef__FeatureNameAssignment_1 : ( ruleEString ) ;
    public final void rule__ReferenceRef__FeatureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5361:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5362:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5362:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5363:1: ruleEString
            {
             before(grammarAccess.getReferenceRefAccess().getFeatureNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ReferenceRef__FeatureNameAssignment_110779);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceRefAccess().getFeatureNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceRef__FeatureNameAssignment_1"


    // $ANTLR start "rule__ReferenceRef__MultivaluedAssignment_2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5372:1: rule__ReferenceRef__MultivaluedAssignment_2 : ( ( '*' ) ) ;
    public final void rule__ReferenceRef__MultivaluedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5376:1: ( ( ( '*' ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5377:1: ( ( '*' ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5377:1: ( ( '*' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5378:1: ( '*' )
            {
             before(grammarAccess.getReferenceRefAccess().getMultivaluedAsteriskKeyword_2_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5379:1: ( '*' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5380:1: '*'
            {
             before(grammarAccess.getReferenceRefAccess().getMultivaluedAsteriskKeyword_2_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ReferenceRef__MultivaluedAssignment_210815); 
             after(grammarAccess.getReferenceRefAccess().getMultivaluedAsteriskKeyword_2_0()); 

            }

             after(grammarAccess.getReferenceRefAccess().getMultivaluedAsteriskKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceRef__MultivaluedAssignment_2"


    // $ANTLR start "rule__Converter__ModuleAssignment_1_0"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5395:1: rule__Converter__ModuleAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Converter__ModuleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5399:1: ( ( ( RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5400:1: ( ( RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5400:1: ( ( RULE_ID ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5401:1: ( RULE_ID )
            {
             before(grammarAccess.getConverterAccess().getModuleUseDeclarationCrossReference_1_0_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5402:1: ( RULE_ID )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5403:1: RULE_ID
            {
             before(grammarAccess.getConverterAccess().getModuleUseDeclarationIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Converter__ModuleAssignment_1_010858); 
             after(grammarAccess.getConverterAccess().getModuleUseDeclarationIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getConverterAccess().getModuleUseDeclarationCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Converter__ModuleAssignment_1_0"


    // $ANTLR start "rule__Converter__IsExternalAssignment_1_1"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5414:1: rule__Converter__IsExternalAssignment_1_1 : ( ( '.' ) ) ;
    public final void rule__Converter__IsExternalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5418:1: ( ( ( '.' ) ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5419:1: ( ( '.' ) )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5419:1: ( ( '.' ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5420:1: ( '.' )
            {
             before(grammarAccess.getConverterAccess().getIsExternalFullStopKeyword_1_1_0()); 
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5421:1: ( '.' )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5422:1: '.'
            {
             before(grammarAccess.getConverterAccess().getIsExternalFullStopKeyword_1_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Converter__IsExternalAssignment_1_110898); 
             after(grammarAccess.getConverterAccess().getIsExternalFullStopKeyword_1_1_0()); 

            }

             after(grammarAccess.getConverterAccess().getIsExternalFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Converter__IsExternalAssignment_1_1"


    // $ANTLR start "rule__Converter__ConverterNameAssignment_2"
    // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5437:1: rule__Converter__ConverterNameAssignment_2 : ( ruleEString ) ;
    public final void rule__Converter__ConverterNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5441:1: ( ( ruleEString ) )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5442:1: ( ruleEString )
            {
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5442:1: ( ruleEString )
            // ../org.eclectic.frontend.syntax.mappings.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalMappings.g:5443:1: ruleEString
            {
             before(grammarAccess.getConverterAccess().getConverterNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Converter__ConverterNameAssignment_210937);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConverterAccess().getConverterNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Converter__ConverterNameAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\16\uffff";
    static final String DFA1_minS =
        "\1\4\3\31\1\4\1\uffff\1\4\1\uffff\4\31\1\4\1\31";
    static final String DFA1_maxS =
        "\1\5\2\44\1\41\1\5\1\uffff\1\5\1\uffff\3\44\1\41\1\5\1\44";
    static final String DFA1_acceptS =
        "\5\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\1",
            "\1\4\1\6\5\uffff\1\7\1\5\2\uffff\1\3",
            "\1\4\6\uffff\1\7\1\5\2\uffff\1\3",
            "\1\4\6\uffff\1\7\1\5",
            "\1\11\1\10",
            "",
            "\1\2\1\12",
            "",
            "\1\4\1\14\5\uffff\1\7\1\5\2\uffff\1\13",
            "\1\4\6\uffff\1\7\1\5\2\uffff\1\13",
            "\1\4\6\uffff\1\7\1\5\2\uffff\1\3",
            "\1\4\6\uffff\1\7\1\5",
            "\1\11\1\15",
            "\1\4\6\uffff\1\7\1\5\2\uffff\1\13"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "900:1: rule__Context__MappingsAlternatives_8_0 : ( ( ruleAttributeMapping ) | ( ruleReference2Reference ) );";
        }
    }
    static final String DFA8_eotS =
        "\7\uffff";
    static final String DFA8_eofS =
        "\7\uffff";
    static final String DFA8_minS =
        "\1\26\1\4\2\uffff\2\35\1\26";
    static final String DFA8_maxS =
        "\1\34\1\5\2\uffff\2\35\1\34";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1\3\uffff";
    static final String DFA8_specialS =
        "\7\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\2\4\uffff\1\1",
            "\1\4\1\5",
            "",
            "",
            "\1\6",
            "\1\6",
            "\1\3\1\2\4\uffff\1\1"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 1388:1: ( rule__MappingTransformation__DelegatesAssignment_11 )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappingTransformation68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__0_in_ruleMappingTransformation94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetamodelModelAnnotation_in_ruleAnnotation154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetamodelModelAnnotation_in_entryRuleMetamodelModelAnnotation180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelModelAnnotation187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetamodelModelAnnotation__Group__0_in_ruleMetamodelModelAnnotation213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUsesStatements_in_entryRuleUsesStatements240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUsesStatements247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUseDeclaration_in_ruleUsesStatements273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUseDeclaration_in_entryRuleUseDeclaration299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUseDeclaration306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group__0_in_ruleUseDeclaration332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter359 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__0_in_ruleTransformationDefinitionParameter392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelegate_in_entryRuleDelegate419 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelegate426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__0_in_ruleDelegate452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__0_in_ruleContext512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTag_in_entryRuleTag539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTag546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Tag__Group__0_in_ruleTag572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_entryRuleMatchedElement599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchedElement606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__0_in_ruleMatchedElement632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleAnnotation666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePotencyAnnotation725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Group__0_in_rulePotencyAnnotation751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleC2CModifier_in_entryRuleC2CModifier778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleC2CModifier785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkedBy_in_ruleC2CModifier811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkedBy_in_entryRuleLinkedBy837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinkedBy844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LinkedBy__Group__0_in_ruleLinkedBy870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeMapping_in_entryRuleAttributeMapping897 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeMapping904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group__0_in_ruleAttributeMapping930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRightPart_in_entryRuleAttributeRightPart957 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeRightPart964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRightPart__Alternatives_in_ruleAttributeRightPart990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute2Attribute_in_entryRuleAttribute2Attribute1017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2Attribute1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group__0_in_ruleAttribute2Attribute1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsString_in_entryRuleAttributeIsString1077 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeIsString1084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeIsString__StrValueAssignment_in_ruleAttributeIsString1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsBoolean_in_entryRuleAttributeIsBoolean1137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeIsBoolean1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeIsBoolean__BoolValueAssignment_in_ruleAttributeIsBoolean1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsDouble_in_entryRuleAttributeIsDouble1197 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeIsDouble1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeIsDouble__DoubleValueAssignment_in_ruleAttributeIsDouble1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsInteger_in_entryRuleAttributeIsInteger1257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeIsInteger1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeIsInteger__IntValueAssignment_in_ruleAttributeIsInteger1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_entryRuleAttributeRef1317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeRef1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group__0_in_ruleAttributeRef1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference2Reference_in_entryRuleReference2Reference1377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference2Reference1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__0_in_ruleReference2Reference1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_entryRuleReferenceRef1437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceRef1444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group__0_in_ruleReferenceRef1470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConverter_in_entryRuleConverter1497 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConverter1504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__Group__0_in_ruleConverter1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1557 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1617 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrictString_in_entryRuleStrictString1737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrictString1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStrictString1770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1796 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeMapping_in_rule__Context__MappingsAlternatives_8_01865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference2Reference_in_rule__Context__MappingsAlternatives_8_01882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__PotencyAnnotation__Alternatives_01915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__PotencyAnnotation__Alternatives_01935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsString_in_rule__AttributeRightPart__Alternatives1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsBoolean_in_rule__AttributeRightPart__Alternatives1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsDouble_in_rule__AttributeRightPart__Alternatives2003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsInteger_in_rule__AttributeRightPart__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute2Attribute_in_rule__AttributeRightPart__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EBoolean__Alternatives2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EBoolean__Alternatives2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__0__Impl_in_rule__MappingTransformation__Group__02171 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__1_in_rule__MappingTransformation__Group__02174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MappingTransformation__Group__0__Impl2202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__1__Impl_in_rule__MappingTransformation__Group__12233 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__2_in_rule__MappingTransformation__Group__12236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__NameAssignment_1_in_rule__MappingTransformation__Group__1__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__2__Impl_in_rule__MappingTransformation__Group__22293 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__3_in_rule__MappingTransformation__Group__22296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MappingTransformation__Group__2__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__3__Impl_in_rule__MappingTransformation__Group__32355 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__4_in_rule__MappingTransformation__Group__32358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__InModelsAssignment_3_in_rule__MappingTransformation__Group__3__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__4__Impl_in_rule__MappingTransformation__Group__42415 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__5_in_rule__MappingTransformation__Group__42418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MappingTransformation__Group__4__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__5__Impl_in_rule__MappingTransformation__Group__52477 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__6_in_rule__MappingTransformation__Group__52480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MappingTransformation__Group__5__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__6__Impl_in_rule__MappingTransformation__Group__62539 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__7_in_rule__MappingTransformation__Group__62542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MappingTransformation__Group__6__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__7__Impl_in_rule__MappingTransformation__Group__72601 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__8_in_rule__MappingTransformation__Group__72604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__OutModelsAssignment_7_in_rule__MappingTransformation__Group__7__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__8__Impl_in_rule__MappingTransformation__Group__82661 = new BitSet(new long[]{0x0000000010D00020L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__9_in_rule__MappingTransformation__Group__82664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MappingTransformation__Group__8__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__9__Impl_in_rule__MappingTransformation__Group__92723 = new BitSet(new long[]{0x0000000010D00020L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__10_in_rule__MappingTransformation__Group__92726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__AnnotationsAssignment_9_in_rule__MappingTransformation__Group__9__Impl2753 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__10__Impl_in_rule__MappingTransformation__Group__102784 = new BitSet(new long[]{0x0000000010D00020L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__11_in_rule__MappingTransformation__Group__102787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__UsesAssignment_10_in_rule__MappingTransformation__Group__10__Impl2814 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__11__Impl_in_rule__MappingTransformation__Group__112845 = new BitSet(new long[]{0x0000000010D00020L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__12_in_rule__MappingTransformation__Group__112848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__DelegatesAssignment_11_in_rule__MappingTransformation__Group__11__Impl2875 = new BitSet(new long[]{0x0000000010400002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__Group__12__Impl_in_rule__MappingTransformation__Group__122906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MappingTransformation__ContextsAssignment_12_in_rule__MappingTransformation__Group__12__Impl2935 = new BitSet(new long[]{0x0000000010D00022L});
        public static final BitSet FOLLOW_rule__MappingTransformation__ContextsAssignment_12_in_rule__MappingTransformation__Group__12__Impl2947 = new BitSet(new long[]{0x0000000010D00022L});
        public static final BitSet FOLLOW_rule__MetamodelModelAnnotation__Group__0__Impl_in_rule__MetamodelModelAnnotation__Group__03006 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MetamodelModelAnnotation__Group__1_in_rule__MetamodelModelAnnotation__Group__03009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetamodelModelAnnotation__AnnotatedElementAssignment_0_in_rule__MetamodelModelAnnotation__Group__0__Impl3036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetamodelModelAnnotation__Group__1__Impl_in_rule__MetamodelModelAnnotation__Group__13066 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MetamodelModelAnnotation__Group__2_in_rule__MetamodelModelAnnotation__Group__13069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MetamodelModelAnnotation__Group__1__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetamodelModelAnnotation__Group__2__Impl_in_rule__MetamodelModelAnnotation__Group__23128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetamodelModelAnnotation__MetamodelAssignment_2_in_rule__MetamodelModelAnnotation__Group__2__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group__0__Impl_in_rule__UseDeclaration__Group__03191 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group__1_in_rule__UseDeclaration__Group__03194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__UseDeclaration__Group__0__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group__1__Impl_in_rule__UseDeclaration__Group__13253 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group__2_in_rule__UseDeclaration__Group__13256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__ModuleAssignment_1_in_rule__UseDeclaration__Group__1__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group__2__Impl_in_rule__UseDeclaration__Group__23313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group_2__0_in_rule__UseDeclaration__Group__2__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group_2__0__Impl_in_rule__UseDeclaration__Group_2__03377 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group_2__1_in_rule__UseDeclaration__Group_2__03380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__UseDeclaration__Group_2__0__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__Group_2__1__Impl_in_rule__UseDeclaration__Group_2__13439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UseDeclaration__AsAssignment_2_1_in_rule__UseDeclaration__Group_2__1__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__0__Impl_in_rule__TransformationDefinitionParameter__Group__03500 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__1_in_rule__TransformationDefinitionParameter__Group__03503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__Group__1__Impl_in_rule__TransformationDefinitionParameter__Group__13561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformationDefinitionParameter__NameAssignment_1_in_rule__TransformationDefinitionParameter__Group__1__Impl3588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__0__Impl_in_rule__Delegate__Group__03622 = new BitSet(new long[]{0x0000000010400000L});
        public static final BitSet FOLLOW_rule__Delegate__Group__1_in_rule__Delegate__Group__03625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__TagsAssignment_0_in_rule__Delegate__Group__0__Impl3652 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__1__Impl_in_rule__Delegate__Group__13683 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Delegate__Group__2_in_rule__Delegate__Group__13686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Delegate__Group__1__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__2__Impl_in_rule__Delegate__Group__23745 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Delegate__Group__3_in_rule__Delegate__Group__23748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Delegate__Group__2__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__3__Impl_in_rule__Delegate__Group__33807 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Delegate__Group__4_in_rule__Delegate__Group__33810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__LeftAssignment_3_in_rule__Delegate__Group__3__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__4__Impl_in_rule__Delegate__Group__43867 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Delegate__Group__5_in_rule__Delegate__Group__43870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_4__0_in_rule__Delegate__Group__4__Impl3897 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__5__Impl_in_rule__Delegate__Group__53928 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Delegate__Group__6_in_rule__Delegate__Group__53931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Delegate__Group__5__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__6__Impl_in_rule__Delegate__Group__63990 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Delegate__Group__7_in_rule__Delegate__Group__63993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_6__0_in_rule__Delegate__Group__6__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__7__Impl_in_rule__Delegate__Group__74050 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Delegate__Group__8_in_rule__Delegate__Group__74053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__LinkNameAssignment_7_in_rule__Delegate__Group__7__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group__8__Impl_in_rule__Delegate__Group__84110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_8__0_in_rule__Delegate__Group__8__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_4__0__Impl_in_rule__Delegate__Group_4__04186 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Delegate__Group_4__1_in_rule__Delegate__Group_4__04189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Delegate__Group_4__0__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_4__1__Impl_in_rule__Delegate__Group_4__14248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__LeftAssignment_4_1_in_rule__Delegate__Group_4__1__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_6__0__Impl_in_rule__Delegate__Group_6__04309 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Delegate__Group_6__1_in_rule__Delegate__Group_6__04312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__ModuleAssignment_6_0_in_rule__Delegate__Group_6__0__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_6__1__Impl_in_rule__Delegate__Group_6__14369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__IsExternalAssignment_6_1_in_rule__Delegate__Group_6__1__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_8__0__Impl_in_rule__Delegate__Group_8__04430 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Delegate__Group_8__1_in_rule__Delegate__Group_8__04433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Delegate__Group_8__0__Impl4461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__Group_8__1__Impl_in_rule__Delegate__Group_8__14492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delegate__FeatureNameAssignment_8_1_in_rule__Delegate__Group_8__1__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__04553 = new BitSet(new long[]{0x0000000010D00020L});
        public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__04556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__TagsAssignment_0_in_rule__Context__Group__0__Impl4583 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__14614 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__14617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Context__Group__1__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__24676 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__24679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__LeftAssignment_2_in_rule__Context__Group__2__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__34736 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__34739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__0_in_rule__Context__Group__3__Impl4766 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__44797 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Context__Group__5_in_rule__Context__Group__44800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Context__Group__4__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__5__Impl_in_rule__Context__Group__54859 = new BitSet(new long[]{0x000000008A000030L});
        public static final BitSet FOLLOW_rule__Context__Group__6_in_rule__Context__Group__54862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__RightAssignment_5_in_rule__Context__Group__5__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__6__Impl_in_rule__Context__Group__64919 = new BitSet(new long[]{0x000000008A000030L});
        public static final BitSet FOLLOW_rule__Context__Group__7_in_rule__Context__Group__64922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__0_in_rule__Context__Group__6__Impl4949 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Context__Group__7__Impl_in_rule__Context__Group__74980 = new BitSet(new long[]{0x000000008A000030L});
        public static final BitSet FOLLOW_rule__Context__Group__8_in_rule__Context__Group__74983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ModifiersAssignment_7_in_rule__Context__Group__7__Impl5010 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Context__Group__8__Impl_in_rule__Context__Group__85041 = new BitSet(new long[]{0x000000008A000030L});
        public static final BitSet FOLLOW_rule__Context__Group__9_in_rule__Context__Group__85044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__MappingsAssignment_8_in_rule__Context__Group__8__Impl5071 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Context__Group__9__Impl_in_rule__Context__Group__95102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Context__Group__9__Impl5130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__0__Impl_in_rule__Context__Group_3__05181 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Context__Group_3__1_in_rule__Context__Group_3__05184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Context__Group_3__0__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__1__Impl_in_rule__Context__Group_3__15243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__LeftAssignment_3_1_in_rule__Context__Group_3__1__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__0__Impl_in_rule__Context__Group_6__05304 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Context__Group_6__1_in_rule__Context__Group_6__05307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Context__Group_6__0__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__1__Impl_in_rule__Context__Group_6__15366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__RightAssignment_6_1_in_rule__Context__Group_6__1__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Tag__Group__0__Impl_in_rule__Tag__Group__05427 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Tag__Group__1_in_rule__Tag__Group__05430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Tag__Group__0__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Tag__Group__1__Impl_in_rule__Tag__Group__15489 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Tag__Group__2_in_rule__Tag__Group__15492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Tag__NameAssignment_1_in_rule__Tag__Group__1__Impl5519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Tag__Group__2__Impl_in_rule__Tag__Group__25549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Tag__Group__2__Impl5577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__0__Impl_in_rule__MatchedElement__Group__05614 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__1_in_rule__MatchedElement__Group__05617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group_0__0_in_rule__MatchedElement__Group__0__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__1__Impl_in_rule__MatchedElement__Group__15675 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__2_in_rule__MatchedElement__Group__15678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__ModelAssignment_1_in_rule__MatchedElement__Group__1__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__2__Impl_in_rule__MatchedElement__Group__25735 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__3_in_rule__MatchedElement__Group__25738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MatchedElement__Group__2__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__3__Impl_in_rule__MatchedElement__Group__35797 = new BitSet(new long[]{0x0000000040001800L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__4_in_rule__MatchedElement__Group__35800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__ClassNameAssignment_3_in_rule__MatchedElement__Group__3__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__4__Impl_in_rule__MatchedElement__Group__45857 = new BitSet(new long[]{0x0000000040001800L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__5_in_rule__MatchedElement__Group__45860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__AnnotationsAssignment_4_in_rule__MatchedElement__Group__4__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group__5__Impl_in_rule__MatchedElement__Group__55918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__StrictTypeAssignment_5_in_rule__MatchedElement__Group__5__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group_0__0__Impl_in_rule__MatchedElement__Group_0__05988 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group_0__1_in_rule__MatchedElement__Group_0__05991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__NameAssignment_0_0_in_rule__MatchedElement__Group_0__0__Impl6018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatchedElement__Group_0__1__Impl_in_rule__MatchedElement__Group_0__16048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MatchedElement__Group_0__1__Impl6076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Group__0__Impl_in_rule__PotencyAnnotation__Group__06111 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Group__1_in_rule__PotencyAnnotation__Group__06114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Alternatives_0_in_rule__PotencyAnnotation__Group__0__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__Group__1__Impl_in_rule__PotencyAnnotation__Group__16171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PotencyAnnotation__ValueAssignment_1_in_rule__PotencyAnnotation__Group__1__Impl6198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LinkedBy__Group__0__Impl_in_rule__LinkedBy__Group__06232 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LinkedBy__Group__1_in_rule__LinkedBy__Group__06235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__LinkedBy__Group__0__Impl6263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LinkedBy__Group__1__Impl_in_rule__LinkedBy__Group__16294 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__LinkedBy__Group__2_in_rule__LinkedBy__Group__16297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LinkedBy__AttributeAssignment_1_in_rule__LinkedBy__Group__1__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LinkedBy__Group__2__Impl_in_rule__LinkedBy__Group__26354 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__LinkedBy__Group__3_in_rule__LinkedBy__Group__26357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__LinkedBy__Group__2__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LinkedBy__Group__3__Impl_in_rule__LinkedBy__Group__36416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LinkedBy__LinkedElementAssignment_3_in_rule__LinkedBy__Group__3__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group__0__Impl_in_rule__AttributeMapping__Group__06481 = new BitSet(new long[]{0x0000000102000000L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group__1_in_rule__AttributeMapping__Group__06484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__LeftAssignment_0_in_rule__AttributeMapping__Group__0__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group__1__Impl_in_rule__AttributeMapping__Group__16541 = new BitSet(new long[]{0x0000000102000000L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group__2_in_rule__AttributeMapping__Group__16544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group_1__0_in_rule__AttributeMapping__Group__1__Impl6571 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group__2__Impl_in_rule__AttributeMapping__Group__26602 = new BitSet(new long[]{0x0000000800006070L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group__3_in_rule__AttributeMapping__Group__26605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AttributeMapping__Group__2__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group__3__Impl_in_rule__AttributeMapping__Group__36664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__RightPartAssignment_3_in_rule__AttributeMapping__Group__3__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group_1__0__Impl_in_rule__AttributeMapping__Group_1__06729 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group_1__1_in_rule__AttributeMapping__Group_1__06732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AttributeMapping__Group_1__0__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__Group_1__1__Impl_in_rule__AttributeMapping__Group_1__16791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeMapping__LeftAssignment_1_1_in_rule__AttributeMapping__Group_1__1__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group__0__Impl_in_rule__Attribute2Attribute__Group__06852 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group__1_in_rule__Attribute2Attribute__Group__06855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__RightAssignment_0_in_rule__Attribute2Attribute__Group__0__Impl6882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group__1__Impl_in_rule__Attribute2Attribute__Group__16912 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group__2_in_rule__Attribute2Attribute__Group__16915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group_1__0_in_rule__Attribute2Attribute__Group__1__Impl6942 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group__2__Impl_in_rule__Attribute2Attribute__Group__26973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__ConverterAssignment_2_in_rule__Attribute2Attribute__Group__2__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group_1__0__Impl_in_rule__Attribute2Attribute__Group_1__07037 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group_1__1_in_rule__Attribute2Attribute__Group_1__07040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Attribute2Attribute__Group_1__0__Impl7068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__Group_1__1__Impl_in_rule__Attribute2Attribute__Group_1__17099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute2Attribute__RightAssignment_1_1_in_rule__Attribute2Attribute__Group_1__1__Impl7126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group__0__Impl_in_rule__AttributeRef__Group__07160 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group__1_in_rule__AttributeRef__Group__07163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group_0__0_in_rule__AttributeRef__Group__0__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group__1__Impl_in_rule__AttributeRef__Group__17221 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group__2_in_rule__AttributeRef__Group__17224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__FeatureNameAssignment_1_in_rule__AttributeRef__Group__1__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group__2__Impl_in_rule__AttributeRef__Group__27281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__MultivaluedAssignment_2_in_rule__AttributeRef__Group__2__Impl7308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group_0__0__Impl_in_rule__AttributeRef__Group_0__07345 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group_0__1_in_rule__AttributeRef__Group_0__07348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__ReferredElementAssignment_0_0_in_rule__AttributeRef__Group_0__0__Impl7375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeRef__Group_0__1__Impl_in_rule__AttributeRef__Group_0__17405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AttributeRef__Group_0__1__Impl7433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__0__Impl_in_rule__Reference2Reference__Group__07468 = new BitSet(new long[]{0x0000000202000000L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__1_in_rule__Reference2Reference__Group__07471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__LeftAssignment_0_in_rule__Reference2Reference__Group__0__Impl7498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__1__Impl_in_rule__Reference2Reference__Group__17528 = new BitSet(new long[]{0x0000000202000000L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__2_in_rule__Reference2Reference__Group__17531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group_1__0_in_rule__Reference2Reference__Group__1__Impl7558 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__2__Impl_in_rule__Reference2Reference__Group__27589 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__3_in_rule__Reference2Reference__Group__27592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Reference2Reference__Group__2__Impl7620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__3__Impl_in_rule__Reference2Reference__Group__37651 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__4_in_rule__Reference2Reference__Group__37654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__RightAssignment_3_in_rule__Reference2Reference__Group__3__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__4__Impl_in_rule__Reference2Reference__Group__47711 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__5_in_rule__Reference2Reference__Group__47714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group_4__0_in_rule__Reference2Reference__Group__4__Impl7741 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group__5__Impl_in_rule__Reference2Reference__Group__57772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__ConverterAssignment_5_in_rule__Reference2Reference__Group__5__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group_1__0__Impl_in_rule__Reference2Reference__Group_1__07842 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group_1__1_in_rule__Reference2Reference__Group_1__07845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Reference2Reference__Group_1__0__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group_1__1__Impl_in_rule__Reference2Reference__Group_1__17904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__LeftAssignment_1_1_in_rule__Reference2Reference__Group_1__1__Impl7931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group_4__0__Impl_in_rule__Reference2Reference__Group_4__07965 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group_4__1_in_rule__Reference2Reference__Group_4__07968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Reference2Reference__Group_4__0__Impl7996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__Group_4__1__Impl_in_rule__Reference2Reference__Group_4__18027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference2Reference__RightAssignment_4_1_in_rule__Reference2Reference__Group_4__1__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group__0__Impl_in_rule__ReferenceRef__Group__08088 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group__1_in_rule__ReferenceRef__Group__08091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group_0__0_in_rule__ReferenceRef__Group__0__Impl8118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group__1__Impl_in_rule__ReferenceRef__Group__18149 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group__2_in_rule__ReferenceRef__Group__18152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__FeatureNameAssignment_1_in_rule__ReferenceRef__Group__1__Impl8179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group__2__Impl_in_rule__ReferenceRef__Group__28209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__MultivaluedAssignment_2_in_rule__ReferenceRef__Group__2__Impl8236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group_0__0__Impl_in_rule__ReferenceRef__Group_0__08273 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group_0__1_in_rule__ReferenceRef__Group_0__08276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__ReferredElementAssignment_0_0_in_rule__ReferenceRef__Group_0__0__Impl8303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReferenceRef__Group_0__1__Impl_in_rule__ReferenceRef__Group_0__18333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ReferenceRef__Group_0__1__Impl8361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__Group__0__Impl_in_rule__Converter__Group__08396 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Converter__Group__1_in_rule__Converter__Group__08399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Converter__Group__0__Impl8427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__Group__1__Impl_in_rule__Converter__Group__18458 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Converter__Group__2_in_rule__Converter__Group__18461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__Group_1__0_in_rule__Converter__Group__1__Impl8488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__Group__2__Impl_in_rule__Converter__Group__28519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__ConverterNameAssignment_2_in_rule__Converter__Group__2__Impl8546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__Group_1__0__Impl_in_rule__Converter__Group_1__08582 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Converter__Group_1__1_in_rule__Converter__Group_1__08585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__ModuleAssignment_1_0_in_rule__Converter__Group_1__0__Impl8612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__Group_1__1__Impl_in_rule__Converter__Group_1__18642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Converter__IsExternalAssignment_1_1_in_rule__Converter__Group_1__1__Impl8669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__08703 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__08706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl8733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__18762 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__18765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__EDouble__Group__1__Impl8793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__28824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl8851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08886 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__EInt__Group__0__Impl8918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MappingTransformation__NameAssignment_19016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__InModelsAssignment_39047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_rule__MappingTransformation__OutModelsAssignment_79078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__MappingTransformation__AnnotationsAssignment_99109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUsesStatements_in_rule__MappingTransformation__UsesAssignment_109140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelegate_in_rule__MappingTransformation__DelegatesAssignment_119171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_rule__MappingTransformation__ContextsAssignment_129202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetamodelModelAnnotation__AnnotatedElementAssignment_09237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__MetamodelModelAnnotation__MetamodelAssignment_29272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UseDeclaration__ModuleAssignment_19303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UseDeclaration__AsAssignment_2_19334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TransformationDefinitionParameter__NameAssignment_19365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTag_in_rule__Delegate__TagsAssignment_09396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_rule__Delegate__LeftAssignment_39427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_rule__Delegate__LeftAssignment_4_19458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Delegate__ModuleAssignment_6_09493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Delegate__IsExternalAssignment_6_19533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Delegate__LinkNameAssignment_79572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Delegate__FeatureNameAssignment_8_19603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTag_in_rule__Context__TagsAssignment_09634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_rule__Context__LeftAssignment_29665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_rule__Context__LeftAssignment_3_19696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_rule__Context__RightAssignment_59727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_rule__Context__RightAssignment_6_19758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleC2CModifier_in_rule__Context__ModifiersAssignment_79789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__MappingsAlternatives_8_0_in_rule__Context__MappingsAssignment_89820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Tag__NameAssignment_19853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchedElement__NameAssignment_0_09884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchedElement__ModelAssignment_19919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MatchedElement__ClassNameAssignment_39954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_rule__MatchedElement__AnnotationsAssignment_49985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MatchedElement__StrictTypeAssignment_510021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__PotencyAnnotation__ValueAssignment_110060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_rule__LinkedBy__AttributeAssignment_110091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LinkedBy__LinkedElementAssignment_310126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_rule__AttributeMapping__LeftAssignment_010161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_rule__AttributeMapping__LeftAssignment_1_110192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRightPart_in_rule__AttributeMapping__RightPartAssignment_310223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_rule__Attribute2Attribute__RightAssignment_010254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_rule__Attribute2Attribute__RightAssignment_1_110285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConverter_in_rule__Attribute2Attribute__ConverterAssignment_210316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrictString_in_rule__AttributeIsString__StrValueAssignment10347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__AttributeIsBoolean__BoolValueAssignment10378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__AttributeIsDouble__DoubleValueAssignment10409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__AttributeIsInteger__IntValueAssignment10440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeRef__ReferredElementAssignment_0_010475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AttributeRef__FeatureNameAssignment_110510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__AttributeRef__MultivaluedAssignment_210546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_rule__Reference2Reference__LeftAssignment_010585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_rule__Reference2Reference__LeftAssignment_1_110616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_rule__Reference2Reference__RightAssignment_310647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_rule__Reference2Reference__RightAssignment_4_110678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConverter_in_rule__Reference2Reference__ConverterAssignment_510709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceRef__ReferredElementAssignment_0_010744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ReferenceRef__FeatureNameAssignment_110779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ReferenceRef__MultivaluedAssignment_210815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Converter__ModuleAssignment_1_010858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Converter__IsExternalAssignment_1_110898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Converter__ConverterNameAssignment_210937 = new BitSet(new long[]{0x0000000000000002L});
    }


}