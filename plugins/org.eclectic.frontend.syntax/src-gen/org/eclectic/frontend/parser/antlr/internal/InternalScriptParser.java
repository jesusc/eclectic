package org.eclectic.frontend.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclectic.frontend.services.ScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_KEYWORD_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'script'", "'('", "')'", "'->'", "'link'", "'{'", "';'", "'}'", "'end'", "':'", "'var'", "'!'", "'.'", "'='", "'|'", "','", "'match'", "'with'", "'['", "']'", "'put'", "'-'", "'+'", "'*'", "'/'"
    };
    public static final int RULE_KEYWORD_ID=7;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g"; }



     	private ScriptGrammarAccess grammarAccess;
     	
        public InternalScriptParser(TokenStream input, ScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ScriptedTransformation";	
       	}
       	
       	@Override
       	protected ScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScriptedTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:68:1: entryRuleScriptedTransformation returns [EObject current=null] : iv_ruleScriptedTransformation= ruleScriptedTransformation EOF ;
    public final EObject entryRuleScriptedTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptedTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:69:2: (iv_ruleScriptedTransformation= ruleScriptedTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:70:2: iv_ruleScriptedTransformation= ruleScriptedTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptedTransformationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleScriptedTransformation_in_entryRuleScriptedTransformation75);
            iv_ruleScriptedTransformation=ruleScriptedTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScriptedTransformation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScriptedTransformation85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScriptedTransformation"


    // $ANTLR start "ruleScriptedTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:77:1: ruleScriptedTransformation returns [EObject current=null] : (otherlv_0= 'script' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_statements_9_0= ruleStatement ) )+ ) ;
    public final EObject ruleScriptedTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inModels_3_0 = null;

        EObject lv_outModels_7_0 = null;

        EObject lv_statements_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:80:28: ( (otherlv_0= 'script' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_statements_9_0= ruleStatement ) )+ ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:81:1: (otherlv_0= 'script' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_statements_9_0= ruleStatement ) )+ )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:81:1: (otherlv_0= 'script' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_statements_9_0= ruleStatement ) )+ )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:81:3: otherlv_0= 'script' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_statements_9_0= ruleStatement ) )+
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleScriptedTransformation122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getScriptedTransformationAccess().getScriptKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:86:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:87:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScriptedTransformationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScriptedTransformation143);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScriptedTransformationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScriptedTransformation155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScriptedTransformationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:107:1: ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:108:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:108:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:109:3: lv_inModels_3_0= ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScriptedTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleScriptedTransformation176);
            lv_inModels_3_0=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScriptedTransformationRule());
              	        }
                     		add(
                     			current, 
                     			"inModels",
                      		lv_inModels_3_0, 
                      		"TransformationDefinitionParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScriptedTransformation188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getScriptedTransformationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScriptedTransformation200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getScriptedTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScriptedTransformation212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getScriptedTransformationAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:137:1: ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:138:1: (lv_outModels_7_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:138:1: (lv_outModels_7_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:139:3: lv_outModels_7_0= ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScriptedTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleScriptedTransformation233);
            lv_outModels_7_0=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScriptedTransformationRule());
              	        }
                     		add(
                     			current, 
                     			"outModels",
                      		lv_outModels_7_0, 
                      		"TransformationDefinitionParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScriptedTransformation245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getScriptedTransformationAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:159:1: ( (lv_statements_9_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==13||LA1_0==17||LA1_0==28||(LA1_0>=32 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:160:1: (lv_statements_9_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:160:1: (lv_statements_9_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:161:3: lv_statements_9_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptedTransformationAccess().getStatementsStatementParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleScriptedTransformation266);
            	    lv_statements_9_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptedTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_9_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScriptedTransformation"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:185:1: entryRuleTransformationDefinitionParameter returns [EObject current=null] : iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF ;
    public final EObject entryRuleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationDefinitionParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:186:2: (iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:187:2: iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationDefinitionParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter303);
            iv_ruleTransformationDefinitionParameter=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformationDefinitionParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter313); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformationDefinitionParameter"


    // $ANTLR start "ruleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:194:1: ruleTransformationDefinitionParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:197:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:198:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:198:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:198:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:198:2: ()
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:199:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0(),
                          current);
                  
            }

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:204:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:205:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:205:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:206:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter368);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransformationDefinitionParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformationDefinitionParameter"


    // $ANTLR start "entryRuleTraceDefinition"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:232:1: entryRuleTraceDefinition returns [EObject current=null] : iv_ruleTraceDefinition= ruleTraceDefinition EOF ;
    public final EObject entryRuleTraceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceDefinition = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:233:2: (iv_ruleTraceDefinition= ruleTraceDefinition EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:234:2: iv_ruleTraceDefinition= ruleTraceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition406);
            iv_ruleTraceDefinition=ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceDefinition416); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceDefinition"


    // $ANTLR start "ruleTraceDefinition"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:241:1: ruleTraceDefinition returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) ;
    public final EObject ruleTraceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_elements_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:244:28: ( (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:245:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:245:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:245:3: otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTraceDefinition453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:249:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:250:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:250:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:251:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceDefinition474);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTraceDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:267:2: ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:267:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:267:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:267:5: otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTraceDefinition488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:271:1: ( (lv_elements_3_0= ruleTraceElementInline ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:272:1: (lv_elements_3_0= ruleTraceElementInline )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:272:1: (lv_elements_3_0= ruleTraceElementInline )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:273:3: lv_elements_3_0= ruleTraceElementInline
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition509);
                    lv_elements_3_0=ruleTraceElementInline();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTraceDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_3_0, 
                              		"TraceElementInline");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:289:2: (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==18) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:289:4: otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTraceDefinition522); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:293:1: ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:294:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:294:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:295:3: lv_elements_5_0= ruleTraceElementInline
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition543);
                    	    lv_elements_5_0=ruleTraceElementInline();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTraceDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_5_0, 
                    	              		"TraceElementInline");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTraceDefinition557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:316:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:316:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:316:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:316:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:317:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:317:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:318:3: lv_elements_7_0= ruleTraceElementExpanded
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition586);
                    lv_elements_7_0=ruleTraceElementExpanded();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTraceDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_7_0, 
                              		"TraceElementExpanded");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:334:2: ( (lv_elements_8_0= ruleTraceElementExpanded ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:335:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:335:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:336:3: lv_elements_8_0= ruleTraceElementExpanded
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition607);
                    	    lv_elements_8_0=ruleTraceElementExpanded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTraceDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_8_0, 
                    	              		"TraceElementExpanded");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTraceDefinition620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTraceDefinitionAccess().getEndKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceDefinition"


    // $ANTLR start "entryRuleTraceElementInline"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:364:1: entryRuleTraceElementInline returns [EObject current=null] : iv_ruleTraceElementInline= ruleTraceElementInline EOF ;
    public final EObject entryRuleTraceElementInline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementInline = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:365:2: (iv_ruleTraceElementInline= ruleTraceElementInline EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:366:2: iv_ruleTraceElementInline= ruleTraceElementInline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline658);
            iv_ruleTraceElementInline=ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementInline; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementInline668); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceElementInline"


    // $ANTLR start "ruleTraceElementInline"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:373:1: ruleTraceElementInline returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementInline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:376:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:377:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:377:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:377:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:377:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:378:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:378:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:379:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementInline714);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTraceElementInlineRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTraceElementInline726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceElementInlineAccess().getColonKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:399:1: ( (lv_type_2_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:400:1: (lv_type_2_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:400:1: (lv_type_2_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:401:3: lv_type_2_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementInline747);
            lv_type_2_0=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTraceElementInlineRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"TypeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceElementInline"


    // $ANTLR start "entryRuleTraceElementExpanded"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:425:1: entryRuleTraceElementExpanded returns [EObject current=null] : iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF ;
    public final EObject entryRuleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementExpanded = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:426:2: (iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:427:2: iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded783);
            iv_ruleTraceElementExpanded=ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementExpanded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementExpanded793); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceElementExpanded"


    // $ANTLR start "ruleTraceElementExpanded"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:434:1: ruleTraceElementExpanded returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:437:28: ( (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:438:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:438:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:438:3: otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTraceElementExpanded830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:442:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:443:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:443:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:444:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementExpanded851);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTraceElementExpandedRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTraceElementExpanded863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:464:1: ( (lv_type_3_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:465:1: (lv_type_3_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:465:1: (lv_type_3_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:466:3: lv_type_3_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded884);
            lv_type_3_0=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTraceElementExpandedRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"TypeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceElementExpanded"


    // $ANTLR start "entryRuleTypeExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:490:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:491:2: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:492:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression920);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpression930); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:499:1: ruleTypeExpression returns [EObject current=null] : this_ClassUse_0= ruleClassUse ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassUse_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:502:28: (this_ClassUse_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:504:5: this_ClassUse_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTypeExpression976);
            this_ClassUse_0=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ClassUse_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleClassUse"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:520:1: entryRuleClassUse returns [EObject current=null] : iv_ruleClassUse= ruleClassUse EOF ;
    public final EObject entryRuleClassUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUse = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:521:2: (iv_ruleClassUse= ruleClassUse EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:522:2: iv_ruleClassUse= ruleClassUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassUseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_entryRuleClassUse1010);
            iv_ruleClassUse=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassUse; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassUse1020); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassUse"


    // $ANTLR start "ruleClassUse"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:529:1: ruleClassUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ) ;
    public final EObject ruleClassUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:532:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:533:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:533:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:533:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:533:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:534:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:534:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:535:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassUseRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse1065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleClassUse1077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:550:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:551:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:551:1: (lv_className_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:552:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse1094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_className_2_0, grammarAccess.getClassUseAccess().getClassNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassUseRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"className",
                      		lv_className_2_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassUse"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:576:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:577:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:578:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement1135);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement1145); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:585:1: ruleStatement returns [EObject current=null] : (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DefineVariable_0 = null;

        EObject this_Expression_1 = null;

        EObject this_PutTraceExpression_2 = null;

        EObject this_PropertyWrite_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:588:28: ( (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:589:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:589:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==25) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||(LA5_1>=RULE_ID && LA5_1<=RULE_STRING)||LA5_1==13||LA5_1==17||LA5_1==19||LA5_1==24||LA5_1==28||(LA5_1>=32 && LA5_1<=36)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    int LA5_6 = input.LA(3);

                    if ( (LA5_6==RULE_ID) ) {
                        int LA5_7 = input.LA(4);

                        if ( (LA5_7==EOF||(LA5_7>=RULE_ID && LA5_7<=RULE_STRING)||LA5_7==13||LA5_7==17||LA5_7==19||LA5_7==24||LA5_7==28||(LA5_7>=32 && LA5_7<=33)) ) {
                            alt5=2;
                        }
                        else if ( (LA5_7==25) ) {
                            alt5=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_6==RULE_STRING) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case 13:
                case 17:
                case 19:
                case 23:
                case 28:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    {
                    alt5=2;
                    }
                    break;
                case 25:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INT:
            case 13:
            case 17:
            case 28:
            case 33:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:590:5: this_DefineVariable_0= ruleDefineVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_ruleStatement1192);
                    this_DefineVariable_0=ruleDefineVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefineVariable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:600:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleStatement1219);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:610:5: this_PutTraceExpression_2= rulePutTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPutTraceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_ruleStatement1246);
                    this_PutTraceExpression_2=rulePutTraceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PutTraceExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:620:5: this_PropertyWrite_3= rulePropertyWrite
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPropertyWriteParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_ruleStatement1273);
                    this_PropertyWrite_3=rulePropertyWrite();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyWrite_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePropertyWrite"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:636:1: entryRulePropertyWrite returns [EObject current=null] : iv_rulePropertyWrite= rulePropertyWrite EOF ;
    public final EObject entryRulePropertyWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyWrite = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:637:2: (iv_rulePropertyWrite= rulePropertyWrite EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:638:2: iv_rulePropertyWrite= rulePropertyWrite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyWriteRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite1308);
            iv_rulePropertyWrite=rulePropertyWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyWrite; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyWrite1318); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyWrite"


    // $ANTLR start "rulePropertyWrite"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:645:1: rulePropertyWrite returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:648:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:649:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:649:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:649:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:649:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:650:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:650:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:651:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyWriteRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyWrite1363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyWriteAccess().getReceptorVariableCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePropertyWrite1375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyWriteAccess().getFullStopKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:666:1: ( (lv_property_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:667:1: (lv_property_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:667:1: (lv_property_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:668:3: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyWrite1392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_property_2_0, grammarAccess.getPropertyWriteAccess().getPropertyIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyWriteRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"property",
                      		lv_property_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePropertyWrite1409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyWriteAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:688:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:689:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:689:1: (lv_expression_4_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:690:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyWriteAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePropertyWrite1430);
            lv_expression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyWriteRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyWrite"


    // $ANTLR start "entryRuleDefineVariable"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:714:1: entryRuleDefineVariable returns [EObject current=null] : iv_ruleDefineVariable= ruleDefineVariable EOF ;
    public final EObject entryRuleDefineVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineVariable = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:715:2: (iv_ruleDefineVariable= ruleDefineVariable EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:716:2: iv_ruleDefineVariable= ruleDefineVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable1466);
            iv_ruleDefineVariable=ruleDefineVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefineVariable1476); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineVariable"


    // $ANTLR start "ruleDefineVariable"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:723:1: ruleDefineVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDefineVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:726:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:727:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:727:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:727:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:727:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:728:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:728:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:729:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDefineVariable1522);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefineVariableRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDefineVariable1534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:749:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:750:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:750:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:751:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDefineVariable1555);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefineVariableRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineVariable"


    // $ANTLR start "entryRuleModelReference"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:775:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:776:2: (iv_ruleModelReference= ruleModelReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:777:2: iv_ruleModelReference= ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_entryRuleModelReference1591);
            iv_ruleModelReference=ruleModelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelReference1601); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelReference"


    // $ANTLR start "ruleModelReference"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:784:1: ruleModelReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:787:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:788:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:788:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:788:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:788:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:789:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:789:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:790:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModelReference1646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleModelReference1658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:805:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:806:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:806:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:807:3: lv_className_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelReference1679);
            lv_className_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"className",
                      		lv_className_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelReference"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:831:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:832:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:833:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1715);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:840:1: ruleExpression returns [EObject current=null] : this_MethodCall_0= ruleMethodCall ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MethodCall_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:843:28: (this_MethodCall_0= ruleMethodCall )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:845:5: this_MethodCall_0= ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_ruleExpression1771);
            this_MethodCall_0=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MethodCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:861:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:862:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:863:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1805);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression1815); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:870:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_VariableReference_1 = null;

        EObject this_ModelReference_2 = null;

        EObject this_ParenthesizedExpression_3 = null;

        EObject this_MatchTraceExpression_4 = null;

        EObject this_ClosureDeclaration_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:873:28: ( (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:874:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:874:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 33:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==EOF||(LA6_2>=RULE_ID && LA6_2<=RULE_STRING)||(LA6_2>=13 && LA6_2<=14)||LA6_2==17||LA6_2==19||LA6_2==24||(LA6_2>=27 && LA6_2<=28)||(LA6_2>=31 && LA6_2<=36)) ) {
                    alt6=2;
                }
                else if ( (LA6_2==23) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 17:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:875:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression1862);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:885:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rulePrimaryExpression1889);
                    this_VariableReference_1=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:895:5: this_ModelReference_2= ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_rulePrimaryExpression1916);
                    this_ModelReference_2=ruleModelReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ModelReference_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:905:5: this_ParenthesizedExpression_3= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression1943);
                    this_ParenthesizedExpression_3=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:915:5: this_MatchTraceExpression_4= ruleMatchTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression1970);
                    this_MatchTraceExpression_4=ruleMatchTraceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MatchTraceExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:925:5: this_ClosureDeclaration_5= ruleClosureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression1997);
                    this_ClosureDeclaration_5=ruleClosureDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClosureDeclaration_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:941:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:942:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:943:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression2032);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedExpression2042); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:950:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:953:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:954:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:954:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:954:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParenthesizedExpression2079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParenthesizedExpression2101);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParenthesizedExpression2112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:979:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:980:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:981:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral2148);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral2158); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:988:1: ruleLiteral returns [EObject current=null] : (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_FloatLiteral_0 = null;

        EObject this_NumLiteral_1 = null;

        EObject this_StringLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:991:28: ( (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:992:1: (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:992:1: (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=RULE_ID && LA7_1<=RULE_STRING)||(LA7_1>=13 && LA7_1<=14)||LA7_1==17||LA7_1==19||(LA7_1>=27 && LA7_1<=28)||(LA7_1>=31 && LA7_1<=36)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==24) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==RULE_ID||LA7_4==RULE_STRING) ) {
                        alt7=2;
                    }
                    else if ( (LA7_4==RULE_INT) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:993:5: this_FloatLiteral_0= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_ruleLiteral2205);
                    this_FloatLiteral_0=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1003:5: this_NumLiteral_1= ruleNumLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_ruleLiteral2232);
                    this_NumLiteral_1=ruleNumLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1013:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleLiteral2259);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1029:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1030:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1031:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference2294);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference2304); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1038:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1041:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1042:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1042:1: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1043:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1043:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1044:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableReference2348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleClosureDeclaration"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1063:1: entryRuleClosureDeclaration returns [EObject current=null] : iv_ruleClosureDeclaration= ruleClosureDeclaration EOF ;
    public final EObject entryRuleClosureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureDeclaration = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1064:2: (iv_ruleClosureDeclaration= ruleClosureDeclaration EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1065:2: iv_ruleClosureDeclaration= ruleClosureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration2383);
            iv_ruleClosureDeclaration=ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureDeclaration2393); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClosureDeclaration"


    // $ANTLR start "ruleClosureDeclaration"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1072:1: ruleClosureDeclaration returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) ;
    public final EObject ruleClosureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1075:28: ( (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1076:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1076:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1076:3: otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClosureDeclaration2430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1080:1: (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1080:3: otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleClosureDeclaration2443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1084:1: ( (lv_formalParameters_2_0= ruleClosureParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1085:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1085:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1086:3: lv_formalParameters_2_0= ruleClosureParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2464);
                    lv_formalParameters_2_0=ruleClosureParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClosureDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"ClosureParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1102:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==27) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1102:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleClosureDeclaration2477); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1106:1: ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1107:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1107:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1108:3: lv_formalParameters_4_0= ruleClosureParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2498);
                    	    lv_formalParameters_4_0=ruleClosureParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClosureDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"ClosureParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleClosureDeclaration2512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1128:3: ( (lv_statements_6_0= ruleStatement ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==13||LA10_0==17||LA10_0==28||(LA10_0>=32 && LA10_0<=33)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1129:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1129:1: (lv_statements_6_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1130:3: lv_statements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleClosureDeclaration2535);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClosureDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleClosureDeclaration2548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getClosureDeclarationAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClosureDeclaration"


    // $ANTLR start "entryRuleClosureParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1158:1: entryRuleClosureParameter returns [EObject current=null] : iv_ruleClosureParameter= ruleClosureParameter EOF ;
    public final EObject entryRuleClosureParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1159:2: (iv_ruleClosureParameter= ruleClosureParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1160:2: iv_ruleClosureParameter= ruleClosureParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter2584);
            iv_ruleClosureParameter=ruleClosureParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureParameter2594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClosureParameter"


    // $ANTLR start "ruleClosureParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1167:1: ruleClosureParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClosureParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1170:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1171:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1171:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1172:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1172:1: (lv_name_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1173:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClosureParameter2635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getClosureParameterAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClosureParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClosureParameter"


    // $ANTLR start "entryRuleMethodCall"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1197:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1198:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1199:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_entryRuleMethodCall2675);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodCall2685); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1206:1: ruleMethodCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token lv_withParameters_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_binaryOp_2_0 = null;

        EObject lv_right_3_0 = null;

        AntlrDatatypeRuleToken lv_methodName_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_parameters_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1209:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1210:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1210:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1211:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleMethodCall2732);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1219:1: ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )?
            int alt15=3;
            switch ( input.LA(1) ) {
                case 34:
                case 35:
                case 36:
                    {
                    alt15=1;
                    }
                    break;
                case 33:
                    {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=RULE_ID && LA15_2<=RULE_STRING)||LA15_2==13||LA15_2==17||LA15_2==28||LA15_2==33) ) {
                        alt15=1;
                    }
                    }
                    break;
                case 24:
                    {
                    alt15=2;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1219:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1219:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1219:3: () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1219:3: ()
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1220:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getMethodCallAccess().getBinaryExprLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1225:2: ( (lv_binaryOp_2_0= ruleBinaryOp ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1226:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1226:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1227:3: lv_binaryOp_2_0= ruleBinaryOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOp_in_ruleMethodCall2763);
                    lv_binaryOp_2_0=ruleBinaryOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                      	        }
                             		set(
                             			current, 
                             			"binaryOp",
                              		lv_binaryOp_2_0, 
                              		"BinaryOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1243:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1244:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1244:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1245:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall2784);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1262:6: ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1262:6: ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) && (synpred1_InternalScript())) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1262:7: ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )?
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1262:7: ( ( () )=> () )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1262:8: ( () )=> ()
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1263:5: ()
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1264:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getMethodCallAccess().getMethodCallReceptorAction_1_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMethodCall2821); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getMethodCallAccess().getFullStopKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1273:1: ( (lv_methodName_6_0= ruleEString ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1274:1: (lv_methodName_6_0= ruleEString )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1274:1: (lv_methodName_6_0= ruleEString )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1275:3: lv_methodName_6_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMethodCall2842);
                    	    lv_methodName_6_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"methodName",
                    	              		lv_methodName_6_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1291:2: ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?
                    	    int alt12=2;
                    	    alt12 = dfa12.predict(input);
                    	    switch (alt12) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1291:3: ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')'
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1291:3: ( (lv_withParameters_7_0= '(' ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1292:1: (lv_withParameters_7_0= '(' )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1292:1: (lv_withParameters_7_0= '(' )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1293:3: lv_withParameters_7_0= '('
                    	            {
                    	            lv_withParameters_7_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMethodCall2861); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_withParameters_7_0, grammarAccess.getMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_3_0_0());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getMethodCallRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "withParameters", true, "(");
                    	              	    
                    	            }

                    	            }


                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1306:2: ( (lv_parameters_8_0= ruleExpression ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1307:1: (lv_parameters_8_0= ruleExpression )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1307:1: (lv_parameters_8_0= ruleExpression )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1308:3: lv_parameters_8_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall2895);
                    	            lv_parameters_8_0=ruleExpression();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"parameters",
                    	                      		lv_parameters_8_0, 
                    	                      		"Expression");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1324:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )*
                    	            loop11:
                    	            do {
                    	                int alt11=2;
                    	                int LA11_0 = input.LA(1);

                    	                if ( (LA11_0==27) ) {
                    	                    alt11=1;
                    	                }


                    	                switch (alt11) {
                    	            	case 1 :
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1324:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) )
                    	            	    {
                    	            	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMethodCall2908); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	          	newLeafNode(otherlv_9, grammarAccess.getMethodCallAccess().getCommaKeyword_1_1_3_2_0());
                    	            	          
                    	            	    }
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1328:1: ( (lv_parameters_10_0= ruleExpression ) )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1329:1: (lv_parameters_10_0= ruleExpression )
                    	            	    {
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1329:1: (lv_parameters_10_0= ruleExpression )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1330:3: lv_parameters_10_0= ruleExpression
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {
                    	            	       
                    	            	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_2_1_0()); 
                    	            	      	    
                    	            	    }
                    	            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall2929);
                    	            	    lv_parameters_10_0=ruleExpression();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      	        if (current==null) {
                    	            	      	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	            	      	        }
                    	            	             		add(
                    	            	             			current, 
                    	            	             			"parameters",
                    	            	              		lv_parameters_10_0, 
                    	            	              		"Expression");
                    	            	      	        afterParserOrEnumRuleCall();
                    	            	      	    
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop11;
                    	                }
                    	            } while (true);

                    	            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMethodCall2943); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_11, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_1_3_3());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1350:3: ( (lv_parameters_12_0= ruleClosureDeclaration ) )?
                    	    int alt13=2;
                    	    alt13 = dfa13.predict(input);
                    	    switch (alt13) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1351:1: (lv_parameters_12_0= ruleClosureDeclaration )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1351:1: (lv_parameters_12_0= ruleClosureDeclaration )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1352:3: lv_parameters_12_0= ruleClosureDeclaration
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersClosureDeclarationParserRuleCall_1_1_4_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_ruleMethodCall2966);
                    	            lv_parameters_12_0=ruleClosureDeclaration();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"parameters",
                    	                      		lv_parameters_12_0, 
                    	                      		"ClosureDeclaration");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleMatchTraceExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1380:1: entryRuleMatchTraceExpression returns [EObject current=null] : iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF ;
    public final EObject entryRuleMatchTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1381:2: (iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1382:2: iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression3011);
            iv_ruleMatchTraceExpression=ruleMatchTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchTraceExpression3021); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatchTraceExpression"


    // $ANTLR start "ruleMatchTraceExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1389:1: ruleMatchTraceExpression returns [EObject current=null] : (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) ;
    public final EObject ruleMatchTraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_traceExpr_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1392:28: ( (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1393:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1393:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1393:3: otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMatchTraceExpression3058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1397:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==23) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1397:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression3070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMatchTraceExpression3081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1405:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1406:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1406:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1407:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMatchTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression3103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMatchTraceExpression3115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMatchTraceExpression3127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1426:1: ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1427:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1427:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1428:3: lv_traceExpr_6_0= ruleTraceExprLanguage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression3148);
            lv_traceExpr_6_0=ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMatchTraceExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"traceExpr",
                      		lv_traceExpr_6_0, 
                      		"TraceExprLanguage");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMatchTraceExpression3160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMatchTraceExpressionAccess().getRightSquareBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatchTraceExpression"


    // $ANTLR start "entryRuleTraceExprLanguage"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1456:1: entryRuleTraceExprLanguage returns [EObject current=null] : iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF ;
    public final EObject entryRuleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExprLanguage = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1457:2: (iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1458:2: iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceExprLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage3196);
            iv_ruleTraceExprLanguage=ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceExprLanguage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceExprLanguage3206); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceExprLanguage"


    // $ANTLR start "ruleTraceExprLanguage"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1465:1: ruleTraceExprLanguage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1468:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1469:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1469:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1469:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1469:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1470:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1470:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1471:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTraceExprLanguageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraceExprLanguage3251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTraceExprLanguage3263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1486:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1487:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1487:1: (lv_expr_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1488:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTraceExprLanguage3284);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTraceExprLanguageRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceExprLanguage"


    // $ANTLR start "entryRulePutTraceExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1512:1: entryRulePutTraceExpression returns [EObject current=null] : iv_rulePutTraceExpression= rulePutTraceExpression EOF ;
    public final EObject entryRulePutTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1513:2: (iv_rulePutTraceExpression= rulePutTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1514:2: iv_rulePutTraceExpression= rulePutTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression3320);
            iv_rulePutTraceExpression=rulePutTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceExpression3330); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePutTraceExpression"


    // $ANTLR start "rulePutTraceExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1521:1: rulePutTraceExpression returns [EObject current=null] : (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' ) ;
    public final EObject rulePutTraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1524:28: ( (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1525:1: (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1525:1: (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1525:3: otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePutTraceExpression3367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPutTraceExpressionAccess().getPutKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1529:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==23) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1529:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceExpression3379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getPutTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePutTraceExpression3390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPutTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1537:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1538:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1538:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1539:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceExpression3412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulePutTraceExpression3424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPutTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePutTraceExpression3436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPutTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1558:1: ( (lv_parameters_6_0= rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1559:1: (lv_parameters_6_0= rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1559:1: (lv_parameters_6_0= rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1560:3: lv_parameters_6_0= rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3457);
            lv_parameters_6_0=rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPutTraceExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"parameters",
                      		lv_parameters_6_0, 
                      		"PutTraceParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1576:2: (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1576:4: otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePutTraceExpression3470); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getPutTraceExpressionAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1580:1: ( (lv_parameters_8_0= rulePutTraceParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1581:1: (lv_parameters_8_0= rulePutTraceParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1581:1: (lv_parameters_8_0= rulePutTraceParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1582:3: lv_parameters_8_0= rulePutTraceParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3491);
            	    lv_parameters_8_0=rulePutTraceParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPutTraceExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_8_0, 
            	              		"PutTraceParameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePutTraceExpression3505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPutTraceExpressionAccess().getRightSquareBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePutTraceExpression"


    // $ANTLR start "entryRulePutTraceParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1610:1: entryRulePutTraceParameter returns [EObject current=null] : iv_rulePutTraceParameter= rulePutTraceParameter EOF ;
    public final EObject entryRulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1611:2: (iv_rulePutTraceParameter= rulePutTraceParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1612:2: iv_rulePutTraceParameter= rulePutTraceParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter3541);
            iv_rulePutTraceParameter=rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceParameter3551); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePutTraceParameter"


    // $ANTLR start "rulePutTraceParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1619:1: rulePutTraceParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1622:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1623:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1623:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1623:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1623:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1624:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1624:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1625:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceParameterRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceParameter3596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePutTraceParameter3608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1640:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1641:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1641:1: (lv_value_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1642:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePutTraceParameter3629);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPutTraceParameterRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePutTraceParameter"


    // $ANTLR start "entryRuleNumLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1666:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1667:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1668:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral3665);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumLiteral3675); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumLiteral"


    // $ANTLR start "ruleNumLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1675:1: ruleNumLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1678:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1679:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1679:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1680:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1680:1: (lv_value_0_0= ruleEInt )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1681:3: lv_value_0_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumLiteral3720);
            lv_value_0_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1705:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1706:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1707:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral3755);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatLiteral3765); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1714:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1717:28: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1718:1: ( (lv_value_0_0= ruleEDouble ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1718:1: ( (lv_value_0_0= ruleEDouble ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1719:1: (lv_value_0_0= ruleEDouble )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1719:1: (lv_value_0_0= ruleEDouble )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1720:3: lv_value_0_0= ruleEDouble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFloatLiteralAccess().getValueEDoubleParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleFloatLiteral3810);
            lv_value_0_0=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFloatLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"EDouble");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleEDouble"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1744:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1745:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1746:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble3846);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble3857); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1753:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1756:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1757:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1757:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1757:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble3897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDouble3915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble3930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1785:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1786:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1787:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3975);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral3985); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1794:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1797:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1798:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1798:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1799:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1799:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1800:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringLiteral4026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1824:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1825:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1826:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4067);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4078); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1833:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1836:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1837:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1837:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1837:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1845:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1860:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1861:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1862:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4190);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4201); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1869:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1872:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1873:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1873:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1873:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1873:2: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1874:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEInt4240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleBinaryOp"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1894:1: ruleBinaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleBinaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1896:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1897:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1897:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt21=1;
                }
                break;
            case 33:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            case 36:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1897:2: (enumLiteral_0= '+' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1897:2: (enumLiteral_0= '+' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1897:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryOp4316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1903:6: (enumLiteral_1= '-' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1903:6: (enumLiteral_1= '-' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1903:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryOp4333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1909:6: (enumLiteral_2= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1909:6: (enumLiteral_2= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1909:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBinaryOp4350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1915:6: (enumLiteral_3= '/' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1915:6: (enumLiteral_3= '/' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1915:8: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBinaryOp4367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getBinaryOpAccess().getDIVEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOp"

    // $ANTLR start synpred1_InternalScript
    public final void synpred1_InternalScript_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1262:8: ( () )
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1262:9: ()
        {
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1262:9: ()
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalScript.g:1263:1: 
        {
        }


        }
    }
    // $ANTLR end synpred1_InternalScript

    // Delegated rules

    public final boolean synpred1_InternalScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA12_eotS =
        "\17\uffff";
    static final String DFA12_eofS =
        "\1\2\16\uffff";
    static final String DFA12_minS =
        "\1\4\16\uffff";
    static final String DFA12_maxS =
        "\1\41\16\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA12_specialS =
        "\17\uffff}>";
    static final String[] DFA12_transitionS = {
            "\3\2\6\uffff\1\1\1\2\2\uffff\1\2\1\uffff\1\2\4\uffff\1\2\2\uffff"+
            "\2\2\2\uffff\3\2",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1291:2: ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?";
        }
    }
    static final String DFA13_eotS =
        "\17\uffff";
    static final String DFA13_eofS =
        "\1\2\16\uffff";
    static final String DFA13_minS =
        "\1\4\16\uffff";
    static final String DFA13_maxS =
        "\1\41\16\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA13_specialS =
        "\17\uffff}>";
    static final String[] DFA13_transitionS = {
            "\3\2\6\uffff\2\2\2\uffff\1\1\1\uffff\1\2\4\uffff\1\2\2\uffff"+
            "\2\2\2\uffff\3\2",
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1350:3: ( (lv_parameters_12_0= ruleClosureDeclaration ) )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleScriptedTransformation_in_entryRuleScriptedTransformation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScriptedTransformation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleScriptedTransformation122 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScriptedTransformation143 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScriptedTransformation155 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleScriptedTransformation176 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScriptedTransformation188 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScriptedTransformation200 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScriptedTransformation212 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleScriptedTransformation233 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScriptedTransformation245 = new BitSet(new long[]{0x0000000310022070L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleScriptedTransformation266 = new BitSet(new long[]{0x0000000310022072L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceDefinition416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleTraceDefinition453 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceDefinition474 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleTraceDefinition488 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition509 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleTraceDefinition522 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition543 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleTraceDefinition557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition586 = new BitSet(new long[]{0x0000000000520000L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition607 = new BitSet(new long[]{0x0000000000520000L});
        public static final BitSet FOLLOW_20_in_ruleTraceDefinition620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline658 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementInline668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementInline714 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleTraceElementInline726 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementInline747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementExpanded793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleTraceElementExpanded830 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementExpanded851 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleTraceElementExpanded863 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpression930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTypeExpression976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_entryRuleClassUse1010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassUse1020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse1065 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleClassUse1077 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_ruleStatement1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleStatement1219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_ruleStatement1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_ruleStatement1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite1308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyWrite1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyWrite1363 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulePropertyWrite1375 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyWrite1392 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulePropertyWrite1409 = new BitSet(new long[]{0x0000000210022070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePropertyWrite1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable1466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefineVariable1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDefineVariable1522 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleDefineVariable1534 = new BitSet(new long[]{0x0000000210022070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDefineVariable1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference1591 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelReference1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModelReference1646 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleModelReference1658 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelReference1679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_ruleExpression1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1805 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression1862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rulePrimaryExpression1889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_rulePrimaryExpression1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression1943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression2032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression2042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleParenthesizedExpression2079 = new BitSet(new long[]{0x0000000210022070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression2101 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleParenthesizedExpression2112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2148 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral2205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_ruleLiteral2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference2294 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference2348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration2383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureDeclaration2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleClosureDeclaration2430 = new BitSet(new long[]{0x0000000314022070L});
        public static final BitSet FOLLOW_26_in_ruleClosureDeclaration2443 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2464 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_27_in_ruleClosureDeclaration2477 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2498 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleClosureDeclaration2512 = new BitSet(new long[]{0x0000000310022070L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleClosureDeclaration2535 = new BitSet(new long[]{0x00000003100A2070L});
        public static final BitSet FOLLOW_19_in_ruleClosureDeclaration2548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter2584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureParameter2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClosureParameter2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall2675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMethodCall2732 = new BitSet(new long[]{0x0000001E01000002L});
        public static final BitSet FOLLOW_ruleBinaryOp_in_ruleMethodCall2763 = new BitSet(new long[]{0x0000000210022070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall2784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMethodCall2821 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMethodCall2842 = new BitSet(new long[]{0x0000000211022072L});
        public static final BitSet FOLLOW_13_in_ruleMethodCall2861 = new BitSet(new long[]{0x0000000210022070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall2895 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_27_in_ruleMethodCall2908 = new BitSet(new long[]{0x0000000210022070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall2929 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_14_in_ruleMethodCall2943 = new BitSet(new long[]{0x0000000211022072L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_ruleMethodCall2966 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression3011 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchTraceExpression3021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleMatchTraceExpression3058 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression3070 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMatchTraceExpression3081 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression3103 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMatchTraceExpression3115 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMatchTraceExpression3127 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression3148 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMatchTraceExpression3160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage3196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceExprLanguage3206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraceExprLanguage3251 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTraceExprLanguage3263 = new BitSet(new long[]{0x0000000210022070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTraceExprLanguage3284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression3320 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceExpression3330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rulePutTraceExpression3367 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceExpression3379 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulePutTraceExpression3390 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceExpression3412 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulePutTraceExpression3424 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePutTraceExpression3436 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3457 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePutTraceExpression3470 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3491 = new BitSet(new long[]{0x0000000088000000L});
        public static final BitSet FOLLOW_31_in_rulePutTraceExpression3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter3541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceParameter3551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceParameter3596 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulePutTraceParameter3608 = new BitSet(new long[]{0x0000000210022070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePutTraceParameter3629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral3665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral3675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumLiteral3720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral3755 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral3765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleFloatLiteral3810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble3846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble3857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble3897 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEDouble3915 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble3930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral4026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEInt4240 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleBinaryOp4316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleBinaryOp4333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBinaryOp4350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleBinaryOp4367 = new BitSet(new long[]{0x0000000000000002L});
    }


}