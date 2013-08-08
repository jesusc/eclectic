package org.eclectic.frontend.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclectic.frontend.services.ChainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'chain'", "'('", "','", "')'", "'->'", "'end'", "'composite'", "'='", "'external'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g"; }



     	private ChainGrammarAccess grammarAccess;
     	
        public InternalChainParser(TokenStream input, ChainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MappingTransformation";	
       	}
       	
       	@Override
       	protected ChainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMappingTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:67:1: entryRuleMappingTransformation returns [EObject current=null] : iv_ruleMappingTransformation= ruleMappingTransformation EOF ;
    public final EObject entryRuleMappingTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:68:2: (iv_ruleMappingTransformation= ruleMappingTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:69:2: iv_ruleMappingTransformation= ruleMappingTransformation EOF
            {
             newCompositeNode(grammarAccess.getMappingTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation75);
            iv_ruleMappingTransformation=ruleMappingTransformation();

            state._fsp--;

             current =iv_ruleMappingTransformation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMappingTransformation85); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:76:1: ruleMappingTransformation returns [EObject current=null] : (otherlv_0= 'chain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_externals_13_0= ruleExternalTransformation ) )* ( (lv_composites_14_0= ruleCompositeTransformation ) )* ( (lv_executions_15_0= ruleTransformationExecution ) )+ otherlv_16= 'end' ) ;
    public final EObject ruleMappingTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inModels_3_0 = null;

        EObject lv_inModels_5_0 = null;

        EObject lv_outModels_9_0 = null;

        EObject lv_outModels_11_0 = null;

        EObject lv_externals_13_0 = null;

        EObject lv_composites_14_0 = null;

        EObject lv_executions_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:79:28: ( (otherlv_0= 'chain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_externals_13_0= ruleExternalTransformation ) )* ( (lv_composites_14_0= ruleCompositeTransformation ) )* ( (lv_executions_15_0= ruleTransformationExecution ) )+ otherlv_16= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:80:1: (otherlv_0= 'chain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_externals_13_0= ruleExternalTransformation ) )* ( (lv_composites_14_0= ruleCompositeTransformation ) )* ( (lv_executions_15_0= ruleTransformationExecution ) )+ otherlv_16= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:80:1: (otherlv_0= 'chain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_externals_13_0= ruleExternalTransformation ) )* ( (lv_composites_14_0= ruleCompositeTransformation ) )* ( (lv_executions_15_0= ruleTransformationExecution ) )+ otherlv_16= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:80:3: otherlv_0= 'chain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_externals_13_0= ruleExternalTransformation ) )* ( (lv_composites_14_0= ruleCompositeTransformation ) )* ( (lv_executions_15_0= ruleTransformationExecution ) )+ otherlv_16= 'end'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMappingTransformation122); 

                	newLeafNode(otherlv_0, grammarAccess.getMappingTransformationAccess().getChainKeyword_0());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:85:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMappingTransformation143);
            lv_name_1_0=ruleEString();

            state._fsp--;


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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMappingTransformation155); 

                	newLeafNode(otherlv_2, grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_2());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:106:1: ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:107:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:107:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:108:3: lv_inModels_3_0= ruleTransformationDefinitionParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation176);
                    lv_inModels_3_0=ruleTransformationDefinitionParameter();

                    state._fsp--;


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
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:124:3: (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:124:5: otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMappingTransformation190); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMappingTransformationAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:128:1: ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:129:1: (lv_inModels_5_0= ruleTransformationDefinitionParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:129:1: (lv_inModels_5_0= ruleTransformationDefinitionParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:130:3: lv_inModels_5_0= ruleTransformationDefinitionParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation211);
            	    lv_inModels_5_0=ruleTransformationDefinitionParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMappingTransformation225); 

                	newLeafNode(otherlv_6, grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMappingTransformation237); 

                	newLeafNode(otherlv_7, grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_6());
                
            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMappingTransformation249); 

                	newLeafNode(otherlv_8, grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_7());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:158:1: ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:159:1: (lv_outModels_9_0= ruleTransformationDefinitionParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:159:1: (lv_outModels_9_0= ruleTransformationDefinitionParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:160:3: lv_outModels_9_0= ruleTransformationDefinitionParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation270);
                    lv_outModels_9_0=ruleTransformationDefinitionParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
                    	        }
                           		add(
                           			current, 
                           			"outModels",
                            		lv_outModels_9_0, 
                            		"TransformationDefinitionParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:176:3: (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:176:5: otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) )
            	    {
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMappingTransformation284); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMappingTransformationAccess().getCommaKeyword_9_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:180:1: ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:181:1: (lv_outModels_11_0= ruleTransformationDefinitionParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:181:1: (lv_outModels_11_0= ruleTransformationDefinitionParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:182:3: lv_outModels_11_0= ruleTransformationDefinitionParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation305);
            	    lv_outModels_11_0=ruleTransformationDefinitionParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMappingTransformation319); 

                	newLeafNode(otherlv_12, grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_10());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:202:1: ( (lv_externals_13_0= ruleExternalTransformation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:203:1: (lv_externals_13_0= ruleExternalTransformation )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:203:1: (lv_externals_13_0= ruleExternalTransformation )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:204:3: lv_externals_13_0= ruleExternalTransformation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getExternalsExternalTransformationParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExternalTransformation_in_ruleMappingTransformation340);
            	    lv_externals_13_0=ruleExternalTransformation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"externals",
            	            		lv_externals_13_0, 
            	            		"ExternalTransformation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:220:3: ( (lv_composites_14_0= ruleCompositeTransformation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:221:1: (lv_composites_14_0= ruleCompositeTransformation )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:221:1: (lv_composites_14_0= ruleCompositeTransformation )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:222:3: lv_composites_14_0= ruleCompositeTransformation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getCompositesCompositeTransformationParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeTransformation_in_ruleMappingTransformation362);
            	    lv_composites_14_0=ruleCompositeTransformation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"composites",
            	            		lv_composites_14_0, 
            	            		"CompositeTransformation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:238:3: ( (lv_executions_15_0= ruleTransformationExecution ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:239:1: (lv_executions_15_0= ruleTransformationExecution )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:239:1: (lv_executions_15_0= ruleTransformationExecution )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:240:3: lv_executions_15_0= ruleTransformationExecution
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getExecutionsTransformationExecutionParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationExecution_in_ruleMappingTransformation384);
            	    lv_executions_15_0=ruleTransformationExecution();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"executions",
            	            		lv_executions_15_0, 
            	            		"TransformationExecution");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMappingTransformation397); 

                	newLeafNode(otherlv_16, grammarAccess.getMappingTransformationAccess().getEndKeyword_14());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:268:1: entryRuleTransformationDefinitionParameter returns [EObject current=null] : iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF ;
    public final EObject entryRuleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationDefinitionParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:269:2: (iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:270:2: iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF
            {
             newCompositeNode(grammarAccess.getTransformationDefinitionParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter433);
            iv_ruleTransformationDefinitionParameter=ruleTransformationDefinitionParameter();

            state._fsp--;

             current =iv_ruleTransformationDefinitionParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter443); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:277:1: ruleTransformationDefinitionParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:280:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:281:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:281:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:281:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:281:2: ()
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:282:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0(),
                        current);
                

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:287:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:288:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:288:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:289:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter498);
            lv_name_1_0=ruleEString();

            state._fsp--;


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

             leaveRule(); 
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


    // $ANTLR start "entryRuleCompositeTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:313:1: entryRuleCompositeTransformation returns [EObject current=null] : iv_ruleCompositeTransformation= ruleCompositeTransformation EOF ;
    public final EObject entryRuleCompositeTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:314:2: (iv_ruleCompositeTransformation= ruleCompositeTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:315:2: iv_ruleCompositeTransformation= ruleCompositeTransformation EOF
            {
             newCompositeNode(grammarAccess.getCompositeTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeTransformation_in_entryRuleCompositeTransformation534);
            iv_ruleCompositeTransformation=ruleCompositeTransformation();

            state._fsp--;

             current =iv_ruleCompositeTransformation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeTransformation544); 

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
    // $ANTLR end "entryRuleCompositeTransformation"


    // $ANTLR start "ruleCompositeTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:322:1: ruleCompositeTransformation returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_executions_13_0= ruleTransformationExecution ) )+ otherlv_14= 'end' ) ;
    public final EObject ruleCompositeTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inModels_3_0 = null;

        EObject lv_inModels_5_0 = null;

        EObject lv_outModels_9_0 = null;

        EObject lv_outModels_11_0 = null;

        EObject lv_executions_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:325:28: ( (otherlv_0= 'composite' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_executions_13_0= ruleTransformationExecution ) )+ otherlv_14= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:326:1: (otherlv_0= 'composite' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_executions_13_0= ruleTransformationExecution ) )+ otherlv_14= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:326:1: (otherlv_0= 'composite' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_executions_13_0= ruleTransformationExecution ) )+ otherlv_14= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:326:3: otherlv_0= 'composite' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )? (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )? (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* otherlv_12= ')' ( (lv_executions_13_0= ruleTransformationExecution ) )+ otherlv_14= 'end'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCompositeTransformation581); 

                	newLeafNode(otherlv_0, grammarAccess.getCompositeTransformationAccess().getCompositeKeyword_0());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:330:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:331:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:331:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:332:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompositeTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCompositeTransformation602);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeTransformationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCompositeTransformation614); 

                	newLeafNode(otherlv_2, grammarAccess.getCompositeTransformationAccess().getLeftParenthesisKeyword_2());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:352:1: ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:353:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:353:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:354:3: lv_inModels_3_0= ruleTransformationDefinitionParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompositeTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleCompositeTransformation635);
                    lv_inModels_3_0=ruleTransformationDefinitionParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompositeTransformationRule());
                    	        }
                           		add(
                           			current, 
                           			"inModels",
                            		lv_inModels_3_0, 
                            		"TransformationDefinitionParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:370:3: (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:370:5: otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCompositeTransformation649); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCompositeTransformationAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:374:1: ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:375:1: (lv_inModels_5_0= ruleTransformationDefinitionParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:375:1: (lv_inModels_5_0= ruleTransformationDefinitionParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:376:3: lv_inModels_5_0= ruleTransformationDefinitionParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleCompositeTransformation670);
            	    lv_inModels_5_0=ruleTransformationDefinitionParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompositeTransformationRule());
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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCompositeTransformation684); 

                	newLeafNode(otherlv_6, grammarAccess.getCompositeTransformationAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCompositeTransformation696); 

                	newLeafNode(otherlv_7, grammarAccess.getCompositeTransformationAccess().getHyphenMinusGreaterThanSignKeyword_6());
                
            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCompositeTransformation708); 

                	newLeafNode(otherlv_8, grammarAccess.getCompositeTransformationAccess().getLeftParenthesisKeyword_7());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:404:1: ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:405:1: (lv_outModels_9_0= ruleTransformationDefinitionParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:405:1: (lv_outModels_9_0= ruleTransformationDefinitionParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:406:3: lv_outModels_9_0= ruleTransformationDefinitionParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompositeTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleCompositeTransformation729);
                    lv_outModels_9_0=ruleTransformationDefinitionParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompositeTransformationRule());
                    	        }
                           		add(
                           			current, 
                           			"outModels",
                            		lv_outModels_9_0, 
                            		"TransformationDefinitionParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:422:3: (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:422:5: otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) )
            	    {
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCompositeTransformation743); 

            	        	newLeafNode(otherlv_10, grammarAccess.getCompositeTransformationAccess().getCommaKeyword_9_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:426:1: ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:427:1: (lv_outModels_11_0= ruleTransformationDefinitionParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:427:1: (lv_outModels_11_0= ruleTransformationDefinitionParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:428:3: lv_outModels_11_0= ruleTransformationDefinitionParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleCompositeTransformation764);
            	    lv_outModels_11_0=ruleTransformationDefinitionParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompositeTransformationRule());
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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCompositeTransformation778); 

                	newLeafNode(otherlv_12, grammarAccess.getCompositeTransformationAccess().getRightParenthesisKeyword_10());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:448:1: ( (lv_executions_13_0= ruleTransformationExecution ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:449:1: (lv_executions_13_0= ruleTransformationExecution )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:449:1: (lv_executions_13_0= ruleTransformationExecution )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:450:3: lv_executions_13_0= ruleTransformationExecution
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeTransformationAccess().getExecutionsTransformationExecutionParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationExecution_in_ruleCompositeTransformation799);
            	    lv_executions_13_0=ruleTransformationExecution();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompositeTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"executions",
            	            		lv_executions_13_0, 
            	            		"TransformationExecution");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCompositeTransformation812); 

                	newLeafNode(otherlv_14, grammarAccess.getCompositeTransformationAccess().getEndKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeTransformation"


    // $ANTLR start "entryRuleTransformationExecution"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:478:1: entryRuleTransformationExecution returns [EObject current=null] : iv_ruleTransformationExecution= ruleTransformationExecution EOF ;
    public final EObject entryRuleTransformationExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationExecution = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:479:2: (iv_ruleTransformationExecution= ruleTransformationExecution EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:480:2: iv_ruleTransformationExecution= ruleTransformationExecution EOF
            {
             newCompositeNode(grammarAccess.getTransformationExecutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationExecution_in_entryRuleTransformationExecution848);
            iv_ruleTransformationExecution=ruleTransformationExecution();

            state._fsp--;

             current =iv_ruleTransformationExecution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationExecution858); 

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
    // $ANTLR end "entryRuleTransformationExecution"


    // $ANTLR start "ruleTransformationExecution"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:487:1: ruleTransformationExecution returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleTransformationExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:490:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:491:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:491:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:491:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')'
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:491:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:492:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:492:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:493:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationExecutionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransformationExecution903); 

            		newLeafNode(otherlv_0, grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelCrossReference_0_0()); 
            	

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:504:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:504:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTransformationExecution916); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTransformationExecutionAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:508:1: ( (otherlv_2= RULE_ID ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:509:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:509:1: (otherlv_2= RULE_ID )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:510:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTransformationExecutionRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransformationExecution936); 

            	    		newLeafNode(otherlv_2, grammarAccess.getTransformationExecutionAccess().getOutputModelsRepresentModelCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransformationExecution950); 

                	newLeafNode(otherlv_3, grammarAccess.getTransformationExecutionAccess().getEqualsSignKeyword_2());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:525:1: ( (otherlv_4= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:526:1: (otherlv_4= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:526:1: (otherlv_4= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:527:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationExecutionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransformationExecution970); 

            		newLeafNode(otherlv_4, grammarAccess.getTransformationExecutionAccess().getTransformationAvailableTransformationCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransformationExecution982); 

                	newLeafNode(otherlv_5, grammarAccess.getTransformationExecutionAccess().getLeftParenthesisKeyword_4());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:542:1: ( (otherlv_6= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:543:1: (otherlv_6= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:543:1: (otherlv_6= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:544:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationExecutionRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransformationExecution1002); 

            		newLeafNode(otherlv_6, grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelCrossReference_5_0()); 
            	

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:555:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:555:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTransformationExecution1015); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTransformationExecutionAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:559:1: ( (otherlv_8= RULE_ID ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:560:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:560:1: (otherlv_8= RULE_ID )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:561:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTransformationExecutionRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransformationExecution1035); 

            	    		newLeafNode(otherlv_8, grammarAccess.getTransformationExecutionAccess().getInputModelsRepresentModelCrossReference_6_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTransformationExecution1049); 

                	newLeafNode(otherlv_9, grammarAccess.getTransformationExecutionAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformationExecution"


    // $ANTLR start "entryRuleExternalTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:584:1: entryRuleExternalTransformation returns [EObject current=null] : iv_ruleExternalTransformation= ruleExternalTransformation EOF ;
    public final EObject entryRuleExternalTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:585:2: (iv_ruleExternalTransformation= ruleExternalTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:586:2: iv_ruleExternalTransformation= ruleExternalTransformation EOF
            {
             newCompositeNode(grammarAccess.getExternalTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExternalTransformation_in_entryRuleExternalTransformation1085);
            iv_ruleExternalTransformation=ruleExternalTransformation();

            state._fsp--;

             current =iv_ruleExternalTransformation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExternalTransformation1095); 

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
    // $ANTLR end "entryRuleExternalTransformation"


    // $ANTLR start "ruleExternalTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:593:1: ruleExternalTransformation returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleExternalTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:596:28: ( (otherlv_0= 'external' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:597:1: (otherlv_0= 'external' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:597:1: (otherlv_0= 'external' ( (lv_name_1_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:597:3: otherlv_0= 'external' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExternalTransformation1132); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalTransformationAccess().getExternalKeyword_0());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:601:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:602:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:602:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:603:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExternalTransformationAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExternalTransformation1153);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalTransformationRule());
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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalTransformation"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:627:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:628:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:629:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1190);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1201); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:636:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:639:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:640:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:640:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:640:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1241); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalChain.g:648:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1267); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappingTransformation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMappingTransformation122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMappingTransformation143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMappingTransformation155 = new BitSet(new long[]{0x0000000000006030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation176 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleMappingTransformation190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation211 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleMappingTransformation225 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMappingTransformation237 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMappingTransformation249 = new BitSet(new long[]{0x0000000000006030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation270 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleMappingTransformation284 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation305 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleMappingTransformation319 = new BitSet(new long[]{0x00000000000A0010L});
        public static final BitSet FOLLOW_ruleExternalTransformation_in_ruleMappingTransformation340 = new BitSet(new long[]{0x00000000000A0010L});
        public static final BitSet FOLLOW_ruleCompositeTransformation_in_ruleMappingTransformation362 = new BitSet(new long[]{0x00000000000A0010L});
        public static final BitSet FOLLOW_ruleTransformationExecution_in_ruleMappingTransformation384 = new BitSet(new long[]{0x00000000000B0010L});
        public static final BitSet FOLLOW_16_in_ruleMappingTransformation397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter433 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeTransformation_in_entryRuleCompositeTransformation534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeTransformation544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleCompositeTransformation581 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCompositeTransformation602 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCompositeTransformation614 = new BitSet(new long[]{0x0000000000006030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleCompositeTransformation635 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleCompositeTransformation649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleCompositeTransformation670 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleCompositeTransformation684 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCompositeTransformation696 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCompositeTransformation708 = new BitSet(new long[]{0x0000000000006030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleCompositeTransformation729 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleCompositeTransformation743 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleCompositeTransformation764 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleCompositeTransformation778 = new BitSet(new long[]{0x00000000000A0010L});
        public static final BitSet FOLLOW_ruleTransformationExecution_in_ruleCompositeTransformation799 = new BitSet(new long[]{0x00000000000B0010L});
        public static final BitSet FOLLOW_16_in_ruleCompositeTransformation812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationExecution_in_entryRuleTransformationExecution848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationExecution858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransformationExecution903 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleTransformationExecution916 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransformationExecution936 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleTransformationExecution950 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransformationExecution970 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransformationExecution982 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransformationExecution1002 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleTransformationExecution1015 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransformationExecution1035 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleTransformationExecution1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExternalTransformation_in_entryRuleExternalTransformation1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExternalTransformation1095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleExternalTransformation1132 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExternalTransformation1153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1267 = new BitSet(new long[]{0x0000000000000002L});
    }


}