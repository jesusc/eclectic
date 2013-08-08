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
import org.eclectic.frontend.services.TaoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTaoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_KEYWORD_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tao'", "'('", "','", "')'", "'->'", "'uses'", "'as'", "'!'", "'template'", "'end'", "':'", "'{'", "'}'", "'='", "'from'", "'*'", "'to'", "'-'", "'link'", "';'", "'var'", "'@'", "'^'", "'|'", "'['", "'.'", "']'", "'match'", "'with'", "'true'", "'false'", "'+'", "'/'"
    };
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_KEYWORD_ID=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalTaoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaoParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g"; }



     	private TaoGrammarAccess grammarAccess;
     	
        public InternalTaoParser(TokenStream input, TaoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TaoTransformation";	
       	}
       	
       	@Override
       	protected TaoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTaoTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:68:1: entryRuleTaoTransformation returns [EObject current=null] : iv_ruleTaoTransformation= ruleTaoTransformation EOF ;
    public final EObject entryRuleTaoTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaoTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:69:2: (iv_ruleTaoTransformation= ruleTaoTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:70:2: iv_ruleTaoTransformation= ruleTaoTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaoTransformationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTaoTransformation_in_entryRuleTaoTransformation75);
            iv_ruleTaoTransformation=ruleTaoTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTaoTransformation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaoTransformation85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTaoTransformation"


    // $ANTLR start "ruleTaoTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:77:1: ruleTaoTransformation returns [EObject current=null] : (otherlv_0= 'tao' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_uses_13_0= ruleUsesStatements ) )* ( (lv_templates_14_0= ruleTemplate ) )+ ) ;
    public final EObject ruleTaoTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inModels_3_0 = null;

        EObject lv_inModels_5_0 = null;

        EObject lv_outModels_9_0 = null;

        EObject lv_outModels_11_0 = null;

        EObject lv_uses_13_0 = null;

        EObject lv_templates_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:80:28: ( (otherlv_0= 'tao' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_uses_13_0= ruleUsesStatements ) )* ( (lv_templates_14_0= ruleTemplate ) )+ ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:81:1: (otherlv_0= 'tao' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_uses_13_0= ruleUsesStatements ) )* ( (lv_templates_14_0= ruleTemplate ) )+ )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:81:1: (otherlv_0= 'tao' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_uses_13_0= ruleUsesStatements ) )* ( (lv_templates_14_0= ruleTemplate ) )+ )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:81:3: otherlv_0= 'tao' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_uses_13_0= ruleUsesStatements ) )* ( (lv_templates_14_0= ruleTemplate ) )+
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaoTransformation122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTaoTransformationAccess().getTaoKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:86:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:87:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaoTransformationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaoTransformation143);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaoTransformationRule());
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

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTaoTransformation155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTaoTransformationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:107:1: ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:108:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:108:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:109:3: lv_inModels_3_0= ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaoTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleTaoTransformation176);
            lv_inModels_3_0=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaoTransformationRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:125:2: (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:125:4: otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaoTransformation189); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getTaoTransformationAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:129:1: ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:130:1: (lv_inModels_5_0= ruleTransformationDefinitionParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:130:1: (lv_inModels_5_0= ruleTransformationDefinitionParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:131:3: lv_inModels_5_0= ruleTransformationDefinitionParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTaoTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleTaoTransformation210);
            	    lv_inModels_5_0=ruleTransformationDefinitionParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTaoTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inModels",
            	              		lv_inModels_5_0, 
            	              		"TransformationDefinitionParameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaoTransformation224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTaoTransformationAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTaoTransformation236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTaoTransformationAccess().getHyphenMinusGreaterThanSignKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTaoTransformation248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTaoTransformationAccess().getLeftParenthesisKeyword_7());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:159:1: ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:160:1: (lv_outModels_9_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:160:1: (lv_outModels_9_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:161:3: lv_outModels_9_0= ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaoTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleTaoTransformation269);
            lv_outModels_9_0=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaoTransformationRule());
              	        }
                     		add(
                     			current, 
                     			"outModels",
                      		lv_outModels_9_0, 
                      		"TransformationDefinitionParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:177:2: (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:177:4: otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) )
            	    {
            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaoTransformation282); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getTaoTransformationAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:181:1: ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:182:1: (lv_outModels_11_0= ruleTransformationDefinitionParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:182:1: (lv_outModels_11_0= ruleTransformationDefinitionParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:183:3: lv_outModels_11_0= ruleTransformationDefinitionParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTaoTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleTaoTransformation303);
            	    lv_outModels_11_0=ruleTransformationDefinitionParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTaoTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outModels",
            	              		lv_outModels_11_0, 
            	              		"TransformationDefinitionParameter");
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

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaoTransformation317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getTaoTransformationAccess().getRightParenthesisKeyword_10());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:203:1: ( (lv_uses_13_0= ruleUsesStatements ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:204:1: (lv_uses_13_0= ruleUsesStatements )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:204:1: (lv_uses_13_0= ruleUsesStatements )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:205:3: lv_uses_13_0= ruleUsesStatements
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTaoTransformationAccess().getUsesUsesStatementsParserRuleCall_11_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleUsesStatements_in_ruleTaoTransformation338);
            	    lv_uses_13_0=ruleUsesStatements();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTaoTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"uses",
            	              		lv_uses_13_0, 
            	              		"UsesStatements");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:221:3: ( (lv_templates_14_0= ruleTemplate ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:222:1: (lv_templates_14_0= ruleTemplate )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:222:1: (lv_templates_14_0= ruleTemplate )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:223:3: lv_templates_14_0= ruleTemplate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTaoTransformationAccess().getTemplatesTemplateParserRuleCall_12_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplate_in_ruleTaoTransformation360);
            	    lv_templates_14_0=ruleTemplate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTaoTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"templates",
            	              		lv_templates_14_0, 
            	              		"Template");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleTaoTransformation"


    // $ANTLR start "entryRuleUsesStatements"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:247:1: entryRuleUsesStatements returns [EObject current=null] : iv_ruleUsesStatements= ruleUsesStatements EOF ;
    public final EObject entryRuleUsesStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesStatements = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:248:2: (iv_ruleUsesStatements= ruleUsesStatements EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:249:2: iv_ruleUsesStatements= ruleUsesStatements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUsesStatementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUsesStatements_in_entryRuleUsesStatements397);
            iv_ruleUsesStatements=ruleUsesStatements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUsesStatements; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUsesStatements407); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUsesStatements"


    // $ANTLR start "ruleUsesStatements"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:256:1: ruleUsesStatements returns [EObject current=null] : this_UseDeclaration_0= ruleUseDeclaration ;
    public final EObject ruleUsesStatements() throws RecognitionException {
        EObject current = null;

        EObject this_UseDeclaration_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:259:28: (this_UseDeclaration_0= ruleUseDeclaration )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:261:5: this_UseDeclaration_0= ruleUseDeclaration
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUsesStatementsAccess().getUseDeclarationParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleUseDeclaration_in_ruleUsesStatements453);
            this_UseDeclaration_0=ruleUseDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UseDeclaration_0; 
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
    // $ANTLR end "ruleUsesStatements"


    // $ANTLR start "entryRuleUseDeclaration"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:277:1: entryRuleUseDeclaration returns [EObject current=null] : iv_ruleUseDeclaration= ruleUseDeclaration EOF ;
    public final EObject entryRuleUseDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseDeclaration = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:278:2: (iv_ruleUseDeclaration= ruleUseDeclaration EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:279:2: iv_ruleUseDeclaration= ruleUseDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUseDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUseDeclaration_in_entryRuleUseDeclaration487);
            iv_ruleUseDeclaration=ruleUseDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUseDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUseDeclaration497); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUseDeclaration"


    // $ANTLR start "ruleUseDeclaration"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:286:1: ruleUseDeclaration returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleUseDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_module_1_0 = null;

        AntlrDatatypeRuleToken lv_as_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:289:28: ( (otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:290:1: (otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:290:1: (otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:290:3: otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUseDeclaration534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUseDeclarationAccess().getUsesKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:294:1: ( (lv_module_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:295:1: (lv_module_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:295:1: (lv_module_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:296:3: lv_module_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUseDeclarationAccess().getModuleEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUseDeclaration555);
            lv_module_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUseDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"module",
                      		lv_module_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:312:2: (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:312:4: otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUseDeclaration568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUseDeclarationAccess().getAsKeyword_2_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:316:1: ( (lv_as_3_0= ruleEString ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:317:1: (lv_as_3_0= ruleEString )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:317:1: (lv_as_3_0= ruleEString )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:318:3: lv_as_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUseDeclarationAccess().getAsEStringParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUseDeclaration589);
                    lv_as_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUseDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"as",
                              		lv_as_3_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleUseDeclaration"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:342:1: entryRuleTransformationDefinitionParameter returns [EObject current=null] : iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF ;
    public final EObject entryRuleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationDefinitionParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:343:2: (iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:344:2: iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationDefinitionParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter627);
            iv_ruleTransformationDefinitionParameter=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformationDefinitionParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter637); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:351:1: ruleTransformationDefinitionParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:354:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:355:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:355:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:355:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:355:2: ()
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:356:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0(),
                          current);
                  
            }

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:361:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:362:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:362:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:363:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter692);
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


    // $ANTLR start "entryRuleClassUse"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:387:1: entryRuleClassUse returns [EObject current=null] : iv_ruleClassUse= ruleClassUse EOF ;
    public final EObject entryRuleClassUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUse = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:388:2: (iv_ruleClassUse= ruleClassUse EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:389:2: iv_ruleClassUse= ruleClassUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassUseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_entryRuleClassUse728);
            iv_ruleClassUse=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassUse; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassUse738); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:396:1: ruleClassUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ) ;
    public final EObject ruleClassUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:399:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:400:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:400:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:400:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:400:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:401:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:401:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:402:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassUseRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleClassUse795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:417:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:418:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:418:1: (lv_className_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:419:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse812); if (state.failed) return current;
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


    // $ANTLR start "entryRuleTemplate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:443:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:444:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:445:2: iv_ruleTemplate= ruleTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplate_in_entryRuleTemplate853);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplate863); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:452:1: ruleTemplate returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleTemplateParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTemplateParameter ) ) )* otherlv_6= ')' ( (lv_roots_7_0= ruleTemplateRootObject ) ) otherlv_8= 'end' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_roots_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:455:28: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleTemplateParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTemplateParameter ) ) )* otherlv_6= ')' ( (lv_roots_7_0= ruleTemplateRootObject ) ) otherlv_8= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:456:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleTemplateParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTemplateParameter ) ) )* otherlv_6= ')' ( (lv_roots_7_0= ruleTemplateRootObject ) ) otherlv_8= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:456:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleTemplateParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTemplateParameter ) ) )* otherlv_6= ')' ( (lv_roots_7_0= ruleTemplateRootObject ) ) otherlv_8= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:456:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleTemplateParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTemplateParameter ) ) )* otherlv_6= ')' ( (lv_roots_7_0= ruleTemplateRootObject ) ) otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTemplate900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:460:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:461:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:461:1: (lv_name_1_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:462:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplate917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTemplate934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTemplateAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:482:1: ( (lv_parameters_3_0= ruleTemplateParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:483:1: (lv_parameters_3_0= ruleTemplateParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:483:1: (lv_parameters_3_0= ruleTemplateParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:484:3: lv_parameters_3_0= ruleTemplateParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateAccess().getParametersTemplateParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameter_in_ruleTemplate955);
            lv_parameters_3_0=ruleTemplateParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateRule());
              	        }
                     		add(
                     			current, 
                     			"parameters",
                      		lv_parameters_3_0, 
                      		"TemplateParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:500:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleTemplateParameter ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:500:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleTemplateParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTemplate968); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:504:1: ( (lv_parameters_5_0= ruleTemplateParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:505:1: (lv_parameters_5_0= ruleTemplateParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:505:1: (lv_parameters_5_0= ruleTemplateParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:506:3: lv_parameters_5_0= ruleTemplateParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateAccess().getParametersTemplateParameterParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplateParameter_in_ruleTemplate989);
            	    lv_parameters_5_0=ruleTemplateParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_5_0, 
            	              		"TemplateParameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTemplate1003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTemplateAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:526:1: ( (lv_roots_7_0= ruleTemplateRootObject ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:527:1: (lv_roots_7_0= ruleTemplateRootObject )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:527:1: (lv_roots_7_0= ruleTemplateRootObject )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:528:3: lv_roots_7_0= ruleTemplateRootObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateAccess().getRootsTemplateRootObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateRootObject_in_ruleTemplate1024);
            lv_roots_7_0=ruleTemplateRootObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateRule());
              	        }
                     		add(
                     			current, 
                     			"roots",
                      		lv_roots_7_0, 
                      		"TemplateRootObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTemplate1036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTemplateAccess().getEndKeyword_7());
                  
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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleTemplateParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:556:1: entryRuleTemplateParameter returns [EObject current=null] : iv_ruleTemplateParameter= ruleTemplateParameter EOF ;
    public final EObject entryRuleTemplateParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:557:2: (iv_ruleTemplateParameter= ruleTemplateParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:558:2: iv_ruleTemplateParameter= ruleTemplateParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter1072);
            iv_ruleTemplateParameter=ruleTemplateParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateParameter1082); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateParameter"


    // $ANTLR start "ruleTemplateParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:565:1: ruleTemplateParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleClassUse ) ) ) ;
    public final EObject ruleTemplateParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:568:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleClassUse ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:569:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleClassUse ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:569:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleClassUse ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:569:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleClassUse ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:569:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:570:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:570:1: (lv_name_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:571:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplateParameter1124); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTemplateParameterAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTemplateParameter1141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateParameterAccess().getColonKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:591:1: ( (lv_type_2_0= ruleClassUse ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:592:1: (lv_type_2_0= ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:592:1: (lv_type_2_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:593:3: lv_type_2_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateParameterAccess().getTypeClassUseParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTemplateParameter1162);
            lv_type_2_0=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ClassUse");
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
    // $ANTLR end "ruleTemplateParameter"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:617:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:618:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:619:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement1198);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement1208); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:626:1: ruleStatement returns [EObject current=null] : this_DefineVariable_0= ruleDefineVariable ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DefineVariable_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:629:28: (this_DefineVariable_0= ruleDefineVariable )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:631:5: this_DefineVariable_0= ruleDefineVariable
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_ruleStatement1254);
            this_DefineVariable_0=ruleDefineVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DefineVariable_0; 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:647:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:648:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:649:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1288);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1298); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:656:1: ruleExpression returns [EObject current=null] : this_WithResolveMethodCall_0= ruleWithResolveMethodCall ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_WithResolveMethodCall_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:659:28: (this_WithResolveMethodCall_0= ruleWithResolveMethodCall )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:661:5: this_WithResolveMethodCall_0= ruleWithResolveMethodCall
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getWithResolveMethodCallParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleWithResolveMethodCall_in_ruleExpression1344);
            this_WithResolveMethodCall_0=ruleWithResolveMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_WithResolveMethodCall_0; 
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


    // $ANTLR start "entryRuleTemplateRootObject"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:677:1: entryRuleTemplateRootObject returns [EObject current=null] : iv_ruleTemplateRootObject= ruleTemplateRootObject EOF ;
    public final EObject entryRuleTemplateRootObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateRootObject = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:678:2: (iv_ruleTemplateRootObject= ruleTemplateRootObject EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:679:2: iv_ruleTemplateRootObject= ruleTemplateRootObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateRootObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateRootObject_in_entryRuleTemplateRootObject1378);
            iv_ruleTemplateRootObject=ruleTemplateRootObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateRootObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateRootObject1388); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateRootObject"


    // $ANTLR start "ruleTemplateRootObject"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:686:1: ruleTemplateRootObject returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}' ) ;
    public final EObject ruleTemplateRootObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_assigments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:689:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:690:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:690:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:690:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}'
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:690:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==22) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:690:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:690:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:691:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:691:1: (lv_name_0_0= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:692:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplateRootObject1431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getTemplateRootObjectAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateRootObjectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTemplateRootObject1448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateRootObjectAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:712:3: ( (lv_type_2_0= ruleClassUse ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:713:1: (lv_type_2_0= ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:713:1: (lv_type_2_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:714:3: lv_type_2_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateRootObjectAccess().getTypeClassUseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTemplateRootObject1471);
            lv_type_2_0=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateRootObjectRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ClassUse");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTemplateRootObject1483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTemplateRootObjectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:734:1: ( (lv_assigments_4_0= ruleAssignment ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:735:1: (lv_assigments_4_0= ruleAssignment )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:735:1: (lv_assigments_4_0= ruleAssignment )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:736:3: lv_assigments_4_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateRootObjectAccess().getAssigmentsAssignmentParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleTemplateRootObject1504);
            	    lv_assigments_4_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateRootObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assigments",
            	              		lv_assigments_4_0, 
            	              		"Assignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTemplateRootObject1517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTemplateRootObjectAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleTemplateRootObject"


    // $ANTLR start "entryRuleObjectInstantiation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:764:1: entryRuleObjectInstantiation returns [EObject current=null] : iv_ruleObjectInstantiation= ruleObjectInstantiation EOF ;
    public final EObject entryRuleObjectInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectInstantiation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:765:2: (iv_ruleObjectInstantiation= ruleObjectInstantiation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:766:2: iv_ruleObjectInstantiation= ruleObjectInstantiation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectInstantiationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleObjectInstantiation_in_entryRuleObjectInstantiation1553);
            iv_ruleObjectInstantiation=ruleObjectInstantiation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectInstantiation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObjectInstantiation1563); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectInstantiation"


    // $ANTLR start "ruleObjectInstantiation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:773:1: ruleObjectInstantiation returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}' ) ;
    public final EObject ruleObjectInstantiation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_assigments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:776:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:777:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:777:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:777:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleClassUse ) ) otherlv_3= '{' ( (lv_assigments_4_0= ruleAssignment ) )* otherlv_5= '}'
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:777:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==22) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:777:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:777:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:778:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:778:1: (lv_name_0_0= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:779:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleObjectInstantiation1606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getObjectInstantiationAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getObjectInstantiationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleObjectInstantiation1623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getObjectInstantiationAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:799:3: ( (lv_type_2_0= ruleClassUse ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:800:1: (lv_type_2_0= ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:800:1: (lv_type_2_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:801:3: lv_type_2_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectInstantiationAccess().getTypeClassUseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleObjectInstantiation1646);
            lv_type_2_0=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObjectInstantiationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ClassUse");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleObjectInstantiation1658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getObjectInstantiationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:821:1: ( (lv_assigments_4_0= ruleAssignment ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:822:1: (lv_assigments_4_0= ruleAssignment )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:822:1: (lv_assigments_4_0= ruleAssignment )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:823:3: lv_assigments_4_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObjectInstantiationAccess().getAssigmentsAssignmentParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleObjectInstantiation1679);
            	    lv_assigments_4_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getObjectInstantiationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assigments",
            	              		lv_assigments_4_0, 
            	              		"Assignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleObjectInstantiation1692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getObjectInstantiationAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleObjectInstantiation"


    // $ANTLR start "entryRuleAssignment"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:851:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:852:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:853:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment1728);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment1738); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:860:1: ruleAssignment returns [EObject current=null] : (this_AttributeAssigment_0= ruleAttributeAssigment | this_ObjectSyntax_1= ruleObjectSyntax | this_Invocation_2= ruleInvocation ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeAssigment_0 = null;

        EObject this_ObjectSyntax_1 = null;

        EObject this_Invocation_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:863:28: ( (this_AttributeAssigment_0= ruleAttributeAssigment | this_ObjectSyntax_1= ruleObjectSyntax | this_Invocation_2= ruleInvocation ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:864:1: (this_AttributeAssigment_0= ruleAttributeAssigment | this_ObjectSyntax_1= ruleObjectSyntax | this_Invocation_2= ruleInvocation )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:864:1: (this_AttributeAssigment_0= ruleAttributeAssigment | this_ObjectSyntax_1= ruleObjectSyntax | this_Invocation_2= ruleInvocation )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:865:5: this_AttributeAssigment_0= ruleAttributeAssigment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getAttributeAssigmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeAssigment_in_ruleAssignment1785);
                    this_AttributeAssigment_0=ruleAttributeAssigment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeAssigment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:875:5: this_ObjectSyntax_1= ruleObjectSyntax
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getObjectSyntaxParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleObjectSyntax_in_ruleAssignment1812);
                    this_ObjectSyntax_1=ruleObjectSyntax();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ObjectSyntax_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:885:5: this_Invocation_2= ruleInvocation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getInvocationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvocation_in_ruleAssignment1839);
                    this_Invocation_2=ruleInvocation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Invocation_2; 
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAttributeAssigment"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:901:1: entryRuleAttributeAssigment returns [EObject current=null] : iv_ruleAttributeAssigment= ruleAttributeAssigment EOF ;
    public final EObject entryRuleAttributeAssigment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAssigment = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:902:2: (iv_ruleAttributeAssigment= ruleAttributeAssigment EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:903:2: iv_ruleAttributeAssigment= ruleAttributeAssigment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeAssigmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeAssigment_in_entryRuleAttributeAssigment1874);
            iv_ruleAttributeAssigment=ruleAttributeAssigment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeAssigment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeAssigment1884); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeAssigment"


    // $ANTLR start "ruleAttributeAssigment"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:910:1: ruleAttributeAssigment returns [EObject current=null] : ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleSourceExpression ) ) ) ;
    public final EObject ruleAttributeAssigment() throws RecognitionException {
        EObject current = null;

        Token lv_targetFeature_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:913:28: ( ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleSourceExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:914:1: ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleSourceExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:914:1: ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleSourceExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:914:2: ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleSourceExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:914:2: ( (lv_targetFeature_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:915:1: (lv_targetFeature_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:915:1: (lv_targetFeature_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:916:3: lv_targetFeature_0_0= RULE_ID
            {
            lv_targetFeature_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeAssigment1926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_targetFeature_0_0, grammarAccess.getAttributeAssigmentAccess().getTargetFeatureIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeAssigmentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"targetFeature",
                      		lv_targetFeature_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAttributeAssigment1943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeAssigmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:936:1: ( (lv_expr_2_0= ruleSourceExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:937:1: (lv_expr_2_0= ruleSourceExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:937:1: (lv_expr_2_0= ruleSourceExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:938:3: lv_expr_2_0= ruleSourceExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAssigmentAccess().getExprSourceExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSourceExpression_in_ruleAttributeAssigment1964);
            lv_expr_2_0=ruleSourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeAssigmentRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"SourceExpression");
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
    // $ANTLR end "ruleAttributeAssigment"


    // $ANTLR start "entryRuleSourceExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:962:1: entryRuleSourceExpression returns [EObject current=null] : iv_ruleSourceExpression= ruleSourceExpression EOF ;
    public final EObject entryRuleSourceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:963:2: (iv_ruleSourceExpression= ruleSourceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:964:2: iv_ruleSourceExpression= ruleSourceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSourceExpression_in_entryRuleSourceExpression2000);
            iv_ruleSourceExpression=ruleSourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSourceExpression2010); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSourceExpression"


    // $ANTLR start "ruleSourceExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:971:1: ruleSourceExpression returns [EObject current=null] : this_WithOptionalVariableExpression_0= ruleWithOptionalVariableExpression ;
    public final EObject ruleSourceExpression() throws RecognitionException {
        EObject current = null;

        EObject this_WithOptionalVariableExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:974:28: (this_WithOptionalVariableExpression_0= ruleWithOptionalVariableExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:976:5: this_WithOptionalVariableExpression_0= ruleWithOptionalVariableExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSourceExpressionAccess().getWithOptionalVariableExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleWithOptionalVariableExpression_in_ruleSourceExpression2056);
            this_WithOptionalVariableExpression_0=ruleWithOptionalVariableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_WithOptionalVariableExpression_0; 
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
    // $ANTLR end "ruleSourceExpression"


    // $ANTLR start "entryRuleWithOptionalVariableExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:992:1: entryRuleWithOptionalVariableExpression returns [EObject current=null] : iv_ruleWithOptionalVariableExpression= ruleWithOptionalVariableExpression EOF ;
    public final EObject entryRuleWithOptionalVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithOptionalVariableExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:993:2: (iv_ruleWithOptionalVariableExpression= ruleWithOptionalVariableExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:994:2: iv_ruleWithOptionalVariableExpression= ruleWithOptionalVariableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWithOptionalVariableExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWithOptionalVariableExpression_in_entryRuleWithOptionalVariableExpression2090);
            iv_ruleWithOptionalVariableExpression=ruleWithOptionalVariableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWithOptionalVariableExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWithOptionalVariableExpression2100); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWithOptionalVariableExpression"


    // $ANTLR start "ruleWithOptionalVariableExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1001:1: ruleWithOptionalVariableExpression returns [EObject current=null] : ( ( ( (lv_variable_0_0= ruleObjectSourceVariable ) ) otherlv_1= ':' )? ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleWithOptionalVariableExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1004:28: ( ( ( ( (lv_variable_0_0= ruleObjectSourceVariable ) ) otherlv_1= ':' )? ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1005:1: ( ( ( (lv_variable_0_0= ruleObjectSourceVariable ) ) otherlv_1= ':' )? ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1005:1: ( ( ( (lv_variable_0_0= ruleObjectSourceVariable ) ) otherlv_1= ':' )? ( (lv_expr_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1005:2: ( ( (lv_variable_0_0= ruleObjectSourceVariable ) ) otherlv_1= ':' )? ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1005:2: ( ( (lv_variable_0_0= ruleObjectSourceVariable ) ) otherlv_1= ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==22) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1005:3: ( (lv_variable_0_0= ruleObjectSourceVariable ) ) otherlv_1= ':'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1005:3: ( (lv_variable_0_0= ruleObjectSourceVariable ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1006:1: (lv_variable_0_0= ruleObjectSourceVariable )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1006:1: (lv_variable_0_0= ruleObjectSourceVariable )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1007:3: lv_variable_0_0= ruleObjectSourceVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWithOptionalVariableExpressionAccess().getVariableObjectSourceVariableParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleObjectSourceVariable_in_ruleWithOptionalVariableExpression2147);
                    lv_variable_0_0=ruleObjectSourceVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWithOptionalVariableExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_0_0, 
                              		"ObjectSourceVariable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWithOptionalVariableExpression2159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getWithOptionalVariableExpressionAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1027:3: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1028:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1028:1: (lv_expr_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1029:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWithOptionalVariableExpressionAccess().getExprExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWithOptionalVariableExpression2182);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWithOptionalVariableExpressionRule());
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
    // $ANTLR end "ruleWithOptionalVariableExpression"


    // $ANTLR start "entryRuleObjectSourceVariable"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1053:1: entryRuleObjectSourceVariable returns [EObject current=null] : iv_ruleObjectSourceVariable= ruleObjectSourceVariable EOF ;
    public final EObject entryRuleObjectSourceVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSourceVariable = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1054:2: (iv_ruleObjectSourceVariable= ruleObjectSourceVariable EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1055:2: iv_ruleObjectSourceVariable= ruleObjectSourceVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSourceVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleObjectSourceVariable_in_entryRuleObjectSourceVariable2218);
            iv_ruleObjectSourceVariable=ruleObjectSourceVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSourceVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObjectSourceVariable2228); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectSourceVariable"


    // $ANTLR start "ruleObjectSourceVariable"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1062:1: ruleObjectSourceVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleObjectSourceVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1065:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1066:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1066:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1067:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1067:1: (lv_name_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1068:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleObjectSourceVariable2269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getObjectSourceVariableAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSourceVariableRule());
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
    // $ANTLR end "ruleObjectSourceVariable"


    // $ANTLR start "entryRuleObjectSyntax"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1092:1: entryRuleObjectSyntax returns [EObject current=null] : iv_ruleObjectSyntax= ruleObjectSyntax EOF ;
    public final EObject entryRuleObjectSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSyntax = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1093:2: (iv_ruleObjectSyntax= ruleObjectSyntax EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1094:2: iv_ruleObjectSyntax= ruleObjectSyntax EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSyntaxRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleObjectSyntax_in_entryRuleObjectSyntax2309);
            iv_ruleObjectSyntax=ruleObjectSyntax();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSyntax; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObjectSyntax2319); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectSyntax"


    // $ANTLR start "ruleObjectSyntax"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1101:1: ruleObjectSyntax returns [EObject current=null] : ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'from' ( (lv_expr_3_0= ruleSourceExpression ) ) ( (lv_multivalued_4_0= '*' ) )? otherlv_5= 'to' )? ( (lv_object_6_0= ruleObjectInstantiation ) ) ) ;
    public final EObject ruleObjectSyntax() throws RecognitionException {
        EObject current = null;

        Token lv_targetFeature_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_multivalued_4_0=null;
        Token otherlv_5=null;
        EObject lv_expr_3_0 = null;

        EObject lv_object_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1104:28: ( ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'from' ( (lv_expr_3_0= ruleSourceExpression ) ) ( (lv_multivalued_4_0= '*' ) )? otherlv_5= 'to' )? ( (lv_object_6_0= ruleObjectInstantiation ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1105:1: ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'from' ( (lv_expr_3_0= ruleSourceExpression ) ) ( (lv_multivalued_4_0= '*' ) )? otherlv_5= 'to' )? ( (lv_object_6_0= ruleObjectInstantiation ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1105:1: ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'from' ( (lv_expr_3_0= ruleSourceExpression ) ) ( (lv_multivalued_4_0= '*' ) )? otherlv_5= 'to' )? ( (lv_object_6_0= ruleObjectInstantiation ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1105:2: ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'from' ( (lv_expr_3_0= ruleSourceExpression ) ) ( (lv_multivalued_4_0= '*' ) )? otherlv_5= 'to' )? ( (lv_object_6_0= ruleObjectInstantiation ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1105:2: ( (lv_targetFeature_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1106:1: (lv_targetFeature_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1106:1: (lv_targetFeature_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1107:3: lv_targetFeature_0_0= RULE_ID
            {
            lv_targetFeature_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleObjectSyntax2361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_targetFeature_0_0, grammarAccess.getObjectSyntaxAccess().getTargetFeatureIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSyntaxRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"targetFeature",
                      		lv_targetFeature_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleObjectSyntax2378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getObjectSyntaxAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1127:1: (otherlv_2= 'from' ( (lv_expr_3_0= ruleSourceExpression ) ) ( (lv_multivalued_4_0= '*' ) )? otherlv_5= 'to' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1127:3: otherlv_2= 'from' ( (lv_expr_3_0= ruleSourceExpression ) ) ( (lv_multivalued_4_0= '*' ) )? otherlv_5= 'to'
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleObjectSyntax2391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getObjectSyntaxAccess().getFromKeyword_2_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1131:1: ( (lv_expr_3_0= ruleSourceExpression ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1132:1: (lv_expr_3_0= ruleSourceExpression )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1132:1: (lv_expr_3_0= ruleSourceExpression )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1133:3: lv_expr_3_0= ruleSourceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSyntaxAccess().getExprSourceExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSourceExpression_in_ruleObjectSyntax2412);
                    lv_expr_3_0=ruleSourceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getObjectSyntaxRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_3_0, 
                              		"SourceExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1149:2: ( (lv_multivalued_4_0= '*' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1150:1: (lv_multivalued_4_0= '*' )
                            {
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1150:1: (lv_multivalued_4_0= '*' )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1151:3: lv_multivalued_4_0= '*'
                            {
                            lv_multivalued_4_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleObjectSyntax2430); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_multivalued_4_0, grammarAccess.getObjectSyntaxAccess().getMultivaluedAsteriskKeyword_2_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getObjectSyntaxRule());
                              	        }
                                     		setWithLastConsumed(current, "multivalued", true, "*");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleObjectSyntax2456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getObjectSyntaxAccess().getToKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1168:3: ( (lv_object_6_0= ruleObjectInstantiation ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1169:1: (lv_object_6_0= ruleObjectInstantiation )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1169:1: (lv_object_6_0= ruleObjectInstantiation )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1170:3: lv_object_6_0= ruleObjectInstantiation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSyntaxAccess().getObjectObjectInstantiationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleObjectInstantiation_in_ruleObjectSyntax2479);
            lv_object_6_0=ruleObjectInstantiation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObjectSyntaxRule());
              	        }
                     		set(
                     			current, 
                     			"object",
                      		lv_object_6_0, 
                      		"ObjectInstantiation");
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
    // $ANTLR end "ruleObjectSyntax"


    // $ANTLR start "entryRuleInvocation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1194:1: entryRuleInvocation returns [EObject current=null] : iv_ruleInvocation= ruleInvocation EOF ;
    public final EObject entryRuleInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1195:2: (iv_ruleInvocation= ruleInvocation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1196:2: iv_ruleInvocation= ruleInvocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvocationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvocation_in_entryRuleInvocation2515);
            iv_ruleInvocation=ruleInvocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvocation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvocation2525); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvocation"


    // $ANTLR start "ruleInvocation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1203:1: ruleInvocation returns [EObject current=null] : ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleSourceExpression ) ) ( (lv_multivalued_5_0= '*' ) )? otherlv_6= ')' ) ;
    public final EObject ruleInvocation() throws RecognitionException {
        EObject current = null;

        Token lv_targetFeature_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_multivalued_5_0=null;
        Token otherlv_6=null;
        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1206:28: ( ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleSourceExpression ) ) ( (lv_multivalued_5_0= '*' ) )? otherlv_6= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1207:1: ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleSourceExpression ) ) ( (lv_multivalued_5_0= '*' ) )? otherlv_6= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1207:1: ( ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleSourceExpression ) ) ( (lv_multivalued_5_0= '*' ) )? otherlv_6= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1207:2: ( (lv_targetFeature_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleSourceExpression ) ) ( (lv_multivalued_5_0= '*' ) )? otherlv_6= ')'
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1207:2: ( (lv_targetFeature_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1208:1: (lv_targetFeature_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1208:1: (lv_targetFeature_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1209:3: lv_targetFeature_0_0= RULE_ID
            {
            lv_targetFeature_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInvocation2567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_targetFeature_0_0, grammarAccess.getInvocationAccess().getTargetFeatureIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInvocationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"targetFeature",
                      		lv_targetFeature_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInvocation2584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvocationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1229:1: ( (otherlv_2= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1230:1: (otherlv_2= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1230:1: (otherlv_2= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1231:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInvocationRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInvocation2604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getInvocationAccess().getTemplateTemplateCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvocation2616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInvocationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1246:1: ( (lv_expr_4_0= ruleSourceExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1247:1: (lv_expr_4_0= ruleSourceExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1247:1: (lv_expr_4_0= ruleSourceExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1248:3: lv_expr_4_0= ruleSourceExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvocationAccess().getExprSourceExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSourceExpression_in_ruleInvocation2637);
            lv_expr_4_0=ruleSourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvocationRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_4_0, 
                      		"SourceExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1264:2: ( (lv_multivalued_5_0= '*' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1265:1: (lv_multivalued_5_0= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1265:1: (lv_multivalued_5_0= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1266:3: lv_multivalued_5_0= '*'
                    {
                    lv_multivalued_5_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInvocation2655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multivalued_5_0, grammarAccess.getInvocationAccess().getMultivaluedAsteriskKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInvocationRule());
                      	        }
                             		setWithLastConsumed(current, "multivalued", true, "*");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvocation2681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInvocationAccess().getRightParenthesisKeyword_6());
                  
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
    // $ANTLR end "ruleInvocation"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1291:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1292:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1293:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2718);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2729); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1300:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1303:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1304:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1304:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1304:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1312:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2795); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1327:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1328:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1329:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2841);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2852); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1336:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1339:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1340:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1340:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1340:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1340:2: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1341:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEInt2891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2908); if (state.failed) return current;
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


    // $ANTLR start "entryRuleTraceDefinition"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1363:1: entryRuleTraceDefinition returns [EObject current=null] : iv_ruleTraceDefinition= ruleTraceDefinition EOF ;
    public final EObject entryRuleTraceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceDefinition = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1364:2: (iv_ruleTraceDefinition= ruleTraceDefinition EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1365:2: iv_ruleTraceDefinition= ruleTraceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition2955);
            iv_ruleTraceDefinition=ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceDefinition2965); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1372:1: ruleTraceDefinition returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1375:28: ( (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1376:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1376:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1376:3: otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTraceDefinition3002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1380:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1381:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1381:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1382:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceDefinition3023);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1398:2: ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1398:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1398:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1398:5: otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTraceDefinition3037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1402:1: ( (lv_elements_3_0= ruleTraceElementInline ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1403:1: (lv_elements_3_0= ruleTraceElementInline )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1403:1: (lv_elements_3_0= ruleTraceElementInline )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1404:3: lv_elements_3_0= ruleTraceElementInline
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition3058);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1420:2: (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==31) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1420:4: otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTraceDefinition3071); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1424:1: ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1425:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1425:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1426:3: lv_elements_5_0= ruleTraceElementInline
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition3092);
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
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTraceDefinition3106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1447:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1447:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1447:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1447:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1448:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1448:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1449:3: lv_elements_7_0= ruleTraceElementExpanded
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition3135);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1465:2: ( (lv_elements_8_0= ruleTraceElementExpanded ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==32) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1466:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1466:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1467:3: lv_elements_8_0= ruleTraceElementExpanded
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition3156);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTraceDefinition3169); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1495:1: entryRuleTraceElementInline returns [EObject current=null] : iv_ruleTraceElementInline= ruleTraceElementInline EOF ;
    public final EObject entryRuleTraceElementInline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementInline = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1496:2: (iv_ruleTraceElementInline= ruleTraceElementInline EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1497:2: iv_ruleTraceElementInline= ruleTraceElementInline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline3207);
            iv_ruleTraceElementInline=ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementInline; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementInline3217); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1504:1: ruleTraceElementInline returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementInline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1507:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1508:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1508:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1508:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1508:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1509:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1509:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1510:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementInline3263);
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

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTraceElementInline3275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceElementInlineAccess().getColonKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1530:1: ( (lv_type_2_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1531:1: (lv_type_2_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1531:1: (lv_type_2_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1532:3: lv_type_2_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementInline3296);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1556:1: entryRuleTraceElementExpanded returns [EObject current=null] : iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF ;
    public final EObject entryRuleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementExpanded = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1557:2: (iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1558:2: iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded3332);
            iv_ruleTraceElementExpanded=ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementExpanded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementExpanded3342); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1565:1: ruleTraceElementExpanded returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1568:28: ( (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1569:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1569:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1569:3: otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTraceElementExpanded3379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1573:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1574:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1574:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1575:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementExpanded3400);
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTraceElementExpanded3412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1595:1: ( (lv_type_3_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1596:1: (lv_type_3_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1596:1: (lv_type_3_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1597:3: lv_type_3_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded3433);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1621:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1622:2: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1623:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression3469);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpression3479); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1630:1: ruleTypeExpression returns [EObject current=null] : this_ClassUse_0= ruleClassUse ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassUse_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1633:28: (this_ClassUse_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1635:5: this_ClassUse_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTypeExpression3525);
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


    // $ANTLR start "entryRulePotencyAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1653:1: entryRulePotencyAnnotation returns [EObject current=null] : iv_rulePotencyAnnotation= rulePotencyAnnotation EOF ;
    public final EObject entryRulePotencyAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotencyAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1654:2: (iv_rulePotencyAnnotation= rulePotencyAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1655:2: iv_rulePotencyAnnotation= rulePotencyAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotencyAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation3561);
            iv_rulePotencyAnnotation=rulePotencyAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotencyAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePotencyAnnotation3571); if (state.failed) return current;

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
    // $ANTLR end "entryRulePotencyAnnotation"


    // $ANTLR start "rulePotencyAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1662:1: rulePotencyAnnotation returns [EObject current=null] : ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject rulePotencyAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1665:28: ( ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1666:1: ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1666:1: ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1666:2: (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1666:2: (otherlv_0= '@' | otherlv_1= '^' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            else if ( (LA21_0==34) ) {
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1666:4: otherlv_0= '@'
                    {
                    otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulePotencyAnnotation3609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPotencyAnnotationAccess().getCommercialAtKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1671:7: otherlv_1= '^'
                    {
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePotencyAnnotation3627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPotencyAnnotationAccess().getCircumflexAccentKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1675:2: ( (lv_value_2_0= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1676:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1676:1: (lv_value_2_0= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1677:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePotencyAnnotation3645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getPotencyAnnotationAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPotencyAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"INT");
              	    
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
    // $ANTLR end "rulePotencyAnnotation"


    // $ANTLR start "entryRuleDefineVariable"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1703:1: entryRuleDefineVariable returns [EObject current=null] : iv_ruleDefineVariable= ruleDefineVariable EOF ;
    public final EObject entryRuleDefineVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineVariable = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1704:2: (iv_ruleDefineVariable= ruleDefineVariable EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1705:2: iv_ruleDefineVariable= ruleDefineVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable3688);
            iv_ruleDefineVariable=ruleDefineVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefineVariable3698); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1712:1: ruleDefineVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDefineVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1715:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1716:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1716:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1716:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1716:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1717:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1717:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1718:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDefineVariable3744);
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

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDefineVariable3756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1738:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1739:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1739:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1740:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDefineVariable3777);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1764:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1765:2: (iv_ruleModelReference= ruleModelReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1766:2: iv_ruleModelReference= ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_entryRuleModelReference3813);
            iv_ruleModelReference=ruleModelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelReference3823); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1773:1: ruleModelReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1776:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1777:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1777:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1777:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1777:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1778:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1778:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1779:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModelReference3868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModelReference3880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1794:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1795:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1795:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1796:3: lv_className_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelReference3901);
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


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1820:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1821:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1822:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3937);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression3947); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1829:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1832:28: ( (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1833:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1833:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration )
            int alt22=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 29:
            case 41:
            case 42:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||(LA22_2>=RULE_ID && LA22_2<=RULE_STRING)||(LA22_2>=14 && LA22_2<=15)||LA22_2==24||(LA22_2>=27 && LA22_2<=29)||(LA22_2>=36 && LA22_2<=38)||(LA22_2>=43 && LA22_2<=44)) ) {
                    alt22=2;
                }
                else if ( (LA22_2==19) ) {
                    alt22=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt22=4;
                }
                break;
            case 39:
                {
                alt22=5;
                }
                break;
            case 23:
                {
                alt22=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1834:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression3994);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1844:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rulePrimaryExpression4021);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1854:5: this_ModelReference_2= ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_rulePrimaryExpression4048);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1864:5: this_ParenthesizedExpression_3= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression4075);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1874:5: this_MatchTraceExpression_4= ruleMatchTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression4102);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1884:5: this_ClosureDeclaration_5= ruleClosureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression4129);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1900:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1901:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1902:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression4164);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedExpression4174); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1909:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1912:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1913:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1913:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1913:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParenthesizedExpression4211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParenthesizedExpression4233);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedExpression4244); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1938:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1939:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1940:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral4280);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral4290); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1947:1: ruleLiteral returns [EObject current=null] : (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_FloatLiteral_0 = null;

        EObject this_NumLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1950:28: ( (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1951:1: (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1951:1: (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||(LA23_1>=RULE_ID && LA23_1<=RULE_STRING)||(LA23_1>=14 && LA23_1<=15)||LA23_1==24||(LA23_1>=27 && LA23_1<=29)||LA23_1==36||LA23_1==38||(LA23_1>=43 && LA23_1<=44)) ) {
                    alt23=2;
                }
                else if ( (LA23_1==37) ) {
                    int LA23_5 = input.LA(3);

                    if ( (LA23_5==RULE_INT) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_5>=RULE_ID && LA23_5<=RULE_STRING)) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt23=2;
                }
                break;
            case RULE_STRING:
                {
                alt23=3;
                }
                break;
            case 41:
            case 42:
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1952:5: this_FloatLiteral_0= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_ruleLiteral4337);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1962:5: this_NumLiteral_1= ruleNumLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_ruleLiteral4364);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1972:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleLiteral4391);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1982:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_ruleLiteral4418);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_3; 
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1998:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:1999:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2000:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference4453);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference4463); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2007:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2010:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2011:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2011:1: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2012:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2012:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2013:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableReference4507); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2032:1: entryRuleClosureDeclaration returns [EObject current=null] : iv_ruleClosureDeclaration= ruleClosureDeclaration EOF ;
    public final EObject entryRuleClosureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureDeclaration = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2033:2: (iv_ruleClosureDeclaration= ruleClosureDeclaration EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2034:2: iv_ruleClosureDeclaration= ruleClosureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration4542);
            iv_ruleClosureDeclaration=ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureDeclaration4552); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2041:1: ruleClosureDeclaration returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2044:28: ( (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2045:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2045:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2045:3: otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleClosureDeclaration4589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2049:1: (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2049:3: otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|'
                    {
                    otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleClosureDeclaration4602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2053:1: ( (lv_formalParameters_2_0= ruleClosureParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2054:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2054:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2055:3: lv_formalParameters_2_0= ruleClosureParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration4623);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2071:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2071:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleClosureDeclaration4636); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2075:1: ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2076:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2076:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2077:3: lv_formalParameters_4_0= ruleClosureParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration4657);
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleClosureDeclaration4671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2097:3: ( (lv_statements_6_0= ruleStatement ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2098:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2098:1: (lv_statements_6_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2099:3: lv_statements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleClosureDeclaration4694);
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
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClosureDeclaration4707); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2127:1: entryRuleClosureParameter returns [EObject current=null] : iv_ruleClosureParameter= ruleClosureParameter EOF ;
    public final EObject entryRuleClosureParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2128:2: (iv_ruleClosureParameter= ruleClosureParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2129:2: iv_ruleClosureParameter= ruleClosureParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter4743);
            iv_ruleClosureParameter=ruleClosureParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureParameter4753); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2136:1: ruleClosureParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClosureParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2139:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2140:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2140:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2141:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2141:1: (lv_name_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2142:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClosureParameter4794); if (state.failed) return current;
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


    // $ANTLR start "entryRuleWithResolveMethodCall"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2168:1: entryRuleWithResolveMethodCall returns [EObject current=null] : iv_ruleWithResolveMethodCall= ruleWithResolveMethodCall EOF ;
    public final EObject entryRuleWithResolveMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithResolveMethodCall = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2169:2: (iv_ruleWithResolveMethodCall= ruleWithResolveMethodCall EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2170:2: iv_ruleWithResolveMethodCall= ruleWithResolveMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWithResolveMethodCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWithResolveMethodCall_in_entryRuleWithResolveMethodCall4836);
            iv_ruleWithResolveMethodCall=ruleWithResolveMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWithResolveMethodCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWithResolveMethodCall4846); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWithResolveMethodCall"


    // $ANTLR start "ruleWithResolveMethodCall"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2177:1: ruleWithResolveMethodCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )? )+ | ( ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )? )+ )? ) ;
    public final EObject ruleWithResolveMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_isExternal_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_withParameters_15_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token lv_withParameters_24_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_isExternal_33_0=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_binaryOp_2_0 = null;

        EObject lv_right_3_0 = null;

        AntlrDatatypeRuleToken lv_linkName_8_0 = null;

        AntlrDatatypeRuleToken lv_featureName_10_0 = null;

        AntlrDatatypeRuleToken lv_methodName_14_0 = null;

        EObject lv_parameters_16_0 = null;

        EObject lv_parameters_18_0 = null;

        EObject lv_parameters_20_0 = null;

        AntlrDatatypeRuleToken lv_methodName_23_0 = null;

        EObject lv_parameters_25_0 = null;

        EObject lv_parameters_27_0 = null;

        EObject lv_parameters_29_0 = null;

        AntlrDatatypeRuleToken lv_linkName_34_0 = null;

        AntlrDatatypeRuleToken lv_featureName_36_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2180:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )? )+ | ( ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )? )+ )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2181:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )? )+ | ( ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )? )+ )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2181:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )? )+ | ( ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )? )+ )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2182:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )? )+ | ( ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )? )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleWithResolveMethodCall4893);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2190:1: ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )? )+ | ( ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )? )+ )?
            int alt41=4;
            switch ( input.LA(1) ) {
                case 29:
                case 43:
                case 44:
                    {
                    alt41=1;
                    }
                    break;
                case 27:
                    {
                    int LA41_2 = input.LA(2);

                    if ( ((LA41_2>=RULE_ID && LA41_2<=RULE_INT)||LA41_2==13||LA41_2==23||LA41_2==29||LA41_2==39||(LA41_2>=41 && LA41_2<=42)) ) {
                        alt41=1;
                    }
                    }
                    break;
                case 36:
                    {
                    alt41=2;
                    }
                    break;
                case 37:
                    {
                    alt41=3;
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2190:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2190:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2190:3: () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2190:3: ()
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2191:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getWithResolveMethodCallAccess().getBinaryExprLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2196:2: ( (lv_binaryOp_2_0= ruleBinaryOp ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2197:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2197:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2198:3: lv_binaryOp_2_0= ruleBinaryOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOp_in_ruleWithResolveMethodCall4924);
                    lv_binaryOp_2_0=ruleBinaryOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2214:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2215:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2215:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2216:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWithResolveMethodCall4945);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2233:6: ( ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )? )+
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2233:6: ( ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )? )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==36) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2233:7: ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' ) ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )?
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2233:7: ( () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']' )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2233:8: () otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )? ( (lv_linkName_8_0= ruleEString ) ) (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )? otherlv_11= ']'
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2233:8: ()
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2234:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getWithResolveMethodCallAccess().getResolveLinkExprAction_1_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleWithResolveMethodCall4975); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getWithResolveMethodCallAccess().getLeftSquareBracketKeyword_1_1_0_1());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2243:1: ( ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) ) )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==RULE_ID) ) {
                    	        int LA27_1 = input.LA(2);

                    	        if ( (LA27_1==19) ) {
                    	            alt27=1;
                    	        }
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2243:2: ( (otherlv_6= RULE_ID ) ) ( (lv_isExternal_7_0= '!' ) )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2243:2: ( (otherlv_6= RULE_ID ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2244:1: (otherlv_6= RULE_ID )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2244:1: (otherlv_6= RULE_ID )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2245:3: otherlv_6= RULE_ID
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              			if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getWithResolveMethodCallRule());
                    	              	        }
                    	                      
                    	            }
                    	            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleWithResolveMethodCall4996); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		newLeafNode(otherlv_6, grammarAccess.getWithResolveMethodCallAccess().getModuleUseDeclarationCrossReference_1_1_0_2_0_0()); 
                    	              	
                    	            }

                    	            }


                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2256:2: ( (lv_isExternal_7_0= '!' ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2257:1: (lv_isExternal_7_0= '!' )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2257:1: (lv_isExternal_7_0= '!' )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2258:3: lv_isExternal_7_0= '!'
                    	            {
                    	            lv_isExternal_7_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleWithResolveMethodCall5014); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_isExternal_7_0, grammarAccess.getWithResolveMethodCallAccess().getIsExternalExclamationMarkKeyword_1_1_0_2_1_0());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getWithResolveMethodCallRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "isExternal", true, "!");
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2271:4: ( (lv_linkName_8_0= ruleEString ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2272:1: (lv_linkName_8_0= ruleEString )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2272:1: (lv_linkName_8_0= ruleEString )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2273:3: lv_linkName_8_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getLinkNameEStringParserRuleCall_1_1_0_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWithResolveMethodCall5050);
                    	    lv_linkName_8_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"linkName",
                    	              		lv_linkName_8_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2289:2: (otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) ) )?
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==37) ) {
                    	        alt28=1;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2289:4: otherlv_9= '.' ( (lv_featureName_10_0= ruleEString ) )
                    	            {
                    	            otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleWithResolveMethodCall5063); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_9, grammarAccess.getWithResolveMethodCallAccess().getFullStopKeyword_1_1_0_4_0());
                    	                  
                    	            }
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2293:1: ( (lv_featureName_10_0= ruleEString ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2294:1: (lv_featureName_10_0= ruleEString )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2294:1: (lv_featureName_10_0= ruleEString )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2295:3: lv_featureName_10_0= ruleEString
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getFeatureNameEStringParserRuleCall_1_1_0_4_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWithResolveMethodCall5084);
                    	            lv_featureName_10_0=ruleEString();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"featureName",
                    	                      		lv_featureName_10_0, 
                    	                      		"EString");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleWithResolveMethodCall5098); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getWithResolveMethodCallAccess().getRightSquareBracketKeyword_1_1_0_5());
                    	          
                    	    }

                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2315:2: ( ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )? )?
                    	    int alt32=2;
                    	    int LA32_0 = input.LA(1);

                    	    if ( (LA32_0==37) && (synpred1_InternalTao())) {
                    	        alt32=1;
                    	    }
                    	    switch (alt32) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2315:3: ( ( () )=> () ) otherlv_13= '.' ( (lv_methodName_14_0= ruleEString ) ) ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )? ( (lv_parameters_20_0= ruleClosureDeclaration ) )?
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2315:3: ( ( () )=> () )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2315:4: ( () )=> ()
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2316:5: ()
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2317:5: 
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	                      current = forceCreateModelElementAndSet(
                    	                          grammarAccess.getWithResolveMethodCallAccess().getMethodCallReceptorAction_1_1_1_0_0(),
                    	                          current);
                    	                  
                    	            }

                    	            }


                    	            }

                    	            otherlv_13=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleWithResolveMethodCall5129); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_13, grammarAccess.getWithResolveMethodCallAccess().getFullStopKeyword_1_1_1_1());
                    	                  
                    	            }
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2326:1: ( (lv_methodName_14_0= ruleEString ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2327:1: (lv_methodName_14_0= ruleEString )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2327:1: (lv_methodName_14_0= ruleEString )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2328:3: lv_methodName_14_0= ruleEString
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_1_2_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWithResolveMethodCall5150);
                    	            lv_methodName_14_0=ruleEString();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"methodName",
                    	                      		lv_methodName_14_0, 
                    	                      		"EString");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2344:2: ( ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')' )?
                    	            int alt30=2;
                    	            int LA30_0 = input.LA(1);

                    	            if ( (LA30_0==13) ) {
                    	                alt30=1;
                    	            }
                    	            switch (alt30) {
                    	                case 1 :
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2344:3: ( (lv_withParameters_15_0= '(' ) ) ( (lv_parameters_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )* otherlv_19= ')'
                    	                    {
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2344:3: ( (lv_withParameters_15_0= '(' ) )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2345:1: (lv_withParameters_15_0= '(' )
                    	                    {
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2345:1: (lv_withParameters_15_0= '(' )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2346:3: lv_withParameters_15_0= '('
                    	                    {
                    	                    lv_withParameters_15_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWithResolveMethodCall5169); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                              newLeafNode(lv_withParameters_15_0, grammarAccess.getWithResolveMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_1_1_3_0_0());
                    	                          
                    	                    }
                    	                    if ( state.backtracking==0 ) {

                    	                      	        if (current==null) {
                    	                      	            current = createModelElement(grammarAccess.getWithResolveMethodCallRule());
                    	                      	        }
                    	                             		setWithLastConsumed(current, "withParameters", true, "(");
                    	                      	    
                    	                    }

                    	                    }


                    	                    }

                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2359:2: ( (lv_parameters_16_0= ruleExpression ) )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2360:1: (lv_parameters_16_0= ruleExpression )
                    	                    {
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2360:1: (lv_parameters_16_0= ruleExpression )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2361:3: lv_parameters_16_0= ruleExpression
                    	                    {
                    	                    if ( state.backtracking==0 ) {
                    	                       
                    	                      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getParametersExpressionParserRuleCall_1_1_1_3_1_0()); 
                    	                      	    
                    	                    }
                    	                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWithResolveMethodCall5203);
                    	                    lv_parameters_16_0=ruleExpression();

                    	                    state._fsp--;
                    	                    if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      	        if (current==null) {
                    	                      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	                      	        }
                    	                             		add(
                    	                             			current, 
                    	                             			"parameters",
                    	                              		lv_parameters_16_0, 
                    	                              		"Expression");
                    	                      	        afterParserOrEnumRuleCall();
                    	                      	    
                    	                    }

                    	                    }


                    	                    }

                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2377:2: (otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) ) )*
                    	                    loop29:
                    	                    do {
                    	                        int alt29=2;
                    	                        int LA29_0 = input.LA(1);

                    	                        if ( (LA29_0==14) ) {
                    	                            alt29=1;
                    	                        }


                    	                        switch (alt29) {
                    	                    	case 1 :
                    	                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2377:4: otherlv_17= ',' ( (lv_parameters_18_0= ruleExpression ) )
                    	                    	    {
                    	                    	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleWithResolveMethodCall5216); if (state.failed) return current;
                    	                    	    if ( state.backtracking==0 ) {

                    	                    	          	newLeafNode(otherlv_17, grammarAccess.getWithResolveMethodCallAccess().getCommaKeyword_1_1_1_3_2_0());
                    	                    	          
                    	                    	    }
                    	                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2381:1: ( (lv_parameters_18_0= ruleExpression ) )
                    	                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2382:1: (lv_parameters_18_0= ruleExpression )
                    	                    	    {
                    	                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2382:1: (lv_parameters_18_0= ruleExpression )
                    	                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2383:3: lv_parameters_18_0= ruleExpression
                    	                    	    {
                    	                    	    if ( state.backtracking==0 ) {
                    	                    	       
                    	                    	      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getParametersExpressionParserRuleCall_1_1_1_3_2_1_0()); 
                    	                    	      	    
                    	                    	    }
                    	                    	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWithResolveMethodCall5237);
                    	                    	    lv_parameters_18_0=ruleExpression();

                    	                    	    state._fsp--;
                    	                    	    if (state.failed) return current;
                    	                    	    if ( state.backtracking==0 ) {

                    	                    	      	        if (current==null) {
                    	                    	      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	                    	      	        }
                    	                    	             		add(
                    	                    	             			current, 
                    	                    	             			"parameters",
                    	                    	              		lv_parameters_18_0, 
                    	                    	              		"Expression");
                    	                    	      	        afterParserOrEnumRuleCall();
                    	                    	      	    
                    	                    	    }

                    	                    	    }


                    	                    	    }


                    	                    	    }
                    	                    	    break;

                    	                    	default :
                    	                    	    break loop29;
                    	                        }
                    	                    } while (true);

                    	                    otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWithResolveMethodCall5251); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                          	newLeafNode(otherlv_19, grammarAccess.getWithResolveMethodCallAccess().getRightParenthesisKeyword_1_1_1_3_3());
                    	                          
                    	                    }

                    	                    }
                    	                    break;

                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2403:3: ( (lv_parameters_20_0= ruleClosureDeclaration ) )?
                    	            int alt31=2;
                    	            int LA31_0 = input.LA(1);

                    	            if ( (LA31_0==23) ) {
                    	                alt31=1;
                    	            }
                    	            switch (alt31) {
                    	                case 1 :
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2404:1: (lv_parameters_20_0= ruleClosureDeclaration )
                    	                    {
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2404:1: (lv_parameters_20_0= ruleClosureDeclaration )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2405:3: lv_parameters_20_0= ruleClosureDeclaration
                    	                    {
                    	                    if ( state.backtracking==0 ) {
                    	                       
                    	                      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getParametersClosureDeclarationParserRuleCall_1_1_1_4_0()); 
                    	                      	    
                    	                    }
                    	                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_ruleWithResolveMethodCall5274);
                    	                    lv_parameters_20_0=ruleClosureDeclaration();

                    	                    state._fsp--;
                    	                    if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      	        if (current==null) {
                    	                      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	                      	        }
                    	                             		add(
                    	                             			current, 
                    	                             			"parameters",
                    	                              		lv_parameters_20_0, 
                    	                              		"ClosureDeclaration");
                    	                      	        afterParserOrEnumRuleCall();
                    	                      	    
                    	                    }

                    	                    }


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:6: ( ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )? )+
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:6: ( ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )? )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==37) && (synpred2_InternalTao())) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:7: ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? ) ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )?
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:7: ( ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )? )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:8: ( ( () )=> () ) otherlv_22= '.' ( (lv_methodName_23_0= ruleEString ) ) ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )? ( (lv_parameters_29_0= ruleClosureDeclaration ) )?
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:8: ( ( () )=> () )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:9: ( () )=> ()
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2423:5: ()
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2424:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getWithResolveMethodCallAccess().getMethodCallReceptorAction_1_2_0_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }


                    	    }

                    	    otherlv_22=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleWithResolveMethodCall5316); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_22, grammarAccess.getWithResolveMethodCallAccess().getFullStopKeyword_1_2_0_1());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2433:1: ( (lv_methodName_23_0= ruleEString ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2434:1: (lv_methodName_23_0= ruleEString )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2434:1: (lv_methodName_23_0= ruleEString )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2435:3: lv_methodName_23_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getMethodNameEStringParserRuleCall_1_2_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWithResolveMethodCall5337);
                    	    lv_methodName_23_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"methodName",
                    	              		lv_methodName_23_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2451:2: ( ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')' )?
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( (LA35_0==13) ) {
                    	        alt35=1;
                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2451:3: ( (lv_withParameters_24_0= '(' ) ) ( (lv_parameters_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )* otherlv_28= ')'
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2451:3: ( (lv_withParameters_24_0= '(' ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2452:1: (lv_withParameters_24_0= '(' )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2452:1: (lv_withParameters_24_0= '(' )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2453:3: lv_withParameters_24_0= '('
                    	            {
                    	            lv_withParameters_24_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWithResolveMethodCall5356); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_withParameters_24_0, grammarAccess.getWithResolveMethodCallAccess().getWithParametersLeftParenthesisKeyword_1_2_0_3_0_0());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getWithResolveMethodCallRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "withParameters", true, "(");
                    	              	    
                    	            }

                    	            }


                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2466:2: ( (lv_parameters_25_0= ruleExpression ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2467:1: (lv_parameters_25_0= ruleExpression )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2467:1: (lv_parameters_25_0= ruleExpression )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2468:3: lv_parameters_25_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getParametersExpressionParserRuleCall_1_2_0_3_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWithResolveMethodCall5390);
                    	            lv_parameters_25_0=ruleExpression();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"parameters",
                    	                      		lv_parameters_25_0, 
                    	                      		"Expression");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2484:2: (otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) ) )*
                    	            loop34:
                    	            do {
                    	                int alt34=2;
                    	                int LA34_0 = input.LA(1);

                    	                if ( (LA34_0==14) ) {
                    	                    alt34=1;
                    	                }


                    	                switch (alt34) {
                    	            	case 1 :
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2484:4: otherlv_26= ',' ( (lv_parameters_27_0= ruleExpression ) )
                    	            	    {
                    	            	    otherlv_26=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleWithResolveMethodCall5403); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	          	newLeafNode(otherlv_26, grammarAccess.getWithResolveMethodCallAccess().getCommaKeyword_1_2_0_3_2_0());
                    	            	          
                    	            	    }
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2488:1: ( (lv_parameters_27_0= ruleExpression ) )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2489:1: (lv_parameters_27_0= ruleExpression )
                    	            	    {
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2489:1: (lv_parameters_27_0= ruleExpression )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2490:3: lv_parameters_27_0= ruleExpression
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {
                    	            	       
                    	            	      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getParametersExpressionParserRuleCall_1_2_0_3_2_1_0()); 
                    	            	      	    
                    	            	    }
                    	            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWithResolveMethodCall5424);
                    	            	    lv_parameters_27_0=ruleExpression();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      	        if (current==null) {
                    	            	      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	            	      	        }
                    	            	             		add(
                    	            	             			current, 
                    	            	             			"parameters",
                    	            	              		lv_parameters_27_0, 
                    	            	              		"Expression");
                    	            	      	        afterParserOrEnumRuleCall();
                    	            	      	    
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop34;
                    	                }
                    	            } while (true);

                    	            otherlv_28=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWithResolveMethodCall5438); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_28, grammarAccess.getWithResolveMethodCallAccess().getRightParenthesisKeyword_1_2_0_3_3());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2510:3: ( (lv_parameters_29_0= ruleClosureDeclaration ) )?
                    	    int alt36=2;
                    	    int LA36_0 = input.LA(1);

                    	    if ( (LA36_0==23) ) {
                    	        alt36=1;
                    	    }
                    	    switch (alt36) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2511:1: (lv_parameters_29_0= ruleClosureDeclaration )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2511:1: (lv_parameters_29_0= ruleClosureDeclaration )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2512:3: lv_parameters_29_0= ruleClosureDeclaration
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getParametersClosureDeclarationParserRuleCall_1_2_0_4_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_ruleWithResolveMethodCall5461);
                    	            lv_parameters_29_0=ruleClosureDeclaration();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"parameters",
                    	                      		lv_parameters_29_0, 
                    	                      		"ClosureDeclaration");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2528:4: ( () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']' )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==36) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2528:5: () otherlv_31= '[' ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )? ( (lv_linkName_34_0= ruleEString ) ) (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )? otherlv_37= ']'
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2528:5: ()
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2529:5: 
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	                      current = forceCreateModelElementAndSet(
                    	                          grammarAccess.getWithResolveMethodCallAccess().getResolveLinkExprAction_1_2_1_0(),
                    	                          current);
                    	                  
                    	            }

                    	            }

                    	            otherlv_31=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleWithResolveMethodCall5485); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_31, grammarAccess.getWithResolveMethodCallAccess().getLeftSquareBracketKeyword_1_2_1_1());
                    	                  
                    	            }
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2538:1: ( ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) ) )?
                    	            int alt37=2;
                    	            int LA37_0 = input.LA(1);

                    	            if ( (LA37_0==RULE_ID) ) {
                    	                int LA37_1 = input.LA(2);

                    	                if ( (LA37_1==19) ) {
                    	                    alt37=1;
                    	                }
                    	            }
                    	            switch (alt37) {
                    	                case 1 :
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2538:2: ( (otherlv_32= RULE_ID ) ) ( (lv_isExternal_33_0= '!' ) )
                    	                    {
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2538:2: ( (otherlv_32= RULE_ID ) )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2539:1: (otherlv_32= RULE_ID )
                    	                    {
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2539:1: (otherlv_32= RULE_ID )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2540:3: otherlv_32= RULE_ID
                    	                    {
                    	                    if ( state.backtracking==0 ) {

                    	                      			if (current==null) {
                    	                      	            current = createModelElement(grammarAccess.getWithResolveMethodCallRule());
                    	                      	        }
                    	                              
                    	                    }
                    	                    otherlv_32=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleWithResolveMethodCall5506); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      		newLeafNode(otherlv_32, grammarAccess.getWithResolveMethodCallAccess().getModuleUseDeclarationCrossReference_1_2_1_2_0_0()); 
                    	                      	
                    	                    }

                    	                    }


                    	                    }

                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2551:2: ( (lv_isExternal_33_0= '!' ) )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2552:1: (lv_isExternal_33_0= '!' )
                    	                    {
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2552:1: (lv_isExternal_33_0= '!' )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2553:3: lv_isExternal_33_0= '!'
                    	                    {
                    	                    lv_isExternal_33_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleWithResolveMethodCall5524); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                              newLeafNode(lv_isExternal_33_0, grammarAccess.getWithResolveMethodCallAccess().getIsExternalExclamationMarkKeyword_1_2_1_2_1_0());
                    	                          
                    	                    }
                    	                    if ( state.backtracking==0 ) {

                    	                      	        if (current==null) {
                    	                      	            current = createModelElement(grammarAccess.getWithResolveMethodCallRule());
                    	                      	        }
                    	                             		setWithLastConsumed(current, "isExternal", true, "!");
                    	                      	    
                    	                    }

                    	                    }


                    	                    }


                    	                    }
                    	                    break;

                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2566:4: ( (lv_linkName_34_0= ruleEString ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2567:1: (lv_linkName_34_0= ruleEString )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2567:1: (lv_linkName_34_0= ruleEString )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2568:3: lv_linkName_34_0= ruleEString
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getLinkNameEStringParserRuleCall_1_2_1_3_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWithResolveMethodCall5560);
                    	            lv_linkName_34_0=ruleEString();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"linkName",
                    	                      		lv_linkName_34_0, 
                    	                      		"EString");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2584:2: (otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) ) )?
                    	            int alt38=2;
                    	            int LA38_0 = input.LA(1);

                    	            if ( (LA38_0==37) ) {
                    	                alt38=1;
                    	            }
                    	            switch (alt38) {
                    	                case 1 :
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2584:4: otherlv_35= '.' ( (lv_featureName_36_0= ruleEString ) )
                    	                    {
                    	                    otherlv_35=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleWithResolveMethodCall5573); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                          	newLeafNode(otherlv_35, grammarAccess.getWithResolveMethodCallAccess().getFullStopKeyword_1_2_1_4_0());
                    	                          
                    	                    }
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2588:1: ( (lv_featureName_36_0= ruleEString ) )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2589:1: (lv_featureName_36_0= ruleEString )
                    	                    {
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2589:1: (lv_featureName_36_0= ruleEString )
                    	                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2590:3: lv_featureName_36_0= ruleEString
                    	                    {
                    	                    if ( state.backtracking==0 ) {
                    	                       
                    	                      	        newCompositeNode(grammarAccess.getWithResolveMethodCallAccess().getFeatureNameEStringParserRuleCall_1_2_1_4_1_0()); 
                    	                      	    
                    	                    }
                    	                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWithResolveMethodCall5594);
                    	                    lv_featureName_36_0=ruleEString();

                    	                    state._fsp--;
                    	                    if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      	        if (current==null) {
                    	                      	            current = createModelElementForParent(grammarAccess.getWithResolveMethodCallRule());
                    	                      	        }
                    	                             		set(
                    	                             			current, 
                    	                             			"featureName",
                    	                              		lv_featureName_36_0, 
                    	                              		"EString");
                    	                      	        afterParserOrEnumRuleCall();
                    	                      	    
                    	                    }

                    	                    }


                    	                    }


                    	                    }
                    	                    break;

                    	            }

                    	            otherlv_37=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleWithResolveMethodCall5608); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_37, grammarAccess.getWithResolveMethodCallAccess().getRightSquareBracketKeyword_1_2_1_5());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
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
    // $ANTLR end "ruleWithResolveMethodCall"


    // $ANTLR start "entryRuleMatchTraceExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2620:1: entryRuleMatchTraceExpression returns [EObject current=null] : iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF ;
    public final EObject entryRuleMatchTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2621:2: (iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2622:2: iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression5652);
            iv_ruleMatchTraceExpression=ruleMatchTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchTraceExpression5662); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2629:1: ruleMatchTraceExpression returns [EObject current=null] : (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2632:28: ( (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2633:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2633:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2633:3: otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMatchTraceExpression5699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2637:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==19) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2637:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression5711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMatchTraceExpression5722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2645:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2646:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2646:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2647:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMatchTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression5744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMatchTraceExpression5756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMatchTraceExpression5768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2666:1: ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2667:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2667:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2668:3: lv_traceExpr_6_0= ruleTraceExprLanguage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression5789);
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

            otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMatchTraceExpression5801); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2696:1: entryRuleTraceExprLanguage returns [EObject current=null] : iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF ;
    public final EObject entryRuleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExprLanguage = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2697:2: (iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2698:2: iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceExprLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage5837);
            iv_ruleTraceExprLanguage=ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceExprLanguage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceExprLanguage5847); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2705:1: ruleTraceExprLanguage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2708:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2709:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2709:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2709:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2709:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2710:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2710:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2711:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTraceExprLanguageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraceExprLanguage5892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTraceExprLanguage5904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2726:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2727:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2727:1: (lv_expr_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2728:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTraceExprLanguage5925);
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


    // $ANTLR start "entryRulePutTraceParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2754:1: entryRulePutTraceParameter returns [EObject current=null] : iv_rulePutTraceParameter= rulePutTraceParameter EOF ;
    public final EObject entryRulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2755:2: (iv_rulePutTraceParameter= rulePutTraceParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2756:2: iv_rulePutTraceParameter= rulePutTraceParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter5963);
            iv_rulePutTraceParameter=rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceParameter5973); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2763:1: rulePutTraceParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2766:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2767:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2767:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2767:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2767:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2768:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2768:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2769:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceParameterRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceParameter6018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePutTraceParameter6030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2784:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2785:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2785:1: (lv_value_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2786:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePutTraceParameter6051);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2810:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2811:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2812:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6087);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumLiteral6097); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2819:1: ruleNumLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2822:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2823:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2823:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2824:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2824:1: (lv_value_0_0= ruleEInt )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2825:3: lv_value_0_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumLiteral6142);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2849:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2850:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2851:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral6177);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatLiteral6187); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2858:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2861:28: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2862:1: ( (lv_value_0_0= ruleEDouble ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2862:1: ( (lv_value_0_0= ruleEDouble ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2863:1: (lv_value_0_0= ruleEDouble )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2863:1: (lv_value_0_0= ruleEDouble )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2864:3: lv_value_0_0= ruleEDouble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFloatLiteralAccess().getValueEDoubleParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleFloatLiteral6232);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2888:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2889:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2890:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble6268);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble6279); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2897:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2900:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2901:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2901:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2901:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble6319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEDouble6337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble6352); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2929:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2930:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2931:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6397);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral6407); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2938:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2941:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2942:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2942:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2943:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2943:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2944:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringLiteral6448); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2968:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2969:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2970:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6488);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteral6498); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2977:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2980:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2981:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2981:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2982:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2982:1: (lv_value_0_0= ruleEBoolean )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2983:3: lv_value_0_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueEBooleanParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBooleanLiteral6543);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBooleanLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"EBoolean");
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3007:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3008:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3009:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean6579);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean6590); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3016:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3019:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3020:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3020:1: (kw= 'true' | kw= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            else if ( (LA43_0==42) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3021:2: kw= 'true'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEBoolean6628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3028:2: kw= 'false'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEBoolean6647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                          
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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleBinaryOp"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3043:1: ruleBinaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleBinaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3045:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3046:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3046:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt44=1;
                }
                break;
            case 29:
                {
                alt44=2;
                }
                break;
            case 27:
                {
                alt44=3;
                }
                break;
            case 44:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3046:2: (enumLiteral_0= '+' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3046:2: (enumLiteral_0= '+' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3046:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleBinaryOp6703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3052:6: (enumLiteral_1= '-' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3052:6: (enumLiteral_1= '-' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3052:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBinaryOp6720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3058:6: (enumLiteral_2= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3058:6: (enumLiteral_2= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3058:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBinaryOp6737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3064:6: (enumLiteral_3= '/' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3064:6: (enumLiteral_3= '/' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:3064:8: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBinaryOp6754); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalTao
    public final void synpred1_InternalTao_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2315:4: ( () )
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2315:5: ()
        {
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2315:5: ()
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2316:1: 
        {
        }


        }
    }
    // $ANTLR end synpred1_InternalTao

    // $ANTLR start synpred2_InternalTao
    public final void synpred2_InternalTao_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:9: ( () )
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:10: ()
        {
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2422:10: ()
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalTao.g:2423:1: 
        {
        }


        }
    }
    // $ANTLR end synpred2_InternalTao

    // Delegated rules

    public final boolean synpred1_InternalTao() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTao_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTao() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTao_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\13\uffff";
    static final String DFA11_eofS =
        "\4\uffff\1\5\4\uffff\2\5";
    static final String DFA11_minS =
        "\1\4\1\31\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4";
    static final String DFA11_maxS =
        "\1\4\1\31\1\52\1\uffff\1\54\1\uffff\1\5\1\uffff\1\52\2\54";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff\1\3\3\uffff";
    static final String DFA11_specialS =
        "\13\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\2\5\6\uffff\1\5\11\uffff\1\5\2\uffff\1\3\2\uffff\1\5\11"+
            "\uffff\1\5\1\uffff\2\5",
            "",
            "\1\5\10\uffff\1\7\5\uffff\1\6\2\uffff\1\10\1\uffff\1\5\2\uffff"+
            "\1\5\1\uffff\1\5\6\uffff\2\5\5\uffff\2\5",
            "",
            "\1\11\1\5",
            "",
            "\1\12\2\5\6\uffff\1\5\11\uffff\1\5\5\uffff\1\5\11\uffff\1\5"+
            "\1\uffff\2\5",
            "\1\5\22\uffff\1\3\1\5\2\uffff\1\5\1\uffff\1\5\6\uffff\2\5\5"+
            "\uffff\2\5",
            "\1\5\16\uffff\1\6\4\uffff\1\5\2\uffff\1\5\1\uffff\1\5\6\uffff"+
            "\2\5\5\uffff\2\5"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "864:1: (this_AttributeAssigment_0= ruleAttributeAssigment | this_ObjectSyntax_1= ruleObjectSyntax | this_Invocation_2= ruleInvocation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTaoTransformation_in_entryRuleTaoTransformation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaoTransformation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleTaoTransformation122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaoTransformation143 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTaoTransformation155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleTaoTransformation176 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaoTransformation189 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleTaoTransformation210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaoTransformation224 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTaoTransformation236 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTaoTransformation248 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleTaoTransformation269 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaoTransformation282 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleTaoTransformation303 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaoTransformation317 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_ruleUsesStatements_in_ruleTaoTransformation338 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_ruleTemplate_in_ruleTaoTransformation360 = new BitSet(new long[]{0x0000000000120002L});
        public static final BitSet FOLLOW_ruleUsesStatements_in_entryRuleUsesStatements397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUsesStatements407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUseDeclaration_in_ruleUsesStatements453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUseDeclaration_in_entryRuleUseDeclaration487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUseDeclaration497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleUseDeclaration534 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUseDeclaration555 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleUseDeclaration568 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUseDeclaration589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_entryRuleClassUse728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassUse738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse783 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleClassUse795 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate853 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplate863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleTemplate900 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplate917 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTemplate934 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplate955 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTemplate968 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplate989 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTemplate1003 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateRootObject_in_ruleTemplate1024 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleTemplate1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter1072 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter1082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateParameter1124 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTemplateParameter1141 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTemplateParameter1162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_ruleStatement1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWithResolveMethodCall_in_ruleExpression1344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateRootObject_in_entryRuleTemplateRootObject1378 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateRootObject1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateRootObject1431 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTemplateRootObject1448 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTemplateRootObject1471 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTemplateRootObject1483 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleTemplateRootObject1504 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_24_in_ruleTemplateRootObject1517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectInstantiation_in_entryRuleObjectInstantiation1553 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObjectInstantiation1563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleObjectInstantiation1606 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleObjectInstantiation1623 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleObjectInstantiation1646 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleObjectInstantiation1658 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleObjectInstantiation1679 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_24_in_ruleObjectInstantiation1692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeAssigment_in_ruleAssignment1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectSyntax_in_ruleAssignment1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvocation_in_ruleAssignment1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeAssigment_in_entryRuleAttributeAssigment1874 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeAssigment1884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeAssigment1926 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleAttributeAssigment1943 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleSourceExpression_in_ruleAttributeAssigment1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSourceExpression_in_entryRuleSourceExpression2000 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSourceExpression2010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWithOptionalVariableExpression_in_ruleSourceExpression2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWithOptionalVariableExpression_in_entryRuleWithOptionalVariableExpression2090 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWithOptionalVariableExpression2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectSourceVariable_in_ruleWithOptionalVariableExpression2147 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleWithOptionalVariableExpression2159 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWithOptionalVariableExpression2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectSourceVariable_in_entryRuleObjectSourceVariable2218 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObjectSourceVariable2228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleObjectSourceVariable2269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectSyntax_in_entryRuleObjectSyntax2309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObjectSyntax2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleObjectSyntax2361 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleObjectSyntax2378 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_26_in_ruleObjectSyntax2391 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleSourceExpression_in_ruleObjectSyntax2412 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleObjectSyntax2430 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleObjectSyntax2456 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_ruleObjectInstantiation_in_ruleObjectSyntax2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvocation_in_entryRuleInvocation2515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvocation2525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInvocation2567 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleInvocation2584 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInvocation2604 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvocation2616 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleSourceExpression_in_ruleInvocation2637 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleInvocation2655 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInvocation2681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEInt2891 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition2955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceDefinition2965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleTraceDefinition3002 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceDefinition3023 = new BitSet(new long[]{0x0000000100800000L});
        public static final BitSet FOLLOW_23_in_ruleTraceDefinition3037 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition3058 = new BitSet(new long[]{0x0000000081000000L});
        public static final BitSet FOLLOW_31_in_ruleTraceDefinition3071 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition3092 = new BitSet(new long[]{0x0000000081000000L});
        public static final BitSet FOLLOW_24_in_ruleTraceDefinition3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition3135 = new BitSet(new long[]{0x0000000100A00000L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition3156 = new BitSet(new long[]{0x0000000100A00000L});
        public static final BitSet FOLLOW_21_in_ruleTraceDefinition3169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline3207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementInline3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementInline3263 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTraceElementInline3275 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementInline3296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded3332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementExpanded3342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleTraceElementExpanded3379 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementExpanded3400 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTraceElementExpanded3412 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded3433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression3469 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpression3479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTypeExpression3525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation3561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePotencyAnnotation3571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rulePotencyAnnotation3609 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_34_in_rulePotencyAnnotation3627 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePotencyAnnotation3645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable3688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefineVariable3698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDefineVariable3744 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleDefineVariable3756 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDefineVariable3777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference3813 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelReference3823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModelReference3868 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleModelReference3880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelReference3901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3937 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rulePrimaryExpression4021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_rulePrimaryExpression4048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression4075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression4102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression4129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression4164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression4174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleParenthesizedExpression4211 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression4233 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedExpression4244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral4280 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral4290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral4337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_ruleLiteral4364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral4391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral4418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference4453 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference4463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference4507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration4542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureDeclaration4552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleClosureDeclaration4589 = new BitSet(new long[]{0x0000000800000030L});
        public static final BitSet FOLLOW_35_in_ruleClosureDeclaration4602 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration4623 = new BitSet(new long[]{0x0000000800004000L});
        public static final BitSet FOLLOW_14_in_ruleClosureDeclaration4636 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration4657 = new BitSet(new long[]{0x0000000800004000L});
        public static final BitSet FOLLOW_35_in_ruleClosureDeclaration4671 = new BitSet(new long[]{0x0000000800000030L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleClosureDeclaration4694 = new BitSet(new long[]{0x0000000801000030L});
        public static final BitSet FOLLOW_24_in_ruleClosureDeclaration4707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter4743 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureParameter4753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClosureParameter4794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWithResolveMethodCall_in_entryRuleWithResolveMethodCall4836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWithResolveMethodCall4846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleWithResolveMethodCall4893 = new BitSet(new long[]{0x0000183028000002L});
        public static final BitSet FOLLOW_ruleBinaryOp_in_ruleWithResolveMethodCall4924 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWithResolveMethodCall4945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleWithResolveMethodCall4975 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleWithResolveMethodCall4996 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleWithResolveMethodCall5014 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWithResolveMethodCall5050 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleWithResolveMethodCall5063 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWithResolveMethodCall5084 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleWithResolveMethodCall5098 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_37_in_ruleWithResolveMethodCall5129 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWithResolveMethodCall5150 = new BitSet(new long[]{0x0000069020802072L});
        public static final BitSet FOLLOW_13_in_ruleWithResolveMethodCall5169 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWithResolveMethodCall5203 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleWithResolveMethodCall5216 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWithResolveMethodCall5237 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleWithResolveMethodCall5251 = new BitSet(new long[]{0x0000069020802072L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_ruleWithResolveMethodCall5274 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_37_in_ruleWithResolveMethodCall5316 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWithResolveMethodCall5337 = new BitSet(new long[]{0x000006B020802072L});
        public static final BitSet FOLLOW_13_in_ruleWithResolveMethodCall5356 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWithResolveMethodCall5390 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleWithResolveMethodCall5403 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWithResolveMethodCall5424 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleWithResolveMethodCall5438 = new BitSet(new long[]{0x000006B020802072L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_ruleWithResolveMethodCall5461 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_36_in_ruleWithResolveMethodCall5485 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleWithResolveMethodCall5506 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleWithResolveMethodCall5524 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWithResolveMethodCall5560 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleWithResolveMethodCall5573 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWithResolveMethodCall5594 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleWithResolveMethodCall5608 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression5652 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchTraceExpression5662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMatchTraceExpression5699 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression5711 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMatchTraceExpression5722 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression5744 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleMatchTraceExpression5756 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMatchTraceExpression5768 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression5789 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleMatchTraceExpression5801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage5837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceExprLanguage5847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraceExprLanguage5892 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTraceExprLanguage5904 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTraceExprLanguage5925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter5963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceParameter5973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceParameter6018 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulePutTraceParameter6030 = new BitSet(new long[]{0x0000068020802070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePutTraceParameter6051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral6097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumLiteral6142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral6177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral6187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleFloatLiteral6232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble6268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble6279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble6319 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleEDouble6337 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble6352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral6498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanLiteral6543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean6579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean6590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEBoolean6628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEBoolean6647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleBinaryOp6703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBinaryOp6720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleBinaryOp6737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleBinaryOp6754 = new BitSet(new long[]{0x0000000000000002L});
    }


}