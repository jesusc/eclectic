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
import org.eclectic.frontend.services.MappingsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mappings'", "'('", "')'", "'->'", "':'", "'uses'", "'as'", "'delegate'", "'from'", "','", "'to'", "'!'", "'.'", "'end'", "'['", "']'", "'@'", "'^'", "'linking'", "'='", "'*'", "'<-'", "'convert'", "'true'", "'false'", "'-'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g"; }



     	private MappingsGrammarAccess grammarAccess;
     	
        public InternalMappingsParser(TokenStream input, MappingsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MappingTransformation";	
       	}
       	
       	@Override
       	protected MappingsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMappingTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:67:1: entryRuleMappingTransformation returns [EObject current=null] : iv_ruleMappingTransformation= ruleMappingTransformation EOF ;
    public final EObject entryRuleMappingTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:68:2: (iv_ruleMappingTransformation= ruleMappingTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:69:2: iv_ruleMappingTransformation= ruleMappingTransformation EOF
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:76:1: ruleMappingTransformation returns [EObject current=null] : (otherlv_0= 'mappings' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_annotations_9_0= ruleAnnotation ) )* ( (lv_uses_10_0= ruleUsesStatements ) )* ( (lv_delegates_11_0= ruleDelegate ) )* ( (lv_contexts_12_0= ruleContext ) )+ ) ;
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

        EObject lv_annotations_9_0 = null;

        EObject lv_uses_10_0 = null;

        EObject lv_delegates_11_0 = null;

        EObject lv_contexts_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:79:28: ( (otherlv_0= 'mappings' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_annotations_9_0= ruleAnnotation ) )* ( (lv_uses_10_0= ruleUsesStatements ) )* ( (lv_delegates_11_0= ruleDelegate ) )* ( (lv_contexts_12_0= ruleContext ) )+ ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:80:1: (otherlv_0= 'mappings' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_annotations_9_0= ruleAnnotation ) )* ( (lv_uses_10_0= ruleUsesStatements ) )* ( (lv_delegates_11_0= ruleDelegate ) )* ( (lv_contexts_12_0= ruleContext ) )+ )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:80:1: (otherlv_0= 'mappings' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_annotations_9_0= ruleAnnotation ) )* ( (lv_uses_10_0= ruleUsesStatements ) )* ( (lv_delegates_11_0= ruleDelegate ) )* ( (lv_contexts_12_0= ruleContext ) )+ )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:80:3: otherlv_0= 'mappings' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '(' ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) ) otherlv_8= ')' ( (lv_annotations_9_0= ruleAnnotation ) )* ( (lv_uses_10_0= ruleUsesStatements ) )* ( (lv_delegates_11_0= ruleDelegate ) )* ( (lv_contexts_12_0= ruleContext ) )+
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMappingTransformation122); 

                	newLeafNode(otherlv_0, grammarAccess.getMappingTransformationAccess().getMappingsKeyword_0());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:85:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:86:3: lv_name_1_0= ruleEString
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
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:106:1: ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:107:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:107:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:108:3: lv_inModels_3_0= ruleTransformationDefinitionParameter
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMappingTransformation188); 

                	newLeafNode(otherlv_4, grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMappingTransformation200); 

                	newLeafNode(otherlv_5, grammarAccess.getMappingTransformationAccess().getHyphenMinusGreaterThanSignKeyword_5());
                
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMappingTransformation212); 

                	newLeafNode(otherlv_6, grammarAccess.getMappingTransformationAccess().getLeftParenthesisKeyword_6());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:136:1: ( (lv_outModels_7_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:137:1: (lv_outModels_7_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:137:1: (lv_outModels_7_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:138:3: lv_outModels_7_0= ruleTransformationDefinitionParameter
            {
             
            	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation233);
            lv_outModels_7_0=ruleTransformationDefinitionParameter();

            state._fsp--;


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

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMappingTransformation245); 

                	newLeafNode(otherlv_8, grammarAccess.getMappingTransformationAccess().getRightParenthesisKeyword_8());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:158:1: ( (lv_annotations_9_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:159:1: (lv_annotations_9_0= ruleAnnotation )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:159:1: (lv_annotations_9_0= ruleAnnotation )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:160:3: lv_annotations_9_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getAnnotationsAnnotationParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleMappingTransformation266);
            	    lv_annotations_9_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_9_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:176:3: ( (lv_uses_10_0= ruleUsesStatements ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:177:1: (lv_uses_10_0= ruleUsesStatements )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:177:1: (lv_uses_10_0= ruleUsesStatements )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:178:3: lv_uses_10_0= ruleUsesStatements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getUsesUsesStatementsParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUsesStatements_in_ruleMappingTransformation288);
            	    lv_uses_10_0=ruleUsesStatements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"uses",
            	            		lv_uses_10_0, 
            	            		"UsesStatements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:194:3: ( (lv_delegates_11_0= ruleDelegate ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:195:1: (lv_delegates_11_0= ruleDelegate )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:195:1: (lv_delegates_11_0= ruleDelegate )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:196:3: lv_delegates_11_0= ruleDelegate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getDelegatesDelegateParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDelegate_in_ruleMappingTransformation310);
            	    lv_delegates_11_0=ruleDelegate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"delegates",
            	            		lv_delegates_11_0, 
            	            		"Delegate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:212:3: ( (lv_contexts_12_0= ruleContext ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:213:1: (lv_contexts_12_0= ruleContext )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:213:1: (lv_contexts_12_0= ruleContext )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:214:3: lv_contexts_12_0= ruleContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingTransformationAccess().getContextsContextParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleMappingTransformation332);
            	    lv_contexts_12_0=ruleContext();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contexts",
            	            		lv_contexts_12_0, 
            	            		"Context");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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


    // $ANTLR start "entryRuleAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:238:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:239:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:240:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation369);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation379); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:247:1: ruleAnnotation returns [EObject current=null] : this_MetamodelModelAnnotation_0= ruleMetamodelModelAnnotation ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_MetamodelModelAnnotation_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:250:28: (this_MetamodelModelAnnotation_0= ruleMetamodelModelAnnotation )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:252:5: this_MetamodelModelAnnotation_0= ruleMetamodelModelAnnotation
            {
             
                    newCompositeNode(grammarAccess.getAnnotationAccess().getMetamodelModelAnnotationParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMetamodelModelAnnotation_in_ruleAnnotation425);
            this_MetamodelModelAnnotation_0=ruleMetamodelModelAnnotation();

            state._fsp--;

             
                    current = this_MetamodelModelAnnotation_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleMetamodelModelAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:268:1: entryRuleMetamodelModelAnnotation returns [EObject current=null] : iv_ruleMetamodelModelAnnotation= ruleMetamodelModelAnnotation EOF ;
    public final EObject entryRuleMetamodelModelAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelModelAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:269:2: (iv_ruleMetamodelModelAnnotation= ruleMetamodelModelAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:270:2: iv_ruleMetamodelModelAnnotation= ruleMetamodelModelAnnotation EOF
            {
             newCompositeNode(grammarAccess.getMetamodelModelAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetamodelModelAnnotation_in_entryRuleMetamodelModelAnnotation459);
            iv_ruleMetamodelModelAnnotation=ruleMetamodelModelAnnotation();

            state._fsp--;

             current =iv_ruleMetamodelModelAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetamodelModelAnnotation469); 

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
    // $ANTLR end "entryRuleMetamodelModelAnnotation"


    // $ANTLR start "ruleMetamodelModelAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:277:1: ruleMetamodelModelAnnotation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetamodelModelAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_metamodel_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:280:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:281:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:281:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:281:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:281:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:282:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:282:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:283:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodelModelAnnotationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetamodelModelAnnotation514); 

            		newLeafNode(otherlv_0, grammarAccess.getMetamodelModelAnnotationAccess().getAnnotatedElementRepresentModelCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMetamodelModelAnnotation526); 

                	newLeafNode(otherlv_1, grammarAccess.getMetamodelModelAnnotationAccess().getColonKeyword_1());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:298:1: ( (lv_metamodel_2_0= RULE_STRING ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:299:1: (lv_metamodel_2_0= RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:299:1: (lv_metamodel_2_0= RULE_STRING )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:300:3: lv_metamodel_2_0= RULE_STRING
            {
            lv_metamodel_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMetamodelModelAnnotation543); 

            			newLeafNode(lv_metamodel_2_0, grammarAccess.getMetamodelModelAnnotationAccess().getMetamodelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodelModelAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"metamodel",
                    		lv_metamodel_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleMetamodelModelAnnotation"


    // $ANTLR start "entryRuleUsesStatements"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:324:1: entryRuleUsesStatements returns [EObject current=null] : iv_ruleUsesStatements= ruleUsesStatements EOF ;
    public final EObject entryRuleUsesStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesStatements = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:325:2: (iv_ruleUsesStatements= ruleUsesStatements EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:326:2: iv_ruleUsesStatements= ruleUsesStatements EOF
            {
             newCompositeNode(grammarAccess.getUsesStatementsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUsesStatements_in_entryRuleUsesStatements584);
            iv_ruleUsesStatements=ruleUsesStatements();

            state._fsp--;

             current =iv_ruleUsesStatements; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUsesStatements594); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:333:1: ruleUsesStatements returns [EObject current=null] : this_UseDeclaration_0= ruleUseDeclaration ;
    public final EObject ruleUsesStatements() throws RecognitionException {
        EObject current = null;

        EObject this_UseDeclaration_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:336:28: (this_UseDeclaration_0= ruleUseDeclaration )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:338:5: this_UseDeclaration_0= ruleUseDeclaration
            {
             
                    newCompositeNode(grammarAccess.getUsesStatementsAccess().getUseDeclarationParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUseDeclaration_in_ruleUsesStatements640);
            this_UseDeclaration_0=ruleUseDeclaration();

            state._fsp--;

             
                    current = this_UseDeclaration_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleUsesStatements"


    // $ANTLR start "entryRuleUseDeclaration"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:354:1: entryRuleUseDeclaration returns [EObject current=null] : iv_ruleUseDeclaration= ruleUseDeclaration EOF ;
    public final EObject entryRuleUseDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseDeclaration = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:355:2: (iv_ruleUseDeclaration= ruleUseDeclaration EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:356:2: iv_ruleUseDeclaration= ruleUseDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUseDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUseDeclaration_in_entryRuleUseDeclaration674);
            iv_ruleUseDeclaration=ruleUseDeclaration();

            state._fsp--;

             current =iv_ruleUseDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUseDeclaration684); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:363:1: ruleUseDeclaration returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleUseDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_module_1_0 = null;

        AntlrDatatypeRuleToken lv_as_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:366:28: ( (otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:367:1: (otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:367:1: (otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:367:3: otherlv_0= 'uses' ( (lv_module_1_0= ruleEString ) ) (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUseDeclaration721); 

                	newLeafNode(otherlv_0, grammarAccess.getUseDeclarationAccess().getUsesKeyword_0());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:371:1: ( (lv_module_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:372:1: (lv_module_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:372:1: (lv_module_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:373:3: lv_module_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUseDeclarationAccess().getModuleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUseDeclaration742);
            lv_module_1_0=ruleEString();

            state._fsp--;


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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:389:2: (otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:389:4: otherlv_2= 'as' ( (lv_as_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUseDeclaration755); 

                        	newLeafNode(otherlv_2, grammarAccess.getUseDeclarationAccess().getAsKeyword_2_0());
                        
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:393:1: ( (lv_as_3_0= ruleEString ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:394:1: (lv_as_3_0= ruleEString )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:394:1: (lv_as_3_0= ruleEString )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:395:3: lv_as_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseDeclarationAccess().getAsEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUseDeclaration776);
                    lv_as_3_0=ruleEString();

                    state._fsp--;


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
                    break;

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
    // $ANTLR end "ruleUseDeclaration"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:419:1: entryRuleTransformationDefinitionParameter returns [EObject current=null] : iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF ;
    public final EObject entryRuleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationDefinitionParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:420:2: (iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:421:2: iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF
            {
             newCompositeNode(grammarAccess.getTransformationDefinitionParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter814);
            iv_ruleTransformationDefinitionParameter=ruleTransformationDefinitionParameter();

            state._fsp--;

             current =iv_ruleTransformationDefinitionParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter824); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:428:1: ruleTransformationDefinitionParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:431:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:432:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:432:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:432:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:432:2: ()
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:433:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0(),
                        current);
                

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:438:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:439:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:439:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:440:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter879);
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


    // $ANTLR start "entryRuleDelegate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:464:1: entryRuleDelegate returns [EObject current=null] : iv_ruleDelegate= ruleDelegate EOF ;
    public final EObject entryRuleDelegate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegate = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:465:2: (iv_ruleDelegate= ruleDelegate EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:466:2: iv_ruleDelegate= ruleDelegate EOF
            {
             newCompositeNode(grammarAccess.getDelegateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelegate_in_entryRuleDelegate915);
            iv_ruleDelegate=ruleDelegate();

            state._fsp--;

             current =iv_ruleDelegate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelegate925); 

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
    // $ANTLR end "entryRuleDelegate"


    // $ANTLR start "ruleDelegate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:473:1: ruleDelegate returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'delegate' otherlv_2= 'from' ( (lv_left_3_0= ruleMatchedElement ) ) (otherlv_4= ',' ( (lv_left_5_0= ruleMatchedElement ) ) )* otherlv_6= 'to' ( ( (otherlv_7= RULE_ID ) ) ( (lv_isExternal_8_0= '!' ) ) ) ( (lv_linkName_9_0= ruleEString ) ) (otherlv_10= '.' ( (lv_featureName_11_0= ruleEString ) ) )? ) ;
    public final EObject ruleDelegate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_isExternal_8_0=null;
        Token otherlv_10=null;
        EObject lv_tags_0_0 = null;

        EObject lv_left_3_0 = null;

        EObject lv_left_5_0 = null;

        AntlrDatatypeRuleToken lv_linkName_9_0 = null;

        AntlrDatatypeRuleToken lv_featureName_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:476:28: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'delegate' otherlv_2= 'from' ( (lv_left_3_0= ruleMatchedElement ) ) (otherlv_4= ',' ( (lv_left_5_0= ruleMatchedElement ) ) )* otherlv_6= 'to' ( ( (otherlv_7= RULE_ID ) ) ( (lv_isExternal_8_0= '!' ) ) ) ( (lv_linkName_9_0= ruleEString ) ) (otherlv_10= '.' ( (lv_featureName_11_0= ruleEString ) ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:477:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'delegate' otherlv_2= 'from' ( (lv_left_3_0= ruleMatchedElement ) ) (otherlv_4= ',' ( (lv_left_5_0= ruleMatchedElement ) ) )* otherlv_6= 'to' ( ( (otherlv_7= RULE_ID ) ) ( (lv_isExternal_8_0= '!' ) ) ) ( (lv_linkName_9_0= ruleEString ) ) (otherlv_10= '.' ( (lv_featureName_11_0= ruleEString ) ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:477:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'delegate' otherlv_2= 'from' ( (lv_left_3_0= ruleMatchedElement ) ) (otherlv_4= ',' ( (lv_left_5_0= ruleMatchedElement ) ) )* otherlv_6= 'to' ( ( (otherlv_7= RULE_ID ) ) ( (lv_isExternal_8_0= '!' ) ) ) ( (lv_linkName_9_0= ruleEString ) ) (otherlv_10= '.' ( (lv_featureName_11_0= ruleEString ) ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:477:2: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'delegate' otherlv_2= 'from' ( (lv_left_3_0= ruleMatchedElement ) ) (otherlv_4= ',' ( (lv_left_5_0= ruleMatchedElement ) ) )* otherlv_6= 'to' ( ( (otherlv_7= RULE_ID ) ) ( (lv_isExternal_8_0= '!' ) ) ) ( (lv_linkName_9_0= ruleEString ) ) (otherlv_10= '.' ( (lv_featureName_11_0= ruleEString ) ) )?
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:477:2: ( (lv_tags_0_0= ruleTag ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:478:1: (lv_tags_0_0= ruleTag )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:478:1: (lv_tags_0_0= ruleTag )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:479:3: lv_tags_0_0= ruleTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDelegateAccess().getTagsTagParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTag_in_ruleDelegate971);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDelegateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"Tag");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDelegate984); 

                	newLeafNode(otherlv_1, grammarAccess.getDelegateAccess().getDelegateKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDelegate996); 

                	newLeafNode(otherlv_2, grammarAccess.getDelegateAccess().getFromKeyword_2());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:503:1: ( (lv_left_3_0= ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:504:1: (lv_left_3_0= ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:504:1: (lv_left_3_0= ruleMatchedElement )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:505:3: lv_left_3_0= ruleMatchedElement
            {
             
            	        newCompositeNode(grammarAccess.getDelegateAccess().getLeftMatchedElementParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_ruleDelegate1017);
            lv_left_3_0=ruleMatchedElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDelegateRule());
            	        }
                   		add(
                   			current, 
                   			"left",
                    		lv_left_3_0, 
                    		"MatchedElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:521:2: (otherlv_4= ',' ( (lv_left_5_0= ruleMatchedElement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:521:4: otherlv_4= ',' ( (lv_left_5_0= ruleMatchedElement ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDelegate1030); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDelegateAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:525:1: ( (lv_left_5_0= ruleMatchedElement ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:526:1: (lv_left_5_0= ruleMatchedElement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:526:1: (lv_left_5_0= ruleMatchedElement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:527:3: lv_left_5_0= ruleMatchedElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDelegateAccess().getLeftMatchedElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_ruleDelegate1051);
            	    lv_left_5_0=ruleMatchedElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDelegateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"left",
            	            		lv_left_5_0, 
            	            		"MatchedElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDelegate1065); 

                	newLeafNode(otherlv_6, grammarAccess.getDelegateAccess().getToKeyword_5());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:547:1: ( ( (otherlv_7= RULE_ID ) ) ( (lv_isExternal_8_0= '!' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:547:2: ( (otherlv_7= RULE_ID ) ) ( (lv_isExternal_8_0= '!' ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:547:2: ( (otherlv_7= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:548:1: (otherlv_7= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:548:1: (otherlv_7= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:549:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegateRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDelegate1086); 

            		newLeafNode(otherlv_7, grammarAccess.getDelegateAccess().getModuleUseDeclarationCrossReference_6_0_0()); 
            	

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:560:2: ( (lv_isExternal_8_0= '!' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:561:1: (lv_isExternal_8_0= '!' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:561:1: (lv_isExternal_8_0= '!' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:562:3: lv_isExternal_8_0= '!'
            {
            lv_isExternal_8_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDelegate1104); 

                    newLeafNode(lv_isExternal_8_0, grammarAccess.getDelegateAccess().getIsExternalExclamationMarkKeyword_6_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegateRule());
            	        }
                   		setWithLastConsumed(current, "isExternal", true, "!");
            	    

            }


            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:575:3: ( (lv_linkName_9_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:576:1: (lv_linkName_9_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:576:1: (lv_linkName_9_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:577:3: lv_linkName_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDelegateAccess().getLinkNameEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelegate1139);
            lv_linkName_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDelegateRule());
            	        }
                   		set(
                   			current, 
                   			"linkName",
                    		lv_linkName_9_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:593:2: (otherlv_10= '.' ( (lv_featureName_11_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:593:4: otherlv_10= '.' ( (lv_featureName_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDelegate1152); 

                        	newLeafNode(otherlv_10, grammarAccess.getDelegateAccess().getFullStopKeyword_8_0());
                        
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:597:1: ( (lv_featureName_11_0= ruleEString ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:598:1: (lv_featureName_11_0= ruleEString )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:598:1: (lv_featureName_11_0= ruleEString )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:599:3: lv_featureName_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDelegateAccess().getFeatureNameEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelegate1173);
                    lv_featureName_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDelegateRule());
                    	        }
                           		set(
                           			current, 
                           			"featureName",
                            		lv_featureName_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDelegate"


    // $ANTLR start "entryRuleContext"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:623:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:624:2: (iv_ruleContext= ruleContext EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:625:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext1211);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext1221); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:632:1: ruleContext returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'from' ( (lv_left_2_0= ruleMatchedElement ) ) (otherlv_3= ',' ( (lv_left_4_0= ruleMatchedElement ) ) )* otherlv_5= 'to' ( (lv_right_6_0= ruleMatchedElement ) ) (otherlv_7= ',' ( (lv_right_8_0= ruleMatchedElement ) ) )* ( (lv_modifiers_9_0= ruleC2CModifier ) )* ( ( (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference ) ) )* otherlv_11= 'end' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_tags_0_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_8_0 = null;

        EObject lv_modifiers_9_0 = null;

        EObject lv_mappings_10_1 = null;

        EObject lv_mappings_10_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:635:28: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'from' ( (lv_left_2_0= ruleMatchedElement ) ) (otherlv_3= ',' ( (lv_left_4_0= ruleMatchedElement ) ) )* otherlv_5= 'to' ( (lv_right_6_0= ruleMatchedElement ) ) (otherlv_7= ',' ( (lv_right_8_0= ruleMatchedElement ) ) )* ( (lv_modifiers_9_0= ruleC2CModifier ) )* ( ( (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference ) ) )* otherlv_11= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:636:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'from' ( (lv_left_2_0= ruleMatchedElement ) ) (otherlv_3= ',' ( (lv_left_4_0= ruleMatchedElement ) ) )* otherlv_5= 'to' ( (lv_right_6_0= ruleMatchedElement ) ) (otherlv_7= ',' ( (lv_right_8_0= ruleMatchedElement ) ) )* ( (lv_modifiers_9_0= ruleC2CModifier ) )* ( ( (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference ) ) )* otherlv_11= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:636:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'from' ( (lv_left_2_0= ruleMatchedElement ) ) (otherlv_3= ',' ( (lv_left_4_0= ruleMatchedElement ) ) )* otherlv_5= 'to' ( (lv_right_6_0= ruleMatchedElement ) ) (otherlv_7= ',' ( (lv_right_8_0= ruleMatchedElement ) ) )* ( (lv_modifiers_9_0= ruleC2CModifier ) )* ( ( (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference ) ) )* otherlv_11= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:636:2: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'from' ( (lv_left_2_0= ruleMatchedElement ) ) (otherlv_3= ',' ( (lv_left_4_0= ruleMatchedElement ) ) )* otherlv_5= 'to' ( (lv_right_6_0= ruleMatchedElement ) ) (otherlv_7= ',' ( (lv_right_8_0= ruleMatchedElement ) ) )* ( (lv_modifiers_9_0= ruleC2CModifier ) )* ( ( (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference ) ) )* otherlv_11= 'end'
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:636:2: ( (lv_tags_0_0= ruleTag ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:637:1: (lv_tags_0_0= ruleTag )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:637:1: (lv_tags_0_0= ruleTag )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:638:3: lv_tags_0_0= ruleTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextAccess().getTagsTagParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTag_in_ruleContext1267);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"Tag");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContext1280); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAccess().getFromKeyword_1());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:658:1: ( (lv_left_2_0= ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:659:1: (lv_left_2_0= ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:659:1: (lv_left_2_0= ruleMatchedElement )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:660:3: lv_left_2_0= ruleMatchedElement
            {
             
            	        newCompositeNode(grammarAccess.getContextAccess().getLeftMatchedElementParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_ruleContext1301);
            lv_left_2_0=ruleMatchedElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	        }
                   		add(
                   			current, 
                   			"left",
                    		lv_left_2_0, 
                    		"MatchedElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:676:2: (otherlv_3= ',' ( (lv_left_4_0= ruleMatchedElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:676:4: otherlv_3= ',' ( (lv_left_4_0= ruleMatchedElement ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContext1314); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContextAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:680:1: ( (lv_left_4_0= ruleMatchedElement ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:681:1: (lv_left_4_0= ruleMatchedElement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:681:1: (lv_left_4_0= ruleMatchedElement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:682:3: lv_left_4_0= ruleMatchedElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextAccess().getLeftMatchedElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_ruleContext1335);
            	    lv_left_4_0=ruleMatchedElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"left",
            	            		lv_left_4_0, 
            	            		"MatchedElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContext1349); 

                	newLeafNode(otherlv_5, grammarAccess.getContextAccess().getToKeyword_4());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:702:1: ( (lv_right_6_0= ruleMatchedElement ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:703:1: (lv_right_6_0= ruleMatchedElement )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:703:1: (lv_right_6_0= ruleMatchedElement )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:704:3: lv_right_6_0= ruleMatchedElement
            {
             
            	        newCompositeNode(grammarAccess.getContextAccess().getRightMatchedElementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_ruleContext1370);
            lv_right_6_0=ruleMatchedElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	        }
                   		add(
                   			current, 
                   			"right",
                    		lv_right_6_0, 
                    		"MatchedElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:720:2: (otherlv_7= ',' ( (lv_right_8_0= ruleMatchedElement ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:720:4: otherlv_7= ',' ( (lv_right_8_0= ruleMatchedElement ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContext1383); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContextAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:724:1: ( (lv_right_8_0= ruleMatchedElement ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:725:1: (lv_right_8_0= ruleMatchedElement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:725:1: (lv_right_8_0= ruleMatchedElement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:726:3: lv_right_8_0= ruleMatchedElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextAccess().getRightMatchedElementParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_ruleContext1404);
            	    lv_right_8_0=ruleMatchedElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_8_0, 
            	            		"MatchedElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:742:4: ( (lv_modifiers_9_0= ruleC2CModifier ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:743:1: (lv_modifiers_9_0= ruleC2CModifier )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:743:1: (lv_modifiers_9_0= ruleC2CModifier )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:744:3: lv_modifiers_9_0= ruleC2CModifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextAccess().getModifiersC2CModifierParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleC2CModifier_in_ruleContext1427);
            	    lv_modifiers_9_0=ruleC2CModifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_9_0, 
            	            		"C2CModifier");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:760:3: ( ( (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:761:1: ( (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference ) )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:761:1: ( (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:762:1: (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:762:1: (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference )
            	    int alt13=2;
            	    alt13 = dfa13.predict(input);
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:763:3: lv_mappings_10_1= ruleAttributeMapping
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getContextAccess().getMappingsAttributeMappingParserRuleCall_8_0_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleAttributeMapping_in_ruleContext1451);
            	            lv_mappings_10_1=ruleAttributeMapping();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"mappings",
            	                    		lv_mappings_10_1, 
            	                    		"AttributeMapping");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:778:8: lv_mappings_10_2= ruleReference2Reference
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getContextAccess().getMappingsReference2ReferenceParserRuleCall_8_0_1()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleReference2Reference_in_ruleContext1470);
            	            lv_mappings_10_2=ruleReference2Reference();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"mappings",
            	                    		lv_mappings_10_2, 
            	                    		"Reference2Reference");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleContext1486); 

                	newLeafNode(otherlv_11, grammarAccess.getContextAccess().getEndKeyword_9());
                

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleTag"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:808:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:809:2: (iv_ruleTag= ruleTag EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:810:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTag_in_entryRuleTag1522);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTag1532); 

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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:817:1: ruleTag returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ']' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:820:28: ( (otherlv_0= '[' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:821:1: (otherlv_0= '[' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:821:1: (otherlv_0= '[' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:821:3: otherlv_0= '[' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTag1569); 

                	newLeafNode(otherlv_0, grammarAccess.getTagAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:825:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:826:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:826:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:827:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTagAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTag1590);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTagRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTag1602); 

                	newLeafNode(otherlv_2, grammarAccess.getTagAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleMatchedElement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:855:1: entryRuleMatchedElement returns [EObject current=null] : iv_ruleMatchedElement= ruleMatchedElement EOF ;
    public final EObject entryRuleMatchedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchedElement = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:856:2: (iv_ruleMatchedElement= ruleMatchedElement EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:857:2: iv_ruleMatchedElement= ruleMatchedElement EOF
            {
             newCompositeNode(grammarAccess.getMatchedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatchedElement_in_entryRuleMatchedElement1638);
            iv_ruleMatchedElement=ruleMatchedElement();

            state._fsp--;

             current =iv_ruleMatchedElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchedElement1648); 

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
    // $ANTLR end "entryRuleMatchedElement"


    // $ANTLR start "ruleMatchedElement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:864:1: ruleMatchedElement returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '!' ( (lv_className_4_0= RULE_ID ) ) ( (lv_annotations_5_0= ruleSingleAnnotation ) )? ( (lv_strictType_6_0= '!' ) )? ) ;
    public final EObject ruleMatchedElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_className_4_0=null;
        Token lv_strictType_6_0=null;
        EObject lv_annotations_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:867:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '!' ( (lv_className_4_0= RULE_ID ) ) ( (lv_annotations_5_0= ruleSingleAnnotation ) )? ( (lv_strictType_6_0= '!' ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:868:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '!' ( (lv_className_4_0= RULE_ID ) ) ( (lv_annotations_5_0= ruleSingleAnnotation ) )? ( (lv_strictType_6_0= '!' ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:868:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '!' ( (lv_className_4_0= RULE_ID ) ) ( (lv_annotations_5_0= ruleSingleAnnotation ) )? ( (lv_strictType_6_0= '!' ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:868:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '!' ( (lv_className_4_0= RULE_ID ) ) ( (lv_annotations_5_0= ruleSingleAnnotation ) )? ( (lv_strictType_6_0= '!' ) )?
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:868:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==15) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:868:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:868:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:869:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:869:1: (lv_name_0_0= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:870:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchedElement1691); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getMatchedElementAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchedElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMatchedElement1708); 

                        	newLeafNode(otherlv_1, grammarAccess.getMatchedElementAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:890:3: ( (otherlv_2= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:891:1: (otherlv_2= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:891:1: (otherlv_2= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:892:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchedElementRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchedElement1730); 

            		newLeafNode(otherlv_2, grammarAccess.getMatchedElementAccess().getModelRepresentModelCrossReference_1_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMatchedElement1742); 

                	newLeafNode(otherlv_3, grammarAccess.getMatchedElementAccess().getExclamationMarkKeyword_2());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:907:1: ( (lv_className_4_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:908:1: (lv_className_4_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:908:1: (lv_className_4_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:909:3: lv_className_4_0= RULE_ID
            {
            lv_className_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchedElement1759); 

            			newLeafNode(lv_className_4_0, grammarAccess.getMatchedElementAccess().getClassNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchedElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:925:2: ( (lv_annotations_5_0= ruleSingleAnnotation ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=27 && LA16_0<=28)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:926:1: (lv_annotations_5_0= ruleSingleAnnotation )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:926:1: (lv_annotations_5_0= ruleSingleAnnotation )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:927:3: lv_annotations_5_0= ruleSingleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchedElementAccess().getAnnotationsSingleAnnotationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_ruleMatchedElement1785);
                    lv_annotations_5_0=ruleSingleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchedElementRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_5_0, 
                            		"SingleAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:943:3: ( (lv_strictType_6_0= '!' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:944:1: (lv_strictType_6_0= '!' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:944:1: (lv_strictType_6_0= '!' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:945:3: lv_strictType_6_0= '!'
                    {
                    lv_strictType_6_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMatchedElement1804); 

                            newLeafNode(lv_strictType_6_0, grammarAccess.getMatchedElementAccess().getStrictTypeExclamationMarkKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchedElementRule());
                    	        }
                           		setWithLastConsumed(current, "strictType", true, "!");
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMatchedElement"


    // $ANTLR start "entryRuleSingleAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:966:1: entryRuleSingleAnnotation returns [EObject current=null] : iv_ruleSingleAnnotation= ruleSingleAnnotation EOF ;
    public final EObject entryRuleSingleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:967:2: (iv_ruleSingleAnnotation= ruleSingleAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:968:2: iv_ruleSingleAnnotation= ruleSingleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getSingleAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation1854);
            iv_ruleSingleAnnotation=ruleSingleAnnotation();

            state._fsp--;

             current =iv_ruleSingleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleAnnotation1864); 

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
    // $ANTLR end "entryRuleSingleAnnotation"


    // $ANTLR start "ruleSingleAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:975:1: ruleSingleAnnotation returns [EObject current=null] : this_PotencyAnnotation_0= rulePotencyAnnotation ;
    public final EObject ruleSingleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_PotencyAnnotation_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:978:28: (this_PotencyAnnotation_0= rulePotencyAnnotation )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:980:5: this_PotencyAnnotation_0= rulePotencyAnnotation
            {
             
                    newCompositeNode(grammarAccess.getSingleAnnotationAccess().getPotencyAnnotationParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation1910);
            this_PotencyAnnotation_0=rulePotencyAnnotation();

            state._fsp--;

             
                    current = this_PotencyAnnotation_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleSingleAnnotation"


    // $ANTLR start "entryRulePotencyAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:996:1: entryRulePotencyAnnotation returns [EObject current=null] : iv_rulePotencyAnnotation= rulePotencyAnnotation EOF ;
    public final EObject entryRulePotencyAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotencyAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:997:2: (iv_rulePotencyAnnotation= rulePotencyAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:998:2: iv_rulePotencyAnnotation= rulePotencyAnnotation EOF
            {
             newCompositeNode(grammarAccess.getPotencyAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation1944);
            iv_rulePotencyAnnotation=rulePotencyAnnotation();

            state._fsp--;

             current =iv_rulePotencyAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePotencyAnnotation1954); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1005:1: rulePotencyAnnotation returns [EObject current=null] : ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject rulePotencyAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1008:28: ( ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1009:1: ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1009:1: ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1009:2: (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1009:2: (otherlv_0= '@' | otherlv_1= '^' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1009:4: otherlv_0= '@'
                    {
                    otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePotencyAnnotation1992); 

                        	newLeafNode(otherlv_0, grammarAccess.getPotencyAnnotationAccess().getCommercialAtKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1014:7: otherlv_1= '^'
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePotencyAnnotation2010); 

                        	newLeafNode(otherlv_1, grammarAccess.getPotencyAnnotationAccess().getCircumflexAccentKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1018:2: ( (lv_value_2_0= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1019:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1019:1: (lv_value_2_0= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1020:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePotencyAnnotation2028); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPotencyAnnotationAccess().getValueINTTerminalRuleCall_1_0()); 
            		

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
    // $ANTLR end "rulePotencyAnnotation"


    // $ANTLR start "entryRuleC2CModifier"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1044:1: entryRuleC2CModifier returns [EObject current=null] : iv_ruleC2CModifier= ruleC2CModifier EOF ;
    public final EObject entryRuleC2CModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleC2CModifier = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1045:2: (iv_ruleC2CModifier= ruleC2CModifier EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1046:2: iv_ruleC2CModifier= ruleC2CModifier EOF
            {
             newCompositeNode(grammarAccess.getC2CModifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleC2CModifier_in_entryRuleC2CModifier2069);
            iv_ruleC2CModifier=ruleC2CModifier();

            state._fsp--;

             current =iv_ruleC2CModifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleC2CModifier2079); 

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
    // $ANTLR end "entryRuleC2CModifier"


    // $ANTLR start "ruleC2CModifier"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1053:1: ruleC2CModifier returns [EObject current=null] : this_LinkedBy_0= ruleLinkedBy ;
    public final EObject ruleC2CModifier() throws RecognitionException {
        EObject current = null;

        EObject this_LinkedBy_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1056:28: (this_LinkedBy_0= ruleLinkedBy )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1058:5: this_LinkedBy_0= ruleLinkedBy
            {
             
                    newCompositeNode(grammarAccess.getC2CModifierAccess().getLinkedByParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLinkedBy_in_ruleC2CModifier2125);
            this_LinkedBy_0=ruleLinkedBy();

            state._fsp--;

             
                    current = this_LinkedBy_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleC2CModifier"


    // $ANTLR start "entryRuleLinkedBy"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1074:1: entryRuleLinkedBy returns [EObject current=null] : iv_ruleLinkedBy= ruleLinkedBy EOF ;
    public final EObject entryRuleLinkedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedBy = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1075:2: (iv_ruleLinkedBy= ruleLinkedBy EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1076:2: iv_ruleLinkedBy= ruleLinkedBy EOF
            {
             newCompositeNode(grammarAccess.getLinkedByRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkedBy_in_entryRuleLinkedBy2159);
            iv_ruleLinkedBy=ruleLinkedBy();

            state._fsp--;

             current =iv_ruleLinkedBy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinkedBy2169); 

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
    // $ANTLR end "entryRuleLinkedBy"


    // $ANTLR start "ruleLinkedBy"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1083:1: ruleLinkedBy returns [EObject current=null] : (otherlv_0= 'linking' ( (lv_attribute_1_0= ruleAttributeRef ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleLinkedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_attribute_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1086:28: ( (otherlv_0= 'linking' ( (lv_attribute_1_0= ruleAttributeRef ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1087:1: (otherlv_0= 'linking' ( (lv_attribute_1_0= ruleAttributeRef ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1087:1: (otherlv_0= 'linking' ( (lv_attribute_1_0= ruleAttributeRef ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1087:3: otherlv_0= 'linking' ( (lv_attribute_1_0= ruleAttributeRef ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLinkedBy2206); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkedByAccess().getLinkingKeyword_0());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1091:1: ( (lv_attribute_1_0= ruleAttributeRef ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1092:1: (lv_attribute_1_0= ruleAttributeRef )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1092:1: (lv_attribute_1_0= ruleAttributeRef )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1093:3: lv_attribute_1_0= ruleAttributeRef
            {
             
            	        newCompositeNode(grammarAccess.getLinkedByAccess().getAttributeAttributeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_ruleLinkedBy2227);
            lv_attribute_1_0=ruleAttributeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkedByRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_1_0, 
                    		"AttributeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLinkedBy2239); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkedByAccess().getEqualsSignKeyword_2());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1113:1: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1114:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1114:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1115:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkedByRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLinkedBy2259); 

            		newLeafNode(otherlv_3, grammarAccess.getLinkedByAccess().getLinkedElementMatchedElementCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleLinkedBy"


    // $ANTLR start "entryRuleAttributeMapping"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1134:1: entryRuleAttributeMapping returns [EObject current=null] : iv_ruleAttributeMapping= ruleAttributeMapping EOF ;
    public final EObject entryRuleAttributeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMapping = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1135:2: (iv_ruleAttributeMapping= ruleAttributeMapping EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1136:2: iv_ruleAttributeMapping= ruleAttributeMapping EOF
            {
             newCompositeNode(grammarAccess.getAttributeMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeMapping_in_entryRuleAttributeMapping2295);
            iv_ruleAttributeMapping=ruleAttributeMapping();

            state._fsp--;

             current =iv_ruleAttributeMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeMapping2305); 

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
    // $ANTLR end "entryRuleAttributeMapping"


    // $ANTLR start "ruleAttributeMapping"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1143:1: ruleAttributeMapping returns [EObject current=null] : ( ( (lv_left_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleAttributeRef ) ) )* otherlv_3= '=' ( (lv_rightPart_4_0= ruleAttributeRightPart ) ) ) ;
    public final EObject ruleAttributeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_rightPart_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1146:28: ( ( ( (lv_left_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleAttributeRef ) ) )* otherlv_3= '=' ( (lv_rightPart_4_0= ruleAttributeRightPart ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1147:1: ( ( (lv_left_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleAttributeRef ) ) )* otherlv_3= '=' ( (lv_rightPart_4_0= ruleAttributeRightPart ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1147:1: ( ( (lv_left_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleAttributeRef ) ) )* otherlv_3= '=' ( (lv_rightPart_4_0= ruleAttributeRightPart ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1147:2: ( (lv_left_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleAttributeRef ) ) )* otherlv_3= '=' ( (lv_rightPart_4_0= ruleAttributeRightPart ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1147:2: ( (lv_left_0_0= ruleAttributeRef ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1148:1: (lv_left_0_0= ruleAttributeRef )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1148:1: (lv_left_0_0= ruleAttributeRef )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1149:3: lv_left_0_0= ruleAttributeRef
            {
             
            	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getLeftAttributeRefParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_ruleAttributeMapping2351);
            lv_left_0_0=ruleAttributeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
            	        }
                   		add(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"AttributeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1165:2: (otherlv_1= ',' ( (lv_left_2_0= ruleAttributeRef ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1165:4: otherlv_1= ',' ( (lv_left_2_0= ruleAttributeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAttributeMapping2364); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAttributeMappingAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1169:1: ( (lv_left_2_0= ruleAttributeRef ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1170:1: (lv_left_2_0= ruleAttributeRef )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1170:1: (lv_left_2_0= ruleAttributeRef )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1171:3: lv_left_2_0= ruleAttributeRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getLeftAttributeRefParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_ruleAttributeMapping2385);
            	    lv_left_2_0=ruleAttributeRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"left",
            	            		lv_left_2_0, 
            	            		"AttributeRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAttributeMapping2399); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeMappingAccess().getEqualsSignKeyword_2());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1191:1: ( (lv_rightPart_4_0= ruleAttributeRightPart ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1192:1: (lv_rightPart_4_0= ruleAttributeRightPart )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1192:1: (lv_rightPart_4_0= ruleAttributeRightPart )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1193:3: lv_rightPart_4_0= ruleAttributeRightPart
            {
             
            	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getRightPartAttributeRightPartParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRightPart_in_ruleAttributeMapping2420);
            lv_rightPart_4_0=ruleAttributeRightPart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
            	        }
                   		set(
                   			current, 
                   			"rightPart",
                    		lv_rightPart_4_0, 
                    		"AttributeRightPart");
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
    // $ANTLR end "ruleAttributeMapping"


    // $ANTLR start "entryRuleAttributeRightPart"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1217:1: entryRuleAttributeRightPart returns [EObject current=null] : iv_ruleAttributeRightPart= ruleAttributeRightPart EOF ;
    public final EObject entryRuleAttributeRightPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRightPart = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1218:2: (iv_ruleAttributeRightPart= ruleAttributeRightPart EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1219:2: iv_ruleAttributeRightPart= ruleAttributeRightPart EOF
            {
             newCompositeNode(grammarAccess.getAttributeRightPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRightPart_in_entryRuleAttributeRightPart2456);
            iv_ruleAttributeRightPart=ruleAttributeRightPart();

            state._fsp--;

             current =iv_ruleAttributeRightPart; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeRightPart2466); 

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
    // $ANTLR end "entryRuleAttributeRightPart"


    // $ANTLR start "ruleAttributeRightPart"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1226:1: ruleAttributeRightPart returns [EObject current=null] : (this_AttributeIsString_0= ruleAttributeIsString | this_AttributeIsBoolean_1= ruleAttributeIsBoolean | this_AttributeIsDouble_2= ruleAttributeIsDouble | this_AttributeIsInteger_3= ruleAttributeIsInteger | this_Attribute2Attribute_4= ruleAttribute2Attribute ) ;
    public final EObject ruleAttributeRightPart() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeIsString_0 = null;

        EObject this_AttributeIsBoolean_1 = null;

        EObject this_AttributeIsDouble_2 = null;

        EObject this_AttributeIsInteger_3 = null;

        EObject this_Attribute2Attribute_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1229:28: ( (this_AttributeIsString_0= ruleAttributeIsString | this_AttributeIsBoolean_1= ruleAttributeIsBoolean | this_AttributeIsDouble_2= ruleAttributeIsDouble | this_AttributeIsInteger_3= ruleAttributeIsInteger | this_Attribute2Attribute_4= ruleAttribute2Attribute ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1230:1: (this_AttributeIsString_0= ruleAttributeIsString | this_AttributeIsBoolean_1= ruleAttributeIsBoolean | this_AttributeIsDouble_2= ruleAttributeIsDouble | this_AttributeIsInteger_3= ruleAttributeIsInteger | this_Attribute2Attribute_4= ruleAttribute2Attribute )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1230:1: (this_AttributeIsString_0= ruleAttributeIsString | this_AttributeIsBoolean_1= ruleAttributeIsBoolean | this_AttributeIsDouble_2= ruleAttributeIsDouble | this_AttributeIsInteger_3= ruleAttributeIsInteger | this_Attribute2Attribute_4= ruleAttribute2Attribute )
            int alt20=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt20=1;
                }
                break;
            case 34:
            case 35:
                {
                alt20=2;
                }
                break;
            case RULE_INT:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==23) ) {
                    alt20=3;
                }
                else if ( (LA20_3==EOF||(LA20_3>=RULE_ID && LA20_3<=RULE_STRING)||LA20_3==24) ) {
                    alt20=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt20=4;
                }
                break;
            case RULE_ID:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1231:5: this_AttributeIsString_0= ruleAttributeIsString
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeRightPartAccess().getAttributeIsStringParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeIsString_in_ruleAttributeRightPart2513);
                    this_AttributeIsString_0=ruleAttributeIsString();

                    state._fsp--;

                     
                            current = this_AttributeIsString_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1241:5: this_AttributeIsBoolean_1= ruleAttributeIsBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeRightPartAccess().getAttributeIsBooleanParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeIsBoolean_in_ruleAttributeRightPart2540);
                    this_AttributeIsBoolean_1=ruleAttributeIsBoolean();

                    state._fsp--;

                     
                            current = this_AttributeIsBoolean_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1251:5: this_AttributeIsDouble_2= ruleAttributeIsDouble
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeRightPartAccess().getAttributeIsDoubleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeIsDouble_in_ruleAttributeRightPart2567);
                    this_AttributeIsDouble_2=ruleAttributeIsDouble();

                    state._fsp--;

                     
                            current = this_AttributeIsDouble_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1261:5: this_AttributeIsInteger_3= ruleAttributeIsInteger
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeRightPartAccess().getAttributeIsIntegerParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeIsInteger_in_ruleAttributeRightPart2594);
                    this_AttributeIsInteger_3=ruleAttributeIsInteger();

                    state._fsp--;

                     
                            current = this_AttributeIsInteger_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1271:5: this_Attribute2Attribute_4= ruleAttribute2Attribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeRightPartAccess().getAttribute2AttributeParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute2Attribute_in_ruleAttributeRightPart2621);
                    this_Attribute2Attribute_4=ruleAttribute2Attribute();

                    state._fsp--;

                     
                            current = this_Attribute2Attribute_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAttributeRightPart"


    // $ANTLR start "entryRuleAttribute2Attribute"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1287:1: entryRuleAttribute2Attribute returns [EObject current=null] : iv_ruleAttribute2Attribute= ruleAttribute2Attribute EOF ;
    public final EObject entryRuleAttribute2Attribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute2Attribute = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1288:2: (iv_ruleAttribute2Attribute= ruleAttribute2Attribute EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1289:2: iv_ruleAttribute2Attribute= ruleAttribute2Attribute EOF
            {
             newCompositeNode(grammarAccess.getAttribute2AttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute2Attribute_in_entryRuleAttribute2Attribute2656);
            iv_ruleAttribute2Attribute=ruleAttribute2Attribute();

            state._fsp--;

             current =iv_ruleAttribute2Attribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute2Attribute2666); 

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
    // $ANTLR end "entryRuleAttribute2Attribute"


    // $ANTLR start "ruleAttribute2Attribute"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1296:1: ruleAttribute2Attribute returns [EObject current=null] : ( ( (lv_right_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleAttributeRef ) ) )* ( (lv_converter_3_0= ruleConverter ) )? ) ;
    public final EObject ruleAttribute2Attribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_right_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_converter_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1299:28: ( ( ( (lv_right_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleAttributeRef ) ) )* ( (lv_converter_3_0= ruleConverter ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1300:1: ( ( (lv_right_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleAttributeRef ) ) )* ( (lv_converter_3_0= ruleConverter ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1300:1: ( ( (lv_right_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleAttributeRef ) ) )* ( (lv_converter_3_0= ruleConverter ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1300:2: ( (lv_right_0_0= ruleAttributeRef ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleAttributeRef ) ) )* ( (lv_converter_3_0= ruleConverter ) )?
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1300:2: ( (lv_right_0_0= ruleAttributeRef ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1301:1: (lv_right_0_0= ruleAttributeRef )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1301:1: (lv_right_0_0= ruleAttributeRef )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1302:3: lv_right_0_0= ruleAttributeRef
            {
             
            	        newCompositeNode(grammarAccess.getAttribute2AttributeAccess().getRightAttributeRefParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_ruleAttribute2Attribute2712);
            lv_right_0_0=ruleAttributeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttribute2AttributeRule());
            	        }
                   		add(
                   			current, 
                   			"right",
                    		lv_right_0_0, 
                    		"AttributeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1318:2: (otherlv_1= ',' ( (lv_right_2_0= ruleAttributeRef ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1318:4: otherlv_1= ',' ( (lv_right_2_0= ruleAttributeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAttribute2Attribute2725); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAttribute2AttributeAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1322:1: ( (lv_right_2_0= ruleAttributeRef ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1323:1: (lv_right_2_0= ruleAttributeRef )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1323:1: (lv_right_2_0= ruleAttributeRef )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1324:3: lv_right_2_0= ruleAttributeRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttribute2AttributeAccess().getRightAttributeRefParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_ruleAttribute2Attribute2746);
            	    lv_right_2_0=ruleAttributeRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttribute2AttributeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_2_0, 
            	            		"AttributeRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1340:4: ( (lv_converter_3_0= ruleConverter ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1341:1: (lv_converter_3_0= ruleConverter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1341:1: (lv_converter_3_0= ruleConverter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1342:3: lv_converter_3_0= ruleConverter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttribute2AttributeAccess().getConverterConverterParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConverter_in_ruleAttribute2Attribute2769);
                    lv_converter_3_0=ruleConverter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttribute2AttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"converter",
                            		lv_converter_3_0, 
                            		"Converter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAttribute2Attribute"


    // $ANTLR start "entryRuleAttributeIsString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1366:1: entryRuleAttributeIsString returns [EObject current=null] : iv_ruleAttributeIsString= ruleAttributeIsString EOF ;
    public final EObject entryRuleAttributeIsString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeIsString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1367:2: (iv_ruleAttributeIsString= ruleAttributeIsString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1368:2: iv_ruleAttributeIsString= ruleAttributeIsString EOF
            {
             newCompositeNode(grammarAccess.getAttributeIsStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeIsString_in_entryRuleAttributeIsString2806);
            iv_ruleAttributeIsString=ruleAttributeIsString();

            state._fsp--;

             current =iv_ruleAttributeIsString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeIsString2816); 

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
    // $ANTLR end "entryRuleAttributeIsString"


    // $ANTLR start "ruleAttributeIsString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1375:1: ruleAttributeIsString returns [EObject current=null] : ( (lv_strValue_0_0= ruleStrictString ) ) ;
    public final EObject ruleAttributeIsString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_strValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1378:28: ( ( (lv_strValue_0_0= ruleStrictString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1379:1: ( (lv_strValue_0_0= ruleStrictString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1379:1: ( (lv_strValue_0_0= ruleStrictString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1380:1: (lv_strValue_0_0= ruleStrictString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1380:1: (lv_strValue_0_0= ruleStrictString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1381:3: lv_strValue_0_0= ruleStrictString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeIsStringAccess().getStrValueStrictStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStrictString_in_ruleAttributeIsString2861);
            lv_strValue_0_0=ruleStrictString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeIsStringRule());
            	        }
                   		set(
                   			current, 
                   			"strValue",
                    		lv_strValue_0_0, 
                    		"StrictString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAttributeIsString"


    // $ANTLR start "entryRuleAttributeIsBoolean"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1405:1: entryRuleAttributeIsBoolean returns [EObject current=null] : iv_ruleAttributeIsBoolean= ruleAttributeIsBoolean EOF ;
    public final EObject entryRuleAttributeIsBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeIsBoolean = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1406:2: (iv_ruleAttributeIsBoolean= ruleAttributeIsBoolean EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1407:2: iv_ruleAttributeIsBoolean= ruleAttributeIsBoolean EOF
            {
             newCompositeNode(grammarAccess.getAttributeIsBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeIsBoolean_in_entryRuleAttributeIsBoolean2896);
            iv_ruleAttributeIsBoolean=ruleAttributeIsBoolean();

            state._fsp--;

             current =iv_ruleAttributeIsBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeIsBoolean2906); 

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
    // $ANTLR end "entryRuleAttributeIsBoolean"


    // $ANTLR start "ruleAttributeIsBoolean"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1414:1: ruleAttributeIsBoolean returns [EObject current=null] : ( (lv_boolValue_0_0= ruleEBoolean ) ) ;
    public final EObject ruleAttributeIsBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_boolValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1417:28: ( ( (lv_boolValue_0_0= ruleEBoolean ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1418:1: ( (lv_boolValue_0_0= ruleEBoolean ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1418:1: ( (lv_boolValue_0_0= ruleEBoolean ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1419:1: (lv_boolValue_0_0= ruleEBoolean )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1419:1: (lv_boolValue_0_0= ruleEBoolean )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1420:3: lv_boolValue_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeIsBooleanAccess().getBoolValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleAttributeIsBoolean2951);
            lv_boolValue_0_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeIsBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"boolValue",
                    		lv_boolValue_0_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAttributeIsBoolean"


    // $ANTLR start "entryRuleAttributeIsDouble"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1444:1: entryRuleAttributeIsDouble returns [EObject current=null] : iv_ruleAttributeIsDouble= ruleAttributeIsDouble EOF ;
    public final EObject entryRuleAttributeIsDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeIsDouble = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1445:2: (iv_ruleAttributeIsDouble= ruleAttributeIsDouble EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1446:2: iv_ruleAttributeIsDouble= ruleAttributeIsDouble EOF
            {
             newCompositeNode(grammarAccess.getAttributeIsDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeIsDouble_in_entryRuleAttributeIsDouble2986);
            iv_ruleAttributeIsDouble=ruleAttributeIsDouble();

            state._fsp--;

             current =iv_ruleAttributeIsDouble; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeIsDouble2996); 

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
    // $ANTLR end "entryRuleAttributeIsDouble"


    // $ANTLR start "ruleAttributeIsDouble"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1453:1: ruleAttributeIsDouble returns [EObject current=null] : ( (lv_doubleValue_0_0= ruleEDouble ) ) ;
    public final EObject ruleAttributeIsDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_doubleValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1456:28: ( ( (lv_doubleValue_0_0= ruleEDouble ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1457:1: ( (lv_doubleValue_0_0= ruleEDouble ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1457:1: ( (lv_doubleValue_0_0= ruleEDouble ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1458:1: (lv_doubleValue_0_0= ruleEDouble )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1458:1: (lv_doubleValue_0_0= ruleEDouble )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1459:3: lv_doubleValue_0_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAttributeIsDoubleAccess().getDoubleValueEDoubleParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAttributeIsDouble3041);
            lv_doubleValue_0_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeIsDoubleRule());
            	        }
                   		set(
                   			current, 
                   			"doubleValue",
                    		lv_doubleValue_0_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAttributeIsDouble"


    // $ANTLR start "entryRuleAttributeIsInteger"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1483:1: entryRuleAttributeIsInteger returns [EObject current=null] : iv_ruleAttributeIsInteger= ruleAttributeIsInteger EOF ;
    public final EObject entryRuleAttributeIsInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeIsInteger = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1484:2: (iv_ruleAttributeIsInteger= ruleAttributeIsInteger EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1485:2: iv_ruleAttributeIsInteger= ruleAttributeIsInteger EOF
            {
             newCompositeNode(grammarAccess.getAttributeIsIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeIsInteger_in_entryRuleAttributeIsInteger3076);
            iv_ruleAttributeIsInteger=ruleAttributeIsInteger();

            state._fsp--;

             current =iv_ruleAttributeIsInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeIsInteger3086); 

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
    // $ANTLR end "entryRuleAttributeIsInteger"


    // $ANTLR start "ruleAttributeIsInteger"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1492:1: ruleAttributeIsInteger returns [EObject current=null] : ( (lv_intValue_0_0= ruleEInt ) ) ;
    public final EObject ruleAttributeIsInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_intValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1495:28: ( ( (lv_intValue_0_0= ruleEInt ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1496:1: ( (lv_intValue_0_0= ruleEInt ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1496:1: ( (lv_intValue_0_0= ruleEInt ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1497:1: (lv_intValue_0_0= ruleEInt )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1497:1: (lv_intValue_0_0= ruleEInt )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1498:3: lv_intValue_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getAttributeIsIntegerAccess().getIntValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAttributeIsInteger3131);
            lv_intValue_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeIsIntegerRule());
            	        }
                   		set(
                   			current, 
                   			"intValue",
                    		lv_intValue_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAttributeIsInteger"


    // $ANTLR start "entryRuleAttributeRef"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1522:1: entryRuleAttributeRef returns [EObject current=null] : iv_ruleAttributeRef= ruleAttributeRef EOF ;
    public final EObject entryRuleAttributeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRef = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1523:2: (iv_ruleAttributeRef= ruleAttributeRef EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1524:2: iv_ruleAttributeRef= ruleAttributeRef EOF
            {
             newCompositeNode(grammarAccess.getAttributeRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeRef_in_entryRuleAttributeRef3166);
            iv_ruleAttributeRef=ruleAttributeRef();

            state._fsp--;

             current =iv_ruleAttributeRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeRef3176); 

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
    // $ANTLR end "entryRuleAttributeRef"


    // $ANTLR start "ruleAttributeRef"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1531:1: ruleAttributeRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )? ) ;
    public final EObject ruleAttributeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_multivalued_3_0=null;
        AntlrDatatypeRuleToken lv_featureName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1534:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1535:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1535:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1535:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )?
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1535:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==23) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1535:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1535:3: ( (otherlv_0= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1536:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1536:1: (otherlv_0= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1537:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRefRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeRef3222); 

                    		newLeafNode(otherlv_0, grammarAccess.getAttributeRefAccess().getReferredElementMatchedElementCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAttributeRef3234); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeRefAccess().getFullStopKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1552:3: ( (lv_featureName_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1553:1: (lv_featureName_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1553:1: (lv_featureName_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1554:3: lv_featureName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeRefAccess().getFeatureNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttributeRef3257);
            lv_featureName_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRefRule());
            	        }
                   		set(
                   			current, 
                   			"featureName",
                    		lv_featureName_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1570:2: ( (lv_multivalued_3_0= '*' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1571:1: (lv_multivalued_3_0= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1571:1: (lv_multivalued_3_0= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1572:3: lv_multivalued_3_0= '*'
                    {
                    lv_multivalued_3_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAttributeRef3275); 

                            newLeafNode(lv_multivalued_3_0, grammarAccess.getAttributeRefAccess().getMultivaluedAsteriskKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRefRule());
                    	        }
                           		setWithLastConsumed(current, "multivalued", true, "*");
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAttributeRef"


    // $ANTLR start "entryRuleReference2Reference"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1593:1: entryRuleReference2Reference returns [EObject current=null] : iv_ruleReference2Reference= ruleReference2Reference EOF ;
    public final EObject entryRuleReference2Reference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference2Reference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1594:2: (iv_ruleReference2Reference= ruleReference2Reference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1595:2: iv_ruleReference2Reference= ruleReference2Reference EOF
            {
             newCompositeNode(grammarAccess.getReference2ReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference2Reference_in_entryRuleReference2Reference3325);
            iv_ruleReference2Reference=ruleReference2Reference();

            state._fsp--;

             current =iv_ruleReference2Reference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference2Reference3335); 

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
    // $ANTLR end "entryRuleReference2Reference"


    // $ANTLR start "ruleReference2Reference"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1602:1: ruleReference2Reference returns [EObject current=null] : ( ( (lv_left_0_0= ruleReferenceRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleReferenceRef ) ) )* otherlv_3= '<-' ( (lv_right_4_0= ruleReferenceRef ) ) (otherlv_5= ',' ( (lv_right_6_0= ruleReferenceRef ) ) )* ( (lv_converter_7_0= ruleConverter ) )? ) ;
    public final EObject ruleReference2Reference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_0_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_converter_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1605:28: ( ( ( (lv_left_0_0= ruleReferenceRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleReferenceRef ) ) )* otherlv_3= '<-' ( (lv_right_4_0= ruleReferenceRef ) ) (otherlv_5= ',' ( (lv_right_6_0= ruleReferenceRef ) ) )* ( (lv_converter_7_0= ruleConverter ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1606:1: ( ( (lv_left_0_0= ruleReferenceRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleReferenceRef ) ) )* otherlv_3= '<-' ( (lv_right_4_0= ruleReferenceRef ) ) (otherlv_5= ',' ( (lv_right_6_0= ruleReferenceRef ) ) )* ( (lv_converter_7_0= ruleConverter ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1606:1: ( ( (lv_left_0_0= ruleReferenceRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleReferenceRef ) ) )* otherlv_3= '<-' ( (lv_right_4_0= ruleReferenceRef ) ) (otherlv_5= ',' ( (lv_right_6_0= ruleReferenceRef ) ) )* ( (lv_converter_7_0= ruleConverter ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1606:2: ( (lv_left_0_0= ruleReferenceRef ) ) (otherlv_1= ',' ( (lv_left_2_0= ruleReferenceRef ) ) )* otherlv_3= '<-' ( (lv_right_4_0= ruleReferenceRef ) ) (otherlv_5= ',' ( (lv_right_6_0= ruleReferenceRef ) ) )* ( (lv_converter_7_0= ruleConverter ) )?
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1606:2: ( (lv_left_0_0= ruleReferenceRef ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1607:1: (lv_left_0_0= ruleReferenceRef )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1607:1: (lv_left_0_0= ruleReferenceRef )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1608:3: lv_left_0_0= ruleReferenceRef
            {
             
            	        newCompositeNode(grammarAccess.getReference2ReferenceAccess().getLeftReferenceRefParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_ruleReference2Reference3381);
            lv_left_0_0=ruleReferenceRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReference2ReferenceRule());
            	        }
                   		add(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"ReferenceRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1624:2: (otherlv_1= ',' ( (lv_left_2_0= ruleReferenceRef ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1624:4: otherlv_1= ',' ( (lv_left_2_0= ruleReferenceRef ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleReference2Reference3394); 

            	        	newLeafNode(otherlv_1, grammarAccess.getReference2ReferenceAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1628:1: ( (lv_left_2_0= ruleReferenceRef ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1629:1: (lv_left_2_0= ruleReferenceRef )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1629:1: (lv_left_2_0= ruleReferenceRef )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1630:3: lv_left_2_0= ruleReferenceRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReference2ReferenceAccess().getLeftReferenceRefParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_ruleReference2Reference3415);
            	    lv_left_2_0=ruleReferenceRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReference2ReferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"left",
            	            		lv_left_2_0, 
            	            		"ReferenceRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleReference2Reference3429); 

                	newLeafNode(otherlv_3, grammarAccess.getReference2ReferenceAccess().getLessThanSignHyphenMinusKeyword_2());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1650:1: ( (lv_right_4_0= ruleReferenceRef ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1651:1: (lv_right_4_0= ruleReferenceRef )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1651:1: (lv_right_4_0= ruleReferenceRef )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1652:3: lv_right_4_0= ruleReferenceRef
            {
             
            	        newCompositeNode(grammarAccess.getReference2ReferenceAccess().getRightReferenceRefParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_ruleReference2Reference3450);
            lv_right_4_0=ruleReferenceRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReference2ReferenceRule());
            	        }
                   		add(
                   			current, 
                   			"right",
                    		lv_right_4_0, 
                    		"ReferenceRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1668:2: (otherlv_5= ',' ( (lv_right_6_0= ruleReferenceRef ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1668:4: otherlv_5= ',' ( (lv_right_6_0= ruleReferenceRef ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleReference2Reference3463); 

            	        	newLeafNode(otherlv_5, grammarAccess.getReference2ReferenceAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1672:1: ( (lv_right_6_0= ruleReferenceRef ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1673:1: (lv_right_6_0= ruleReferenceRef )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1673:1: (lv_right_6_0= ruleReferenceRef )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1674:3: lv_right_6_0= ruleReferenceRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReference2ReferenceAccess().getRightReferenceRefParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_ruleReference2Reference3484);
            	    lv_right_6_0=ruleReferenceRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReference2ReferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_6_0, 
            	            		"ReferenceRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1690:4: ( (lv_converter_7_0= ruleConverter ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1691:1: (lv_converter_7_0= ruleConverter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1691:1: (lv_converter_7_0= ruleConverter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1692:3: lv_converter_7_0= ruleConverter
                    {
                     
                    	        newCompositeNode(grammarAccess.getReference2ReferenceAccess().getConverterConverterParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConverter_in_ruleReference2Reference3507);
                    lv_converter_7_0=ruleConverter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReference2ReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"converter",
                            		lv_converter_7_0, 
                            		"Converter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleReference2Reference"


    // $ANTLR start "entryRuleReferenceRef"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1716:1: entryRuleReferenceRef returns [EObject current=null] : iv_ruleReferenceRef= ruleReferenceRef EOF ;
    public final EObject entryRuleReferenceRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceRef = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1717:2: (iv_ruleReferenceRef= ruleReferenceRef EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1718:2: iv_ruleReferenceRef= ruleReferenceRef EOF
            {
             newCompositeNode(grammarAccess.getReferenceRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceRef_in_entryRuleReferenceRef3544);
            iv_ruleReferenceRef=ruleReferenceRef();

            state._fsp--;

             current =iv_ruleReferenceRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceRef3554); 

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
    // $ANTLR end "entryRuleReferenceRef"


    // $ANTLR start "ruleReferenceRef"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1725:1: ruleReferenceRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )? ) ;
    public final EObject ruleReferenceRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_multivalued_3_0=null;
        AntlrDatatypeRuleToken lv_featureName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1728:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1729:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1729:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1729:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_featureName_2_0= ruleEString ) ) ( (lv_multivalued_3_0= '*' ) )?
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1729:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==23) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1729:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1729:3: ( (otherlv_0= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1730:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1730:1: (otherlv_0= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1731:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRefRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReferenceRef3600); 

                    		newLeafNode(otherlv_0, grammarAccess.getReferenceRefAccess().getReferredElementMatchedElementCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleReferenceRef3612); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferenceRefAccess().getFullStopKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1746:3: ( (lv_featureName_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1747:1: (lv_featureName_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1747:1: (lv_featureName_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1748:3: lv_featureName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getReferenceRefAccess().getFeatureNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReferenceRef3635);
            lv_featureName_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceRefRule());
            	        }
                   		set(
                   			current, 
                   			"featureName",
                    		lv_featureName_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1764:2: ( (lv_multivalued_3_0= '*' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1765:1: (lv_multivalued_3_0= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1765:1: (lv_multivalued_3_0= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1766:3: lv_multivalued_3_0= '*'
                    {
                    lv_multivalued_3_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleReferenceRef3653); 

                            newLeafNode(lv_multivalued_3_0, grammarAccess.getReferenceRefAccess().getMultivaluedAsteriskKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRefRule());
                    	        }
                           		setWithLastConsumed(current, "multivalued", true, "*");
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleReferenceRef"


    // $ANTLR start "entryRuleConverter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1787:1: entryRuleConverter returns [EObject current=null] : iv_ruleConverter= ruleConverter EOF ;
    public final EObject entryRuleConverter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConverter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1788:2: (iv_ruleConverter= ruleConverter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1789:2: iv_ruleConverter= ruleConverter EOF
            {
             newCompositeNode(grammarAccess.getConverterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConverter_in_entryRuleConverter3703);
            iv_ruleConverter=ruleConverter();

            state._fsp--;

             current =iv_ruleConverter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConverter3713); 

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
    // $ANTLR end "entryRuleConverter"


    // $ANTLR start "ruleConverter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1796:1: ruleConverter returns [EObject current=null] : (otherlv_0= 'convert' ( ( (otherlv_1= RULE_ID ) ) ( (lv_isExternal_2_0= '.' ) ) )? ( (lv_converterName_3_0= ruleEString ) ) ) ;
    public final EObject ruleConverter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isExternal_2_0=null;
        AntlrDatatypeRuleToken lv_converterName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1799:28: ( (otherlv_0= 'convert' ( ( (otherlv_1= RULE_ID ) ) ( (lv_isExternal_2_0= '.' ) ) )? ( (lv_converterName_3_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1800:1: (otherlv_0= 'convert' ( ( (otherlv_1= RULE_ID ) ) ( (lv_isExternal_2_0= '.' ) ) )? ( (lv_converterName_3_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1800:1: (otherlv_0= 'convert' ( ( (otherlv_1= RULE_ID ) ) ( (lv_isExternal_2_0= '.' ) ) )? ( (lv_converterName_3_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1800:3: otherlv_0= 'convert' ( ( (otherlv_1= RULE_ID ) ) ( (lv_isExternal_2_0= '.' ) ) )? ( (lv_converterName_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleConverter3750); 

                	newLeafNode(otherlv_0, grammarAccess.getConverterAccess().getConvertKeyword_0());
                
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1804:1: ( ( (otherlv_1= RULE_ID ) ) ( (lv_isExternal_2_0= '.' ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==23) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1804:2: ( (otherlv_1= RULE_ID ) ) ( (lv_isExternal_2_0= '.' ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1804:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1805:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1805:1: (otherlv_1= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1806:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConverterRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConverter3771); 

                    		newLeafNode(otherlv_1, grammarAccess.getConverterAccess().getModuleUseDeclarationCrossReference_1_0_0()); 
                    	

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1817:2: ( (lv_isExternal_2_0= '.' ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1818:1: (lv_isExternal_2_0= '.' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1818:1: (lv_isExternal_2_0= '.' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1819:3: lv_isExternal_2_0= '.'
                    {
                    lv_isExternal_2_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleConverter3789); 

                            newLeafNode(lv_isExternal_2_0, grammarAccess.getConverterAccess().getIsExternalFullStopKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConverterRule());
                    	        }
                           		setWithLastConsumed(current, "isExternal", true, ".");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1832:4: ( (lv_converterName_3_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1833:1: (lv_converterName_3_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1833:1: (lv_converterName_3_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1834:3: lv_converterName_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConverterAccess().getConverterNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConverter3825);
            lv_converterName_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConverterRule());
            	        }
                   		set(
                   			current, 
                   			"converterName",
                    		lv_converterName_3_0, 
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
    // $ANTLR end "ruleConverter"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1858:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1859:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1860:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString3862);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString3873); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1867:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1870:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1871:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1871:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1871:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString3913); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1879:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString3939); 

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


    // $ANTLR start "entryRuleEDouble"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1894:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1895:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1896:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble3985);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble3996); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1903:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1906:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1907:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1907:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1907:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble4036); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDouble4054); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble4069); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1935:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1936:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1937:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean4115);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean4126); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1944:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1947:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1948:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1948:1: (kw= 'true' | kw= 'false' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            else if ( (LA32_0==35) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1949:2: kw= 'true'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEBoolean4164); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1956:2: kw= 'false'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEBoolean4183); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleStrictString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1969:1: entryRuleStrictString returns [String current=null] : iv_ruleStrictString= ruleStrictString EOF ;
    public final String entryRuleStrictString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStrictString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1970:2: (iv_ruleStrictString= ruleStrictString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1971:2: iv_ruleStrictString= ruleStrictString EOF
            {
             newCompositeNode(grammarAccess.getStrictStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrictString_in_entryRuleStrictString4224);
            iv_ruleStrictString=ruleStrictString();

            state._fsp--;

             current =iv_ruleStrictString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrictString4235); 

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
    // $ANTLR end "entryRuleStrictString"


    // $ANTLR start "ruleStrictString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1978:1: ruleStrictString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStrictString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1981:28: (this_STRING_0= RULE_STRING )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1982:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStrictString4274); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getStrictStringAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleStrictString"


    // $ANTLR start "entryRuleEInt"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1997:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1998:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:1999:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4319);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4330); 

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:2006:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:2009:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:2010:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:2010:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:2010:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:2010:2: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalMappings.g:2011:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEInt4369); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4386); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA3_eotS =
        "\7\uffff";
    static final String DFA3_eofS =
        "\7\uffff";
    static final String DFA3_minS =
        "\1\22\1\4\2\uffff\2\32\1\22";
    static final String DFA3_maxS =
        "\1\31\1\5\2\uffff\2\32\1\31";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1\3\uffff";
    static final String DFA3_specialS =
        "\7\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\1\2\5\uffff\1\1",
            "\1\5\1\4",
            "",
            "",
            "\1\6",
            "\1\6",
            "\1\3\1\2\5\uffff\1\1"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 194:3: ( (lv_delegates_11_0= ruleDelegate ) )*";
        }
    }
    static final String DFA13_eotS =
        "\16\uffff";
    static final String DFA13_eofS =
        "\16\uffff";
    static final String DFA13_minS =
        "\1\4\3\24\1\4\1\uffff\1\4\1\uffff\3\24\1\4\2\24";
    static final String DFA13_maxS =
        "\1\5\3\40\1\5\1\uffff\1\5\1\uffff\3\40\1\5\2\40";
    static final String DFA13_acceptS =
        "\5\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA13_specialS =
        "\16\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2",
            "\1\4\2\uffff\1\6\6\uffff\1\7\1\3\1\5",
            "\1\4\11\uffff\1\7\1\3\1\5",
            "\1\4\11\uffff\1\7\1\uffff\1\5",
            "\1\10\1\11",
            "",
            "\1\12\1\2",
            "",
            "\1\4\2\uffff\1\13\6\uffff\1\7\1\14\1\5",
            "\1\4\11\uffff\1\7\1\14\1\5",
            "\1\4\11\uffff\1\7\1\3\1\5",
            "\1\15\1\11",
            "\1\4\11\uffff\1\7\1\uffff\1\5",
            "\1\4\11\uffff\1\7\1\14\1\5"
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
            return "762:1: (lv_mappings_10_1= ruleAttributeMapping | lv_mappings_10_2= ruleReference2Reference )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMappingTransformation_in_entryRuleMappingTransformation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappingTransformation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMappingTransformation122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMappingTransformation143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMappingTransformation155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation176 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMappingTransformation188 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMappingTransformation200 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMappingTransformation212 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleMappingTransformation233 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMappingTransformation245 = new BitSet(new long[]{0x00000000020D0010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleMappingTransformation266 = new BitSet(new long[]{0x00000000020D0010L});
        public static final BitSet FOLLOW_ruleUsesStatements_in_ruleMappingTransformation288 = new BitSet(new long[]{0x00000000020D0010L});
        public static final BitSet FOLLOW_ruleDelegate_in_ruleMappingTransformation310 = new BitSet(new long[]{0x00000000020D0010L});
        public static final BitSet FOLLOW_ruleContext_in_ruleMappingTransformation332 = new BitSet(new long[]{0x00000000020D0012L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetamodelModelAnnotation_in_ruleAnnotation425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetamodelModelAnnotation_in_entryRuleMetamodelModelAnnotation459 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelModelAnnotation469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodelModelAnnotation514 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMetamodelModelAnnotation526 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelModelAnnotation543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUsesStatements_in_entryRuleUsesStatements584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUsesStatements594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUseDeclaration_in_ruleUsesStatements640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUseDeclaration_in_entryRuleUseDeclaration674 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUseDeclaration684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleUseDeclaration721 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUseDeclaration742 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleUseDeclaration755 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUseDeclaration776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelegate_in_entryRuleDelegate915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelegate925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTag_in_ruleDelegate971 = new BitSet(new long[]{0x0000000002040000L});
        public static final BitSet FOLLOW_18_in_ruleDelegate984 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDelegate996 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_ruleDelegate1017 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleDelegate1030 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_ruleDelegate1051 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleDelegate1065 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDelegate1086 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleDelegate1104 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelegate1139 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleDelegate1152 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelegate1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext1211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext1221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTag_in_ruleContext1267 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_19_in_ruleContext1280 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_ruleContext1301 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleContext1314 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_ruleContext1335 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleContext1349 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_ruleContext1370 = new BitSet(new long[]{0x0000000021100030L});
        public static final BitSet FOLLOW_20_in_ruleContext1383 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_ruleContext1404 = new BitSet(new long[]{0x0000000021100030L});
        public static final BitSet FOLLOW_ruleC2CModifier_in_ruleContext1427 = new BitSet(new long[]{0x0000000021000030L});
        public static final BitSet FOLLOW_ruleAttributeMapping_in_ruleContext1451 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_ruleReference2Reference_in_ruleContext1470 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_24_in_ruleContext1486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTag_in_entryRuleTag1522 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTag1532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTag1569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTag1590 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTag1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchedElement_in_entryRuleMatchedElement1638 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchedElement1648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchedElement1691 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMatchedElement1708 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchedElement1730 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMatchedElement1742 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchedElement1759 = new BitSet(new long[]{0x0000000018400002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_ruleMatchedElement1785 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleMatchedElement1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation1854 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleAnnotation1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation1944 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePotencyAnnotation1954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rulePotencyAnnotation1992 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_28_in_rulePotencyAnnotation2010 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePotencyAnnotation2028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleC2CModifier_in_entryRuleC2CModifier2069 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleC2CModifier2079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkedBy_in_ruleC2CModifier2125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkedBy_in_entryRuleLinkedBy2159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinkedBy2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleLinkedBy2206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_ruleLinkedBy2227 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLinkedBy2239 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedBy2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeMapping_in_entryRuleAttributeMapping2295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeMapping2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_ruleAttributeMapping2351 = new BitSet(new long[]{0x0000000040100000L});
        public static final BitSet FOLLOW_20_in_ruleAttributeMapping2364 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_ruleAttributeMapping2385 = new BitSet(new long[]{0x0000000040100000L});
        public static final BitSet FOLLOW_30_in_ruleAttributeMapping2399 = new BitSet(new long[]{0x0000001C00000070L});
        public static final BitSet FOLLOW_ruleAttributeRightPart_in_ruleAttributeMapping2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRightPart_in_entryRuleAttributeRightPart2456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeRightPart2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsString_in_ruleAttributeRightPart2513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsBoolean_in_ruleAttributeRightPart2540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsDouble_in_ruleAttributeRightPart2567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsInteger_in_ruleAttributeRightPart2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute2Attribute_in_ruleAttributeRightPart2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute2Attribute_in_entryRuleAttribute2Attribute2656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2Attribute2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_ruleAttribute2Attribute2712 = new BitSet(new long[]{0x0000000200100002L});
        public static final BitSet FOLLOW_20_in_ruleAttribute2Attribute2725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_ruleAttribute2Attribute2746 = new BitSet(new long[]{0x0000000200100002L});
        public static final BitSet FOLLOW_ruleConverter_in_ruleAttribute2Attribute2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsString_in_entryRuleAttributeIsString2806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeIsString2816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrictString_in_ruleAttributeIsString2861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsBoolean_in_entryRuleAttributeIsBoolean2896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeIsBoolean2906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleAttributeIsBoolean2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsDouble_in_entryRuleAttributeIsDouble2986 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeIsDouble2996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAttributeIsDouble3041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeIsInteger_in_entryRuleAttributeIsInteger3076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeIsInteger3086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAttributeIsInteger3131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeRef_in_entryRuleAttributeRef3166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeRef3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeRef3222 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAttributeRef3234 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttributeRef3257 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleAttributeRef3275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference2Reference_in_entryRuleReference2Reference3325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference2Reference3335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_ruleReference2Reference3381 = new BitSet(new long[]{0x0000000100100000L});
        public static final BitSet FOLLOW_20_in_ruleReference2Reference3394 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_ruleReference2Reference3415 = new BitSet(new long[]{0x0000000100100000L});
        public static final BitSet FOLLOW_32_in_ruleReference2Reference3429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_ruleReference2Reference3450 = new BitSet(new long[]{0x0000000200100002L});
        public static final BitSet FOLLOW_20_in_ruleReference2Reference3463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_ruleReference2Reference3484 = new BitSet(new long[]{0x0000000200100002L});
        public static final BitSet FOLLOW_ruleConverter_in_ruleReference2Reference3507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceRef_in_entryRuleReferenceRef3544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceRef3554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceRef3600 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleReferenceRef3612 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReferenceRef3635 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleReferenceRef3653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConverter_in_entryRuleConverter3703 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConverter3713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleConverter3750 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConverter3771 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleConverter3789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConverter3825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString3862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString3873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString3913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString3939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble3985 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble3996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble4036 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEDouble4054 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble4069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean4115 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean4126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEBoolean4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEBoolean4183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrictString_in_entryRuleStrictString4224 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrictString4235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStrictString4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4319 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEInt4369 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4386 = new BitSet(new long[]{0x0000000000000002L});
    }


}