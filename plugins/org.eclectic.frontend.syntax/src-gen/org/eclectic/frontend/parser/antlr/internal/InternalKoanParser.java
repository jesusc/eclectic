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
import org.eclectic.frontend.services.KoanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKoanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_KEYWORD_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'koan'", "'('", "')'", "'->'", "'trace'", "'end'", "'link'", "'{'", "';'", "'}'", "':'", "'var'", "'!'", "'.'", "'='", "'|'", "','", "'match'", "'with'", "'['", "']'", "'put'", "'rule'", "'forAll'", "'-'", "'+'", "'*'", "'/'"
    };
    public static final int RULE_KEYWORD_ID=5;
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
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
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
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g"; }



     	private KoanGrammarAccess grammarAccess;
     	
        public InternalKoanParser(TokenStream input, KoanGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MappingTransformation";	
       	}
       	
       	@Override
       	protected KoanGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMappingTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:68:1: entryRuleMappingTransformation returns [EObject current=null] : iv_ruleMappingTransformation= ruleMappingTransformation EOF ;
    public final EObject entryRuleMappingTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:69:2: (iv_ruleMappingTransformation= ruleMappingTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:70:2: iv_ruleMappingTransformation= ruleMappingTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingTransformationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation75);
            iv_ruleMappingTransformation=ruleMappingTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingTransformation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMappingTransformation85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingTransformation"


    // $ANTLR start "ruleMappingTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:77:1: ruleMappingTransformation returns [EObject current=null] : (otherlv_0= 'koan' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_traceInterface_9_0= ruleTraceInterface ) ) ( (lv_rules_10_0= ruleKoanRule ) )+ ) ;
    public final EObject ruleMappingTransformation() throws RecognitionException {
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

        EObject lv_traceInterface_9_0 = null;

        EObject lv_rules_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:80:28: ( (otherlv_0= 'koan' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_traceInterface_9_0= ruleTraceInterface ) ) ( (lv_rules_10_0= ruleKoanRule ) )+ ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:81:1: (otherlv_0= 'koan' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_traceInterface_9_0= ruleTraceInterface ) ) ( (lv_rules_10_0= ruleKoanRule ) )+ )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:81:1: (otherlv_0= 'koan' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_traceInterface_9_0= ruleTraceInterface ) ) ( (lv_rules_10_0= ruleKoanRule ) )+ )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:81:3: otherlv_0= 'koan' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_traceInterface_9_0= ruleTraceInterface ) ) ( (lv_rules_10_0= ruleKoanRule ) )+
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMappingTransformation122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingTransformationAccess().getKoanKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:86:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:87:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMappingTransformation143);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
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

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMappingTransformation155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:107:1: ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:108:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:108:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:109:3: lv_inModels_3_0= ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation176);
            lv_inModels_3_0=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
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

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMappingTransformation188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMappingTransformation200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMappingTransformation212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:137:1: ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:138:1: (lv_outModels_7_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:138:1: (lv_outModels_7_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:139:3: lv_outModels_7_0= ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation233);
            lv_outModels_7_0=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
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

            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMappingTransformation245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:159:1: ( (lv_traceInterface_9_0= ruleTraceInterface ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:160:1: (lv_traceInterface_9_0= ruleTraceInterface )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:160:1: (lv_traceInterface_9_0= ruleTraceInterface )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:161:3: lv_traceInterface_9_0= ruleTraceInterface
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getTraceInterfaceTraceInterfaceParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceInterface_in_ruleMappingTransformation266);
            lv_traceInterface_9_0=ruleTraceInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
              	        }
                     		set(
                     			current, 
                     			"traceInterface",
                      		lv_traceInterface_9_0, 
                      		"TraceInterface");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:177:2: ( (lv_rules_10_0= ruleKoanRule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:178:1: (lv_rules_10_0= ruleKoanRule )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:178:1: (lv_rules_10_0= ruleKoanRule )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:179:3: lv_rules_10_0= ruleKoanRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getRulesKoanRuleParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleKoanRule_in_ruleMappingTransformation287);
            	    lv_rules_10_0=ruleKoanRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rules",
            	              		lv_rules_10_0, 
            	              		"KoanRule");
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
    // $ANTLR end "ruleMappingTransformation"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:203:1: entryRuleTransformationDefinitionParameter returns [EObject current=null] : iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF ;
    public final EObject entryRuleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationDefinitionParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:204:2: (iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:205:2: iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationDefinitionParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter324);
            iv_ruleTransformationDefinitionParameter=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformationDefinitionParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter334); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:212:1: ruleTransformationDefinitionParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:215:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:216:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:216:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:216:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:216:2: ()
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:217:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0(),
                          current);
                  
            }

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:222:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:223:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:223:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:224:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter389);
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


    // $ANTLR start "entryRuleTraceInterface"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:248:1: entryRuleTraceInterface returns [EObject current=null] : iv_ruleTraceInterface= ruleTraceInterface EOF ;
    public final EObject entryRuleTraceInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceInterface = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:249:2: (iv_ruleTraceInterface= ruleTraceInterface EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:250:2: iv_ruleTraceInterface= ruleTraceInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceInterface_in_entryRuleTraceInterface425);
            iv_ruleTraceInterface=ruleTraceInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceInterface; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceInterface435); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTraceInterface"


    // $ANTLR start "ruleTraceInterface"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:257:1: ruleTraceInterface returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end' ) ;
    public final EObject ruleTraceInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_definitions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:260:28: ( (otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:261:1: (otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:261:1: (otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:261:3: otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTraceInterface472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceInterfaceAccess().getTraceKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:265:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:266:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:266:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:267:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceInterfaceAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceInterface493);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTraceInterfaceRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:283:2: ( (lv_definitions_2_0= ruleTraceDefinition ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:284:1: (lv_definitions_2_0= ruleTraceDefinition )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:284:1: (lv_definitions_2_0= ruleTraceDefinition )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:285:3: lv_definitions_2_0= ruleTraceDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTraceInterfaceAccess().getDefinitionsTraceDefinitionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_ruleTraceInterface514);
            	    lv_definitions_2_0=ruleTraceDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTraceInterfaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"definitions",
            	              		lv_definitions_2_0, 
            	              		"TraceDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTraceInterface527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTraceInterfaceAccess().getEndKeyword_3());
                  
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
    // $ANTLR end "ruleTraceInterface"


    // $ANTLR start "entryRuleTraceDefinition"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:313:1: entryRuleTraceDefinition returns [EObject current=null] : iv_ruleTraceDefinition= ruleTraceDefinition EOF ;
    public final EObject entryRuleTraceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceDefinition = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:314:2: (iv_ruleTraceDefinition= ruleTraceDefinition EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:315:2: iv_ruleTraceDefinition= ruleTraceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition563);
            iv_ruleTraceDefinition=ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceDefinition573); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:322:1: ruleTraceDefinition returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:325:28: ( (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:326:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:326:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:326:3: otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTraceDefinition610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:330:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:331:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:331:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:332:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceDefinition631);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:348:2: ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:348:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:348:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:348:5: otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTraceDefinition645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:352:1: ( (lv_elements_3_0= ruleTraceElementInline ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:353:1: (lv_elements_3_0= ruleTraceElementInline )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:353:1: (lv_elements_3_0= ruleTraceElementInline )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:354:3: lv_elements_3_0= ruleTraceElementInline
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition666);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:370:2: (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==20) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:370:4: otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTraceDefinition679); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:374:1: ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:375:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:375:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:376:3: lv_elements_5_0= ruleTraceElementInline
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition700);
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
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTraceDefinition714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:397:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:397:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:397:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:397:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:398:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:398:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:399:3: lv_elements_7_0= ruleTraceElementExpanded
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition743);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:415:2: ( (lv_elements_8_0= ruleTraceElementExpanded ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:416:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:416:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:417:3: lv_elements_8_0= ruleTraceElementExpanded
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition764);
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
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTraceDefinition777); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:445:1: entryRuleTraceElementInline returns [EObject current=null] : iv_ruleTraceElementInline= ruleTraceElementInline EOF ;
    public final EObject entryRuleTraceElementInline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementInline = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:446:2: (iv_ruleTraceElementInline= ruleTraceElementInline EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:447:2: iv_ruleTraceElementInline= ruleTraceElementInline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline815);
            iv_ruleTraceElementInline=ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementInline; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementInline825); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:454:1: ruleTraceElementInline returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementInline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:457:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:458:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:458:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:458:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:458:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:459:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:459:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:460:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementInline871);
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

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTraceElementInline883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceElementInlineAccess().getColonKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:480:1: ( (lv_type_2_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:481:1: (lv_type_2_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:481:1: (lv_type_2_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:482:3: lv_type_2_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementInline904);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:506:1: entryRuleTraceElementExpanded returns [EObject current=null] : iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF ;
    public final EObject entryRuleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementExpanded = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:507:2: (iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:508:2: iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded940);
            iv_ruleTraceElementExpanded=ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementExpanded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementExpanded950); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:515:1: ruleTraceElementExpanded returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:518:28: ( (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:519:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:519:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:519:3: otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTraceElementExpanded987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:523:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:524:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:524:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:525:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementExpanded1008);
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTraceElementExpanded1020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:545:1: ( (lv_type_3_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:546:1: (lv_type_3_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:546:1: (lv_type_3_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:547:3: lv_type_3_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded1041);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:571:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:572:2: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:573:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression1077);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpression1087); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:580:1: ruleTypeExpression returns [EObject current=null] : this_ClassUse_0= ruleClassUse ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassUse_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:583:28: (this_ClassUse_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:585:5: this_ClassUse_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTypeExpression1133);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:601:1: entryRuleClassUse returns [EObject current=null] : iv_ruleClassUse= ruleClassUse EOF ;
    public final EObject entryRuleClassUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUse = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:602:2: (iv_ruleClassUse= ruleClassUse EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:603:2: iv_ruleClassUse= ruleClassUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassUseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_entryRuleClassUse1167);
            iv_ruleClassUse=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassUse; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassUse1177); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:610:1: ruleClassUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) ;
    public final EObject ruleClassUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:613:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:614:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:614:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:614:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:614:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:615:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:615:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:616:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassUseRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse1222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClassUse1234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:631:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:632:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:632:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:633:3: lv_className_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassUseAccess().getClassNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClassUse1255);
            lv_className_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassUseRule());
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
    // $ANTLR end "ruleClassUse"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:657:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:658:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:659:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement1291);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement1301); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:666:1: ruleStatement returns [EObject current=null] : (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DefineVariable_0 = null;

        EObject this_Expression_1 = null;

        EObject this_PutTraceExpression_2 = null;

        EObject this_PropertyWrite_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:669:28: ( (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:670:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:670:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case 13:
                case 17:
                case 19:
                case 21:
                case 24:
                case 29:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                    {
                    alt6=2;
                    }
                    break;
                case 25:
                    {
                    int LA6_5 = input.LA(3);

                    if ( ((LA6_5>=RULE_KEYWORD_ID && LA6_5<=RULE_STRING)) ) {
                        alt6=2;
                    }
                    else if ( (LA6_5==RULE_ID) ) {
                        int LA6_6 = input.LA(4);

                        if ( (LA6_6==26) ) {
                            alt6=4;
                        }
                        else if ( (LA6_6==EOF||LA6_6==RULE_ID||(LA6_6>=RULE_STRING && LA6_6<=RULE_INT)||LA6_6==13||LA6_6==17||LA6_6==19||LA6_6==21||LA6_6==25||LA6_6==29||LA6_6==33||LA6_6==36) ) {
                            alt6=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INT:
            case 13:
            case 19:
            case 29:
            case 36:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:671:5: this_DefineVariable_0= ruleDefineVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_ruleStatement1348);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:681:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleStatement1375);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:691:5: this_PutTraceExpression_2= rulePutTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPutTraceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_ruleStatement1402);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:701:5: this_PropertyWrite_3= rulePropertyWrite
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPropertyWriteParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_ruleStatement1429);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:717:1: entryRulePropertyWrite returns [EObject current=null] : iv_rulePropertyWrite= rulePropertyWrite EOF ;
    public final EObject entryRulePropertyWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyWrite = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:718:2: (iv_rulePropertyWrite= rulePropertyWrite EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:719:2: iv_rulePropertyWrite= rulePropertyWrite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyWriteRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite1464);
            iv_rulePropertyWrite=rulePropertyWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyWrite; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyWrite1474); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:726:1: rulePropertyWrite returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:729:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:730:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:730:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:730:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:730:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:731:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:731:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:732:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyWriteRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyWrite1519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyWriteAccess().getReceptorVariableCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePropertyWrite1531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyWriteAccess().getFullStopKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:747:1: ( (lv_property_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:748:1: (lv_property_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:748:1: (lv_property_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:749:3: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyWrite1548); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePropertyWrite1565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyWriteAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:769:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:770:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:770:1: (lv_expression_4_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:771:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyWriteAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePropertyWrite1586);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:795:1: entryRuleDefineVariable returns [EObject current=null] : iv_ruleDefineVariable= ruleDefineVariable EOF ;
    public final EObject entryRuleDefineVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineVariable = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:796:2: (iv_ruleDefineVariable= ruleDefineVariable EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:797:2: iv_ruleDefineVariable= ruleDefineVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable1622);
            iv_ruleDefineVariable=ruleDefineVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefineVariable1632); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:804:1: ruleDefineVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDefineVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:807:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:808:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:808:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:808:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:808:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:809:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:809:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:810:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDefineVariable1678);
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

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDefineVariable1690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:830:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:831:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:831:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:832:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDefineVariable1711);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:856:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:857:2: (iv_ruleModelReference= ruleModelReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:858:2: iv_ruleModelReference= ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_entryRuleModelReference1747);
            iv_ruleModelReference=ruleModelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelReference1757); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:865:1: ruleModelReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:868:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:869:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:869:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:869:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:869:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:870:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:870:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:871:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModelReference1802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleModelReference1814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:886:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:887:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:887:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:888:3: lv_className_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelReference1835);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:912:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:913:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:914:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1871);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1881); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:921:1: ruleExpression returns [EObject current=null] : this_MethodCall_0= ruleMethodCall ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MethodCall_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:924:28: (this_MethodCall_0= ruleMethodCall )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:926:5: this_MethodCall_0= ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_ruleExpression1927);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:942:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:943:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:944:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1961);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression1971); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:951:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:954:28: ( (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:955:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:955:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 36:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==24) ) {
                    alt7=3;
                }
                else if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_INT)||(LA7_2>=13 && LA7_2<=14)||LA7_2==17||LA7_2==19||LA7_2==21||LA7_2==25||(LA7_2>=28 && LA7_2<=29)||(LA7_2>=32 && LA7_2<=33)||(LA7_2>=36 && LA7_2<=39)) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:956:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression2018);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:966:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rulePrimaryExpression2045);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:976:5: this_ModelReference_2= ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_rulePrimaryExpression2072);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:986:5: this_ParenthesizedExpression_3= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2099);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:996:5: this_MatchTraceExpression_4= ruleMatchTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression2126);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1006:5: this_ClosureDeclaration_5= ruleClosureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression2153);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1022:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1023:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1024:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression2188);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedExpression2198); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1031:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1034:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1035:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1035:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1035:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParenthesizedExpression2235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParenthesizedExpression2257);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParenthesizedExpression2268); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1060:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1061:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1062:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral2304);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral2314); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1069:1: ruleLiteral returns [EObject current=null] : this_NumLiteral_0= ruleNumLiteral ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumLiteral_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1072:28: (this_NumLiteral_0= ruleNumLiteral )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1074:5: this_NumLiteral_0= ruleNumLiteral
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_ruleLiteral2360);
            this_NumLiteral_0=ruleNumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumLiteral_0; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1090:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1091:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1092:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference2394);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference2404); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1099:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1102:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1103:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1103:1: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1104:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1104:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1105:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableReference2448); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1124:1: entryRuleClosureDeclaration returns [EObject current=null] : iv_ruleClosureDeclaration= ruleClosureDeclaration EOF ;
    public final EObject entryRuleClosureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureDeclaration = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1125:2: (iv_ruleClosureDeclaration= ruleClosureDeclaration EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1126:2: iv_ruleClosureDeclaration= ruleClosureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration2483);
            iv_ruleClosureDeclaration=ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureDeclaration2493); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1133:1: ruleClosureDeclaration returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1136:28: ( (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1137:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1137:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1137:3: otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleClosureDeclaration2530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1141:1: (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1141:3: otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|'
                    {
                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleClosureDeclaration2543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1145:1: ( (lv_formalParameters_2_0= ruleClosureParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1146:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1146:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1147:3: lv_formalParameters_2_0= ruleClosureParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2564);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1163:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==28) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1163:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleClosureDeclaration2577); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1167:1: ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1168:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1168:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1169:3: lv_formalParameters_4_0= ruleClosureParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2598);
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

                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleClosureDeclaration2612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1189:3: ( (lv_statements_6_0= ruleStatement ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||LA10_0==13||LA10_0==19||LA10_0==29||LA10_0==33||LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1190:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1190:1: (lv_statements_6_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1191:3: lv_statements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleClosureDeclaration2635);
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

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleClosureDeclaration2648); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1219:1: entryRuleClosureParameter returns [EObject current=null] : iv_ruleClosureParameter= ruleClosureParameter EOF ;
    public final EObject entryRuleClosureParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1220:2: (iv_ruleClosureParameter= ruleClosureParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1221:2: iv_ruleClosureParameter= ruleClosureParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter2684);
            iv_ruleClosureParameter=ruleClosureParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureParameter2694); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1228:1: ruleClosureParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClosureParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1231:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1232:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1232:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1233:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1233:1: (lv_name_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1234:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClosureParameter2735); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1258:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1259:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1260:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_entryRuleMethodCall2775);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodCall2785); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1267:1: ruleMethodCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )+ | ( () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+ ) )? ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token lv_withParameters_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_binaryOp_2_0 = null;

        EObject lv_right_3_0 = null;

        AntlrDatatypeRuleToken lv_methodName_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_parameters_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1270:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )+ | ( () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+ ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1271:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )+ | ( () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+ ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1271:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )+ | ( () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+ ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1272:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )+ | ( () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+ ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleMethodCall2832);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1280:1: ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )+ | ( () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+ ) )?
            int alt15=4;
            switch ( input.LA(1) ) {
                case 37:
                case 38:
                case 39:
                    {
                    alt15=1;
                    }
                    break;
                case 36:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==36) ) {
                        alt15=1;
                    }
                    else if ( (LA15_2==RULE_ID||LA15_2==RULE_INT||LA15_2==13||LA15_2==19||LA15_2==29) ) {
                        alt15=1;
                    }
                    }
                    break;
                case 25:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==RULE_KEYWORD_ID) ) {
                        alt15=3;
                    }
                    else if ( (LA15_3==RULE_ID||LA15_3==RULE_STRING) ) {
                        alt15=2;
                    }
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1280:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1280:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1280:3: () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1280:3: ()
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1281:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getMethodCallAccess().getBinaryExprLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1286:2: ( (lv_binaryOp_2_0= ruleBinaryOp ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1287:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1287:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1288:3: lv_binaryOp_2_0= ruleBinaryOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOp_in_ruleMethodCall2863);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1304:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1305:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1305:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1306:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall2884);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1323:6: ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )+
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1323:6: ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) && (synpred1_InternalKoan())) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1323:7: ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1323:7: ( ( () )=> () )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1323:8: ( () )=> ()
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1324:5: ()
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1325:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getMethodCallAccess().getMethodCallReceptorAction_1_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMethodCall2921); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getMethodCallAccess().getFullStopKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1334:1: ( (lv_methodName_6_0= ruleEString ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1335:1: (lv_methodName_6_0= ruleEString )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1335:1: (lv_methodName_6_0= ruleEString )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1336:3: lv_methodName_6_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMethodCall2942);
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

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1352:2: ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?
                    	    int alt12=2;
                    	    alt12 = dfa12.predict(input);
                    	    switch (alt12) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1352:3: ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')'
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1352:3: ( (lv_withParameters_7_0= '(' ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1353:1: (lv_withParameters_7_0= '(' )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1353:1: (lv_withParameters_7_0= '(' )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1354:3: lv_withParameters_7_0= '('
                    	            {
                    	            lv_withParameters_7_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMethodCall2961); if (state.failed) return current;
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

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1367:2: ( (lv_parameters_8_0= ruleExpression ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1368:1: (lv_parameters_8_0= ruleExpression )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1368:1: (lv_parameters_8_0= ruleExpression )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1369:3: lv_parameters_8_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall2995);
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

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1385:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )*
                    	            loop11:
                    	            do {
                    	                int alt11=2;
                    	                int LA11_0 = input.LA(1);

                    	                if ( (LA11_0==28) ) {
                    	                    alt11=1;
                    	                }


                    	                switch (alt11) {
                    	            	case 1 :
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1385:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) )
                    	            	    {
                    	            	    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMethodCall3008); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	          	newLeafNode(otherlv_9, grammarAccess.getMethodCallAccess().getCommaKeyword_1_1_3_2_0());
                    	            	          
                    	            	    }
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1389:1: ( (lv_parameters_10_0= ruleExpression ) )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1390:1: (lv_parameters_10_0= ruleExpression )
                    	            	    {
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1390:1: (lv_parameters_10_0= ruleExpression )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1391:3: lv_parameters_10_0= ruleExpression
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {
                    	            	       
                    	            	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_2_1_0()); 
                    	            	      	    
                    	            	    }
                    	            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall3029);
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

                    	            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMethodCall3043); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_11, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_1_3_3());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1412:6: ( () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+ )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1412:6: ( () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+ )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1412:7: () otherlv_13= '.' ( (lv_parameters_14_0= ruleKeywordParameter ) )+
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1412:7: ()
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1413:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getMethodCallAccess().getKeywordMethodCallReceptorAction_1_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMethodCall3075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMethodCallAccess().getFullStopKeyword_1_2_1());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1422:1: ( (lv_parameters_14_0= ruleKeywordParameter ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_KEYWORD_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1423:1: (lv_parameters_14_0= ruleKeywordParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1423:1: (lv_parameters_14_0= ruleKeywordParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1424:3: lv_parameters_14_0= ruleKeywordParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersKeywordParameterParserRuleCall_1_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleKeywordParameter_in_ruleMethodCall3096);
                    	    lv_parameters_14_0=ruleKeywordParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_14_0, 
                    	              		"KeywordParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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


    // $ANTLR start "entryRuleKeywordParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1448:1: entryRuleKeywordParameter returns [EObject current=null] : iv_ruleKeywordParameter= ruleKeywordParameter EOF ;
    public final EObject entryRuleKeywordParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeywordParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1449:2: (iv_ruleKeywordParameter= ruleKeywordParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1450:2: iv_ruleKeywordParameter= ruleKeywordParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeywordParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeywordParameter_in_entryRuleKeywordParameter3136);
            iv_ruleKeywordParameter=ruleKeywordParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeywordParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeywordParameter3146); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeywordParameter"


    // $ANTLR start "ruleKeywordParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1457:1: ruleKeywordParameter returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_KEYWORD_ID ) ) ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruleKeywordParameter() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1460:28: ( ( ( (lv_keyword_0_0= RULE_KEYWORD_ID ) ) ( (lv_value_1_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1461:1: ( ( (lv_keyword_0_0= RULE_KEYWORD_ID ) ) ( (lv_value_1_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1461:1: ( ( (lv_keyword_0_0= RULE_KEYWORD_ID ) ) ( (lv_value_1_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1461:2: ( (lv_keyword_0_0= RULE_KEYWORD_ID ) ) ( (lv_value_1_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1461:2: ( (lv_keyword_0_0= RULE_KEYWORD_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1462:1: (lv_keyword_0_0= RULE_KEYWORD_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1462:1: (lv_keyword_0_0= RULE_KEYWORD_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1463:3: lv_keyword_0_0= RULE_KEYWORD_ID
            {
            lv_keyword_0_0=(Token)match(input,RULE_KEYWORD_ID,FollowSets000.FOLLOW_RULE_KEYWORD_ID_in_ruleKeywordParameter3188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_keyword_0_0, grammarAccess.getKeywordParameterAccess().getKeywordKEYWORD_IDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeywordParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"keyword",
                      		lv_keyword_0_0, 
                      		"KEYWORD_ID");
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1479:2: ( (lv_value_1_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1480:1: (lv_value_1_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1480:1: (lv_value_1_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1481:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeywordParameterAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleKeywordParameter3214);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeywordParameterRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
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
    // $ANTLR end "ruleKeywordParameter"


    // $ANTLR start "entryRuleMatchTraceExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1505:1: entryRuleMatchTraceExpression returns [EObject current=null] : iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF ;
    public final EObject entryRuleMatchTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1506:2: (iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1507:2: iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression3250);
            iv_ruleMatchTraceExpression=ruleMatchTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchTraceExpression3260); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1514:1: ruleMatchTraceExpression returns [EObject current=null] : (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1517:28: ( (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1518:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1518:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1518:3: otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMatchTraceExpression3297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1522:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==24) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1522:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression3309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMatchTraceExpression3320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1530:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1531:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1531:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1532:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMatchTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression3342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMatchTraceExpression3354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMatchTraceExpression3366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1551:1: ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1552:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1552:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1553:3: lv_traceExpr_6_0= ruleTraceExprLanguage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression3387);
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

            otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMatchTraceExpression3399); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1581:1: entryRuleTraceExprLanguage returns [EObject current=null] : iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF ;
    public final EObject entryRuleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExprLanguage = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1582:2: (iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1583:2: iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceExprLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage3435);
            iv_ruleTraceExprLanguage=ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceExprLanguage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceExprLanguage3445); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1590:1: ruleTraceExprLanguage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1593:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1594:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1594:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1594:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1594:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1595:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1595:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1596:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTraceExprLanguageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraceExprLanguage3490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTraceExprLanguage3502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1611:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1612:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1612:1: (lv_expr_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1613:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTraceExprLanguage3523);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1637:1: entryRulePutTraceExpression returns [EObject current=null] : iv_rulePutTraceExpression= rulePutTraceExpression EOF ;
    public final EObject entryRulePutTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1638:2: (iv_rulePutTraceExpression= rulePutTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1639:2: iv_rulePutTraceExpression= rulePutTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression3559);
            iv_rulePutTraceExpression=rulePutTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceExpression3569); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1646:1: rulePutTraceExpression returns [EObject current=null] : (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1649:28: ( (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1650:1: (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1650:1: (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1650:3: otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulePutTraceExpression3606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPutTraceExpressionAccess().getPutKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1654:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==24) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1654:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceExpression3618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getPutTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePutTraceExpression3629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPutTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1662:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1663:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1663:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1664:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceExpression3651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePutTraceExpression3663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPutTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePutTraceExpression3675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPutTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1683:1: ( (lv_parameters_6_0= rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1684:1: (lv_parameters_6_0= rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1684:1: (lv_parameters_6_0= rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1685:3: lv_parameters_6_0= rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3696);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1701:2: (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1701:4: otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePutTraceExpression3709); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getPutTraceExpressionAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1705:1: ( (lv_parameters_8_0= rulePutTraceParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1706:1: (lv_parameters_8_0= rulePutTraceParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1706:1: (lv_parameters_8_0= rulePutTraceParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1707:3: lv_parameters_8_0= rulePutTraceParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3730);
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

            otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePutTraceExpression3744); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1735:1: entryRulePutTraceParameter returns [EObject current=null] : iv_rulePutTraceParameter= rulePutTraceParameter EOF ;
    public final EObject entryRulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1736:2: (iv_rulePutTraceParameter= rulePutTraceParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1737:2: iv_rulePutTraceParameter= rulePutTraceParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter3780);
            iv_rulePutTraceParameter=rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceParameter3790); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1744:1: rulePutTraceParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1747:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1748:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1748:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1748:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1748:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1749:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1749:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1750:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceParameterRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceParameter3835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePutTraceParameter3847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1765:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1766:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1766:1: (lv_value_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1767:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePutTraceParameter3868);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1791:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1792:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1793:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral3904);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumLiteral3914); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1800:1: ruleNumLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1803:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1804:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1804:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1805:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1805:1: (lv_value_0_0= ruleEInt )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1806:3: lv_value_0_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumLiteral3959);
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


    // $ANTLR start "entryRuleKoanRule"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1830:1: entryRuleKoanRule returns [EObject current=null] : iv_ruleKoanRule= ruleKoanRule EOF ;
    public final EObject entryRuleKoanRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKoanRule = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1831:2: (iv_ruleKoanRule= ruleKoanRule EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1832:2: iv_ruleKoanRule= ruleKoanRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKoanRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKoanRule_in_entryRuleKoanRule3994);
            iv_ruleKoanRule=ruleKoanRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKoanRule; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKoanRule4004); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKoanRule"


    // $ANTLR start "ruleKoanRule"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1839:1: ruleKoanRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= ruleEString ) ) ( (lv_matcher_2_0= ruleMatcher ) ) ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleKoanRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_matcher_2_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1842:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= ruleEString ) ) ( (lv_matcher_2_0= ruleMatcher ) ) ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1843:1: (otherlv_0= 'rule' ( (lv_name_1_0= ruleEString ) ) ( (lv_matcher_2_0= ruleMatcher ) ) ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1843:1: (otherlv_0= 'rule' ( (lv_name_1_0= ruleEString ) ) ( (lv_matcher_2_0= ruleMatcher ) ) ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1843:3: otherlv_0= 'rule' ( (lv_name_1_0= ruleEString ) ) ( (lv_matcher_2_0= ruleMatcher ) ) ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleKoanRule4041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKoanRuleAccess().getRuleKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1847:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1848:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1848:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1849:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKoanRuleAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKoanRule4062);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKoanRuleRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1865:2: ( (lv_matcher_2_0= ruleMatcher ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1866:1: (lv_matcher_2_0= ruleMatcher )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1866:1: (lv_matcher_2_0= ruleMatcher )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1867:3: lv_matcher_2_0= ruleMatcher
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKoanRuleAccess().getMatcherMatcherParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatcher_in_ruleKoanRule4083);
            lv_matcher_2_0=ruleMatcher();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKoanRuleRule());
              	        }
                     		set(
                     			current, 
                     			"matcher",
                      		lv_matcher_2_0, 
                      		"Matcher");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1883:2: ( (lv_statements_3_0= ruleStatement ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=RULE_STRING && LA19_0<=RULE_INT)||LA19_0==13||LA19_0==19||LA19_0==29||LA19_0==33||LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1884:1: (lv_statements_3_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1884:1: (lv_statements_3_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1885:3: lv_statements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKoanRuleAccess().getStatementsStatementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleKoanRule4104);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKoanRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKoanRule4117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getKoanRuleAccess().getEndKeyword_4());
                  
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
    // $ANTLR end "ruleKoanRule"


    // $ANTLR start "entryRuleMatcher"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1913:1: entryRuleMatcher returns [EObject current=null] : iv_ruleMatcher= ruleMatcher EOF ;
    public final EObject entryRuleMatcher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatcher = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1914:2: (iv_ruleMatcher= ruleMatcher EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1915:2: iv_ruleMatcher= ruleMatcher EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatcherRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatcher_in_entryRuleMatcher4153);
            iv_ruleMatcher=ruleMatcher();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatcher; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatcher4163); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatcher"


    // $ANTLR start "ruleMatcher"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1922:1: ruleMatcher returns [EObject current=null] : this_ForAllMatcher_0= ruleForAllMatcher ;
    public final EObject ruleMatcher() throws RecognitionException {
        EObject current = null;

        EObject this_ForAllMatcher_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1925:28: (this_ForAllMatcher_0= ruleForAllMatcher )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1927:5: this_ForAllMatcher_0= ruleForAllMatcher
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMatcherAccess().getForAllMatcherParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleForAllMatcher_in_ruleMatcher4209);
            this_ForAllMatcher_0=ruleForAllMatcher();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ForAllMatcher_0; 
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
    // $ANTLR end "ruleMatcher"


    // $ANTLR start "entryRuleForAllMatcher"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1943:1: entryRuleForAllMatcher returns [EObject current=null] : iv_ruleForAllMatcher= ruleForAllMatcher EOF ;
    public final EObject entryRuleForAllMatcher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAllMatcher = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1944:2: (iv_ruleForAllMatcher= ruleForAllMatcher EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1945:2: iv_ruleForAllMatcher= ruleForAllMatcher EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForAllMatcherRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForAllMatcher_in_entryRuleForAllMatcher4243);
            iv_ruleForAllMatcher=ruleForAllMatcher();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForAllMatcher; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForAllMatcher4253); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForAllMatcher"


    // $ANTLR start "ruleForAllMatcher"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1952:1: ruleForAllMatcher returns [EObject current=null] : (otherlv_0= 'forAll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassUse ) ) ( (lv_child_4_0= ruleMatcher ) )? ) ;
    public final EObject ruleForAllMatcher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;

        EObject lv_child_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1955:28: ( (otherlv_0= 'forAll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassUse ) ) ( (lv_child_4_0= ruleMatcher ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1956:1: (otherlv_0= 'forAll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassUse ) ) ( (lv_child_4_0= ruleMatcher ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1956:1: (otherlv_0= 'forAll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassUse ) ) ( (lv_child_4_0= ruleMatcher ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1956:3: otherlv_0= 'forAll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassUse ) ) ( (lv_child_4_0= ruleMatcher ) )?
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleForAllMatcher4290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAllMatcherAccess().getForAllKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1960:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1961:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1961:1: (lv_name_1_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1962:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForAllMatcher4307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getForAllMatcherAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getForAllMatcherRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleForAllMatcher4324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForAllMatcherAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1982:1: ( (lv_type_3_0= ruleClassUse ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1983:1: (lv_type_3_0= ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1983:1: (lv_type_3_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1984:3: lv_type_3_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAllMatcherAccess().getTypeClassUseParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleForAllMatcher4345);
            lv_type_3_0=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForAllMatcherRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"ClassUse");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2000:2: ( (lv_child_4_0= ruleMatcher ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2001:1: (lv_child_4_0= ruleMatcher )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2001:1: (lv_child_4_0= ruleMatcher )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2002:3: lv_child_4_0= ruleMatcher
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForAllMatcherAccess().getChildMatcherParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatcher_in_ruleForAllMatcher4366);
                    lv_child_4_0=ruleMatcher();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForAllMatcherRule());
                      	        }
                             		set(
                             			current, 
                             			"child",
                              		lv_child_4_0, 
                              		"Matcher");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleForAllMatcher"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2026:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2027:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2028:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4404);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4415); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2035:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2038:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2039:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2039:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2039:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2047:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4481); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2062:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2063:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2064:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4527);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4538); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2071:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2074:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2075:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2075:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2075:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2075:2: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2076:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEInt4577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4594); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2096:1: ruleBinaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleBinaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2098:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2099:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2099:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 38:
                {
                alt23=3;
                }
                break;
            case 39:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2099:2: (enumLiteral_0= '+' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2099:2: (enumLiteral_0= '+' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2099:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBinaryOp4653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2105:6: (enumLiteral_1= '-' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2105:6: (enumLiteral_1= '-' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2105:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBinaryOp4670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2111:6: (enumLiteral_2= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2111:6: (enumLiteral_2= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2111:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBinaryOp4687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2117:6: (enumLiteral_3= '/' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2117:6: (enumLiteral_3= '/' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:2117:8: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBinaryOp4704); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalKoan
    public final void synpred1_InternalKoan_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1323:8: ( () )
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1323:9: ()
        {
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1323:9: ()
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalKoan.g:1324:1: 
        {
        }


        }
    }
    // $ANTLR end synpred1_InternalKoan

    // Delegated rules

    public final boolean synpred1_InternalKoan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKoan_fragment(); // can never throw exception
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
    static final String DFA12_eotS =
        "\21\uffff";
    static final String DFA12_eofS =
        "\1\2\20\uffff";
    static final String DFA12_minS =
        "\1\4\20\uffff";
    static final String DFA12_maxS =
        "\1\44\20\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\16\uffff";
    static final String DFA12_specialS =
        "\21\uffff}>";
    static final String[] DFA12_transitionS = {
            "\4\2\5\uffff\1\1\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\2\uffff\1\2",
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
            return "1352:2: ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappingTransformation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMappingTransformation122 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMappingTransformation143 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMappingTransformation155 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation176 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMappingTransformation188 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMappingTransformation200 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMappingTransformation212 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation233 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMappingTransformation245 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleTraceInterface_in_ruleMappingTransformation266 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleKoanRule_in_ruleMappingTransformation287 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceInterface_in_entryRuleTraceInterface425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceInterface435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleTraceInterface472 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceInterface493 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_ruleTraceInterface514 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleTraceInterface527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceDefinition573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleTraceDefinition610 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceDefinition631 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_19_in_ruleTraceDefinition645 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition666 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleTraceDefinition679 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition700 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleTraceDefinition714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition743 = new BitSet(new long[]{0x00000000008A0000L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition764 = new BitSet(new long[]{0x00000000008A0000L});
        public static final BitSet FOLLOW_17_in_ruleTraceDefinition777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementInline825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementInline871 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTraceElementInline883 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementInline904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded940 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementExpanded950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleTraceElementExpanded987 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementExpanded1008 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTraceElementExpanded1020 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression1077 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpression1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTypeExpression1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_entryRuleClassUse1167 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassUse1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse1222 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleClassUse1234 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClassUse1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_ruleStatement1348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleStatement1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_ruleStatement1402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_ruleStatement1429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite1464 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyWrite1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyWrite1519 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulePropertyWrite1531 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyWrite1548 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_rulePropertyWrite1565 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePropertyWrite1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefineVariable1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDefineVariable1678 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleDefineVariable1690 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDefineVariable1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference1747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelReference1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModelReference1802 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleModelReference1814 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelReference1835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_ruleExpression1927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression2018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rulePrimaryExpression2045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_rulePrimaryExpression2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression2188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleParenthesizedExpression2235 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression2257 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleParenthesizedExpression2268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_ruleLiteral2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference2394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference2404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference2448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration2483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureDeclaration2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleClosureDeclaration2530 = new BitSet(new long[]{0x00000012280820D0L});
        public static final BitSet FOLLOW_27_in_ruleClosureDeclaration2543 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2564 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_28_in_ruleClosureDeclaration2577 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2598 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleClosureDeclaration2612 = new BitSet(new long[]{0x00000012280820D0L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleClosureDeclaration2635 = new BitSet(new long[]{0x00000012282820D0L});
        public static final BitSet FOLLOW_21_in_ruleClosureDeclaration2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter2684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureParameter2694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClosureParameter2735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall2775 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall2785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMethodCall2832 = new BitSet(new long[]{0x000000F002000002L});
        public static final BitSet FOLLOW_ruleBinaryOp_in_ruleMethodCall2863 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall2884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleMethodCall2921 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMethodCall2942 = new BitSet(new long[]{0x0000000002002002L});
        public static final BitSet FOLLOW_13_in_ruleMethodCall2961 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall2995 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleMethodCall3008 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall3029 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleMethodCall3043 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleMethodCall3075 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeywordParameter_in_ruleMethodCall3096 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_ruleKeywordParameter_in_entryRuleKeywordParameter3136 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeywordParameter3146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_KEYWORD_ID_in_ruleKeywordParameter3188 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleKeywordParameter3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression3250 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchTraceExpression3260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleMatchTraceExpression3297 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression3309 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMatchTraceExpression3320 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression3342 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMatchTraceExpression3354 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMatchTraceExpression3366 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression3387 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMatchTraceExpression3399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage3435 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceExprLanguage3445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraceExprLanguage3490 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTraceExprLanguage3502 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTraceExprLanguage3523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression3559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceExpression3569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rulePutTraceExpression3606 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceExpression3618 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulePutTraceExpression3629 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceExpression3651 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePutTraceExpression3663 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulePutTraceExpression3675 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3696 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulePutTraceExpression3709 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3730 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_32_in_rulePutTraceExpression3744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter3780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceParameter3790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceParameter3835 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_rulePutTraceParameter3847 = new BitSet(new long[]{0x0000001020082090L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePutTraceParameter3868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral3904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral3914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumLiteral3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKoanRule_in_entryRuleKoanRule3994 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKoanRule4004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleKoanRule4041 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKoanRule4062 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleMatcher_in_ruleKoanRule4083 = new BitSet(new long[]{0x00000012280820D0L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleKoanRule4104 = new BitSet(new long[]{0x00000012280A20D0L});
        public static final BitSet FOLLOW_17_in_ruleKoanRule4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatcher_in_entryRuleMatcher4153 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatcher4163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForAllMatcher_in_ruleMatcher4209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForAllMatcher_in_entryRuleForAllMatcher4243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForAllMatcher4253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleForAllMatcher4290 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForAllMatcher4307 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleForAllMatcher4324 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleForAllMatcher4345 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleMatcher_in_ruleForAllMatcher4366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEInt4577 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleBinaryOp4653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleBinaryOp4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleBinaryOp4687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleBinaryOp4704 = new BitSet(new long[]{0x0000000000000002L});
    }


}